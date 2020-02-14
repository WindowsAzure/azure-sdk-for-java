// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.amqp.AmqpEndpointState;
import com.azure.core.amqp.AmqpMessageConstant;
import com.azure.core.amqp.AmqpShutdownSignal;
import com.azure.core.amqp.implementation.AmqpReceiveLink;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.messaging.ApplicationProperties;
import org.apache.qpid.proton.amqp.messaging.Data;
import org.apache.qpid.proton.amqp.messaging.MessageAnnotations;
import org.apache.qpid.proton.message.Message;
import org.junit.jupiter.api.AfterEach;
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

import reactor.test.StepVerifier;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Supplier;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AsyncReceiverTest {

    private static final Duration OPERATION_TIMEOUT = Duration.ofSeconds(30);
    private static final int NUMBER_OF_EVENTS = 10;

    private static final String PAYLOAD = "hello";
    private static final byte[] PAYLOAD_BYTES = PAYLOAD.getBytes(UTF_8);
    private static final int PREFETCH = 1;

    private final ClientLogger logger = new ClientLogger(AsyncReceiverTest.class);
    private final String messageTrackingUUID = UUID.randomUUID().toString();
    private final DirectProcessor<org.apache.qpid.proton.message.Message> messageProcessor = DirectProcessor.create();
    private final DirectProcessor<Throwable> errorProcessor = DirectProcessor.create();
    private final DirectProcessor<AmqpEndpointState> endpointProcessor = DirectProcessor.create();
    private final DirectProcessor<AmqpShutdownSignal> shutdownProcessor = DirectProcessor.create();
    private final String baseConnectionString = System.getenv("AZURE_SERVICEBUS_CONNECTION_STRING");

    @Mock
    private AmqpReceiveLink amqpReceiveLink;

    @Captor
    private ArgumentCaptor<Supplier<Integer>> creditSupplier;

    private Mono<AmqpReceiveLink> receiveLinkMono;
    private List<org.apache.qpid.proton.message.Message> messages = new ArrayList<>();

    private QueueReceiverAsyncClient consumer;


    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        receiveLinkMono = Mono.fromCallable(() -> amqpReceiveLink);

        when(amqpReceiveLink.receive()).thenReturn(messageProcessor);

        String connectionString = baseConnectionString + ";EntityPath=hemant-test1";

        // Instantiate a client that will be used to call the service.

        consumer = new QueueClientBuilder()
            .connectionString(connectionString)
            .createAsyncReceiverClient(2);
    }

    @AfterEach
    public void teardown() throws IOException {
        messages.clear();
        Mockito.framework().clearInlineMocks();
        consumer.close();
    }

    /**
     * Verifies that this receives a number of events. Verifies that the initial credits we add are equal to the
     * prefetch value.
     */
    @Test
    public void receivesNumberOfEvents() {
        // Arrange
        final int numberOfEvents = 2;

        // Act & Assert
        StepVerifier.create(consumer.receive().take(numberOfEvents))
            .then(() -> sendMessages(numberOfEvents))
            .expectNextCount(numberOfEvents)
            .verifyComplete();

        verify(amqpReceiveLink, times(1)).addCredits(PREFETCH);
    }

    @Test
    public void receivesNumberOfEventsActual() throws Exception {

        // Arrange
        final int numberOfEvents = 1;
        String connectionString = baseConnectionString + ";EntityPath=hemant-test1";

        // Instantiate a client that will be used to call the service.

        consumer = new QueueClientBuilder()
            .connectionString(connectionString)
            .createAsyncReceiverClient(numberOfEvents);
        Thread.sleep(3000);

        consumer.receive()
            .take(2)
            .doOnError(error -> {
                System.out.println("Got error response " + error.toString());
                error.printStackTrace();
            })
            .subscribe(message -> {
                System.out.println("!!!!!! Got message from queue: " + message.getBody().toString());
                try {
                    String converted = new String(message.getBody(), "UTF-8");
                    System.out.println("Got message from queue: " + converted);
                } catch (Exception ee) {
                    ee.printStackTrace();

                }

            });
        Thread.sleep(5000);
    }

    private void sendMessages(int numberOfEvents) {
        // When we start receiving, then send those 10 messages.
        FluxSink<org.apache.qpid.proton.message.Message> sink = messageProcessor.sink();
        for (int i = 0; i < numberOfEvents; i++) {
            sink.next(getMessage(PAYLOAD_BYTES, messageTrackingUUID));
        }
    }


    // System and application properties from the generated test message.
    static final Instant ENQUEUED_TIME = Instant.ofEpochSecond(1561344661);
    static final Long OFFSET = 1534L;
    static final String PARTITION_KEY = "a-partition-key";
    static final Long SEQUENCE_NUMBER = 1025L;
    static final String OTHER_SYSTEM_PROPERTY = "Some-other-system-property";
    static final Boolean OTHER_SYSTEM_PROPERTY_VALUE = Boolean.TRUE;
    static final Map<String, Object> APPLICATION_PROPERTIES = new HashMap<>();
    // An application property key used to identify that the request belongs to a test set.
    static final String MESSAGE_TRACKING_ID = "message-tracking-id";

    static Symbol getSymbol(AmqpMessageConstant messageConstant) {
        return Symbol.getSymbol(messageConstant.getValue());
    }
    /**
     * Creates a mock message with the contents provided.
     */
    static org.apache.qpid.proton.message.Message getMessage(byte[] contents, String messageTrackingValue) {
        final Map<Symbol, Object> systemProperties = new HashMap<>();
        systemProperties.put(getSymbol(AmqpMessageConstant.OFFSET_ANNOTATION_NAME), String.valueOf(OFFSET));
        systemProperties.put(getSymbol(AmqpMessageConstant.PARTITION_KEY_ANNOTATION_NAME), PARTITION_KEY);
        systemProperties.put(getSymbol(AmqpMessageConstant.ENQUEUED_TIME_UTC_ANNOTATION_NAME), Date.from(ENQUEUED_TIME));
        systemProperties.put(getSymbol(AmqpMessageConstant.SEQUENCE_NUMBER_ANNOTATION_NAME), SEQUENCE_NUMBER);
        systemProperties.put(Symbol.getSymbol(OTHER_SYSTEM_PROPERTY), OTHER_SYSTEM_PROPERTY_VALUE);

        final Message message = Proton.message();
        message.setMessageAnnotations(new MessageAnnotations(systemProperties));

        Map<String, Object> applicationProperties = new HashMap<>();
        APPLICATION_PROPERTIES.forEach(applicationProperties::put);

        if (!CoreUtils.isNullOrEmpty(messageTrackingValue)) {
            applicationProperties.put(MESSAGE_TRACKING_ID, messageTrackingValue);
        }

        message.setApplicationProperties(new ApplicationProperties(applicationProperties));
        message.setBody(new Data(new Binary(contents)));

        return message;
    }
}

