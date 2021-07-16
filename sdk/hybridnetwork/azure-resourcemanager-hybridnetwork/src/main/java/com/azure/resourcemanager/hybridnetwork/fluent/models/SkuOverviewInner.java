// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.models.SkuType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The network function sku overview. */
@Fluent
public final class SkuOverviewInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuOverviewInner.class);

    /*
     * The vendor sku name.
     */
    @JsonProperty(value = "skuName")
    private String skuName;

    /*
     * The vendor sku type.
     */
    @JsonProperty(value = "skuType")
    private SkuType skuType;

    /**
     * Get the skuName property: The vendor sku name.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Set the skuName property: The vendor sku name.
     *
     * @param skuName the skuName value to set.
     * @return the SkuOverviewInner object itself.
     */
    public SkuOverviewInner withSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }

    /**
     * Get the skuType property: The vendor sku type.
     *
     * @return the skuType value.
     */
    public SkuType skuType() {
        return this.skuType;
    }

    /**
     * Set the skuType property: The vendor sku type.
     *
     * @param skuType the skuType value to set.
     * @return the SkuOverviewInner object itself.
     */
    public SkuOverviewInner withSkuType(SkuType skuType) {
        this.skuType = skuType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
