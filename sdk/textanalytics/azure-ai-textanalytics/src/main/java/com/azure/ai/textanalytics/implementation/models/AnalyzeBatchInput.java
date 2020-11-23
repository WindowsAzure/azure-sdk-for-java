// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AnalyzeBatchInput model. */
@Fluent
public final class AnalyzeBatchInput extends JobDescriptor {
    /*
     * Contains a set of input documents to be analyzed by the service.
     */
    @JsonProperty(value = "analysisInput", required = true)
    private MultiLanguageBatchInput analysisInput;

    /*
     * The set of tasks to execute on the input documents. Cannot specify the
     * same task more than once.
     */
    @JsonProperty(value = "tasks", required = true)
    private JobManifestTasks tasks;

    /**
     * Get the analysisInput property: Contains a set of input documents to be analyzed by the service.
     *
     * @return the analysisInput value.
     */
    public MultiLanguageBatchInput getAnalysisInput() {
        return this.analysisInput;
    }

    /**
     * Set the analysisInput property: Contains a set of input documents to be analyzed by the service.
     *
     * @param analysisInput the analysisInput value to set.
     * @return the AnalyzeBatchInput object itself.
     */
    public AnalyzeBatchInput setAnalysisInput(MultiLanguageBatchInput analysisInput) {
        this.analysisInput = analysisInput;
        return this;
    }

    /**
     * Get the tasks property: The set of tasks to execute on the input documents. Cannot specify the same task more
     * than once.
     *
     * @return the tasks value.
     */
    public JobManifestTasks getTasks() {
        return this.tasks;
    }

    /**
     * Set the tasks property: The set of tasks to execute on the input documents. Cannot specify the same task more
     * than once.
     *
     * @param tasks the tasks value to set.
     * @return the AnalyzeBatchInput object itself.
     */
    public AnalyzeBatchInput setTasks(JobManifestTasks tasks) {
        this.tasks = tasks;
        return this;
    }
}
