// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.eventhubs.implementation;

import com.azure.core.amqp.AmqpConnection;
import com.azure.core.implementation.logging.ServiceLogger;
import com.azure.eventhubs.EventHubProperties;
import com.azure.eventhubs.PartitionProperties;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.messaging.AmqpValue;
import org.apache.qpid.proton.amqp.messaging.ApplicationProperties;
import org.apache.qpid.proton.message.Message;
import reactor.core.publisher.Mono;

import java.io.UnsupportedEncodingException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

import static com.azure.eventhubs.implementation.ClientConstants.TOKEN_AUDIENCE_FORMAT;
import static com.azure.eventhubs.implementation.ClientConstants.TOKEN_REFRESH_INTERVAL;

/**
 * Channel responsible for Event Hubs related metadata and management plane operations. Management plane operations
 * include another partition, increasing quotas, etc.
 */
public class ManagementChannel extends EndpointStateNotifierBase implements EventHubManagementNode {
    // Well-known keys from the management service responses and requests.
    public static final String MANAGEMENT_ENTITY_NAME_KEY = "name";
    public static final String MANAGEMENT_PARTITION_NAME_KEY = "partition";
    public static final String MANAGEMENT_RESULT_PARTITION_IDS = "partition_ids";
    public static final String MANAGEMENT_RESULT_CREATED_AT = "created_at";
    public static final String MANAGEMENT_RESULT_BEGIN_SEQUENCE_NUMBER = "begin_sequence_number";
    public static final String MANAGEMENT_RESULT_LAST_ENQUEUED_SEQUENCE_NUMBER = "last_enqueued_sequence_number";
    public static final String MANAGEMENT_RESULT_LAST_ENQUEUED_OFFSET = "last_enqueued_offset";
    public static final String MANAGEMENT_RESULT_LAST_ENQUEUED_TIME_UTC = "last_enqueued_time_utc";
    public static final String MANAGEMENT_RESULT_PARTITION_IS_EMPTY = "is_partition_empty";

    private static final String SESSION_NAME = "mgmt-session";
    private static final String LINK_NAME = "mgmt";
    private static final String ADDRESS = "$management";

    // Well-known keys for management plane service requests.
    private static final String MANAGEMENT_ENTITY_TYPE_KEY = "type";
    private static final String MANAGEMENT_OPERATION_KEY = "operation";
    private static final String MANAGEMENT_SECURITY_TOKEN_KEY = "security_token";

    // Well-known values for the service request.
    private static final String READ_OPERATION_VALUE = "READ";
    private static final String MANAGEMENT_EVENTHUB_ENTITY_TYPE = AmqpConstants.VENDOR + ":eventhub";
    private static final String MANAGEMENT_PARTITION_ENTITY_TYPE = AmqpConstants.VENDOR + ":partition";

    private final AmqpConnection connection;
    private final TokenProvider tokenProvider;
    private final Mono<RequestResponseChannel> channelMono;
    private final ReactorProvider provider;
    private final String eventHubPath;
    private final AmqpResponseMapper mapper;

    /**
     * Creates an instance that is connected to the {@code eventHubPath}'s management node.
     *
     * @param eventHubPath The name of the Event Hub.
     * @param tokenProvider A provider that generates authorisation tokens.
     * @param provider The dispatcher to execute work on Reactor.
     */
    ManagementChannel(AmqpConnection connection, String eventHubPath, TokenProvider tokenProvider,
                      ReactorProvider provider, ReactorHandlerProvider handlerProvider, AmqpResponseMapper mapper) {
        super(new ServiceLogger(ManagementChannel.class));

        Objects.requireNonNull(connection);
        Objects.requireNonNull(tokenProvider);
        Objects.requireNonNull(provider);

        this.connection = connection;
        this.tokenProvider = tokenProvider;
        this.provider = provider;
        this.eventHubPath = eventHubPath;
        this.mapper = mapper;
        this.channelMono = connection.createSession(SESSION_NAME)
            .cast(ReactorSession.class)
            .map(session -> new RequestResponseChannel(connection.getIdentifier(), connection.getHost(), LINK_NAME,
                ADDRESS, session.session(), handlerProvider))
            .cache();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mono<EventHubProperties> getEventHubProperties() {
        final Map<String, Object> properties = new HashMap<>();
        properties.put(MANAGEMENT_ENTITY_TYPE_KEY, MANAGEMENT_EVENTHUB_ENTITY_TYPE);
        properties.put(MANAGEMENT_ENTITY_NAME_KEY, eventHubPath);
        properties.put(MANAGEMENT_OPERATION_KEY, READ_OPERATION_VALUE);

        return getProperties(properties, mapper::toEventHubProperties);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mono<PartitionProperties> getPartitionProperties(String partitionId) {
        final Map<String, Object> properties = new HashMap<>();
        properties.put(MANAGEMENT_ENTITY_TYPE_KEY, MANAGEMENT_PARTITION_ENTITY_TYPE);
        properties.put(MANAGEMENT_ENTITY_NAME_KEY, eventHubPath);
        properties.put(MANAGEMENT_PARTITION_NAME_KEY, partitionId);
        properties.put(MANAGEMENT_OPERATION_KEY, READ_OPERATION_VALUE);

        return getProperties(properties, mapper::toPartitionProperties);
    }

    private <T> Mono<T> getProperties(Map<String, Object> properties, Function<Map<?, ?>, T> mapper) {
        final String token;
        try {
            final String tokenAudience = String.format(Locale.US, TOKEN_AUDIENCE_FORMAT, connection.getHost(), eventHubPath);
            token = tokenProvider.getToken(tokenAudience, TOKEN_REFRESH_INTERVAL);
        } catch (UnsupportedEncodingException e) {
            return Mono.error(e);
        }

        properties.put(MANAGEMENT_SECURITY_TOKEN_KEY, token);

        final Message request = Proton.message();
        final ApplicationProperties applicationProperties = new ApplicationProperties(properties);
        request.setApplicationProperties(applicationProperties);

        return channelMono.flatMap(x -> x.sendWithAck(request, provider.getReactorDispatcher())).map(message -> {
            if (!(message.getBody() instanceof AmqpValue)) {
                throw new IllegalArgumentException("Expected message.getBody() to be AmqpValue, but is: " + message.getBody());
            }

            AmqpValue body = (AmqpValue) message.getBody();
            if (!(body.getValue() instanceof Map)) {
                throw new IllegalArgumentException("Expected message.getBody().getValue() to be of type Map");
            }

            Map<?, ?> map = (Map<?, ?>) body.getValue();

            return mapper.apply(map);
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() {
        final RequestResponseChannel channel = channelMono.block(Duration.ofSeconds(60));
        if (channel != null) {
            channel.close();
        }

        if (!connection.removeSession(SESSION_NAME)) {
            logger.asInfo().log("Unable to remove CBSChannel {} from connection", SESSION_NAME);
        }
    }
}
