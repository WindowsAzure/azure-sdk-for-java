/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB MongoDB collection resource object.
 */
public class MongoDBCollectionResource {
    /**
     * Name of the Cosmos DB MongoDB collection.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * A key-value pair of shard keys to be applied for the request.
     */
    @JsonProperty(value = "shardKey")
    private Map<String, String> shardKey;

    /**
     * List of index keys.
     */
    @JsonProperty(value = "indexes")
    private List<MongoIndex> indexes;

    /**
     * Get name of the Cosmos DB MongoDB collection.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set name of the Cosmos DB MongoDB collection.
     *
     * @param id the id value to set
     * @return the MongoDBCollectionResource object itself.
     */
    public MongoDBCollectionResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get a key-value pair of shard keys to be applied for the request.
     *
     * @return the shardKey value
     */
    public Map<String, String> shardKey() {
        return this.shardKey;
    }

    /**
     * Set a key-value pair of shard keys to be applied for the request.
     *
     * @param shardKey the shardKey value to set
     * @return the MongoDBCollectionResource object itself.
     */
    public MongoDBCollectionResource withShardKey(Map<String, String> shardKey) {
        this.shardKey = shardKey;
        return this;
    }

    /**
     * Get list of index keys.
     *
     * @return the indexes value
     */
    public List<MongoIndex> indexes() {
        return this.indexes;
    }

    /**
     * Set list of index keys.
     *
     * @param indexes the indexes value to set
     * @return the MongoDBCollectionResource object itself.
     */
    public MongoDBCollectionResource withIndexes(List<MongoIndex> indexes) {
        this.indexes = indexes;
        return this;
    }

}
