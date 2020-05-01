// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.implementation;

import com.azure.core.amqp.implementation.AmqpReceiveLink;
import org.apache.qpid.proton.amqp.transport.DeliveryState;
import reactor.core.publisher.Mono;

import java.time.Instant;

/**
 * Represents an AMQP receive link.
 */
public interface ServiceBusReceiveLink extends AmqpReceiveLink {
    /**
     * Updates the disposition status of a message with corresponding lock token.
     *
     * @param lockToken Lock token of message.
     * @param deliveryState Delivery state of message.
     * @return A Mono that completes when the state is successfully updated and acknowledged by message broker.
     */
    Mono<Void> updateDisposition(String lockToken, DeliveryState deliveryState);

    /**
     * Gets the session id associated with the link.
     *
     * @return The session id associated with the link or an empty mono if this is not a session link.
     */
    Mono<String> getSessionId();

    /**
     * Gets the {@link Instant} the session is locked until.
     *
     * @return The {@link Instant} the session is locked until or an empty Mono if this is not a session link.
     */
    Mono<Instant> getSessionLockedUntil();
}
