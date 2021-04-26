// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A database query. */
@Immutable
public final class QueryMetric {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryMetric.class);

    /*
     * The name of the metric
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The name of the metric for display in user interface
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The unit of measurement
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private QueryMetricUnit unit;

    /*
     * The measured value
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private Double value;

    /**
     * Get the name property: The name of the metric.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the displayName property: The name of the metric for display in user interface.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the unit property: The unit of measurement.
     *
     * @return the unit value.
     */
    public QueryMetricUnit unit() {
        return this.unit;
    }

    /**
     * Get the value property: The measured value.
     *
     * @return the value value.
     */
    public Double value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
