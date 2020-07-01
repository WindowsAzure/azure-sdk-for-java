/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource model definition representing SKU.
 */
public class Sku {
    /**
     * The name of the SKU.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the name of the SKU.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the SKU.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

}
