// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * The object returned in the QueueMessageList array when calling Get Messages
 * on a Queue.
 */
@JacksonXmlRootElement(localName = "QueueMessage")
@Fluent
public final class DequeuedMessage {
    /*
     * The Id of the Message.
     */
    @JsonProperty(value = "MessageId", required = true)
    private String messageId;

    /*
     * The time the Message was inserted into the Queue.
     */
    @JsonProperty(value = "InsertionTime", required = true)
    private DateTimeRfc1123 insertionTime;

    /*
     * The time that the Message will expire and be automatically deleted.
     */
    @JsonProperty(value = "ExpirationTime", required = true)
    private DateTimeRfc1123 expirationTime;

    /*
     * This value is required to delete the Message. If deletion fails using
     * this popreceipt then the message has been dequeued by another client.
     */
    @JsonProperty(value = "PopReceipt", required = true)
    private String popReceipt;

    /*
     * The time that the message will again become visible in the Queue.
     */
    @JsonProperty(value = "TimeNextVisible", required = true)
    private DateTimeRfc1123 timeNextVisible;

    /*
     * The number of times the message has been dequeued.
     */
    @JsonProperty(value = "DequeueCount", required = true)
    private long dequeueCount;

    /*
     * The content of the Message.
     */
    @JsonProperty(value = "MessageText", required = true)
    private String messageText;

    /**
     * Get the messageId property: The Id of the Message.
     *
     * @return the messageId value.
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The Id of the Message.
     *
     * @param messageId the messageId value to set.
     * @return the DequeuedMessage object itself.
     */
    public DequeuedMessage setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the insertionTime property: The time the Message was inserted into
     * the Queue.
     *
     * @return the insertionTime value.
     */
    public OffsetDateTime getInsertionTime() {
        if (this.insertionTime == null) {
            return null;
        }
        return this.insertionTime.getDateTime();
    }

    /**
     * Set the insertionTime property: The time the Message was inserted into
     * the Queue.
     *
     * @param insertionTime the insertionTime value to set.
     * @return the DequeuedMessage object itself.
     */
    public DequeuedMessage setInsertionTime(OffsetDateTime insertionTime) {
        if (insertionTime == null) {
            this.insertionTime = null;
        } else {
            this.insertionTime = new DateTimeRfc1123(insertionTime);
        }
        return this;
    }

    /**
     * Get the expirationTime property: The time that the Message will expire
     * and be automatically deleted.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime getExpirationTime() {
        if (this.expirationTime == null) {
            return null;
        }
        return this.expirationTime.getDateTime();
    }

    /**
     * Set the expirationTime property: The time that the Message will expire
     * and be automatically deleted.
     *
     * @param expirationTime the expirationTime value to set.
     * @return the DequeuedMessage object itself.
     */
    public DequeuedMessage setExpirationTime(OffsetDateTime expirationTime) {
        if (expirationTime == null) {
            this.expirationTime = null;
        } else {
            this.expirationTime = new DateTimeRfc1123(expirationTime);
        }
        return this;
    }

    /**
     * Get the popReceipt property: This value is required to delete the
     * Message. If deletion fails using this popreceipt then the message has
     * been dequeued by another client.
     *
     * @return the popReceipt value.
     */
    public String getPopReceipt() {
        return this.popReceipt;
    }

    /**
     * Set the popReceipt property: This value is required to delete the
     * Message. If deletion fails using this popreceipt then the message has
     * been dequeued by another client.
     *
     * @param popReceipt the popReceipt value to set.
     * @return the DequeuedMessage object itself.
     */
    public DequeuedMessage setPopReceipt(String popReceipt) {
        this.popReceipt = popReceipt;
        return this;
    }

    /**
     * Get the timeNextVisible property: The time that the message will again
     * become visible in the Queue.
     *
     * @return the timeNextVisible value.
     */
    public OffsetDateTime getTimeNextVisible() {
        if (this.timeNextVisible == null) {
            return null;
        }
        return this.timeNextVisible.getDateTime();
    }

    /**
     * Set the timeNextVisible property: The time that the message will again
     * become visible in the Queue.
     *
     * @param timeNextVisible the timeNextVisible value to set.
     * @return the DequeuedMessage object itself.
     */
    public DequeuedMessage setTimeNextVisible(OffsetDateTime timeNextVisible) {
        if (timeNextVisible == null) {
            this.timeNextVisible = null;
        } else {
            this.timeNextVisible = new DateTimeRfc1123(timeNextVisible);
        }
        return this;
    }

    /**
     * Get the dequeueCount property: The number of times the message has been
     * dequeued.
     *
     * @return the dequeueCount value.
     */
    public long getDequeueCount() {
        return this.dequeueCount;
    }

    /**
     * Set the dequeueCount property: The number of times the message has been
     * dequeued.
     *
     * @param dequeueCount the dequeueCount value to set.
     * @return the DequeuedMessage object itself.
     */
    public DequeuedMessage setDequeueCount(long dequeueCount) {
        this.dequeueCount = dequeueCount;
        return this;
    }

    /**
     * Get the messageText property: The content of the Message.
     *
     * @return the messageText value.
     */
    public String getMessageText() {
        return this.messageText;
    }

    /**
     * Set the messageText property: The content of the Message.
     *
     * @param messageText the messageText value to set.
     * @return the DequeuedMessage object itself.
     */
    public DequeuedMessage setMessageText(String messageText) {
        this.messageText = messageText;
        return this;
    }
}
