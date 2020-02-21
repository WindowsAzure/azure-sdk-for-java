/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB indexing policy.
 */
public class IndexingPolicy {
    /**
     * Indicates if the indexing policy is automatic.
     */
    @JsonProperty(value = "automatic")
    private Boolean automatic;

    /**
     * Indicates the indexing mode. Possible values include: 'Consistent',
     * 'Lazy', 'None'.
     */
    @JsonProperty(value = "indexingMode")
    private IndexingMode indexingMode;

    /**
     * List of paths to include in the indexing.
     */
    @JsonProperty(value = "includedPaths")
    private List<IncludedPath> includedPaths;

    /**
     * List of paths to exclude from indexing.
     */
    @JsonProperty(value = "excludedPaths")
    private List<ExcludedPath> excludedPaths;

    /**
     * Get indicates if the indexing policy is automatic.
     *
     * @return the automatic value
     */
    public Boolean automatic() {
        return this.automatic;
    }

    /**
     * Set indicates if the indexing policy is automatic.
     *
     * @param automatic the automatic value to set
     * @return the IndexingPolicy object itself.
     */
    public IndexingPolicy withAutomatic(Boolean automatic) {
        this.automatic = automatic;
        return this;
    }

    /**
     * Get indicates the indexing mode. Possible values include: 'Consistent', 'Lazy', 'None'.
     *
     * @return the indexingMode value
     */
    public IndexingMode indexingMode() {
        return this.indexingMode;
    }

    /**
     * Set indicates the indexing mode. Possible values include: 'Consistent', 'Lazy', 'None'.
     *
     * @param indexingMode the indexingMode value to set
     * @return the IndexingPolicy object itself.
     */
    public IndexingPolicy withIndexingMode(IndexingMode indexingMode) {
        this.indexingMode = indexingMode;
        return this;
    }

    /**
     * Get list of paths to include in the indexing.
     *
     * @return the includedPaths value
     */
    public List<IncludedPath> includedPaths() {
        return this.includedPaths;
    }

    /**
     * Set list of paths to include in the indexing.
     *
     * @param includedPaths the includedPaths value to set
     * @return the IndexingPolicy object itself.
     */
    public IndexingPolicy withIncludedPaths(List<IncludedPath> includedPaths) {
        this.includedPaths = includedPaths;
        return this;
    }

    /**
     * Get list of paths to exclude from indexing.
     *
     * @return the excludedPaths value
     */
    public List<ExcludedPath> excludedPaths() {
        return this.excludedPaths;
    }

    /**
     * Set list of paths to exclude from indexing.
     *
     * @param excludedPaths the excludedPaths value to set
     * @return the IndexingPolicy object itself.
     */
    public IndexingPolicy withExcludedPaths(List<ExcludedPath> excludedPaths) {
        this.excludedPaths = excludedPaths;
        return this;
    }

}
