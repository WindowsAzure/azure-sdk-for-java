// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.models.CaptureDescription;
import com.azure.resourcemanager.eventhubs.models.EntityStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The Eventhub model. */
@JsonFlatten
@Fluent
public class EventhubInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventhubInner.class);

    /*
     * Current number of shards on the Event Hub.
     */
    @JsonProperty(value = "properties.partitionIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> partitionIds;

    /*
     * Exact time the Event Hub was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Number of days to retain the events for this Event Hub, value should be
     * 1 to 7 days
     */
    @JsonProperty(value = "properties.messageRetentionInDays")
    private Long messageRetentionInDays;

    /*
     * Number of partitions created for the Event Hub, allowed values are from
     * 1 to 32 partitions.
     */
    @JsonProperty(value = "properties.partitionCount")
    private Long partitionCount;

    /*
     * Enumerates the possible values for the status of the Event Hub.
     */
    @JsonProperty(value = "properties.status")
    private EntityStatus status;

    /*
     * Properties of capture description
     */
    @JsonProperty(value = "properties.captureDescription")
    private CaptureDescription captureDescription;

    /**
     * Get the partitionIds property: Current number of shards on the Event Hub.
     *
     * @return the partitionIds value.
     */
    public List<String> partitionIds() {
        return this.partitionIds;
    }

    /**
     * Get the createdAt property: Exact time the Event Hub was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The exact time the message was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the messageRetentionInDays property: Number of days to retain the events for this Event Hub, value should be
     * 1 to 7 days.
     *
     * @return the messageRetentionInDays value.
     */
    public Long messageRetentionInDays() {
        return this.messageRetentionInDays;
    }

    /**
     * Set the messageRetentionInDays property: Number of days to retain the events for this Event Hub, value should be
     * 1 to 7 days.
     *
     * @param messageRetentionInDays the messageRetentionInDays value to set.
     * @return the EventhubInner object itself.
     */
    public EventhubInner withMessageRetentionInDays(Long messageRetentionInDays) {
        this.messageRetentionInDays = messageRetentionInDays;
        return this;
    }

    /**
     * Get the partitionCount property: Number of partitions created for the Event Hub, allowed values are from 1 to 32
     * partitions.
     *
     * @return the partitionCount value.
     */
    public Long partitionCount() {
        return this.partitionCount;
    }

    /**
     * Set the partitionCount property: Number of partitions created for the Event Hub, allowed values are from 1 to 32
     * partitions.
     *
     * @param partitionCount the partitionCount value to set.
     * @return the EventhubInner object itself.
     */
    public EventhubInner withPartitionCount(Long partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * Get the status property: Enumerates the possible values for the status of the Event Hub.
     *
     * @return the status value.
     */
    public EntityStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Enumerates the possible values for the status of the Event Hub.
     *
     * @param status the status value to set.
     * @return the EventhubInner object itself.
     */
    public EventhubInner withStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the captureDescription property: Properties of capture description.
     *
     * @return the captureDescription value.
     */
    public CaptureDescription captureDescription() {
        return this.captureDescription;
    }

    /**
     * Set the captureDescription property: Properties of capture description.
     *
     * @param captureDescription the captureDescription value to set.
     * @return the EventhubInner object itself.
     */
    public EventhubInner withCaptureDescription(CaptureDescription captureDescription) {
        this.captureDescription = captureDescription;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (captureDescription() != null) {
            captureDescription().validate();
        }
    }
}
