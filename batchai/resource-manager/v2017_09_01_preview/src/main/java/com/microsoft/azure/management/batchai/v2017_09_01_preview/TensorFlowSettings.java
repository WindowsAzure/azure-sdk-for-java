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
 * Specifies the settings for TensorFlow job.
 */
public class TensorFlowSettings {
    /**
     * The path and file name of the python script to execute the job.
     */
    @JsonProperty(value = "pythonScriptFilePath", required = true)
    private String pythonScriptFilePath;

    /**
     * The path to python interpreter.
     */
    @JsonProperty(value = "pythonInterpreterPath")
    private String pythonInterpreterPath;

    /**
     * Specifies the command line arguments for the master task.
     */
    @JsonProperty(value = "masterCommandLineArgs", required = true)
    private String masterCommandLineArgs;

    /**
     * Specifies the command line arguments for the worker task.
     * This property is optional for single machine training.
     */
    @JsonProperty(value = "workerCommandLineArgs")
    private String workerCommandLineArgs;

    /**
     * Specifies the command line arguments for the parameter server task.
     * This property is optional for single machine training.
     */
    @JsonProperty(value = "parameterServerCommandLineArgs")
    private String parameterServerCommandLineArgs;

    /**
     * The number of worker tasks.
     * If specified, the value must be less than or equal to (nodeCount *
     * numberOfGPUs per VM). If not specified, the default value is equal to
     * nodeCount. This property can be specified only for distributed
     * TensorFlow training.
     */
    @JsonProperty(value = "workerCount")
    private Integer workerCount;

    /**
     * The number of parameter server tasks.
     * If specified, the value must be less than or equal to nodeCount. If not
     * specified, the default value is equal to 1 for distributed TensorFlow
     * training (This property is not applicable for single machine training).
     * This property can be specified only for distributed TensorFlow training.
     */
    @JsonProperty(value = "parameterServerCount")
    private Integer parameterServerCount;

    /**
     * Get the pythonScriptFilePath value.
     *
     * @return the pythonScriptFilePath value
     */
    public String pythonScriptFilePath() {
        return this.pythonScriptFilePath;
    }

    /**
     * Set the pythonScriptFilePath value.
     *
     * @param pythonScriptFilePath the pythonScriptFilePath value to set
     * @return the TensorFlowSettings object itself.
     */
    public TensorFlowSettings withPythonScriptFilePath(String pythonScriptFilePath) {
        this.pythonScriptFilePath = pythonScriptFilePath;
        return this;
    }

    /**
     * Get the pythonInterpreterPath value.
     *
     * @return the pythonInterpreterPath value
     */
    public String pythonInterpreterPath() {
        return this.pythonInterpreterPath;
    }

    /**
     * Set the pythonInterpreterPath value.
     *
     * @param pythonInterpreterPath the pythonInterpreterPath value to set
     * @return the TensorFlowSettings object itself.
     */
    public TensorFlowSettings withPythonInterpreterPath(String pythonInterpreterPath) {
        this.pythonInterpreterPath = pythonInterpreterPath;
        return this;
    }

    /**
     * Get the masterCommandLineArgs value.
     *
     * @return the masterCommandLineArgs value
     */
    public String masterCommandLineArgs() {
        return this.masterCommandLineArgs;
    }

    /**
     * Set the masterCommandLineArgs value.
     *
     * @param masterCommandLineArgs the masterCommandLineArgs value to set
     * @return the TensorFlowSettings object itself.
     */
    public TensorFlowSettings withMasterCommandLineArgs(String masterCommandLineArgs) {
        this.masterCommandLineArgs = masterCommandLineArgs;
        return this;
    }

    /**
     * Get this property is optional for single machine training.
     *
     * @return the workerCommandLineArgs value
     */
    public String workerCommandLineArgs() {
        return this.workerCommandLineArgs;
    }

    /**
     * Set this property is optional for single machine training.
     *
     * @param workerCommandLineArgs the workerCommandLineArgs value to set
     * @return the TensorFlowSettings object itself.
     */
    public TensorFlowSettings withWorkerCommandLineArgs(String workerCommandLineArgs) {
        this.workerCommandLineArgs = workerCommandLineArgs;
        return this;
    }

    /**
     * Get this property is optional for single machine training.
     *
     * @return the parameterServerCommandLineArgs value
     */
    public String parameterServerCommandLineArgs() {
        return this.parameterServerCommandLineArgs;
    }

    /**
     * Set this property is optional for single machine training.
     *
     * @param parameterServerCommandLineArgs the parameterServerCommandLineArgs value to set
     * @return the TensorFlowSettings object itself.
     */
    public TensorFlowSettings withParameterServerCommandLineArgs(String parameterServerCommandLineArgs) {
        this.parameterServerCommandLineArgs = parameterServerCommandLineArgs;
        return this;
    }

    /**
     * Get if specified, the value must be less than or equal to (nodeCount * numberOfGPUs per VM). If not specified, the default value is equal to nodeCount. This property can be specified only for distributed TensorFlow training.
     *
     * @return the workerCount value
     */
    public Integer workerCount() {
        return this.workerCount;
    }

    /**
     * Set if specified, the value must be less than or equal to (nodeCount * numberOfGPUs per VM). If not specified, the default value is equal to nodeCount. This property can be specified only for distributed TensorFlow training.
     *
     * @param workerCount the workerCount value to set
     * @return the TensorFlowSettings object itself.
     */
    public TensorFlowSettings withWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
        return this;
    }

    /**
     * Get if specified, the value must be less than or equal to nodeCount. If not specified, the default value is equal to 1 for distributed TensorFlow training (This property is not applicable for single machine training). This property can be specified only for distributed TensorFlow training.
     *
     * @return the parameterServerCount value
     */
    public Integer parameterServerCount() {
        return this.parameterServerCount;
    }

    /**
     * Set if specified, the value must be less than or equal to nodeCount. If not specified, the default value is equal to 1 for distributed TensorFlow training (This property is not applicable for single machine training). This property can be specified only for distributed TensorFlow training.
     *
     * @param parameterServerCount the parameterServerCount value to set
     * @return the TensorFlowSettings object itself.
     */
    public TensorFlowSettings withParameterServerCount(Integer parameterServerCount) {
        this.parameterServerCount = parameterServerCount;
        return this;
    }

}
