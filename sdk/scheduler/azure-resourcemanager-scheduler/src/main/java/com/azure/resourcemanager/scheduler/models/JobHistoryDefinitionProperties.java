// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scheduler.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The JobHistoryDefinitionProperties model. */
@Immutable
public final class JobHistoryDefinitionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobHistoryDefinitionProperties.class);

    /*
     * Gets the start time for this job.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * Gets the end time for this job.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * Gets the expected execution time for this job.
     */
    @JsonProperty(value = "expectedExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expectedExecutionTime;

    /*
     * Gets the job history action name.
     */
    @JsonProperty(value = "actionName", access = JsonProperty.Access.WRITE_ONLY)
    private JobHistoryActionName actionName;

    /*
     * Gets the job history status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private JobExecutionStatus status;

    /*
     * Gets the message for the job history.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Gets the retry count for job.
     */
    @JsonProperty(value = "retryCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer retryCount;

    /*
     * Gets the repeat count for the job.
     */
    @JsonProperty(value = "repeatCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer repeatCount;

    /**
     * Get the startTime property: Gets the start time for this job.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: Gets the end time for this job.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the expectedExecutionTime property: Gets the expected execution time for this job.
     *
     * @return the expectedExecutionTime value.
     */
    public OffsetDateTime expectedExecutionTime() {
        return this.expectedExecutionTime;
    }

    /**
     * Get the actionName property: Gets the job history action name.
     *
     * @return the actionName value.
     */
    public JobHistoryActionName actionName() {
        return this.actionName;
    }

    /**
     * Get the status property: Gets the job history status.
     *
     * @return the status value.
     */
    public JobExecutionStatus status() {
        return this.status;
    }

    /**
     * Get the message property: Gets the message for the job history.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the retryCount property: Gets the retry count for job.
     *
     * @return the retryCount value.
     */
    public Integer retryCount() {
        return this.retryCount;
    }

    /**
     * Get the repeatCount property: Gets the repeat count for the job.
     *
     * @return the repeatCount value.
     */
    public Integer repeatCount() {
        return this.repeatCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
