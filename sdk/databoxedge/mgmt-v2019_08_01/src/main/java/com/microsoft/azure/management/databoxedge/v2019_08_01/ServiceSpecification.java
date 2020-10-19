/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Service specification.
 */
public class ServiceSpecification {
    /**
     * Metric specification as defined by shoebox.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<MetricSpecificationV1> metricSpecifications;

    /**
     * Get metric specification as defined by shoebox.
     *
     * @return the metricSpecifications value
     */
    public List<MetricSpecificationV1> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set metric specification as defined by shoebox.
     *
     * @param metricSpecifications the metricSpecifications value to set
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withMetricSpecifications(List<MetricSpecificationV1> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

}
