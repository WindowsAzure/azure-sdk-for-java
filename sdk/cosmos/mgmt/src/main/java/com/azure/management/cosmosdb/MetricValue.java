// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The MetricValue model. */
@Immutable
public class MetricValue {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricValue.class);

    /*
     * The number of values for the metric.
     */
    @JsonProperty(value = "_count", access = JsonProperty.Access.WRITE_ONLY)
    private Integer count;

    /*
     * The average value of the metric.
     */
    @JsonProperty(value = "average", access = JsonProperty.Access.WRITE_ONLY)
    private Double average;

    /*
     * The max value of the metric.
     */
    @JsonProperty(value = "maximum", access = JsonProperty.Access.WRITE_ONLY)
    private Double maximum;

    /*
     * The min value of the metric.
     */
    @JsonProperty(value = "minimum", access = JsonProperty.Access.WRITE_ONLY)
    private Double minimum;

    /*
     * The metric timestamp (ISO-8601 format).
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /*
     * The total value of the metric.
     */
    @JsonProperty(value = "total", access = JsonProperty.Access.WRITE_ONLY)
    private Double total;

    /**
     * Get the count property: The number of values for the metric.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Get the average property: The average value of the metric.
     *
     * @return the average value.
     */
    public Double average() {
        return this.average;
    }

    /**
     * Get the maximum property: The max value of the metric.
     *
     * @return the maximum value.
     */
    public Double maximum() {
        return this.maximum;
    }

    /**
     * Get the minimum property: The min value of the metric.
     *
     * @return the minimum value.
     */
    public Double minimum() {
        return this.minimum;
    }

    /**
     * Get the timestamp property: The metric timestamp (ISO-8601 format).
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get the total property: The total value of the metric.
     *
     * @return the total value.
     */
    public Double total() {
        return this.total;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
