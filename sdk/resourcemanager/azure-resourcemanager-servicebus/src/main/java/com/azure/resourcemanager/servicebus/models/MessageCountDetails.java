// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Message Count Details. */
@Immutable
public final class MessageCountDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MessageCountDetails.class);

    /*
     * Number of active messages in the queue, topic, or subscription.
     */
    @JsonProperty(value = "activeMessageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long activeMessageCount;

    /*
     * Number of messages that are dead lettered.
     */
    @JsonProperty(value = "deadLetterMessageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long deadLetterMessageCount;

    /*
     * Number of scheduled messages.
     */
    @JsonProperty(value = "scheduledMessageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long scheduledMessageCount;

    /*
     * Number of messages transferred to another queue, topic, or subscription.
     */
    @JsonProperty(value = "transferMessageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long transferMessageCount;

    /*
     * Number of messages transferred into dead letters.
     */
    @JsonProperty(value = "transferDeadLetterMessageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long transferDeadLetterMessageCount;

    /**
     * Get the activeMessageCount property: Number of active messages in the queue, topic, or subscription.
     *
     * @return the activeMessageCount value.
     */
    public Long activeMessageCount() {
        return this.activeMessageCount;
    }

    /**
     * Get the deadLetterMessageCount property: Number of messages that are dead lettered.
     *
     * @return the deadLetterMessageCount value.
     */
    public Long deadLetterMessageCount() {
        return this.deadLetterMessageCount;
    }

    /**
     * Get the scheduledMessageCount property: Number of scheduled messages.
     *
     * @return the scheduledMessageCount value.
     */
    public Long scheduledMessageCount() {
        return this.scheduledMessageCount;
    }

    /**
     * Get the transferMessageCount property: Number of messages transferred to another queue, topic, or subscription.
     *
     * @return the transferMessageCount value.
     */
    public Long transferMessageCount() {
        return this.transferMessageCount;
    }

    /**
     * Get the transferDeadLetterMessageCount property: Number of messages transferred into dead letters.
     *
     * @return the transferDeadLetterMessageCount value.
     */
    public Long transferDeadLetterMessageCount() {
        return this.transferDeadLetterMessageCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
