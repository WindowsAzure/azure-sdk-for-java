// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.models;

import com.azure.core.annotation.Fluent;
import com.azure.messaging.servicebus.administration.ServiceBusAdministrationAsyncClient;
import com.azure.messaging.servicebus.administration.ServiceBusAdministrationClient;
import com.azure.messaging.servicebus.implementation.EntityHelper;
import com.azure.messaging.servicebus.implementation.models.EntityAvailabilityStatus;
import com.azure.messaging.servicebus.implementation.models.MessageCountDetails;
import com.azure.messaging.servicebus.implementation.models.SubscriptionDescription;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Objects;

import static com.azure.messaging.servicebus.implementation.MessageUtils.toPrimitive;

/**
 * Properties on a subscription.
 *
 * @see ServiceBusAdministrationAsyncClient#getSubscription(String, String)
 * @see ServiceBusAdministrationClient#getSubscription(String, String)
 */
@Fluent
public final class SubscriptionProperties {
    private Duration lockDuration;
    private final boolean requiresSession;
    private Duration defaultMessageTimeToLive;
    private boolean deadLetteringOnMessageExpiration;
    private boolean deadLetteringOnFilterEvaluationExceptions;
    private int messageCount;
    private int maxDeliveryCount;
    private boolean enableBatchedOperations;
    private EntityStatus status;
    private String forwardTo;
    private final OffsetDateTime createdAt;
    private final OffsetDateTime updatedAt;
    private final OffsetDateTime accessedAt;
    private final MessageCountDetails messageCountDetails;
    private String userMetadata;
    private String forwardDeadLetteredMessagesTo;
    private Duration autoDeleteOnIdle;
    private final EntityAvailabilityStatus entityAvailabilityStatus;

    static {
        // This is used by classes in different packages to get access to private and package-private methods.
        EntityHelper.setSubscriptionAccessor(new EntityHelper.SubscriptionAccessor() {
            @Override
            public SubscriptionProperties toModel(SubscriptionDescription description) {
                return new SubscriptionProperties(description);
            }

            @Override
            public SubscriptionDescription toImplementation(SubscriptionProperties subscription) {
                return new SubscriptionDescription()
                    .setAccessedAt(subscription.getAccessedAt())
                    .setAutoDeleteOnIdle(subscription.getAutoDeleteOnIdle())
                    .setCreatedAt(subscription.getCreatedAt())
                    .setDeadLetteringOnFilterEvaluationExceptions(
                        subscription.isDeadLetteringOnFilterEvaluationExceptions())
                    .setDeadLetteringOnMessageExpiration(subscription.isDeadLetteringOnMessageExpiration())
                    .setDefaultMessageTimeToLive(subscription.getDefaultMessageTimeToLive())
                    .setEnableBatchedOperations(subscription.enableBatchedOperations)
                    .setEntityAvailabilityStatus(subscription.entityAvailabilityStatus)
                    .setForwardTo(subscription.getForwardTo())
                    .setForwardDeadLetteredMessagesTo(subscription.getForwardDeadLetteredMessagesTo())
                    .setLockDuration(subscription.getLockDuration())
                    .setMaxDeliveryCount(subscription.getMaxDeliveryCount())
                    .setMessageCount(subscription.messageCount)
                    .setMessageCountDetails(subscription.getMessageCountDetails())
                    .setStatus(subscription.getStatus())
                    .setRequiresSession(subscription.isSessionRequired())
                    .setUpdatedAt(subscription.getUpdatedAt())
                    .setUserMetadata(subscription.getUserMetadata());
            }

            @Override
            public void setTopicName(SubscriptionProperties subscriptionProperties, String topicName) {
                subscriptionProperties.setTopicName(topicName);
            }

            @Override
            public void setSubscriptionName(SubscriptionProperties subscriptionProperties, String subscriptionName) {
                subscriptionProperties.setSubscriptionName(subscriptionName);
            }
        });
    }

    private String topicName;
    private String subscriptionName;

    /**
     * Creates a new instance with the given options.
     *
     * @param description Options used to create a subscription.
     */
    SubscriptionProperties(SubscriptionDescription description) {
        Objects.requireNonNull(description, "'description' cannot be null.");
        this.accessedAt = description.getAccessedAt();
        this.autoDeleteOnIdle = description.getAutoDeleteOnIdle();
        this.createdAt = description.getCreatedAt();
        this.defaultMessageTimeToLive = description.getDefaultMessageTimeToLive();
        this.deadLetteringOnMessageExpiration = toPrimitive(description.isDeadLetteringOnMessageExpiration());
        this.deadLetteringOnFilterEvaluationExceptions =
            toPrimitive(description.isDeadLetteringOnFilterEvaluationExceptions());
        this.enableBatchedOperations = toPrimitive(description.isEnableBatchedOperations());
        this.entityAvailabilityStatus = description.getEntityAvailabilityStatus();
        this.forwardTo = description.getForwardTo();
        this.forwardDeadLetteredMessagesTo = description.getForwardDeadLetteredMessagesTo();
        this.lockDuration = description.getLockDuration();
        this.maxDeliveryCount = toPrimitive(description.getMaxDeliveryCount());
        this.messageCount = toPrimitive(description.getMessageCount());
        this.messageCountDetails = description.getMessageCountDetails();
        this.requiresSession = toPrimitive(description.isRequiresSession());
        this.status = description.getStatus();
        this.updatedAt = description.getUpdatedAt();
        this.userMetadata = description.getUserMetadata();
    }

    /**
     * Gets the name of the topic under which subscription exists.
     * @return The name of the topic under which subscription exists.
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * Sets the name of the topic.
     *
     * @param topicName Name of the topic.
     * @return the SubscriptionProperties object itself.
     */
    SubscriptionProperties setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * Gets the name of the subscription.
     *
     * @return The name of the subscription.
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }

    /**
     * Sets the name of the subscription.
     *
     * @param subscriptionName Name of the subscription.
     * @return the SubscriptionProperties object itself.
     */
    SubscriptionProperties setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }

    /**
     * Get the lockDuration property: ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the
     * message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1
     * minute.
     *
     * @return the lockDuration value.
     */
    public Duration getLockDuration() {
        return this.lockDuration;
    }

    /**
     * Set the lockDuration property: ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the
     * message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1
     * minute.
     *
     * @param lockDuration the lockDuration value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties setLockDuration(Duration lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }

    /**
     * Get the requiresSession property: A value that indicates whether the queue supports the concept of sessions.
     *
     * @return the requiresSession value.
     */
    public boolean isSessionRequired() {
        return this.requiresSession;
    }

    /**
     * Get the defaultMessageTimeToLive property: ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value.
     */
    public Duration getDefaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set the defaultMessageTimeToLive property: ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties setDefaultMessageTimeToLive(Duration defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get the deadLetteringOnMessageExpiration property: A value that indicates whether this subscription has dead
     * letter support when a message expires.
     *
     * @return the deadLetteringOnMessageExpiration value.
     */
    public boolean isDeadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration;
    }

    /**
     * Set the deadLetteringOnMessageExpiration property: A value that indicates whether this subscription has dead
     * letter support when a message expires.
     *
     * @param deadLetteringOnMessageExpiration the deadLetteringOnMessageExpiration value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties setDeadLetteringOnMessageExpiration(boolean deadLetteringOnMessageExpiration) {
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
        return this;
    }

    /**
     * Get the deadLetteringOnFilterEvaluationExceptions property: A value that indicates whether this subscription has
     * dead letter support when a message expires.
     *
     * @return the deadLetteringOnFilterEvaluationExceptions value.
     */
    public boolean isDeadLetteringOnFilterEvaluationExceptions() {
        return this.deadLetteringOnFilterEvaluationExceptions;
    }

    /**
     * Set the deadLetteringOnFilterEvaluationExceptions property: A value that indicates whether this subscription has
     * dead letter support when a message expires.
     *
     * @param deadLetteringOnFilterEvaluationExceptions the deadLetteringOnFilterEvaluationExceptions value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties setEnableDeadLetteringOnFilterEvaluationExceptions(
            boolean deadLetteringOnFilterEvaluationExceptions) {
        this.deadLetteringOnFilterEvaluationExceptions = deadLetteringOnFilterEvaluationExceptions;
        return this;
    }

    /**
     * Get the messageCount property: The number of messages in the subscription.
     *
     * @return the messageCount value.
     */
    int getMessageCount() {
        return this.messageCount;
    }

    /**
     * Set the messageCount property: The number of messages in the subscription.
     *
     * @param messageCount the messageCount value to set.
     * @return the SubscriptionProperties object itself.
     */
    SubscriptionProperties setMessageCount(int messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Get the maxDeliveryCount property: The maximum delivery count. A message is automatically deadlettered after this
     * number of deliveries. Default value is 10.
     *
     * @return the maxDeliveryCount value.
     */
    public int getMaxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Set the maxDeliveryCount property: The maximum delivery count. A message is automatically deadlettered after this
     * number of deliveries. Default value is 10.
     *
     * @param maxDeliveryCount the maxDeliveryCount value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties setMaxDeliveryCount(int maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Get the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @return the enableBatchedOperations value.
     */
    public boolean isBatchedOperationsEnabled() {
        return this.enableBatchedOperations;
    }

    /**
     * Set the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties setBatchedOperationsEnabled(boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get the status property: Status of a Service Bus resource.
     *
     * @return the status value.
     */
    public EntityStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of a Service Bus resource.
     *
     * @param status the status value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties setStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the forwardTo property: The name of the recipient entity to which all the messages sent to the subscription
     * are forwarded to.
     *
     * @return the forwardTo value.
     */
    public String getForwardTo() {
        return this.forwardTo;
    }

    /**
     * Set the forwardTo property: The name of the recipient entity to which all the messages sent to the subscription
     * are forwarded to.
     *
     * @param forwardTo the forwardTo value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties setForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
        return this;
    }

    /**
     * Get the createdAt property: The exact time the subscription was created.
     *
     * @return the createdAt value.
     */
    OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The exact time a message was updated in the subscription.
     *
     * @return the updatedAt value.
     */
    OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the accessedAt property: Last time a message was sent, or the last time there was a receive request to this
     * subscription.
     *
     * @return the accessedAt value.
     */
    OffsetDateTime getAccessedAt() {
        return this.accessedAt;
    }

    /**
     * Get the messageCountDetails property: Details about the message counts in entity.
     *
     * @return the messageCountDetails value.
     */
    MessageCountDetails getMessageCountDetails() {
        return this.messageCountDetails;
    }

    /**
     * Get the userMetadata property: Metadata associated with the subscription. Maximum number of characters is 1024.
     *
     * @return the userMetadata value.
     */
    public String getUserMetadata() {
        return this.userMetadata;
    }

    /**
     * Set the userMetadata property: Metadata associated with the subscription. Maximum number of characters is 1024.
     *
     * @param userMetadata the userMetadata value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties setUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

    /**
     * Get the forwardDeadLetteredMessagesTo property: The name of the recipient entity to which all the messages sent
     * to the subscription are forwarded to.
     *
     * @return the forwardDeadLetteredMessagesTo value.
     */
    public String getForwardDeadLetteredMessagesTo() {
        return this.forwardDeadLetteredMessagesTo;
    }

    /**
     * Set the forwardDeadLetteredMessagesTo property: The name of the recipient entity to which all the messages sent
     * to the subscription are forwarded to.
     *
     * @param forwardDeadLetteredMessagesTo the forwardDeadLetteredMessagesTo value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties setForwardDeadLetteredMessagesTo(String forwardDeadLetteredMessagesTo) {
        this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
        return this;
    }

    /**
     * Get the autoDeleteOnIdle property: ISO 8601 timeSpan idle interval after which the subscription is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value.
     */
    public Duration getAutoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set the autoDeleteOnIdle property: ISO 8601 timeSpan idle interval after which the subscription is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties setAutoDeleteOnIdle(Duration autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get the entityAvailabilityStatus property: Availability status of the entity.
     *
     * @return the entityAvailabilityStatus value.
     */
    EntityAvailabilityStatus getEntityAvailabilityStatus() {
        return this.entityAvailabilityStatus;
    }
}
