// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Details about a service operation. */
@Fluent
public final class OperationServiceSpecification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationServiceSpecification.class);

    /*
     * Details about operations related to logs.
     */
    @JsonProperty(value = "logSpecifications")
    private List<OperationLogSpecification> logSpecifications;

    /*
     * Details about operations related to metrics.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<OperationMetricSpecification> metricSpecifications;

    /**
     * Get the logSpecifications property: Details about operations related to logs.
     *
     * @return the logSpecifications value.
     */
    public List<OperationLogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set the logSpecifications property: Details about operations related to logs.
     *
     * @param logSpecifications the logSpecifications value to set.
     * @return the OperationServiceSpecification object itself.
     */
    public OperationServiceSpecification withLogSpecifications(List<OperationLogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

    /**
     * Get the metricSpecifications property: Details about operations related to metrics.
     *
     * @return the metricSpecifications value.
     */
    public List<OperationMetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: Details about operations related to metrics.
     *
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the OperationServiceSpecification object itself.
     */
    public OperationServiceSpecification withMetricSpecifications(
        List<OperationMetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logSpecifications() != null) {
            logSpecifications().forEach(e -> e.validate());
        }
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
    }
}
