/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_09_07;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure capacity definition.
 */
public class AzureCapacity {
    /**
     * Scale type. Possible values include: 'automatic', 'manual', 'none'.
     */
    @JsonProperty(value = "scaleType", required = true)
    private AzureScaleType scaleType;

    /**
     * Minimum allowed capacity.
     */
    @JsonProperty(value = "minimum", required = true)
    private int minimum;

    /**
     * Maximum allowed capacity.
     */
    @JsonProperty(value = "maximum", required = true)
    private int maximum;

    /**
     * The default capacity that would be used.
     */
    @JsonProperty(value = "default", required = true)
    private int defaultProperty;

    /**
     * Get scale type. Possible values include: 'automatic', 'manual', 'none'.
     *
     * @return the scaleType value
     */
    public AzureScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Set scale type. Possible values include: 'automatic', 'manual', 'none'.
     *
     * @param scaleType the scaleType value to set
     * @return the AzureCapacity object itself.
     */
    public AzureCapacity withScaleType(AzureScaleType scaleType) {
        this.scaleType = scaleType;
        return this;
    }

    /**
     * Get minimum allowed capacity.
     *
     * @return the minimum value
     */
    public int minimum() {
        return this.minimum;
    }

    /**
     * Set minimum allowed capacity.
     *
     * @param minimum the minimum value to set
     * @return the AzureCapacity object itself.
     */
    public AzureCapacity withMinimum(int minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get maximum allowed capacity.
     *
     * @return the maximum value
     */
    public int maximum() {
        return this.maximum;
    }

    /**
     * Set maximum allowed capacity.
     *
     * @param maximum the maximum value to set
     * @return the AzureCapacity object itself.
     */
    public AzureCapacity withMaximum(int maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the default capacity that would be used.
     *
     * @return the defaultProperty value
     */
    public int defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the default capacity that would be used.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the AzureCapacity object itself.
     */
    public AzureCapacity withDefaultProperty(int defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

}
