/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.hdinsight.job.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The object containing the job details.
 */
public class JobDetailRootJsonObject {
    /**
     * The callback URL, if any.
     */
    @JsonProperty(value = "callback")
    private Object callback;

    /**
     * The string representing completed status, for example 'done'.
     */
    @JsonProperty(value = "completed")
    private String completed;

    /**
     * The job's exit value.
     */
    @JsonProperty(value = "exitValue")
    private Integer exitValue;

    /**
     * The job ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The message returned.
     */
    @JsonProperty(value = "msg")
    private Object msg;

    /**
     * The parent job ID.
     */
    @JsonProperty(value = "parentId")
    private String parentId;

    /**
     * The job completion percentage, for example '75% complete'.
     */
    @JsonProperty(value = "percentComplete")
    private String percentComplete;

    /**
     * The object containing the job profile information.
     */
    @JsonProperty(value = "profile")
    private Profile profile;

    /**
     * The object containing the job status information.
     */
    @JsonProperty(value = "status")
    private Status status;

    /**
     * The user name of the job creator.
     */
    @JsonProperty(value = "user")
    private String user;

    /**
     * The arguments passed in by the user.
     */
    @JsonProperty(value = "userargs")
    private Userargs userargs;

    /**
     * Get the callback URL, if any.
     *
     * @return the callback value
     */
    public Object callback() {
        return this.callback;
    }

    /**
     * Set the callback URL, if any.
     *
     * @param callback the callback value to set
     * @return the JobDetailRootJsonObject object itself.
     */
    public JobDetailRootJsonObject withCallback(Object callback) {
        this.callback = callback;
        return this;
    }

    /**
     * Get the string representing completed status, for example 'done'.
     *
     * @return the completed value
     */
    public String completed() {
        return this.completed;
    }

    /**
     * Set the string representing completed status, for example 'done'.
     *
     * @param completed the completed value to set
     * @return the JobDetailRootJsonObject object itself.
     */
    public JobDetailRootJsonObject withCompleted(String completed) {
        this.completed = completed;
        return this;
    }

    /**
     * Get the job's exit value.
     *
     * @return the exitValue value
     */
    public Integer exitValue() {
        return this.exitValue;
    }

    /**
     * Set the job's exit value.
     *
     * @param exitValue the exitValue value to set
     * @return the JobDetailRootJsonObject object itself.
     */
    public JobDetailRootJsonObject withExitValue(Integer exitValue) {
        this.exitValue = exitValue;
        return this;
    }

    /**
     * Get the job ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the job ID.
     *
     * @param id the id value to set
     * @return the JobDetailRootJsonObject object itself.
     */
    public JobDetailRootJsonObject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the message returned.
     *
     * @return the msg value
     */
    public Object msg() {
        return this.msg;
    }

    /**
     * Set the message returned.
     *
     * @param msg the msg value to set
     * @return the JobDetailRootJsonObject object itself.
     */
    public JobDetailRootJsonObject withMsg(Object msg) {
        this.msg = msg;
        return this;
    }

    /**
     * Get the parent job ID.
     *
     * @return the parentId value
     */
    public String parentId() {
        return this.parentId;
    }

    /**
     * Set the parent job ID.
     *
     * @param parentId the parentId value to set
     * @return the JobDetailRootJsonObject object itself.
     */
    public JobDetailRootJsonObject withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Get the job completion percentage, for example '75% complete'.
     *
     * @return the percentComplete value
     */
    public String percentComplete() {
        return this.percentComplete;
    }

    /**
     * Set the job completion percentage, for example '75% complete'.
     *
     * @param percentComplete the percentComplete value to set
     * @return the JobDetailRootJsonObject object itself.
     */
    public JobDetailRootJsonObject withPercentComplete(String percentComplete) {
        this.percentComplete = percentComplete;
        return this;
    }

    /**
     * Get the object containing the job profile information.
     *
     * @return the profile value
     */
    public Profile profile() {
        return this.profile;
    }

    /**
     * Set the object containing the job profile information.
     *
     * @param profile the profile value to set
     * @return the JobDetailRootJsonObject object itself.
     */
    public JobDetailRootJsonObject withProfile(Profile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Get the object containing the job status information.
     *
     * @return the status value
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the object containing the job status information.
     *
     * @param status the status value to set
     * @return the JobDetailRootJsonObject object itself.
     */
    public JobDetailRootJsonObject withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the user name of the job creator.
     *
     * @return the user value
     */
    public String user() {
        return this.user;
    }

    /**
     * Set the user name of the job creator.
     *
     * @param user the user value to set
     * @return the JobDetailRootJsonObject object itself.
     */
    public JobDetailRootJsonObject withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get the arguments passed in by the user.
     *
     * @return the userargs value
     */
    public Userargs userargs() {
        return this.userargs;
    }

    /**
     * Set the arguments passed in by the user.
     *
     * @param userargs the userargs value to set
     * @return the JobDetailRootJsonObject object itself.
     */
    public JobDetailRootJsonObject withUserargs(Userargs userargs) {
        this.userargs = userargs;
        return this;
    }

}
