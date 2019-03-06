/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines how often data for a metric becomes available.
 */
public class OperationMetricAvailability {
    /**
     * The granularity for the metric.
     */
    @JsonProperty(value = "timeGrain")
    private String timeGrain;

    /**
     * Blob created in the customer storage account, per hour.
     */
    @JsonProperty(value = "blobDuration")
    private String blobDuration;

    /**
     * Get the granularity for the metric.
     *
     * @return the timeGrain value
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the granularity for the metric.
     *
     * @param timeGrain the timeGrain value to set
     * @return the OperationMetricAvailability object itself.
     */
    public OperationMetricAvailability withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get blob created in the customer storage account, per hour.
     *
     * @return the blobDuration value
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set blob created in the customer storage account, per hour.
     *
     * @param blobDuration the blobDuration value to set
     * @return the OperationMetricAvailability object itself.
     */
    public OperationMetricAvailability withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
        return this;
    }

}
