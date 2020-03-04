/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes scaling information of a SKU.
 */
public class ResourceSkuCapacity {
    /**
     * The minimum capacity.
     */
    @JsonProperty(value = "minimum", access = JsonProperty.Access.WRITE_ONLY)
    private Long minimum;

    /**
     * The maximum capacity that can be set.
     */
    @JsonProperty(value = "maximum", access = JsonProperty.Access.WRITE_ONLY)
    private Long maximum;

    /**
     * The default capacity.
     */
    @JsonProperty(value = "default", access = JsonProperty.Access.WRITE_ONLY)
    private Long defaultProperty;

    /**
     * The scale type applicable to the sku. Possible values include:
     * 'Automatic', 'Manual', 'None'.
     */
    @JsonProperty(value = "scaleType", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceSkuCapacityScaleType scaleType;

    /**
     * Get the minimum capacity.
     *
     * @return the minimum value
     */
    public Long minimum() {
        return this.minimum;
    }

    /**
     * Get the maximum capacity that can be set.
     *
     * @return the maximum value
     */
    public Long maximum() {
        return this.maximum;
    }

    /**
     * Get the default capacity.
     *
     * @return the defaultProperty value
     */
    public Long defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Get the scale type applicable to the sku. Possible values include: 'Automatic', 'Manual', 'None'.
     *
     * @return the scaleType value
     */
    public ResourceSkuCapacityScaleType scaleType() {
        return this.scaleType;
    }

}
