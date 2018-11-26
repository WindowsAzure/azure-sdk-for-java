/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The presentation time range, this is asset related and not recommended for
 * Account Filter.
 */
public class PresentationTimeRange {
    /**
     * The absolute start time boundary.
     */
    @JsonProperty(value = "startTimestamp", required = true)
    private long startTimestamp;

    /**
     * The absolute end time boundary.
     */
    @JsonProperty(value = "endTimestamp", required = true)
    private long endTimestamp;

    /**
     * The relative to end sliding window.
     */
    @JsonProperty(value = "presentationWindowDuration", required = true)
    private long presentationWindowDuration;

    /**
     * The relative to end right edge.
     */
    @JsonProperty(value = "liveBackoffDuration", required = true)
    private long liveBackoffDuration;

    /**
     * The time scale of time stamps.
     */
    @JsonProperty(value = "timescale", required = true)
    private long timescale;

    /**
     * The indicator of forcing exsiting of end time stamp.
     */
    @JsonProperty(value = "forceEndTimestamp", required = true)
    private boolean forceEndTimestamp;

    /**
     * Get the absolute start time boundary.
     *
     * @return the startTimestamp value
     */
    public long startTimestamp() {
        return this.startTimestamp;
    }

    /**
     * Set the absolute start time boundary.
     *
     * @param startTimestamp the startTimestamp value to set
     * @return the PresentationTimeRange object itself.
     */
    public PresentationTimeRange withStartTimestamp(long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * Get the absolute end time boundary.
     *
     * @return the endTimestamp value
     */
    public long endTimestamp() {
        return this.endTimestamp;
    }

    /**
     * Set the absolute end time boundary.
     *
     * @param endTimestamp the endTimestamp value to set
     * @return the PresentationTimeRange object itself.
     */
    public PresentationTimeRange withEndTimestamp(long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    /**
     * Get the relative to end sliding window.
     *
     * @return the presentationWindowDuration value
     */
    public long presentationWindowDuration() {
        return this.presentationWindowDuration;
    }

    /**
     * Set the relative to end sliding window.
     *
     * @param presentationWindowDuration the presentationWindowDuration value to set
     * @return the PresentationTimeRange object itself.
     */
    public PresentationTimeRange withPresentationWindowDuration(long presentationWindowDuration) {
        this.presentationWindowDuration = presentationWindowDuration;
        return this;
    }

    /**
     * Get the relative to end right edge.
     *
     * @return the liveBackoffDuration value
     */
    public long liveBackoffDuration() {
        return this.liveBackoffDuration;
    }

    /**
     * Set the relative to end right edge.
     *
     * @param liveBackoffDuration the liveBackoffDuration value to set
     * @return the PresentationTimeRange object itself.
     */
    public PresentationTimeRange withLiveBackoffDuration(long liveBackoffDuration) {
        this.liveBackoffDuration = liveBackoffDuration;
        return this;
    }

    /**
     * Get the time scale of time stamps.
     *
     * @return the timescale value
     */
    public long timescale() {
        return this.timescale;
    }

    /**
     * Set the time scale of time stamps.
     *
     * @param timescale the timescale value to set
     * @return the PresentationTimeRange object itself.
     */
    public PresentationTimeRange withTimescale(long timescale) {
        this.timescale = timescale;
        return this;
    }

    /**
     * Get the indicator of forcing exsiting of end time stamp.
     *
     * @return the forceEndTimestamp value
     */
    public boolean forceEndTimestamp() {
        return this.forceEndTimestamp;
    }

    /**
     * Set the indicator of forcing exsiting of end time stamp.
     *
     * @param forceEndTimestamp the forceEndTimestamp value to set
     * @return the PresentationTimeRange object itself.
     */
    public PresentationTimeRange withForceEndTimestamp(boolean forceEndTimestamp) {
        this.forceEndTimestamp = forceEndTimestamp;
        return this;
    }

}
