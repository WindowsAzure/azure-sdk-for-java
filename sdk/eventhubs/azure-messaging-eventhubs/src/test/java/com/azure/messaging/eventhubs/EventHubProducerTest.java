// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.RetryOptions;
import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.amqp.exception.ErrorCondition;
import com.azure.core.amqp.exception.ErrorContext;
import com.azure.messaging.eventhubs.implementation.AmqpSendLink;
import com.azure.messaging.eventhubs.models.BatchOptions;
import com.azure.messaging.eventhubs.models.EventHubProducerOptions;
import com.azure.messaging.eventhubs.models.SendOptions;
import org.apache.qpid.proton.amqp.messaging.Section;
import org.apache.qpid.proton.message.Message;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Unit tests to verify functionality of {@link EventHubProducer}.
 */
public class EventHubProducerTest {
    @Mock
    private AmqpSendLink sendLink;
    @Captor
    private ArgumentCaptor<Message> singleMessageCaptor;
    @Captor
    private ArgumentCaptor<List<Message>> messagesCaptor;

    private EventHubAsyncProducer asyncProducer;
    private RetryOptions retryOptions = new RetryOptions().tryTimeout(Duration.ofSeconds(30));

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(sendLink.getLinkSize()).thenReturn(Mono.just(EventHubAsyncProducer.MAX_MESSAGE_LENGTH_BYTES));
        when(sendLink.getErrorContext()).thenReturn(new ErrorContext("test-namespace"));
        when(sendLink.send(anyList())).thenReturn(Mono.empty());
        when(sendLink.send(any(Message.class))).thenReturn(Mono.empty());

        asyncProducer = new EventHubAsyncProducer(
            Mono.fromCallable(() -> sendLink),
            new EventHubProducerOptions().retry(retryOptions));
    }

    @After
    public void teardown() {
        Mockito.framework().clearInlineMocks();
        sendLink = null;
        singleMessageCaptor = null;
        messagesCaptor = null;
    }

    /**
     * Verifies can send a single message.
     */
    @Test
    public void sendSingleMessage() {
        // Arrange
        final EventHubProducer producer = new EventHubProducer(asyncProducer, retryOptions.tryTimeout());
        final EventData eventData = new EventData("hello-world".getBytes(UTF_8));

        // Act
        producer.send(eventData);

        // Assert
        verify(sendLink, times(1)).send(any(Message.class));
        verify(sendLink).send(singleMessageCaptor.capture());

        final Message message = singleMessageCaptor.getValue();
        Assert.assertEquals(Section.SectionType.Data, message.getBody().getType());
    }

    /**
     * Verifies we can send multiple messages.
     */
    @Test
    public void sendMultipleMessages() {
        // Arrange
        final int count = 4;
        final Iterable<EventData> events = Flux.range(0, count).map(number -> {
            final String contents = "event-data-" + number;
            return new EventData(contents.getBytes(UTF_8));
        }).toIterable();

        final SendOptions options = new SendOptions();
        final EventHubProducer producer = new EventHubProducer(asyncProducer, retryOptions.tryTimeout());

        // Act
        producer.send(events, options);

        // Assert
        verify(sendLink).send(messagesCaptor.capture());

        final List<Message> messagesSent = messagesCaptor.getValue();
        Assert.assertEquals(count, messagesSent.size());

        messagesSent.forEach(message -> Assert.assertEquals(Section.SectionType.Data, message.getBody().getType()));
    }

    /**
     * Verifies that the producer can create an {@link EventDataBatch} with the size given by the underlying AMQP send
     * link.
     */
    @Test
    public void createsEventDataBatch() {
        // Arrange
        int maxLinkSize = 1024;

        // Overhead when serializing an event, to figure out what the maximum size we can use for an event payload.
        int eventOverhead = 24;
        int maxEventPayload = maxLinkSize - eventOverhead;

        final AmqpSendLink link = mock(AmqpSendLink.class);
        when(link.getLinkSize()).thenReturn(Mono.just(maxLinkSize));

        // This event is 1024 bytes when serialized.
        final EventData event = new EventData(new byte[maxEventPayload]);

        // This event will be 1025 bytes when serialized.
        final EventData tooLargeEvent = new EventData(new byte[maxEventPayload + 1]);

        final EventHubProducerOptions producerOptions = new EventHubProducerOptions().retry(retryOptions);
        final EventHubAsyncProducer hubAsyncProducer = new EventHubAsyncProducer(Mono.fromCallable(() -> link), producerOptions);
        final EventHubProducer hubProducer = new EventHubProducer(hubAsyncProducer, retryOptions.tryTimeout());

        // Act
        final EventDataBatch batch = hubProducer.createBatch();

        // Assert
        Assert.assertNull(batch.getPartitionKey());
        Assert.assertFalse(batch.tryAdd(tooLargeEvent));
        Assert.assertTrue(batch.tryAdd(event));

        verify(link, times(1)).getLinkSize();
    }

    /**
     * Verifies we can create an EventDataBatch with partition key and link size.
     */
    @Test
    public void createsEventDataBatchWithPartitionKey() {
        // Arrange
        int maxBatchSize = 1024;

        // Overhead when serializing an event, to figure out what the maximum size we can use for an event payload.
        int eventOverhead = 98;
        int maxEventPayload = maxBatchSize - eventOverhead;

        // This event is 1024 bytes when serialized.
        final EventData event = new EventData(new byte[maxEventPayload]);

        // No idea what the overhead for adding partition key is. But we know this will be smaller than the max size.
        final BatchOptions options = new BatchOptions()
            .partitionKey("some-key")
            .maximumSizeInBytes(maxBatchSize);
        final EventHubProducer producer = new EventHubProducer(asyncProducer, retryOptions.tryTimeout());

        // Act
        final EventDataBatch batch = producer.createBatch(options);

        // Arrange
        Assert.assertEquals(options.partitionKey(), batch.getPartitionKey());
        Assert.assertTrue(batch.tryAdd(event));
    }

    /**
     * Verifies we can create an EventDataBatch with partition key and link size.
     */
    @Test
    public void payloadTooLarge() {
        // Arrange
        int maxBatchSize = 1024;

        // Overhead when serializing an event, to figure out what the maximum size we can use for an event payload.
        int eventOverhead = 24;
        int maxEventPayload = maxBatchSize - eventOverhead;

        // This event is 1025 bytes when serialized.
        final EventData event = new EventData(new byte[maxEventPayload + 1]);

        // No idea what the overhead for adding partition key is. But we know this will be smaller than the max size.
        final BatchOptions options = new BatchOptions()
            .maximumSizeInBytes(maxBatchSize);
        final EventHubProducer producer = new EventHubProducer(asyncProducer, retryOptions.tryTimeout());
        final EventDataBatch batch = producer.createBatch(options);

        // Act & Assert
        try {
            batch.tryAdd(event);
        } catch (AmqpException e) {
            Assert.assertEquals(ErrorCondition.LINK_PAYLOAD_SIZE_EXCEEDED, e.getErrorCondition());
        }
    }
}
