/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database specific information for MySQL to Azure Database for MySQL
 * migration task inputs.
 */
public class MigrateMySqlAzureDbForMySqlSyncDatabaseInput {
    /**
     * Name of the database.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Name of target database. Note: Target database will be truncated before
     * starting migration.
     */
    @JsonProperty(value = "targetDatabaseName")
    private String targetDatabaseName;

    /**
     * Get name of the database.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the database.
     *
     * @param name the name value to set
     * @return the MigrateMySqlAzureDbForMySqlSyncDatabaseInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlSyncDatabaseInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name of target database. Note: Target database will be truncated before starting migration.
     *
     * @return the targetDatabaseName value
     */
    public String targetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * Set name of target database. Note: Target database will be truncated before starting migration.
     *
     * @param targetDatabaseName the targetDatabaseName value to set
     * @return the MigrateMySqlAzureDbForMySqlSyncDatabaseInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlSyncDatabaseInput withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

}
