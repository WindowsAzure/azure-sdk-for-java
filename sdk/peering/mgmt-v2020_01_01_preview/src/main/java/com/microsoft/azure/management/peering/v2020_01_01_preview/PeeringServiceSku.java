/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SKU that defines the type of the peering service.
 */
public class PeeringServiceSku {
    /**
     * The name of the peering service SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name of the peering service SKU.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the peering service SKU.
     *
     * @param name the name value to set
     * @return the PeeringServiceSku object itself.
     */
    public PeeringServiceSku withName(String name) {
        this.name = name;
        return this;
    }

}
