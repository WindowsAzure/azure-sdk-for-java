// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB MongoDB collection index key. */
@Fluent
public final class MongoIndex {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MongoIndex.class);

    /*
     * Cosmos DB MongoDB collection index keys
     */
    @JsonProperty(value = "key")
    private MongoIndexKeys key;

    /*
     * Cosmos DB MongoDB collection index key options
     */
    @JsonProperty(value = "options")
    private MongoIndexOptions options;

    /**
     * Get the key property: Cosmos DB MongoDB collection index keys.
     *
     * @return the key value.
     */
    public MongoIndexKeys key() {
        return this.key;
    }

    /**
     * Set the key property: Cosmos DB MongoDB collection index keys.
     *
     * @param key the key value to set.
     * @return the MongoIndex object itself.
     */
    public MongoIndex withKey(MongoIndexKeys key) {
        this.key = key;
        return this;
    }

    /**
     * Get the options property: Cosmos DB MongoDB collection index key options.
     *
     * @return the options value.
     */
    public MongoIndexOptions options() {
        return this.options;
    }

    /**
     * Set the options property: Cosmos DB MongoDB collection index key options.
     *
     * @param options the options value to set.
     * @return the MongoIndex object itself.
     */
    public MongoIndex withOptions(MongoIndexOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (key() != null) {
            key().validate();
        }
        if (options() != null) {
            options().validate();
        }
    }
}
