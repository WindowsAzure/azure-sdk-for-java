// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contains the tables, columns &amp; rows resulting from a query. */
@Fluent
public final class QueryResults {
    /*
     * The list of tables, columns and rows.
     */
    @JsonProperty(value = "tables", required = true)
    private List<Table> tables;

    /*
     * Statistics represented in JSON format.
     */
    @JsonProperty(value = "statistics")
    private Object statistics;

    /**
     * Creates an instance of QueryResults class.
     *
     * @param tables the tables value to set.
     */
    @JsonCreator
    public QueryResults(@JsonProperty(value = "tables", required = true) List<Table> tables) {
        this.tables = tables;
    }

    /**
     * Get the tables property: The list of tables, columns and rows.
     *
     * @return the tables value.
     */
    public List<Table> getTables() {
        return this.tables;
    }

    /**
     * Get the statistics property: Statistics represented in JSON format.
     *
     * @return the statistics value.
     */
    public Object getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: Statistics represented in JSON format.
     *
     * @param statistics the statistics value to set.
     * @return the QueryResults object itself.
     */
    public QueryResults setStatistics(Object statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getTables() == null) {
            throw new IllegalArgumentException("Missing required property tables in model QueryResults");
        } else {
            getTables().forEach(e -> e.validate());
        }
    }
}
