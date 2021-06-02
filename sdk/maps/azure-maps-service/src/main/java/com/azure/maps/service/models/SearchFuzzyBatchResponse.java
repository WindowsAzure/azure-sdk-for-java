// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Search Fuzzy Batch service call. */
@Immutable
public final class SearchFuzzyBatchResponse extends BatchResponse {
    /*
     * Array containing the batch results.
     */
    @JsonProperty(value = "batchItems", access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchFuzzyBatchItem> batchItems;

    /**
     * Get the batchItems property: Array containing the batch results.
     *
     * @return the batchItems value.
     */
    public List<SearchFuzzyBatchItem> getBatchItems() {
        return this.batchItems;
    }
}
