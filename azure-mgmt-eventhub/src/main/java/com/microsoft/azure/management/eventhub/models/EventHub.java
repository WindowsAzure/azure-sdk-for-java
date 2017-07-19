/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.eventhub.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Description of the Event Hub resource.
 */
@JsonFlatten
public class EventHub extends Resource {
    /**
     * Exact time the Event Hub was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * Number of days to retain the events for this Event Hub.
     */
    @JsonProperty(value = "properties.messageRetentionInDays")
    private Long messageRetentionInDays;

    /**
     * Number of partitions created for the Event Hub.
     */
    @JsonProperty(value = "properties.partitionCount")
    private Long partitionCount;

    /**
     * Current number of shards on the Event Hub.
     */
    @JsonProperty(value = "properties.partitionIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> partitionIds;

    /**
     * Enumerates the possible values for the status of the Event Hub. Possible
     * values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled',
     * 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private EntityStatus status;

    /**
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * Get the createdAt value.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the messageRetentionInDays value.
     *
     * @return the messageRetentionInDays value
     */
    public Long messageRetentionInDays() {
        return this.messageRetentionInDays;
    }

    /**
     * Set the messageRetentionInDays value.
     *
     * @param messageRetentionInDays the messageRetentionInDays value to set
     * @return the EventHub object itself.
     */
    public EventHub withMessageRetentionInDays(Long messageRetentionInDays) {
        this.messageRetentionInDays = messageRetentionInDays;
        return this;
    }

    /**
     * Get the partitionCount value.
     *
     * @return the partitionCount value
     */
    public Long partitionCount() {
        return this.partitionCount;
    }

    /**
     * Set the partitionCount value.
     *
     * @param partitionCount the partitionCount value to set
     * @return the EventHub object itself.
     */
    public EventHub withPartitionCount(Long partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * Get the partitionIds value.
     *
     * @return the partitionIds value
     */
    public List<String> partitionIds() {
        return this.partitionIds;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public EntityStatus status() {
        return this.status;
    }

    /**
     * Get the updatedAt value.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

}
