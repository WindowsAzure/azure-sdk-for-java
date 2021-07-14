// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ingest fragment dropped event data. Schema of the data property of an EventGridEvent for a
 * Microsoft.Media.LiveEventIngestHeartbeat event.
 */
@Immutable
public final class MediaLiveEventIngestHeartbeatEventData {
    /*
     * Gets the type of the track (Audio / Video).
     */
    @JsonProperty(value = "trackType", access = JsonProperty.Access.WRITE_ONLY)
    private String trackType;

    /*
     * Gets the track name.
     */
    @JsonProperty(value = "trackName", access = JsonProperty.Access.WRITE_ONLY)
    private String trackName;

    /*
     * Gets the bitrate of the track.
     */
    @JsonProperty(value = "bitrate", access = JsonProperty.Access.WRITE_ONLY)
    private Long bitrate;

    /*
     * Gets the incoming bitrate.
     */
    @JsonProperty(value = "incomingBitrate", access = JsonProperty.Access.WRITE_ONLY)
    private Long incomingBitrate;

    /*
     * Gets the last timestamp.
     */
    @JsonProperty(value = "lastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String lastTimestamp;

    /*
     * Gets the timescale of the last timestamp.
     */
    @JsonProperty(value = "timescale", access = JsonProperty.Access.WRITE_ONLY)
    private String timescale;

    /*
     * Gets the fragment Overlap count.
     */
    @JsonProperty(value = "overlapCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long overlapCount;

    /*
     * Gets the fragment Discontinuity count.
     */
    @JsonProperty(value = "discontinuityCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long discontinuityCount;

    /*
     * Gets Non increasing count.
     */
    @JsonProperty(value = "nonincreasingCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long nonincreasingCount;

    /*
     * Gets a value indicating whether unexpected bitrate is present or not.
     */
    @JsonProperty(value = "unexpectedBitrate", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean unexpectedBitrate;

    /*
     * Gets the state of the live event.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * Gets a value indicating whether preview is healthy or not.
     */
    @JsonProperty(value = "healthy", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean healthy;

    /**
     * Get the trackType property: Gets the type of the track (Audio / Video).
     *
     * @return the trackType value.
     */
    public String getTrackType() {
        return this.trackType;
    }

    /**
     * Get the trackName property: Gets the track name.
     *
     * @return the trackName value.
     */
    public String getTrackName() {
        return this.trackName;
    }

    /**
     * Get the bitrate property: Gets the bitrate of the track.
     *
     * @return the bitrate value.
     */
    public Long getBitrate() {
        return this.bitrate;
    }

    /**
     * Get the incomingBitrate property: Gets the incoming bitrate.
     *
     * @return the incomingBitrate value.
     */
    public Long getIncomingBitrate() {
        return this.incomingBitrate;
    }

    /**
     * Get the lastTimestamp property: Gets the last timestamp.
     *
     * @return the lastTimestamp value.
     */
    public String getLastTimestamp() {
        return this.lastTimestamp;
    }

    /**
     * Get the timescale property: Gets the timescale of the last timestamp.
     *
     * @return the timescale value.
     */
    public String getTimescale() {
        return this.timescale;
    }

    /**
     * Get the overlapCount property: Gets the fragment Overlap count.
     *
     * @return the overlapCount value.
     */
    public Long getOverlapCount() {
        return this.overlapCount;
    }

    /**
     * Get the discontinuityCount property: Gets the fragment Discontinuity count.
     *
     * @return the discontinuityCount value.
     */
    public Long getDiscontinuityCount() {
        return this.discontinuityCount;
    }

    /**
     * Get the nonincreasingCount property: Gets Non increasing count.
     *
     * @return the nonincreasingCount value.
     */
    public Long getNonincreasingCount() {
        return this.nonincreasingCount;
    }

    /**
     * Get the unexpectedBitrate property: Gets a value indicating whether unexpected bitrate is present or not.
     *
     * @return the unexpectedBitrate value.
     */
    public Boolean isUnexpectedBitrate() {
        return this.unexpectedBitrate;
    }

    /**
     * Get the state property: Gets the state of the live event.
     *
     * @return the state value.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Get the healthy property: Gets a value indicating whether preview is healthy or not.
     *
     * @return the healthy value.
     */
    public Boolean isHealthy() {
        return this.healthy;
    }
}
