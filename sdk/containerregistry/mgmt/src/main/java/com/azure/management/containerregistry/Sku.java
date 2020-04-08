// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Sku model. */
@Fluent
public final class Sku {
    /*
     * The SKU name of the container registry. Required for registry creation.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /*
     * The SKU tier based on the SKU name.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private SkuTier tier;

    /**
     * Get the name property: The SKU name of the container registry. Required for registry creation.
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: The SKU name of the container registry. Required for registry creation.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The SKU tier based on the SKU name.
     *
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }
}
