// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Input for the task that migrates MySQL databases to Azure Database for MySQL for online migrations. */
@Fluent
public final class MigrateMySqlAzureDbForMySqlSyncTaskInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrateMySqlAzureDbForMySqlSyncTaskInput.class);

    /*
     * Connection information for source MySQL
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private MySqlConnectionInfo sourceConnectionInfo;

    /*
     * Connection information for target Azure Database for MySQL
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private MySqlConnectionInfo targetConnectionInfo;

    /*
     * Databases to migrate
     */
    @JsonProperty(value = "selectedDatabases", required = true)
    private List<MigrateMySqlAzureDbForMySqlSyncDatabaseInput> selectedDatabases;

    /**
     * Get the sourceConnectionInfo property: Connection information for source MySQL.
     *
     * @return the sourceConnectionInfo value.
     */
    public MySqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set the sourceConnectionInfo property: Connection information for source MySQL.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set.
     * @return the MigrateMySqlAzureDbForMySqlSyncTaskInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlSyncTaskInput withSourceConnectionInfo(MySqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get the targetConnectionInfo property: Connection information for target Azure Database for MySQL.
     *
     * @return the targetConnectionInfo value.
     */
    public MySqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Connection information for target Azure Database for MySQL.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the MigrateMySqlAzureDbForMySqlSyncTaskInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlSyncTaskInput withTargetConnectionInfo(MySqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get the selectedDatabases property: Databases to migrate.
     *
     * @return the selectedDatabases value.
     */
    public List<MigrateMySqlAzureDbForMySqlSyncDatabaseInput> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set the selectedDatabases property: Databases to migrate.
     *
     * @param selectedDatabases the selectedDatabases value to set.
     * @return the MigrateMySqlAzureDbForMySqlSyncTaskInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlSyncTaskInput withSelectedDatabases(
        List<MigrateMySqlAzureDbForMySqlSyncDatabaseInput> selectedDatabases) {
        this.selectedDatabases = selectedDatabases;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceConnectionInfo in model"
                            + " MigrateMySqlAzureDbForMySqlSyncTaskInput"));
        } else {
            sourceConnectionInfo().validate();
        }
        if (targetConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetConnectionInfo in model"
                            + " MigrateMySqlAzureDbForMySqlSyncTaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
        if (selectedDatabases() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property selectedDatabases in model"
                            + " MigrateMySqlAzureDbForMySqlSyncTaskInput"));
        } else {
            selectedDatabases().forEach(e -> e.validate());
        }
    }
}
