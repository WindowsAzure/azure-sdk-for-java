// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AutocompleteResult model. */
@Immutable
public final class AutocompleteResult {
    /*
     * A value indicating the percentage of the index that was considered by
     * the autocomplete request, or null if minimumCoverage was not specified
     * in the request.
     */
    @JsonProperty(value = "@search.coverage", access = JsonProperty.Access.WRITE_ONLY)
    private Double coverage;

    /*
     * The list of returned Autocompleted items.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<AutocompleteItem> results;

    /**
     * Creates an instance of AutocompleteResult class.
     *
     * @param results the results value to set.
     */
    @JsonCreator
    public AutocompleteResult(
            @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    List<AutocompleteItem> results) {
        this.results = results;
    }

    /**
     * Get the coverage property: A value indicating the percentage of the index that was considered by the autocomplete
     * request, or null if minimumCoverage was not specified in the request.
     *
     * @return the coverage value.
     */
    public Double getCoverage() {
        return this.coverage;
    }

    /**
     * Get the results property: The list of returned Autocompleted items.
     *
     * @return the results value.
     */
    public List<AutocompleteItem> getResults() {
        return this.results;
    }
}
