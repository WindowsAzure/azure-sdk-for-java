/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.NetworkMappingProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Network Mapping model. Ideally it should have been possible to inherit this
 * class from prev version in InheritedModels as long as there is no difference
 * in structure or method signature. Since there were no base Models for
 * certain fields and methods viz NetworkMappingProperties and Load with
 * required return type, the class has been introduced in its entirety with
 * references to base models to facilitate extensions in subsequent versions.
 */
public class NetworkMappingInner extends ProxyResource {
    /**
     * The Network Mapping Properties.
     */
    @JsonProperty(value = "properties")
    private NetworkMappingProperties properties;

    /**
     * Resource Location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the Network Mapping Properties.
     *
     * @return the properties value
     */
    public NetworkMappingProperties properties() {
        return this.properties;
    }

    /**
     * Set the Network Mapping Properties.
     *
     * @param properties the properties value to set
     * @return the NetworkMappingInner object itself.
     */
    public NetworkMappingInner withProperties(NetworkMappingProperties properties) {
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
     * @return the NetworkMappingInner object itself.
     */
    public NetworkMappingInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
