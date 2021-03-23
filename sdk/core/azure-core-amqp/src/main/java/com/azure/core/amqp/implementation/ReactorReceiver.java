// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.implementation;

import com.azure.core.amqp.AmqpEndpointState;
import com.azure.core.amqp.implementation.handler.ReceiveLinkHandler;
import com.azure.core.util.logging.ClientLogger;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.transport.ErrorCondition;
import org.apache.qpid.proton.engine.Delivery;
import org.apache.qpid.proton.engine.EndpointState;
import org.apache.qpid.proton.engine.Receiver;
import org.apache.qpid.proton.message.Message;
import reactor.core.Disposable;
import reactor.core.Disposables;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

import static com.azure.core.util.FluxUtil.monoError;

/**
 * Handles receiving events from Event Hubs service and translating them to proton-j messages.
 */
public class ReactorReceiver implements AmqpReceiveLink {
    // Initial value is true because we could not have created this receiver without authorising against the CBS node
    // first.
    private final AtomicBoolean hasAuthorized = new AtomicBoolean(true);

    private final String entityPath;
    private final Receiver receiver;
    private final ReceiveLinkHandler handler;
    private final TokenManager tokenManager;
    private final ReactorDispatcher dispatcher;
    private final Disposable subscriptions;
    private final AtomicInteger currentCredits = new AtomicInteger();
    private final AtomicBoolean isDisposed = new AtomicBoolean();
    private final Flux<Message> messagesProcessor;
    private final ClientLogger logger = new ClientLogger(ReactorReceiver.class);
    private final Flux<AmqpEndpointState> endpointStates;

    private final AtomicReference<Supplier<Integer>> creditSupplier = new AtomicReference<>();

    protected ReactorReceiver(String entityPath, Receiver receiver, ReceiveLinkHandler handler,
        TokenManager tokenManager, ReactorDispatcher dispatcher) {
        this.entityPath = entityPath;
        this.receiver = receiver;
        this.handler = handler;
        this.tokenManager = tokenManager;
        this.dispatcher = dispatcher;
        this.messagesProcessor = this.handler.getDeliveredMessages()
            .map(this::decodeDelivery)
            .flatMap(delivery -> {
                final int credit = receiver.getCredit();
                return checkLinkCredits(credit).thenReturn(delivery);
            })
            .publish()
            .autoConnect();
        this.endpointStates = this.handler.getEndpointStates()
            .map(state -> {
                logger.verbose("connectionId[{}], path[{}], linkName[{}]: State {}", handler.getConnectionId(),
                    entityPath, getLinkName(), state);
                return AmqpEndpointStateUtil.getConnectionState(state);
            })
            .cache(1);

        final Disposable creditSubscription = this.handler.getLinkCredits()
            .flatMap(credits -> {
                this.currentCredits.set(credits);
                return checkLinkCredits(credits);
            })
            .subscribe();

        this.subscriptions = Disposables.composite(
            creditSubscription,
            tokenManager.getAuthorizationResults().subscribe(
                response -> {
                    logger.verbose("Token refreshed: {}", response);
                    hasAuthorized.set(true);
                }, error -> {
                    logger.warning("connectionId[{}] path[{}] linkName[{}] tokenRenewalFailure[{}]",
                        handler.getConnectionId(), this.entityPath, getLinkName(), error.getMessage());
                    hasAuthorized.set(false);
                }, () -> hasAuthorized.set(false)));
    }

    @Override
    public Flux<AmqpEndpointState> getEndpointStates() {
        return endpointStates;
    }

    @Override
    public Flux<Message> receive() {
        return messagesProcessor;
    }

    @Override
    public Mono<Void> addCredits(int credits) {
        if (isDisposed.get()) {
            return monoError(logger, new IllegalStateException("connectionId[{}] path[{}], linkName[{}] Is closed. Cannot add credits."));
        }

        return Mono.create(sink -> {
            try {
                dispatcher.invoke(() -> {
                    receiver.flow(credits);
                    sink.success();
                });
            } catch (IOException e) {
                logger.warning("Unable to schedule work to add more credits. Manually invoking.", e);
                receiver.flow(credits);
                sink.success();
            }
        });
    }

    @Override
    public int getCredits() {
        return currentCredits.get();
    }

    @Override
    public void setEmptyCreditListener(Supplier<Integer> creditSupplier) {
        Objects.requireNonNull(creditSupplier, "'creditSupplier' cannot be null.");
        this.creditSupplier.set(creditSupplier);
    }

    @Override
    public String getLinkName() {
        return receiver.getName();
    }

    @Override
    public String getEntityPath() {
        return entityPath;
    }

    @Override
    public String getHostname() {
        return handler.getHostname();
    }

    @Override
    public boolean isDisposed() {
        return isDisposed.get();
    }

    @Override
    public void dispose() {
        if (isDisposed.getAndSet(true)) {
            return;
        }

        subscriptions.dispose();
        tokenManager.close();
        receiver.close();

        try {
            dispatcher.invoke(() -> {
                receiver.free();
                handler.close();
            });
        } catch (IOException e) {
            logger.warning("Could not schedule disposing of receiver on ReactorDispatcher.", e);
            handler.close();
        }
    }

    /**
     * Disposes of the sender when an exception is encountered.
     *
     * @param condition Error condition associated with close operation.
     */
    void dispose(ErrorCondition condition) {
        if (isDisposed.getAndSet(true)) {
            return;
        }

        logger.verbose("connectionId[{}], path[{}], linkName[{}]: setting error condition {}",
            handler.getConnectionId(), entityPath, getLinkName(), condition);

        if (receiver.getLocalState() != EndpointState.CLOSED) {
            receiver.close();

            if (receiver.getCondition() == null) {
                receiver.setCondition(condition);
            }
        }

        try {
            dispatcher.invoke(() -> {
                receiver.free();
                handler.close();
            });
        } catch (IOException e) {
            logger.warning("Could not schedule disposing of receiver on ReactorDispatcher.", e);
            handler.close();
        }

        tokenManager.close();
    }

    protected Message decodeDelivery(Delivery delivery) {
        final int messageSize = delivery.pending();
        final byte[] buffer = new byte[messageSize];
        final int read = receiver.recv(buffer, 0, messageSize);
        receiver.advance();

        final Message message = Proton.message();
        message.decode(buffer, 0, read);

        delivery.settle();
        return message;
    }

    private Mono<Void> checkLinkCredits(int credits) {
        if (credits > 0) {
            return Mono.empty();
        } else if (credits < 0) {
            logger.info("connectionId[{}] path[{}] linkName[{}] credits[{}] Negative credits.",
                handler.getConnectionId(), this.entityPath, getLinkName(), credits);
        }

        final Supplier<Integer> supplier = creditSupplier.get();
        if (supplier == null) {
            logger.warning("connectionId[{}] path[{}] linkName[{}] credits[{}] There is no credit supplier.",
                handler.getConnectionId(), this.entityPath, getLinkName(), credits);
            return Mono.empty();
        }

        final Integer additionalCredits = supplier.get();
        if (additionalCredits != null && additionalCredits > 0) {
            logger.verbose("connectionId[{}] path[{}] linkName[{}] credits[{}] Adding {} credits.",
                handler.getConnectionId(), this.entityPath, getLinkName(), credits);

            return addCredits(additionalCredits);
        } else {
            logger.warning("connectionId[{}] path[{}] linkName[{}] credits[{}] There are no credits to add.",
                handler.getConnectionId(), this.entityPath, getLinkName(), credits);

            return Mono.empty();
        }
    }

    @Override
    public String toString() {
        return String.format("link name: [%s], entity path: [%s]", receiver.getName(), entityPath);
    }
}
