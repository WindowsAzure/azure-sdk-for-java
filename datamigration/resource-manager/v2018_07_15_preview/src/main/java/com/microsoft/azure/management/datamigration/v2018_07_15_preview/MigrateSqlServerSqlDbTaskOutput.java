/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Output for the task that migrates on-prem SQL Server databases to Azure SQL
 * Database.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType", defaultImpl = MigrateSqlServerSqlDbTaskOutput.class)
@JsonTypeName("MigrateSqlServerSqlDbTaskOutput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ErrorOutput", value = MigrateSqlServerSqlDbTaskOutputError.class),
    @JsonSubTypes.Type(name = "TableLevelOutput", value = MigrateSqlServerSqlDbTaskOutputTableLevel.class),
    @JsonSubTypes.Type(name = "DatabaseLevelOutput", value = MigrateSqlServerSqlDbTaskOutputDatabaseLevel.class),
    @JsonSubTypes.Type(name = "MigrationLevelOutput", value = MigrateSqlServerSqlDbTaskOutputMigrationLevel.class)
})
public class MigrateSqlServerSqlDbTaskOutput {
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
