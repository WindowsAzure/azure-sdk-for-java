/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.servicebus.MessageCountDetails;
import com.microsoft.azure.management.servicebus.EntityStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Description of topic resource.
 */
@JsonFlatten
public class TopicResourceInner extends Resource {
    /**
     * Last time the message was sent, or a request was received, for this
     * topic.
     */
    @JsonProperty(value = "properties.accessedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime accessedAt;

    /**
     * TimeSpan idle interval after which the topic is automatically deleted.
     * The minimum duration is 5 minutes.
     */
    @JsonProperty(value = "properties.autoDeleteOnIdle")
    private String autoDeleteOnIdle;

    /**
     * Exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The countDetails property.
     */
    @JsonProperty(value = "properties.countDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MessageCountDetails countDetails;

    /**
     * Default message time to live value. This is the duration after which the
     * message expires, starting from when the message is sent to Service Bus.
     * This is the default value used when TimeToLive is not set on a message
     * itself.
     */
    @JsonProperty(value = "properties.defaultMessageTimeToLive")
    private String defaultMessageTimeToLive;

    /**
     * TimeSpan structure that defines the duration of the duplicate detection
     * history. The default value is 10 minutes.
     */
    @JsonProperty(value = "properties.duplicateDetectionHistoryTimeWindow")
    private String duplicateDetectionHistoryTimeWindow;

    /**
     * Value that indicates whether server-side batched operations are enabled.
     */
    @JsonProperty(value = "properties.enableBatchedOperations")
    private Boolean enableBatchedOperations;

    /**
     * Value that indicates whether Express Entities are enabled. An express
     * topic holds a message in memory temporarily before writing it to
     * persistent storage.
     */
    @JsonProperty(value = "properties.enableExpress")
    private Boolean enableExpress;

    /**
     * Value that indicates whether the topic to be partitioned across multiple
     * message brokers is enabled.
     */
    @JsonProperty(value = "properties.enablePartitioning")
    private Boolean enablePartitioning;

    /**
     * Maximum size of the topic in megabytes, which is the size of the memory
     * allocated for the topic.
     */
    @JsonProperty(value = "properties.maxSizeInMegabytes")
    private Long maxSizeInMegabytes;

    /**
     * Value indicating if this topic requires duplicate detection.
     */
    @JsonProperty(value = "properties.requiresDuplicateDetection")
    private Boolean requiresDuplicateDetection;

    /**
     * Size of the topic, in bytes.
     */
    @JsonProperty(value = "properties.sizeInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long sizeInBytes;

    /**
     * Enumerates the possible values for the status of a messaging entity.
     * Possible values include: 'Active', 'Creating', 'Deleting', 'Disabled',
     * 'ReceiveDisabled', 'Renaming', 'Restoring', 'SendDisabled', 'Unknown'.
     */
    @JsonProperty(value = "properties.status")
    private EntityStatus status;

    /**
     * Number of subscriptions.
     */
    @JsonProperty(value = "properties.subscriptionCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer subscriptionCount;

    /**
     * Value that indicates whether the topic supports ordering.
     */
    @JsonProperty(value = "properties.supportOrdering")
    private Boolean supportOrdering;

    /**
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * Get the accessedAt value.
     *
     * @return the accessedAt value
     */
    public DateTime accessedAt() {
        return this.accessedAt;
    }

    /**
     * Get the autoDeleteOnIdle value.
     *
     * @return the autoDeleteOnIdle value
     */
    public String autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set the autoDeleteOnIdle value.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withAutoDeleteOnIdle(String autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get the createdAt value.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the countDetails value.
     *
     * @return the countDetails value
     */
    public MessageCountDetails countDetails() {
        return this.countDetails;
    }

    /**
     * Get the defaultMessageTimeToLive value.
     *
     * @return the defaultMessageTimeToLive value
     */
    public String defaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set the defaultMessageTimeToLive value.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withDefaultMessageTimeToLive(String defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get the duplicateDetectionHistoryTimeWindow value.
     *
     * @return the duplicateDetectionHistoryTimeWindow value
     */
    public String duplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Set the duplicateDetectionHistoryTimeWindow value.
     *
     * @param duplicateDetectionHistoryTimeWindow the duplicateDetectionHistoryTimeWindow value to set
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withDuplicateDetectionHistoryTimeWindow(String duplicateDetectionHistoryTimeWindow) {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        return this;
    }

    /**
     * Get the enableBatchedOperations value.
     *
     * @return the enableBatchedOperations value
     */
    public Boolean enableBatchedOperations() {
        return this.enableBatchedOperations;
    }

    /**
     * Set the enableBatchedOperations value.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get the enableExpress value.
     *
     * @return the enableExpress value
     */
    public Boolean enableExpress() {
        return this.enableExpress;
    }

    /**
     * Set the enableExpress value.
     *
     * @param enableExpress the enableExpress value to set
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withEnableExpress(Boolean enableExpress) {
        this.enableExpress = enableExpress;
        return this;
    }

    /**
     * Get the enablePartitioning value.
     *
     * @return the enablePartitioning value
     */
    public Boolean enablePartitioning() {
        return this.enablePartitioning;
    }

    /**
     * Set the enablePartitioning value.
     *
     * @param enablePartitioning the enablePartitioning value to set
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withEnablePartitioning(Boolean enablePartitioning) {
        this.enablePartitioning = enablePartitioning;
        return this;
    }

    /**
     * Get the maxSizeInMegabytes value.
     *
     * @return the maxSizeInMegabytes value
     */
    public Long maxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }

    /**
     * Set the maxSizeInMegabytes value.
     *
     * @param maxSizeInMegabytes the maxSizeInMegabytes value to set
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withMaxSizeInMegabytes(Long maxSizeInMegabytes) {
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        return this;
    }

    /**
     * Get the requiresDuplicateDetection value.
     *
     * @return the requiresDuplicateDetection value
     */
    public Boolean requiresDuplicateDetection() {
        return this.requiresDuplicateDetection;
    }

    /**
     * Set the requiresDuplicateDetection value.
     *
     * @param requiresDuplicateDetection the requiresDuplicateDetection value to set
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        return this;
    }

    /**
     * Get the sizeInBytes value.
     *
     * @return the sizeInBytes value
     */
    public Long sizeInBytes() {
        return this.sizeInBytes;
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
     * Set the status value.
     *
     * @param status the status value to set
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the subscriptionCount value.
     *
     * @return the subscriptionCount value
     */
    public Integer subscriptionCount() {
        return this.subscriptionCount;
    }

    /**
     * Get the supportOrdering value.
     *
     * @return the supportOrdering value
     */
    public Boolean supportOrdering() {
        return this.supportOrdering;
    }

    /**
     * Set the supportOrdering value.
     *
     * @param supportOrdering the supportOrdering value to set
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withSupportOrdering(Boolean supportOrdering) {
        this.supportOrdering = supportOrdering;
        return this;
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
