// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Immutable;
import com.azure.management.cosmosdb.MetricName;
import com.azure.management.cosmosdb.PercentileMetricValue;
import com.azure.management.cosmosdb.UnitType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The PercentileMetric model. */
@Immutable
public final class PercentileMetricInner {
    /*
     * The start time for the metric (ISO-8601 format).
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The end time for the metric (ISO-8601 format).
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * The time grain to be used to summarize the metric values.
     */
    @JsonProperty(value = "timeGrain", access = JsonProperty.Access.WRITE_ONLY)
    private String timeGrain;

    /*
     * The unit of the metric.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private UnitType unit;

    /*
     * The name information for the metric.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private MetricName name;

    /*
     * The percentile metric values for the specified time window and timestep.
     */
    @JsonProperty(value = "metricValues", access = JsonProperty.Access.WRITE_ONLY)
    private List<PercentileMetricValue> metricValues;

    /**
     * Get the startTime property: The start time for the metric (ISO-8601 format).
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The end time for the metric (ISO-8601 format).
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the timeGrain property: The time grain to be used to summarize the metric values.
     *
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Get the unit property: The unit of the metric.
     *
     * @return the unit value.
     */
    public UnitType unit() {
        return this.unit;
    }

    /**
     * Get the name property: The name information for the metric.
     *
     * @return the name value.
     */
    public MetricName name() {
        return this.name;
    }

    /**
     * Get the metricValues property: The percentile metric values for the specified time window and timestep.
     *
     * @return the metricValues value.
     */
    public List<PercentileMetricValue> metricValues() {
        return this.metricValues;
    }
}
