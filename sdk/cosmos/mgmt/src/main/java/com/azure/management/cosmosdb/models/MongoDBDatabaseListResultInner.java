// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MongoDBDatabaseListResult model. */
@Immutable
public final class MongoDBDatabaseListResultInner {
    /*
     * List of MongoDB databases and their properties.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<MongoDBDatabaseGetResultsInner> value;

    /**
     * Get the value property: List of MongoDB databases and their properties.
     *
     * @return the value value.
     */
    public List<MongoDBDatabaseGetResultsInner> value() {
        return this.value;
    }
}
