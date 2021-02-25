// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Metric specification of operation. */
@Fluent
public final class MetricSpecification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricSpecification.class);

    /*
     * Name of metric specification.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display name of metric specification.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Display description of metric specification.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /*
     * Unit could be Bytes or Count.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * Dimensions of blobs, including blob type and access tier.
     */
    @JsonProperty(value = "dimensions")
    private List<Dimension> dimensions;

    /*
     * Aggregation type could be Average.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /*
     * The property to decide fill gap with zero or not.
     */
    @JsonProperty(value = "fillGapWithZero")
    private Boolean fillGapWithZero;

    /*
     * The category this metric specification belong to, could be Capacity.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * Account Resource Id.
     */
    @JsonProperty(value = "resourceIdDimensionNameOverride")
    private String resourceIdDimensionNameOverride;

    /**
     * Get the name property: Name of metric specification.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of metric specification.
     *
     * @param name the name value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of metric specification.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of metric specification.
     *
     * @param displayName the displayName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: Display description of metric specification.
     *
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Display description of metric specification.
     *
     * @param displayDescription the displayDescription value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: Unit could be Bytes or Count.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Unit could be Bytes or Count.
     *
     * @param unit the unit value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the dimensions property: Dimensions of blobs, including blob type and access tier.
     *
     * @return the dimensions value.
     */
    public List<Dimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: Dimensions of blobs, including blob type and access tier.
     *
     * @param dimensions the dimensions value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the aggregationType property: Aggregation type could be Average.
     *
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: Aggregation type could be Average.
     *
     * @param aggregationType the aggregationType value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the fillGapWithZero property: The property to decide fill gap with zero or not.
     *
     * @return the fillGapWithZero value.
     */
    public Boolean fillGapWithZero() {
        return this.fillGapWithZero;
    }

    /**
     * Set the fillGapWithZero property: The property to decide fill gap with zero or not.
     *
     * @param fillGapWithZero the fillGapWithZero value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withFillGapWithZero(Boolean fillGapWithZero) {
        this.fillGapWithZero = fillGapWithZero;
        return this;
    }

    /**
     * Get the category property: The category this metric specification belong to, could be Capacity.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The category this metric specification belong to, could be Capacity.
     *
     * @param category the category value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the resourceIdDimensionNameOverride property: Account Resource Id.
     *
     * @return the resourceIdDimensionNameOverride value.
     */
    public String resourceIdDimensionNameOverride() {
        return this.resourceIdDimensionNameOverride;
    }

    /**
     * Set the resourceIdDimensionNameOverride property: Account Resource Id.
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
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }
}
