// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * An answer is a text passage extracted from the contents of the most relevant documents that matched the query.
 * Answers are extracted from the top search results. Answer candidates are scored and the top answers are selected.
 */
@Fluent
public final class AnswerResult {
    /*
     * The score value represents how relevant the answer is to the the query
     * relative to other answers returned for the query.
     */
    @JsonProperty(value = "score", access = JsonProperty.Access.WRITE_ONLY)
    private Double score;

    /*
     * The key of the document the answer was extracted from.
     */
    @JsonProperty(value = "key", access = JsonProperty.Access.WRITE_ONLY)
    private String key;

    /*
     * The text passage extracted from the document contents as the answer.
     */
    @JsonProperty(value = "text", access = JsonProperty.Access.WRITE_ONLY)
    private String text;

    /*
     * Same text passage as in the Text property with highlighted text phrases
     * most relevant to the query.
     */
    @JsonProperty(value = "highlights", access = JsonProperty.Access.WRITE_ONLY)
    private String highlights;

    /*
     * An answer is a text passage extracted from the contents of the most
     * relevant documents that matched the query. Answers are extracted from
     * the top search results. Answer candidates are scored and the top answers
     * are selected.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the score property: The score value represents how relevant the answer is to the the query relative to other
     * answers returned for the query.
     *
     * @return the score value.
     */
    public Double getScore() {
        return this.score;
    }

    /**
     * Get the key property: The key of the document the answer was extracted from.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Get the text property: The text passage extracted from the document contents as the answer.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the highlights property: Same text passage as in the Text property with highlighted text phrases most
     * relevant to the query.
     *
     * @return the highlights value.
     */
    public String getHighlights() {
        return this.highlights;
    }

    /**
     * Get the additionalProperties property: An answer is a text passage extracted from the contents of the most
     * relevant documents that matched the query. Answers are extracted from the top search results. Answer candidates
     * are scored and the top answers are selected.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: An answer is a text passage extracted from the contents of the most
     * relevant documents that matched the query. Answers are extracted from the top search results. Answer candidates
     * are scored and the top answers are selected.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the AnswerResult object itself.
     */
    public AnswerResult setAdditionalProperties(Map<String, Object> additionalProperties) {
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
}
