// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.implementation;

import com.azure.messaging.servicebus.ServiceBusReceivedMessage;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/**
 * The management node for fetching metadata about the Service Bus and peek operation.
 */
public interface ServiceBusManagementNode extends AutoCloseable {

    /**
     * This will return next available message to peek.
     * @return {@link Mono} of {@link ServiceBusReceivedMessage}.
     */
    Mono<ServiceBusReceivedMessage> peek();

    /**
     * @param fromSequenceNumber to peek message from.
     * @return {@link Mono} of {@link ServiceBusReceivedMessage}.
     */
    Mono<ServiceBusReceivedMessage> peek(long fromSequenceNumber);

    /**
     * Reads the next batch of active messages without changing the state of the receiver or the message source.
     *
     * @param maxMessages The number of messages.
     * @param fromSequenceNumber The sequence number from where to read the message.
     * @return The {@link Flux} of {@link ServiceBusReceivedMessage} peeked.
     */
    Flux<ServiceBusReceivedMessage> peekBatch(int maxMessages, long fromSequenceNumber);

    /**
     * Reads the next batch of active messages without changing the state of the receiver or the message source.
     * @param maxMessages The number of messages.
     * @return The {@link Flux} of {@link ServiceBusReceivedMessage} peeked.
     */
    Flux<ServiceBusReceivedMessage> peekBatch(int maxMessages);

    @Override
    void close();
}
