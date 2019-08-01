// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs.models;

import com.azure.core.implementation.annotation.Fluent;
import com.azure.messaging.eventhubs.PartitionProcessor;

/**
 * A model class to hold checkpoint data. A checkpoint represents the last successfully processed event by a {@link
 * PartitionProcessor} for a particular partition of an Event Hub.
 */
@Fluent
public class Checkpoint {

    private String eventHubName;
    private String consumerGroupName;
    private String ownerId;
    private String partitionId;
    private String offset;
    private long sequenceNumber;
    private String eTag;

    /**
     * Gets the Event Hub name associated with this checkpoint.
     *
     * @return The Event Hub name associated with this checkpoint.
     */
    public String eventHubName() {
        return eventHubName;
    }

    /**
     * Sets the Event Hub name associated with this checkpoint.
     *
     * @param eventHubName The Event Hub name associated with this checkpoint.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint eventHubName(String eventHubName) {
        this.eventHubName = eventHubName;
        return this;
    }

    /**
     * Gets the consumer group name associated with this checkpoint.
     *
     * @return The consumer group name associated with this checkpoint.
     */
    public String consumerGroupName() {
        return consumerGroupName;
    }

    /**
     * Sets the consumer group name associated with this checkpoint.
     *
     * @param consumerGroupName The consumer group name associated with this checkpoint.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint consumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }

    /**
     * Gets the partition id associated with this checkpoint.
     *
     * @return The partition id associated with this checkpoint.
     */
    public String partitionId() {
        return partitionId;
    }

    /**
     * Sets the partition id associated with this checkpoint.
     *
     * @param partitionId The partition id associated with this checkpoint.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint partitionId(String partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Sets the unique event processor identifier that created this checkpoint.
     *
     * @return The unique event processor identifier that created this checkpoint.
     */
    public String ownerId() {
        return ownerId;
    }

    /**
     * Gets the unique event processor identifier that created this checkpoint.
     *
     * @param ownerId The unique event processor identifier that created this checkpoint.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Gets the offset of the last successfully processed event to store as checkpoint.
     *
     * @return The offset of the last successfully processed event to store as checkpoint.
     */
    public String offset() {
        return offset;
    }

    /**
     * Sets the offset of the last successfully processed event to store as checkpoint.
     *
     * @param offset The offset of the last successfully processed event to store as checkpoint.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint offset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Gets the sequence number of the last successfully processed event to store as checkpoint.
     *
     * @return The sequence number of the last successfully processed event to store as checkpoint.
     */
    public Long sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the sequence number of the last successfully processed event to store as checkpoint.
     *
     * @param sequenceNumber The sequence number of the last successfully processed event to store as checkpoint.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint sequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * TODO: add more details here
     * Gets the ETag.
     *
     * @return The ETag.
     */
    public String eTag() {
        return eTag;
    }

    /**
     * TODO: add more details here
     * Sets the ETag.
     *
     * @param eTag The ETag.
     * @return The updated {@link Checkpoint} instance.
     */
    public Checkpoint eTag(String eTag) {
        this.eTag = eTag;
        return this;
    }
}
