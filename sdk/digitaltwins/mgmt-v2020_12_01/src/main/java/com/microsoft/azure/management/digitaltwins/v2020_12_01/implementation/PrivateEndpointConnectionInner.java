/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_12_01.implementation;

import com.microsoft.azure.management.digitaltwins.v2020_12_01.PrivateEndpointConnectionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * The private endpoint connection of a Digital Twin.
 */
public class PrivateEndpointConnectionInner extends ProxyResource {
    /**
     * The properties property.
     */
    @JsonProperty(value = "properties", required = true)
    private PrivateEndpointConnectionProperties properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public PrivateEndpointConnectionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withProperties(PrivateEndpointConnectionProperties properties) {
        this.properties = properties;
        return this;
    }

}
