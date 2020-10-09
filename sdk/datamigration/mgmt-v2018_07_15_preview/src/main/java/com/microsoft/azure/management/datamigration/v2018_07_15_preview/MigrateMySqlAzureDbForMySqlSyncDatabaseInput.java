/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.Map;
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
     * Migration settings which tune the migration behavior.
     */
    @JsonProperty(value = "migrationSetting")
    private Map<String, String> migrationSetting;

    /**
     * Source settings to tune source endpoint migration behavior.
     */
    @JsonProperty(value = "sourceSetting")
    private Map<String, String> sourceSetting;

    /**
     * Target settings to tune target endpoint migration behavior.
     */
    @JsonProperty(value = "targetSetting")
    private Map<String, String> targetSetting;

    /**
     * Mapping of source to target tables.
     */
    @JsonProperty(value = "tableMap")
    private Map<String, String> tableMap;

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

    /**
     * Get migration settings which tune the migration behavior.
     *
     * @return the migrationSetting value
     */
    public Map<String, String> migrationSetting() {
        return this.migrationSetting;
    }

    /**
     * Set migration settings which tune the migration behavior.
     *
     * @param migrationSetting the migrationSetting value to set
     * @return the MigrateMySqlAzureDbForMySqlSyncDatabaseInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlSyncDatabaseInput withMigrationSetting(Map<String, String> migrationSetting) {
        this.migrationSetting = migrationSetting;
        return this;
    }

    /**
     * Get source settings to tune source endpoint migration behavior.
     *
     * @return the sourceSetting value
     */
    public Map<String, String> sourceSetting() {
        return this.sourceSetting;
    }

    /**
     * Set source settings to tune source endpoint migration behavior.
     *
     * @param sourceSetting the sourceSetting value to set
     * @return the MigrateMySqlAzureDbForMySqlSyncDatabaseInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlSyncDatabaseInput withSourceSetting(Map<String, String> sourceSetting) {
        this.sourceSetting = sourceSetting;
        return this;
    }

    /**
     * Get target settings to tune target endpoint migration behavior.
     *
     * @return the targetSetting value
     */
    public Map<String, String> targetSetting() {
        return this.targetSetting;
    }

    /**
     * Set target settings to tune target endpoint migration behavior.
     *
     * @param targetSetting the targetSetting value to set
     * @return the MigrateMySqlAzureDbForMySqlSyncDatabaseInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlSyncDatabaseInput withTargetSetting(Map<String, String> targetSetting) {
        this.targetSetting = targetSetting;
        return this;
    }

    /**
     * Get mapping of source to target tables.
     *
     * @return the tableMap value
     */
    public Map<String, String> tableMap() {
        return this.tableMap;
    }

    /**
     * Set mapping of source to target tables.
     *
     * @param tableMap the tableMap value to set
     * @return the MigrateMySqlAzureDbForMySqlSyncDatabaseInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlSyncDatabaseInput withTableMap(Map<String, String> tableMap) {
        this.tableMap = tableMap;
        return this;
    }

}
