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
 * Properties for the task that checks for OCI drivers.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("Service.Check.OCI")
public class CheckOCIDriverTaskProperties extends ProjectTaskProperties {
    /**
     * The input property.
     */
    @JsonProperty(value = "input")
    private CheckOCIDriverTaskInput input;

    /**
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<CheckOCIDriverTaskOutput> output;

    /**
     * Get the input value.
     *
     * @return the input value
     */
    public CheckOCIDriverTaskInput input() {
        return this.input;
    }

    /**
     * Set the input value.
     *
     * @param input the input value to set
     * @return the CheckOCIDriverTaskProperties object itself.
     */
    public CheckOCIDriverTaskProperties withInput(CheckOCIDriverTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get task output. This is ignored if submitted.
     *
     * @return the output value
     */
    public List<CheckOCIDriverTaskOutput> output() {
        return this.output;
    }

}
