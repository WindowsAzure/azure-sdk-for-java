// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.implementation;

import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.amqp.AmqpRetryPolicy;
import com.azure.core.amqp.AmqpSession;
import com.azure.core.amqp.implementation.AmqpReceiveLink;
import com.azure.core.amqp.implementation.AmqpSendLink;
import com.azure.core.amqp.implementation.ConnectionOptions;
import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.amqp.implementation.ReactorConnection;
import com.azure.core.amqp.implementation.ReactorHandlerProvider;
import com.azure.core.amqp.implementation.ReactorProvider;
import com.azure.core.amqp.implementation.RetryUtil;
import com.azure.core.amqp.implementation.TokenManagerProvider;
import com.azure.core.amqp.implementation.handler.SessionHandler;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.ReceiveMode;
import org.apache.qpid.proton.engine.BaseHandler;
import org.apache.qpid.proton.engine.Session;
import reactor.core.publisher.Mono;

import java.util.concurrent.ConcurrentHashMap;

/**
 * A proton-j AMQP connection to an Azure Service Bus instance. Adds additional support for management operations.
 */
public class ServiceBusReactorAmqpConnection extends ReactorConnection implements ServiceBusAmqpConnection {

    private final ClientLogger logger = new ClientLogger(ServiceBusReactorAmqpConnection.class);
    /**
     * Keeps track of the opened send links. Links are key'd by their entityPath. The send link for allowing the service
     * load balance messages is the eventHubName.
     */
    private final ConcurrentHashMap<String, AmqpSendLink> sendLinks = new ConcurrentHashMap<>();

    private final String connectionId;
    private final ReactorProvider reactorProvider;
    private final ReactorHandlerProvider handlerProvider;
    private final TokenManagerProvider tokenManagerProvider;
    private final AmqpRetryOptions retryOptions;
    private final MessageSerializer messageSerializer;

    /**
     * Creates a new AMQP connection that uses proton-j.
     *
     * @param connectionId Identifier for the connection.
     * @param connectionOptions A set of options used to create the AMQP connection.
     * @param reactorProvider Provides proton-j reactor instances.
     * @param handlerProvider Provides {@link BaseHandler} to listen to proton-j reactor events.
     * @param tokenManagerProvider Provides a token manager for authorizing with CBS node.
     * @param messageSerializer Serializes and deserializes proton-j messages.
     */
    public ServiceBusReactorAmqpConnection(String connectionId, ConnectionOptions connectionOptions,
                                           ReactorProvider reactorProvider, ReactorHandlerProvider handlerProvider,
                                           TokenManagerProvider tokenManagerProvider, MessageSerializer messageSerializer, String product,
                                           String clientVersion) {
        super(connectionId, connectionOptions, reactorProvider, handlerProvider, tokenManagerProvider,
            messageSerializer, product, clientVersion);
        this.connectionId = connectionId;
        this.reactorProvider = reactorProvider;
        this.handlerProvider = handlerProvider;
        this.tokenManagerProvider = tokenManagerProvider;
        this.retryOptions = connectionOptions.getRetry();
        this.messageSerializer = messageSerializer;

    }

    /**
     * Creates or gets a send link. The same link is returned if there is an existing send link with the same {@code
     * linkName}. Otherwise, a new link is created and returned.
     *
     * @param linkName The name of the link.
     * @param entityPath The remote address to connect to for the message broker.
     * @param retryOptions Options to use when creating the link.
     * @return A new or existing send link that is connected to the given {@code entityPath}.
     */
    @Override
    public Mono<AmqpSendLink> createSendLink(String linkName, String entityPath, AmqpRetryOptions retryOptions) {
        return createSession(entityPath).flatMap(session -> {
            logger.verbose("Get or create producer for path: '{}'", entityPath);
            final AmqpRetryPolicy retryPolicy = RetryUtil.getRetryPolicy(retryOptions);

            return session.createProducer(linkName, entityPath, retryOptions.getTryTimeout(), retryPolicy)
                .cast(AmqpSendLink.class);
        });
    }

    /**
     * Creates or gets an existing receive link. The same link is returned if there is an existing receive link with the
     * same {@code linkName}. Otherwise, a new link is created and returned.
     *
     * @param linkName The name of the link.
     * @param entityPath The remote address to connect to for the message broker.
     * @param receiveMode Consumer options to use when creating the link.
     * @return A new or existing receive link that is connected to the given {@code entityPath}.
     */
    @Override
    public Mono<AmqpReceiveLink> createReceiveLink(String linkName, String entityPath, ReceiveMode receiveMode) {
        return createSession(entityPath).cast(ServiceBusSession.class)
            .flatMap(session -> {
                logger.verbose("Get or create consumer for path: '{}'", entityPath);
                final AmqpRetryPolicy retryPolicy = RetryUtil.getRetryPolicy(retryOptions);

                return session.createConsumer(linkName, entityPath, retryOptions.getTryTimeout(), retryPolicy,
                    receiveMode);
            });
    }

    @Override
    public void dispose() {
        logger.info("Disposing of connection.");
        sendLinks.forEach((key, value) -> value.dispose());
        sendLinks.clear();

        super.dispose();
    }

    @Override
    protected AmqpSession createSession(String sessionName, Session session, SessionHandler handler) {
        return new ServiceBusReactorSession(session, handler, sessionName, reactorProvider, handlerProvider,
            getClaimsBasedSecurityNode(), tokenManagerProvider, retryOptions.getTryTimeout(), messageSerializer);
    }
}
