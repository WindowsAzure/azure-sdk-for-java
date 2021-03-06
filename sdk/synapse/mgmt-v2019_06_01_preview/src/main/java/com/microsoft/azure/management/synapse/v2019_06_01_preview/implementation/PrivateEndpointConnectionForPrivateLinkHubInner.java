/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.PrivateEndpointConnectionForPrivateLinkHubBasic;

/**
 * The PrivateEndpointConnectionForPrivateLinkHubInner model.
 */
public class PrivateEndpointConnectionForPrivateLinkHubInner extends PrivateEndpointConnectionForPrivateLinkHubBasic {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The type property.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the PrivateEndpointConnectionForPrivateLinkHubInner object itself.
     */
    public PrivateEndpointConnectionForPrivateLinkHubInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the PrivateEndpointConnectionForPrivateLinkHubInner object itself.
     */
    public PrivateEndpointConnectionForPrivateLinkHubInner withType(String type) {
        this.type = type;
        return this;
    }

}
