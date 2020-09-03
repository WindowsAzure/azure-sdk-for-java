/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An ARM Resource SKU.
 */
public class Sku {
    /**
     * The name of the SKU, typically, a letter + Number code, e.g. P3.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The tier or edition of the particular SKU, e.g. Basic, Premium.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * Size of the particular SKU.
     */
    @JsonProperty(value = "size")
    private String size;

    /**
     * If the service has different generations of hardware, for the same SKU,
     * then that can be captured here.
     */
    @JsonProperty(value = "family")
    private String family;

    /**
     * Capacity of the particular SKU.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the name of the SKU, typically, a letter + Number code, e.g. P3.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the SKU, typically, a letter + Number code, e.g. P3.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier or edition of the particular SKU, e.g. Basic, Premium.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier or edition of the particular SKU, e.g. Basic, Premium.
     *
     * @param tier the tier value to set
     * @return the Sku object itself.
     */
    public Sku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get size of the particular SKU.
     *
     * @return the size value
     */
    public String size() {
        return this.size;
    }

    /**
     * Set size of the particular SKU.
     *
     * @param size the size value to set
     * @return the Sku object itself.
     */
    public Sku withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get if the service has different generations of hardware, for the same SKU, then that can be captured here.
     *
     * @return the family value
     */
    public String family() {
        return this.family;
    }

    /**
     * Set if the service has different generations of hardware, for the same SKU, then that can be captured here.
     *
     * @param family the family value to set
     * @return the Sku object itself.
     */
    public Sku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get capacity of the particular SKU.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set capacity of the particular SKU.
     *
     * @param capacity the capacity value to set
     * @return the Sku object itself.
     */
    public Sku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

}
