// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.eventhubs.implementation;

import com.azure.core.amqp.AmqpLink;
import com.azure.core.amqp.AmqpSession;
import com.azure.core.amqp.Retry;
import com.azure.eventhubs.EventHubConsumer;
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
public interface EventHubSession extends AmqpSession {
    /**
     * Creates a new AMQP receiver link.
     *
     * @param linkName Name of the sender link.
     * @param entityPath The entity path this link connects to receive events.
     * @param eventPositionExpression The position within the partition where the receiver should begin reading events.
     * @param timeout Timeout required for creating and opening AMQP link.
     * @param retry The retry policy to use when receiving messages.
     * @param keepPartitionInformationUpdated {@code true} to keep {@link EventHubConsumer#partitionInformation()}
     *         updated as each event is received.
     * @param receiverPriority {@code null} if multiple {@link EventHubConsumer EventHubConsumers} can listen to the
     *         same partition and consumer group. Otherwise, the {@code receiverPriority} that is the highest will
     *         listen to that partition exclusively.
     * @param receiverIdentifier Identifier for the receiver that is sent to the service.
     * @return A newly created AMQP link.
     */
    Mono<AmqpLink> createReceiver(String linkName, String entityPath, String eventPositionExpression, Duration timeout,
                                  Retry retry, Long receiverPriority, boolean keepPartitionInformationUpdated,
                                  String receiverIdentifier);
}
