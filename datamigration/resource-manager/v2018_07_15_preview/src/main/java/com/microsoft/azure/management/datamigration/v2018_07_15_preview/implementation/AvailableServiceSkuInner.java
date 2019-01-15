/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview.implementation;

import com.microsoft.azure.management.datamigration.v2018_07_15_preview.AvailableServiceSkuSku;
import com.microsoft.azure.management.datamigration.v2018_07_15_preview.AvailableServiceSkuCapacity;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the available service SKU.
 */
public class AvailableServiceSkuInner {
    /**
     * The resource type, including the provider namespace.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * SKU name, tier, etc.
     */
    @JsonProperty(value = "sku")
    private AvailableServiceSkuSku sku;

    /**
     * A description of the scaling capacities of the SKU.
     */
    @JsonProperty(value = "capacity")
    private AvailableServiceSkuCapacity capacity;

    /**
     * Get the resource type, including the provider namespace.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resource type, including the provider namespace.
     *
     * @param resourceType the resourceType value to set
     * @return the AvailableServiceSkuInner object itself.
     */
    public AvailableServiceSkuInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get sKU name, tier, etc.
     *
     * @return the sku value
     */
    public AvailableServiceSkuSku sku() {
        return this.sku;
    }

    /**
     * Set sKU name, tier, etc.
     *
     * @param sku the sku value to set
     * @return the AvailableServiceSkuInner object itself.
     */
    public AvailableServiceSkuInner withSku(AvailableServiceSkuSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get a description of the scaling capacities of the SKU.
     *
     * @return the capacity value
     */
    public AvailableServiceSkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set a description of the scaling capacities of the SKU.
     *
     * @param capacity the capacity value to set
     * @return the AvailableServiceSkuInner object itself.
     */
    public AvailableServiceSkuInner withCapacity(AvailableServiceSkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

}
