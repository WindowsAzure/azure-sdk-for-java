/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The metadata for retrieving price info.
 */
public class SkuCost {
    /**
     * Used for querying price from commerce.
     */
    @JsonProperty(value = "meterId", access = JsonProperty.Access.WRITE_ONLY)
    private String meterId;

    /**
     * The cost quantity.
     */
    @JsonProperty(value = "quantity", access = JsonProperty.Access.WRITE_ONLY)
    private Long quantity;

    /**
     * Restriction of the SKU for the location/zone.
     */
    @JsonProperty(value = "extendedUnit", access = JsonProperty.Access.WRITE_ONLY)
    private String extendedUnit;

    /**
     * Get used for querying price from commerce.
     *
     * @return the meterId value
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Get the cost quantity.
     *
     * @return the quantity value
     */
    public Long quantity() {
        return this.quantity;
    }

    /**
     * Get restriction of the SKU for the location/zone.
     *
     * @return the extendedUnit value
     */
    public String extendedUnit() {
        return this.extendedUnit;
    }

}
