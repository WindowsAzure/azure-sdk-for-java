// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifications of the Metrics for Azure Monitoring. */
@Fluent
public final class MetricSpecification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricSpecification.class);

    /*
     * Name of the metric
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Localized friendly display name of the metric
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Localized friendly description of the metric
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /*
     * Unit that makes sense for the metric
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * Only provide one value for this field. Valid values: Average, Minimum,
     * Maximum, Total, Count.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /*
     * Internal metric name.
     */
    @JsonProperty(value = "internalMetricName")
    private String internalMetricName;

    /*
     * Dimensions of the metric
     */
    @JsonProperty(value = "dimensions")
    private List<MetricDimension> dimensions;

    /**
     * Get the name property: Name of the metric.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the metric.
     *
     * @param name the name value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Localized friendly display name of the metric.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Localized friendly display name of the metric.
     *
     * @param displayName the displayName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: Localized friendly description of the metric.
     *
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Localized friendly description of the metric.
     *
     * @param displayDescription the displayDescription value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: Unit that makes sense for the metric.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Unit that makes sense for the metric.
     *
     * @param unit the unit value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregationType property: Only provide one value for this field. Valid values: Average, Minimum, Maximum,
     * Total, Count.
     *
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: Only provide one value for this field. Valid values: Average, Minimum, Maximum,
     * Total, Count.
     *
     * @param aggregationType the aggregationType value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
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
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withInternalMetricName(String internalMetricName) {
        this.internalMetricName = internalMetricName;
        return this;
    }

    /**
     * Get the dimensions property: Dimensions of the metric.
     *
     * @return the dimensions value.
     */
    public List<MetricDimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: Dimensions of the metric.
     *
     * @param dimensions the dimensions value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<MetricDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }
}
