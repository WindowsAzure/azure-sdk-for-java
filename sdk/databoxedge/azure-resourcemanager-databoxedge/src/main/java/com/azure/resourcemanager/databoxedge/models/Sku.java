// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SKU type. */
@Fluent
public final class Sku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Sku.class);

    /*
     * SKU name.
     */
    @JsonProperty(value = "name")
    private SkuName name;

    /*
     * The SKU tier. This is based on the SKU name.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /**
     * Get the name property: SKU name.
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: SKU name.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The SKU tier. This is based on the SKU name.
     *
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The SKU tier. This is based on the SKU name.
     *
     * @param tier the tier value to set.
     * @return the Sku object itself.
     */
    public Sku withTier(SkuTier tier) {
        this.tier = tier;
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