// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourceSkuCapacity model. */
@Immutable
public final class ResourceSkuCapacity {
    /*
     * The minimum capacity.
     */
    @JsonProperty(value = "minimum", access = JsonProperty.Access.WRITE_ONLY)
    private Long minimum;

    /*
     * The maximum capacity that can be set.
     */
    @JsonProperty(value = "maximum", access = JsonProperty.Access.WRITE_ONLY)
    private Long maximum;

    /*
     * The default capacity.
     */
    @JsonProperty(value = "default", access = JsonProperty.Access.WRITE_ONLY)
    private Long defaultProperty;

    /*
     * The scale type applicable to the sku.
     */
    @JsonProperty(value = "scaleType", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceSkuCapacityScaleType scaleType;

    /**
     * Get the minimum property: The minimum capacity.
     *
     * @return the minimum value.
     */
    public Long minimum() {
        return this.minimum;
    }

    /**
     * Get the maximum property: The maximum capacity that can be set.
     *
     * @return the maximum value.
     */
    public Long maximum() {
        return this.maximum;
    }

    /**
     * Get the defaultProperty property: The default capacity.
     *
     * @return the defaultProperty value.
     */
    public Long defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Get the scaleType property: The scale type applicable to the sku.
     *
     * @return the scaleType value.
     */
    public ResourceSkuCapacityScaleType scaleType() {
        return this.scaleType;
    }
}
