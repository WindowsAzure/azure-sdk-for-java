// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A metric emitted by service. */
@Fluent
public final class MetricSpecification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricSpecification.class);

    /*
     * The metric name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The metric display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The metric display description.
     */
    @JsonProperty(value = "displayDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String displayDescription;

    /*
     * The metric unit
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private MetricUnit unit;

    /*
     * The metric aggregation type
     */
    @JsonProperty(value = "aggregationType", access = JsonProperty.Access.WRITE_ONLY)
    private MetricAggregationType aggregationType;

    /*
     * The metric lock aggregation type
     */
    @JsonProperty(value = "lockAggregationType", access = JsonProperty.Access.WRITE_ONLY)
    private MetricAggregationType lockAggregationType;

    /*
     * Supported aggregation types.
     */
    @JsonProperty(value = "supportedAggregationTypes")
    private List<String> supportedAggregationTypes;

    /*
     * The metric dimensions.
     */
    @JsonProperty(value = "dimensions", access = JsonProperty.Access.WRITE_ONLY)
    private List<MetricDimension> dimensions;

    /**
     * Get the name property: The metric name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the displayName property: The metric display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the displayDescription property: The metric display description.
     *
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Get the unit property: The metric unit.
     *
     * @return the unit value.
     */
    public MetricUnit unit() {
        return this.unit;
    }

    /**
     * Get the aggregationType property: The metric aggregation type.
     *
     * @return the aggregationType value.
     */
    public MetricAggregationType aggregationType() {
        return this.aggregationType;
    }

    /**
     * Get the lockAggregationType property: The metric lock aggregation type.
     *
     * @return the lockAggregationType value.
     */
    public MetricAggregationType lockAggregationType() {
        return this.lockAggregationType;
    }

    /**
     * Get the supportedAggregationTypes property: Supported aggregation types.
     *
     * @return the supportedAggregationTypes value.
     */
    public List<String> supportedAggregationTypes() {
        return this.supportedAggregationTypes;
    }

    /**
     * Set the supportedAggregationTypes property: Supported aggregation types.
     *
     * @param supportedAggregationTypes the supportedAggregationTypes value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSupportedAggregationTypes(List<String> supportedAggregationTypes) {
        this.supportedAggregationTypes = supportedAggregationTypes;
        return this;
    }

    /**
     * Get the dimensions property: The metric dimensions.
     *
     * @return the dimensions value.
     */
    public List<MetricDimension> dimensions() {
        return this.dimensions;
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
