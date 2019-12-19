/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.NetworkProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Network model.
 */
public class NetworkInner extends ProxyResource {
    /**
     * The Network Properties.
     */
    @JsonProperty(value = "properties")
    private NetworkProperties properties;

    /**
     * Resource Location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the Network Properties.
     *
     * @return the properties value
     */
    public NetworkProperties properties() {
        return this.properties;
    }

    /**
     * Set the Network Properties.
     *
     * @param properties the properties value to set
     * @return the NetworkInner object itself.
     */
    public NetworkInner withProperties(NetworkProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get resource Location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource Location.
     *
     * @param location the location value to set
     * @return the NetworkInner object itself.
     */
    public NetworkInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
