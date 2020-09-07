// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The SubscriptionCreateOrUpdateParameters model. */
@JsonFlatten
@Fluent
public class SubscriptionCreateOrUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubscriptionCreateOrUpdateParameters.class);

    /*
     * Subscription data center location.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Resource manager type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Last time there was a receive request to this subscription.
     */
    @JsonProperty(value = "properties.accessedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime accessedAt;

    /*
     * TimeSpan idle interval after which the topic is automatically deleted.
     * The minimum duration is 5 minutes.
     */
    @JsonProperty(value = "properties.autoDeleteOnIdle")
    private String autoDeleteOnIdle;

    /*
     * Message Count Details.
     */
    @JsonProperty(value = "properties.countDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MessageCountDetails countDetails;

    /*
     * Exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * Default message time to live value. This is the duration after which the
     * message expires, starting from when the message is sent to Service Bus.
     * This is the default value used when TimeToLive is not set on a message
     * itself.
     */
    @JsonProperty(value = "properties.defaultMessageTimeToLive")
    private String defaultMessageTimeToLive;

    /*
     * Value that indicates whether a subscription has dead letter support on
     * filter evaluation exceptions.
     */
    @JsonProperty(value = "properties.deadLetteringOnFilterEvaluationExceptions")
    private Boolean deadLetteringOnFilterEvaluationExceptions;

    /*
     * Value that indicates whether a subscription has dead letter support when
     * a message expires.
     */
    @JsonProperty(value = "properties.deadLetteringOnMessageExpiration")
    private Boolean deadLetteringOnMessageExpiration;

    /*
     * Value that indicates whether server-side batched operations are enabled.
     */
    @JsonProperty(value = "properties.enableBatchedOperations")
    private Boolean enableBatchedOperations;

    /*
     * Entity availability status for the topic.
     */
    @JsonProperty(value = "properties.entityAvailabilityStatus")
    private EntityAvailabilityStatus entityAvailabilityStatus;

    /*
     * Value that indicates whether the entity description is read-only.
     */
    @JsonProperty(value = "properties.isReadOnly")
    private Boolean isReadOnly;

    /*
     * The lock duration time span for the subscription.
     */
    @JsonProperty(value = "properties.lockDuration")
    private String lockDuration;

    /*
     * Number of maximum deliveries.
     */
    @JsonProperty(value = "properties.maxDeliveryCount")
    private Integer maxDeliveryCount;

    /*
     * Number of messages.
     */
    @JsonProperty(value = "properties.messageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long messageCount;

    /*
     * Value indicating if a subscription supports the concept of sessions.
     */
    @JsonProperty(value = "properties.requiresSession")
    private Boolean requiresSession;

    /*
     * Enumerates the possible values for the status of a messaging entity.
     */
    @JsonProperty(value = "properties.status")
    private EntityStatus status;

    /*
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /**
     * Get the location property: Subscription data center location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Subscription data center location.
     *
     * @param location the location value to set.
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the type property: Resource manager type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Resource manager type of the resource.
     *
     * @param type the type value to set.
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the accessedAt property: Last time there was a receive request to this subscription.
     *
     * @return the accessedAt value.
     */
    public OffsetDateTime accessedAt() {
        return this.accessedAt;
    }

    /**
     * Get the autoDeleteOnIdle property: TimeSpan idle interval after which the topic is automatically deleted. The
     * minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value.
     */
    public String autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set the autoDeleteOnIdle property: TimeSpan idle interval after which the topic is automatically deleted. The
     * minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set.
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withAutoDeleteOnIdle(String autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get the countDetails property: Message Count Details.
     *
     * @return the countDetails value.
     */
    public MessageCountDetails countDetails() {
        return this.countDetails;
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
     * Get the defaultMessageTimeToLive property: Default message time to live value. This is the duration after which
     * the message expires, starting from when the message is sent to Service Bus. This is the default value used when
     * TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value.
     */
    public String defaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set the defaultMessageTimeToLive property: Default message time to live value. This is the duration after which
     * the message expires, starting from when the message is sent to Service Bus. This is the default value used when
     * TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set.
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withDefaultMessageTimeToLive(String defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get the deadLetteringOnFilterEvaluationExceptions property: Value that indicates whether a subscription has dead
     * letter support on filter evaluation exceptions.
     *
     * @return the deadLetteringOnFilterEvaluationExceptions value.
     */
    public Boolean deadLetteringOnFilterEvaluationExceptions() {
        return this.deadLetteringOnFilterEvaluationExceptions;
    }

    /**
     * Set the deadLetteringOnFilterEvaluationExceptions property: Value that indicates whether a subscription has dead
     * letter support on filter evaluation exceptions.
     *
     * @param deadLetteringOnFilterEvaluationExceptions the deadLetteringOnFilterEvaluationExceptions value to set.
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withDeadLetteringOnFilterEvaluationExceptions(
        Boolean deadLetteringOnFilterEvaluationExceptions) {
        this.deadLetteringOnFilterEvaluationExceptions = deadLetteringOnFilterEvaluationExceptions;
        return this;
    }

    /**
     * Get the deadLetteringOnMessageExpiration property: Value that indicates whether a subscription has dead letter
     * support when a message expires.
     *
     * @return the deadLetteringOnMessageExpiration value.
     */
    public Boolean deadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration;
    }

    /**
     * Set the deadLetteringOnMessageExpiration property: Value that indicates whether a subscription has dead letter
     * support when a message expires.
     *
     * @param deadLetteringOnMessageExpiration the deadLetteringOnMessageExpiration value to set.
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withDeadLetteringOnMessageExpiration(
        Boolean deadLetteringOnMessageExpiration) {
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
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
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get the entityAvailabilityStatus property: Entity availability status for the topic.
     *
     * @return the entityAvailabilityStatus value.
     */
    public EntityAvailabilityStatus entityAvailabilityStatus() {
        return this.entityAvailabilityStatus;
    }

    /**
     * Set the entityAvailabilityStatus property: Entity availability status for the topic.
     *
     * @param entityAvailabilityStatus the entityAvailabilityStatus value to set.
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withEntityAvailabilityStatus(
        EntityAvailabilityStatus entityAvailabilityStatus) {
        this.entityAvailabilityStatus = entityAvailabilityStatus;
        return this;
    }

    /**
     * Get the isReadOnly property: Value that indicates whether the entity description is read-only.
     *
     * @return the isReadOnly value.
     */
    public Boolean isReadOnly() {
        return this.isReadOnly;
    }

    /**
     * Set the isReadOnly property: Value that indicates whether the entity description is read-only.
     *
     * @param isReadOnly the isReadOnly value to set.
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withIsReadOnly(Boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
        return this;
    }

    /**
     * Get the lockDuration property: The lock duration time span for the subscription.
     *
     * @return the lockDuration value.
     */
    public String lockDuration() {
        return this.lockDuration;
    }

    /**
     * Set the lockDuration property: The lock duration time span for the subscription.
     *
     * @param lockDuration the lockDuration value to set.
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withLockDuration(String lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }

    /**
     * Get the maxDeliveryCount property: Number of maximum deliveries.
     *
     * @return the maxDeliveryCount value.
     */
    public Integer maxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Set the maxDeliveryCount property: Number of maximum deliveries.
     *
     * @param maxDeliveryCount the maxDeliveryCount value to set.
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Get the messageCount property: Number of messages.
     *
     * @return the messageCount value.
     */
    public Long messageCount() {
        return this.messageCount;
    }

    /**
     * Get the requiresSession property: Value indicating if a subscription supports the concept of sessions.
     *
     * @return the requiresSession value.
     */
    public Boolean requiresSession() {
        return this.requiresSession;
    }

    /**
     * Set the requiresSession property: Value indicating if a subscription supports the concept of sessions.
     *
     * @param requiresSession the requiresSession value to set.
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withRequiresSession(Boolean requiresSession) {
        this.requiresSession = requiresSession;
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
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withStatus(EntityStatus status) {
        this.status = status;
        return this;
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
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property location in model SubscriptionCreateOrUpdateParameters"));
        }
        if (countDetails() != null) {
            countDetails().validate();
        }
    }
}
