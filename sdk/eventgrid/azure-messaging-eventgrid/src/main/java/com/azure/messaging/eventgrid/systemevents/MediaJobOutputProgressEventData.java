// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Job Output Progress Event Data. Schema of the Data property of an EventGridEvent for a
 * Microsoft.Media.JobOutputProgress event.
 */
@Fluent
public final class MediaJobOutputProgressEventData {
    /*
     * Gets the Job output label.
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * Gets the Job output progress.
     */
    @JsonProperty(value = "progress")
    private Long progress;

    /*
     * Gets the Job correlation data.
     */
    @JsonProperty(value = "jobCorrelationData")
    private Map<String, String> jobCorrelationData;

    /**
     * Get the label property: Gets the Job output label.
     *
     * @return the label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Set the label property: Gets the Job output label.
     *
     * @param label the label value to set.
     * @return the MediaJobOutputProgressEventData object itself.
     */
    public MediaJobOutputProgressEventData setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the progress property: Gets the Job output progress.
     *
     * @return the progress value.
     */
    public Long getProgress() {
        return this.progress;
    }

    /**
     * Set the progress property: Gets the Job output progress.
     *
     * @param progress the progress value to set.
     * @return the MediaJobOutputProgressEventData object itself.
     */
    public MediaJobOutputProgressEventData setProgress(Long progress) {
        this.progress = progress;
        return this;
    }

    /**
     * Get the jobCorrelationData property: Gets the Job correlation data.
     *
     * @return the jobCorrelationData value.
     */
    public Map<String, String> getJobCorrelationData() {
        return this.jobCorrelationData;
    }

    /**
     * Set the jobCorrelationData property: Gets the Job correlation data.
     *
     * @param jobCorrelationData the jobCorrelationData value to set.
     * @return the MediaJobOutputProgressEventData object itself.
     */
    public MediaJobOutputProgressEventData setJobCorrelationData(Map<String, String> jobCorrelationData) {
        this.jobCorrelationData = jobCorrelationData;
        return this;
    }
}
