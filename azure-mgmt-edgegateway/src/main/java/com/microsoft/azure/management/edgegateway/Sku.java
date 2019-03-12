/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SKU type.
 */
public class Sku {
    /**
     * SKU name. Possible values include: 'Gateway', 'Edge'.
     */
    @JsonProperty(value = "name")
    private SkuName name;

    /**
     * The SKU tier. This is based on the SKU name. Possible values include:
     * 'Standard'.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /**
     * Get sKU name. Possible values include: 'Gateway', 'Edge'.
     *
     * @return the name value
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set sKU name. Possible values include: 'Gateway', 'Edge'.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the SKU tier. This is based on the SKU name. Possible values include: 'Standard'.
     *
     * @return the tier value
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the SKU tier. This is based on the SKU name. Possible values include: 'Standard'.
     *
     * @param tier the tier value to set
     * @return the Sku object itself.
     */
    public Sku withTier(SkuTier tier) {
        this.tier = tier;
        return this;
    }

}
