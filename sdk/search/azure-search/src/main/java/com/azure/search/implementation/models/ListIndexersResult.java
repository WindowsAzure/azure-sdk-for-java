// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.search.models.Indexer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response from a List Indexers request. If successful, it includes the full
 * definitions of all indexers.
 */
@Fluent
public final class ListIndexersResult {
    /*
     * The indexers in the Search service.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<Indexer> indexers;

    /**
     * Get the indexers property: The indexers in the Search service.
     *
     * @return the indexers value.
     */
    public List<Indexer> getIndexers() {
        return this.indexers;
    }
}
