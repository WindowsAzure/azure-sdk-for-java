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
 * Properties for the task that collects user tables for the given list of
 * Oracle schemas.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType", defaultImpl = GetUserTablesOracleTaskProperties.class)
@JsonTypeName("GetUserTablesOracle")
public class GetUserTablesOracleTaskProperties extends ProjectTaskProperties {
    /**
     * Task input.
     */
    @JsonProperty(value = "input")
    private GetUserTablesOracleTaskInput input;

    /**
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<GetUserTablesOracleTaskOutput> output;

    /**
     * Get task input.
     *
     * @return the input value
     */
    public GetUserTablesOracleTaskInput input() {
        return this.input;
    }

    /**
     * Set task input.
     *
     * @param input the input value to set
     * @return the GetUserTablesOracleTaskProperties object itself.
     */
    public GetUserTablesOracleTaskProperties withInput(GetUserTablesOracleTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get task output. This is ignored if submitted.
     *
     * @return the output value
     */
    public List<GetUserTablesOracleTaskOutput> output() {
        return this.output;
    }

}
