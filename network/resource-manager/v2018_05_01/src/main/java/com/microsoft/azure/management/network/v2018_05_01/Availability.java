/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Availability of the metric.
 */
public class Availability {
    /**
     * The time grain of the availability.
     */
    @JsonProperty(value = "timeGrain")
    private String timeGrain;

    /**
     * The retention of the availability.
     */
    @JsonProperty(value = "retention")
    private String retention;

    /**
     * Duration of the availability blob.
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
     * @return the Availability object itself.
     */
    public Availability withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the retention value.
     *
     * @return the retention value
     */
    public String retention() {
        return this.retention;
    }

    /**
     * Set the retention value.
     *
     * @param retention the retention value to set
     * @return the Availability object itself.
     */
    public Availability withRetention(String retention) {
        this.retention = retention;
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
     * @return the Availability object itself.
     */
    public Availability withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
        return this;
    }

}
