/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an available API Management SKU.
 */
public class ResourceSku {
    /**
     * Name of the Sku. Possible values include: 'Developer', 'Standard',
     * 'Premium', 'Basic', 'Consumption'.
     */
    @JsonProperty(value = "name")
    private SkuType name;

    /**
     * Get name of the Sku. Possible values include: 'Developer', 'Standard', 'Premium', 'Basic', 'Consumption'.
     *
     * @return the name value
     */
    public SkuType name() {
        return this.name;
    }

    /**
     * Set name of the Sku. Possible values include: 'Developer', 'Standard', 'Premium', 'Basic', 'Consumption'.
     *
     * @param name the name value to set
     * @return the ResourceSku object itself.
     */
    public ResourceSku withName(SkuType name) {
        this.name = name;
        return this;
    }

}
