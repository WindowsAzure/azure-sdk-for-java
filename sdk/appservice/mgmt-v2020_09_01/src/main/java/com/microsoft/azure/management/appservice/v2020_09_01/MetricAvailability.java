/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Retention policy of a resource metric.
 */
public class MetricAvailability {
    /**
     * The timeGrain property.
     */
    @JsonProperty(value = "timeGrain")
    private String timeGrain;

    /**
     * The blobDuration property.
     */
    @JsonProperty(value = "blobDuration")
    private String blobDuration;

    /**
     * Get the timeGrain value.
     *
     * @return the timeGrain value
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain value.
     *
     * @param timeGrain the timeGrain value to set
     * @return the MetricAvailability object itself.
     */
    public MetricAvailability withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the blobDuration value.
     *
     * @return the blobDuration value
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set the blobDuration value.
     *
     * @param blobDuration the blobDuration value to set
     * @return the MetricAvailability object itself.
     */
    public MetricAvailability withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
        return this;
    }

}
