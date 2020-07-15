/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The execution summary of a script action.
 */
public class ScriptActionExecutionSummary {
    /**
     * The status of script action execution.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * The instance count for a given script action execution status.
     */
    @JsonProperty(value = "instanceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer instanceCount;

    /**
     * Get the status of script action execution.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the instance count for a given script action execution status.
     *
     * @return the instanceCount value
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

}
