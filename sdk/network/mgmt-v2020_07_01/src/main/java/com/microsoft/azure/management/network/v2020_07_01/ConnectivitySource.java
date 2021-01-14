/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the source of the connection.
 */
public class ConnectivitySource {
    /**
     * The ID of the resource from which a connectivity check will be
     * initiated.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /**
     * The source port from which a connectivity check will be performed.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the ID of the resource from which a connectivity check will be initiated.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the ID of the resource from which a connectivity check will be initiated.
     *
     * @param resourceId the resourceId value to set
     * @return the ConnectivitySource object itself.
     */
    public ConnectivitySource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the source port from which a connectivity check will be performed.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the source port from which a connectivity check will be performed.
     *
     * @param port the port value to set
     * @return the ConnectivitySource object itself.
     */
    public ConnectivitySource withPort(Integer port) {
        this.port = port;
        return this;
    }

}
