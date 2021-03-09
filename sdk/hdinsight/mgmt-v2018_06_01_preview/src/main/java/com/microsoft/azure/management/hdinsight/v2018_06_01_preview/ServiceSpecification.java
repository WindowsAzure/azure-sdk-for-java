/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The specification of the service.
 */
public class ServiceSpecification {
    /**
     * The metric specifications.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<MetricSpecifications> metricSpecifications;

    /**
     * Get the metric specifications.
     *
     * @return the metricSpecifications value
     */
    public List<MetricSpecifications> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metric specifications.
     *
     * @param metricSpecifications the metricSpecifications value to set
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withMetricSpecifications(List<MetricSpecifications> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

}
