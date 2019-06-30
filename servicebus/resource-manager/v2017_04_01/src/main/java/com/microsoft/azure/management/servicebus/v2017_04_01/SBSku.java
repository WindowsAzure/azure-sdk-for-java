/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SKU of the namespace.
 */
public class SBSku {
    /**
     * Name of this SKU. Possible values include: 'Basic', 'Standard',
     * 'Premium'.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /**
     * The billing tier of this particular SKU. Possible values include:
     * 'Basic', 'Standard', 'Premium'.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /**
     * The specified messaging units for the tier. For Premium tier, capacity
     * are 1,2 and 4.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get name of this SKU. Possible values include: 'Basic', 'Standard', 'Premium'.
     *
     * @return the name value
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set name of this SKU. Possible values include: 'Basic', 'Standard', 'Premium'.
     *
     * @param name the name value to set
     * @return the SBSku object itself.
     */
    public SBSku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the billing tier of this particular SKU. Possible values include: 'Basic', 'Standard', 'Premium'.
     *
     * @return the tier value
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the billing tier of this particular SKU. Possible values include: 'Basic', 'Standard', 'Premium'.
     *
     * @param tier the tier value to set
     * @return the SBSku object itself.
     */
    public SBSku withTier(SkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the specified messaging units for the tier. For Premium tier, capacity are 1,2 and 4.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the specified messaging units for the tier. For Premium tier, capacity are 1,2 and 4.
     *
     * @param capacity the capacity value to set
     * @return the SBSku object itself.
     */
    public SBSku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

}
