/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metrics availability and retention.
 */
public class ResourceMetricAvailability {
    /**
     * Time grain .
     */
    @JsonProperty(value = "timeGrain", access = JsonProperty.Access.WRITE_ONLY)
    private String timeGrain;

    /**
     * Retention period for the current time grain.
     */
    @JsonProperty(value = "retention", access = JsonProperty.Access.WRITE_ONLY)
    private String retention;

    /**
     * Get time grain .
     *
     * @return the timeGrain value
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Get retention period for the current time grain.
     *
     * @return the retention value
     */
    public String retention() {
        return this.retention;
    }

}
