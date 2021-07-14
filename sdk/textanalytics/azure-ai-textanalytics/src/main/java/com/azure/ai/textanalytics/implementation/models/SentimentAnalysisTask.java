// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SentimentAnalysisTask model. */
@Fluent
public final class SentimentAnalysisTask {
    /*
     * The parameters property.
     */
    @JsonProperty(value = "parameters")
    private SentimentAnalysisTaskParameters parameters;

    /*
     * The taskName property.
     */
    @JsonProperty(value = "taskName")
    private String taskName;

    /**
     * Get the parameters property: The parameters property.
     *
     * @return the parameters value.
     */
    public SentimentAnalysisTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     *
     * @param parameters the parameters value to set.
     * @return the SentimentAnalysisTask object itself.
     */
    public SentimentAnalysisTask setParameters(SentimentAnalysisTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the taskName property: The taskName property.
     *
     * @return the taskName value.
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * Set the taskName property: The taskName property.
     *
     * @param taskName the taskName value to set.
     * @return the SentimentAnalysisTask object itself.
     */
    public SentimentAnalysisTask setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
}
