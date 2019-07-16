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
 * The match details.
 */
public class Match {
    /**
     * Confidence score of the image match.
     */
    @JsonProperty(value = "Score")
    private Double score;

    /**
     * The match id.
     */
    @JsonProperty(value = "MatchId")
    private Integer matchId;

    /**
     * The source.
     */
    @JsonProperty(value = "Source")
    private String source;

    /**
     * The tags for match details.
     */
    @JsonProperty(value = "Tags")
    private List<Integer> tags;

    /**
     * The label.
     */
    @JsonProperty(value = "Label")
    private String label;

    /**
     * Get confidence score of the image match.
     *
     * @return the score value
     */
    public Double score() {
        return this.score;
    }

    /**
     * Set confidence score of the image match.
     *
     * @param score the score value to set
     * @return the Match object itself.
     */
    public Match withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * Get the match id.
     *
     * @return the matchId value
     */
    public Integer matchId() {
        return this.matchId;
    }

    /**
     * Set the match id.
     *
     * @param matchId the matchId value to set
     * @return the Match object itself.
     */
    public Match withMatchId(Integer matchId) {
        this.matchId = matchId;
        return this;
    }

    /**
     * Get the source.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source.
     *
     * @param source the source value to set
     * @return the Match object itself.
     */
    public Match withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the tags for match details.
     *
     * @return the tags value
     */
    public List<Integer> tags() {
        return this.tags;
    }

    /**
     * Set the tags for match details.
     *
     * @param tags the tags value to set
     * @return the Match object itself.
     */
    public Match withTags(List<Integer> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the label.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label.
     *
     * @param label the label value to set
     * @return the Match object itself.
     */
    public Match withLabel(String label) {
        this.label = label;
        return this;
    }

}
