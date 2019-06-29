// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * The object returned in the QueueMessageList array when calling Put Message
 * on a Queue.
 */
@JacksonXmlRootElement(localName = "QueueMessage")
public final class EnqueuedMessage {
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

    /**
     * Get the messageId property: The Id of the Message.
     *
     * @return the messageId value.
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The Id of the Message.
     *
     * @param messageId the messageId value to set.
     * @return the EnqueuedMessage object itself.
     */
    public EnqueuedMessage messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the insertionTime property: The time the Message was inserted into
     * the Queue.
     *
     * @return the insertionTime value.
     */
    public OffsetDateTime insertionTime() {
        if (this.insertionTime == null) {
            return null;
        }
        return this.insertionTime.dateTime();
    }

    /**
     * Set the insertionTime property: The time the Message was inserted into
     * the Queue.
     *
     * @param insertionTime the insertionTime value to set.
     * @return the EnqueuedMessage object itself.
     */
    public EnqueuedMessage insertionTime(OffsetDateTime insertionTime) {
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
    public OffsetDateTime expirationTime() {
        if (this.expirationTime == null) {
            return null;
        }
        return this.expirationTime.dateTime();
    }

    /**
     * Set the expirationTime property: The time that the Message will expire
     * and be automatically deleted.
     *
     * @param expirationTime the expirationTime value to set.
     * @return the EnqueuedMessage object itself.
     */
    public EnqueuedMessage expirationTime(OffsetDateTime expirationTime) {
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
    public String popReceipt() {
        return this.popReceipt;
    }

    /**
     * Set the popReceipt property: This value is required to delete the
     * Message. If deletion fails using this popreceipt then the message has
     * been dequeued by another client.
     *
     * @param popReceipt the popReceipt value to set.
     * @return the EnqueuedMessage object itself.
     */
    public EnqueuedMessage popReceipt(String popReceipt) {
        this.popReceipt = popReceipt;
        return this;
    }

    /**
     * Get the timeNextVisible property: The time that the message will again
     * become visible in the Queue.
     *
     * @return the timeNextVisible value.
     */
    public OffsetDateTime timeNextVisible() {
        if (this.timeNextVisible == null) {
            return null;
        }
        return this.timeNextVisible.dateTime();
    }

    /**
     * Set the timeNextVisible property: The time that the message will again
     * become visible in the Queue.
     *
     * @param timeNextVisible the timeNextVisible value to set.
     * @return the EnqueuedMessage object itself.
     */
    public EnqueuedMessage timeNextVisible(OffsetDateTime timeNextVisible) {
        if (timeNextVisible == null) {
            this.timeNextVisible = null;
        } else {
            this.timeNextVisible = new DateTimeRfc1123(timeNextVisible);
        }
        return this;
    }
}
