/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SKU name, tier, etc.
 */
public class AvailableServiceSkuSku {
    /**
     * The name of the SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * SKU family.
     */
    @JsonProperty(value = "family")
    private String family;

    /**
     * SKU size.
     */
    @JsonProperty(value = "size")
    private String size;

    /**
     * The tier of the SKU, such as "Free", "Basic", "Standard", or "Premium".
     */
    @JsonProperty(value = "tier")
    private String tier;

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
     * @return the AvailableServiceSkuSku object itself.
     */
    public AvailableServiceSkuSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get sKU family.
     *
     * @return the family value
     */
    public String family() {
        return this.family;
    }

    /**
     * Set sKU family.
     *
     * @param family the family value to set
     * @return the AvailableServiceSkuSku object itself.
     */
    public AvailableServiceSkuSku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get sKU size.
     *
     * @return the size value
     */
    public String size() {
        return this.size;
    }

    /**
     * Set sKU size.
     *
     * @param size the size value to set
     * @return the AvailableServiceSkuSku object itself.
     */
    public AvailableServiceSkuSku withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the tier of the SKU, such as "Free", "Basic", "Standard", or "Premium".
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier of the SKU, such as "Free", "Basic", "Standard", or "Premium".
     *
     * @param tier the tier value to set
     * @return the AvailableServiceSkuSku object itself.
     */
    public AvailableServiceSkuSku withTier(String tier) {
        this.tier = tier;
        return this;
    }

}
