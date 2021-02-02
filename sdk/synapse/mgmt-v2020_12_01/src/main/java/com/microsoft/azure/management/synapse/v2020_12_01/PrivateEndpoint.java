/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Private endpoint details.
 */
public class PrivateEndpoint {
    /**
     * Resource id of the private endpoint.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get resource id of the private endpoint.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

}
