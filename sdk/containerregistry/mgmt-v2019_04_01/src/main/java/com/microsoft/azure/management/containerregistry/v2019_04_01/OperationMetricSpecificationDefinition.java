/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The definition of Azure Monitoring metric.
 */
public class OperationMetricSpecificationDefinition {
    /**
     * Metric name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Metric display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Metric description.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /**
     * Metric unit.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Metric aggregation type.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /**
     * Internal metric name.
     */
    @JsonProperty(value = "internalMetricName")
    private String internalMetricName;

    /**
     * Get metric name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set metric name.
     *
     * @param name the name value to set
     * @return the OperationMetricSpecificationDefinition object itself.
     */
    public OperationMetricSpecificationDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get metric display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set metric display name.
     *
     * @param displayName the displayName value to set
     * @return the OperationMetricSpecificationDefinition object itself.
     */
    public OperationMetricSpecificationDefinition withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get metric description.
     *
     * @return the displayDescription value
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set metric description.
     *
     * @param displayDescription the displayDescription value to set
     * @return the OperationMetricSpecificationDefinition object itself.
     */
    public OperationMetricSpecificationDefinition withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get metric unit.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set metric unit.
     *
     * @param unit the unit value to set
     * @return the OperationMetricSpecificationDefinition object itself.
     */
    public OperationMetricSpecificationDefinition withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get metric aggregation type.
     *
     * @return the aggregationType value
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set metric aggregation type.
     *
     * @param aggregationType the aggregationType value to set
     * @return the OperationMetricSpecificationDefinition object itself.
     */
    public OperationMetricSpecificationDefinition withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get internal metric name.
     *
     * @return the internalMetricName value
     */
    public String internalMetricName() {
        return this.internalMetricName;
    }

    /**
     * Set internal metric name.
     *
     * @param internalMetricName the internalMetricName value to set
     * @return the OperationMetricSpecificationDefinition object itself.
     */
    public OperationMetricSpecificationDefinition withInternalMetricName(String internalMetricName) {
        this.internalMetricName = internalMetricName;
        return this;
    }

}
