/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("DatabaseLevelErrorOutput")
public class MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError extends MigrateOracleAzureDbPostgreSqlSyncTaskOutput {
    /**
     * Error message.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * List of error events.
     */
    @JsonProperty(value = "events")
    private List<SyncMigrationDatabaseErrorEvent> events;

    /**
     * Get error message.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set error message.
     *
     * @param errorMessage the errorMessage value to set
     * @return the MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError object itself.
     */
    public MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get list of error events.
     *
     * @return the events value
     */
    public List<SyncMigrationDatabaseErrorEvent> events() {
        return this.events;
    }

    /**
     * Set list of error events.
     *
     * @param events the events value to set
     * @return the MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError object itself.
     */
    public MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError withEvents(List<SyncMigrationDatabaseErrorEvent> events) {
        this.events = events;
        return this;
    }

}
