// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of the App Service plan scale options. */
@Fluent
public final class SkuCapacity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuCapacity.class);

    /*
     * Minimum number of workers for this App Service plan SKU.
     */
    @JsonProperty(value = "minimum")
    private Integer minimum;

    /*
     * Maximum number of workers for this App Service plan SKU.
     */
    @JsonProperty(value = "maximum")
    private Integer maximum;

    /*
     * Default number of workers for this App Service plan SKU.
     */
    @JsonProperty(value = "default")
    private Integer defaultProperty;

    /*
     * Available scale configurations for an App Service plan.
     */
    @JsonProperty(value = "scaleType")
    private String scaleType;

    /**
     * Get the minimum property: Minimum number of workers for this App Service plan SKU.
     *
     * @return the minimum value.
     */
    public Integer minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: Minimum number of workers for this App Service plan SKU.
     *
     * @param minimum the minimum value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withMinimum(Integer minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: Maximum number of workers for this App Service plan SKU.
     *
     * @return the maximum value.
     */
    public Integer maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: Maximum number of workers for this App Service plan SKU.
     *
     * @param maximum the maximum value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withMaximum(Integer maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the defaultProperty property: Default number of workers for this App Service plan SKU.
     *
     * @return the defaultProperty value.
     */
    public Integer defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: Default number of workers for this App Service plan SKU.
     *
     * @param defaultProperty the defaultProperty value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withDefaultProperty(Integer defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the scaleType property: Available scale configurations for an App Service plan.
     *
     * @return the scaleType value.
     */
    public String scaleType() {
        return this.scaleType;
    }

    /**
     * Set the scaleType property: Available scale configurations for an App Service plan.
     *
     * @param scaleType the scaleType value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withScaleType(String scaleType) {
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
