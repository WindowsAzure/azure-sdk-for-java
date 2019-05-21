/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Properties for task that validates migration input for SQL to Azure SQL
 * Database Managed Instance.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("ValidateMigrationInput.SqlServer.AzureSqlDbMI")
public class ValidateMigrationInputSqlServerSqlMITaskProperties extends ProjectTaskProperties {
    /**
     * Task input.
     */
    @JsonProperty(value = "input")
    private ValidateMigrationInputSqlServerSqlMITaskInput input;

    /**
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<ValidateMigrationInputSqlServerSqlMITaskOutput> output;

    /**
     * Get task input.
     *
     * @return the input value
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput input() {
        return this.input;
    }

    /**
     * Set task input.
     *
     * @param input the input value to set
     * @return the ValidateMigrationInputSqlServerSqlMITaskProperties object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskProperties withInput(ValidateMigrationInputSqlServerSqlMITaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get task output. This is ignored if submitted.
     *
     * @return the output value
     */
    public List<ValidateMigrationInputSqlServerSqlMITaskOutput> output() {
        return this.output;
    }

}
