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
 * Information about an Azure Batch subtask.
 */
public class SubtaskInformation {
    /**
     * The ID of the subtask.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /**
     * Information about the Compute Node on which the subtask ran.
     */
    @JsonProperty(value = "nodeInfo")
    private ComputeNodeInformation nodeInfo;

    /**
     * The time at which the subtask started running. If the subtask has been
     * restarted or retried, this is the most recent time at which the subtask
     * started running.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The time at which the subtask completed.
     * This property is set only if the subtask is in the Completed state.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * The exit code of the program specified on the subtask command line.
     * This property is set only if the subtask is in the completed state. In
     * general, the exit code for a process reflects the specific convention
     * implemented by the application developer for that process. If you use
     * the exit code value to make decisions in your code, be sure that you
     * know the exit code convention used by the application process. However,
     * if the Batch service terminates the subtask (due to timeout, or user
     * termination via the API) you may see an operating system-defined exit
     * code.
     */
    @JsonProperty(value = "exitCode")
    private Integer exitCode;

    /**
     * Information about the container under which the Task is executing.
     * This property is set only if the Task runs in a container context.
     */
    @JsonProperty(value = "containerInfo")
    private TaskContainerExecutionInformation containerInfo;

    /**
     * Information describing the Task failure, if any.
     * This property is set only if the Task is in the completed state and
     * encountered a failure.
     */
    @JsonProperty(value = "failureInfo")
    private TaskFailureInformation failureInfo;

    /**
     * The current state of the subtask.
     * Possible values include: 'preparing', 'running', 'completed'.
     */
    @JsonProperty(value = "state")
    private SubtaskState state;

    /**
     * The time at which the subtask entered its current state.
     */
    @JsonProperty(value = "stateTransitionTime")
    private DateTime stateTransitionTime;

    /**
     * The previous state of the subtask.
     * This property is not set if the subtask is in its initial running state.
     * Possible values include: 'preparing', 'running', 'completed'.
     */
    @JsonProperty(value = "previousState")
    private SubtaskState previousState;

    /**
     * The time at which the subtask entered its previous state.
     * This property is not set if the subtask is in its initial running state.
     */
    @JsonProperty(value = "previousStateTransitionTime")
    private DateTime previousStateTransitionTime;

    /**
     * The result of the Task execution.
     * If the value is 'failed', then the details of the failure can be found
     * in the failureInfo property. Possible values include: 'success',
     * 'failure'.
     */
    @JsonProperty(value = "result")
    private TaskExecutionResult result;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the SubtaskInformation object itself.
     */
    public SubtaskInformation withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the nodeInfo value.
     *
     * @return the nodeInfo value
     */
    public ComputeNodeInformation nodeInfo() {
        return this.nodeInfo;
    }

    /**
     * Set the nodeInfo value.
     *
     * @param nodeInfo the nodeInfo value to set
     * @return the SubtaskInformation object itself.
     */
    public SubtaskInformation withNodeInfo(ComputeNodeInformation nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the SubtaskInformation object itself.
     */
    public SubtaskInformation withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get this property is set only if the subtask is in the Completed state.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set this property is set only if the subtask is in the Completed state.
     *
     * @param endTime the endTime value to set
     * @return the SubtaskInformation object itself.
     */
    public SubtaskInformation withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get this property is set only if the subtask is in the completed state. In general, the exit code for a process reflects the specific convention implemented by the application developer for that process. If you use the exit code value to make decisions in your code, be sure that you know the exit code convention used by the application process. However, if the Batch service terminates the subtask (due to timeout, or user termination via the API) you may see an operating system-defined exit code.
     *
     * @return the exitCode value
     */
    public Integer exitCode() {
        return this.exitCode;
    }

    /**
     * Set this property is set only if the subtask is in the completed state. In general, the exit code for a process reflects the specific convention implemented by the application developer for that process. If you use the exit code value to make decisions in your code, be sure that you know the exit code convention used by the application process. However, if the Batch service terminates the subtask (due to timeout, or user termination via the API) you may see an operating system-defined exit code.
     *
     * @param exitCode the exitCode value to set
     * @return the SubtaskInformation object itself.
     */
    public SubtaskInformation withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Get this property is set only if the Task runs in a container context.
     *
     * @return the containerInfo value
     */
    public TaskContainerExecutionInformation containerInfo() {
        return this.containerInfo;
    }

    /**
     * Set this property is set only if the Task runs in a container context.
     *
     * @param containerInfo the containerInfo value to set
     * @return the SubtaskInformation object itself.
     */
    public SubtaskInformation withContainerInfo(TaskContainerExecutionInformation containerInfo) {
        this.containerInfo = containerInfo;
        return this;
    }

    /**
     * Get this property is set only if the Task is in the completed state and encountered a failure.
     *
     * @return the failureInfo value
     */
    public TaskFailureInformation failureInfo() {
        return this.failureInfo;
    }

    /**
     * Set this property is set only if the Task is in the completed state and encountered a failure.
     *
     * @param failureInfo the failureInfo value to set
     * @return the SubtaskInformation object itself.
     */
    public SubtaskInformation withFailureInfo(TaskFailureInformation failureInfo) {
        this.failureInfo = failureInfo;
        return this;
    }

    /**
     * Get possible values include: 'preparing', 'running', 'completed'.
     *
     * @return the state value
     */
    public SubtaskState state() {
        return this.state;
    }

    /**
     * Set possible values include: 'preparing', 'running', 'completed'.
     *
     * @param state the state value to set
     * @return the SubtaskInformation object itself.
     */
    public SubtaskInformation withState(SubtaskState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the stateTransitionTime value.
     *
     * @return the stateTransitionTime value
     */
    public DateTime stateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Set the stateTransitionTime value.
     *
     * @param stateTransitionTime the stateTransitionTime value to set
     * @return the SubtaskInformation object itself.
     */
    public SubtaskInformation withStateTransitionTime(DateTime stateTransitionTime) {
        this.stateTransitionTime = stateTransitionTime;
        return this;
    }

    /**
     * Get this property is not set if the subtask is in its initial running state. Possible values include: 'preparing', 'running', 'completed'.
     *
     * @return the previousState value
     */
    public SubtaskState previousState() {
        return this.previousState;
    }

    /**
     * Set this property is not set if the subtask is in its initial running state. Possible values include: 'preparing', 'running', 'completed'.
     *
     * @param previousState the previousState value to set
     * @return the SubtaskInformation object itself.
     */
    public SubtaskInformation withPreviousState(SubtaskState previousState) {
        this.previousState = previousState;
        return this;
    }

    /**
     * Get this property is not set if the subtask is in its initial running state.
     *
     * @return the previousStateTransitionTime value
     */
    public DateTime previousStateTransitionTime() {
        return this.previousStateTransitionTime;
    }

    /**
     * Set this property is not set if the subtask is in its initial running state.
     *
     * @param previousStateTransitionTime the previousStateTransitionTime value to set
     * @return the SubtaskInformation object itself.
     */
    public SubtaskInformation withPreviousStateTransitionTime(DateTime previousStateTransitionTime) {
        this.previousStateTransitionTime = previousStateTransitionTime;
        return this;
    }

    /**
     * Get if the value is 'failed', then the details of the failure can be found in the failureInfo property. Possible values include: 'success', 'failure'.
     *
     * @return the result value
     */
    public TaskExecutionResult result() {
        return this.result;
    }

    /**
     * Set if the value is 'failed', then the details of the failure can be found in the failureInfo property. Possible values include: 'success', 'failure'.
     *
     * @param result the result value to set
     * @return the SubtaskInformation object itself.
     */
    public SubtaskInformation withResult(TaskExecutionResult result) {
        this.result = result;
        return this;
    }

}
