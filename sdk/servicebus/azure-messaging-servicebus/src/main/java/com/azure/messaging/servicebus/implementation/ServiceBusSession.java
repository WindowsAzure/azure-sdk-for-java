package com.azure.messaging.servicebus.implementation;

import com.azure.core.amqp.AmqpLink;
import com.azure.core.amqp.AmqpRetryPolicy;
import com.azure.core.amqp.AmqpSession;
import com.azure.core.amqp.implementation.AmqpReceiveLink;
import com.azure.core.amqp.implementation.ReactorSession;
import com.azure.core.amqp.models.ReceiveOptions;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * Represents an AMQP session that supports vendor specific properties and capabilities. For example, creating a
 * receiver that exclusively listens to a partition + consumer group combination, or getting snapshots of partition
 * information.
 *
 * @see AmqpSession
 * @see ReactorSession
 */

public interface ServiceBusSession extends AmqpSession {
    /**
     * Creates a new AMQP link that consumes events from the message broker.
     *
     * @param linkName Name of the link.
     * @param entityPath The entity path this link connects to, so that it may read events from the message broker.
     * @param timeout Timeout required for creating and opening an AMQP link.
     * @param retryPolicy The retry policy to use when consuming messages.
     * @param options  The {@link ReceiveOptions} for the messages to be received.
     *
     * @return A newly created AMQP link.
     */
    Mono<AmqpReceiveLink> createConsumer(String linkName, String entityPath, Duration timeout, AmqpRetryPolicy retryPolicy, ReceiveOptions options);
}
