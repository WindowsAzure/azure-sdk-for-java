/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2015_08_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Create Or Update Subscription operation.
 */
@JsonFlatten
public class SubscriptionCreateOrUpdateParameters {
    /**
     * Subscription data center location.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Resource manager type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Last time there was a receive request to this subscription.
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
     * The countDetails property.
     */
    @JsonProperty(value = "properties.countDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MessageCountDetails countDetails;

    /**
     * Exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * Default message time to live value. This is the duration after which the
     * message expires, starting from when the message is sent to Service Bus.
     * This is the default value used when TimeToLive is not set on a message
     * itself.
     */
    @JsonProperty(value = "properties.defaultMessageTimeToLive")
    private String defaultMessageTimeToLive;

    /**
     * Value that indicates whether a subscription has dead letter support on
     * filter evaluation exceptions.
     */
    @JsonProperty(value = "properties.deadLetteringOnFilterEvaluationExceptions")
    private Boolean deadLetteringOnFilterEvaluationExceptions;

    /**
     * Value that indicates whether a subscription has dead letter support when
     * a message expires.
     */
    @JsonProperty(value = "properties.deadLetteringOnMessageExpiration")
    private Boolean deadLetteringOnMessageExpiration;

    /**
     * Value that indicates whether server-side batched operations are enabled.
     */
    @JsonProperty(value = "properties.enableBatchedOperations")
    private Boolean enableBatchedOperations;

    /**
     * Entity availability status for the topic. Possible values include:
     * 'Available', 'Limited', 'Renaming', 'Restoring', 'Unknown'.
     */
    @JsonProperty(value = "properties.entityAvailabilityStatus")
    private EntityAvailabilityStatus entityAvailabilityStatus;

    /**
     * Value that indicates whether the entity description is read-only.
     */
    @JsonProperty(value = "properties.isReadOnly")
    private Boolean isReadOnly;

    /**
     * The lock duration time span for the subscription.
     */
    @JsonProperty(value = "properties.lockDuration")
    private String lockDuration;

    /**
     * Number of maximum deliveries.
     */
    @JsonProperty(value = "properties.maxDeliveryCount")
    private Integer maxDeliveryCount;

    /**
     * Number of messages.
     */
    @JsonProperty(value = "properties.messageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long messageCount;

    /**
     * Value indicating if a subscription supports the concept of sessions.
     */
    @JsonProperty(value = "properties.requiresSession")
    private Boolean requiresSession;

    /**
     * Enumerates the possible values for the status of a messaging entity.
     * Possible values include: 'Active', 'Creating', 'Deleting', 'Disabled',
     * 'ReceiveDisabled', 'Renaming', 'Restoring', 'SendDisabled', 'Unknown'.
     */
    @JsonProperty(value = "properties.status")
    private EntityStatus status;

    /**
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * Get subscription data center location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set subscription data center location.
     *
     * @param location the location value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get resource manager type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set resource manager type of the resource.
     *
     * @param type the type value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get last time there was a receive request to this subscription.
     *
     * @return the accessedAt value
     */
    public DateTime accessedAt() {
        return this.accessedAt;
    }

    /**
     * Get timeSpan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value
     */
    public String autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set timeSpan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withAutoDeleteOnIdle(String autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
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
     * Get exact time the message was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get default message time to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value
     */
    public String defaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set default message time to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withDefaultMessageTimeToLive(String defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get value that indicates whether a subscription has dead letter support on filter evaluation exceptions.
     *
     * @return the deadLetteringOnFilterEvaluationExceptions value
     */
    public Boolean deadLetteringOnFilterEvaluationExceptions() {
        return this.deadLetteringOnFilterEvaluationExceptions;
    }

    /**
     * Set value that indicates whether a subscription has dead letter support on filter evaluation exceptions.
     *
     * @param deadLetteringOnFilterEvaluationExceptions the deadLetteringOnFilterEvaluationExceptions value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withDeadLetteringOnFilterEvaluationExceptions(Boolean deadLetteringOnFilterEvaluationExceptions) {
        this.deadLetteringOnFilterEvaluationExceptions = deadLetteringOnFilterEvaluationExceptions;
        return this;
    }

    /**
     * Get value that indicates whether a subscription has dead letter support when a message expires.
     *
     * @return the deadLetteringOnMessageExpiration value
     */
    public Boolean deadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration;
    }

    /**
     * Set value that indicates whether a subscription has dead letter support when a message expires.
     *
     * @param deadLetteringOnMessageExpiration the deadLetteringOnMessageExpiration value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withDeadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration) {
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
        return this;
    }

    /**
     * Get value that indicates whether server-side batched operations are enabled.
     *
     * @return the enableBatchedOperations value
     */
    public Boolean enableBatchedOperations() {
        return this.enableBatchedOperations;
    }

    /**
     * Set value that indicates whether server-side batched operations are enabled.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get entity availability status for the topic. Possible values include: 'Available', 'Limited', 'Renaming', 'Restoring', 'Unknown'.
     *
     * @return the entityAvailabilityStatus value
     */
    public EntityAvailabilityStatus entityAvailabilityStatus() {
        return this.entityAvailabilityStatus;
    }

    /**
     * Set entity availability status for the topic. Possible values include: 'Available', 'Limited', 'Renaming', 'Restoring', 'Unknown'.
     *
     * @param entityAvailabilityStatus the entityAvailabilityStatus value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withEntityAvailabilityStatus(EntityAvailabilityStatus entityAvailabilityStatus) {
        this.entityAvailabilityStatus = entityAvailabilityStatus;
        return this;
    }

    /**
     * Get value that indicates whether the entity description is read-only.
     *
     * @return the isReadOnly value
     */
    public Boolean isReadOnly() {
        return this.isReadOnly;
    }

    /**
     * Set value that indicates whether the entity description is read-only.
     *
     * @param isReadOnly the isReadOnly value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withIsReadOnly(Boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
        return this;
    }

    /**
     * Get the lock duration time span for the subscription.
     *
     * @return the lockDuration value
     */
    public String lockDuration() {
        return this.lockDuration;
    }

    /**
     * Set the lock duration time span for the subscription.
     *
     * @param lockDuration the lockDuration value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withLockDuration(String lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }

    /**
     * Get number of maximum deliveries.
     *
     * @return the maxDeliveryCount value
     */
    public Integer maxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Set number of maximum deliveries.
     *
     * @param maxDeliveryCount the maxDeliveryCount value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Get number of messages.
     *
     * @return the messageCount value
     */
    public Long messageCount() {
        return this.messageCount;
    }

    /**
     * Get value indicating if a subscription supports the concept of sessions.
     *
     * @return the requiresSession value
     */
    public Boolean requiresSession() {
        return this.requiresSession;
    }

    /**
     * Set value indicating if a subscription supports the concept of sessions.
     *
     * @param requiresSession the requiresSession value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withRequiresSession(Boolean requiresSession) {
        this.requiresSession = requiresSession;
        return this;
    }

    /**
     * Get enumerates the possible values for the status of a messaging entity. Possible values include: 'Active', 'Creating', 'Deleting', 'Disabled', 'ReceiveDisabled', 'Renaming', 'Restoring', 'SendDisabled', 'Unknown'.
     *
     * @return the status value
     */
    public EntityStatus status() {
        return this.status;
    }

    /**
     * Set enumerates the possible values for the status of a messaging entity. Possible values include: 'Active', 'Creating', 'Deleting', 'Disabled', 'ReceiveDisabled', 'Renaming', 'Restoring', 'SendDisabled', 'Unknown'.
     *
     * @param status the status value to set
     * @return the SubscriptionCreateOrUpdateParameters object itself.
     */
    public SubscriptionCreateOrUpdateParameters withStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the exact time the message was updated.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

}
