/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the TCP configuration.
 */
public class ConnectionMonitorTcpConfiguration {
    /**
     * The port to connect to.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Value indicating whether path evaluation with trace route should be
     * disabled.
     */
    @JsonProperty(value = "disableTraceRoute")
    private Boolean disableTraceRoute;

    /**
     * Get the port to connect to.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port to connect to.
     *
     * @param port the port value to set
     * @return the ConnectionMonitorTcpConfiguration object itself.
     */
    public ConnectionMonitorTcpConfiguration withPort(Integer port) {
        this.port = port;
        return this;
    }

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
     * @return the ConnectionMonitorTcpConfiguration object itself.
     */
    public ConnectionMonitorTcpConfiguration withDisableTraceRoute(Boolean disableTraceRoute) {
        this.disableTraceRoute = disableTraceRoute;
        return this;
    }

}
