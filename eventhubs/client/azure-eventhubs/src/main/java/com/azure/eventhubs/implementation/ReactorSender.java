package com.azure.eventhubs.implementation;

import com.azure.core.amqp.Retry;
import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.amqp.exception.ErrorCondition;
import com.azure.core.amqp.exception.ErrorContext;
import com.azure.core.amqp.exception.ExceptionUtil;
import com.azure.core.implementation.logging.ServiceLogger;
import com.azure.eventhubs.EventSenderOptions;
import com.azure.eventhubs.OperationCancelledException;
import com.azure.eventhubs.implementation.handler.SendLinkHandler;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.messaging.Accepted;
import org.apache.qpid.proton.amqp.messaging.Rejected;
import org.apache.qpid.proton.amqp.messaging.Released;
import org.apache.qpid.proton.amqp.transport.DeliveryState;
import org.apache.qpid.proton.engine.Delivery;
import org.apache.qpid.proton.engine.EndpointState;
import org.apache.qpid.proton.engine.Sender;
import org.apache.qpid.proton.engine.impl.DeliveryImpl;
import org.apache.qpid.proton.message.Message;
import org.reactivestreams.Publisher;
import reactor.core.Disposable;
import reactor.core.Disposables;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.io.Serializable;
import java.nio.BufferOverflowException;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Handles scheduling send work on the link and
 */
class ReactorSender extends EndpointStateNotifierBase implements AmqpSendLink {
    private final String entityPath;
    private final Sender sender;
    private final SendLinkHandler handler;
    private final ReactorDispatcher dispatcher;
    private final int maxMessageSize;
    private final Disposable.Composite subscriptions;

    private final AtomicBoolean hasConnected = new AtomicBoolean();

    private final Object pendingSendLock = new Object();
    private final ConcurrentHashMap<String, RetriableWorkItem> pendingSendsMap = new ConcurrentHashMap<>();
    private final PriorityQueue<WeightedDeliveryTag> pendingSendsQueue = new PriorityQueue<>(1000, new DeliveryTagComparator());

    private final ActiveClientTokenManager tokenManager;
    private final Retry retry;
    private final Duration timeout;
    private final Timer sendTimeoutTimer = new Timer("SendTimeout-timer");

    private final Object errorConditionLock = new Object();
    private volatile Exception lastKnownLinkError;
    private volatile Instant lastKnownErrorReportedAt;

    ReactorSender(String entityPath, Sender sender, SendLinkHandler handler, ReactorDispatcher dispatcher, ActiveClientTokenManager tokenManager,
                  EventSenderOptions senderOptions, int maxMessageSize) {
        super(new ServiceLogger(ReactorSender.class));
        this.entityPath = entityPath;
        this.sender = sender;
        this.handler = handler;
        this.dispatcher = dispatcher;
        this.tokenManager = tokenManager;
        this.retry = senderOptions.retry();
        this.timeout = senderOptions.timeout();
        this.maxMessageSize = maxMessageSize;

        this.subscriptions = Disposables.composite(
            handler.getDeliveredMessages().subscribe(this::processDeliveredMessage),

            handler.getLinkCredits().subscribe(credit -> {
                logger.asVerbose().log("Credits added: {}", credit);
                this.scheduleWorkOnDispatcher();
            }),

            handler.getEndpointStates().subscribe(
                endpoint -> hasConnected.set(endpoint == EndpointState.ACTIVE),
                error -> logger.asError().log("Error encountered getting endpointState", error),
                () -> {
                    logger.asVerbose().log("getLinkCredits completed.");
                    hasConnected.set(false);
                }),

            tokenManager.getAuthorizationResults().subscribe(
                response -> logger.asVerbose().log("Token refreshed."),
                error -> {
                    logger.asInfo().log("clientId[{}], path[{}], linkName[{}] - tokenRenewalFailure[{}]",
                        handler.getConnectionId(), this.entityPath, getLinkName(), error.getMessage());
                }));
    }

    @Override
    public Mono<Void> send(Message message) {
        final int payloadSize = AmqpUtil.getDataSerializedSize(message);
        final int allocationSize = Math.min(payloadSize + ClientConstants.MAX_EVENTHUB_AMQP_HEADER_SIZE_BYTES, maxMessageSize);
        final byte[] bytes = new byte[allocationSize];

        int encodedSize;
        try {
            encodedSize = message.encode(bytes, 0, allocationSize);
        } catch (BufferOverflowException exception) {
            return Mono.error(new AmqpException(false, ErrorCondition.LINK_PAYLOAD_SIZE_EXCEEDED,
                String.format(Locale.US, "Error sending. Size of the payload exceeded Maximum message size: %s kb", maxMessageSize / 1024)));
        }

        return send(bytes, encodedSize, DeliveryImpl.DEFAULT_MESSAGE_FORMAT);
    }

    @Override
    public Mono<Void> send(Publisher<Message> messages) {
        return null;
    }

    @Override
    public String getLinkName() {
        return sender.getName();
    }

    @Override
    public String getEntityPath() {
        return null;
    }

    @Override
    public void close() {
        subscriptions.dispose();
        tokenManager.close();
        super.close();
    }

    private Mono<Void> send(byte[] bytes, int arrayOffset, int messageFormat) {
        return Mono.create(sink -> {
            final RetriableWorkItem workItem = new RetriableWorkItem(bytes, arrayOffset, messageFormat, sink, timeout);
            send(workItem);
        });
    }

    private void send(RetriableWorkItem workItem) {
        final String deliveryTag = UUID.randomUUID().toString().replace("-", "");

        synchronized (pendingSendLock) {
            this.pendingSendsMap.put(deliveryTag, workItem);
            this.pendingSendsQueue.offer(new WeightedDeliveryTag(deliveryTag, workItem.hasBeenRetried() ? 1 : 0));
        }

        this.scheduleWorkOnDispatcher();
    }

    /**
     * Invokes work on the Reactor. Should only be called from ReactorDispatcher.invoke()
     */
    private void processSendWork() {
        if (!hasConnected.get()) {
            logger.asWarning().log("Not connected. Not processing send work.");
            return;
        }

        while (hasConnected.get() && sender.getCredit() > 0) {
            final WeightedDeliveryTag weightedDelivery;
            final RetriableWorkItem workItem;
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
                    logger.asVerbose().log("clientId[{}]. path[{}], linkName[{}], deliveryTag[{}]: sendData not found for this delivery.",
                        handler.getConnectionId(), entityPath, getLinkName(), deliveryTag);
                }

                //TODO (conniey): Should we update to continue rather than break?
                break;
            }

            Delivery delivery = null;
            boolean linkAdvance = false;
            int sentMsgSize = 0;
            Exception sendException = null;

            try {
                delivery = sender.delivery(deliveryTag.getBytes(UTF_8));
                delivery.setMessageFormat(workItem.messageFormat());

                sentMsgSize = sender.send(workItem.message(), 0, workItem.encodedMessageSize());
                assert sentMsgSize == workItem.encodedMessageSize() : "Contract of the ProtonJ library for Sender.Send API changed";

                linkAdvance = sender.advance();
            } catch (Exception exception) {
                sendException = exception;
            }

            if (linkAdvance) {
                workItem.setIsWaitingForAck();
                sendTimeoutTimer.schedule(new SendTimeout(deliveryTag), timeout.toMillis());
            } else {
                logger.asVerbose().log(
                    "clientId[{}]. path[{}], linkName[{}], deliveryTag[{}], sentMessageSize[{}], payloadActualSize[{}]: sendlink advance failed",
                    handler.getConnectionId(), entityPath, getLinkName(), deliveryTag, sentMsgSize, workItem.encodedMessageSize());

                if (delivery != null) {
                    delivery.free();
                }

                workItem.sink().error(sendException != null
                    ? new OperationCancelledException(String.format(Locale.US, "Entity(%s): send operation failed. Please see cause for more details", entityPath), sendException)
                    : new OperationCancelledException(String.format(Locale.US, "Entity(%s): send operation failed while advancing delivery(tag: %s).", entityPath, deliveryTag)));
            }
        }
    }

    private void processDeliveredMessage(Delivery delivery) {
        final DeliveryState outcome = delivery.getRemoteState();
        final String deliveryTag = new String(delivery.getTag(), UTF_8);

        logger.asVerbose().log("entityPath[{}], path[{}], linkName[{}], deliveryTag[{}]", entityPath, getLinkName(), deliveryTag);

        final RetriableWorkItem workItem = pendingSendsMap.remove(deliveryTag);

        if (workItem == null) {
            logger.asVerbose().log("clientId[{}]. path[{}], linkName[{}], delivery[{}] - mismatch (or send timed out)",
                handler.getConnectionId(), entityPath, getLinkName(), deliveryTag);
            return;
        }

        if (outcome instanceof Accepted) {
            synchronized (errorConditionLock) {
                this.lastKnownLinkError = null;
                this.retry.resetRetryInterval();
            }

            workItem.sink().success();
        } else if (outcome instanceof Rejected) {
            final Rejected rejected = (Rejected) outcome;
            final org.apache.qpid.proton.amqp.transport.ErrorCondition error = rejected.getError();
            final Exception exception = ExceptionUtil.toException(error.getCondition().toString(), error.getDescription());

            if (isGeneralSendError(error.getCondition())) {
                synchronized (errorConditionLock) {
                    this.lastKnownLinkError = exception;
                    this.retry.incrementRetryCount();
                }
            }

            final Duration retryInterval = retry.getNextRetryInterval(exception, workItem.timeoutTracker().remaining());

            if (retryInterval == null) {
                this.cleanupFailedSend(workItem, exception);
            } else {
                workItem.lastKnownException(exception);
                try {
                    dispatcher.invoke(() -> send(workItem), retryInterval);
                } catch (IOException | RejectedExecutionException schedulerException) {
                    exception.initCause(schedulerException);
                    this.cleanupFailedSend(
                        workItem,
                        new AmqpException(false,
                            String.format(Locale.US, "Entity(%s): send operation failed while scheduling a retry on Reactor, see cause for more details.",
                                entityPath), schedulerException));
                }
            }
        } else if (outcome instanceof Released) {
            this.cleanupFailedSend(workItem, new OperationCancelledException(outcome.toString()));
        } else {
            this.cleanupFailedSend(workItem, new AmqpException(false, outcome.toString()));
        }
    }

    private void scheduleWorkOnDispatcher() {
        try {
            dispatcher.invoke(this::processSendWork);
        } catch (IOException e) {
            logger.asError().log("Error scheduling work on reactor.", e);
            //TODO (conniey): any error handling?
        }
    }

    private void cleanupFailedSend(final RetriableWorkItem workItem, final Exception exception) {
        //TODO (conniey): is there some timeout task I should handle?
        workItem.sink().error(exception);
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

    private static class DeliveryTagComparator implements Comparator<WeightedDeliveryTag>, Serializable {
        private static final long serialVersionUID = -7057500582037295635L;

        @Override
        public int compare(WeightedDeliveryTag deliveryTag0, WeightedDeliveryTag deliveryTag1) {
            return deliveryTag1.getPriority() - deliveryTag0.getPriority();
        }
    }

    /**
     * Keeps track of Messages that have been sent, but may not have been acknowledged by the service.
     */
    private class SendTimeout extends TimerTask {
        private static final String SEND_TIMED_OUT = "Send operation timed out";

        private final String deliveryTag;

        SendTimeout(String deliveryTag) {
            this.deliveryTag = deliveryTag;
        }

        @Override
        public void run() {
            final RetriableWorkItem workItem = pendingSendsMap.remove(deliveryTag);
            if (workItem == null) {
                return;
            }

            Exception exceptionUsed = lastKnownLinkError;
            final Exception lastError;
            final Instant lastErrorTime;

            synchronized (errorConditionLock) {
                lastError = lastKnownLinkError;
                lastErrorTime = lastKnownErrorReportedAt;
            }

            if (lastError != null) {
                final Instant now = Instant.now();
                final Instant duration = now.minusSeconds(ClientConstants.SERVER_BUSY_BASE_SLEEP_TIME_IN_SECS);
                final boolean isServerBusy = (lastError instanceof AmqpException) && lastErrorTime.isAfter(duration);

                final Instant timedOut = now.minusMillis(timeout.toMillis());
                exceptionUsed = isServerBusy || lastErrorTime.isAfter(timedOut)
                    ? lastError
                    : null;
            }

            final boolean isClientSideTimeout = !(exceptionUsed instanceof AmqpException);
            final AmqpException exception = isClientSideTimeout
                ? new AmqpException(true, ErrorCondition.TIMEOUT_ERROR, String.format(Locale.US, "Entity(%s): %s at %s.", entityPath, SEND_TIMED_OUT, ZonedDateTime.now()))
                : (AmqpException) exceptionUsed;
            final ErrorContext context = new ErrorContext(exception, handler.getHostname());

            exception.setContext(context);

            //TODO (conniey): Perform a retry rather than erroring out.
            workItem.sink().error(exception);
        }
    }
}
