// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.util.IterableStream;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.models.ReceiveAsyncOptions;
import com.azure.messaging.servicebus.models.ReceiveMode;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.messaging.servicebus.implementation.Messages.INVALID_OPERATION_DISPOSED_RECEIVER;

/**
 * A <b>synchronous</b> receiver responsible for receiving {@link ServiceBusReceivedMessage} from a specific queue or
 * topic on Azure Service Bus.
 *
 * <p><strong>Create an instance of receiver</strong></p>
 * {@codesnippet com.azure.messaging.servicebus.servicebusreceiverclient.instantiation}
 *
 * @see ServiceBusClientBuilder
 * @see ServiceBusReceiverAsyncClient To communicate with a Service Bus resource using an asynchronous client.
 */
@ServiceClient(builder = ServiceBusClientBuilder.class)
public class ServiceBusReceiverClient implements AutoCloseable {
    private final ClientLogger logger = new ClientLogger(ServiceBusReceiverClient.class);
    private final AtomicInteger idGenerator = new AtomicInteger();
    private final ServiceBusReceiverAsyncClient asyncClient;
    private final Duration operationTimeout;
    private static final ReceiveAsyncOptions DEFAULT_RECEIVE_OPTIONS = new ReceiveAsyncOptions()
        .setEnableAutoComplete(false)
        .setMaxAutoRenewDuration(Duration.ZERO);
    private static ContinuesMessageSubscriber continuesMessageSubscriber = null;

    /**
     * Creates a synchronous receiver given its asynchronous counterpart.
     * @param asyncClient Asynchronous receiver.
     */
    ServiceBusReceiverClient(ServiceBusReceiverAsyncClient asyncClient, Duration operationTimeout) {
        this.asyncClient = Objects.requireNonNull(asyncClient, "'asyncClient' cannot be null.");
        this.operationTimeout = Objects.requireNonNull(operationTimeout, "'operationTimeout' cannot be null.");
    }

    /**
     * Gets the fully qualified Service Bus namespace that the connection is associated with. This is likely similar to
     * {@code {yournamespace}.servicebus.windows.net}.
     * @return The fully qualified Service Bus namespace that the connection is associated with.
     */
    public String getFullyQualifiedNamespace() {
        return asyncClient.getFullyQualifiedNamespace();
    }

    /**
     * Gets the Service Bus resource this client interacts with.
     * @return The Service Bus resource this client interacts with.
     */
    public String getEntityPath() {
        return asyncClient.getEntityPath();
    }

    /**
     * Abandon a {@link ServiceBusReceivedMessage message} with its lock token. This will make the message available
     * again for processing. Abandoning a message will increase the delivery count on the message.
     * @param lockToken Lock token of the message.
     *
     * @throws NullPointerException          if {@code lockToken} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *                                       mode.
     * @throws IllegalArgumentException      if {@link MessageLockToken#getLockToken()} returns a null lock token.
     */
    public void abandon(MessageLockToken lockToken) {
        asyncClient.abandon(lockToken).block(operationTimeout);
    }

    /**
     * Abandon a {@link ServiceBusReceivedMessage message} with its lock token and updates the message's properties.
     * This will make the message available again for processing. Abandoning a message will increase the delivery count
     * on the message.
     * @param lockToken          Lock token of the message.
     * @param propertiesToModify Properties to modify on the message.
     *
     * @throws NullPointerException          if {@code lockToken} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *                                       mode.
     * @throws IllegalArgumentException      if {@link MessageLockToken#getLockToken()} returns a null lock token.
     */
    public void abandon(MessageLockToken lockToken, Map<String, Object> propertiesToModify) {
        asyncClient.abandon(lockToken, propertiesToModify).block(operationTimeout);
    }

    /**
     * Completes a {@link ServiceBusReceivedMessage message} using its lock token. This will delete the message from the
     * service.
     * @param lockToken Lock token of the message.
     *
     * @throws NullPointerException          if {@code lockToken} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *                                       mode.
     * @throws IllegalArgumentException      if {@link MessageLockToken#getLockToken()} returns a null lock token.
     */
    public void complete(MessageLockToken lockToken) {
        asyncClient.complete(lockToken).block(operationTimeout);
    }

    /**
     * Defers a {@link ServiceBusReceivedMessage message} using its lock token. This will move message into the deferred
     * subqueue.
     * @param lockToken Lock token of the message.
     *
     * @throws NullPointerException          if {@code lockToken} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *                                       mode.
     * @throws IllegalArgumentException      if {@link MessageLockToken#getLockToken()} returns a null lock token.
     * @see <a href="https://docs.microsoft.com/azure/service-bus-messaging/message-deferral">Message deferral</a>
     */
    public void defer(MessageLockToken lockToken) {
        asyncClient.defer(lockToken).block(operationTimeout);
    }

    /**
     * Defers a {@link ServiceBusReceivedMessage message} using its lock token with modified message property. This will
     * move message into the deferred subqueue.
     * @param lockToken          Lock token of the message.
     * @param propertiesToModify Message properties to modify.
     *
     * @throws NullPointerException          if {@code lockToken} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *                                       mode.
     * @throws IllegalArgumentException      if {@link MessageLockToken#getLockToken()} returns a null lock token.
     * @see <a href="https://docs.microsoft.com/azure/service-bus-messaging/message-deferral">Message deferral</a>
     */
    public void defer(MessageLockToken lockToken, Map<String, Object> propertiesToModify) {
        asyncClient.defer(lockToken, propertiesToModify).block(operationTimeout);
    }

    /**
     * Moves a {@link ServiceBusReceivedMessage message} to the deadletter sub-queue.
     * @param lockToken Lock token of the message.
     *
     * @throws NullPointerException          if {@code lockToken} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *                                       mode.
     * @throws IllegalArgumentException      if {@link MessageLockToken#getLockToken()} returns a null lock token.
     * @see <a href="https://docs.microsoft.com/azure/service-bus-messaging/service-bus-dead-letter-queues">Dead letter
     * queues</a>
     */
    public void deadLetter(MessageLockToken lockToken) {
        asyncClient.deadLetter(lockToken).block(operationTimeout);
    }

    /**
     * Moves a {@link ServiceBusReceivedMessage message} to the deadletter subqueue with deadletter reason, error
     * description, and/or modified properties.
     * @param lockToken         Lock token of the message.
     * @param deadLetterOptions The options to specify when moving message to the deadletter sub-queue.
     *
     * @throws NullPointerException          if {@code lockToken} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *                                       mode.
     * @throws IllegalArgumentException      if {@link MessageLockToken#getLockToken()} returns a null lock token.
     */
    public void deadLetter(MessageLockToken lockToken, DeadLetterOptions deadLetterOptions) {
        asyncClient.deadLetter(lockToken, deadLetterOptions).block(operationTimeout);
    }

    /**
     * Gets the state of a session given its identifier.
     * @param sessionId Identifier of session to get.
     *
     * @return The session state or null if there is no state set for the session.
     * @throws IllegalStateException if the receiver is a non-session receiver.
     */
    public byte[] getSessionState(String sessionId) {
        return asyncClient.getSessionState(sessionId).block(operationTimeout);
    }

    /**
     * Reads the next active message without changing the state of the receiver or the message source. The first call to
     * {@code peek()} fetches the first active message for this receiver. Each subsequent call fetches the subsequent
     * message in the entity.
     * @return A peeked {@link ServiceBusReceivedMessage}.
     * @see <a href="https://docs.microsoft.com/azure/service-bus-messaging/message-browsing">Message browsing</a>
     */
    public ServiceBusReceivedMessage peek() {
        return asyncClient.peek().block(operationTimeout);
    }

    /**
     * Starting from the given sequence number, reads next the active message without changing the state of the receiver
     * or the message source.
     * @param sequenceNumber The sequence number from where to read the message.
     *
     * @return A peeked {@link ServiceBusReceivedMessage}.
     * @see <a href="https://docs.microsoft.com/azure/service-bus-messaging/message-browsing">Message browsing</a>
     */
    public ServiceBusReceivedMessage peekAt(long sequenceNumber) {
        return asyncClient.peekAt(sequenceNumber).block(operationTimeout);
    }

    /**
     * Reads the next batch of active messages without changing the state of the receiver or the message source.
     * @param maxMessages The number of messages.
     *
     * @return An {@link IterableStream} of {@link ServiceBusReceivedMessage messages} that are peeked.
     * @throws IllegalArgumentException if {@code maxMessages} is not a positive integer.
     * @see <a href="https://docs.microsoft.com/azure/service-bus-messaging/message-browsing">Message browsing</a>
     */
    public IterableStream<ServiceBusReceivedMessage> peekBatch(int maxMessages) {
        if (maxMessages <= 0) {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                "'maxMessages' cannot be less than or equal to 0. maxMessages: " + maxMessages));
        }

        final Flux<ServiceBusReceivedMessage> messages = asyncClient.peekBatch(maxMessages)
            .timeout(operationTimeout);

        // Subscribe so we can kick off this operation.
        messages.subscribe();

        return new IterableStream<>(messages);
    }

    /**
     * Starting from the given sequence number, reads the next batch of active messages without changing the state of
     * the receiver or the message source.
     * @param maxMessages    The number of messages.
     * @param sequenceNumber The sequence number from where to start reading messages.
     *
     * @return An {@link IterableStream} of {@link ServiceBusReceivedMessage} peeked.
     * @throws IllegalArgumentException if {@code maxMessages} is not a positive integer.
     * @see <a href="https://docs.microsoft.com/azure/service-bus-messaging/message-browsing">Message browsing</a>
     */
    public IterableStream<ServiceBusReceivedMessage> peekBatchAt(int maxMessages, long sequenceNumber) {
        if (maxMessages <= 0) {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                "'maxMessages' cannot be less than or equal to 0. maxMessages: " + maxMessages));
        }

        final Flux<ServiceBusReceivedMessage> messages = asyncClient.peekBatchAt(maxMessages, sequenceNumber)
            .timeout(operationTimeout);

        // Subscribe so we can kick off this operation.
        messages.subscribe();

        return new IterableStream<>(messages);
    }

    /**
     * Receives an iterable stream of {@link ServiceBusReceivedMessage messages} from the Service Bus entity.
     * The receive operation will wait for a default 1 minute for receiving a message before it times out. You can it
     * override by using {@link #receive(int, Duration)}.
     * @param maxMessages The maximum number of messages to receive.
     *
     * @return An {@link IterableStream} of at most {@code maxMessages} messages from the Service Bus entity.
     * @throws IllegalArgumentException if {@code maxMessages} is zero or a negative value.
     */
    public IterableStream<ServiceBusReceivedMessage> receive(int maxMessages) {
        return receive(maxMessages, operationTimeout);
    }

    /**
     * Receives an iterable stream of {@link ServiceBusReceivedMessage messages} from the Service Bus entity.
     * @param maxMessages The maximum number of messages to receive.
     * @param maxWaitTime The time the client waits for receiving a message before it times out.
     *
     * @return An {@link IterableStream} of at most {@code maxMessages} messages from the Service Bus entity.
     * @throws IllegalArgumentException if {@code maxMessages} or {@code maxWaitTime} is zero or a negative value.
     */
    public IterableStream<ServiceBusReceivedMessage> receive(int maxMessages, Duration maxWaitTime) {
        if (maxMessages <= 0) {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                "'maxMessages' cannot be less than or equal to 0. maxMessages: " + maxMessages));
        } else if (Objects.isNull(maxWaitTime)) {
            throw logger.logExceptionAsError(
                new NullPointerException("'maxWaitTime' cannot be null."));
        } else if (maxWaitTime.isNegative() || maxWaitTime.isZero()) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("'maxWaitTime' cannot be zero or less. maxWaitTime: " + maxWaitTime));
        }

        final Flux<ServiceBusReceivedMessage> messages = Flux.create((emitter) -> queueWork(maxMessages, maxWaitTime,
            emitter));

        return new IterableStream<>(messages);
    }

    /**
     * Receives a deferred {@link ServiceBusReceivedMessage message}. Deferred messages can only be received by using
     * sequence number.
     * @param sequenceNumber The {@link ServiceBusReceivedMessage#getSequenceNumber() sequence number} of the
     *                       message.
     *
     * @return A deferred message with the matching {@code sequenceNumber}.
     */
    public ServiceBusReceivedMessage receiveDeferredMessage(long sequenceNumber) {
        return asyncClient.receiveDeferredMessage(sequenceNumber).block(operationTimeout);
    }

    /**
     * Receives a batch of deferred {@link ServiceBusReceivedMessage messages}. Deferred messages can only be received
     * by using sequence number.
     * @param sequenceNumbers The sequence numbers of the deferred messages.
     *
     * @return An {@link IterableStream} of deferred {@link ServiceBusReceivedMessage messages}.
     */
    public IterableStream<ServiceBusReceivedMessage> receiveDeferredMessageBatch(long... sequenceNumbers) {
        final Flux<ServiceBusReceivedMessage> messages = asyncClient.receiveDeferredMessageBatch(sequenceNumbers)
            .timeout(operationTimeout);

        // Subscribe so we can kick off this operation.
        messages.subscribe();

        return new IterableStream<>(messages);
    }

    /**
     * Renews the lock on the specified message. The lock will be renewed based on the setting specified on the entity.
     * When a message is received in {@link ReceiveMode#PEEK_LOCK} mode, the message is locked on the server for this
     * receiver instance for a duration as specified during the Queue creation (LockDuration). If processing of the
     * message requires longer than this duration, the lock needs to be renewed. For each renewal, the lock is reset to
     * the entity's LockDuration value.
     * @param lockToken Lock token of the message to renew.
     *
     * @return The new expiration time for the message.
     * @throws NullPointerException          if {@code lockToken} is null.
     * @throws UnsupportedOperationException if the receiver was opened in {@link ReceiveMode#RECEIVE_AND_DELETE}
     *                                       mode.
     * @throws IllegalArgumentException      if {@link MessageLockToken#getLockToken()} returns a null lock token.
     * @throws IllegalStateException         if the receiver is a session receiver.
     */
    public Instant renewMessageLock(MessageLockToken lockToken) {
        return asyncClient.renewMessageLock(lockToken).block(operationTimeout);
    }

    /**
     * Sets the state of a session given its identifier.
     * @param sessionId Identifier of session to get.
     *
     * @return The next expiration time for the session lock.
     * @throws IllegalStateException if the receiver is a non-session receiver.
     */
    public Instant renewSessionLock(String sessionId) {
        return asyncClient.renewSessionLock(sessionId).block(operationTimeout);
    }

    /**
     * Sets the state of a session given its identifier.
     * @param sessionId    Identifier of session to get.
     * @param sessionState State to set on the session.
     *
     * @throws IllegalStateException if the receiver is a non-session receiver.
     */
    public void setSessionState(String sessionId, byte[] sessionState) {
        asyncClient.setSessionState(sessionId, sessionState).block(operationTimeout);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() {
        asyncClient.close();

        if (continuesMessageSubscriber != null) {
            continuesMessageSubscriber.dispose();
        }
    }

    /**
     * Given an {@code emitter}, subscribes {@link ContinuesMessageSubscriber} to receive messages from Service Bus.
     * If the message subscriber has not been created, will initialise it.
     */
    private void queueWork(int maximumMessageCount, Duration maxWaitTime,
                           FluxSink<ServiceBusReceivedMessage> emitter) {

        if (continuesMessageSubscriber != null && continuesMessageSubscriber.isDisposed()) {
            logger.error("[{}]: Can not receive messaged because client is closed.", asyncClient.getEntityPath());
            return;
        }

        if (continuesMessageSubscriber == null) {
            continuesMessageSubscriber = asyncClient.receive(DEFAULT_RECEIVE_OPTIONS)
                .subscribeWith(new ContinuesMessageSubscriber(maximumMessageCount, emitter));

            logger.info("[{}]: Started ContinuesMessageSubscriber message subscriber for entity.",
                asyncClient.getEntityPath());
        } else {
            continuesMessageSubscriber.request(maximumMessageCount, emitter);
        }
    }
}
