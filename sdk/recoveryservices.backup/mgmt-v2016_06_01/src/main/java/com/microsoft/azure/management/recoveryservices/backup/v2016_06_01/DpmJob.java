/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import org.joda.time.Period;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.JobInner;

/**
 * The DPM workload-specifc job object.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobType")
@JsonTypeName("DpmJob")
public class DpmJob extends JobInner {
    /**
     * The time elapsed for the job.
     */
    @JsonProperty(value = "duration")
    private Period duration;

    /**
     * DPM server name managing the backup item or backup job.
     */
    @JsonProperty(value = "dpmServerName")
    private String dpmServerName;

    /**
     * The name of the cluster or server protecting the current backup item, if
     * any.
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /**
     * The type of container.
     */
    @JsonProperty(value = "containerType")
    private String containerType;

    /**
     * The type of backup item.
     */
    @JsonProperty(value = "workloadType")
    private String workloadType;

    /**
     * The state or actions applicable on this job, such as Cancel or Retry.
     */
    @JsonProperty(value = "actionsInfo")
    private List<JobSupportedAction> actionsInfo;

    /**
     * The errors.
     */
    @JsonProperty(value = "errorDetails")
    private List<DpmErrorInfo> errorDetails;

    /**
     * Additional information for this job.
     */
    @JsonProperty(value = "extendedInfo")
    private DpmJobExtendedInfo extendedInfo;

    /**
     * Get the time elapsed for the job.
     *
     * @return the duration value
     */
    public Period duration() {
        return this.duration;
    }

    /**
     * Set the time elapsed for the job.
     *
     * @param duration the duration value to set
     * @return the DpmJob object itself.
     */
    public DpmJob withDuration(Period duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get dPM server name managing the backup item or backup job.
     *
     * @return the dpmServerName value
     */
    public String dpmServerName() {
        return this.dpmServerName;
    }

    /**
     * Set dPM server name managing the backup item or backup job.
     *
     * @param dpmServerName the dpmServerName value to set
     * @return the DpmJob object itself.
     */
    public DpmJob withDpmServerName(String dpmServerName) {
        this.dpmServerName = dpmServerName;
        return this;
    }

    /**
     * Get the name of the cluster or server protecting the current backup item, if any.
     *
     * @return the containerName value
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the name of the cluster or server protecting the current backup item, if any.
     *
     * @param containerName the containerName value to set
     * @return the DpmJob object itself.
     */
    public DpmJob withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the type of container.
     *
     * @return the containerType value
     */
    public String containerType() {
        return this.containerType;
    }

    /**
     * Set the type of container.
     *
     * @param containerType the containerType value to set
     * @return the DpmJob object itself.
     */
    public DpmJob withContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }

    /**
     * Get the type of backup item.
     *
     * @return the workloadType value
     */
    public String workloadType() {
        return this.workloadType;
    }

    /**
     * Set the type of backup item.
     *
     * @param workloadType the workloadType value to set
     * @return the DpmJob object itself.
     */
    public DpmJob withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get the state or actions applicable on this job, such as Cancel or Retry.
     *
     * @return the actionsInfo value
     */
    public List<JobSupportedAction> actionsInfo() {
        return this.actionsInfo;
    }

    /**
     * Set the state or actions applicable on this job, such as Cancel or Retry.
     *
     * @param actionsInfo the actionsInfo value to set
     * @return the DpmJob object itself.
     */
    public DpmJob withActionsInfo(List<JobSupportedAction> actionsInfo) {
        this.actionsInfo = actionsInfo;
        return this;
    }

    /**
     * Get the errors.
     *
     * @return the errorDetails value
     */
    public List<DpmErrorInfo> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set the errors.
     *
     * @param errorDetails the errorDetails value to set
     * @return the DpmJob object itself.
     */
    public DpmJob withErrorDetails(List<DpmErrorInfo> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * Get additional information for this job.
     *
     * @return the extendedInfo value
     */
    public DpmJobExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set additional information for this job.
     *
     * @param extendedInfo the extendedInfo value to set
     * @return the DpmJob object itself.
     */
    public DpmJob withExtendedInfo(DpmJobExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

}
