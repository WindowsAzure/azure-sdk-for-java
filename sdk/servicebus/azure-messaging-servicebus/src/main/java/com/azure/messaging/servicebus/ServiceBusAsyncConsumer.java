// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.implementation.ServiceBusReceiveLinkProcessor;
import reactor.core.publisher.EmitterProcessor;
import reactor.core.publisher.Flux;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * A package-private consumer responsible for reading {@link Message} from a specific Service Bus.
 */
class ServiceBusAsyncConsumer implements AutoCloseable {
    private final ClientLogger logger = new ClientLogger(ServiceBusAsyncConsumer.class);
    private final AtomicBoolean isDisposed = new AtomicBoolean();
    private final ServiceBusReceiveLinkProcessor amqpReceiveLinkProcessor;
    private final MessageSerializer messageSerializer;
    private final String fullyQualifiedNamespace;
    private final String queueName;
    private final String partitionId;
    private final EmitterProcessor<Message> emitterProcessor;

    private volatile Long currentOffset;

    ServiceBusAsyncConsumer(ServiceBusReceiveLinkProcessor amqpReceiveLinkProcessor,
                            MessageSerializer messageSerializer, String fullyQualifiedNamespace, String queueName,
                            String partitionId) {
        this.amqpReceiveLinkProcessor = amqpReceiveLinkProcessor;
        this.messageSerializer = messageSerializer;
        this.fullyQualifiedNamespace = fullyQualifiedNamespace;
        this.queueName = queueName;
        this.partitionId = partitionId;


        this.emitterProcessor = amqpReceiveLinkProcessor
            .map(message -> onMessageReceived(message))
            .subscribeWith(EmitterProcessor.create(false));
    }

    /**
     * Disposes of the consumer by closing the underlying connection to the service.
     */
    @Override
    public void close() {
        if (!isDisposed.getAndSet(true)) {
            emitterProcessor.onComplete();
            amqpReceiveLinkProcessor.cancel();
        }
    }

    /**
     * Begin consuming events until there are no longer any subscribers.
     *
     * @return A stream of events received from the partition.
     */
    Flux<Message> receive() {
        return emitterProcessor;
    }

    /**
     * On each message received from the service, it will try to:
     * <ol>
     * <li>Deserialize the message into an {@link Message}.</li>
     * </ol>
     *
     * @param message AMQP message to deserialize.
     *
     * @return The deserialized {@link Message} with partition information.
     */
    private Message onMessageReceived(org.apache.qpid.proton.message.Message message) {
        final Message event = messageSerializer.deserialize(message, Message.class);
        Message.SystemProperties systemProperties = new Message.SystemProperties(event.getSystemProperties());
        return new Message(event.getBody(), systemProperties, Context.NONE);
    }
}
