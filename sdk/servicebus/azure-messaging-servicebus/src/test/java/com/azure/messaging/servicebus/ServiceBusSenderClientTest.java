// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.amqp.AmqpEndpointState;
import com.azure.core.amqp.AmqpRetryMode;
import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.amqp.AmqpTransportType;
import com.azure.core.amqp.ProxyOptions;
import com.azure.core.amqp.implementation.AmqpSendLink;
import com.azure.core.amqp.implementation.CbsAuthorizationType;
import com.azure.core.amqp.implementation.ConnectionOptions;
import com.azure.core.amqp.implementation.ErrorContextProvider;
import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.amqp.implementation.TracerProvider;
import com.azure.core.credential.TokenCredential;
import com.azure.messaging.servicebus.implementation.ServiceBusAmqpConnection;
import com.azure.messaging.servicebus.implementation.ServiceBusConnectionProcessor;
import com.azure.messaging.servicebus.models.CreateBatchOptions;
import org.apache.qpid.proton.amqp.messaging.Section;
import org.apache.qpid.proton.message.Message;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static com.azure.messaging.servicebus.ServiceBusSenderAsyncClient.MAX_MESSAGE_LENGTH_BYTES;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ServiceBusSenderClientTest {
    private static final String NAMESPACE = "my-namespace";
    private static final String ENTITY_NAME = "my-servicebus-entity";

    @Mock
    private AmqpSendLink sendLink;
    @Mock
    private ServiceBusAmqpConnection connection;
    @Mock
    private TokenCredential tokenCredential;
    @Mock
    private ErrorContextProvider errorContextProvider;

    @Captor
    private ArgumentCaptor<Message> singleMessageCaptor;
    @Captor
    private ArgumentCaptor<List<Message>> messagesCaptor;

    private MessageSerializer serializer = new ServiceBusMessageSerializer();
    private TracerProvider tracerProvider = new TracerProvider(Collections.emptyList());

    private final MessageSerializer messageSerializer = new ServiceBusMessageSerializer();
    private final AmqpRetryOptions retryOptions = new AmqpRetryOptions()
        .setDelay(Duration.ofMillis(500))
        .setMode(AmqpRetryMode.FIXED)
        .setTryTimeout(Duration.ofSeconds(10));
    private final DirectProcessor<AmqpEndpointState> endpointProcessor = DirectProcessor.create();
    private final FluxSink<AmqpEndpointState> endpointSink = endpointProcessor.sink(FluxSink.OverflowStrategy.BUFFER);
    private ServiceBusSenderAsyncClient asyncSender;
    private ServiceBusSenderClient sender;
    private ServiceBusConnectionProcessor connectionProcessor;
    private ConnectionOptions connectionOptions;


    private static final String TEST_CONTENTS = "My message for service bus queue!";

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

        tracerProvider = new TracerProvider(Collections.emptyList());
        connectionOptions = new ConnectionOptions(NAMESPACE, tokenCredential,
            CbsAuthorizationType.SHARED_ACCESS_SIGNATURE, AmqpTransportType.AMQP, retryOptions,
            ProxyOptions.SYSTEM_DEFAULTS, Schedulers.parallel());

        when(connection.getEndpointStates()).thenReturn(endpointProcessor);
        endpointSink.next(AmqpEndpointState.ACTIVE);

        connectionProcessor = Mono.fromCallable(() -> connection).repeat(10).subscribeWith(
            new ServiceBusConnectionProcessor(connectionOptions.getFullyQualifiedNamespace(),
                ENTITY_NAME, connectionOptions.getRetry()));
        asyncSender = new ServiceBusSenderAsyncClient(ENTITY_NAME, connectionProcessor, retryOptions,
            tracerProvider, messageSerializer);
        sender = new ServiceBusSenderClient(asyncSender, retryOptions.getTryTimeout());

    }

    @AfterEach
    void teardown() {
        Mockito.framework().clearInlineMocks();
        sendLink = null;
        connection = null;
        singleMessageCaptor = null;
        messagesCaptor = null;
        asyncSender.close();
        sender.close();;
    }

    @Test
    void verifyProperties() {
        Assertions.assertEquals(ENTITY_NAME, sender.getEntityName());
        Assertions.assertEquals(NAMESPACE, sender.getFullyQualifiedNamespace());
    }

    /**
     * Verifies that an exception is thrown when we create a batch with null options.
     */
    @Test
    void createBatchNull() {
        Assertions.assertThrows(NullPointerException.class, () -> sender.createBatch(null));
    }

    /**
     * Verifies that the default batch is the same size as the message link.
     */
    @Test
    void createBatchDefault() {
        // Arrange
        when(connection.createSendLink(eq(ENTITY_NAME), eq(ENTITY_NAME), any(AmqpRetryOptions.class)))
            .thenReturn(Mono.just(sendLink));
        when(sendLink.getLinkSize()).thenReturn(Mono.just(MAX_MESSAGE_LENGTH_BYTES));

        //Act
        ServiceBusMessageBatch batchMessage = sender.createBatch();

        //Assert
        Assertions.assertEquals(MAX_MESSAGE_LENGTH_BYTES, batchMessage.getMaxSizeInBytes());
        Assertions.assertEquals(0, batchMessage.getCount());

        verify(sendLink, times(1)).getLinkSize();
    }

    /**
     * Verifies we cannot create a batch if the options size is larger than the link.
     */
    @Test
    void createBatchWhenSizeTooBigThanOnSendLink() {
        // Arrange
        int maxLinkSize = 1024;
        int batchSize = maxLinkSize + 10;

        final AmqpSendLink link = mock(AmqpSendLink.class);
        when(link.getLinkSize()).thenReturn(Mono.just(maxLinkSize));

        when(connection.createSendLink(eq(ENTITY_NAME), eq(ENTITY_NAME), eq(retryOptions)))
            .thenReturn(Mono.just(link));

        // This event is 1024 bytes when serialized.
        final CreateBatchOptions options = new CreateBatchOptions().setMaximumSizeInBytes(batchSize);

        // Act & Assert
        try {
            sender.createBatch(options);
            Assertions.fail("Should not have created batch because batchSize is bigger than the size on SenderLink.");
        } catch (Exception ex) {
            Assertions.assertTrue(ex instanceof IllegalArgumentException);
        }
    }

    /**
     * Verifies that the producer can create a batch with a given {@link CreateBatchOptions#getMaximumSizeInBytes()}.
     */
    @Test
    void createsMessageBatchWithSize() {
        // Arrange
        int maxLinkSize = 10000;
        int batchSize = 1024;

        // Overhead when serializing an event, to figure out what the maximum size we can use for an event payload.
        int eventOverhead = 46;
        int maxEventPayload = batchSize - eventOverhead;

        final AmqpSendLink link = mock(AmqpSendLink.class);
        when(link.getLinkSize()).thenReturn(Mono.just(maxLinkSize));

        // EC is the prefix they use when creating a link that sends to the service round-robin.
        when(connection.createSendLink(eq(ENTITY_NAME), eq(ENTITY_NAME), eq(retryOptions)))
            .thenReturn(Mono.just(link));

        // This is 1024 bytes when serialized.
        final ServiceBusMessage message = new ServiceBusMessage(new byte[maxEventPayload]);

        final ServiceBusMessage tooLargeMessage = new ServiceBusMessage(new byte[maxEventPayload + 1]);
        final CreateBatchOptions options = new CreateBatchOptions().setMaximumSizeInBytes(batchSize);

        // Act & Assert
        ServiceBusMessageBatch messageBatch = sender.createBatch(options);

        Assertions.assertEquals(batchSize, messageBatch.getMaxSizeInBytes());
        Assertions.assertTrue(messageBatch.tryAdd(message));
        Assertions.assertFalse(messageBatch.tryAdd(tooLargeMessage));

        verify(link, times(1)).getLinkSize();
    }

    /**
     * Verifies that sending multiple message will result in calling sender.send(MessageBatch).
     */
    @Test
    void sendMultipleMessages() {
        // Arrange
        final int count = 4;
        final byte[] contents = TEST_CONTENTS.getBytes(UTF_8);
        final ServiceBusMessageBatch batch = new ServiceBusMessageBatch(256 * 1024,
            errorContextProvider, tracerProvider, serializer);

        IntStream.range(0, count).forEach(index -> {
            final ServiceBusMessage message = new ServiceBusMessage(contents);
            Assertions.assertTrue(batch.tryAdd(message));
        });

        when(connection.createSendLink(eq(ENTITY_NAME), eq(ENTITY_NAME), eq(retryOptions)))
            .thenReturn(Mono.just(sendLink));
        when(sendLink.send(any(Message.class))).thenReturn(Mono.empty());
        when(sendLink.send(anyList())).thenReturn(Mono.empty());

        // Act
        sender.send(batch);

        // Assert
        verify(sendLink).send(messagesCaptor.capture());

        final List<org.apache.qpid.proton.message.Message> messagesSent = messagesCaptor.getValue();
        Assertions.assertEquals(count, messagesSent.size());

        messagesSent.forEach(message -> Assertions.assertEquals(Section.SectionType.Data, message.getBody().getType()));
    }

    /**
     * Verifies that sending a single message will result in calling sender.send(Message).
     */
    @Test
    void sendSingleMessage() {
        // Arrange
        final ServiceBusMessage testData =
            new ServiceBusMessage(TEST_CONTENTS.getBytes(UTF_8));

        // EC is the prefix they use when creating a link that sends to the service round-robin.
        when(connection.createSendLink(eq(ENTITY_NAME), eq(ENTITY_NAME), eq(retryOptions)))
            .thenReturn(Mono.just(sendLink));

        when(sendLink.getLinkSize()).thenReturn(Mono.just(MAX_MESSAGE_LENGTH_BYTES));
        when(sendLink.send(any(org.apache.qpid.proton.message.Message.class))).thenReturn(Mono.empty());

        // Act
        sender.send(testData);

        // Assert
        verify(sendLink, times(1)).send(any(org.apache.qpid.proton.message.Message.class));
        verify(sendLink).send(singleMessageCaptor.capture());

        final Message message = singleMessageCaptor.getValue();
        Assertions.assertEquals(Section.SectionType.Data, message.getBody().getType());
    }
}
