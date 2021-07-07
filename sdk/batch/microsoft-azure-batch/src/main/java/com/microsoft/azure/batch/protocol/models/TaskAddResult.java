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
 * Result for a single Task added as part of an add Task collection operation.
 */
public class TaskAddResult {
    /**
     * The status of the add Task request. Possible values include: 'success',
     * 'clientError', 'serverError'.
     */
    @JsonProperty(value = "status", required = true)
    private TaskAddStatus status;

    /**
     * The ID of the Task for which this is the result.
     */
    @JsonProperty(value = "taskId", required = true)
    private String taskId;

    /**
     * The ETag of the Task, if the Task was successfully added. You can use
     * this to detect whether the Task has changed between requests. In
     * particular, you can be pass the ETag with an Update Task request to
     * specify that your changes should take effect only if nobody else has
     * modified the Job in the meantime.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * The last modified time of the Task.
     */
    @JsonProperty(value = "lastModified")
    private DateTime lastModified;

    /**
     * The URL of the Task, if the Task was successfully added.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The error encountered while attempting to add the Task.
     */
    @JsonProperty(value = "error")
    private BatchError error;

    /**
     * Get the status of the add Task request. Possible values include: 'success', 'clientError', 'serverError'.
     *
     * @return the status value
     */
    public TaskAddStatus status() {
        return this.status;
    }

    /**
     * Set the status of the add Task request. Possible values include: 'success', 'clientError', 'serverError'.
     *
     * @param status the status value to set
     * @return the TaskAddResult object itself.
     */
    public TaskAddResult withStatus(TaskAddStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the ID of the Task for which this is the result.
     *
     * @return the taskId value
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Set the ID of the Task for which this is the result.
     *
     * @param taskId the taskId value to set
     * @return the TaskAddResult object itself.
     */
    public TaskAddResult withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the ETag of the Task, if the Task was successfully added. You can use this to detect whether the Task has changed between requests. In particular, you can be pass the ETag with an Update Task request to specify that your changes should take effect only if nobody else has modified the Job in the meantime.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the ETag of the Task, if the Task was successfully added. You can use this to detect whether the Task has changed between requests. In particular, you can be pass the ETag with an Update Task request to specify that your changes should take effect only if nobody else has modified the Job in the meantime.
     *
     * @param eTag the eTag value to set
     * @return the TaskAddResult object itself.
     */
    public TaskAddResult withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the last modified time of the Task.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Set the last modified time of the Task.
     *
     * @param lastModified the lastModified value to set
     * @return the TaskAddResult object itself.
     */
    public TaskAddResult withLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the URL of the Task, if the Task was successfully added.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the URL of the Task, if the Task was successfully added.
     *
     * @param location the location value to set
     * @return the TaskAddResult object itself.
     */
    public TaskAddResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the error encountered while attempting to add the Task.
     *
     * @return the error value
     */
    public BatchError error() {
        return this.error;
    }

    /**
     * Set the error encountered while attempting to add the Task.
     *
     * @param error the error value to set
     * @return the TaskAddResult object itself.
     */
    public TaskAddResult withError(BatchError error) {
        this.error = error;
        return this;
    }

}
