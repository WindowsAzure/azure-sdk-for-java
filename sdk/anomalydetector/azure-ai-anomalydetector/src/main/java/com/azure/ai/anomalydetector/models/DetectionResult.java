// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** Anomaly Response of one detection corresponds to a resultId. */
@Fluent
public final class DetectionResult {
    /*
     * The resultId property.
     */
    @JsonProperty(value = "resultId", required = true)
    private UUID resultId;

    /*
     * Multivariate anomaly detection status
     */
    @JsonProperty(value = "summary", required = true)
    private DetectionResultSummary summary;

    /*
     * anomaly status of each timestamp
     */
    @JsonProperty(value = "results", required = true)
    private List<AnomalyState> results;

    /**
     * Get the resultId property: The resultId property.
     *
     * @return the resultId value.
     */
    public UUID getResultId() {
        return this.resultId;
    }

    /**
     * Set the resultId property: The resultId property.
     *
     * @param resultId the resultId value to set.
     * @return the DetectionResult object itself.
     */
    public DetectionResult setResultId(UUID resultId) {
        this.resultId = resultId;
        return this;
    }

    /**
     * Get the summary property: Multivariate anomaly detection status.
     *
     * @return the summary value.
     */
    public DetectionResultSummary getSummary() {
        return this.summary;
    }

    /**
     * Set the summary property: Multivariate anomaly detection status.
     *
     * @param summary the summary value to set.
     * @return the DetectionResult object itself.
     */
    public DetectionResult setSummary(DetectionResultSummary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the results property: anomaly status of each timestamp.
     *
     * @return the results value.
     */
    public List<AnomalyState> getResults() {
        return this.results;
    }

    /**
     * Set the results property: anomaly status of each timestamp.
     *
     * @param results the results value to set.
     * @return the DetectionResult object itself.
     */
    public DetectionResult setResults(List<AnomalyState> results) {
        this.results = results;
        return this;
    }
}
