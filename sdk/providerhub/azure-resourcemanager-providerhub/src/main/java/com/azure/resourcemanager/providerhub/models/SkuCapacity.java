// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SkuCapacity model. */
@Fluent
public class SkuCapacity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuCapacity.class);

    /*
     * The minimum property.
     */
    @JsonProperty(value = "minimum", required = true)
    private int minimum;

    /*
     * The maximum property.
     */
    @JsonProperty(value = "maximum")
    private Integer maximum;

    /*
     * The default property.
     */
    @JsonProperty(value = "default")
    private Integer defaultProperty;

    /*
     * The scaleType property.
     */
    @JsonProperty(value = "scaleType")
    private SkuScaleType scaleType;

    /**
     * Get the minimum property: The minimum property.
     *
     * @return the minimum value.
     */
    public int minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: The minimum property.
     *
     * @param minimum the minimum value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withMinimum(int minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: The maximum property.
     *
     * @return the maximum value.
     */
    public Integer maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: The maximum property.
     *
     * @param maximum the maximum value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withMaximum(Integer maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the defaultProperty property: The default property.
     *
     * @return the defaultProperty value.
     */
    public Integer defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: The default property.
     *
     * @param defaultProperty the defaultProperty value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withDefaultProperty(Integer defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the scaleType property: The scaleType property.
     *
     * @return the scaleType value.
     */
    public SkuScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Set the scaleType property: The scaleType property.
     *
     * @param scaleType the scaleType value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withScaleType(SkuScaleType scaleType) {
        this.scaleType = scaleType;
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
