/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The performance level capability.
 */
public class PerformanceLevelCapability {
    /**
     * Performance level value.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private Double value;

    /**
     * Unit type used to measure performance level. Possible values include:
     * 'DTU', 'VCores'.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private PerformanceLevelUnit unit;

    /**
     * Get performance level value.
     *
     * @return the value value
     */
    public Double value() {
        return this.value;
    }

    /**
     * Get unit type used to measure performance level. Possible values include: 'DTU', 'VCores'.
     *
     * @return the unit value
     */
    public PerformanceLevelUnit unit() {
        return this.unit;
    }

}
