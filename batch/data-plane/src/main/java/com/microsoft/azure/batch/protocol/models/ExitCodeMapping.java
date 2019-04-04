// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * How the Batch service should respond if a task exits with a particular exit
 * code.
 */
public class ExitCodeMapping {
    /**
     * A process exit code.
     */
    @JsonProperty(value = "code", required = true)
    private int code;

    /**
     * How the Batch service should respond if the task exits with this exit
     * code.
     */
    @JsonProperty(value = "exitOptions", required = true)
    private ExitOptions exitOptions;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public int code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the ExitCodeMapping object itself.
     */
    public ExitCodeMapping withCode(int code) {
        this.code = code;
        return this;
    }

    /**
     * Get the exitOptions value.
     *
     * @return the exitOptions value
     */
    public ExitOptions exitOptions() {
        return this.exitOptions;
    }

    /**
     * Set the exitOptions value.
     *
     * @param exitOptions the exitOptions value to set
     * @return the ExitCodeMapping object itself.
     */
    public ExitCodeMapping withExitOptions(ExitOptions exitOptions) {
        this.exitOptions = exitOptions;
        return this;
    }

}
