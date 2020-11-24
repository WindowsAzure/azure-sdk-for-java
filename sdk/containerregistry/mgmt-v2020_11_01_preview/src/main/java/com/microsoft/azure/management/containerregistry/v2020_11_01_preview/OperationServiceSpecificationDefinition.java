/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The definition of Azure Monitoring list.
 */
public class OperationServiceSpecificationDefinition {
    /**
     * A list of Azure Monitoring metrics definition.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<OperationMetricSpecificationDefinition> metricSpecifications;

    /**
     * Get a list of Azure Monitoring metrics definition.
     *
     * @return the metricSpecifications value
     */
    public List<OperationMetricSpecificationDefinition> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set a list of Azure Monitoring metrics definition.
     *
     * @param metricSpecifications the metricSpecifications value to set
     * @return the OperationServiceSpecificationDefinition object itself.
     */
    public OperationServiceSpecificationDefinition withMetricSpecifications(List<OperationMetricSpecificationDefinition> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

}
