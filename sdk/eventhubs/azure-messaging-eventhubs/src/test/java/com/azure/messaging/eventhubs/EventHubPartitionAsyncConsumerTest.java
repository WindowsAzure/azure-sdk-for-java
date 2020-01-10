// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.AmqpEndpointState;
import com.azure.core.amqp.AmqpRetryPolicy;
import com.azure.core.amqp.implementation.AmqpReceiveLink;
import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.messaging.eventhubs.implementation.AmqpReceiveLinkProcessor;
import com.azure.messaging.eventhubs.models.LastEnqueuedEventProperties;
import com.azure.messaging.eventhubs.models.PartitionContext;
import org.apache.qpid.proton.message.Message;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.same;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EventHubPartitionAsyncConsumerTest {
    private static final int PREFETCH = 5;
    private static final String HOSTNAME = "hostname-foo";
    private static final String EVENT_HUB_NAME = "event-hub-name";
    private static final String CONSUMER_GROUP = "consumer-group-test";
    private static final String PARTITION_ID = "a-partition-id";

    @Mock
    private AmqpReceiveLink link1;
    @Mock
    private AmqpReceiveLink link2;
    @Mock
    private AmqpRetryPolicy retryPolicy;
    @Mock
    private Message message1;
    @Mock
    private Message message2;
    @Mock
    private MessageSerializer messageSerializer;
    @Captor
    private ArgumentCaptor<Supplier<Integer>> creditSupplierCaptor;

    private final DirectProcessor<AmqpEndpointState> endpointProcessor = DirectProcessor.create();
    private final FluxSink<AmqpEndpointState> endpointSink = endpointProcessor.sink();

    private final DirectProcessor<Message> messageProcessor = DirectProcessor.create();
    private final FluxSink<Message> messageProcessorSink = messageProcessor.sink();

    private AmqpReceiveLinkProcessor linkProcessor;
    private EventHubPartitionAsyncConsumer consumer;

    @BeforeAll
    static void beforeAll() {
        StepVerifier.setDefaultTimeout(Duration.ofSeconds(30));
    }

    @AfterAll
    static void afterAll() {
        StepVerifier.resetDefaultTimeout();
    }

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);

        when(link1.getEndpointStates()).thenReturn(endpointProcessor);
        when(link1.receive()).thenReturn(messageProcessor);
    }

    @AfterEach
    void teardown() {
        if (consumer != null) {
            consumer.close();
        }

        if (linkProcessor != null) {
            linkProcessor.dispose();
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "true", "false" })
    void receivesMessages(boolean trackLastEnqueuedProperties) {
        // Arrange
        linkProcessor = createSink(link1, link2).subscribeWith(new AmqpReceiveLinkProcessor(PREFETCH, retryPolicy));
        consumer = new EventHubPartitionAsyncConsumer(linkProcessor, messageSerializer, HOSTNAME, EVENT_HUB_NAME,
            CONSUMER_GROUP, PARTITION_ID, trackLastEnqueuedProperties);

        final EventData event1 = new EventData("Foo");
        final EventData event2 = new EventData("Bar");
        final LastEnqueuedEventProperties last1 = new LastEnqueuedEventProperties(10L, 15L,
            Instant.ofEpochMilli(1243454), Instant.ofEpochMilli(1240004));
        final LastEnqueuedEventProperties last2 = new LastEnqueuedEventProperties(1005L, 154L,
            Instant.ofEpochMilli(8796254), Instant.ofEpochMilli(8795200));

        when(messageSerializer.deserialize(same(message1), eq(EventData.class))).thenReturn(event1);
        when(messageSerializer.deserialize(same(message1), eq(LastEnqueuedEventProperties.class))).thenReturn(last1);

        when(messageSerializer.deserialize(same(message2), eq(EventData.class))).thenReturn(event2);
        when(messageSerializer.deserialize(same(message2), eq(LastEnqueuedEventProperties.class))).thenReturn(last2);

        // Act & Assert
        StepVerifier.create(consumer.receive())
            .then(() -> {
                messageProcessorSink.next(message1);
                messageProcessorSink.next(message2);
            })
            .assertNext(partitionEvent -> {
                verifyPartitionContext(partitionEvent.getPartitionContext());
                verifyLastEnqueuedInformation(trackLastEnqueuedProperties, last1,
                    partitionEvent.getLastEnqueuedEventProperties());

                Assertions.assertSame(event1, partitionEvent.getData());
            })
            .assertNext(partitionEvent -> {
                verifyPartitionContext(partitionEvent.getPartitionContext());
                verifyLastEnqueuedInformation(trackLastEnqueuedProperties, last2,
                    partitionEvent.getLastEnqueuedEventProperties());

                Assertions.assertSame(event2, partitionEvent.getData());
            })
            .thenCancel()
            .verify();

        // The emitter processor is not closed until the partition consumer is.
        Assertions.assertFalse(linkProcessor.isTerminated());
    }

    @Test
    void receiveMultipleTimes() {
        // Arrange
        linkProcessor = createSink(link1, link2).subscribeWith(new AmqpReceiveLinkProcessor(PREFETCH, retryPolicy));
        consumer = new EventHubPartitionAsyncConsumer(linkProcessor, messageSerializer, HOSTNAME, EVENT_HUB_NAME,
            CONSUMER_GROUP, PARTITION_ID, false);

        final Message message3 = mock(Message.class);
        final EventData event1 = new EventData("Foo");
        final EventData event2 = new EventData("Bar");
        final EventData event3 = new EventData("Baz");

        when(messageSerializer.deserialize(same(message1), eq(EventData.class))).thenReturn(event1);
        when(messageSerializer.deserialize(same(message2), eq(EventData.class))).thenReturn(event2);
        when(messageSerializer.deserialize(same(message3), eq(EventData.class))).thenReturn(event3);

        // Act & Assert
        StepVerifier.create(consumer.receive())
            .then(() -> {
                messageProcessorSink.next(message1);
                messageProcessorSink.next(message2);
            })
            .assertNext(partitionEvent -> {
                verifyPartitionContext(partitionEvent.getPartitionContext());
                verifyLastEnqueuedInformation(false, null, partitionEvent.getLastEnqueuedEventProperties());
                Assertions.assertSame(event1, partitionEvent.getData());
            })
            .assertNext(partitionEvent -> {
                verifyPartitionContext(partitionEvent.getPartitionContext());
                verifyLastEnqueuedInformation(false, null, partitionEvent.getLastEnqueuedEventProperties());
                Assertions.assertSame(event2, partitionEvent.getData());
            })
            .thenCancel()
            .verify();

        StepVerifier.create(consumer.receive())
            .then(() -> messageProcessorSink.next(message3))
            .assertNext(partitionEvent -> {
                verifyPartitionContext(partitionEvent.getPartitionContext());
                verifyLastEnqueuedInformation(false, null, partitionEvent.getLastEnqueuedEventProperties());
                Assertions.assertSame(event3, partitionEvent.getData());
            })
            .then(() -> consumer.close())
            .expectComplete()
            .verify();

        // We terminated the processor. This should be terminated as well.
        Assertions.assertTrue(linkProcessor.isTerminated());
    }

    private void verifyLastEnqueuedInformation(boolean trackLastEnqueued,
        LastEnqueuedEventProperties expected, LastEnqueuedEventProperties actual) {

        if (!trackLastEnqueued) {
            Assertions.assertNull(actual);
            return;
        }

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected.getEnqueuedTime(), actual.getEnqueuedTime());
        Assertions.assertEquals(expected.getOffset(), actual.getOffset());
        Assertions.assertEquals(expected.getRetrievalTime(), actual.getRetrievalTime());
        Assertions.assertEquals(expected.getSequenceNumber(), actual.getSequenceNumber());
    }

    private void verifyPartitionContext(PartitionContext context) {
        Assertions.assertEquals(HOSTNAME, context.getFullyQualifiedNamespace());
        Assertions.assertEquals(PARTITION_ID, context.getPartitionId());
        Assertions.assertEquals(EVENT_HUB_NAME, context.getEventHubName());
        Assertions.assertEquals(CONSUMER_GROUP, context.getConsumerGroup());
    }

    private static Flux<AmqpReceiveLink> createSink(AmqpReceiveLink... links) {
        return Flux.create(emitter -> {
            final AtomicInteger counter = new AtomicInteger();

            emitter.onRequest(request -> {
                for (int i = 0; i < request; i++) {
                    final int index = counter.getAndIncrement();

                    if (index == links.length) {
                        emitter.error(new RuntimeException(String.format(
                            "Cannot emit more. Index: %s. # of Connections: %s",
                            index, links.length)));
                        break;
                    }

                    emitter.next(links[index]);
                }
            });
        }, FluxSink.OverflowStrategy.BUFFER);
    }
}
