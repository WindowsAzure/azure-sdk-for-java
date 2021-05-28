// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SQLSourceParameterPatch model. */
@Fluent
public final class SQLSourceParameterPatch {
    /*
     * The connection string of this database
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /*
     * The script to query this database
     */
    @JsonProperty(value = "query")
    private String query;

    /**
     * Get the connectionString property: The connection string of this database.
     *
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of this database.
     *
     * @param connectionString the connectionString value to set.
     * @return the SQLSourceParameterPatch object itself.
     */
    public SQLSourceParameterPatch setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the query property: The script to query this database.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: The script to query this database.
     *
     * @param query the query value to set.
     * @return the SQLSourceParameterPatch object itself.
     */
    public SQLSourceParameterPatch setQuery(String query) {
        this.query = query;
        return this;
    }
}
