/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specification of the service.
 */
public class OperationPropertiesFormatServiceSpecification {
    /**
     * Operation service specification.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<MetricSpecification> metricSpecifications;

    /**
     * Operation log specification.
     */
    @JsonProperty(value = "logSpecifications")
    private List<LogSpecification> logSpecifications;

    /**
     * Get operation service specification.
     *
     * @return the metricSpecifications value
     */
    public List<MetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set operation service specification.
     *
     * @param metricSpecifications the metricSpecifications value to set
     * @return the OperationPropertiesFormatServiceSpecification object itself.
     */
    public OperationPropertiesFormatServiceSpecification withMetricSpecifications(List<MetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Get operation log specification.
     *
     * @return the logSpecifications value
     */
    public List<LogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set operation log specification.
     *
     * @param logSpecifications the logSpecifications value to set
     * @return the OperationPropertiesFormatServiceSpecification object itself.
     */
    public OperationPropertiesFormatServiceSpecification withLogSpecifications(List<LogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

}
