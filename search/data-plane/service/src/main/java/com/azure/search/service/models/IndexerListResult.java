/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.search.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Response from a List Indexers request. If successful, it includes the full
 * definitions of all indexers.
 */
public class IndexerListResult {
    /**
     * The indexers in the Search service.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<Indexer> indexers;

    /**
     * Get the indexers in the Search service.
     *
     * @return the indexers value
     */
    public List<Indexer> indexers() {
        return this.indexers;
    }

}
