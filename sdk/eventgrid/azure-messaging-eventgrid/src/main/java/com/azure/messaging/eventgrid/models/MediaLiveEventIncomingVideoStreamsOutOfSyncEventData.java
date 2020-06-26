/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.messaging.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Incoming video stream out of synch event data.
 */
public class MediaLiveEventIncomingVideoStreamsOutOfSyncEventData {
    /**
     * Gets the first timestamp received for one of the quality levels.
     */
    @JsonProperty(value = "firstTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String firstTimestamp;

    /**
     * Gets the duration of the data chunk with first timestamp.
     */
    @JsonProperty(value = "firstDuration", access = JsonProperty.Access.WRITE_ONLY)
    private String firstDuration;

    /**
     * Gets the timestamp received for some other quality levels.
     */
    @JsonProperty(value = "secondTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String secondTimestamp;

    /**
     * Gets the duration of the data chunk with second timestamp.
     */
    @JsonProperty(value = "secondDuration", access = JsonProperty.Access.WRITE_ONLY)
    private String secondDuration;

    /**
     * Gets the timescale in which both the timestamps and durations are
     * represented.
     */
    @JsonProperty(value = "timescale", access = JsonProperty.Access.WRITE_ONLY)
    private String timescale;

    /**
     * Get gets the first timestamp received for one of the quality levels.
     *
     * @return the firstTimestamp value
     */
    public String firstTimestamp() {
        return this.firstTimestamp;
    }

    /**
     * Get gets the duration of the data chunk with first timestamp.
     *
     * @return the firstDuration value
     */
    public String firstDuration() {
        return this.firstDuration;
    }

    /**
     * Get gets the timestamp received for some other quality levels.
     *
     * @return the secondTimestamp value
     */
    public String secondTimestamp() {
        return this.secondTimestamp;
    }

    /**
     * Get gets the duration of the data chunk with second timestamp.
     *
     * @return the secondDuration value
     */
    public String secondDuration() {
        return this.secondDuration;
    }

    /**
     * Get gets the timescale in which both the timestamps and durations are represented.
     *
     * @return the timescale value
     */
    public String timescale() {
        return this.timescale;
    }

}
