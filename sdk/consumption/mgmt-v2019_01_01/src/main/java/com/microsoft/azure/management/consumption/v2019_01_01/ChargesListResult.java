/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01;

import java.util.List;
import com.microsoft.azure.management.consumption.v2019_01_01.implementation.ChargeSummaryInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of listing charge summary.
 */
public class ChargesListResult {
    /**
     * The list of charge summary.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ChargeSummaryInner> value;

    /**
     * Get the list of charge summary.
     *
     * @return the value value
     */
    public List<ChargeSummaryInner> value() {
        return this.value;
    }

}
