// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The QuerySpecification model. */
@Fluent
public final class QuerySpecification {
    /*
     * The query to execute. This value is ignored if a continuation token is
     * provided.
     */
    @JsonProperty(value = "query")
    private String query;

    /*
     * A token which is used to retrieve the next set of results from a
     * previous query.
     */
    @JsonProperty(value = "continuationToken")
    private String continuationToken;

    /**
     * Get the query property: The query to execute. This value is ignored if a continuation token is provided.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: The query to execute. This value is ignored if a continuation token is provided.
     *
     * @param query the query value to set.
     * @return the QuerySpecification object itself.
     */
    public QuerySpecification setQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the continuationToken property: A token which is used to retrieve the next set of results from a previous
     * query.
     *
     * @return the continuationToken value.
     */
    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuationToken property: A token which is used to retrieve the next set of results from a previous
     * query.
     *
     * @param continuationToken the continuationToken value to set.
     * @return the QuerySpecification object itself.
     */
    public QuerySpecification setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
}
