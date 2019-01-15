/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains stats associated with the peering.
 */
public class ExpressRouteCircuitStatsInner {
    /**
     * Gets BytesIn of the peering.
     */
    @JsonProperty(value = "primarybytesIn")
    private Long primarybytesIn;

    /**
     * Gets BytesOut of the peering.
     */
    @JsonProperty(value = "primarybytesOut")
    private Long primarybytesOut;

    /**
     * Gets BytesIn of the peering.
     */
    @JsonProperty(value = "secondarybytesIn")
    private Long secondarybytesIn;

    /**
     * Gets BytesOut of the peering.
     */
    @JsonProperty(value = "secondarybytesOut")
    private Long secondarybytesOut;

    /**
     * Get gets BytesIn of the peering.
     *
     * @return the primarybytesIn value
     */
    public Long primarybytesIn() {
        return this.primarybytesIn;
    }

    /**
     * Set gets BytesIn of the peering.
     *
     * @param primarybytesIn the primarybytesIn value to set
     * @return the ExpressRouteCircuitStatsInner object itself.
     */
    public ExpressRouteCircuitStatsInner withPrimarybytesIn(Long primarybytesIn) {
        this.primarybytesIn = primarybytesIn;
        return this;
    }

    /**
     * Get gets BytesOut of the peering.
     *
     * @return the primarybytesOut value
     */
    public Long primarybytesOut() {
        return this.primarybytesOut;
    }

    /**
     * Set gets BytesOut of the peering.
     *
     * @param primarybytesOut the primarybytesOut value to set
     * @return the ExpressRouteCircuitStatsInner object itself.
     */
    public ExpressRouteCircuitStatsInner withPrimarybytesOut(Long primarybytesOut) {
        this.primarybytesOut = primarybytesOut;
        return this;
    }

    /**
     * Get gets BytesIn of the peering.
     *
     * @return the secondarybytesIn value
     */
    public Long secondarybytesIn() {
        return this.secondarybytesIn;
    }

    /**
     * Set gets BytesIn of the peering.
     *
     * @param secondarybytesIn the secondarybytesIn value to set
     * @return the ExpressRouteCircuitStatsInner object itself.
     */
    public ExpressRouteCircuitStatsInner withSecondarybytesIn(Long secondarybytesIn) {
        this.secondarybytesIn = secondarybytesIn;
        return this;
    }

    /**
     * Get gets BytesOut of the peering.
     *
     * @return the secondarybytesOut value
     */
    public Long secondarybytesOut() {
        return this.secondarybytesOut;
    }

    /**
     * Set gets BytesOut of the peering.
     *
     * @param secondarybytesOut the secondarybytesOut value to set
     * @return the ExpressRouteCircuitStatsInner object itself.
     */
    public ExpressRouteCircuitStatsInner withSecondarybytesOut(Long secondarybytesOut) {
        this.secondarybytesOut = secondarybytesOut;
        return this;
    }

}
