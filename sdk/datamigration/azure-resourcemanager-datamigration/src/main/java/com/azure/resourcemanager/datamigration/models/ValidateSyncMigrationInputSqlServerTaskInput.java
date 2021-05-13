// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Input for task that validates migration input for SQL sync migrations. */
@Fluent
public final class ValidateSyncMigrationInputSqlServerTaskInput {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ValidateSyncMigrationInputSqlServerTaskInput.class);

    /*
     * Information for connecting to source SQL server
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private SqlConnectionInfo sourceConnectionInfo;

    /*
     * Information for connecting to target
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private SqlConnectionInfo targetConnectionInfo;

    /*
     * Databases to migrate
     */
    @JsonProperty(value = "selectedDatabases", required = true)
    private List<MigrateSqlServerSqlDbSyncDatabaseInput> selectedDatabases;

    /**
     * Get the sourceConnectionInfo property: Information for connecting to source SQL server.
     *
     * @return the sourceConnectionInfo value.
     */
    public SqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set the sourceConnectionInfo property: Information for connecting to source SQL server.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set.
     * @return the ValidateSyncMigrationInputSqlServerTaskInput object itself.
     */
    public ValidateSyncMigrationInputSqlServerTaskInput withSourceConnectionInfo(
        SqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get the targetConnectionInfo property: Information for connecting to target.
     *
     * @return the targetConnectionInfo value.
     */
    public SqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Information for connecting to target.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the ValidateSyncMigrationInputSqlServerTaskInput object itself.
     */
    public ValidateSyncMigrationInputSqlServerTaskInput withTargetConnectionInfo(
        SqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get the selectedDatabases property: Databases to migrate.
     *
     * @return the selectedDatabases value.
     */
    public List<MigrateSqlServerSqlDbSyncDatabaseInput> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set the selectedDatabases property: Databases to migrate.
     *
     * @param selectedDatabases the selectedDatabases value to set.
     * @return the ValidateSyncMigrationInputSqlServerTaskInput object itself.
     */
    public ValidateSyncMigrationInputSqlServerTaskInput withSelectedDatabases(
        List<MigrateSqlServerSqlDbSyncDatabaseInput> selectedDatabases) {
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
                            + " ValidateSyncMigrationInputSqlServerTaskInput"));
        } else {
            sourceConnectionInfo().validate();
        }
        if (targetConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetConnectionInfo in model"
                            + " ValidateSyncMigrationInputSqlServerTaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
        if (selectedDatabases() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property selectedDatabases in model"
                            + " ValidateSyncMigrationInputSqlServerTaskInput"));
        } else {
            selectedDatabases().forEach(e -> e.validate());
        }
    }
}
