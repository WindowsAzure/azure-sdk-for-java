/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the destination of connection monitor.
 */
public class ConnectionMonitorDestination {
    /**
     * The ID of the resource used as the destination by connection monitor.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Address of the connection monitor destination (IP or domain name).
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * The destination port used by connection monitor.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the resourceId value.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId value.
     *
     * @param resourceId the resourceId value to set
     * @return the ConnectionMonitorDestination object itself.
     */
    public ConnectionMonitorDestination withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the address value.
     *
     * @return the address value
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address value.
     *
     * @param address the address value to set
     * @return the ConnectionMonitorDestination object itself.
     */
    public ConnectionMonitorDestination withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     * @return the ConnectionMonitorDestination object itself.
     */
    public ConnectionMonitorDestination withPort(Integer port) {
        this.port = port;
        return this;
    }

}
