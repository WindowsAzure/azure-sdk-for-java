/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The results and errors from an execution of a Pool autoscale formula.
 */
public class AutoScaleRun {
    /**
     * The time at which the autoscale formula was last evaluated.
     */
    @JsonProperty(value = "timestamp", required = true)
    private DateTime timestamp;

    /**
     * The final values of all variables used in the evaluation of the
     * autoscale formula. Each variable value is returned in the form
     * $variable=value, and variables are separated by semicolons.
     */
    @JsonProperty(value = "results")
    private String results;

    /**
     * Details of the error encountered evaluating the autoscale formula on the
     * Pool, if the evaluation was unsuccessful.
     */
    @JsonProperty(value = "error")
    private AutoScaleRunError error;

    /**
     * Get the time at which the autoscale formula was last evaluated.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the time at which the autoscale formula was last evaluated.
     *
     * @param timestamp the timestamp value to set
     * @return the AutoScaleRun object itself.
     */
    public AutoScaleRun withTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the final values of all variables used in the evaluation of the autoscale formula. Each variable value is returned in the form $variable=value, and variables are separated by semicolons.
     *
     * @return the results value
     */
    public String results() {
        return this.results;
    }

    /**
     * Set the final values of all variables used in the evaluation of the autoscale formula. Each variable value is returned in the form $variable=value, and variables are separated by semicolons.
     *
     * @param results the results value to set
     * @return the AutoScaleRun object itself.
     */
    public AutoScaleRun withResults(String results) {
        this.results = results;
        return this;
    }

    /**
     * Get details of the error encountered evaluating the autoscale formula on the Pool, if the evaluation was unsuccessful.
     *
     * @return the error value
     */
    public AutoScaleRunError error() {
        return this.error;
    }

    /**
     * Set details of the error encountered evaluating the autoscale formula on the Pool, if the evaluation was unsuccessful.
     *
     * @param error the error value to set
     * @return the AutoScaleRun object itself.
     */
    public AutoScaleRun withError(AutoScaleRunError error) {
        this.error = error;
        return this;
    }

}
