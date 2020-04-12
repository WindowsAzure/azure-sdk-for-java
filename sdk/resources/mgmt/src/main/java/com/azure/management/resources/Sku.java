// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Sku model. */
@Fluent
public final class Sku {
    /*
     * The SKU name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The SKU tier.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * The SKU size.
     */
    @JsonProperty(value = "size")
    private String size;

    /*
     * The SKU family.
     */
    @JsonProperty(value = "family")
    private String family;

    /*
     * The SKU model.
     */
    @JsonProperty(value = "model")
    private String model;

    /*
     * The SKU capacity.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the name property: The SKU name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The SKU name.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The SKU tier.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The SKU tier.
     *
     * @param tier the tier value to set.
     * @return the Sku object itself.
     */
    public Sku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the size property: The SKU size.
     *
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: The SKU size.
     *
     * @param size the size value to set.
     * @return the Sku object itself.
     */
    public Sku withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the family property: The SKU family.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: The SKU family.
     *
     * @param family the family value to set.
     * @return the Sku object itself.
     */
    public Sku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the model property: The SKU model.
     *
     * @return the model value.
     */
    public String model() {
        return this.model;
    }

    /**
     * Set the model property: The SKU model.
     *
     * @param model the model value to set.
     * @return the Sku object itself.
     */
    public Sku withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * Get the capacity property: The SKU capacity.
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The SKU capacity.
     *
     * @param capacity the capacity value to set.
     * @return the Sku object itself.
     */
    public Sku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }
}
