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
 * Output for task that migrates SQL Server databases to Azure SQL Database
 * Managed Instance using Log Replay Service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("MigrateSqlServerSqlMISyncTaskOutput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ErrorOutput", value = MigrateSqlServerSqlMISyncTaskOutputError.class),
    @JsonSubTypes.Type(name = "DatabaseLevelOutput", value = MigrateSqlServerSqlMISyncTaskOutputDatabaseLevel.class),
    @JsonSubTypes.Type(name = "MigrationLevelOutput", value = MigrateSqlServerSqlMISyncTaskOutputMigrationLevel.class)
})
public class MigrateSqlServerSqlMISyncTaskOutput {
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
