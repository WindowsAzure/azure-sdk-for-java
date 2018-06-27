/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.EventRequestMessage;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.EventResponseMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The event for a webhook.
 */
public class EventInner extends EventInfoInner {
    /**
     * The event request message sent to the service URI.
     */
    @JsonProperty(value = "eventRequestMessage")
    private EventRequestMessage eventRequestMessage;

    /**
     * The event response message received from the service URI.
     */
    @JsonProperty(value = "eventResponseMessage")
    private EventResponseMessage eventResponseMessage;

    /**
     * Get the event request message sent to the service URI.
     *
     * @return the eventRequestMessage value
     */
    public EventRequestMessage eventRequestMessage() {
        return this.eventRequestMessage;
    }

    /**
     * Set the event request message sent to the service URI.
     *
     * @param eventRequestMessage the eventRequestMessage value to set
     * @return the EventInner object itself.
     */
    public EventInner withEventRequestMessage(EventRequestMessage eventRequestMessage) {
        this.eventRequestMessage = eventRequestMessage;
        return this;
    }

    /**
     * Get the event response message received from the service URI.
     *
     * @return the eventResponseMessage value
     */
    public EventResponseMessage eventResponseMessage() {
        return this.eventResponseMessage;
    }

    /**
     * Set the event response message received from the service URI.
     *
     * @param eventResponseMessage the eventResponseMessage value to set
     * @return the EventInner object itself.
     */
    public EventInner withEventResponseMessage(EventResponseMessage eventResponseMessage) {
        this.eventResponseMessage = eventResponseMessage;
        return this;
    }

}
