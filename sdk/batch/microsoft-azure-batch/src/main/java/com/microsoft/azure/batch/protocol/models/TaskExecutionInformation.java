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
 * Information about the execution of a Task.
 */
public class TaskExecutionInformation {
    /**
     * The time at which the Task started running. 'Running' corresponds to the
     * running state, so if the Task specifies resource files or Packages, then
     * the start time reflects the time at which the Task started downloading
     * or deploying these. If the Task has been restarted or retried, this is
     * the most recent time at which the Task started running. This property is
     * present only for Tasks that are in the running or completed state.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The time at which the Task completed. This property is set only if the
     * Task is in the Completed state.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * The exit code of the program specified on the Task command line. This
     * property is set only if the Task is in the completed state. In general,
     * the exit code for a process reflects the specific convention implemented
     * by the application developer for that process. If you use the exit code
     * value to make decisions in your code, be sure that you know the exit
     * code convention used by the application process. However, if the Batch
     * service terminates the Task (due to timeout, or user termination via the
     * API) you may see an operating system-defined exit code.
     */
    @JsonProperty(value = "exitCode")
    private Integer exitCode;

    /**
     * Information about the container under which the Task is executing. This
     * property is set only if the Task runs in a container context.
     */
    @JsonProperty(value = "containerInfo")
    private TaskContainerExecutionInformation containerInfo;

    /**
     * Information describing the Task failure, if any. This property is set
     * only if the Task is in the completed state and encountered a failure.
     */
    @JsonProperty(value = "failureInfo")
    private TaskFailureInformation failureInfo;

    /**
     * The number of times the Task has been retried by the Batch service. Task
     * application failures (non-zero exit code) are retried, pre-processing
     * errors (the Task could not be run) and file upload errors are not
     * retried. The Batch service will retry the Task up to the limit specified
     * by the constraints.
     */
    @JsonProperty(value = "retryCount", required = true)
    private int retryCount;

    /**
     * The most recent time at which a retry of the Task started running. This
     * element is present only if the Task was retried (i.e. retryCount is
     * nonzero). If present, this is typically the same as startTime, but may
     * be different if the Task has been restarted for reasons other than
     * retry; for example, if the Compute Node was rebooted during a retry,
     * then the startTime is updated but the lastRetryTime is not.
     */
    @JsonProperty(value = "lastRetryTime")
    private DateTime lastRetryTime;

    /**
     * The number of times the Task has been requeued by the Batch service as
     * the result of a user request. When the user removes Compute Nodes from a
     * Pool (by resizing/shrinking the pool) or when the Job is being disabled,
     * the user can specify that running Tasks on the Compute Nodes be requeued
     * for execution. This count tracks how many times the Task has been
     * requeued for these reasons.
     */
    @JsonProperty(value = "requeueCount", required = true)
    private int requeueCount;

    /**
     * The most recent time at which the Task has been requeued by the Batch
     * service as the result of a user request. This property is set only if
     * the requeueCount is nonzero.
     */
    @JsonProperty(value = "lastRequeueTime")
    private DateTime lastRequeueTime;

    /**
     * The result of the Task execution. If the value is 'failed', then the
     * details of the failure can be found in the failureInfo property.
     * Possible values include: 'success', 'failure'.
     */
    @JsonProperty(value = "result")
    private TaskExecutionResult result;

    /**
     * Get the time at which the Task started running. 'Running' corresponds to the running state, so if the Task specifies resource files or Packages, then the start time reflects the time at which the Task started downloading or deploying these. If the Task has been restarted or retried, this is the most recent time at which the Task started running. This property is present only for Tasks that are in the running or completed state.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the time at which the Task started running. 'Running' corresponds to the running state, so if the Task specifies resource files or Packages, then the start time reflects the time at which the Task started downloading or deploying these. If the Task has been restarted or retried, this is the most recent time at which the Task started running. This property is present only for Tasks that are in the running or completed state.
     *
     * @param startTime the startTime value to set
     * @return the TaskExecutionInformation object itself.
     */
    public TaskExecutionInformation withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the time at which the Task completed. This property is set only if the Task is in the Completed state.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the time at which the Task completed. This property is set only if the Task is in the Completed state.
     *
     * @param endTime the endTime value to set
     * @return the TaskExecutionInformation object itself.
     */
    public TaskExecutionInformation withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the exit code of the program specified on the Task command line. This property is set only if the Task is in the completed state. In general, the exit code for a process reflects the specific convention implemented by the application developer for that process. If you use the exit code value to make decisions in your code, be sure that you know the exit code convention used by the application process. However, if the Batch service terminates the Task (due to timeout, or user termination via the API) you may see an operating system-defined exit code.
     *
     * @return the exitCode value
     */
    public Integer exitCode() {
        return this.exitCode;
    }

    /**
     * Set the exit code of the program specified on the Task command line. This property is set only if the Task is in the completed state. In general, the exit code for a process reflects the specific convention implemented by the application developer for that process. If you use the exit code value to make decisions in your code, be sure that you know the exit code convention used by the application process. However, if the Batch service terminates the Task (due to timeout, or user termination via the API) you may see an operating system-defined exit code.
     *
     * @param exitCode the exitCode value to set
     * @return the TaskExecutionInformation object itself.
     */
    public TaskExecutionInformation withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Get information about the container under which the Task is executing. This property is set only if the Task runs in a container context.
     *
     * @return the containerInfo value
     */
    public TaskContainerExecutionInformation containerInfo() {
        return this.containerInfo;
    }

    /**
     * Set information about the container under which the Task is executing. This property is set only if the Task runs in a container context.
     *
     * @param containerInfo the containerInfo value to set
     * @return the TaskExecutionInformation object itself.
     */
    public TaskExecutionInformation withContainerInfo(TaskContainerExecutionInformation containerInfo) {
        this.containerInfo = containerInfo;
        return this;
    }

    /**
     * Get information describing the Task failure, if any. This property is set only if the Task is in the completed state and encountered a failure.
     *
     * @return the failureInfo value
     */
    public TaskFailureInformation failureInfo() {
        return this.failureInfo;
    }

    /**
     * Set information describing the Task failure, if any. This property is set only if the Task is in the completed state and encountered a failure.
     *
     * @param failureInfo the failureInfo value to set
     * @return the TaskExecutionInformation object itself.
     */
    public TaskExecutionInformation withFailureInfo(TaskFailureInformation failureInfo) {
        this.failureInfo = failureInfo;
        return this;
    }

    /**
     * Get the number of times the Task has been retried by the Batch service. Task application failures (non-zero exit code) are retried, pre-processing errors (the Task could not be run) and file upload errors are not retried. The Batch service will retry the Task up to the limit specified by the constraints.
     *
     * @return the retryCount value
     */
    public int retryCount() {
        return this.retryCount;
    }

    /**
     * Set the number of times the Task has been retried by the Batch service. Task application failures (non-zero exit code) are retried, pre-processing errors (the Task could not be run) and file upload errors are not retried. The Batch service will retry the Task up to the limit specified by the constraints.
     *
     * @param retryCount the retryCount value to set
     * @return the TaskExecutionInformation object itself.
     */
    public TaskExecutionInformation withRetryCount(int retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * Get the most recent time at which a retry of the Task started running. This element is present only if the Task was retried (i.e. retryCount is nonzero). If present, this is typically the same as startTime, but may be different if the Task has been restarted for reasons other than retry; for example, if the Compute Node was rebooted during a retry, then the startTime is updated but the lastRetryTime is not.
     *
     * @return the lastRetryTime value
     */
    public DateTime lastRetryTime() {
        return this.lastRetryTime;
    }

    /**
     * Set the most recent time at which a retry of the Task started running. This element is present only if the Task was retried (i.e. retryCount is nonzero). If present, this is typically the same as startTime, but may be different if the Task has been restarted for reasons other than retry; for example, if the Compute Node was rebooted during a retry, then the startTime is updated but the lastRetryTime is not.
     *
     * @param lastRetryTime the lastRetryTime value to set
     * @return the TaskExecutionInformation object itself.
     */
    public TaskExecutionInformation withLastRetryTime(DateTime lastRetryTime) {
        this.lastRetryTime = lastRetryTime;
        return this;
    }

    /**
     * Get the number of times the Task has been requeued by the Batch service as the result of a user request. When the user removes Compute Nodes from a Pool (by resizing/shrinking the pool) or when the Job is being disabled, the user can specify that running Tasks on the Compute Nodes be requeued for execution. This count tracks how many times the Task has been requeued for these reasons.
     *
     * @return the requeueCount value
     */
    public int requeueCount() {
        return this.requeueCount;
    }

    /**
     * Set the number of times the Task has been requeued by the Batch service as the result of a user request. When the user removes Compute Nodes from a Pool (by resizing/shrinking the pool) or when the Job is being disabled, the user can specify that running Tasks on the Compute Nodes be requeued for execution. This count tracks how many times the Task has been requeued for these reasons.
     *
     * @param requeueCount the requeueCount value to set
     * @return the TaskExecutionInformation object itself.
     */
    public TaskExecutionInformation withRequeueCount(int requeueCount) {
        this.requeueCount = requeueCount;
        return this;
    }

    /**
     * Get the most recent time at which the Task has been requeued by the Batch service as the result of a user request. This property is set only if the requeueCount is nonzero.
     *
     * @return the lastRequeueTime value
     */
    public DateTime lastRequeueTime() {
        return this.lastRequeueTime;
    }

    /**
     * Set the most recent time at which the Task has been requeued by the Batch service as the result of a user request. This property is set only if the requeueCount is nonzero.
     *
     * @param lastRequeueTime the lastRequeueTime value to set
     * @return the TaskExecutionInformation object itself.
     */
    public TaskExecutionInformation withLastRequeueTime(DateTime lastRequeueTime) {
        this.lastRequeueTime = lastRequeueTime;
        return this;
    }

    /**
     * Get the result of the Task execution. If the value is 'failed', then the details of the failure can be found in the failureInfo property. Possible values include: 'success', 'failure'.
     *
     * @return the result value
     */
    public TaskExecutionResult result() {
        return this.result;
    }

    /**
     * Set the result of the Task execution. If the value is 'failed', then the details of the failure can be found in the failureInfo property. Possible values include: 'success', 'failure'.
     *
     * @param result the result value to set
     * @return the TaskExecutionInformation object itself.
     */
    public TaskExecutionInformation withResult(TaskExecutionResult result) {
        this.result = result;
        return this;
    }

}
