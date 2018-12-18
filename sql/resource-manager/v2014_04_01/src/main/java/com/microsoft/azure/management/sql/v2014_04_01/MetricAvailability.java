/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A metric availability value.
 */
public class MetricAvailability {
    /**
     * The length of retention for the database metric.
     */
    @JsonProperty(value = "retention", access = JsonProperty.Access.WRITE_ONLY)
    private String retention;

    /**
     * The granularity of the database metric.
     */
    @JsonProperty(value = "timeGrain", access = JsonProperty.Access.WRITE_ONLY)
    private String timeGrain;

    /**
     * Get the length of retention for the database metric.
     *
     * @return the retention value
     */
    public String retention() {
        return this.retention;
    }

    /**
     * Get the granularity of the database metric.
     *
     * @return the timeGrain value
     */
    public String timeGrain() {
        return this.timeGrain;
    }

}
