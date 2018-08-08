/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.implementation;

import com.microsoft.azure.management.cdn.OriginResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * CDN origin is the source of the content being delivered via CDN. When the
 * edge nodes represented by an endpoint do not have the requested content
 * cached, they attempt to fetch it from one or more of the configured origins.
 */
@JsonFlatten
public class OriginInner extends Resource {
    /**
     * The address of the origin. Domain names, IPv4 addresses, and IPv6
     * addresses are supported.
     */
    @JsonProperty(value = "properties.hostName", required = true)
    private String hostName;

    /**
     * The value of the HTTP port. Must be between 1 and 65535.
     */
    @JsonProperty(value = "properties.httpPort")
    private Integer httpPort;

    /**
     * The value of the https port. Must be between 1 and 65535.
     */
    @JsonProperty(value = "properties.httpsPort")
    private Integer httpsPort;

    /**
     * Resource status of the origin. Possible values include: 'Creating',
     * 'Active', 'Deleting'.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private OriginResourceState resourceState;

    /**
     * Provisioning status of the origin.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Set the address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.
     *
     * @param hostName the hostName value to set
     * @return the OriginInner object itself.
     */
    public OriginInner withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get the value of the HTTP port. Must be between 1 and 65535.
     *
     * @return the httpPort value
     */
    public Integer httpPort() {
        return this.httpPort;
    }

    /**
     * Set the value of the HTTP port. Must be between 1 and 65535.
     *
     * @param httpPort the httpPort value to set
     * @return the OriginInner object itself.
     */
    public OriginInner withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * Get the value of the https port. Must be between 1 and 65535.
     *
     * @return the httpsPort value
     */
    public Integer httpsPort() {
        return this.httpsPort;
    }

    /**
     * Set the value of the https port. Must be between 1 and 65535.
     *
     * @param httpsPort the httpsPort value to set
     * @return the OriginInner object itself.
     */
    public OriginInner withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    /**
     * Get resource status of the origin. Possible values include: 'Creating', 'Active', 'Deleting'.
     *
     * @return the resourceState value
     */
    public OriginResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get provisioning status of the origin.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
