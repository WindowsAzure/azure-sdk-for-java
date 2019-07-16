/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response for a Match request.
 */
public class MatchResponse {
    /**
     * The tracking id.
     */
    @JsonProperty(value = "TrackingId")
    private String trackingId;

    /**
     * The cache id.
     */
    @JsonProperty(value = "CacheID")
    private String cacheID;

    /**
     * Indicates if there is a match.
     */
    @JsonProperty(value = "IsMatch")
    private Boolean isMatch;

    /**
     * The match details.
     */
    @JsonProperty(value = "Matches")
    private List<Match> matches;

    /**
     * The evaluate status.
     */
    @JsonProperty(value = "Status")
    private Status status;

    /**
     * Get the tracking id.
     *
     * @return the trackingId value
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Set the tracking id.
     *
     * @param trackingId the trackingId value to set
     * @return the MatchResponse object itself.
     */
    public MatchResponse withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get the cache id.
     *
     * @return the cacheID value
     */
    public String cacheID() {
        return this.cacheID;
    }

    /**
     * Set the cache id.
     *
     * @param cacheID the cacheID value to set
     * @return the MatchResponse object itself.
     */
    public MatchResponse withCacheID(String cacheID) {
        this.cacheID = cacheID;
        return this;
    }

    /**
     * Get indicates if there is a match.
     *
     * @return the isMatch value
     */
    public Boolean isMatch() {
        return this.isMatch;
    }

    /**
     * Set indicates if there is a match.
     *
     * @param isMatch the isMatch value to set
     * @return the MatchResponse object itself.
     */
    public MatchResponse withIsMatch(Boolean isMatch) {
        this.isMatch = isMatch;
        return this;
    }

    /**
     * Get the match details.
     *
     * @return the matches value
     */
    public List<Match> matches() {
        return this.matches;
    }

    /**
     * Set the match details.
     *
     * @param matches the matches value to set
     * @return the MatchResponse object itself.
     */
    public MatchResponse withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    /**
     * Get the evaluate status.
     *
     * @return the status value
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the evaluate status.
     *
     * @param status the status value to set
     * @return the MatchResponse object itself.
     */
    public MatchResponse withStatus(Status status) {
        this.status = status;
        return this;
    }

}
