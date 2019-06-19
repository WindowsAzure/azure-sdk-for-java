/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Output for the task that migrates Oracle databases to Azure Database for
 * PostgreSQL for online migrations.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("MigrateOracleAzureDbPostgreSqlSyncTaskOutput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DatabaseLevelErrorOutput", value = MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError.class),
    @JsonSubTypes.Type(name = "ErrorOutput", value = MigrateOracleAzureDbPostgreSqlSyncTaskOutputError.class),
    @JsonSubTypes.Type(name = "TableLevelOutput", value = MigrateOracleAzureDbPostgreSqlSyncTaskOutputTableLevel.class),
    @JsonSubTypes.Type(name = "DatabaseLevelOutput", value = MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseLevel.class),
    @JsonSubTypes.Type(name = "MigrationLevelOutput", value = MigrateOracleAzureDbPostgreSqlSyncTaskOutputMigrationLevel.class)
})
public class MigrateOracleAzureDbPostgreSqlSyncTaskOutput {
    /**
     * Result identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get result identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

}
