// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Definition of additional projections to azure blob, table, or files, of enriched data. */
@Fluent
public final class SearchIndexerKnowledgeStore {
    /*
     * The connection string to the storage account projections will be stored
     * in.
     */
    @JsonProperty(value = "storageConnectionString", required = true)
    private String storageConnectionString;

    /*
     * A list of additional projections to perform during indexing.
     */
    @JsonProperty(value = "projections", required = true)
    private List<SearchIndexerKnowledgeStoreProjection> projections;

    /**
     * Creates an instance of SearchIndexerKnowledgeStore class.
     *
     * @param storageConnectionString the storageConnectionString value to set.
     * @param projections the projections value to set.
     */
    @JsonCreator
    public SearchIndexerKnowledgeStore(
            @JsonProperty(value = "storageConnectionString", required = true) String storageConnectionString,
            @JsonProperty(value = "projections", required = true)
                    List<SearchIndexerKnowledgeStoreProjection> projections) {
        this.storageConnectionString = storageConnectionString;
        this.projections = projections;
    }

    /**
     * Get the storageConnectionString property: The connection string to the storage account projections will be stored
     * in.
     *
     * @return the storageConnectionString value.
     */
    public String getStorageConnectionString() {
        return this.storageConnectionString;
    }

    /**
     * Get the projections property: A list of additional projections to perform during indexing.
     *
     * @return the projections value.
     */
    public List<SearchIndexerKnowledgeStoreProjection> getProjections() {
        return this.projections;
    }
}
