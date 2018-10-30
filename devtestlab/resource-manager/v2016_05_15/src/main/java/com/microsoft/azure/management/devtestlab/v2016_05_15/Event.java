/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An event to be notified for.
 */
public class Event {
    /**
     * The event type for which this notification is enabled (i.e.
     * AutoShutdown, Cost). Possible values include: 'AutoShutdown', 'Cost'.
     */
    @JsonProperty(value = "eventName")
    private NotificationChannelEventType eventName;

    /**
     * Get the event type for which this notification is enabled (i.e. AutoShutdown, Cost). Possible values include: 'AutoShutdown', 'Cost'.
     *
     * @return the eventName value
     */
    public NotificationChannelEventType eventName() {
        return this.eventName;
    }

    /**
     * Set the event type for which this notification is enabled (i.e. AutoShutdown, Cost). Possible values include: 'AutoShutdown', 'Cost'.
     *
     * @param eventName the eventName value to set
     * @return the Event object itself.
     */
    public Event withEventName(NotificationChannelEventType eventName) {
        this.eventName = eventName;
        return this;
    }

}
