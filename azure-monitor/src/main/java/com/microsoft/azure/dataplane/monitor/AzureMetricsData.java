/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.dataplane.monitor;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AzureMetricsData model.
 */
public class AzureMetricsData {
    /**
     * The baseData property.
     */
    @JsonProperty(value = "BaseData")
    private AzureMetricsBaseData baseData;

    /**
     * Get the baseData value.
     *
     * @return the baseData value
     */
    public AzureMetricsBaseData baseData() {
        return this.baseData;
    }

    /**
     * Set the baseData value.
     *
     * @param baseData the baseData value to set
     * @return the AzureMetricsData object itself.
     */
    public AzureMetricsData withBaseData(AzureMetricsBaseData baseData) {
        this.baseData = baseData;
        return this;
    }

}
