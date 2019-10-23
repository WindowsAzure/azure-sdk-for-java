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
 * Properties for the task that validates connection to Azure SQL Database
 * Managed Instance.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("ConnectToTarget.AzureSqlDbMI")
public class ConnectToTargetSqlMITaskProperties extends ProjectTaskProperties {
    /**
     * Task input.
     */
    @JsonProperty(value = "input")
    private ConnectToTargetSqlMITaskInput input;

    /**
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectToTargetSqlMITaskOutput> output;

    /**
     * Get task input.
     *
     * @return the input value
     */
    public ConnectToTargetSqlMITaskInput input() {
        return this.input;
    }

    /**
     * Set task input.
     *
     * @param input the input value to set
     * @return the ConnectToTargetSqlMITaskProperties object itself.
     */
    public ConnectToTargetSqlMITaskProperties withInput(ConnectToTargetSqlMITaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get task output. This is ignored if submitted.
     *
     * @return the output value
     */
    public List<ConnectToTargetSqlMITaskOutput> output() {
        return this.output;
    }

}
