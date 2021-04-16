// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Custom MPI job settings. */
@Fluent
public final class CustomMpiSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomMpiSettings.class);

    /*
     * The command line to be executed by mpi runtime on each compute node.
     */
    @JsonProperty(value = "commandLine", required = true)
    private String commandLine;

    /*
     * Number of processes to launch for the job execution. The default value
     * for this property is equal to nodeCount property
     */
    @JsonProperty(value = "processCount")
    private Integer processCount;

    /**
     * Get the commandLine property: The command line to be executed by mpi runtime on each compute node.
     *
     * @return the commandLine value.
     */
    public String commandLine() {
        return this.commandLine;
    }

    /**
     * Set the commandLine property: The command line to be executed by mpi runtime on each compute node.
     *
     * @param commandLine the commandLine value to set.
     * @return the CustomMpiSettings object itself.
     */
    public CustomMpiSettings withCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }

    /**
     * Get the processCount property: Number of processes to launch for the job execution. The default value for this
     * property is equal to nodeCount property.
     *
     * @return the processCount value.
     */
    public Integer processCount() {
        return this.processCount;
    }

    /**
     * Set the processCount property: Number of processes to launch for the job execution. The default value for this
     * property is equal to nodeCount property.
     *
     * @param processCount the processCount value to set.
     * @return the CustomMpiSettings object itself.
     */
    public CustomMpiSettings withProcessCount(Integer processCount) {
        this.processCount = processCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (commandLine() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property commandLine in model CustomMpiSettings"));
        }
    }
}
