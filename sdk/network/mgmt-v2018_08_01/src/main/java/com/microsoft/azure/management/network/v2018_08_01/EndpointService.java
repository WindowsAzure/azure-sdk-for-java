/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identifies the service being brought into the virtual network.
 */
public class EndpointService {
    /**
     * A unique identifier of the service being referenced by the interface
     * endpoint.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get a unique identifier of the service being referenced by the interface endpoint.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set a unique identifier of the service being referenced by the interface endpoint.
     *
     * @param id the id value to set
     * @return the EndpointService object itself.
     */
    public EndpointService withId(String id) {
        this.id = id;
        return this;
    }

}
