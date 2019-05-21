/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.BackupManagementType;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Defines workload-agnostic properties for a job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobType")
@JsonTypeName("Job")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureIaaSVMJob", value = AzureIaaSVMJob.class),
    @JsonSubTypes.Type(name = "DpmJob", value = DpmJob.class),
    @JsonSubTypes.Type(name = "MabJob", value = MabJob.class)
})
public class JobInner {
    /**
     * The friendly name of the entity on which the current job is executing.
     */
    @JsonProperty(value = "entityFriendlyName")
    private String entityFriendlyName;

    /**
     * The backup management type for the current job. Possible values include:
     * 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * The operation name.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * The job status.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The start time.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The end time.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * ActivityId of job.
     */
    @JsonProperty(value = "activityId")
    private String activityId;

    /**
     * Get the friendly name of the entity on which the current job is executing.
     *
     * @return the entityFriendlyName value
     */
    public String entityFriendlyName() {
        return this.entityFriendlyName;
    }

    /**
     * Set the friendly name of the entity on which the current job is executing.
     *
     * @param entityFriendlyName the entityFriendlyName value to set
     * @return the JobInner object itself.
     */
    public JobInner withEntityFriendlyName(String entityFriendlyName) {
        this.entityFriendlyName = entityFriendlyName;
        return this;
    }

    /**
     * Get the backup management type for the current job. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the backup management type for the current job. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the JobInner object itself.
     */
    public JobInner withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the operation name.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation name.
     *
     * @param operation the operation value to set
     * @return the JobInner object itself.
     */
    public JobInner withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the job status.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the job status.
     *
     * @param status the status value to set
     * @return the JobInner object itself.
     */
    public JobInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the start time.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the start time.
     *
     * @param startTime the startTime value to set
     * @return the JobInner object itself.
     */
    public JobInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the end time.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the end time.
     *
     * @param endTime the endTime value to set
     * @return the JobInner object itself.
     */
    public JobInner withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get activityId of job.
     *
     * @return the activityId value
     */
    public String activityId() {
        return this.activityId;
    }

    /**
     * Set activityId of job.
     *
     * @param activityId the activityId value to set
     * @return the JobInner object itself.
     */
    public JobInner withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

}
