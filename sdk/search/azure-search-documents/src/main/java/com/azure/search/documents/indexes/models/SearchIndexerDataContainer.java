// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents information about the entity (such as Azure SQL table or CosmosDB
 * collection) that will be indexed.
 */
@Fluent
public final class SearchIndexerDataContainer {
    /*
     * The name of the table or view (for Azure SQL data source) or collection
     * (for CosmosDB data source) that will be indexed.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A query that is applied to this data container. The syntax and meaning
     * of this parameter is datasource-specific. Not supported by Azure SQL
     * datasources.
     */
    @JsonProperty(value = "query")
    private String query;

    /**
     * Constructor of {@link SearchIndexerDataContainer}.
     *
     * @param name The name of the table or view (for Azure SQL data source) or collection
     * (for CosmosDB data source) that will be indexed.
     */
    @JsonCreator
    public SearchIndexerDataContainer(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the table or view (for Azure SQL data
     * source) or collection (for CosmosDB data source) that will be indexed.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }


    /**
     * Get the query property: A query that is applied to this data container.
     * The syntax and meaning of this parameter is datasource-specific. Not
     * supported by Azure SQL datasources.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: A query that is applied to this data container.
     * The syntax and meaning of this parameter is datasource-specific. Not
     * supported by Azure SQL datasources.
     *
     * @param query the query value to set.
     * @return the SearchIndexerDataContainer object itself.
     */
    public SearchIndexerDataContainer setQuery(String query) {
        this.query = query;
        return this;
    }
}
