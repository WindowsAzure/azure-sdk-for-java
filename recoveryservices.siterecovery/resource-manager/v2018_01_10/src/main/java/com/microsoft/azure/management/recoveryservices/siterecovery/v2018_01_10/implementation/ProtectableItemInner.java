/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ProtectableItemProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Replication protected item.
 */
public class ProtectableItemInner extends ProxyResource {
    /**
     * The custom data.
     */
    @JsonProperty(value = "properties")
    private ProtectableItemProperties properties;

    /**
     * Resource Location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the custom data.
     *
     * @return the properties value
     */
    public ProtectableItemProperties properties() {
        return this.properties;
    }

    /**
     * Set the custom data.
     *
     * @param properties the properties value to set
     * @return the ProtectableItemInner object itself.
     */
    public ProtectableItemInner withProperties(ProtectableItemProperties properties) {
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
     * @return the ProtectableItemInner object itself.
     */
    public ProtectableItemInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
