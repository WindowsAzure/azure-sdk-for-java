// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Chainer job settings. */
@Fluent
public final class ChainerSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ChainerSettings.class);

    /*
     * The python script to execute.
     */
    @JsonProperty(value = "pythonScriptFilePath", required = true)
    private String pythonScriptFilePath;

    /*
     * The path to the Python interpreter.
     */
    @JsonProperty(value = "pythonInterpreterPath")
    private String pythonInterpreterPath;

    /*
     * Command line arguments that need to be passed to the python script.
     */
    @JsonProperty(value = "commandLineArgs")
    private String commandLineArgs;

    /*
     * Number of processes to launch for the job execution. The default value
     * for this property is equal to nodeCount property
     */
    @JsonProperty(value = "processCount")
    private Integer processCount;

    /**
     * Get the pythonScriptFilePath property: The python script to execute.
     *
     * @return the pythonScriptFilePath value.
     */
    public String pythonScriptFilePath() {
        return this.pythonScriptFilePath;
    }

    /**
     * Set the pythonScriptFilePath property: The python script to execute.
     *
     * @param pythonScriptFilePath the pythonScriptFilePath value to set.
     * @return the ChainerSettings object itself.
     */
    public ChainerSettings withPythonScriptFilePath(String pythonScriptFilePath) {
        this.pythonScriptFilePath = pythonScriptFilePath;
        return this;
    }

    /**
     * Get the pythonInterpreterPath property: The path to the Python interpreter.
     *
     * @return the pythonInterpreterPath value.
     */
    public String pythonInterpreterPath() {
        return this.pythonInterpreterPath;
    }

    /**
     * Set the pythonInterpreterPath property: The path to the Python interpreter.
     *
     * @param pythonInterpreterPath the pythonInterpreterPath value to set.
     * @return the ChainerSettings object itself.
     */
    public ChainerSettings withPythonInterpreterPath(String pythonInterpreterPath) {
        this.pythonInterpreterPath = pythonInterpreterPath;
        return this;
    }

    /**
     * Get the commandLineArgs property: Command line arguments that need to be passed to the python script.
     *
     * @return the commandLineArgs value.
     */
    public String commandLineArgs() {
        return this.commandLineArgs;
    }

    /**
     * Set the commandLineArgs property: Command line arguments that need to be passed to the python script.
     *
     * @param commandLineArgs the commandLineArgs value to set.
     * @return the ChainerSettings object itself.
     */
    public ChainerSettings withCommandLineArgs(String commandLineArgs) {
        this.commandLineArgs = commandLineArgs;
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
     * @return the ChainerSettings object itself.
     */
    public ChainerSettings withProcessCount(Integer processCount) {
        this.processCount = processCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pythonScriptFilePath() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property pythonScriptFilePath in model ChainerSettings"));
        }
    }
}
