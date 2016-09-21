/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes scaling information of a sku.
 */
public class VirtualMachineScaleSetSkuCapacity {
    /**
     * the minimum capacity.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long minimum;

    /**
     * the maximum capacity that can be set.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long maximum;

    /**
     * the default capacity.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long defaultCapacity;

    /**
     * the scale type applicable to the sku. Possible values include:
     * 'Automatic', 'None'.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineScaleSetSkuScaleType scaleType;

    /**
     * Get the minimum value.
     *
     * @return the minimum value
     */
    public Long minimum() {
        return this.minimum;
    }

    /**
     * Get the maximum value.
     *
     * @return the maximum value
     */
    public Long maximum() {
        return this.maximum;
    }

    /**
     * Get the defaultCapacity value.
     *
     * @return the defaultCapacity value
     */
    public Long defaultCapacity() {
        return this.defaultCapacity;
    }

    /**
     * Get the scaleType value.
     *
     * @return the scaleType value
     */
    public VirtualMachineScaleSetSkuScaleType scaleType() {
        return this.scaleType;
    }

}
