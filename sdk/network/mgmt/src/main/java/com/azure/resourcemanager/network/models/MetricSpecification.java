// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MetricSpecification model. */
@Fluent
public final class MetricSpecification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricSpecification.class);

    /*
     * The name of the metric.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The display name of the metric.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description of the metric.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /*
     * Units the metric to be displayed in.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * The aggregation type.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /*
     * List of availability.
     */
    @JsonProperty(value = "availabilities")
    private List<Availability> availabilities;

    /*
     * Whether regional MDM account enabled.
     */
    @JsonProperty(value = "enableRegionalMdmAccount")
    private Boolean enableRegionalMdmAccount;

    /*
     * Whether gaps would be filled with zeros.
     */
    @JsonProperty(value = "fillGapWithZero")
    private Boolean fillGapWithZero;

    /*
     * Pattern for the filter of the metric.
     */
    @JsonProperty(value = "metricFilterPattern")
    private String metricFilterPattern;

    /*
     * List of dimensions.
     */
    @JsonProperty(value = "dimensions")
    private List<Dimension> dimensions;

    /*
     * Whether the metric is internal.
     */
    @JsonProperty(value = "isInternal")
    private Boolean isInternal;

    /*
     * The source MDM account.
     */
    @JsonProperty(value = "sourceMdmAccount")
    private String sourceMdmAccount;

    /*
     * The source MDM namespace.
     */
    @JsonProperty(value = "sourceMdmNamespace")
    private String sourceMdmNamespace;

    /*
     * The resource Id dimension name override.
     */
    @JsonProperty(value = "resourceIdDimensionNameOverride")
    private String resourceIdDimensionNameOverride;

    /**
     * Get the name property: The name of the metric.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metric.
     *
     * @param name the name value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The display name of the metric.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the metric.
     *
     * @param displayName the displayName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: The description of the metric.
     *
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: The description of the metric.
     *
     * @param displayDescription the displayDescription value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: Units the metric to be displayed in.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Units the metric to be displayed in.
     *
     * @param unit the unit value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregationType property: The aggregation type.
     *
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: The aggregation type.
     *
     * @param aggregationType the aggregationType value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the availabilities property: List of availability.
     *
     * @return the availabilities value.
     */
    public List<Availability> availabilities() {
        return this.availabilities;
    }

    /**
     * Set the availabilities property: List of availability.
     *
     * @param availabilities the availabilities value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAvailabilities(List<Availability> availabilities) {
        this.availabilities = availabilities;
        return this;
    }

    /**
     * Get the enableRegionalMdmAccount property: Whether regional MDM account enabled.
     *
     * @return the enableRegionalMdmAccount value.
     */
    public Boolean enableRegionalMdmAccount() {
        return this.enableRegionalMdmAccount;
    }

    /**
     * Set the enableRegionalMdmAccount property: Whether regional MDM account enabled.
     *
     * @param enableRegionalMdmAccount the enableRegionalMdmAccount value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withEnableRegionalMdmAccount(Boolean enableRegionalMdmAccount) {
        this.enableRegionalMdmAccount = enableRegionalMdmAccount;
        return this;
    }

    /**
     * Get the fillGapWithZero property: Whether gaps would be filled with zeros.
     *
     * @return the fillGapWithZero value.
     */
    public Boolean fillGapWithZero() {
        return this.fillGapWithZero;
    }

    /**
     * Set the fillGapWithZero property: Whether gaps would be filled with zeros.
     *
     * @param fillGapWithZero the fillGapWithZero value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withFillGapWithZero(Boolean fillGapWithZero) {
        this.fillGapWithZero = fillGapWithZero;
        return this;
    }

    /**
     * Get the metricFilterPattern property: Pattern for the filter of the metric.
     *
     * @return the metricFilterPattern value.
     */
    public String metricFilterPattern() {
        return this.metricFilterPattern;
    }

    /**
     * Set the metricFilterPattern property: Pattern for the filter of the metric.
     *
     * @param metricFilterPattern the metricFilterPattern value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withMetricFilterPattern(String metricFilterPattern) {
        this.metricFilterPattern = metricFilterPattern;
        return this;
    }

    /**
     * Get the dimensions property: List of dimensions.
     *
     * @return the dimensions value.
     */
    public List<Dimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: List of dimensions.
     *
     * @param dimensions the dimensions value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the isInternal property: Whether the metric is internal.
     *
     * @return the isInternal value.
     */
    public Boolean isInternal() {
        return this.isInternal;
    }

    /**
     * Set the isInternal property: Whether the metric is internal.
     *
     * @param isInternal the isInternal value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
        return this;
    }

    /**
     * Get the sourceMdmAccount property: The source MDM account.
     *
     * @return the sourceMdmAccount value.
     */
    public String sourceMdmAccount() {
        return this.sourceMdmAccount;
    }

    /**
     * Set the sourceMdmAccount property: The source MDM account.
     *
     * @param sourceMdmAccount the sourceMdmAccount value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSourceMdmAccount(String sourceMdmAccount) {
        this.sourceMdmAccount = sourceMdmAccount;
        return this;
    }

    /**
     * Get the sourceMdmNamespace property: The source MDM namespace.
     *
     * @return the sourceMdmNamespace value.
     */
    public String sourceMdmNamespace() {
        return this.sourceMdmNamespace;
    }

    /**
     * Set the sourceMdmNamespace property: The source MDM namespace.
     *
     * @param sourceMdmNamespace the sourceMdmNamespace value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSourceMdmNamespace(String sourceMdmNamespace) {
        this.sourceMdmNamespace = sourceMdmNamespace;
        return this;
    }

    /**
     * Get the resourceIdDimensionNameOverride property: The resource Id dimension name override.
     *
     * @return the resourceIdDimensionNameOverride value.
     */
    public String resourceIdDimensionNameOverride() {
        return this.resourceIdDimensionNameOverride;
    }

    /**
     * Set the resourceIdDimensionNameOverride property: The resource Id dimension name override.
     *
     * @param resourceIdDimensionNameOverride the resourceIdDimensionNameOverride value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withResourceIdDimensionNameOverride(String resourceIdDimensionNameOverride) {
        this.resourceIdDimensionNameOverride = resourceIdDimensionNameOverride;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availabilities() != null) {
            availabilities().forEach(e -> e.validate());
        }
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }
}
