// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.monitoring.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SparkJobListViewResponse model. */
@Fluent
public final class SparkJobListViewResponse {
    /*
     * The nJobs property.
     */
    @JsonProperty(value = "nJobs")
    private Integer nJobs;

    /*
     * The sparkJobs property.
     */
    @JsonProperty(value = "sparkJobs")
    private List<SparkJob> sparkJobs;

    /**
     * Get the nJobs property: The nJobs property.
     *
     * @return the nJobs value.
     */
    public Integer getNJobs() {
        return this.nJobs;
    }

    /**
     * Set the nJobs property: The nJobs property.
     *
     * @param nJobs the nJobs value to set.
     * @return the SparkJobListViewResponse object itself.
     */
    public SparkJobListViewResponse setNJobs(Integer nJobs) {
        this.nJobs = nJobs;
        return this;
    }

    /**
     * Get the sparkJobs property: The sparkJobs property.
     *
     * @return the sparkJobs value.
     */
    public List<SparkJob> getSparkJobs() {
        return this.sparkJobs;
    }

    /**
     * Set the sparkJobs property: The sparkJobs property.
     *
     * @param sparkJobs the sparkJobs value to set.
     * @return the SparkJobListViewResponse object itself.
     */
    public SparkJobListViewResponse setSparkJobs(List<SparkJob> sparkJobs) {
        this.sparkJobs = sparkJobs;
        return this;
    }
}
