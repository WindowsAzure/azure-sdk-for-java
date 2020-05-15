// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SqlDatabaseResource model. */
@Fluent
public class SqlDatabaseResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlDatabaseResource.class);

    /*
     * Name of the Cosmos DB SQL database
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: Name of the Cosmos DB SQL database.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Name of the Cosmos DB SQL database.
     *
     * @param id the id value to set.
     * @return the SqlDatabaseResource object itself.
     */
    public SqlDatabaseResource withId(String id) {
        this.id = id;
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
                    new IllegalArgumentException("Missing required property id in model SqlDatabaseResource"));
        }
    }
}
