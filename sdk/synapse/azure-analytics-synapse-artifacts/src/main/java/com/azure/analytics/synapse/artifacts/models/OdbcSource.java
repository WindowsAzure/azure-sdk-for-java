// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity source for ODBC databases. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("OdbcSource")
@Fluent
public final class OdbcSource extends TabularSource {
    /*
     * Database query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * Get the query property: Database query. Type: string (or Expression with resultType string).
     *
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Database query. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set.
     * @return the OdbcSource object itself.
     */
    public OdbcSource setQuery(Object query) {
        this.query = query;
        return this;
    }
}
