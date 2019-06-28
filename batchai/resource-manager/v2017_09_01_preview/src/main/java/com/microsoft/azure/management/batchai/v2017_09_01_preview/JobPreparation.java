/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the settings for job preparation.
 */
public class JobPreparation {
    /**
     * The command line to execute.
     * If containerSettings is specified on the job, this commandLine will be
     * executed in the same container as job. Otherwise it will be executed on
     * the node.
     */
    @JsonProperty(value = "commandLine", required = true)
    private String commandLine;

    /**
     * Get if containerSettings is specified on the job, this commandLine will be executed in the same container as job. Otherwise it will be executed on the node.
     *
     * @return the commandLine value
     */
    public String commandLine() {
        return this.commandLine;
    }

    /**
     * Set if containerSettings is specified on the job, this commandLine will be executed in the same container as job. Otherwise it will be executed on the node.
     *
     * @param commandLine the commandLine value to set
     * @return the JobPreparation object itself.
     */
    public JobPreparation withCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }

}
