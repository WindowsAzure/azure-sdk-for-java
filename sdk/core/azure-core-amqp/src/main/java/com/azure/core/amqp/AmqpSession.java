// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp;

import reactor.core.publisher.Mono;

import java.io.Closeable;
import java.time.Duration;

/**
 * An AMQP session representing bidirectional communication that supports multiple {@link AmqpLink AMQP links}.
 */
public interface AmqpSession extends EndpointStateNotifier, Closeable {
    /**
     * Gets the name for this AMQP session.
     *
     * @return The name for the AMQP session.
     */
    String getSessionName();

    /**
     * Gets the operation timeout for starting the AMQP session.
     *
     * @return The timeout for starting the AMQP session.
     */
    Duration getOperationTimeout();

    /**
     * Creates a new AMQP link that publishes events to the message broker.
     *
     * @param linkName Name of the link.
     * @param entityPath The entity path this link connects to when producing events.
     * @param timeout Timeout required for creating and opening AMQP link.
     * @param retry The retry policy to use when sending messages.
     * @return A newly created AMQP link.
     */
    Mono<AmqpLink> createProducer(String linkName, String entityPath, Duration timeout, RetryPolicy retry);

    /**
     * Creates a new AMQP link that consumes events from the message broker.
     *
     * @param linkName Name of the link.
     * @param entityPath The entity path this link connects to, so that it may read events from the message broker.
     * @param timeout Timeout required for creating and opening an AMQP link.
     * @param retry The retry policy to use when consuming messages.
     * @return A newly created AMQP link.
     */
    Mono<AmqpLink> createConsumer(String linkName, String entityPath, Duration timeout, RetryPolicy retry);

    /**
     * Removes an {@link AmqpLink} with the given {@code linkName}.
     *
     * @param linkName Name of the link to remove.
     * @return {@code true} if the link was removed; {@code false} otherwise.
     */
    boolean removeLink(String linkName);
}
