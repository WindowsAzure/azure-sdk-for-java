// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonCreator;
=======
>>>>>>> b58ce026c9fe5fc4ad488b3aa7c0985968f73487
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListDataSourcesResult model. */
@Immutable
public final class ListDataSourcesResult {
    /*
     * The datasources in the Search service.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchIndexerDataSource> dataSources;

    /** Creates an instance of ListDataSourcesResult class. */
    @JsonCreator
    public ListDataSourcesResult(@JsonProperty(value = "value") List<SearchIndexerDataSource> dataSources) {
        this.dataSources = dataSources;
    }

    /**
     * Get the dataSources property: The datasources in the Search service.
     *
     * @return the dataSources value.
     */
    public List<SearchIndexerDataSource> getDataSources() {
        return this.dataSources;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getDataSources() != null) {
            getDataSources().forEach(e -> e.validate());
        }
    }
}
