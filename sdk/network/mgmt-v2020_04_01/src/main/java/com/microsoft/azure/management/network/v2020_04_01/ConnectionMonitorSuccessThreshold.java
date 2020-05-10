/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the threshold for declaring a test successful.
 */
public class ConnectionMonitorSuccessThreshold {
    /**
     * The maximum percentage of failed checks permitted for a test to evaluate
     * as successful.
     */
    @JsonProperty(value = "checksFailedPercent")
    private Integer checksFailedPercent;

    /**
     * The maximum round-trip time in milliseconds permitted for a test to
     * evaluate as successful.
     */
    @JsonProperty(value = "roundTripTimeMs")
    private Double roundTripTimeMs;

    /**
     * Get the maximum percentage of failed checks permitted for a test to evaluate as successful.
     *
     * @return the checksFailedPercent value
     */
    public Integer checksFailedPercent() {
        return this.checksFailedPercent;
    }

    /**
     * Set the maximum percentage of failed checks permitted for a test to evaluate as successful.
     *
     * @param checksFailedPercent the checksFailedPercent value to set
     * @return the ConnectionMonitorSuccessThreshold object itself.
     */
    public ConnectionMonitorSuccessThreshold withChecksFailedPercent(Integer checksFailedPercent) {
        this.checksFailedPercent = checksFailedPercent;
        return this;
    }

    /**
     * Get the maximum round-trip time in milliseconds permitted for a test to evaluate as successful.
     *
     * @return the roundTripTimeMs value
     */
    public Double roundTripTimeMs() {
        return this.roundTripTimeMs;
    }

    /**
     * Set the maximum round-trip time in milliseconds permitted for a test to evaluate as successful.
     *
     * @param roundTripTimeMs the roundTripTimeMs value to set
     * @return the ConnectionMonitorSuccessThreshold object itself.
     */
    public ConnectionMonitorSuccessThreshold withRoundTripTimeMs(Double roundTripTimeMs) {
        this.roundTripTimeMs = roundTripTimeMs;
        return this;
    }

}
