// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A database query. */
@Immutable
public final class QueryStatistic {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryStatistic.class);

    /*
     * The id of the query
     */
    @JsonProperty(value = "queryId", access = JsonProperty.Access.WRITE_ONLY)
    private String queryId;

    /*
     * The list of query intervals.
     */
    @JsonProperty(value = "intervals", access = JsonProperty.Access.WRITE_ONLY)
    private List<QueryInterval> intervals;

    /**
     * Get the queryId property: The id of the query.
     *
     * @return the queryId value.
     */
    public String queryId() {
        return this.queryId;
    }

    /**
     * Get the intervals property: The list of query intervals.
     *
     * @return the intervals value.
     */
    public List<QueryInterval> intervals() {
        return this.intervals;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (intervals() != null) {
            intervals().forEach(e -> e.validate());
        }
    }
}
