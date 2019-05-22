/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.MongoIndex;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * An Azure Cosmos DB MongoDB collection.
 */
@JsonFlatten
@SkipParentValidation
public class MongoDBCollectionInner extends Resource {
    /**
     * Name of the Cosmos DB MongoDB collection.
     */
    @JsonProperty(value = "properties.id", required = true)
    private String mongoDBCollectionId;

    /**
     * A key-value pair of shard keys to be applied for the request.
     */
    @JsonProperty(value = "properties.shardKey")
    private Map<String, String> shardKey;

    /**
     * List of index keys.
     */
    @JsonProperty(value = "properties.indexes")
    private List<MongoIndex> indexes;

    /**
     * Get name of the Cosmos DB MongoDB collection.
     *
     * @return the mongoDBCollectionId value
     */
    public String mongoDBCollectionId() {
        return this.mongoDBCollectionId;
    }

    /**
     * Set name of the Cosmos DB MongoDB collection.
     *
     * @param mongoDBCollectionId the mongoDBCollectionId value to set
     * @return the MongoDBCollectionInner object itself.
     */
    public MongoDBCollectionInner withMongoDBCollectionId(String mongoDBCollectionId) {
        this.mongoDBCollectionId = mongoDBCollectionId;
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
     * @return the MongoDBCollectionInner object itself.
     */
    public MongoDBCollectionInner withShardKey(Map<String, String> shardKey) {
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
     * @return the MongoDBCollectionInner object itself.
     */
    public MongoDBCollectionInner withIndexes(List<MongoIndex> indexes) {
        this.indexes = indexes;
        return this;
    }

}
