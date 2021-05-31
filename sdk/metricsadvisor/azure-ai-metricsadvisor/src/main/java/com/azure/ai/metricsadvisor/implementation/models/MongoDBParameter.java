// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MongoDBParameter model. */
@Fluent
public final class MongoDBParameter {
    /*
     * The connection string of this MongoDB
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /*
     * A database name in this MongoDB
     */
    @JsonProperty(value = "database")
    private String database;

    /*
     * The script to query this database
     */
    @JsonProperty(value = "command", required = true)
    private String command;

    /**
     * Get the connectionString property: The connection string of this MongoDB.
     *
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of this MongoDB.
     *
     * @param connectionString the connectionString value to set.
     * @return the MongoDBParameter object itself.
     */
    public MongoDBParameter setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the database property: A database name in this MongoDB.
     *
     * @return the database value.
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * Set the database property: A database name in this MongoDB.
     *
     * @param database the database value to set.
     * @return the MongoDBParameter object itself.
     */
    public MongoDBParameter setDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * Get the command property: The script to query this database.
     *
     * @return the command value.
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * Set the command property: The script to query this database.
     *
     * @param command the command value to set.
     * @return the MongoDBParameter object itself.
     */
    public MongoDBParameter setCommand(String command) {
        this.command = command;
        return this;
    }
}
