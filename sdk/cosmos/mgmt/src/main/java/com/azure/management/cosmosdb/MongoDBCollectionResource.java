// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The MongoDBCollectionResource model. */
@Fluent
public class MongoDBCollectionResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MongoDBCollectionResource.class);

    /*
     * Name of the Cosmos DB MongoDB collection
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * A key-value pair of shard keys to be applied for the request.
     */
    @JsonProperty(value = "shardKey")
    private Map<String, String> shardKey;

    /*
     * List of index keys
     */
    @JsonProperty(value = "indexes")
    private List<MongoIndex> indexes;

    /**
     * Get the id property: Name of the Cosmos DB MongoDB collection.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Name of the Cosmos DB MongoDB collection.
     *
     * @param id the id value to set.
     * @return the MongoDBCollectionResource object itself.
     */
    public MongoDBCollectionResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the shardKey property: A key-value pair of shard keys to be applied for the request.
     *
     * @return the shardKey value.
     */
    public Map<String, String> shardKey() {
        return this.shardKey;
    }

    /**
     * Set the shardKey property: A key-value pair of shard keys to be applied for the request.
     *
     * @param shardKey the shardKey value to set.
     * @return the MongoDBCollectionResource object itself.
     */
    public MongoDBCollectionResource withShardKey(Map<String, String> shardKey) {
        this.shardKey = shardKey;
        return this;
    }

    /**
     * Get the indexes property: List of index keys.
     *
     * @return the indexes value.
     */
    public List<MongoIndex> indexes() {
        return this.indexes;
    }

    /**
     * Set the indexes property: List of index keys.
     *
     * @param indexes the indexes value to set.
     * @return the MongoDBCollectionResource object itself.
     */
    public MongoDBCollectionResource withIndexes(List<MongoIndex> indexes) {
        this.indexes = indexes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model MongoDBCollectionResource"));
        }
        if (indexes() != null) {
            indexes().forEach(e -> e.validate());
        }
    }
}
