// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** The SearchResult model. */
@Fluent
public final class SearchResult {
    /*
     * The relevance score of the document compared to other documents returned
     * by the query.
     */
    @JsonProperty(value = "@search.score", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private double score;

    /*
     * Text fragments from the document that indicate the matching search
     * terms, organized by each applicable field; null if hit highlighting was
     * not enabled for the query.
     */
    @JsonProperty(value = "@search.highlights", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, List<String>> highlights;

    /*
     * Contains a document found by a search query, plus associated metadata.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of SearchResult class. */
    @JsonCreator
    public SearchResult(
            @JsonProperty(value = "@search.score", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    double score) {
        this.score = score;
    }

    /**
     * Get the score property: The relevance score of the document compared to other documents returned by the query.
     *
     * @return the score value.
     */
    public double getScore() {
        return this.score;
    }

    /**
     * Get the highlights property: Text fragments from the document that indicate the matching search terms, organized
     * by each applicable field; null if hit highlighting was not enabled for the query.
     *
     * @return the highlights value.
     */
    public Map<String, List<String>> getHighlights() {
        return this.highlights;
    }

    /**
     * Get the additionalProperties property: Contains a document found by a search query, plus associated metadata.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Contains a document found by a search query, plus associated metadata.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the SearchResult object itself.
     */
    public SearchResult setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
