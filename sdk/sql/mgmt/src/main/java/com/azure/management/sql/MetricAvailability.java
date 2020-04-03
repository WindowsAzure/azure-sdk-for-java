// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MetricAvailability model.
 */
@Immutable
public final class MetricAvailability {
    /*
     * The length of retention for the database metric.
     */
    @JsonProperty(value = "retention", access = JsonProperty.Access.WRITE_ONLY)
    private String retention;

    /*
     * The granularity of the database metric.
     */
    @JsonProperty(value = "timeGrain", access = JsonProperty.Access.WRITE_ONLY)
    private String timeGrain;

    /**
     * Get the retention property: The length of retention for the database
     * metric.
     * 
     * @return the retention value.
     */
    public String retention() {
        return this.retention;
    }

    /**
     * Get the timeGrain property: The granularity of the database metric.
     * 
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }
}
