// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.containerregistry.EventRequestMessage;
import com.azure.management.containerregistry.EventResponseMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Event model. */
@Fluent
public final class EventInner extends EventInfoInner {
    /*
     * The event request message sent to the service URI.
     */
    @JsonProperty(value = "eventRequestMessage")
    private EventRequestMessage eventRequestMessage;

    /*
     * The event response message received from the service URI.
     */
    @JsonProperty(value = "eventResponseMessage")
    private EventResponseMessage eventResponseMessage;

    /**
     * Get the eventRequestMessage property: The event request message sent to the service URI.
     *
     * @return the eventRequestMessage value.
     */
    public EventRequestMessage eventRequestMessage() {
        return this.eventRequestMessage;
    }

    /**
     * Set the eventRequestMessage property: The event request message sent to the service URI.
     *
     * @param eventRequestMessage the eventRequestMessage value to set.
     * @return the EventInner object itself.
     */
    public EventInner withEventRequestMessage(EventRequestMessage eventRequestMessage) {
        this.eventRequestMessage = eventRequestMessage;
        return this;
    }

    /**
     * Get the eventResponseMessage property: The event response message received from the service URI.
     *
     * @return the eventResponseMessage value.
     */
    public EventResponseMessage eventResponseMessage() {
        return this.eventResponseMessage;
    }

    /**
     * Set the eventResponseMessage property: The event response message received from the service URI.
     *
     * @param eventResponseMessage the eventResponseMessage value to set.
     * @return the EventInner object itself.
     */
    public EventInner withEventResponseMessage(EventResponseMessage eventResponseMessage) {
        this.eventResponseMessage = eventResponseMessage;
        return this;
    }
}
