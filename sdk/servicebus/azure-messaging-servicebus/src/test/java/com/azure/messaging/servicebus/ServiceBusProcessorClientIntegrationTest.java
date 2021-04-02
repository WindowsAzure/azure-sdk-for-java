// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.amqp.AmqpTransportType;
import com.azure.core.amqp.ProxyOptions;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.implementation.MessagingEntityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static com.azure.messaging.servicebus.TestUtils.getSessionSubscriptionBaseName;
import static com.azure.messaging.servicebus.TestUtils.getSubscriptionBaseName;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Tests for {@link ServiceBusProcessorClient}.
 */

public class ServiceBusProcessorClientIntegrationTest extends IntegrationTestBase {
    private final ClientLogger logger = new ClientLogger(ServiceBusProcessorClientIntegrationTest.class);
    private final AtomicInteger messagesPending = new AtomicInteger();
    private final Scheduler scheduler = Schedulers.parallel();

    private ServiceBusProcessorClient processor;
    private ServiceBusSenderAsyncClient sender;

    @Override
    protected void beforeTest() {
        sessionId = UUID.randomUUID().toString();
    }

    @Override
    protected void afterTest() {
        sharedBuilder = null;
        try {
            dispose(processor, sender);
        } catch (Exception e) {
            logger.warning("Error occurred when draining queue.", e);
        }
    }

    ServiceBusProcessorClientIntegrationTest() {
        super(new ClientLogger(ServiceBusProcessorClientIntegrationTest.class));
    }

    /**
     * Validate that processor receive the message and {@code MaxAutoLockRenewDuration} is set on the
     * {@link ServiceBusReceiverAsyncClient}. The message lock is released by the client and same message received
     * again.
     */
    @MethodSource("com.azure.messaging.servicebus.IntegrationTestBase#messagingEntityWithSessions")
    @ParameterizedTest
    void receiveMessage(MessagingEntityType entityType, boolean isSessionEnabled) throws InterruptedException {
        // Arrange
        final int lockTimeoutDurationSeconds = 15;
        final int entityIndex = TestUtils.USE_CASE_PROCESSOR_RECEIVE;
        final Duration expectedMaxAutoLockRenew = Duration.ofSeconds(lockTimeoutDurationSeconds);

        final String messageId = UUID.randomUUID().toString();
        final ServiceBusMessage message = getMessage(messageId, isSessionEnabled).setMessageId(messageId);
        // The message should comeback after the client release the lock once because maxAutoLockRenewDuration is set
        // by user.
        CountDownLatch countDownLatch = new CountDownLatch(2);

        // send the message
        setSender(entityType, entityIndex, isSessionEnabled);
        sendMessage(message).block(TIMEOUT);

        if (isSessionEnabled) {
            assertNotNull(sessionId, "'sessionId' should have been set.");
            AmqpRetryOptions amqpRetryOptions = new AmqpRetryOptions().setTryTimeout(Duration.ofSeconds(lockTimeoutDurationSeconds));
            processor = getSessionProcessorBuilder(false, entityType, entityIndex, false, amqpRetryOptions)
                .maxAutoLockRenewDuration(expectedMaxAutoLockRenew)
                .disableAutoComplete()
                .processMessage(context -> processMessage(context, countDownLatch, messageId))
                .processError(context -> processError(context, countDownLatch))
                .buildProcessorClient();

        } else {
            this.processor = getProcessorBuilder(false, entityType, entityIndex, false)
                .maxAutoLockRenewDuration(expectedMaxAutoLockRenew)
                .disableAutoComplete()
                .processMessage(context -> processMessage(context, countDownLatch, messageId))
                .processError(context -> processError(context, countDownLatch))
                .buildProcessorClient();
        }

        // Assert & Act
        System.out.println("Starting the processor");
        processor.start();

        System.out.println("Listening for messages .. ");
        if (countDownLatch.await(lockTimeoutDurationSeconds * 4, TimeUnit.SECONDS)) {
            System.out.println("Message lock has been renewed. Now closing processor");
        } else {
            System.out.println("Message not arrived, closing processor.");
            Assertions.fail("Message not arrived, closing processor.");
        }

        processor.close();
    }

    private void processMessage(ServiceBusReceivedMessageContext context, CountDownLatch countDownLatch, String expectedMessageId) {
        ServiceBusReceivedMessage message = context.getMessage();
        if (message.getMessageId().equals(expectedMessageId)) {
            System.out.printf("Processing message. Session: %s, Sequence #: %s. Contents: %s%n", message.getMessageId(),
                message.getSequenceNumber(), message.getBody());
            countDownLatch.countDown();
        } else {
            System.out.printf("Received message, message id did not match. Session: %s, Sequence #: %s. Contents: %s%n", message.getMessageId(),
                message.getSequenceNumber(), message.getBody());
        }
    }

    private static void processError(ServiceBusErrorContext context, CountDownLatch countdownLatch) {
        System.out.printf("Error when receiving messages from namespace: '%s'. Entity: '%s'%n",
            context.getFullyQualifiedNamespace(), context.getEntityPath());
    }

    protected ServiceBusClientBuilder.ServiceBusProcessorClientBuilder getProcessorBuilder(boolean useCredentials,
        MessagingEntityType entityType, int entityIndex, boolean sharedConnection) {

        ServiceBusClientBuilder builder = getBuilder(useCredentials, sharedConnection);
        switch (entityType) {
            case QUEUE:
                final String queueName = getQueueName(entityIndex);
                assertNotNull(queueName, "'queueName' cannot be null.");

                return builder.processor().queueName(queueName);
            case SUBSCRIPTION:
                final String topicName = getTopicName(entityIndex);
                final String subscriptionName = getSubscriptionBaseName();
                assertNotNull(topicName, "'topicName' cannot be null.");
                assertNotNull(subscriptionName, "'subscriptionName' cannot be null.");

                return builder.processor().topicName(topicName).subscriptionName(subscriptionName);
            default:
                throw logger.logExceptionAsError(new IllegalArgumentException("Unknown entity type: " + entityType));
        }
    }

    protected ServiceBusClientBuilder.ServiceBusSessionProcessorClientBuilder getSessionProcessorBuilder(boolean useCredentials,
        MessagingEntityType entityType, int entityIndex, boolean sharedConnection, AmqpRetryOptions amqpRetryOptions) {

        ServiceBusClientBuilder builder = getBuilder(useCredentials, sharedConnection);
        builder.retryOptions(amqpRetryOptions);

        switch (entityType) {
            case QUEUE:
                final String queueName = getSessionQueueName(entityIndex);
                assertNotNull(queueName, "'queueName' cannot be null.");
                return builder
                    .sessionProcessor()
                    .queueName(queueName);

            case SUBSCRIPTION:
                final String topicName = getTopicName(entityIndex);
                final String subscriptionName = getSessionSubscriptionBaseName();
                assertNotNull(topicName, "'topicName' cannot be null.");
                assertNotNull(subscriptionName, "'subscriptionName' cannot be null.");
                return builder.sessionProcessor()
                    .topicName(topicName).subscriptionName(subscriptionName);
            default:
                throw logger.logExceptionAsError(new IllegalArgumentException("Unknown entity type: " + entityType));
        }
    }

    private void setSender(MessagingEntityType entityType, int entityIndex, boolean isSessionEnabled) {
        final boolean shareConnection = false;
        final boolean useCredentials = false;
        this.sender = getSenderBuilder(useCredentials, entityType, entityIndex, isSessionEnabled, shareConnection)
            .buildAsyncClient();
    }

    private ServiceBusClientBuilder getBuilder(boolean useCredentials, boolean sharedConnection) {
        return new ServiceBusClientBuilder()
            .connectionString(getConnectionString())
            .proxyOptions(ProxyOptions.SYSTEM_DEFAULTS)
            .retryOptions(RETRY_OPTIONS)
            .transportType(AmqpTransportType.AMQP)
            .scheduler(scheduler);
    }

    private Mono<Void> sendMessage(ServiceBusMessage message) {
        return sender.sendMessage(message).doOnSuccess(aVoid -> {
            int number = messagesPending.incrementAndGet();
            logger.info("Message Id {}. Number sent: {}", message.getMessageId(), number);
        });
    }
}
