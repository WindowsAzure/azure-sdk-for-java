// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.exception.AmqpErrorCondition;
import com.azure.core.amqp.exception.AmqpErrorContext;
import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.credential.AccessToken;
import com.azure.core.util.AsyncCloseable;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.messaging.Source;
import org.apache.qpid.proton.amqp.messaging.Target;
import org.apache.qpid.proton.amqp.transport.ErrorCondition;
import org.apache.qpid.proton.amqp.transport.ReceiverSettleMode;
import org.apache.qpid.proton.amqp.transport.SenderSettleMode;
import org.apache.qpid.proton.engine.BaseHandler;
import org.apache.qpid.proton.engine.Connection;
import org.apache.qpid.proton.engine.EndpointState;
import org.apache.qpid.proton.engine.Event;
import org.apache.qpid.proton.engine.Link;
import org.apache.qpid.proton.engine.Receiver;
import org.apache.qpid.proton.engine.Sasl;
import org.apache.qpid.proton.engine.Session;
import org.apache.qpid.proton.engine.SslDomain;
import org.apache.qpid.proton.engine.SslPeerDetails;
import org.apache.qpid.proton.engine.Transport;
import org.apache.qpid.proton.reactor.Reactor;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;
import reactor.core.scheduler.Schedulers;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * This sample demonstrates how to convert an IoT Hub connection string to an Event Hubs connection string that points
 * to the built-in messaging endpoint. The Event Hubs connection string is then used with the EventHubConsumerClient to
 * receive events.
 * <p>
 * More information about the built-in messaging endpoint can be found at:
 * <a href="https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messages-read-builtin">Read device-to-cloud
 * messages from the built-in endpoint</a>
 *
 * @see <a href="https://docs.microsoft.com/azure/iot-hub/iot-hub-dev-guide-sas#security-tokens">Generating
 *     security tokens.</a>
 */
public final class IoTHubConnectionSample {

    /**
     * Main method for sample.
     *
     * @param args Unused arguments.
     *
     * @throws IOException IOException if we could not open the reactor IO pipe.
     */
    public static void main(String[] args) throws IOException {
        // The IoT Hub connection string from the portal. Will look like:
        final String iotHubConnectionString =
            "HostName=<your-iot-hub>.azure-devices.net;SharedAccessKeyName=<KeyName>;SharedAccessKey=<Key>";

        final IoTConnectionStringProperties properties = new IoTConnectionStringProperties(iotHubConnectionString);
        final String entityPath = "messages/events";
        final String resource = properties.getHostname() + "/" + entityPath;
        final String username = properties.getSharedAccessKeyName() + "@sas.root." + properties.getIoTHubName();

        final AccessToken accessToken = generateSharedAccessSignature(properties.getSharedAccessKeyName(),
            properties.getSharedAccessKey(), resource, Duration.ofMinutes(10));

        final ProtonJHandler handler = new ProtonJHandler("iot-connection-id", properties.getHostname(),
            username, accessToken);
        final Reactor reactor = Proton.reactor(handler);

        // reactor.run() is a blocking call, so we'll run it and then stop it when we are completed.
        Schedulers.boundedElastic().schedule(() -> reactor.run());

        // Cache the result of this connection string so we can use it again without doing all the work again.
        final Mono<String> eventHubsConnectionString =
            getConnectionString(handler, properties, entityPath + "/$management")
                .cache()
                .doFinally(signal -> {
                    // After we're done fetching a compatible Event Hubs connection string, stop the reactor.
                    handler.closeAsync().block(Duration.ofSeconds(10));
                    reactor.stop();
                });

        final Mono<EventHubProducerAsyncClient> producerClientMono = eventHubsConnectionString
            .map(connectionString -> {
                return new EventHubClientBuilder()
                    .connectionString(connectionString)
                    .buildAsyncProducerClient();
            });

        // Leverage Mono.usingWhen so the producer client is disposed of after we finish using it.
        // In production, users would probably cache the Mono's result, reusing the EventHubProducerAsyncClient and
        // finally closing it.
        final Mono<EventHubProperties> runOperation = Mono.usingWhen(producerClientMono,
            producer -> producer.getEventHubProperties(),
            producer -> Mono.fromRunnable(() -> producer.close()));

        final EventHubProperties eventHubProperties = runOperation.block();
        if (eventHubProperties == null) {
            System.err.println("No properties were retrieved.");
            return;
        }

        final String partitionIds = eventHubProperties.getPartitionIds()
            .stream()
            .collect(Collectors.joining(", "));

        System.out.printf("Event Hub Name: [%s]. Created At: %s. partitionIds: [%s]%n", eventHubProperties.getName(),
            eventHubProperties.getCreatedAt(), partitionIds);
    }

    /**
     * Mono that completes with the corresponding Event Hubs connection string.
     *
     * @param handler Proton-J handler.
     * @param properties Connection string properties.
     * @param entityPath Entity to connect to.
     *
     * @return A Mono that completes when the connection string is retrieved. Or errors if the transport, connection, or
     *     link could not be opened.
     */
    private static Mono<String> getConnectionString(ProtonJHandler handler, IoTConnectionStringProperties properties,
        String entityPath) {

        return handler.getReceiver(entityPath)
            .map(receiver -> {
                System.out.println("IoTHub string was compatible with Event Hubs. Did not redirect.");
                return properties.getRawConnectionString();
            })
            .onErrorResume(error -> {
                return error instanceof AmqpException
                    && ((AmqpException) error).getErrorCondition() == AmqpErrorCondition.LINK_REDIRECT;
            }, error -> {
                final AmqpException amqpException = (AmqpException) error;
                final Map<String, Object> errorInfo = amqpException.getContext().getErrorInfo();
                final String eventHubsHostname = (String) errorInfo.get("hostname");

                if (eventHubsHostname == null) {
                    return Mono.error(new UnsupportedOperationException(
                        "Could not get Event Hubs connection string from error info.", error));
                }

                final String eventHubsConnection = String.format(Locale.ROOT,
                    "Endpoint=sb://%s/;EntityPath=%s;SharedAccessKeyName=%s;SharedAccessKey=%s",
                    eventHubsHostname, properties.getIoTHubName(), properties.getSharedAccessKeyName(),
                    properties.getSharedAccessKey());

                return Mono.just(eventHubsConnection);
            });
    }

    private static class ProtonJHandler extends BaseHandler implements AsyncCloseable {
        private static final int PORT = 5671;

        private final String hostname;
        private final String username;
        private final AccessToken token;
        private final String connectionId;
        private final Sinks.One<Connection> connectionSink = Sinks.one();
        private final ConcurrentMap<String, Sinks.One<Receiver>> receiverSinks = new ConcurrentHashMap<>();

        ProtonJHandler(String connectionId, String hostname, String username, AccessToken token) {
            this.connectionId = connectionId;
            this.hostname = hostname;
            this.username = username;
            this.token = token;
        }

        /**
         * Gets an active connection. Completes with an error if the connection could not be opened.
         *
         * @return An active connection. Completes with an error if the connection could not be opened.
         */
        Mono<Connection> getConnection() {
            return connectionSink.asMono().cache();
        }

        Mono<Receiver> getReceiver(String entityPath) {
            System.out.println("Creating receiver: " + entityPath);
            return getConnection().flatMap(activeConnection -> {
                final Sinks.One<Receiver> receiverSink = receiverSinks.computeIfAbsent(entityPath, key -> {
                    final Session session = activeConnection.session();
                    final Receiver receiver = session.receiver("receiver " + entityPath);
                    final Source source = new Source();
                    source.setAddress(entityPath);
                    receiver.setSource(source);

                    receiver.setTarget(new Target());
                    receiver.setSenderSettleMode(SenderSettleMode.SETTLED);
                    receiver.setReceiverSettleMode(ReceiverSettleMode.SECOND);

                    session.open();
                    receiver.open();

                    return Sinks.one();
                });

                return receiverSink.asMono();
            });
        }

        @Override
        public void onLinkRemoteOpen(Event e) {
            final Receiver link = e.getReceiver();
            if (link == null) {
                System.out.printf("Was expecting a receiver. Did not get one. Type: %s. Name: %s%n", e.getLink(),
                    e.getLink().getName());
                return;
            }

            if (link.getCondition() != null) {
                System.out.println("There will be an error soon. Not completing receiver. Error: " + link.getCondition());
                return;
            } else if (link.getRemoteState() != EndpointState.ACTIVE) {
                System.out.println(link.getRemoteState() + ": Remote state is not open. " + link.getCondition());
                return;
            }

            final String entityPath = link.getSource().getAddress();
            final Sinks.One<Receiver> sink = receiverSinks.remove(entityPath);
            if (sink != null) {
                sink.emitValue(e.getReceiver(), Sinks.EmitFailureHandler.FAIL_FAST);
            } else {
                System.err.printf("There was no corresponding receiver '%s' sink. Closing link.%n", entityPath);
                link.close();
            }
        }

        @Override
        public void onLinkRemoteClose(Event e) {
            final Link link = e.getLink();
            final ErrorCondition remoteCondition = link.getRemoteCondition();
            final AmqpErrorCondition errorCondition = AmqpErrorCondition.fromString(
                remoteCondition.getCondition().toString());

            @SuppressWarnings("unchecked") final Map<Symbol, Object> errorInfo = remoteCondition.getInfo();
            final Map<String, Object> errorInfoMap = errorInfo != null
                ? errorInfo.entrySet().stream().collect(HashMap::new,
                (existing, entry) -> existing.put(entry.getKey().toString(), entry.getValue()), (HashMap::putAll))
                : Collections.emptyMap();

            final AmqpErrorContext context = new AmqpErrorContext(hostname, errorInfoMap);
            final AmqpException exception = new AmqpException(false, errorCondition, remoteCondition.getDescription(),
                context);

            final String entityPath = link.getSource().getAddress();
            final Sinks.One<Receiver> sink = receiverSinks.remove(entityPath);
            if (sink != null) {
                sink.emitError(exception, Sinks.EmitFailureHandler.FAIL_FAST);
            } else {
                System.err.printf("There was no corresponding receiver '%s' sink. Closing link.%n", entityPath);
                link.close();
            }
        }

        @Override
        public void onConnectionBound(Event e) {
            final Transport transport = e.getTransport();
            final Sasl sasl = transport.sasl();
            sasl.plain(username, token.getToken());

            final SslDomain sslDomain = Proton.sslDomain();
            sslDomain.init(SslDomain.Mode.CLIENT);

            try {
                sslDomain.setSslContext(SSLContext.getDefault());
            } catch (NoSuchAlgorithmException error) {
                connectionSink.emitError(new RuntimeException("Could not bind SslContext.", error),
                    Sinks.EmitFailureHandler.FAIL_FAST);
            }

            final SslPeerDetails peerDetails = Proton.sslPeerDetails(hostname, PORT);
            transport.ssl(sslDomain, peerDetails);
        }

        @Override
        public void onConnectionInit(Event e) {
            final Connection connection = e.getConnection();
            connection.setHostname(hostname);
            connection.setContainer(connectionId);

            final Map<Symbol, Object> properties = new HashMap<>();
            connection.setProperties(properties);
            connection.open();
        }

        @Override
        public void onConnectionRemoteOpen(Event e) {
            System.out.println("Connection state: " + e.getConnection().getRemoteState());
            final Connection connection = e.getConnection();
            connectionSink.emitValue(connection, Sinks.EmitFailureHandler.FAIL_FAST);
        }

        @Override
        public void onReactorInit(Event e) {
            e.getReactor().connectionToHost(hostname, PORT, this);
        }

        @Override
        public void onTransportError(Event event) {
            final AmqpErrorContext context = new AmqpErrorContext(hostname);
            ErrorCondition condition = event.getTransport().getCondition();
            if (condition != null) {
                final AmqpException exception = new AmqpException(false,
                    AmqpErrorCondition.fromString(condition.getCondition().toString()), condition.getDescription(),
                    context);

                connectionSink.emitError(exception, Sinks.EmitFailureHandler.FAIL_FAST);
            } else {
                connectionSink.emitError(new AmqpException(false, "Error (no description returned).", context),
                    Sinks.EmitFailureHandler.FAIL_FAST);
            }
        }

        @Override
        public Mono<Void> closeAsync() {
            return connectionSink
                .asMono()
                .flatMap(connection -> Mono.fromRunnable(() -> connection.close()));
        }
    }

    /**
     * Generates a shared access signature. Details for generating security tokens can be found at:
     * <a href="https://docs.microsoft.com/azure/iot-hub/iot-hub-dev-guide-sas#security-tokens">Security
     * tokens</a>
     *
     * @param policyName Name of the shared access key policy.
     * @param sharedAccessKey Value of the shared access key.
     * @param resourceUri URI of the resource to access. Does not have the scheme in it.
     * @param tokenDuration Duration of the token.
     *
     * @return An access token.
     */
    private static AccessToken generateSharedAccessSignature(String policyName, String sharedAccessKey,
        String resourceUri, Duration tokenDuration) {

        final OffsetDateTime expiresOn = OffsetDateTime.now(ZoneOffset.UTC).plus(tokenDuration);

        final String expiresOnEpochSeconds = Long.toString(expiresOn.toEpochSecond());
        final String stringToSign = URLEncoder.encode(resourceUri, UTF_8) + "\n" + expiresOnEpochSeconds;
        final byte[] decodedKey = Base64.getDecoder().decode(sharedAccessKey);

        final Mac sha256HMAC;
        final SecretKeySpec secretKey;
        final String hmacSHA256 = "HmacSHA256";
        try {
            sha256HMAC = Mac.getInstance(hmacSHA256);
            secretKey = new SecretKeySpec(decodedKey, hmacSHA256);
            sha256HMAC.init(secretKey);
        } catch (NoSuchAlgorithmException e) {
            throw new UnsupportedOperationException(
                String.format("Unable to create hashing algorithm '%s'", hmacSHA256), e);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException("'sharedAccessKey' is an invalid value for the hashing algorithm.", e);
        }

        final byte[] bytes = sha256HMAC.doFinal(stringToSign.getBytes(UTF_8));
        final String signature = new String(Base64.getEncoder().encode(bytes), UTF_8);
        final String token = String.format(Locale.ROOT, "SharedAccessSignature sr=%s&sig=%s&se=%s&skn=%s",
            URLEncoder.encode(resourceUri, UTF_8),
            URLEncoder.encode(signature, UTF_8),
            expiresOnEpochSeconds, policyName);

        return new AccessToken(token, expiresOn);
    }

    /**
     * Contains properties from parsing an IoT connection string.
     */
    private static class IoTConnectionStringProperties {
        private static final String TOKEN_VALUE_SEPARATOR = "=";
        private static final String TOKEN_VALUE_PAIR_DELIMITER = ";";
        private static final String HOST_NAME = "HostName";
        private static final String ENDPOINT = "Endpoint";
        private static final String SHARED_ACCESS_KEY_NAME = "SharedAccessKeyName";
        private static final String SHARED_ACCESS_KEY = "SharedAccessKey";
        private final String endpoint;
        private final String sharedAccessKeyName;
        private final String sharedAccessKey;
        private final String iotHubName;
        private final String connectionString;

        /**
         * Parses an IoT Hub connection string into its components. Expects the string to be in format: {@code
         * "HostName=<your-iot-hub>.azure-devices.net;SharedAccessKeyName=<KeyName>;SharedAccessKey=<Key>}
         *
         * @param connectionString Connection string to parse.
         *
         * @throws IllegalArgumentException if the IoT Hub connection string does not have a valid URI endpoint. If
         *     there was not a valid key value pair in the connection string. Or the parameter name is unknown.
         * @throws NullPointerException if there was no {@code endpoint}, {@code sharedAccessKey} or {@code
         *     sharedAccessKeyName} in the input string.
         */
        private IoTConnectionStringProperties(String connectionString) {
            this.connectionString = connectionString;
            URI endpointUri = null;
            String sharedAccessKeyName = null;
            String sharedAccessKeyValue = null;

            for (String tokenValuePair : connectionString.split(TOKEN_VALUE_PAIR_DELIMITER)) {
                final String[] pair = tokenValuePair.split(TOKEN_VALUE_SEPARATOR, 2);
                if (pair.length != 2) {
                    throw new IllegalArgumentException(String.format(Locale.US,
                        "Connection string has invalid key value pair: %s", tokenValuePair));
                }

                final String key = pair[0].trim();
                final String value = pair[1].trim();

                if (key.equalsIgnoreCase(HOST_NAME) || key.equalsIgnoreCase(ENDPOINT)) {
                    try {
                        endpointUri = new URI(value);
                    } catch (URISyntaxException e) {
                        throw new IllegalArgumentException(
                            String.format(Locale.US, "Invalid endpoint: %s", tokenValuePair), e);
                    }
                } else if (key.equalsIgnoreCase(SHARED_ACCESS_KEY_NAME)) {
                    sharedAccessKeyName = value;
                } else if (key.equalsIgnoreCase(SHARED_ACCESS_KEY)) {
                    sharedAccessKeyValue = value;
                } else {
                    throw new IllegalArgumentException(
                        String.format(Locale.US, "Illegal connection string parameter name: %s", key));
                }
            }

            Objects.requireNonNull(endpointUri, "'endpointUri' IoT Hub connection string requires an endpoint.");

            // If there is no scheme such as https:// or sb://, then the host will be null.
            this.endpoint = endpointUri.getHost() != null ? endpointUri.getHost() : endpointUri.getPath();
            this.sharedAccessKeyName = Objects.requireNonNull(sharedAccessKeyName, "'sharedAccessKeyName' IoTHub connection string requires a shared access key policy name.");
            this.sharedAccessKey = Objects.requireNonNull(sharedAccessKeyValue, "'sharedAccessKeyValue' IoTHub connection string requires a shared access key value.");

            final String[] split = this.endpoint.split("\\.");
            if (split[0] == null) {
                throw new IllegalArgumentException("Could not get the IoT hub name from: " + this.endpoint);
            }

            this.iotHubName = split[0];
        }

        private String getIoTHubName() {
            return iotHubName;
        }

        private String getHostname() {
            return endpoint;
        }

        private String getSharedAccessKeyName() {
            return sharedAccessKeyName;
        }

        private String getSharedAccessKey() {
            return sharedAccessKey;
        }

        private String getRawConnectionString() {
            return connectionString;
        }
    }
}
