// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.messaging.eventhubs.implementation.PartitionProcessor;

/**
 * A model class to hold checkpoint data. A checkpoint represents the last successfully processed event by a {@link
 * PartitionProcessor} for a particular partition of an Event Hub.
 */
@Fluent
public class Checkpoint {

    private String fullyQualifiedNamespace;
    private String eventHubName;
    private String consumerGroup;
    private String ownerId;
    private String partitionId;
    private Long offset;
    private Long sequenceNumber;
    private String eTag;

    /**
     * Returns the fully qualified namespace of the Event Hub.
     *
     * @return the fully qualified namespace of the Event Hub.
     */
    public String getFullyQualifiedNamespace() {
        return fullyQualifiedNamespace;
    }

    /**
     * Sets the fully qualified namespace of the Event Hub.
     *
     * @param fullyQualifiedNamespace the fully qualified namespace of the Event Hub.
     */
    public void setFullyQualifiedNamespace(final String fullyQualifiedNamespace) {
        this.fullyQualifiedNamespace = fullyQualifiedNamespace;
    }

    /**
     * Gets the Event Hub name associated with this checkpoint.
     *
     * @return The Event Hub name associated with this checkpoint.
     */
    public String getEventHubName() {
        return eventHubName;
    }

    /**
     * Sets the Event Hub name associated with this checkpoint.
     *
     * @param eventHubName The Event Hub name associated with this checkpoint.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint setEventHubName(String eventHubName) {
        this.eventHubName = eventHubName;
        return this;
    }

    /**
     * Gets the consumer group name associated with this checkpoint.
     *
     * @return The consumer group name associated with this checkpoint.
     */
    public String getConsumerGroup() {
        return consumerGroup;
    }

    /**
     * Sets the consumer group name associated with this checkpoint.
     *
     * @param consumerGroup The consumer group name associated with this checkpoint.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }

    /**
     * Gets the partition id associated with this checkpoint.
     *
     * @return The partition id associated with this checkpoint.
     */
    public String getPartitionId() {
        return partitionId;
    }

    /**
     * Sets the partition id associated with this checkpoint.
     *
     * @param partitionId The partition id associated with this checkpoint.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint setPartitionId(String partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Sets the unique event processor identifier that created this checkpoint.
     *
     * @return The unique event processor identifier that created this checkpoint.
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Gets the unique event processor identifier that created this checkpoint.
     *
     * @param ownerId The unique event processor identifier that created this checkpoint.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Gets the offset of the last successfully processed event to store as checkpoint.
     *
     * @return The offset of the last successfully processed event to store as checkpoint.
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * Sets the offset of the last successfully processed event to store as checkpoint.
     *
     * @param offset The offset of the last successfully processed event to store as checkpoint.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint setOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Gets the sequence number of the last successfully processed event to store as checkpoint.
     *
     * @return The sequence number of the last successfully processed event to store as checkpoint.
     */
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the sequence number of the last successfully processed event to store as checkpoint.
     *
     * @param sequenceNumber The sequence number of the last successfully processed event to store as checkpoint.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * Gets the ETag that will be used to verify before updating the checkpoint.
     *
     * @return The unique identifier that was generated by last known successful update.
     */
    public String getETag() {
        return eTag;
    }

    /**
     * Sets the ETag that will be used by the checkpoint store to verify before updating the checkpoint. If the ETag in
     * store does not match with this ETag, the checkpoint update is expected to fail.
     *
     * @param eTag The unique identifier that was generated by last known successful update.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }
}
