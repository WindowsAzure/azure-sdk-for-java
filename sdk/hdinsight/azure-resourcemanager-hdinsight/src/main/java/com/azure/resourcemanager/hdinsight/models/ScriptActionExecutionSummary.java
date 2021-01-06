// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The execution summary of a script action. */
@Immutable
public final class ScriptActionExecutionSummary {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScriptActionExecutionSummary.class);

    /*
     * The status of script action execution.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The instance count for a given script action execution status.
     */
    @JsonProperty(value = "instanceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer instanceCount;

    /**
     * Get the status property: The status of script action execution.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the instanceCount property: The instance count for a given script action execution status.
     *
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
