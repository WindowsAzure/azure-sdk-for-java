/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * POST body schema to query the knowledgebase.
 */
public class QueryDTO {
    /**
     * Exact qnaId to fetch from the knowledgebase, this field takes priority
     * over question.
     */
    @JsonProperty(value = "qnaId")
    private String qnaId;

    /**
     * User question to query against the knowledge base.
     */
    @JsonProperty(value = "question")
    private String question;

    /**
     * Max number of answers to be returned for the question.
     */
    @JsonProperty(value = "top")
    private Integer top;

    /**
     * Unique identifier for the user.
     */
    @JsonProperty(value = "userId")
    private String userId;

    /**
     * Query against the test index.
     */
    @JsonProperty(value = "isTest")
    private Boolean isTest;

    /**
     * Threshold for answers returned based on score.
     */
    @JsonProperty(value = "scoreThreshold")
    private Double scoreThreshold;

    /**
     * Context object with previous QnA's information.
     */
    @JsonProperty(value = "context")
    private QueryDTOContext context;

    /**
     * Optional field. Set to 'QuestionOnly' for using a question only Ranker.
     */
    @JsonProperty(value = "rankerType")
    private String rankerType;

    /**
     * Find only answers that contain these metadata.
     */
    @JsonProperty(value = "strictFilters")
    private List<MetadataDTO> strictFilters;

    /**
     * Get the qnaId value.
     *
     * @return the qnaId value
     */
    public String qnaId() {
        return this.qnaId;
    }

    /**
     * Set the qnaId value.
     *
     * @param qnaId the qnaId value to set
     * @return the QueryDTO object itself.
     */
    public QueryDTO withQnaId(String qnaId) {
        this.qnaId = qnaId;
        return this;
    }

    /**
     * Get the question value.
     *
     * @return the question value
     */
    public String question() {
        return this.question;
    }

    /**
     * Set the question value.
     *
     * @param question the question value to set
     * @return the QueryDTO object itself.
     */
    public QueryDTO withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * Get the top value.
     *
     * @return the top value
     */
    public Integer top() {
        return this.top;
    }

    /**
     * Set the top value.
     *
     * @param top the top value to set
     * @return the QueryDTO object itself.
     */
    public QueryDTO withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * Get the userId value.
     *
     * @return the userId value
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set the userId value.
     *
     * @param userId the userId value to set
     * @return the QueryDTO object itself.
     */
    public QueryDTO withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the isTest value.
     *
     * @return the isTest value
     */
    public Boolean isTest() {
        return this.isTest;
    }

    /**
     * Set the isTest value.
     *
     * @param isTest the isTest value to set
     * @return the QueryDTO object itself.
     */
    public QueryDTO withIsTest(Boolean isTest) {
        this.isTest = isTest;
        return this;
    }

    /**
     * Get the scoreThreshold value.
     *
     * @return the scoreThreshold value
     */
    public Double scoreThreshold() {
        return this.scoreThreshold;
    }

    /**
     * Set the scoreThreshold value.
     *
     * @param scoreThreshold the scoreThreshold value to set
     * @return the QueryDTO object itself.
     */
    public QueryDTO withScoreThreshold(Double scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }

    /**
     * Get the context value.
     *
     * @return the context value
     */
    public QueryDTOContext context() {
        return this.context;
    }

    /**
     * Set the context value.
     *
     * @param context the context value to set
     * @return the QueryDTO object itself.
     */
    public QueryDTO withContext(QueryDTOContext context) {
        this.context = context;
        return this;
    }

    /**
     * Get the rankerType value.
     *
     * @return the rankerType value
     */
    public String rankerType() {
        return this.rankerType;
    }

    /**
     * Set the rankerType value.
     *
     * @param rankerType the rankerType value to set
     * @return the QueryDTO object itself.
     */
    public QueryDTO withRankerType(String rankerType) {
        this.rankerType = rankerType;
        return this;
    }

    /**
     * Get the strictFilters value.
     *
     * @return the strictFilters value
     */
    public List<MetadataDTO> strictFilters() {
        return this.strictFilters;
    }

    /**
     * Set the strictFilters value.
     *
     * @param strictFilters the strictFilters value to set
     * @return the QueryDTO object itself.
     */
    public QueryDTO withStrictFilters(List<MetadataDTO> strictFilters) {
        this.strictFilters = strictFilters;
        return this;
    }

}
