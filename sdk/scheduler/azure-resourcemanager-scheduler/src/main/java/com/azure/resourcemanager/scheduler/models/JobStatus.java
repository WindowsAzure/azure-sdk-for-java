// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scheduler.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The JobStatus model. */
@Immutable
public final class JobStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobStatus.class);

    /*
     * Gets the number of times this job has executed.
     */
    @JsonProperty(value = "executionCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer executionCount;

    /*
     * Gets the number of times this job has failed.
     */
    @JsonProperty(value = "failureCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer failureCount;

    /*
     * Gets the number of faulted occurrences (occurrences that were retried
     * and failed as many times as the retry policy states).
     */
    @JsonProperty(value = "faultedCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer faultedCount;

    /*
     * Gets the time the last occurrence executed in ISO-8601 format.  Could be
     * empty if job has not run yet.
     */
    @JsonProperty(value = "lastExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastExecutionTime;

    /*
     * Gets the time of the next occurrence in ISO-8601 format. Could be empty
     * if the job is completed.
     */
    @JsonProperty(value = "nextExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime nextExecutionTime;

    /**
     * Get the executionCount property: Gets the number of times this job has executed.
     *
     * @return the executionCount value.
     */
    public Integer executionCount() {
        return this.executionCount;
    }

    /**
     * Get the failureCount property: Gets the number of times this job has failed.
     *
     * @return the failureCount value.
     */
    public Integer failureCount() {
        return this.failureCount;
    }

    /**
     * Get the faultedCount property: Gets the number of faulted occurrences (occurrences that were retried and failed
     * as many times as the retry policy states).
     *
     * @return the faultedCount value.
     */
    public Integer faultedCount() {
        return this.faultedCount;
    }

    /**
     * Get the lastExecutionTime property: Gets the time the last occurrence executed in ISO-8601 format. Could be empty
     * if job has not run yet.
     *
     * @return the lastExecutionTime value.
     */
    public OffsetDateTime lastExecutionTime() {
        return this.lastExecutionTime;
    }

    /**
     * Get the nextExecutionTime property: Gets the time of the next occurrence in ISO-8601 format. Could be empty if
     * the job is completed.
     *
     * @return the nextExecutionTime value.
     */
    public OffsetDateTime nextExecutionTime() {
        return this.nextExecutionTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
