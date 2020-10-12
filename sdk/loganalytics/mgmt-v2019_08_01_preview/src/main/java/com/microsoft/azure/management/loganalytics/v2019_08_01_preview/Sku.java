/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2019_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Sku model.
 */
public class Sku {
    /**
     * The capacity value.
     */
    @JsonProperty(value = "capacity")
    private Long capacity;

    /**
     * The name of the SKU. Possible values include: 'CapacityReservation'.
     */
    @JsonProperty(value = "name")
    private SkuNameEnum name;

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Long capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the Sku object itself.
     */
    public Sku withCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the name of the SKU. Possible values include: 'CapacityReservation'.
     *
     * @return the name value
     */
    public SkuNameEnum name() {
        return this.name;
    }

    /**
     * Set the name of the SKU. Possible values include: 'CapacityReservation'.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(SkuNameEnum name) {
        this.name = name;
        return this;
    }

}
