// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The IndexingPolicy model.
 */
@Fluent
public final class IndexingPolicy {
    /*
     * Indicates if the indexing policy is automatic
     */
    @JsonProperty(value = "automatic")
    private Boolean automatic;

    /*
     * Indicates the indexing mode.
     */
    @JsonProperty(value = "indexingMode")
    private IndexingMode indexingMode;

    /*
     * List of paths to include in the indexing
     */
    @JsonProperty(value = "includedPaths")
    private List<IncludedPath> includedPaths;

    /*
     * List of paths to exclude from indexing
     */
    @JsonProperty(value = "excludedPaths")
    private List<ExcludedPath> excludedPaths;

    /*
     * List of composite path list
     */
    @JsonProperty(value = "compositeIndexes")
    private List<List<CompositePath>> compositeIndexes;

    /*
     * List of spatial specifics
     */
    @JsonProperty(value = "spatialIndexes")
    private List<SpatialSpec> spatialIndexes;

    /**
     * Get the automatic property: Indicates if the indexing policy is
     * automatic.
     * 
     * @return the automatic value.
     */
    public Boolean automatic() {
        return this.automatic;
    }

    /**
     * Set the automatic property: Indicates if the indexing policy is
     * automatic.
     * 
     * @param automatic the automatic value to set.
     * @return the IndexingPolicy object itself.
     */
    public IndexingPolicy withAutomatic(Boolean automatic) {
        this.automatic = automatic;
        return this;
    }

    /**
     * Get the indexingMode property: Indicates the indexing mode.
     * 
     * @return the indexingMode value.
     */
    public IndexingMode indexingMode() {
        return this.indexingMode;
    }

    /**
     * Set the indexingMode property: Indicates the indexing mode.
     * 
     * @param indexingMode the indexingMode value to set.
     * @return the IndexingPolicy object itself.
     */
    public IndexingPolicy withIndexingMode(IndexingMode indexingMode) {
        this.indexingMode = indexingMode;
        return this;
    }

    /**
     * Get the includedPaths property: List of paths to include in the
     * indexing.
     * 
     * @return the includedPaths value.
     */
    public List<IncludedPath> includedPaths() {
        return this.includedPaths;
    }

    /**
     * Set the includedPaths property: List of paths to include in the
     * indexing.
     * 
     * @param includedPaths the includedPaths value to set.
     * @return the IndexingPolicy object itself.
     */
    public IndexingPolicy withIncludedPaths(List<IncludedPath> includedPaths) {
        this.includedPaths = includedPaths;
        return this;
    }

    /**
     * Get the excludedPaths property: List of paths to exclude from indexing.
     * 
     * @return the excludedPaths value.
     */
    public List<ExcludedPath> excludedPaths() {
        return this.excludedPaths;
    }

    /**
     * Set the excludedPaths property: List of paths to exclude from indexing.
     * 
     * @param excludedPaths the excludedPaths value to set.
     * @return the IndexingPolicy object itself.
     */
    public IndexingPolicy withExcludedPaths(List<ExcludedPath> excludedPaths) {
        this.excludedPaths = excludedPaths;
        return this;
    }

    /**
     * Get the compositeIndexes property: List of composite path list.
     * 
     * @return the compositeIndexes value.
     */
    public List<List<CompositePath>> compositeIndexes() {
        return this.compositeIndexes;
    }

    /**
     * Set the compositeIndexes property: List of composite path list.
     * 
     * @param compositeIndexes the compositeIndexes value to set.
     * @return the IndexingPolicy object itself.
     */
    public IndexingPolicy withCompositeIndexes(List<List<CompositePath>> compositeIndexes) {
        this.compositeIndexes = compositeIndexes;
        return this;
    }

    /**
     * Get the spatialIndexes property: List of spatial specifics.
     * 
     * @return the spatialIndexes value.
     */
    public List<SpatialSpec> spatialIndexes() {
        return this.spatialIndexes;
    }

    /**
     * Set the spatialIndexes property: List of spatial specifics.
     * 
     * @param spatialIndexes the spatialIndexes value to set.
     * @return the IndexingPolicy object itself.
     */
    public IndexingPolicy withSpatialIndexes(List<SpatialSpec> spatialIndexes) {
        this.spatialIndexes = spatialIndexes;
        return this;
    }
}
