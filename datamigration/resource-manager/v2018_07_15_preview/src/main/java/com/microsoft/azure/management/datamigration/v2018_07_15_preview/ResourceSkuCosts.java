/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes metadata for retrieving price info.
 */
public class ResourceSkuCosts {
    /**
     * Used for querying price from commerce.
     */
    @JsonProperty(value = "meterID", access = JsonProperty.Access.WRITE_ONLY)
    private String meterID;

    /**
     * The multiplier is needed to extend the base metered cost.
     */
    @JsonProperty(value = "quantity", access = JsonProperty.Access.WRITE_ONLY)
    private Long quantity;

    /**
     * An invariant to show the extended unit.
     */
    @JsonProperty(value = "extendedUnit", access = JsonProperty.Access.WRITE_ONLY)
    private String extendedUnit;

    /**
     * Get used for querying price from commerce.
     *
     * @return the meterID value
     */
    public String meterID() {
        return this.meterID;
    }

    /**
     * Get the multiplier is needed to extend the base metered cost.
     *
     * @return the quantity value
     */
    public Long quantity() {
        return this.quantity;
    }

    /**
     * Get an invariant to show the extended unit.
     *
     * @return the extendedUnit value
     */
    public String extendedUnit() {
        return this.extendedUnit;
    }

}
