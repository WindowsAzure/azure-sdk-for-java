// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input for the task that validates connection to Azure Database for PostgreSQL and target server requirements. */
@Fluent
public final class ConnectToTargetAzureDbForPostgreSqlSyncTaskInput {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ConnectToTargetAzureDbForPostgreSqlSyncTaskInput.class);

    /*
     * Connection information for source PostgreSQL server
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private PostgreSqlConnectionInfo sourceConnectionInfo;

    /*
     * Connection information for target Azure Database for PostgreSQL server
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private PostgreSqlConnectionInfo targetConnectionInfo;

    /**
     * Get the sourceConnectionInfo property: Connection information for source PostgreSQL server.
     *
     * @return the sourceConnectionInfo value.
     */
    public PostgreSqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set the sourceConnectionInfo property: Connection information for source PostgreSQL server.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set.
     * @return the ConnectToTargetAzureDbForPostgreSqlSyncTaskInput object itself.
     */
    public ConnectToTargetAzureDbForPostgreSqlSyncTaskInput withSourceConnectionInfo(
        PostgreSqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get the targetConnectionInfo property: Connection information for target Azure Database for PostgreSQL server.
     *
     * @return the targetConnectionInfo value.
     */
    public PostgreSqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Connection information for target Azure Database for PostgreSQL server.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the ConnectToTargetAzureDbForPostgreSqlSyncTaskInput object itself.
     */
    public ConnectToTargetAzureDbForPostgreSqlSyncTaskInput withTargetConnectionInfo(
        PostgreSqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
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
                            + " ConnectToTargetAzureDbForPostgreSqlSyncTaskInput"));
        } else {
            sourceConnectionInfo().validate();
        }
        if (targetConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetConnectionInfo in model"
                            + " ConnectToTargetAzureDbForPostgreSqlSyncTaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
    }
}
