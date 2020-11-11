/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the criteria for converting log to metric.
 */
public class Criteria {
    /**
     * Name of the metric.
     */
    @JsonProperty(value = "metricName", required = true)
    private String metricName;

    /**
     * List of Dimensions for creating metric.
     */
    @JsonProperty(value = "dimensions")
    private List<Dimension> dimensions;

    /**
     * Get name of the metric.
     *
     * @return the metricName value
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set name of the metric.
     *
     * @param metricName the metricName value to set
     * @return the Criteria object itself.
     */
    public Criteria withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get list of Dimensions for creating metric.
     *
     * @return the dimensions value
     */
    public List<Dimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set list of Dimensions for creating metric.
     *
     * @param dimensions the dimensions value to set
     * @return the Criteria object itself.
     */
    public Criteria withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

}
