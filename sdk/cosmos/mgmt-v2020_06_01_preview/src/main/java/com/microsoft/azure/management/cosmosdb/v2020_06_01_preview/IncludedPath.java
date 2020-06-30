/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The paths that are included in indexing.
 */
public class IncludedPath {
    /**
     * The path for which the indexing behavior applies to. Index paths
     * typically start with root and end with wildcard (/path/*).
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * List of indexes for this path.
     */
    @JsonProperty(value = "indexes")
    private List<Indexes> indexes;

    /**
     * Get the path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*).
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*).
     *
     * @param path the path value to set
     * @return the IncludedPath object itself.
     */
    public IncludedPath withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get list of indexes for this path.
     *
     * @return the indexes value
     */
    public List<Indexes> indexes() {
        return this.indexes;
    }

    /**
     * Set list of indexes for this path.
     *
     * @param indexes the indexes value to set
     * @return the IncludedPath object itself.
     */
    public IncludedPath withIndexes(List<Indexes> indexes) {
        this.indexes = indexes;
        return this;
    }

}
