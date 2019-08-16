/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Properties for the task that validates a migration for Oracle to Azure
 * Database for PostgreSQL for online migrations.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType", defaultImpl = ValidateOracleAzureDbForPostgreSqlSyncTaskProperties.class)
@JsonTypeName("Validate.Oracle.AzureDbPostgreSql.Sync")
public class ValidateOracleAzureDbForPostgreSqlSyncTaskProperties extends ProjectTaskProperties {
    /**
     * The input property.
     */
    @JsonProperty(value = "input")
    private MigrateOracleAzureDbPostgreSqlSyncTaskInput input;

    /**
     * An array containing a single validation error response object.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<ValidateOracleAzureDbPostgreSqlSyncTaskOutput> output;

    /**
     * Get the input value.
     *
     * @return the input value
     */
    public MigrateOracleAzureDbPostgreSqlSyncTaskInput input() {
        return this.input;
    }

    /**
     * Set the input value.
     *
     * @param input the input value to set
     * @return the ValidateOracleAzureDbForPostgreSqlSyncTaskProperties object itself.
     */
    public ValidateOracleAzureDbForPostgreSqlSyncTaskProperties withInput(MigrateOracleAzureDbPostgreSqlSyncTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get an array containing a single validation error response object.
     *
     * @return the output value
     */
    public List<ValidateOracleAzureDbPostgreSqlSyncTaskOutput> output() {
        return this.output;
    }

}
