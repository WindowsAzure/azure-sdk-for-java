/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Azure Batch job to add.
 */
public class JobAddParameter {
    /**
     * A string that uniquely identifies the job within the account.
     * The ID can contain any combination of alphanumeric characters including
     * hyphens and underscores, and cannot contain more than 64 characters. It
     * is common to use a GUID for the id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The display name for the job.
     * The display name need not be unique and can contain any Unicode
     * characters up to a maximum length of 1024.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The priority of the job.
     * Priority values can range from -1000 to 1000, with -1000 being the
     * lowest priority and 1000 being the highest priority. The default value
     * is 0.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * The execution constraints for the job.
     */
    @JsonProperty(value = "constraints")
    private JobConstraints constraints;

    /**
     * Details of a Job Manager task to be launched when the job is started.
     * If the job does not specify a Job Manager task, the user must explicitly
     * add tasks to the job. If the job does specify a Job Manager task, the
     * Batch service creates the Job Manager task when the job is created, and
     * will try to schedule the Job Manager task before scheduling other tasks
     * in the job. The Job Manager task's typical purpose is to control and/or
     * monitor job execution, for example by deciding what additional tasks to
     * run, determining when the work is complete, etc. (However, a Job Manager
     * task is not restricted to these activities – it is a fully-fledged task
     * in the system and perform whatever actions are required for the job.)
     * For example, a Job Manager task might download a file specified as a
     * parameter, analyze the contents of that file and submit additional tasks
     * based on those contents.
     */
    @JsonProperty(value = "jobManagerTask")
    private JobManagerTask jobManagerTask;

    /**
     * The Job Preparation task.
     * If a job has a Job Preparation task, the Batch service will run the Job
     * Preparation task on a compute node before starting any tasks of that job
     * on that compute node.
     */
    @JsonProperty(value = "jobPreparationTask")
    private JobPreparationTask jobPreparationTask;

    /**
     * The Job Release task.
     * A Job Release task cannot be specified without also specifying a Job
     * Preparation task for the job. The Batch service runs the Job Release
     * task on the compute nodes that have run the Job Preparation task. The
     * primary purpose of the Job Release task is to undo changes to compute
     * nodes made by the Job Preparation task. Example activities include
     * deleting local files, or shutting down services that were started as
     * part of job preparation.
     */
    @JsonProperty(value = "jobReleaseTask")
    private JobReleaseTask jobReleaseTask;

    /**
     * The list of common environment variable settings. These environment
     * variables are set for all tasks in the job (including the Job Manager,
     * Job Preparation and Job Release tasks).
     */
    @JsonProperty(value = "commonEnvironmentSettings")
    private List<EnvironmentSetting> commonEnvironmentSettings;

    /**
     * The pool on which the Batch service runs the job's tasks.
     */
    @JsonProperty(value = "poolInfo", required = true)
    private PoolInformation poolInfo;

    /**
     * The action the Batch service should take when all tasks in the job are
     * in the completed state.
     * Note that if a job contains no tasks, then all tasks are considered
     * complete. This option is therefore most commonly used with a job manager
     * task; if you want to use automatic job termination without a job
     * manager, you should initially set onAllTasksComplete to noaction and
     * update the job properties to set onAllTasksComplete to terminatejob once
     * you have finished adding tasks. Permitted values are: noaction – do
     * nothing. The job remains active unless terminated or disabled by some
     * other means. terminatejob – terminate the job. The job’s terminateReason
     * is set to 'AllTasksComplete'. The default is noaction. Possible values
     * include: 'noAction', 'terminateJob'.
     */
    @JsonProperty(value = "onAllTasksComplete")
    private OnAllTasksComplete onAllTasksComplete;

    /**
     * The action the Batch service should take when any task in the job fails.
     * A task is considered to have failed if it completes with a non-zero exit
     * code and has exhausted its retry count, or if it had a scheduling error.
     * Permitted values are: noaction – do nothing. performexitoptionsjobaction
     * – take the action associated with the task exit condition in the task's
     * exitConditions collection. (This may still result in no action being
     * taken, if that is what the task specifies.) The default is noaction.
     * Possible values include: 'noAction', 'performExitOptionsJobAction'.
     */
    @JsonProperty(value = "onTaskFailure")
    private OnTaskFailure onTaskFailure;

    /**
     * A list of name-value pairs associated with the job as metadata.
     * The Batch service does not assign any meaning to metadata; it is solely
     * for the use of user code.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * The flag that determines if this job will use tasks with dependencies.
     */
    @JsonProperty(value = "usesTaskDependencies")
    private Boolean usesTaskDependencies;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the constraints value.
     *
     * @return the constraints value
     */
    public JobConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set the constraints value.
     *
     * @param constraints the constraints value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withConstraints(JobConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get the jobManagerTask value.
     *
     * @return the jobManagerTask value
     */
    public JobManagerTask jobManagerTask() {
        return this.jobManagerTask;
    }

    /**
     * Set the jobManagerTask value.
     *
     * @param jobManagerTask the jobManagerTask value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withJobManagerTask(JobManagerTask jobManagerTask) {
        this.jobManagerTask = jobManagerTask;
        return this;
    }

    /**
     * Get the jobPreparationTask value.
     *
     * @return the jobPreparationTask value
     */
    public JobPreparationTask jobPreparationTask() {
        return this.jobPreparationTask;
    }

    /**
     * Set the jobPreparationTask value.
     *
     * @param jobPreparationTask the jobPreparationTask value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withJobPreparationTask(JobPreparationTask jobPreparationTask) {
        this.jobPreparationTask = jobPreparationTask;
        return this;
    }

    /**
     * Get the jobReleaseTask value.
     *
     * @return the jobReleaseTask value
     */
    public JobReleaseTask jobReleaseTask() {
        return this.jobReleaseTask;
    }

    /**
     * Set the jobReleaseTask value.
     *
     * @param jobReleaseTask the jobReleaseTask value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withJobReleaseTask(JobReleaseTask jobReleaseTask) {
        this.jobReleaseTask = jobReleaseTask;
        return this;
    }

    /**
     * Get the commonEnvironmentSettings value.
     *
     * @return the commonEnvironmentSettings value
     */
    public List<EnvironmentSetting> commonEnvironmentSettings() {
        return this.commonEnvironmentSettings;
    }

    /**
     * Set the commonEnvironmentSettings value.
     *
     * @param commonEnvironmentSettings the commonEnvironmentSettings value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withCommonEnvironmentSettings(List<EnvironmentSetting> commonEnvironmentSettings) {
        this.commonEnvironmentSettings = commonEnvironmentSettings;
        return this;
    }

    /**
     * Get the poolInfo value.
     *
     * @return the poolInfo value
     */
    public PoolInformation poolInfo() {
        return this.poolInfo;
    }

    /**
     * Set the poolInfo value.
     *
     * @param poolInfo the poolInfo value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withPoolInfo(PoolInformation poolInfo) {
        this.poolInfo = poolInfo;
        return this;
    }

    /**
     * Get the onAllTasksComplete value.
     *
     * @return the onAllTasksComplete value
     */
    public OnAllTasksComplete onAllTasksComplete() {
        return this.onAllTasksComplete;
    }

    /**
     * Set the onAllTasksComplete value.
     *
     * @param onAllTasksComplete the onAllTasksComplete value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withOnAllTasksComplete(OnAllTasksComplete onAllTasksComplete) {
        this.onAllTasksComplete = onAllTasksComplete;
        return this;
    }

    /**
     * Get the onTaskFailure value.
     *
     * @return the onTaskFailure value
     */
    public OnTaskFailure onTaskFailure() {
        return this.onTaskFailure;
    }

    /**
     * Set the onTaskFailure value.
     *
     * @param onTaskFailure the onTaskFailure value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withOnTaskFailure(OnTaskFailure onTaskFailure) {
        this.onTaskFailure = onTaskFailure;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the usesTaskDependencies value.
     *
     * @return the usesTaskDependencies value
     */
    public Boolean usesTaskDependencies() {
        return this.usesTaskDependencies;
    }

    /**
     * Set the usesTaskDependencies value.
     *
     * @param usesTaskDependencies the usesTaskDependencies value to set
     * @return the JobAddParameter object itself.
     */
    public JobAddParameter withUsesTaskDependencies(Boolean usesTaskDependencies) {
        this.usesTaskDependencies = usesTaskDependencies;
        return this;
    }

}
