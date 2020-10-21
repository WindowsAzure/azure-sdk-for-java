/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Private Endpoint resource.
 */
public class PrivateEndpoint {
    /**
     * The ARM identifier for Private Endpoint.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get the ARM identifier for Private Endpoint.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

}
