/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the cost summary.
 */
public class LabCostSummaryProperties {
    /**
     * The cost component of the cost item.
     */
    @JsonProperty(value = "estimatedLabCost")
    private Double estimatedLabCost;

    /**
     * Get the cost component of the cost item.
     *
     * @return the estimatedLabCost value
     */
    public Double estimatedLabCost() {
        return this.estimatedLabCost;
    }

    /**
     * Set the cost component of the cost item.
     *
     * @param estimatedLabCost the estimatedLabCost value to set
     * @return the LabCostSummaryProperties object itself.
     */
    public LabCostSummaryProperties withEstimatedLabCost(Double estimatedLabCost) {
        this.estimatedLabCost = estimatedLabCost;
        return this;
    }

}
