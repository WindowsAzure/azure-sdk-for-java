// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.models;

import com.azure.core.annotation.Fluent;
import com.azure.messaging.servicebus.implementation.EntityHelper;
import com.azure.messaging.servicebus.implementation.models.AuthorizationRuleImpl;
import com.azure.messaging.servicebus.implementation.models.EntityAvailabilityStatus;
import com.azure.messaging.servicebus.implementation.models.MessageCountDetails;
import com.azure.messaging.servicebus.implementation.models.QueueDescription;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.azure.messaging.servicebus.implementation.MessageUtils.toPrimitive;

/**
 * The {@link QueueProperties} model.
 */
@Fluent
public final class QueueProperties {
    private Duration autoDeleteOnIdle;
    private final OffsetDateTime accessedAt;
    private List<AuthorizationRule> authorizationRules;
    private final OffsetDateTime createdAt;
    private Duration defaultMessageTimeToLive;
    private boolean deadLetteringOnMessageExpiration;
    private Duration duplicateDetectionHistoryTimeWindow;
    private boolean enableBatchedOperations;
    private final Boolean enableExpress;
    private boolean enablePartitioning;
    private final EntityAvailabilityStatus entityAvailabilityStatus;
    private String forwardTo;
    private String forwardDeadLetteredMessagesTo;
    private final Boolean isAnonymousAccessible;
    private Duration lockDuration;
    private int maxDeliveryCount;
    private long maxSizeInMegabytes;
    private final int messageCount;
    private final MessageCountDetails messageCountDetails;
    private boolean requiresDuplicateDetection;
    private boolean requiresSession;
    private final int sizeInBytes;
    private EntityStatus status;
    private final Boolean supportOrdering;
    private final OffsetDateTime updatedAt;
    private String userMetadata;
    private String queueName;

    static {
        // This is used by classes in different packages to get access to private and package-private methods.
        EntityHelper.setQueueAccessor(new EntityHelper.QueueAccessor() {
            @Override
            public QueueDescription toImplementation(QueueProperties queue, List<AuthorizationRuleImpl> rules) {
                final QueueDescription description = new QueueDescription()
                    .setAccessedAt(queue.getAccessedAt())
                    .setAutoDeleteOnIdle(queue.getAutoDeleteOnIdle())
                    .setCreatedAt(queue.getCreatedAt())
                    .setDeadLetteringOnMessageExpiration(queue.isDeadLetteringOnMessageExpiration())
                    .setDefaultMessageTimeToLive(queue.getDefaultMessageTimeToLive())
                    .setDuplicateDetectionHistoryTimeWindow(queue.getDuplicateDetectionHistoryTimeWindow())
                    .setEnablePartitioning(queue.isPartitioningEnabled())
                    .setEnableExpress(queue.enableExpress)
                    .setEnableBatchedOperations(queue.enableBatchedOperations)
                    .setEntityAvailabilityStatus(queue.entityAvailabilityStatus)
                    .setForwardTo(queue.getForwardTo())
                    .setForwardDeadLetteredMessagesTo(queue.getForwardDeadLetteredMessagesTo())
                    .setIsAnonymousAccessible(queue.isAnonymousAccessible)
                    .setLockDuration(queue.getLockDuration())
                    .setMaxSizeInMegabytes(queue.getMaxSizeInMegabytes())
                    .setMaxDeliveryCount(queue.getMaxDeliveryCount())
                    .setMessageCount(queue.messageCount)
                    .setMessageCountDetails(queue.getMessageCountDetails())
                    .setSupportOrdering(queue.supportOrdering)
                    .setStatus(queue.getStatus())
                    .setSizeInBytes(queue.getSizeInBytes())
                    .setRequiresSession(queue.isSessionRequired())
                    .setRequiresDuplicateDetection(queue.isDuplicateDetectionRequired())
                    .setUpdatedAt(queue.getUpdatedAt())
                    .setUserMetadata(queue.getUserMetadata());

                if (!rules.isEmpty()) {
                    description.setAuthorizationRules(rules);
                }

                return description;
            }

            @Override
            public QueueProperties toModel(QueueDescription queueDescription) {
                return new QueueProperties(queueDescription);
            }

            @Override
            public void setName(QueueProperties queueProperties, String name) {
                queueProperties.queueName = name;
            }
        });
    }

    /**
     * Creates a queue using a {@link QueueDescription}.
     *
     * @param description The queue to use.
     */
    QueueProperties(QueueDescription description) {
        this.accessedAt = description.getAccessedAt();
        this.autoDeleteOnIdle = description.getAutoDeleteOnIdle();
        this.authorizationRules = description.getAuthorizationRules().stream()
            .map(SharedAccessAuthorizationRule::new)
            .collect(Collectors.toList());
        this.createdAt = description.getCreatedAt();
        this.defaultMessageTimeToLive = description.getDefaultMessageTimeToLive();
        this.deadLetteringOnMessageExpiration = toPrimitive(description.isDeadLetteringOnMessageExpiration());
        this.duplicateDetectionHistoryTimeWindow = description.getDuplicateDetectionHistoryTimeWindow();
        this.enableBatchedOperations = toPrimitive(description.isEnableBatchedOperations());
        this.enableExpress = description.isEnableExpress();
        this.enablePartitioning = toPrimitive(description.isEnablePartitioning());
        this.entityAvailabilityStatus = description.getEntityAvailabilityStatus();
        this.isAnonymousAccessible = description.isAnonymousAccessible();
        this.forwardTo = description.getForwardTo();
        this.forwardDeadLetteredMessagesTo = description.getForwardDeadLetteredMessagesTo();
        this.lockDuration = description.getLockDuration();
        this.maxDeliveryCount = toPrimitive(description.getMaxDeliveryCount());
        this.maxSizeInMegabytes = toPrimitive(description.getMaxSizeInMegabytes());
        this.messageCount = toPrimitive(description.getMessageCount());
        this.messageCountDetails = description.getMessageCountDetails();
        this.requiresDuplicateDetection = toPrimitive(description.isRequiresDuplicateDetection());
        this.requiresSession = toPrimitive(description.isRequiresSession());
        this.sizeInBytes = toPrimitive(description.getSizeInBytes());
        this.supportOrdering = description.isSupportOrdering();
        this.status = description.getStatus();
        this.updatedAt = description.getUpdatedAt();
        this.userMetadata = description.getUserMetadata();
    }

    /**
     * Gets the name of the queue.
     *
     * @return The name of the queue.
     */
    public String getName() {
        return queueName;
    }

    /**
     * Get the autoDeleteOnIdle property: ISO 8601 timeSpan idle interval after which the queue is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value.
     */
    public Duration getAutoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set the autoDeleteOnIdle property: ISO 8601 timeSpan idle interval after which the queue is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set.
     *
     * @return the {@link QueueProperties} object itself.
     */
    public QueueProperties setAutoDeleteOnIdle(Duration autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get the authorizationRules property: Authorization rules for resource.
     *
     * @return the authorizationRules value.
     */
    public List<AuthorizationRule> getAuthorizationRules() {
        if (this.authorizationRules == null) {
            this.authorizationRules = new ArrayList<>();
        }

        return this.authorizationRules;
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
     *
     * @return the {@link QueueProperties} object itself.
     */
    public QueueProperties setDefaultMessageTimeToLive(Duration defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get the deadLetteringOnMessageExpiration property: A value that indicates whether this queue has dead letter
     * support when a message expires.
     *
     * @return the deadLetteringOnMessageExpiration value.
     */
    public boolean isDeadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration;
    }

    /**
     * Set the deadLetteringOnMessageExpiration property: A value that indicates whether this queue has dead letter
     * support when a message expires.
     *
     * @param deadLetteringOnMessageExpiration the deadLetteringOnMessageExpiration value to set.
     *
     * @return the {@link QueueProperties} object itself.
     */
    public QueueProperties setDeadLetteringOnMessageExpiration(boolean deadLetteringOnMessageExpiration) {
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
        return this;
    }

    /**
     * Get the duplicateDetectionHistoryTimeWindow property: ISO 8601 timeSpan structure that defines the duration of
     * the duplicate detection history. The default value is 10 minutes.
     *
     * @return the duplicateDetectionHistoryTimeWindow value.
     */
    public Duration getDuplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Set the duplicateDetectionHistoryTimeWindow property: ISO 8601 timeSpan structure that defines the duration of
     * the duplicate detection history. The default value is 10 minutes.
     *
     * @param duplicateDetectionHistoryTimeWindow the duplicateDetectionHistoryTimeWindow value to set.
     *
     * @return the {@link QueueProperties} object itself.
     */
    public QueueProperties setDuplicateDetectionHistoryTimeWindow(Duration duplicateDetectionHistoryTimeWindow) {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
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
     *
     * @return the {@link QueueProperties} object itself.
     */
    public QueueProperties setBatchedOperationsEnabled(boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get the enablePartitioning property: A value that indicates whether the queue is to be partitioned across
     * multiple message brokers.
     *
     * @return the enablePartitioning value.
     */
    public boolean isPartitioningEnabled() {
        return this.enablePartitioning;
    }

    /**
     * Get the forwardTo property: The name of the recipient entity to which all the messages sent to the queue are
     * forwarded to.
     *
     * @return the forwardTo value.
     */
    public String getForwardTo() {
        return this.forwardTo;
    }

    /**
     * Set the forwardTo property: The name of the recipient entity to which all the messages sent to the queue are
     * forwarded to.
     *
     * @param forwardTo the forwardTo value to set.
     *
     * @return the {@link QueueProperties} object itself.
     */
    public QueueProperties setForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
        return this;
    }

    /**
     * Get the forwardDeadLetteredMessagesTo property: The name of the recipient entity to which all the dead-lettered
     * messages of this queue are forwarded to.
     *
     * @return the forwardDeadLetteredMessagesTo value.
     */
    public String getForwardDeadLetteredMessagesTo() {
        return this.forwardDeadLetteredMessagesTo;
    }

    /**
     * Set the forwardDeadLetteredMessagesTo property: The name of the recipient entity to which all the dead-lettered
     * messages of this queue are forwarded to.
     *
     * @param forwardDeadLetteredMessagesTo the forwardDeadLetteredMessagesTo value to set.
     *
     * @return the {@link QueueProperties} object itself.
     */
    public QueueProperties setForwardDeadLetteredMessagesTo(String forwardDeadLetteredMessagesTo) {
        this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
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
     *
     * @return the {@link QueueProperties} object itself.
     */
    public QueueProperties setLockDuration(Duration lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }

    /**
     * Get the maxDeliveryCount property: The maximum delivery count. A message is automatically dead-lettered after
     * this number of deliveries. Default value is 10.
     *
     * @return the maxDeliveryCount value.
     */
    public int getMaxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Sets the maximum delivery count. A message is automatically dead-lettered after
     * this number of deliveries. Default value is 10.
     *
     * @param maxDeliveryCount the maxDeliveryCount value to set.
     *
     * @return the {@link QueueProperties} object itself.
     */
    public QueueProperties setMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Gets the maximum size of the queue in megabytes, which is the size of memory allocated for the queue.
     *
     * @return the maxSizeInMegabytes value.
     */
    public long getMaxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }

    /**
     * Set the maxSizeInMegabytes property: The maximum size of the queue in megabytes, which is the size of memory
     * allocated for the queue.
     *
     * @param maxSizeInMegabytes the maxSizeInMegabytes value to set.
     *
     * @return the {@link QueueProperties} object itself.
     */
    public QueueProperties setMaxSizeInMegabytes(Integer maxSizeInMegabytes) {
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        return this;
    }

    /**
     * Get the requiresDuplicateDetection property: A value indicating if this queue requires duplicate detection.
     *
     * @return the requiresDuplicateDetection value.
     */
    public boolean isDuplicateDetectionRequired() {
        return this.requiresDuplicateDetection;
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
     *
     * @return the {@link QueueProperties} object itself.
     */
    public QueueProperties setStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the userMetadata property: Custom metdata that user can associate with the description. Max length is 1024
     * chars.
     *
     * @return the userMetadata value.
     */
    public String getUserMetadata() {
        return this.userMetadata;
    }

    /**
     * Set the userMetadata property: Custom metdata that user can associate with the description. Max length is 1024
     * chars.
     *
     * @param userMetadata the userMetadata value to set.
     *
     * @return the {@link QueueProperties} object itself.
     */
    public QueueProperties setUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

    /**
     * Get the accessedAt property: Last time a message was sent, or the last time there was a receive request to this
     * queue.
     *
     * @return the accessedAt value.
     */
    OffsetDateTime getAccessedAt() {
        return this.accessedAt;
    }

    /**
     * Get the createdAt property: The exact time the queue was created.
     *
     * @return the createdAt value.
     */
    OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the messageCount property: The number of messages in the queue.
     *
     * @return the messageCount value.
     */
    Integer getMessageCount() {
        return this.messageCount;
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
     * Get the sizeInBytes property: The size of the queue, in bytes.
     *
     * @return the sizeInBytes value.
     */
    Integer getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Get the updatedAt property: The exact time the entity description was last updated.
     *
     * @return the updatedAt value.
     */
    OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    QueueProperties setPartitioningEnabled(boolean enablePartitioning) {
        this.enablePartitioning = enablePartitioning;
        return this;
    }

    QueueProperties setDuplicateDetectionRequired(boolean requiresDuplicateDetection) {
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        return this;
    }

    QueueProperties setSessionRequired(boolean requiresSession) {
        this.requiresSession = requiresSession;
        return this;
    }
}
