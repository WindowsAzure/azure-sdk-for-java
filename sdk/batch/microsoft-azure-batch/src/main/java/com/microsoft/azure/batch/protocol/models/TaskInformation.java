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
 * Information about a Task running on a Compute Node.
 */
public class TaskInformation {
    /**
     * The URL of the Task.
     */
    @JsonProperty(value = "taskUrl")
    private String taskUrl;

    /**
     * The ID of the Job to which the Task belongs.
     */
    @JsonProperty(value = "jobId")
    private String jobId;

    /**
     * The ID of the Task.
     */
    @JsonProperty(value = "taskId")
    private String taskId;

    /**
     * The ID of the subtask if the Task is a multi-instance Task.
     */
    @JsonProperty(value = "subtaskId")
    private Integer subtaskId;

    /**
     * The current state of the Task. Possible values include: 'active',
     * 'preparing', 'running', 'completed'.
     */
    @JsonProperty(value = "taskState", required = true)
    private TaskState taskState;

    /**
     * Information about the execution of the Task.
     */
    @JsonProperty(value = "executionInfo")
    private TaskExecutionInformation executionInfo;

    /**
     * Get the URL of the Task.
     *
     * @return the taskUrl value
     */
    public String taskUrl() {
        return this.taskUrl;
    }

    /**
     * Set the URL of the Task.
     *
     * @param taskUrl the taskUrl value to set
     * @return the TaskInformation object itself.
     */
    public TaskInformation withTaskUrl(String taskUrl) {
        this.taskUrl = taskUrl;
        return this;
    }

    /**
     * Get the ID of the Job to which the Task belongs.
     *
     * @return the jobId value
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Set the ID of the Job to which the Task belongs.
     *
     * @param jobId the jobId value to set
     * @return the TaskInformation object itself.
     */
    public TaskInformation withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the ID of the Task.
     *
     * @return the taskId value
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Set the ID of the Task.
     *
     * @param taskId the taskId value to set
     * @return the TaskInformation object itself.
     */
    public TaskInformation withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the ID of the subtask if the Task is a multi-instance Task.
     *
     * @return the subtaskId value
     */
    public Integer subtaskId() {
        return this.subtaskId;
    }

    /**
     * Set the ID of the subtask if the Task is a multi-instance Task.
     *
     * @param subtaskId the subtaskId value to set
     * @return the TaskInformation object itself.
     */
    public TaskInformation withSubtaskId(Integer subtaskId) {
        this.subtaskId = subtaskId;
        return this;
    }

    /**
     * Get the current state of the Task. Possible values include: 'active', 'preparing', 'running', 'completed'.
     *
     * @return the taskState value
     */
    public TaskState taskState() {
        return this.taskState;
    }

    /**
     * Set the current state of the Task. Possible values include: 'active', 'preparing', 'running', 'completed'.
     *
     * @param taskState the taskState value to set
     * @return the TaskInformation object itself.
     */
    public TaskInformation withTaskState(TaskState taskState) {
        this.taskState = taskState;
        return this;
    }

    /**
     * Get information about the execution of the Task.
     *
     * @return the executionInfo value
     */
    public TaskExecutionInformation executionInfo() {
        return this.executionInfo;
    }

    /**
     * Set information about the execution of the Task.
     *
     * @param executionInfo the executionInfo value to set
     * @return the TaskInformation object itself.
     */
    public TaskInformation withExecutionInfo(TaskExecutionInformation executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }

}
