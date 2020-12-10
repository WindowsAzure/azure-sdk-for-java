// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** A database query. */
@Immutable
public final class QueryInterval {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryInterval.class);

    /*
     * The start time of the measurement interval (ISO8601 format).
     */
    @JsonProperty(value = "intervalStartTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime intervalStartTime;

    /*
     * The number of times the query was executed during this interval.
     */
    @JsonProperty(value = "executionCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer executionCount;

    /*
     * The list of query metrics during this interval.
     */
    @JsonProperty(value = "metrics", access = JsonProperty.Access.WRITE_ONLY)
    private List<QueryMetric> metrics;

    /**
     * Get the intervalStartTime property: The start time of the measurement interval (ISO8601 format).
     *
     * @return the intervalStartTime value.
     */
    public OffsetDateTime intervalStartTime() {
        return this.intervalStartTime;
    }

    /**
     * Get the executionCount property: The number of times the query was executed during this interval.
     *
     * @return the executionCount value.
     */
    public Integer executionCount() {
        return this.executionCount;
    }

    /**
     * Get the metrics property: The list of query metrics during this interval.
     *
     * @return the metrics value.
     */
    public List<QueryMetric> metrics() {
        return this.metrics;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metrics() != null) {
            metrics().forEach(e -> e.validate());
        }
    }
}
