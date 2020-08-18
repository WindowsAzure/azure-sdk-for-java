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

/** The ListIndexersResult model. */
@Immutable
public final class ListIndexersResult {
    /*
     * The indexers in the Search service.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchIndexer> indexers;

    /** Creates an instance of ListIndexersResult class. */
    @JsonCreator
    public ListIndexersResult(
            @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    List<SearchIndexer> indexers) {
        this.indexers = indexers;
    }

    /**
     * Get the indexers property: The indexers in the Search service.
     *
     * @return the indexers value.
     */
    public List<SearchIndexer> getIndexers() {
        return this.indexers;
    }
}
