/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.messaging.eventgrid.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for an
 * Microsoft.Cache.PatchingCompleted event.
 */
public class RedisPatchingCompletedEventData {
    /**
     * The time at which the event occurred.
     */
    @JsonProperty(value = "timestamp")
    private DateTime timestamp;

    /**
     * The name of this event.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The status of this event. Failed or  succeeded.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get the time at which the event occurred.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the time at which the event occurred.
     *
     * @param timestamp the timestamp value to set
     * @return the RedisPatchingCompletedEventData object itself.
     */
    public RedisPatchingCompletedEventData withTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the name of this event.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of this event.
     *
     * @param name the name value to set
     * @return the RedisPatchingCompletedEventData object itself.
     */
    public RedisPatchingCompletedEventData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status of this event. Failed or  succeeded.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status of this event. Failed or  succeeded.
     *
     * @param status the status value to set
     * @return the RedisPatchingCompletedEventData object itself.
     */
    public RedisPatchingCompletedEventData withStatus(String status) {
        this.status = status;
        return this;
    }

}
