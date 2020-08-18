// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The IndexDocumentsResult model. */
@Immutable
public final class IndexDocumentsResult {
    /*
     * The list of status information for each document in the indexing
     * request.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<IndexingResult> results;

    /** Creates an instance of IndexDocumentsResult class. */
    @JsonCreator
    public IndexDocumentsResult(
            @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    List<IndexingResult> results) {
        this.results = results;
    }

    /**
     * Get the results property: The list of status information for each document in the indexing request.
     *
     * @return the results value.
     */
    public List<IndexingResult> getResults() {
        return this.results;
    }
}
