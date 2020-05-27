// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.implementation;

import com.azure.core.amqp.AmqpEndpointState;
import com.azure.core.amqp.AmqpLink;
import com.azure.core.amqp.AmqpRetryPolicy;
import com.azure.core.amqp.AmqpTransaction;
import com.azure.core.amqp.exception.AmqpErrorCondition;
import com.azure.core.amqp.exception.AmqpErrorContext;
import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.amqp.exception.OperationCancelledException;
import com.azure.core.amqp.implementation.handler.SendLinkHandler;
import com.azure.core.util.logging.ClientLogger;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.messaging.Accepted;
import org.apache.qpid.proton.amqp.messaging.AmqpValue;
import org.apache.qpid.proton.amqp.messaging.Rejected;
import org.apache.qpid.proton.amqp.messaging.Released;
import org.apache.qpid.proton.amqp.transaction.Declare;
import org.apache.qpid.proton.amqp.transaction.Declared;
import org.apache.qpid.proton.amqp.transaction.Discharge;
import org.apache.qpid.proton.amqp.transport.DeliveryState;
import org.apache.qpid.proton.engine.Delivery;
import org.apache.qpid.proton.engine.EndpointState;
import org.apache.qpid.proton.engine.Sender;
import org.apache.qpid.proton.engine.impl.DeliveryImpl;
import org.apache.qpid.proton.message.Message;
import reactor.core.Disposable;
import reactor.core.Disposables;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.core.publisher.MonoSink;
import reactor.core.publisher.ReplayProcessor;

import java.io.IOException;
import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static com.azure.core.amqp.implementation.ClientConstants.MAX_AMQP_HEADER_SIZE_BYTES;
import static com.azure.core.amqp.implementation.ClientConstants.SERVER_BUSY_BASE_SLEEP_TIME_IN_SECS;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Handles messages via coordinator sender link with Serviceus.
 */
class ReactorCoordinator implements AmqpLink {

   // private final String entityPath;
    private final Sender sender;
    private final SendLinkHandler handler;
    private final ReactorProvider reactorProvider;
    private final Disposable.Composite subscriptions;
    private final ClientLogger logger = new ClientLogger(ReactorCoordinator.class);
    private final AtomicBoolean hasConnected = new AtomicBoolean();
    private final AtomicBoolean isDisposed = new AtomicBoolean();
    private final AtomicInteger retryAttempts = new AtomicInteger();
    private final Object pendingSendLock = new Object();
    private final ConcurrentHashMap<String, WorkItem> pendingSendsMap = new ConcurrentHashMap<>();
    private final PriorityQueue<ReactorCoordinator.WeightedDeliveryTag> pendingSendsQueue =
        new PriorityQueue<>(1000, new ReactorCoordinator.DeliveryTagComparator());

    private final ReplayProcessor<AmqpEndpointState> endpointStates =
        ReplayProcessor.cacheLastOrDefault(AmqpEndpointState.UNINITIALIZED);
    private FluxSink<AmqpEndpointState> endpointStateSink = endpointStates.sink(FluxSink.OverflowStrategy.BUFFER);

    private final MessageSerializer messageSerializer;
    private final AmqpRetryPolicy retry;
    private final Duration timeout;
    private final Timer sendTimeoutTimer = new Timer("SendTimeout-timer");

    private final Object errorConditionLock = new Object();

    private volatile Exception lastKnownLinkError;
    private volatile Instant lastKnownErrorReportedAt;

    ReactorCoordinator(Sender sender, SendLinkHandler handler, ReactorProvider reactorProvider,
        MessageSerializer messageSerializer, Duration timeout, AmqpRetryPolicy retry) {

        this.sender = sender;
        this.handler = handler;
        this.reactorProvider = reactorProvider;

        this.messageSerializer = messageSerializer;
        this.retry = retry;
        this.timeout = timeout;
        this.subscriptions = Disposables.composite(
            this.handler.getDeliveredMessages().subscribe(this::processDeliveredMessage),

            this.handler.getLinkCredits().subscribe(credit -> {
                logger.verbose("Credits on link: {}", credit);
                this.scheduleWorkOnDispatcher();
            }),

            this.handler.getEndpointStates().subscribe(
                state -> {
                    logger.verbose("[{}] Connection state: {}", sender.getName(), state);
                    this.hasConnected.set(state == EndpointState.ACTIVE);
                    endpointStateSink.next(AmqpEndpointStateUtil.getConnectionState(state));
                }, error -> {
                    logger.error("[{}] Error occurred in coordinator endpoint handler.", sender.getName(), error);
                    endpointStateSink.error(error);
                }, () -> {
                    endpointStateSink.next(AmqpEndpointState.CLOSED);
                    endpointStateSink.complete();
                    hasConnected.set(false);
                }),

            this.handler.getErrors().subscribe(error -> {
                logger.error("[{}] Error occurred in coordinator error handler.", getLinkName(), error);
                endpointStateSink.error(error);
            }),
            () -> { }
        );
    }


    /**
     * Create AMQP {@link Message} for completing the transaction.
     *
     * @param transaction to be used for completing the transaction.
     * @param isCommit for commiting or rollback
     * @return created AMQP {@link Message}.
     */
    private Message getCompleteTransactionMessage(AmqpTransaction transaction, boolean isCommit) {
        Message message = Proton.message();
        Discharge discharge = new Discharge();
        discharge.setFail(!isCommit);
        discharge.setTxnId(new Binary(transaction.getTransactionId().array()));
        message.setBody(new AmqpValue(discharge));
        return message;
    }

    /**
     * Create AMQP {@link Message} for creating the transaction.
     *
     * @return created AMQP {@link Message}.
     */
    private Message getCreateTransactionMessage() {
        Message message = Proton.message();
        Declare declare = new Declare();
        message.setBody(new AmqpValue(declare));
        return message;
    }

    //@Override
    public Mono<DeliveryState> completeTransaction(AmqpTransaction transaction, boolean isCommit) {
        if (hasConnected.get()) {
            return Mono.create(sink -> send(getCompleteTransactionMessage(transaction,
                isCommit), sink));
        } else {
            return RetryUtil.withRetry(
                handler.getEndpointStates().takeUntil(state -> state == EndpointState.ACTIVE), timeout, retry)
                .then(Mono.create(sink -> send(getCompleteTransactionMessage(transaction,
                    isCommit), sink)));
        }
    }

    //@Override
    public Mono<DeliveryState> createTransaction() {
        if (hasConnected.get()) {
            return Mono.create(sink -> send(getCreateTransactionMessage(), sink));
        } else {
            return RetryUtil.withRetry(
                handler.getEndpointStates().takeUntil(state -> state == EndpointState.ACTIVE), timeout, retry)
                .then(Mono.create(sink -> send(getCreateTransactionMessage(), sink)));
        }
    }

    /**
     * Send the AMQP {@link Message}.
     *
     * @param message AMQP {@link Message}
     * @param sink to send back {@link DeliveryState}.
     */
    private void send(Message message, MonoSink<DeliveryState> sink) {

        final int payloadSize = messageSerializer.getSize(message);
        final int allocationSize = payloadSize + MAX_AMQP_HEADER_SIZE_BYTES;

        final byte[] bytes = new byte[allocationSize];

        int encodedSize = message.encode(bytes, 0, allocationSize);
        send(new RetriableResponseWorkItem(bytes, encodedSize, DeliveryImpl.DEFAULT_MESSAGE_FORMAT,
            sink, timeout));
    }

    /**
     * Add the work item in pending send to be processed on {@link ReactorDispatcher} thread.
     *
     * @param workItem to be processed.
     */
    private void send(WorkItem workItem) {
        final String deliveryTag = UUID.randomUUID().toString().replace("-", "");

        synchronized (pendingSendLock) {
            this.pendingSendsMap.put(deliveryTag, workItem);
            this.pendingSendsQueue.offer(new ReactorCoordinator.WeightedDeliveryTag(deliveryTag,
                workItem.hasBeenRetried() ? 1 : 0));
        }

        this.scheduleWorkOnDispatcher();
    }

    /**
     * Invokes work on the Reactor. Should only be called from ReactorDispatcher.invoke()
     */
    private void processSendWork() {
        if (!hasConnected.get()) {
            logger.warning("Not connected. Not processing send work.");
            return;
        }
        while (hasConnected.get() && sender.getCredit() > 0) {
            final ReactorCoordinator.WeightedDeliveryTag weightedDelivery;
            final WorkItem workItem;
            final String deliveryTag;
            synchronized (pendingSendLock) {
                weightedDelivery = this.pendingSendsQueue.poll();
                if (weightedDelivery != null) {
                    deliveryTag = weightedDelivery.getDeliveryTag();
                    workItem = this.pendingSendsMap.get(deliveryTag);
                } else {
                    workItem = null;
                    deliveryTag = null;
                }
            }
            if (workItem == null) {
                if (deliveryTag != null) {
                    logger.verbose(
                        "clientId[{}]. linkName[{}], deliveryTag[{}]: sendData not found for this delivery.",
                        handler.getConnectionId(), getLinkName(), deliveryTag);
                }

                break;
            }

            Delivery delivery = null;
            boolean linkAdvance = false;
            int sentMsgSize = 0;
            Exception sendException = null;

            try {
                delivery = sender.delivery(deliveryTag.getBytes(UTF_8));
                delivery.setMessageFormat(workItem.getMessageFormat());

                sentMsgSize = sender.send(workItem.getMessage(), 0, workItem.getEncodedMessageSize());
                assert sentMsgSize == workItem.getEncodedMessageSize()
                    : "Contract of the ProtonJ library for Sender. Send API changed";

                linkAdvance = sender.advance();
            } catch (Exception exception) {
                sendException = exception;
            }

            if (linkAdvance) {
                logger.verbose("linkName[{}], deliveryTag[{}]: Sent message", getLinkName(),
                    deliveryTag);

                workItem.setWaitingForAck();
                sendTimeoutTimer.schedule(new ReactorCoordinator.SendTimeout(deliveryTag), timeout.toMillis());
            } else {
                logger.verbose(
                    "clientId[{}]. linkName[{}], deliveryTag[{}], sentMessageSize[{}], "
                        + "payloadActualSize[{}]: sendlink advance failed",
                    handler.getConnectionId(), getLinkName(), deliveryTag, sentMsgSize,
                    workItem.getEncodedMessageSize());

                if (delivery != null) {
                    delivery.free();
                }

                final AmqpErrorContext context = handler.getErrorContext(sender);
                final Throwable exception = sendException != null
                    ? new OperationCancelledException(String.format(Locale.US,
                    "Link(%s): operation failed. Please see cause for more details", getLinkName()),
                    sendException, context)
                    : new OperationCancelledException(String.format(Locale.US,
                    "Link(%s): coordinator operation failed while advancing delivery(tag: %s).",
                    getLinkName(), deliveryTag), context);

                workItem.error(exception);
            }
        }
    }

    private void processDeliveredMessage(Delivery delivery) {
        final DeliveryState outcome = delivery.getRemoteState();
        final String deliveryTag = new String(delivery.getTag(), UTF_8);

        logger.verbose("linkName[{}], deliveryTag[{}]: process delivered message",
            getLinkName(), deliveryTag);

        final WorkItem workItem = pendingSendsMap.remove(deliveryTag);

        if (workItem == null) {
            logger.verbose("clientId[{}]. linkName[{}], delivery[{}] - mismatch (or send timed out)",
                handler.getConnectionId(), getLinkName(), deliveryTag);
            return;
        }

        if (outcome instanceof Accepted) {
            synchronized (errorConditionLock) {
                lastKnownLinkError = null;
                lastKnownErrorReportedAt = null;
                retryAttempts.set(0);
            }

            workItem.success(outcome);

        } else if (outcome instanceof Rejected) {
            final Rejected rejected = (Rejected) outcome;
            final org.apache.qpid.proton.amqp.transport.ErrorCondition error = rejected.getError();
            final Exception exception = ExceptionUtil.toException(error.getCondition().toString(),
                error.getDescription(), handler.getErrorContext(sender));

            logger.warning("linkName[{}], deliveryTag[{}]: Delivery rejected. [{}]",
                getLinkName(), deliveryTag, rejected);

            final int retryAttempt;
            if (isGeneralSendError(error.getCondition())) {
                synchronized (errorConditionLock) {
                    lastKnownLinkError = exception;
                    lastKnownErrorReportedAt = Instant.now();
                    retryAttempt = retryAttempts.incrementAndGet();
                }
            } else {
                retryAttempt = retryAttempts.get();
            }

            final Duration retryInterval = retry.calculateRetryDelay(exception, retryAttempt);

            if (retryInterval == null || retryInterval.compareTo(workItem.getTimeoutTracker().remaining()) > 0) {
                cleanupFailedSend(workItem, exception);
            } else {
                workItem.setLastKnownException(exception);
                try {
                    reactorProvider.getReactorDispatcher().invoke(() -> send(workItem), retryInterval);
                } catch (IOException | RejectedExecutionException schedulerException) {
                    exception.initCause(schedulerException);
                    cleanupFailedSend(
                        workItem,
                        new AmqpException(false,
                            String.format(Locale.US, "Link(%s): send operation failed while scheduling a"
                                + " retry on Reactor, see cause for more details.", getLinkName()),
                            schedulerException, handler.getErrorContext(sender)));
                }
            }
        } else if (outcome instanceof Released) {
            cleanupFailedSend(workItem, new OperationCancelledException(outcome.toString(),
                handler.getErrorContext(sender)));
        } else if (outcome instanceof Declared) {
            final Declared declared = (Declared) outcome;
            workItem.success(declared);
        } else {
            cleanupFailedSend(workItem, new AmqpException(false, outcome.toString(),
                handler.getErrorContext(sender)));
        }
    }

    private void scheduleWorkOnDispatcher() {
        try {
            reactorProvider.getReactorDispatcher().invoke(this::processSendWork);
        } catch (IOException e) {
            logger.error("Error scheduling work on reactor.", e);
        }
    }

    private void cleanupFailedSend(final WorkItem workItem, final Exception exception) {
        workItem.error(exception);
    }

    private static boolean isGeneralSendError(Symbol amqpError) {
        return (amqpError == AmqpErrorCode.SERVER_BUSY_ERROR || amqpError == AmqpErrorCode.TIMEOUT_ERROR
            || amqpError == AmqpErrorCode.RESOURCE_LIMIT_EXCEEDED);
    }

    private static class WeightedDeliveryTag {
        private final String deliveryTag;
        private final int priority;

        WeightedDeliveryTag(final String deliveryTag, final int priority) {
            this.deliveryTag = deliveryTag;
            this.priority = priority;
        }

        private String getDeliveryTag() {
            return this.deliveryTag;
        }

        private int getPriority() {
            return this.priority;
        }
    }

    private static class DeliveryTagComparator implements Comparator<ReactorCoordinator.WeightedDeliveryTag>,
        Serializable {
        private static final long serialVersionUID = -7057500582037295635L;

        @Override
        public int compare(ReactorCoordinator.WeightedDeliveryTag deliveryTag0,
            ReactorCoordinator.WeightedDeliveryTag deliveryTag1) {
            return deliveryTag1.getPriority() - deliveryTag0.getPriority();
        }
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
        endpointStateSink.complete();
    }

    public String getLinkName() {
        return sender.getName();
    }

    @Override
    public Flux<AmqpEndpointState> getEndpointStates() {
        return endpointStates;
    }



    @Override
    public String getEntityPath() {
        return sender.getName();
    }

    @Override
    public String getHostname() {
        return handler.getHostname();
    }


    /**
     * Keeps track of Messages that have been sent, but may not have been acknowledged by the service.
     */
    private class SendTimeout extends TimerTask {
        private final String deliveryTag;

        SendTimeout(String deliveryTag) {
            this.deliveryTag = deliveryTag;
        }

        @Override
        public void run() {
            final WorkItem workItem = pendingSendsMap.remove(deliveryTag);
            if (workItem == null) {
                return;
            }

            Exception cause = lastKnownLinkError;
            final Exception lastError;
            final Instant lastErrorTime;

            synchronized (errorConditionLock) {
                lastError = lastKnownLinkError;
                lastErrorTime = lastKnownErrorReportedAt;
            }

            // Means that there was a timeout error on the send link before. So we check if the last time we got an
            // error it is after the sleep time buffer we allowed. Or if it is after the operation timeout we allotted.
            if (lastError != null && lastErrorTime != null) {
                final Instant now = Instant.now();
                final boolean isLastErrorAfterSleepTime =
                    lastErrorTime.isAfter(now.minusSeconds(SERVER_BUSY_BASE_SLEEP_TIME_IN_SECS));
                final boolean isServerBusy = lastError instanceof AmqpException && isLastErrorAfterSleepTime;
                final boolean isLastErrorAfterOperationTimeout = lastErrorTime.isAfter(now.minus(timeout));

                cause = isServerBusy || isLastErrorAfterOperationTimeout
                    ? lastError
                    : null;
            }

            // If it is a type of AmqpException, we received this error from the service, otherwise, it is a client-side
            // error.
            final AmqpException exception;
            if (cause instanceof AmqpException) {
                exception = (AmqpException) cause;
            } else {
                exception = new AmqpException(true, AmqpErrorCondition.TIMEOUT_ERROR,
                    String.format(Locale.US, "Entity(%s): Send operation timed out", getLinkName()),
                    handler.getErrorContext(sender));
            }

            workItem.error(exception);
        }
    }
}
