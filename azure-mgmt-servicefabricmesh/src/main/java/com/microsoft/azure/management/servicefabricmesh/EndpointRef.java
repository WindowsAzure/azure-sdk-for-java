/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a reference to a service endpoint.
 */
public class EndpointRef {
    /**
     * Name of the endpoint.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get name of the endpoint.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the endpoint.
     *
     * @param name the name value to set
     * @return the EndpointRef object itself.
     */
    public EndpointRef withName(String name) {
        this.name = name;
        return this;
    }

}
