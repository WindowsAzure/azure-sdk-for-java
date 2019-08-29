// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.RetryOptions;
import com.azure.core.amqp.TransportType;
import com.azure.core.credentials.TokenCredential;
import com.azure.core.exception.AzureException;
import com.azure.core.implementation.annotation.ServiceClientBuilder;
import com.azure.core.implementation.util.ImplUtils;
import com.azure.core.util.configuration.BaseConfigurations;
import com.azure.core.util.configuration.Configuration;
import com.azure.core.util.configuration.ConfigurationManager;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.eventhubs.implementation.CBSAuthorizationType;
import com.azure.messaging.eventhubs.implementation.ClientConstants;
import com.azure.messaging.eventhubs.implementation.ConnectionOptions;
import com.azure.messaging.eventhubs.implementation.ConnectionStringProperties;
import com.azure.messaging.eventhubs.implementation.ReactorHandlerProvider;
import com.azure.messaging.eventhubs.implementation.ReactorProvider;
import com.azure.messaging.eventhubs.models.EventPosition;
import com.azure.messaging.eventhubs.models.ProxyAuthenticationType;
import com.azure.messaging.eventhubs.models.ProxyConfiguration;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Objects;

/**
 * This class provides a fluent builder API to aid the instantiation of {@link EventHubAsyncClient} and
 * {@link EventHubClient}. Calling {@link #buildAsyncClient() buildAsyncClient()} or
 * {@link #buildClient() buildClient()} constructs an instance of the respective client.
 *
 * <p>
 * <strong>Credentials are required</strong> to perform operations against Azure Event Hubs. They can be set by using
 * one of the following methods:
 * <ul>
 *     <li>{@link #connectionString(String)} with a connection string to a specific Event Hub.</li>
 *     <li>{@link #connectionString(String, String)} with an Event Hub <i>namespace</i> connection string and the
 *     Event Hub name.</li>
 *     <li>{@link #credential(String, String, TokenCredential)} with the hostname, Event Hub name, and a set of
 *     credentials authorized to use the Event Hub.</li>
 * </ul>
 *
 * <p>
 * <strong>Creating an asynchronous {@link EventHubAsyncClient} using Event Hubs namespace connection string</strong>
 * </p>
 *
 * {@codesnippet com.azure.messaging.eventhubs.eventhubasyncclient.instantiation#string-string}
 *
 * <p>
 * <strong>Creating a synchronous {@link EventHubClient} using an Event Hub instance connection string</strong>
 * </p>
 *
 * {@codesnippet com.azure.messaging.eventhubs.eventhubclient.instantiation}
 *
 * <p>
 * <strong>Creating an {@link EventProcessor} using Event Hub instance connection string</strong>
 * </p>
 *
 * {@codesnippet com.azure.messaging.eventhubs.eventprocessor.instantiation}
 *
 * @see EventHubClient
 * @see EventHubAsyncClient
 * @see EventProcessor
 */
@ServiceClientBuilder(serviceClients = {EventHubAsyncClient.class, EventHubClient.class, EventProcessor.class})
public class EventHubClientBuilder {
    private final ClientLogger logger = new ClientLogger(EventHubClientBuilder.class);

    private static final String AZURE_EVENT_HUBS_CONNECTION_STRING = "AZURE_EVENT_HUBS_CONNECTION_STRING";
    private static final RetryOptions DEFAULT_RETRY = new RetryOptions()
        .tryTimeout(ClientConstants.OPERATION_TIMEOUT);

    private TokenCredential credentials;
    private Configuration configuration;
    private ProxyConfiguration proxyConfiguration;
    private RetryOptions retryOptions;
    private Scheduler scheduler;
    private TransportType transport;
    private String host;
    private String eventHubName;
    private EventPosition initialEventPosition;
    private PartitionProcessorFactory partitionProcessorFactory;
    private String consumerGroupName;
    private PartitionManager partitionManager;

    /**
     * Creates a new instance with the default transport {@link TransportType#AMQP}.
     */
    public EventHubClientBuilder() {
        transport = TransportType.AMQP;
    }

    /**
     * Sets the credential information given a connection string to the Event Hub instance.
     *
     * <p>
     * If the connection string is copied from the Event Hubs namespace, it will likely not contain the name to the
     * desired Event Hub, which is needed. In this case, the name can be added manually by adding {@literal
     * "EntityPath=EVENT_HUB_NAME"} to the end of the connection string. For example, "EntityPath=telemetry-hub".
     * </p>
     *
     * <p>
     * If you have defined a shared access policy directly on the Event Hub itself, then copying the connection string
     * from that Event Hub will result in a connection string that contains the name.
     * </p>
     *
     * @param connectionString The connection string to use for connecting to the Event Hub instance. It is
     *         expected that the Event Hub name and the shared access key properties are contained in this connection
     *         string.
     * @return The updated {@link EventHubClientBuilder} object.
     * @throws IllegalArgumentException if {@code connectionString} is null or empty. Or, the {@code connectionString}
     *         does not contain the "EntityPath" key, which is the name of the Event Hub instance.
     * @throws AzureException If the shared access signature token credential could not be created using the
     *         connection string.
     */
    public EventHubClientBuilder connectionString(String connectionString) {
        final ConnectionStringProperties properties = new ConnectionStringProperties(connectionString);
        final TokenCredential tokenCredential;
        try {
            tokenCredential = new EventHubSharedAccessKeyCredential(properties.sharedAccessKeyName(),
                properties.sharedAccessKey(), ClientConstants.TOKEN_VALIDITY);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw logger.logExceptionAsError(
                new AzureException(EventHubsConstants.CANNOT_CREATE_EVENTHUB_SAS_KEY_CREDENTIAL, e));
        }

        return credential(properties.endpoint().getHost(), properties.eventHubName(), tokenCredential);
    }

    /**
     * Sets the credential information given a connection string to the Event Hubs namespace and name to a specific
     * Event Hub instance.
     *
     * @param connectionString The connection string to use for connecting to the Event Hubs namespace; it is
     *         expected that the shared access key properties are contained in this connection string, but not the Event
     *         Hub name.
     * @param eventHubName The name of the Event Hub to connect the client to.
     * @return The updated {@link EventHubClientBuilder} object.
     * @throws NullPointerException if {@code connectionString} or {@code eventHubName} is null.
     * @throws IllegalArgumentException if {@code connectionString} or {@code eventHubName} is an empty string.
     *         Or, if the {@code connectionString} contains the Event Hub name.
     * @throws AzureException If the shared access signature token credential could not be created using the
     *         connection string.
     */
    public EventHubClientBuilder connectionString(String connectionString, String eventHubName) {
        Objects.requireNonNull(connectionString, EventHubsConstants.CONNECTION_STRING_CANNOT_NULL);
        Objects.requireNonNull(eventHubName, EventHubsConstants.EVENTHUB_NAME_CANNOT_NULL);

        if (connectionString.isEmpty()) {
            throw logger.logExceptionAsError(new IllegalArgumentException(EventHubsConstants.CONNECTION_STRING_CANNOT_EMPTY));
        } else if (eventHubName.isEmpty()) {
            throw logger.logExceptionAsError(new IllegalArgumentException(EventHubsConstants.EVENTHUB_NAME_CANNOT_EMPTY));
        }

        final ConnectionStringProperties properties = new ConnectionStringProperties(connectionString);
        final TokenCredential tokenCredential;
        try {
            tokenCredential = new EventHubSharedAccessKeyCredential(properties.sharedAccessKeyName(),
                properties.sharedAccessKey(), ClientConstants.TOKEN_VALIDITY);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw logger.logExceptionAsError(new AzureException(EventHubsConstants.CANNOT_CREATE_EVENTHUB_SAS_KEY_CREDENTIAL, e));
        }

        if (!ImplUtils.isNullOrEmpty(properties.eventHubName()) && !eventHubName.equals(properties.eventHubName())) {
            throw logger.logExceptionAsError(new IllegalArgumentException(String.format(Locale.US,
                "'connectionString' contains an Event Hub name [%s] and it does not match the given "
                    + "'eventHubName' parameter [%s]. Please use the credentials(String connectionString) overload. "
                    + "Or supply a 'connectionString' without 'EntityPath' in it.",
                properties.eventHubName(), eventHubName)));
        }

        return credential(properties.endpoint().getHost(), eventHubName, tokenCredential);
    }

    /**
     * Sets the configuration store that is used during construction of the service client.
     *
     * If not specified, the default configuration store is used to configure the {@link EventHubAsyncClient}. Use
     * {@link Configuration#NONE} to bypass using configuration settings during construction.
     *
     * @param configuration The configuration store used to configure the {@link EventHubAsyncClient}.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventHubClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Sets the credential information for which Event Hub instance to connect to, and how to authorize against it.
     *
     * @param host The fully qualified host name for the Event Hubs namespace. This is likely to be similar to
     *         <strong>{@literal "{your-namespace}.servicebus.windows.net}"</strong>.
     * @param eventHubName The name of the Event Hub to connect the client to.
     * @param credential The token credential to use for authorization. Access controls may be specified by the
     *         Event Hubs namespace or the requested Event Hub, depending on Azure configuration.
     * @return The updated {@link EventHubClientBuilder} object.
     * @throws IllegalArgumentException if {@code host} or {@code eventHubName} is an empty string.
     * @throws NullPointerException if {@code host}, {@code eventHubName}, {@code credentials} is null.
     */
    public EventHubClientBuilder credential(String host, String eventHubName, TokenCredential credential) {
        this.host = Objects.requireNonNull(host, EventHubsConstants.HOST_CANNOT_NULL);
        this.credentials = Objects.requireNonNull(credential, EventHubsConstants.CREDENTIAL_CANNOT_NULL);
        this.eventHubName = Objects.requireNonNull(eventHubName, EventHubsConstants.EVENTHUB_NAME_CANNOT_NULL);

        if (ImplUtils.isNullOrEmpty(host)) {
            throw logger.logExceptionAsError(new IllegalArgumentException(EventHubsConstants.HOST_CANNOT_EMPTY));
        } else if (ImplUtils.isNullOrEmpty(eventHubName)) {
            throw logger.logExceptionAsError(new IllegalArgumentException(EventHubsConstants.EVENTHUB_NAME_CANNOT_EMPTY));
        }

        return this;
    }

    /**
     * Sets the proxy configuration to use for {@link EventHubAsyncClient}. When a proxy is configured, {@link
     * TransportType#AMQP_WEB_SOCKETS} must be used for the transport type.
     *
     * @param proxyConfiguration The proxy configuration to use.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventHubClientBuilder proxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
        return this;
    }

    /**
     * Sets the scheduler for operations such as connecting to and receiving or sending data to Event Hubs. If none is
     * specified, an elastic pool is used.
     *
     * @param scheduler The scheduler for operations such as connecting to and receiving or sending data to
     *         Event Hubs.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventHubClientBuilder scheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    /**
     * Sets the transport type by which all the communication with Azure Event Hubs occurs. Default value is {@link
     * TransportType#AMQP}.
     *
     * @param transport The transport type to use.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventHubClientBuilder transportType(TransportType transport) {
        this.transport = transport;
        return this;
    }

    /**
     * Sets the retry policy for {@link EventHubAsyncClient}. If not specified, the default retry options are used.
     *
     * @param retryOptions The retry policy to use.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventHubClientBuilder retry(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * Creates a new {@link EventHubAsyncClient} based on options set on this builder. Every time
     * {@code buildAsyncClient()} is invoked, a new instance of {@link EventHubAsyncClient} is created.
     *
     * <p>
     * The following options are used if ones are not specified in the builder:
     *
     * <ul>
     * <li>If no configuration is specified, the {@link ConfigurationManager#getConfiguration() global configuration}
     * is used to provide any shared configuration values. The configuration values read are the {@link
     * BaseConfigurations#HTTP_PROXY}, {@link ProxyConfiguration#PROXY_USERNAME}, and {@link
     * ProxyConfiguration#PROXY_PASSWORD}.</li>
     * <li>If no retry is specified, the default retry options are used.</li>
     * <li>If no proxy is specified, the builder checks the {@link ConfigurationManager#getConfiguration() global
     * configuration} for a configured proxy, then it checks to see if a system proxy is configured.</li>
     * <li>If no timeout is specified, a {@link ClientConstants#OPERATION_TIMEOUT timeout of one minute} is used.</li>
     * <li>If no scheduler is specified, an {@link Schedulers#elastic() elastic scheduler} is used.</li>
     * </ul>
     *
     * @return A new {@link EventHubAsyncClient} instance with all the configured options.
     * @throws IllegalArgumentException if the credentials have not been set using either {@link
     *         #connectionString(String)} or {@link #credential(String, String, TokenCredential)}. Or, if a proxy is
     *         specified but the transport type is not {@link TransportType#AMQP_WEB_SOCKETS web sockets}.
     */
    public EventHubAsyncClient buildAsyncClient() {
        final ConnectionOptions connectionOptions = getConnectionOptions();
        final ReactorProvider provider = new ReactorProvider();
        final ReactorHandlerProvider handlerProvider = new ReactorHandlerProvider(provider);

        return new EventHubAsyncClient(connectionOptions, provider, handlerProvider);
    }

    /**
     * Creates a new {@link EventHubClient} based on options set on this builder. Every time {@code buildClient()}
     * is invoked, a new instance of {@link EventHubClient} is created.
     *
     * <p>
     * The following options are used if ones are not specified in the builder:
     *
     * <ul>
     * <li>If no configuration is specified, the {@link ConfigurationManager#getConfiguration() global configuration}
     * is used to provide any shared configuration values. The configuration values read are the {@link
     * BaseConfigurations#HTTP_PROXY}, {@link ProxyConfiguration#PROXY_USERNAME}, and {@link
     * ProxyConfiguration#PROXY_PASSWORD}.</li>
     * <li>If no retry is specified, the default retry options are used.</li>
     * <li>If no proxy is specified, the builder checks the {@link ConfigurationManager#getConfiguration() global
     * configuration} for a configured proxy, then it checks to see if a system proxy is configured.</li>
     * <li>If no timeout is specified, a {@link ClientConstants#OPERATION_TIMEOUT timeout of one minute} is used.</li>
     * <li>If no scheduler is specified, an {@link Schedulers#elastic() elastic scheduler} is used.</li>
     * </ul>
     *
     * @return A new {@link EventHubClient} instance with all the configured options.
     * @throws IllegalArgumentException if the credentials have not been set using either {@link
     *         #connectionString(String)} or {@link #credential(String, String, TokenCredential)}. Or, if a proxy is
     *         specified but the transport type is not {@link TransportType#AMQP_WEB_SOCKETS web sockets}.
     */
    public EventHubClient buildClient() {
        final ConnectionOptions connectionOptions = getConnectionOptions();
        final ReactorProvider provider = new ReactorProvider();
        final ReactorHandlerProvider handlerProvider = new ReactorHandlerProvider(provider);
        final EventHubAsyncClient client = new EventHubAsyncClient(connectionOptions, provider, handlerProvider);

        return new EventHubClient(client, connectionOptions);
    }

    /**
     * This property must be set for building an {@link EventProcessor}.
     *
     * Sets the consumer group name from which the {@link EventProcessor} should consume events from.
     *
     * @param consumerGroupName The consumer group name this {@link EventProcessor} should consume events
     *         from.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventHubClientBuilder consumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }

    /**
     * This property can be optionally set when building an {@link EventProcessor}.
     *
     * Sets the initial event position. If this property is not set and if checkpoint for a partition doesn't exist,
     * {@link EventPosition#earliest()} will be used as the initial event position to start consuming events.
     *
     * @param initialEventPosition The initial event position.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventHubClientBuilder initialEventPosition(EventPosition initialEventPosition) {
        this.initialEventPosition = initialEventPosition;
        return this;
    }

    /**
     * This property must be set when building an {@link EventProcessor}.
     *
     * Sets the {@link PartitionManager} the {@link EventProcessor} will use for storing partition
     * ownership and checkpoint information.
     *
     * @param partitionManager Implementation of {@link PartitionManager}.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventHubClientBuilder partitionManager(PartitionManager partitionManager) {
        // If this is not set, look for classes implementing PartitionManager interface
        // in the classpath and use it automatically. (To be implemented)
        this.partitionManager = partitionManager;
        return this;
    }

    /**
     * This property must be set when building an {@link EventProcessor}.
     *
     * Sets the partition processor factory for creating new instance(s) of {@link PartitionProcessor}.
     *
     * @param partitionProcessorFactory The factory that creates new processor for each partition.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventHubClientBuilder partitionProcessorFactory(PartitionProcessorFactory partitionProcessorFactory) {
        this.partitionProcessorFactory = partitionProcessorFactory;
        return this;
    }

    /**
     * This will create a new {@link EventProcessor} configured with the options set in this builder. Each call
     * to this method will return a new instance of {@link EventProcessor}.
     *
     * <p>
     * A new instance of {@link EventHubAsyncClient} will be created with configured options by calling the {@link
     * #buildAsyncClient()} that will be used by the {@link EventProcessor}.
     * </p>
     *
     * <p>
     * If the {@link #initialEventPosition(EventPosition) initial event position} is not set, all partitions processed by
     * this {@link EventProcessor} will start processing from {@link EventPosition#earliest() earliest}
     * available event in the respective partitions.
     * </p>
     *
     * @return A new instance of {@link EventProcessor}.
     */
    public EventProcessor buildEventProcessor() {
        EventPosition initialEventPosition =
            this.initialEventPosition == null ? EventPosition.earliest()
                : this.initialEventPosition;

        return new EventProcessor(buildAsyncClient(), this.consumerGroupName,
            this.partitionProcessorFactory, initialEventPosition, partitionManager, eventHubName);
    }

    private ConnectionOptions getConnectionOptions() {
        configuration = configuration == null ? ConfigurationManager.getConfiguration().clone() : configuration;

        if (credentials == null) {
            final String connectionString = configuration.get(AZURE_EVENT_HUBS_CONNECTION_STRING);

            if (ImplUtils.isNullOrEmpty(connectionString)) {
                throw logger.logExceptionAsError(new IllegalArgumentException("Credentials have not been set. "
                    + "They can be set using: connectionString(String), connectionString(String, String), "
                    + "credentials(String, String, TokenCredential), or setting the environment variable '"
                    + AZURE_EVENT_HUBS_CONNECTION_STRING + "' with a connection string"));
            }

            connectionString(connectionString);
        }

        if (retryOptions == null) {
            retryOptions = DEFAULT_RETRY;
        }

        // If the proxy has been configured by the user but they have overridden the TransportType with something that
        // is not AMQP_WEB_SOCKETS.
        if (proxyConfiguration != null && proxyConfiguration.isProxyAddressConfigured()
            && transport != TransportType.AMQP_WEB_SOCKETS) {
            throw logger.logExceptionAsError(new IllegalArgumentException(EventHubsConstants.CANNOT_USE_PROXY_FOR_AMQP_TRANSPORT_TYPE));
        }

        if (proxyConfiguration == null) {
            proxyConfiguration = getDefaultProxyConfiguration(configuration);
        }

        if (scheduler == null) {
            scheduler = Schedulers.elastic();
        }

        final CBSAuthorizationType authorizationType = credentials instanceof EventHubSharedAccessKeyCredential
            ? CBSAuthorizationType.SHARED_ACCESS_SIGNATURE
            : CBSAuthorizationType.JSON_WEB_TOKEN;

        return new ConnectionOptions(host, eventHubName, credentials, authorizationType,
            transport, retryOptions, proxyConfiguration, scheduler);
    }

    private ProxyConfiguration getDefaultProxyConfiguration(Configuration configuration) {
        ProxyAuthenticationType authentication = ProxyAuthenticationType.NONE;
        if (proxyConfiguration != null) {
            authentication = proxyConfiguration.authentication();
        }

        String proxyAddress = configuration.get(BaseConfigurations.HTTP_PROXY);

        if (ImplUtils.isNullOrEmpty(proxyAddress)) {
            return ProxyConfiguration.SYSTEM_DEFAULTS;
        }

        final String[] hostPort = proxyAddress.split(":");
        if (hostPort.length < 2) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException(EventHubsConstants.HTTP_PROXY_CANNOT_PARSED_TO_PROXY));
        }

        final String host = hostPort[0];
        final int port = Integer.parseInt(hostPort[1]);
        final Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
        final String username = configuration.get(ProxyConfiguration.PROXY_USERNAME);
        final String password = configuration.get(ProxyConfiguration.PROXY_PASSWORD);

        return new ProxyConfiguration(authentication, proxy, username, password);
    }
}
