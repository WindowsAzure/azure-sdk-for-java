// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AnalyzeJobState model. */
@Fluent
public final class AnalyzeJobState extends AnalyzeJobMetadata {
    /*
     * The errors property.
     */
    @JsonProperty(value = "errors")
    private List<TextAnalyticsError> errors;

    /*
     * if showStats=true was specified in the request this field will contain
     * information about the request payload.
     */
    @JsonProperty(value = "statistics")
    private RequestStatistics statistics;

    /*
     * The tasks property.
     */
    @JsonProperty(value = "tasks", required = true)
    private TasksStateTasks tasks;

    /*
     * The @nextLink property.
     */
    @JsonProperty(value = "@nextLink")
    private String nextLink;

    /**
     * Get the errors property: The errors property.
     *
     * @return the errors value.
     */
    public List<TextAnalyticsError> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: The errors property.
     *
     * @param errors the errors value to set.
     * @return the AnalyzeJobState object itself.
     */
    public AnalyzeJobState setErrors(List<TextAnalyticsError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the statistics property: if showStats=true was specified in the request this field will contain information
     * about the request payload.
     *
     * @return the statistics value.
     */
    public RequestStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: if showStats=true was specified in the request this field will contain information
     * about the request payload.
     *
     * @param statistics the statistics value to set.
     * @return the AnalyzeJobState object itself.
     */
    public AnalyzeJobState setStatistics(RequestStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * Get the tasks property: The tasks property.
     *
     * @return the tasks value.
     */
    public TasksStateTasks getTasks() {
        return this.tasks;
    }

    /**
     * Set the tasks property: The tasks property.
     *
     * @param tasks the tasks value to set.
     * @return the AnalyzeJobState object itself.
     */
    public AnalyzeJobState setTasks(TasksStateTasks tasks) {
        this.tasks = tasks;
        return this;
    }

    /**
     * Get the nextLink property: The @nextLink property.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The @nextLink property.
     *
     * @param nextLink the nextLink value to set.
     * @return the AnalyzeJobState object itself.
     */
    public AnalyzeJobState setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
