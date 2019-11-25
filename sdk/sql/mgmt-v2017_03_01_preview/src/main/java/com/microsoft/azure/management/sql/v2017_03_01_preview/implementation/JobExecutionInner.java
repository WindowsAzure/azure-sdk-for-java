/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import java.util.UUID;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobExecutionLifecycle;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ProvisioningState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobExecutionTarget;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An execution of a job.
 */
@JsonFlatten
public class JobExecutionInner extends ProxyResource {
    /**
     * The job version number.
     */
    @JsonProperty(value = "properties.jobVersion", access = JsonProperty.Access.WRITE_ONLY)
    private Integer jobVersion;

    /**
     * The job step name.
     */
    @JsonProperty(value = "properties.stepName", access = JsonProperty.Access.WRITE_ONLY)
    private String stepName;

    /**
     * The job step id.
     */
    @JsonProperty(value = "properties.stepId", access = JsonProperty.Access.WRITE_ONLY)
    private Integer stepId;

    /**
     * The unique identifier of the job execution.
     */
    @JsonProperty(value = "properties.jobExecutionId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID jobExecutionId;

    /**
     * The detailed state of the job execution. Possible values include:
     * 'Created', 'InProgress', 'WaitingForChildJobExecutions',
     * 'WaitingForRetry', 'Succeeded', 'SucceededWithSkipped', 'Failed',
     * 'TimedOut', 'Canceled', 'Skipped'.
     */
    @JsonProperty(value = "properties.lifecycle", access = JsonProperty.Access.WRITE_ONLY)
    private JobExecutionLifecycle lifecycle;

    /**
     * The ARM provisioning state of the job execution. Possible values
     * include: 'Created', 'InProgress', 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The time that the job execution was created.
     */
    @JsonProperty(value = "properties.createTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createTime;

    /**
     * The time that the job execution started.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * The time that the job execution completed.
     */
    @JsonProperty(value = "properties.endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * Number of times the job execution has been attempted.
     */
    @JsonProperty(value = "properties.currentAttempts")
    private Integer currentAttempts;

    /**
     * Start time of the current attempt.
     */
    @JsonProperty(value = "properties.currentAttemptStartTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime currentAttemptStartTime;

    /**
     * The last status or error message.
     */
    @JsonProperty(value = "properties.lastMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String lastMessage;

    /**
     * The target that this execution is executed on.
     */
    @JsonProperty(value = "properties.target", access = JsonProperty.Access.WRITE_ONLY)
    private JobExecutionTarget target;

    /**
     * Get the job version number.
     *
     * @return the jobVersion value
     */
    public Integer jobVersion() {
        return this.jobVersion;
    }

    /**
     * Get the job step name.
     *
     * @return the stepName value
     */
    public String stepName() {
        return this.stepName;
    }

    /**
     * Get the job step id.
     *
     * @return the stepId value
     */
    public Integer stepId() {
        return this.stepId;
    }

    /**
     * Get the unique identifier of the job execution.
     *
     * @return the jobExecutionId value
     */
    public UUID jobExecutionId() {
        return this.jobExecutionId;
    }

    /**
     * Get the detailed state of the job execution. Possible values include: 'Created', 'InProgress', 'WaitingForChildJobExecutions', 'WaitingForRetry', 'Succeeded', 'SucceededWithSkipped', 'Failed', 'TimedOut', 'Canceled', 'Skipped'.
     *
     * @return the lifecycle value
     */
    public JobExecutionLifecycle lifecycle() {
        return this.lifecycle;
    }

    /**
     * Get the ARM provisioning state of the job execution. Possible values include: 'Created', 'InProgress', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the time that the job execution was created.
     *
     * @return the createTime value
     */
    public DateTime createTime() {
        return this.createTime;
    }

    /**
     * Get the time that the job execution started.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the time that the job execution completed.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get number of times the job execution has been attempted.
     *
     * @return the currentAttempts value
     */
    public Integer currentAttempts() {
        return this.currentAttempts;
    }

    /**
     * Set number of times the job execution has been attempted.
     *
     * @param currentAttempts the currentAttempts value to set
     * @return the JobExecutionInner object itself.
     */
    public JobExecutionInner withCurrentAttempts(Integer currentAttempts) {
        this.currentAttempts = currentAttempts;
        return this;
    }

    /**
     * Get start time of the current attempt.
     *
     * @return the currentAttemptStartTime value
     */
    public DateTime currentAttemptStartTime() {
        return this.currentAttemptStartTime;
    }

    /**
     * Get the last status or error message.
     *
     * @return the lastMessage value
     */
    public String lastMessage() {
        return this.lastMessage;
    }

    /**
     * Get the target that this execution is executed on.
     *
     * @return the target value
     */
    public JobExecutionTarget target() {
        return this.target;
    }

}
