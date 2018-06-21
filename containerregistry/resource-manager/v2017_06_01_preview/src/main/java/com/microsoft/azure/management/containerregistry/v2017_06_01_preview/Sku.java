/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SKU of a container registry.
 */
public class Sku {
    /**
     * The SKU name of the container registry. Required for registry creation.
     * Possible values include: 'Basic', 'Managed_Basic', 'Managed_Standard',
     * 'Managed_Premium'.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /**
     * The SKU tier based on the SKU name. Possible values include: 'Basic',
     * 'Managed'.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private SkuTier tier;

    /**
     * Get the SKU name of the container registry. Required for registry creation. Possible values include: 'Basic', 'Managed_Basic', 'Managed_Standard', 'Managed_Premium'.
     *
     * @return the name value
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the SKU name of the container registry. Required for registry creation. Possible values include: 'Basic', 'Managed_Basic', 'Managed_Standard', 'Managed_Premium'.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the SKU tier based on the SKU name. Possible values include: 'Basic', 'Managed'.
     *
     * @return the tier value
     */
    public SkuTier tier() {
        return this.tier;
    }

}
