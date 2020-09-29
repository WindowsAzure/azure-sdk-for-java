// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The definition of Azure Monitoring metric. */
@Fluent
public final class OperationMetricSpecificationDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationMetricSpecificationDefinition.class);

    /*
     * Metric name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Metric display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Metric description.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /*
     * Metric unit.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * Metric aggregation type.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /*
     * Internal metric name.
     */
    @JsonProperty(value = "internalMetricName")
    private String internalMetricName;

    /**
     * Get the name property: Metric name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Metric name.
     *
     * @param name the name value to set.
     * @return the OperationMetricSpecificationDefinition object itself.
     */
    public OperationMetricSpecificationDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Metric display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Metric display name.
     *
     * @param displayName the displayName value to set.
     * @return the OperationMetricSpecificationDefinition object itself.
     */
    public OperationMetricSpecificationDefinition withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: Metric description.
     *
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Metric description.
     *
     * @param displayDescription the displayDescription value to set.
     * @return the OperationMetricSpecificationDefinition object itself.
     */
    public OperationMetricSpecificationDefinition withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: Metric unit.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Metric unit.
     *
     * @param unit the unit value to set.
     * @return the OperationMetricSpecificationDefinition object itself.
     */
    public OperationMetricSpecificationDefinition withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregationType property: Metric aggregation type.
     *
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: Metric aggregation type.
     *
     * @param aggregationType the aggregationType value to set.
     * @return the OperationMetricSpecificationDefinition object itself.
     */
    public OperationMetricSpecificationDefinition withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the internalMetricName property: Internal metric name.
     *
     * @return the internalMetricName value.
     */
    public String internalMetricName() {
        return this.internalMetricName;
    }

    /**
     * Set the internalMetricName property: Internal metric name.
     *
     * @param internalMetricName the internalMetricName value to set.
     * @return the OperationMetricSpecificationDefinition object itself.
     */
    public OperationMetricSpecificationDefinition withInternalMetricName(String internalMetricName) {
        this.internalMetricName = internalMetricName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
