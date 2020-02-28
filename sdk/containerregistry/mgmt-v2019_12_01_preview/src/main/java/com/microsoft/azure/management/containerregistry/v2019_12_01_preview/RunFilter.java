/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties that are enabled for Odata querying on runs.
 */
public class RunFilter {
    /**
     * The unique identifier for the run.
     */
    @JsonProperty(value = "runId")
    private String runId;

    /**
     * The type of run. Possible values include: 'QuickBuild', 'QuickRun',
     * 'AutoBuild', 'AutoRun'.
     */
    @JsonProperty(value = "runType")
    private RunType runType;

    /**
     * The current status of the run. Possible values include: 'Queued',
     * 'Started', 'Running', 'Succeeded', 'Failed', 'Canceled', 'Error',
     * 'Timeout'.
     */
    @JsonProperty(value = "status")
    private RunStatus status;

    /**
     * The create time for a run.
     */
    @JsonProperty(value = "createTime")
    private DateTime createTime;

    /**
     * The time the run finished.
     */
    @JsonProperty(value = "finishTime")
    private DateTime finishTime;

    /**
     * The list of comma-separated image manifests that were generated from the
     * run. This is applicable if the run is of
     * build type.
     */
    @JsonProperty(value = "outputImageManifests")
    private String outputImageManifests;

    /**
     * The value that indicates whether archiving is enabled or not.
     */
    @JsonProperty(value = "isArchiveEnabled")
    private Boolean isArchiveEnabled;

    /**
     * The name of the task that the run corresponds to.
     */
    @JsonProperty(value = "taskName")
    private String taskName;

    /**
     * Get the unique identifier for the run.
     *
     * @return the runId value
     */
    public String runId() {
        return this.runId;
    }

    /**
     * Set the unique identifier for the run.
     *
     * @param runId the runId value to set
     * @return the RunFilter object itself.
     */
    public RunFilter withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get the type of run. Possible values include: 'QuickBuild', 'QuickRun', 'AutoBuild', 'AutoRun'.
     *
     * @return the runType value
     */
    public RunType runType() {
        return this.runType;
    }

    /**
     * Set the type of run. Possible values include: 'QuickBuild', 'QuickRun', 'AutoBuild', 'AutoRun'.
     *
     * @param runType the runType value to set
     * @return the RunFilter object itself.
     */
    public RunFilter withRunType(RunType runType) {
        this.runType = runType;
        return this;
    }

    /**
     * Get the current status of the run. Possible values include: 'Queued', 'Started', 'Running', 'Succeeded', 'Failed', 'Canceled', 'Error', 'Timeout'.
     *
     * @return the status value
     */
    public RunStatus status() {
        return this.status;
    }

    /**
     * Set the current status of the run. Possible values include: 'Queued', 'Started', 'Running', 'Succeeded', 'Failed', 'Canceled', 'Error', 'Timeout'.
     *
     * @param status the status value to set
     * @return the RunFilter object itself.
     */
    public RunFilter withStatus(RunStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the create time for a run.
     *
     * @return the createTime value
     */
    public DateTime createTime() {
        return this.createTime;
    }

    /**
     * Set the create time for a run.
     *
     * @param createTime the createTime value to set
     * @return the RunFilter object itself.
     */
    public RunFilter withCreateTime(DateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get the time the run finished.
     *
     * @return the finishTime value
     */
    public DateTime finishTime() {
        return this.finishTime;
    }

    /**
     * Set the time the run finished.
     *
     * @param finishTime the finishTime value to set
     * @return the RunFilter object itself.
     */
    public RunFilter withFinishTime(DateTime finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * Get the list of comma-separated image manifests that were generated from the run. This is applicable if the run is of
     build type.
     *
     * @return the outputImageManifests value
     */
    public String outputImageManifests() {
        return this.outputImageManifests;
    }

    /**
     * Set the list of comma-separated image manifests that were generated from the run. This is applicable if the run is of
     build type.
     *
     * @param outputImageManifests the outputImageManifests value to set
     * @return the RunFilter object itself.
     */
    public RunFilter withOutputImageManifests(String outputImageManifests) {
        this.outputImageManifests = outputImageManifests;
        return this;
    }

    /**
     * Get the value that indicates whether archiving is enabled or not.
     *
     * @return the isArchiveEnabled value
     */
    public Boolean isArchiveEnabled() {
        return this.isArchiveEnabled;
    }

    /**
     * Set the value that indicates whether archiving is enabled or not.
     *
     * @param isArchiveEnabled the isArchiveEnabled value to set
     * @return the RunFilter object itself.
     */
    public RunFilter withIsArchiveEnabled(Boolean isArchiveEnabled) {
        this.isArchiveEnabled = isArchiveEnabled;
        return this;
    }

    /**
     * Get the name of the task that the run corresponds to.
     *
     * @return the taskName value
     */
    public String taskName() {
        return this.taskName;
    }

    /**
     * Set the name of the task that the run corresponds to.
     *
     * @param taskName the taskName value to set
     * @return the RunFilter object itself.
     */
    public RunFilter withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

}
