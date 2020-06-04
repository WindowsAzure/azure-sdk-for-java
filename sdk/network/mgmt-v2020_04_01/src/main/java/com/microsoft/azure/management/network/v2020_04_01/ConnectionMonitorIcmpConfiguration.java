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
 * Describes the ICMP configuration.
 */
public class ConnectionMonitorIcmpConfiguration {
    /**
     * Value indicating whether path evaluation with trace route should be
     * disabled.
     */
    @JsonProperty(value = "disableTraceRoute")
    private Boolean disableTraceRoute;

    /**
     * Get value indicating whether path evaluation with trace route should be disabled.
     *
     * @return the disableTraceRoute value
     */
    public Boolean disableTraceRoute() {
        return this.disableTraceRoute;
    }

    /**
     * Set value indicating whether path evaluation with trace route should be disabled.
     *
     * @param disableTraceRoute the disableTraceRoute value to set
     * @return the ConnectionMonitorIcmpConfiguration object itself.
     */
    public ConnectionMonitorIcmpConfiguration withDisableTraceRoute(Boolean disableTraceRoute) {
        this.disableTraceRoute = disableTraceRoute;
        return this;
    }

}
