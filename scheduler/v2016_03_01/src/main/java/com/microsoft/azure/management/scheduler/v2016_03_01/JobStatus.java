/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_03_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JobStatus model.
 */
public class JobStatus {
    /**
     * Gets the number of times this job has executed.
     */
    @JsonProperty(value = "executionCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer executionCount;

    /**
     * Gets the number of times this job has failed.
     */
    @JsonProperty(value = "failureCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer failureCount;

    /**
     * Gets the number of faulted occurrences (occurrences that were retried
     * and failed as many times as the retry policy states).
     */
    @JsonProperty(value = "faultedCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer faultedCount;

    /**
     * Gets the time the last occurrence executed in ISO-8601 format.  Could be
     * empty if job has not run yet.
     */
    @JsonProperty(value = "lastExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastExecutionTime;

    /**
     * Gets the time of the next occurrence in ISO-8601 format. Could be empty
     * if the job is completed.
     */
    @JsonProperty(value = "nextExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime nextExecutionTime;

    /**
     * Get the executionCount value.
     *
     * @return the executionCount value
     */
    public Integer executionCount() {
        return this.executionCount;
    }

    /**
     * Get the failureCount value.
     *
     * @return the failureCount value
     */
    public Integer failureCount() {
        return this.failureCount;
    }

    /**
     * Get the faultedCount value.
     *
     * @return the faultedCount value
     */
    public Integer faultedCount() {
        return this.faultedCount;
    }

    /**
     * Get the lastExecutionTime value.
     *
     * @return the lastExecutionTime value
     */
    public DateTime lastExecutionTime() {
        return this.lastExecutionTime;
    }

    /**
     * Get the nextExecutionTime value.
     *
     * @return the nextExecutionTime value
     */
    public DateTime nextExecutionTime() {
        return this.nextExecutionTime;
    }

}
