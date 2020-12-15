// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.models.EntityStatus;
import com.azure.resourcemanager.servicebus.generated.models.MessageCountDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** Description of topic resource. */
@JsonFlatten
@Fluent
public class SBTopicInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SBTopicInner.class);

    /*
     * Size of the topic, in bytes.
     */
    @JsonProperty(value = "properties.sizeInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long sizeInBytes;

    /*
     * Exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Last time the message was sent, or a request was received, for this
     * topic.
     */
    @JsonProperty(value = "properties.accessedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime accessedAt;

    /*
     * Number of subscriptions.
     */
    @JsonProperty(value = "properties.subscriptionCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer subscriptionCount;

    /*
     * Message count details
     */
    @JsonProperty(value = "properties.countDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MessageCountDetails countDetails;

    /*
     * ISO 8601 Default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent
     * to Service Bus. This is the default value used when TimeToLive is not
     * set on a message itself.
     */
    @JsonProperty(value = "properties.defaultMessageTimeToLive")
    private Duration defaultMessageTimeToLive;

    /*
     * Maximum size of the topic in megabytes, which is the size of the memory
     * allocated for the topic. Default is 1024.
     */
    @JsonProperty(value = "properties.maxSizeInMegabytes")
    private Integer maxSizeInMegabytes;

    /*
     * Value indicating if this topic requires duplicate detection.
     */
    @JsonProperty(value = "properties.requiresDuplicateDetection")
    private Boolean requiresDuplicateDetection;

    /*
     * ISO8601 timespan structure that defines the duration of the duplicate
     * detection history. The default value is 10 minutes.
     */
    @JsonProperty(value = "properties.duplicateDetectionHistoryTimeWindow")
    private Duration duplicateDetectionHistoryTimeWindow;

    /*
     * Value that indicates whether server-side batched operations are enabled.
     */
    @JsonProperty(value = "properties.enableBatchedOperations")
    private Boolean enableBatchedOperations;

    /*
     * Enumerates the possible values for the status of a messaging entity.
     */
    @JsonProperty(value = "properties.status")
    private EntityStatus status;

    /*
     * Value that indicates whether the topic supports ordering.
     */
    @JsonProperty(value = "properties.supportOrdering")
    private Boolean supportOrdering;

    /*
     * ISO 8601 timespan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     */
    @JsonProperty(value = "properties.autoDeleteOnIdle")
    private Duration autoDeleteOnIdle;

    /*
     * Value that indicates whether the topic to be partitioned across multiple
     * message brokers is enabled.
     */
    @JsonProperty(value = "properties.enablePartitioning")
    private Boolean enablePartitioning;

    /*
     * Value that indicates whether Express Entities are enabled. An express
     * topic holds a message in memory temporarily before writing it to
     * persistent storage.
     */
    @JsonProperty(value = "properties.enableExpress")
    private Boolean enableExpress;

    /**
     * Get the sizeInBytes property: Size of the topic, in bytes.
     *
     * @return the sizeInBytes value.
     */
    public Long sizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Get the createdAt property: Exact time the message was created.
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
     * Get the accessedAt property: Last time the message was sent, or a request was received, for this topic.
     *
     * @return the accessedAt value.
     */
    public OffsetDateTime accessedAt() {
        return this.accessedAt;
    }

    /**
     * Get the subscriptionCount property: Number of subscriptions.
     *
     * @return the subscriptionCount value.
     */
    public Integer subscriptionCount() {
        return this.subscriptionCount;
    }

    /**
     * Get the countDetails property: Message count details.
     *
     * @return the countDetails value.
     */
    public MessageCountDetails countDetails() {
        return this.countDetails;
    }

    /**
     * Get the defaultMessageTimeToLive property: ISO 8601 Default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value.
     */
    public Duration defaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set the defaultMessageTimeToLive property: ISO 8601 Default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set.
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withDefaultMessageTimeToLive(Duration defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get the maxSizeInMegabytes property: Maximum size of the topic in megabytes, which is the size of the memory
     * allocated for the topic. Default is 1024.
     *
     * @return the maxSizeInMegabytes value.
     */
    public Integer maxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }

    /**
     * Set the maxSizeInMegabytes property: Maximum size of the topic in megabytes, which is the size of the memory
     * allocated for the topic. Default is 1024.
     *
     * @param maxSizeInMegabytes the maxSizeInMegabytes value to set.
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withMaxSizeInMegabytes(Integer maxSizeInMegabytes) {
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        return this;
    }

    /**
     * Get the requiresDuplicateDetection property: Value indicating if this topic requires duplicate detection.
     *
     * @return the requiresDuplicateDetection value.
     */
    public Boolean requiresDuplicateDetection() {
        return this.requiresDuplicateDetection;
    }

    /**
     * Set the requiresDuplicateDetection property: Value indicating if this topic requires duplicate detection.
     *
     * @param requiresDuplicateDetection the requiresDuplicateDetection value to set.
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        return this;
    }

    /**
     * Get the duplicateDetectionHistoryTimeWindow property: ISO8601 timespan structure that defines the duration of the
     * duplicate detection history. The default value is 10 minutes.
     *
     * @return the duplicateDetectionHistoryTimeWindow value.
     */
    public Duration duplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Set the duplicateDetectionHistoryTimeWindow property: ISO8601 timespan structure that defines the duration of the
     * duplicate detection history. The default value is 10 minutes.
     *
     * @param duplicateDetectionHistoryTimeWindow the duplicateDetectionHistoryTimeWindow value to set.
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withDuplicateDetectionHistoryTimeWindow(Duration duplicateDetectionHistoryTimeWindow) {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        return this;
    }

    /**
     * Get the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @return the enableBatchedOperations value.
     */
    public Boolean enableBatchedOperations() {
        return this.enableBatchedOperations;
    }

    /**
     * Set the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set.
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get the status property: Enumerates the possible values for the status of a messaging entity.
     *
     * @return the status value.
     */
    public EntityStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Enumerates the possible values for the status of a messaging entity.
     *
     * @param status the status value to set.
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the supportOrdering property: Value that indicates whether the topic supports ordering.
     *
     * @return the supportOrdering value.
     */
    public Boolean supportOrdering() {
        return this.supportOrdering;
    }

    /**
     * Set the supportOrdering property: Value that indicates whether the topic supports ordering.
     *
     * @param supportOrdering the supportOrdering value to set.
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withSupportOrdering(Boolean supportOrdering) {
        this.supportOrdering = supportOrdering;
        return this;
    }

    /**
     * Get the autoDeleteOnIdle property: ISO 8601 timespan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value.
     */
    public Duration autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set the autoDeleteOnIdle property: ISO 8601 timespan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set.
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withAutoDeleteOnIdle(Duration autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get the enablePartitioning property: Value that indicates whether the topic to be partitioned across multiple
     * message brokers is enabled.
     *
     * @return the enablePartitioning value.
     */
    public Boolean enablePartitioning() {
        return this.enablePartitioning;
    }

    /**
     * Set the enablePartitioning property: Value that indicates whether the topic to be partitioned across multiple
     * message brokers is enabled.
     *
     * @param enablePartitioning the enablePartitioning value to set.
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withEnablePartitioning(Boolean enablePartitioning) {
        this.enablePartitioning = enablePartitioning;
        return this;
    }

    /**
     * Get the enableExpress property: Value that indicates whether Express Entities are enabled. An express topic holds
     * a message in memory temporarily before writing it to persistent storage.
     *
     * @return the enableExpress value.
     */
    public Boolean enableExpress() {
        return this.enableExpress;
    }

    /**
     * Set the enableExpress property: Value that indicates whether Express Entities are enabled. An express topic holds
     * a message in memory temporarily before writing it to persistent storage.
     *
     * @param enableExpress the enableExpress value to set.
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withEnableExpress(Boolean enableExpress) {
        this.enableExpress = enableExpress;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (countDetails() != null) {
            countDetails().validate();
        }
    }
}
