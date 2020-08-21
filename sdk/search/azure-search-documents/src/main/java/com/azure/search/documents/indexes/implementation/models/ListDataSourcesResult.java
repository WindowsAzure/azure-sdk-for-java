// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
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

    /**
     * Creates an instance of ListDataSourcesResult class.
     *
     * @param dataSources the dataSources value to set.
     */
    @JsonCreator
    public ListDataSourcesResult(
            @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    List<SearchIndexerDataSource> dataSources) {
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
}
