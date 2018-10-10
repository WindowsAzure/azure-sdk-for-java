/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a container endpoint.
 */
public class EndpointProperties {
    /**
     * The name of the endpoint.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Port used by the container.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the name of the endpoint.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the endpoint.
     *
     * @param name the name value to set
     * @return the EndpointProperties object itself.
     */
    public EndpointProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get port used by the container.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set port used by the container.
     *
     * @param port the port value to set
     * @return the EndpointProperties object itself.
     */
    public EndpointProperties withPort(Integer port) {
        this.port = port;
        return this;
    }

}
