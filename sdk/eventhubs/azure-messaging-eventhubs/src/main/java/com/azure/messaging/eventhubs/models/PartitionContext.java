// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs.models;

import com.azure.core.annotation.Immutable;
import com.azure.messaging.eventhubs.CheckpointStore;
import com.azure.messaging.eventhubs.EventData;
import com.azure.messaging.eventhubs.EventProcessorClient;
import com.azure.messaging.eventhubs.implementation.PartitionProcessor;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import reactor.core.publisher.Mono;

/**
 * A model class to contain partition information that will be provided to each instance of {@link PartitionProcessor}.
 */
@Immutable
public class PartitionContext {

    private final String fullyQualifiedNamespace;
    private final String partitionId;
    private final String eventHubName;
    private final String consumerGroup;
    private final LastEnqueuedEventProperties lastEnqueuedEventProperties;
    private final String ownerId;
    private final AtomicReference<String> eTag;
    private final CheckpointStore checkpointStore;

    /**
     * Creates an instance of PartitionContext that contains partition information available to each {@link
     * PartitionProcessor}.
     *
     * @param fullyQualifiedNamespace The fully qualified namespace of the Event Hub.
     * @param partitionId The partition id of the partition processed by the {@link PartitionProcessor}.
     * @param eventHubName The Event Hub name associated with the {@link EventProcessorClient}.
     * @param consumerGroup The consumer group name associated with the {@link EventProcessorClient}.
     * @param ownerId The unique identifier of the {@link EventProcessorClient} instance.
     * @param eTag The last known ETag stored in {@link CheckpointStore} for this partition.
     * @param checkpointStore A {@link CheckpointStore} implementation to read and update partition ownership and
     * checkpoint information.
     * @throws NullPointerException if {@code partitionId} or {@code eventHubName} or {@code consumerGroup} or {@code
     * ownerId} or {@code eTag} or {@code checkpointStore} is {@code null}.
     */
    public PartitionContext(String fullyQualifiedNamespace, String partitionId, String eventHubName,
        String consumerGroup, String ownerId, String eTag, CheckpointStore checkpointStore) {
        this.fullyQualifiedNamespace = Objects
            .requireNonNull(fullyQualifiedNamespace, "fullyQualifiedNamespace cannot be null");
        this.partitionId = Objects.requireNonNull(partitionId, "partitionId cannot be null.");
        this.eventHubName = Objects.requireNonNull(eventHubName, "eventHubName cannot be null.");
        this.consumerGroup = Objects.requireNonNull(consumerGroup, "consumerGroup cannot be null.");
        this.ownerId = Objects.requireNonNull(ownerId, "ownerId cannot be null.");
        this.eTag = new AtomicReference<>(eTag);
        this.checkpointStore = Objects.requireNonNull(checkpointStore, "checkpointStore cannot be null.");
        this.lastEnqueuedEventProperties = null;
    }

    /**
     * Creates an instance of PartitionContext that contains partition information available for each event.
     *
     * @param fullyQualifiedNamespace The fully qualified namespace of the Event Hub.
     * @param partitionId The partition id of the partition.
     * @param eventHubName The Event Hub name that the event originated from.
     * @param consumerGroup The consumer group name the event originated from.
     * @param lastEnqueuedEventProperties Set of information about the last enqueued event of a partition.
     */
    public PartitionContext(String fullyQualifiedNamespace, String partitionId, String eventHubName,
        String consumerGroup, LastEnqueuedEventProperties lastEnqueuedEventProperties) {
        this.fullyQualifiedNamespace = Objects
            .requireNonNull(fullyQualifiedNamespace, "fullyQualifiedNamespace cannot be null");
        this.partitionId = Objects.requireNonNull(partitionId, "partitionId cannot be null.");
        this.eventHubName = Objects.requireNonNull(eventHubName, "eventHubName cannot be null.");
        this.consumerGroup = Objects.requireNonNull(consumerGroup, "consumerGroup cannot be null.");
        this.lastEnqueuedEventProperties = lastEnqueuedEventProperties;
        this.ownerId = null;
        this.eTag = new AtomicReference<>();
        this.checkpointStore = null;
    }

    /**
     * Returns the fully qualified namespace of the Event Hub.
     *
     * @return the fully qualified namespace of the Event Hub.
     */
    public String getFullyQualifiedNamespace() {
        return fullyQualifiedNamespace;
    }

    /**
     * Gets the partition id associated to an instance of {@link PartitionProcessor}.
     *
     * @return The partition id associated to an instance of {@link PartitionProcessor}.
     */
    public String getPartitionId() {
        return partitionId;
    }

    /**
     * Gets the Event Hub name associated to an instance of {@link PartitionProcessor}.
     *
     * @return The Event Hub name associated to an instance of {@link PartitionProcessor}.
     */
    public String getEventHubName() {
        return eventHubName;
    }

    /**
     * Gets the consumer group name associated to an instance of {@link PartitionProcessor}.
     *
     * @return The consumer group name associated to an instance of {@link PartitionProcessor}.
     */
    public String getConsumerGroup() {
        return consumerGroup;
    }

    /**
     * A set of information about the last enqueued event of a partition, as observed by the consumer as events are
     * received from the Event Hubs service.
     *
     * @return {@code null} if {@link ReceiveOptions#getTrackLastEnqueuedEventProperties()} was not set when
     * creating the consumer. Otherwise, the properties describing the most recently enqueued event in the partition.
     */
    public LastEnqueuedEventProperties getLastEnqueuedEventProperties() {
        return lastEnqueuedEventProperties;
    }

    /**
     * Updates the checkpoint for this partition using the event data. This will serve as the last known successfully
     * processed event in this partition if the update is successful.
     *
     * @param eventData The event data to use for updating the checkpoint.
     * @return a representation of deferred execution of this call.
     */
    public Mono<Void> updateCheckpoint(EventData eventData) {
        String previousETag = this.eTag.get();
        Checkpoint checkpoint = new Checkpoint()
            .setConsumerGroup(consumerGroup)
            .setEventHubName(eventHubName)
            .setOwnerId(ownerId)
            .setPartitionId(partitionId)
            .setSequenceNumber(eventData.getSequenceNumber())
            .setOffset(eventData.getOffset())
            .setETag(previousETag);
        return this.checkpointStore.updateCheckpoint(checkpoint)
            .map(eTag -> this.eTag.compareAndSet(previousETag, eTag))
            .then();
    }

    /**
     * Updates a checkpoint using the given offset and sequence number. This will serve as the last known successfully
     * processed event in this partition if the update is successful.
     *
     * @param sequenceNumber The sequence number to update the checkpoint.
     * @param offset The offset to update the checkpoint.
     * @return a representation of deferred execution of this call.
     */
    public Mono<Void> updateCheckpoint(long sequenceNumber, Long offset) {
        String previousETag = this.eTag.get();
        Checkpoint checkpoint = new Checkpoint()
            .setConsumerGroup(consumerGroup)
            .setEventHubName(eventHubName)
            .setOwnerId(ownerId)
            .setPartitionId(partitionId)
            .setSequenceNumber(sequenceNumber)
            .setOffset(offset)
            .setETag(previousETag);

        return this.checkpointStore.updateCheckpoint(checkpoint)
            .map(eTag -> this.eTag.compareAndSet(previousETag, eTag))
            .then();
    }
}
