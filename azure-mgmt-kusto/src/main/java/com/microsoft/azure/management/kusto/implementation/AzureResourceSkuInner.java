/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.implementation;

import com.microsoft.azure.management.kusto.AzureCapacity;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure resource SKU definition.
 */
public class AzureResourceSkuInner {
    /**
     * Resource Namespace and Type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * The SKU details.
     */
    @JsonProperty(value = "sku")
    private AzureSkuInner sku;

    /**
     * The SKU capacity.
     */
    @JsonProperty(value = "capacity")
    private AzureCapacity capacity;

    /**
     * Get resource Namespace and Type.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set resource Namespace and Type.
     *
     * @param resourceType the resourceType value to set
     * @return the AzureResourceSkuInner object itself.
     */
    public AzureResourceSkuInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the SKU details.
     *
     * @return the sku value
     */
    public AzureSkuInner sku() {
        return this.sku;
    }

    /**
     * Set the SKU details.
     *
     * @param sku the sku value to set
     * @return the AzureResourceSkuInner object itself.
     */
    public AzureResourceSkuInner withSku(AzureSkuInner sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the SKU capacity.
     *
     * @return the capacity value
     */
    public AzureCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the SKU capacity.
     *
     * @param capacity the capacity value to set
     * @return the AzureResourceSkuInner object itself.
     */
    public AzureResourceSkuInner withCapacity(AzureCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

}
