// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description for what data to store in Azure Tables. */
@Fluent
public final class SearchIndexerKnowledgeStoreTableProjectionSelector
        extends SearchIndexerKnowledgeStoreProjectionSelector {
    /*
     * Name of the Azure table to store projected data in.
     */
    @JsonProperty(value = "tableName", required = true)
    private String tableName;

    /**
     * Creates an instance of SearchIndexerKnowledgeStoreTableProjectionSelector class.
     *
     * @param tableName the tableName value to set.
     */
    @JsonCreator
    public SearchIndexerKnowledgeStoreTableProjectionSelector(
            @JsonProperty(value = "tableName", required = true) String tableName) {
        this.tableName = tableName;
    }

    /**
     * Get the tableName property: Name of the Azure table to store projected data in.
     *
     * @return the tableName value.
     */
    public String getTableName() {
        return this.tableName;
    }
}
