// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The rule query details. */
@Fluent
public final class QueryCheck {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryCheck.class);

    /*
     * The rule query.
     */
    @JsonProperty(value = "query")
    private String query;

    /*
     * Expected result.
     */
    @JsonProperty(value = "expectedResult")
    private List<List<String>> expectedResult;

    /*
     * Column names of expected result.
     */
    @JsonProperty(value = "columnNames")
    private List<String> columnNames;

    /**
     * Get the query property: The rule query.
     *
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: The rule query.
     *
     * @param query the query value to set.
     * @return the QueryCheck object itself.
     */
    public QueryCheck withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the expectedResult property: Expected result.
     *
     * @return the expectedResult value.
     */
    public List<List<String>> expectedResult() {
        return this.expectedResult;
    }

    /**
     * Set the expectedResult property: Expected result.
     *
     * @param expectedResult the expectedResult value to set.
     * @return the QueryCheck object itself.
     */
    public QueryCheck withExpectedResult(List<List<String>> expectedResult) {
        this.expectedResult = expectedResult;
        return this;
    }

    /**
     * Get the columnNames property: Column names of expected result.
     *
     * @return the columnNames value.
     */
    public List<String> columnNames() {
        return this.columnNames;
    }

    /**
     * Set the columnNames property: Column names of expected result.
     *
     * @param columnNames the columnNames value to set.
     * @return the QueryCheck object itself.
     */
    public QueryCheck withColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
