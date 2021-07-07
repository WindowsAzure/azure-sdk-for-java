/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A range of exit codes and how the Batch service should respond to exit codes
 * within that range.
 */
public class ExitCodeRangeMapping {
    /**
     * The first exit code in the range.
     */
    @JsonProperty(value = "start", required = true)
    private int start;

    /**
     * The last exit code in the range.
     */
    @JsonProperty(value = "end", required = true)
    private int end;

    /**
     * How the Batch service should respond if the Task exits with an exit code
     * in the range start to end (inclusive).
     */
    @JsonProperty(value = "exitOptions", required = true)
    private ExitOptions exitOptions;

    /**
     * Get the first exit code in the range.
     *
     * @return the start value
     */
    public int start() {
        return this.start;
    }

    /**
     * Set the first exit code in the range.
     *
     * @param start the start value to set
     * @return the ExitCodeRangeMapping object itself.
     */
    public ExitCodeRangeMapping withStart(int start) {
        this.start = start;
        return this;
    }

    /**
     * Get the last exit code in the range.
     *
     * @return the end value
     */
    public int end() {
        return this.end;
    }

    /**
     * Set the last exit code in the range.
     *
     * @param end the end value to set
     * @return the ExitCodeRangeMapping object itself.
     */
    public ExitCodeRangeMapping withEnd(int end) {
        this.end = end;
        return this;
    }

    /**
     * Get how the Batch service should respond if the Task exits with an exit code in the range start to end (inclusive).
     *
     * @return the exitOptions value
     */
    public ExitOptions exitOptions() {
        return this.exitOptions;
    }

    /**
     * Set how the Batch service should respond if the Task exits with an exit code in the range start to end (inclusive).
     *
     * @param exitOptions the exitOptions value to set
     * @return the ExitCodeRangeMapping object itself.
     */
    public ExitCodeRangeMapping withExitOptions(ExitOptions exitOptions) {
        this.exitOptions = exitOptions;
        return this;
    }

}
