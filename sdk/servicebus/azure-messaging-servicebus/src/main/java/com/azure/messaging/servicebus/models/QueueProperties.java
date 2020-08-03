// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.messaging.servicebus.implementation.EntityHelper;
import com.azure.messaging.servicebus.implementation.models.MessageCountDetails;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The QueueDescription model. */
@JacksonXmlRootElement(
        localName = "QueueDescription",
        namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
@Fluent
public final class QueueProperties {
    /*
     * Last time a message was sent, or the last time there was a receive
     * request to this queue.
     */
    @JacksonXmlProperty(
            localName = "AccessedAt",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime accessedAt;

    /*
     * ISO 8601 timeSpan idle interval after which the queue is automatically
     * deleted. The minimum duration is 5 minutes.
     */
    @JacksonXmlProperty(
            localName = "AutoDeleteOnIdle",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Duration autoDeleteOnIdle;

    private static final class AuthorizationRulesWrapper {
        @JacksonXmlProperty(localName = "AuthorizationRule")
        private final List<AuthorizationRule> items;

        @JsonCreator
        private AuthorizationRulesWrapper(
                @JacksonXmlProperty(localName = "AuthorizationRule") List<AuthorizationRule> items) {
            this.items = items;
        }
    }

    /*
     * Authorization rules for resource.
     */
    @JacksonXmlProperty(
            localName = "AuthorizationRules",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private AuthorizationRulesWrapper authorizationRules;

    /*
     * The exact time the queue was created.
     */
    @JacksonXmlProperty(
            localName = "CreatedAt",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime createdAt;

    /*
     * ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent
     * to Service Bus. This is the default value used when TimeToLive is not
     * set on a message itself.
     */
    @JacksonXmlProperty(
            localName = "DefaultMessageTimeToLive",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Duration defaultMessageTimeToLive;

    /*
     * A value that indicates whether this queue has dead letter support when a
     * message expires.
     */
    @JacksonXmlProperty(
            localName = "DeadLetteringOnMessageExpiration",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean deadLetteringOnMessageExpiration;

    /*
     * ISO 8601 timeSpan structure that defines the duration of the duplicate
     * detection history. The default value is 10 minutes.
     */
    @JacksonXmlProperty(
            localName = "DuplicateDetectionHistoryTimeWindow",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Duration duplicateDetectionHistoryTimeWindow;

    /*
     * Value that indicates whether server-side batched operations are enabled.
     */
    @JacksonXmlProperty(
            localName = "EnableBatchedOperations",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean enableBatchedOperations;

    /*
     * A value that indicates whether Express Entities are enabled. An express
     * queue holds a message in memory temporarily before writing it to
     * persistent storage.
     */
    @JacksonXmlProperty(
            localName = "EnableExpress",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean enableExpress;

    /*
     * A value that indicates whether the queue is to be partitioned across
     * multiple message brokers.
     */
    @JacksonXmlProperty(
            localName = "EnablePartitioning",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean enablePartitioning;

    /*
     * Availability status of the entity
     */
    @JacksonXmlProperty(
            localName = "EntityAvailabilityStatus",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private EntityAvailabilityStatus entityAvailabilityStatus;

    /*
     * The name of the recipient entity to which all the messages sent to the
     * queue are forwarded to.
     */
    @JacksonXmlProperty(
            localName = "ForwardTo",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String forwardTo;

    /*
     * The name of the recipient entity to which all the dead-lettered messages
     * of this queue are forwarded to.
     */
    @JacksonXmlProperty(
            localName = "ForwardDeadLetteredMessagesTo",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String forwardDeadLetteredMessagesTo;

    /*
     * A value indicating if the resource can be accessed without
     * authorization.
     */
    @JacksonXmlProperty(
            localName = "IsAnonymousAccessible",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean isAnonymousAccessible;

    /*
     * ISO 8601 timespan duration of a peek-lock; that is, the amount of time
     * that the message is locked for other receivers. The maximum value for
     * LockDuration is 5 minutes; the default value is 1 minute.
     */
    @JacksonXmlProperty(
            localName = "LockDuration",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Duration lockDuration;

    /*
     * The maximum delivery count. A message is automatically deadlettered
     * after this number of deliveries. Default value is 10.
     */
    @JacksonXmlProperty(
            localName = "MaxDeliveryCount",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Integer maxDeliveryCount;

    /*
     * The maximum size of the queue in megabytes, which is the size of memory
     * allocated for the queue.
     */
    @JacksonXmlProperty(
            localName = "MaxSizeInMegabytes",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Integer maxSizeInMegabytes;

    /*
     * The number of messages in the queue.
     */
    @JacksonXmlProperty(
            localName = "MessageCount",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Integer messageCount;

    /*
     * Details about the message counts in queue.
     */
    @JacksonXmlProperty(
            localName = "CountDetails",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private MessageCountDetails messageCountDetails;

    /*
     * A value indicating if this queue requires duplicate detection.
     */
    @JacksonXmlProperty(
            localName = "RequiresDuplicateDetection",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean requiresDuplicateDetection;

    /*
     * A value that indicates whether the queue supports the concept of
     * sessions.
     */
    @JacksonXmlProperty(
            localName = "RequiresSession",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean requiresSession;

    /*
     * The size of the queue, in bytes.
     */
    @JacksonXmlProperty(
            localName = "SizeInBytes",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Long sizeInBytes;

    /*
     * Status of a Service Bus resource
     */
    @JacksonXmlProperty(
            localName = "Status",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private EntityStatus status;

    /*
     * A value that indicates whether the queue supports ordering.
     */
    @JacksonXmlProperty(
            localName = "SupportOrdering",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean supportOrdering;

    /*
     * The exact time a message was updated in the queue.
     */
    @JacksonXmlProperty(
            localName = "UpdatedAt",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime updatedAt;

    /*
     * Custom metdata that user can associate with the description. Max length
     * is 1024 chars.
     */
    @JacksonXmlProperty(
            localName = "UserMetadata",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String userMetadata;

    private String queueName;

    static {
        // This is used by classes in different packages to get access to private and package-private methods.
        EntityHelper.setQueueAccessor(new EntityHelper.QueueAccessor() {
            @Override
            public void setName(QueueProperties queueProperties, String name) {
                queueProperties.setName(name);
            }

            @Override
            public QueueProperties createQueue(CreateQueueOptions options) {
                return new QueueProperties(options);
            }
        });
    }

    /**
     * Json deserialization constructor.
     */
    @JsonCreator
    QueueProperties() {
    }

    /**
     * Creates a queue with the given options.
     *
     * @param options options to create queue with.
     */
    QueueProperties(CreateQueueOptions options) {
        Objects.requireNonNull(options, "'options' cannot be null.");

        this.queueName = options.getName();
        this.autoDeleteOnIdle = options.getAutoDeleteOnIdle();
        this.defaultMessageTimeToLive = options.getDefaultMessageTimeToLive();
        this.deadLetteringOnMessageExpiration = options.deadLetteringOnMessageExpiration();
        this.duplicateDetectionHistoryTimeWindow = options.getDuplicateDetectionHistoryTimeWindow();
        this.enableBatchedOperations = options.enableBatchedOperations();
        this.enablePartitioning = options.enablePartitioning();
        this.forwardTo = options.getForwardTo();
        this.forwardDeadLetteredMessagesTo = options.getForwardDeadLetteredMessagesTo();
        this.lockDuration = options.getLockDuration();
        this.maxDeliveryCount = options.getMaxDeliveryCount();
        this.maxSizeInMegabytes = options.getMaxSizeInMegabytes();
        this.requiresDuplicateDetection = options.requiresDuplicateDetection();
        this.requiresSession = options.requiresSession();
        this.status = options.getStatus();
        this.userMetadata = options.getUserMetadata();
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
     * Sets the queue name.
     *
     * @param queueName Name of the queue.
     * @return the QueueDescription object itself.
     */
    QueueProperties setName(String queueName) {
        this.queueName = queueName;
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
     * Set the accessedAt property: Last time a message was sent, or the last time there was a receive request to this
     * queue.
     *
     * @param accessedAt the accessedAt value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setAccessedAt(OffsetDateTime accessedAt) {
        this.accessedAt = accessedAt;
        return this;
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
     * @return the QueueDescription object itself.
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
            this.authorizationRules = new AuthorizationRulesWrapper(new ArrayList<AuthorizationRule>());
        }
        return this.authorizationRules.items;
    }

    /**
     * Set the authorizationRules property: Authorization rules for resource.
     *
     * @param authorizationRules the authorizationRules value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setAuthorizationRules(List<AuthorizationRule> authorizationRules) {
        this.authorizationRules = new AuthorizationRulesWrapper(authorizationRules);
        return this;
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
     * Set the createdAt property: The exact time the queue was created.
     *
     * @param createdAt the createdAt value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
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
     * @return the QueueDescription object itself.
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
    public Boolean deadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration;
    }

    /**
     * Set the deadLetteringOnMessageExpiration property: A value that indicates whether this queue has dead letter
     * support when a message expires.
     *
     * @param deadLetteringOnMessageExpiration the deadLetteringOnMessageExpiration value to set.
     * @return the QueueDescription object itself.
     */
    public QueueProperties setDeadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration) {
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
     * @return the QueueDescription object itself.
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
    public Boolean enableBatchedOperations() {
        return this.enableBatchedOperations;
    }

    /**
     * Set the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set.
     * @return the QueueDescription object itself.
     */
    public QueueProperties setEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get the enableExpress property: A value that indicates whether Express Entities are enabled. An express queue
     * holds a message in memory temporarily before writing it to persistent storage.
     *
     * @return the enableExpress value.
     */
    Boolean enableExpress() {
        return this.enableExpress;
    }

    /**
     * Set the enableExpress property: A value that indicates whether Express Entities are enabled. An express queue
     * holds a message in memory temporarily before writing it to persistent storage.
     *
     * @param enableExpress the enableExpress value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setEnableExpress(Boolean enableExpress) {
        this.enableExpress = enableExpress;
        return this;
    }

    /**
     * Get the enablePartitioning property: A value that indicates whether the queue is to be partitioned across
     * multiple message brokers.
     *
     * @return the enablePartitioning value.
     */
    public Boolean enablePartitioning() {
        return this.enablePartitioning;
    }

    /**
     * Set the enablePartitioning property: A value that indicates whether the queue is to be partitioned across
     * multiple message brokers.
     *
     * @param enablePartitioning the enablePartitioning value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setEnablePartitioning(Boolean enablePartitioning) {
        this.enablePartitioning = enablePartitioning;
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

    /**
     * Set the entityAvailabilityStatus property: Availability status of the entity.
     *
     * @param entityAvailabilityStatus the entityAvailabilityStatus value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setEntityAvailabilityStatus(EntityAvailabilityStatus entityAvailabilityStatus) {
        this.entityAvailabilityStatus = entityAvailabilityStatus;
        return this;
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
     * @return the QueueDescription object itself.
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
     * @return the QueueDescription object itself.
     */
    public QueueProperties setForwardDeadLetteredMessagesTo(String forwardDeadLetteredMessagesTo) {
        this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
        return this;
    }

    /**
     * Get the isAnonymousAccessible property: A value indicating if the resource can be accessed without authorization.
     *
     * @return the isAnonymousAccessible value.
     */
    Boolean isAnonymousAccessible() {
        return this.isAnonymousAccessible;
    }

    /**
     * Set the isAnonymousAccessible property: A value indicating if the resource can be accessed without authorization.
     *
     * @param isAnonymousAccessible the isAnonymousAccessible value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setIsAnonymousAccessible(Boolean isAnonymousAccessible) {
        this.isAnonymousAccessible = isAnonymousAccessible;
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
     * @return the QueueDescription object itself.
     */
    public QueueProperties setLockDuration(Duration lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }

    /**
     * Get the maxDeliveryCount property: The maximum delivery count. A message is automatically deadlettered after this
     * number of deliveries. Default value is 10.
     *
     * @return the maxDeliveryCount value.
     */
    public Integer getMaxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Set the maxDeliveryCount property: The maximum delivery count. A message is automatically deadlettered after this
     * number of deliveries. Default value is 10.
     *
     * @param maxDeliveryCount the maxDeliveryCount value to set.
     * @return the QueueDescription object itself.
     */
    public QueueProperties setMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Get the maxSizeInMegabytes property: The maximum size of the queue in megabytes, which is the size of memory
     * allocated for the queue.
     *
     * @return the maxSizeInMegabytes value.
     */
    public Integer getMaxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }

    /**
     * Set the maxSizeInMegabytes property: The maximum size of the queue in megabytes, which is the size of memory
     * allocated for the queue.
     *
     * @param maxSizeInMegabytes the maxSizeInMegabytes value to set.
     * @return the QueueDescription object itself.
     */
    public QueueProperties setMaxSizeInMegabytes(Integer maxSizeInMegabytes) {
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        return this;
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
     * Set the messageCount property: The number of messages in the queue.
     *
     * @param messageCount the messageCount value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Get the messageCountDetails property: Details about the message counts in queue.
     *
     * @return the messageCountDetails value.
     */
    MessageCountDetails getMessageCountDetails() {
        return this.messageCountDetails;
    }

    /**
     * Set the messageCountDetails property: Details about the message counts in queue.
     *
     * @param messageCountDetails the messageCountDetails value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setMessageCountDetails(MessageCountDetails messageCountDetails) {
        this.messageCountDetails = messageCountDetails;
        return this;
    }

    /**
     * Get the requiresDuplicateDetection property: A value indicating if this queue requires duplicate detection.
     *
     * @return the requiresDuplicateDetection value.
     */
    public Boolean requiresDuplicateDetection() {
        return this.requiresDuplicateDetection;
    }

    /**
     * Set the requiresDuplicateDetection property: A value indicating if this queue requires duplicate detection.
     *
     * @param requiresDuplicateDetection the requiresDuplicateDetection value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        return this;
    }

    /**
     * Get the requiresSession property: A value that indicates whether the queue supports the concept of sessions.
     *
     * @return the requiresSession value.
     */
    public Boolean requiresSession() {
        return this.requiresSession;
    }

    /**
     * Set the requiresSession property: A value that indicates whether the queue supports the concept of sessions.
     *
     * @param requiresSession the requiresSession value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setRequiresSession(Boolean requiresSession) {
        this.requiresSession = requiresSession;
        return this;
    }

    /**
     * Get the sizeInBytes property: The size of the queue, in bytes.
     *
     * @return the sizeInBytes value.
     */
    Long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Set the sizeInBytes property: The size of the queue, in bytes.
     *
     * @param sizeInBytes the sizeInBytes value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
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
     * @return the QueueDescription object itself.
     */
    QueueProperties setStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the supportOrdering property: A value that indicates whether the queue supports ordering.
     *
     * @return the supportOrdering value.
     */
    Boolean supportOrdering() {
        return this.supportOrdering;
    }

    /**
     * Set the supportOrdering property: A value that indicates whether the queue supports ordering.
     *
     * @param supportOrdering the supportOrdering value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setSupportOrdering(Boolean supportOrdering) {
        this.supportOrdering = supportOrdering;
        return this;
    }

    /**
     * Get the updatedAt property: The exact time a message was updated in the queue.
     *
     * @return the updatedAt value.
     */
    OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the updatedAt property: The exact time a message was updated in the queue.
     *
     * @param updatedAt the updatedAt value to set.
     * @return the QueueDescription object itself.
     */
    QueueProperties setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
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
     * @return the QueueDescription object itself.
     */
    public QueueProperties setUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }
}
