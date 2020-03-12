/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a virtual machine scale set sku.
 */
public class Sku {
    /**
     * The sku name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Specifies the tier of virtual machines in a scale set.&lt;br /&gt;&lt;br
     * /&gt; Possible Values:&lt;br /&gt;&lt;br /&gt; **Standard**&lt;br
     * /&gt;&lt;br /&gt; **Basic**.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * Specifies the number of virtual machines in the scale set.
     */
    @JsonProperty(value = "capacity")
    private Long capacity;

    /**
     * Get the sku name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the sku name.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get specifies the tier of virtual machines in a scale set.&lt;br /&gt;&lt;br /&gt; Possible Values:&lt;br /&gt;&lt;br /&gt; **Standard**&lt;br /&gt;&lt;br /&gt; **Basic**.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set specifies the tier of virtual machines in a scale set.&lt;br /&gt;&lt;br /&gt; Possible Values:&lt;br /&gt;&lt;br /&gt; **Standard**&lt;br /&gt;&lt;br /&gt; **Basic**.
     *
     * @param tier the tier value to set
     * @return the Sku object itself.
     */
    public Sku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get specifies the number of virtual machines in the scale set.
     *
     * @return the capacity value
     */
    public Long capacity() {
        return this.capacity;
    }

    /**
     * Set specifies the number of virtual machines in the scale set.
     *
     * @param capacity the capacity value to set
     * @return the Sku object itself.
     */
    public Sku withCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }

}
