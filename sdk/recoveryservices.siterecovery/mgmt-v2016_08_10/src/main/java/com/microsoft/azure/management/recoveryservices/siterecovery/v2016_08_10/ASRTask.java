/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Task of the Job.
 */
public class ASRTask {
    /**
     * The Id.
     */
    @JsonProperty(value = "taskId")
    private String taskId;

    /**
     * The unique Task name.
     */
    @JsonProperty(value = "name")
    private String name;

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
     * The state/actions applicable on this task.
     */
    @JsonProperty(value = "allowedActions")
    private List<String> allowedActions;

    /**
     * The name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * The State. It is one of these values - NotStarted, InProgress,
     * Succeeded, Failed, Cancelled, Suspended or Other.
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * The description of the task state. For example - For Succeeded state,
     * description can be Completed, PartiallySucceeded,
     * CompletedWithInformation or Skipped.
     */
    @JsonProperty(value = "stateDescription")
    private String stateDescription;

    /**
     * The type of task. Details in CustomDetails property depend on this type.
     */
    @JsonProperty(value = "taskType")
    private String taskType;

    /**
     * The custom task details based on the task type.
     */
    @JsonProperty(value = "customDetails")
    private TaskTypeDetails customDetails;

    /**
     * The custom task details based on the task type, if the task type is
     * GroupTaskDetails or one of the types derived from it.
     */
    @JsonProperty(value = "groupTaskCustomDetails")
    private GroupTaskDetails groupTaskCustomDetails;

    /**
     * The task error details.
     */
    @JsonProperty(value = "errors")
    private List<JobErrorDetails> errors;

    /**
     * Get the Id.
     *
     * @return the taskId value
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Set the Id.
     *
     * @param taskId the taskId value to set
     * @return the ASRTask object itself.
     */
    public ASRTask withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the unique Task name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the unique Task name.
     *
     * @param name the name value to set
     * @return the ASRTask object itself.
     */
    public ASRTask withName(String name) {
        this.name = name;
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
     * @return the ASRTask object itself.
     */
    public ASRTask withStartTime(DateTime startTime) {
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
     * @return the ASRTask object itself.
     */
    public ASRTask withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the state/actions applicable on this task.
     *
     * @return the allowedActions value
     */
    public List<String> allowedActions() {
        return this.allowedActions;
    }

    /**
     * Set the state/actions applicable on this task.
     *
     * @param allowedActions the allowedActions value to set
     * @return the ASRTask object itself.
     */
    public ASRTask withAllowedActions(List<String> allowedActions) {
        this.allowedActions = allowedActions;
        return this;
    }

    /**
     * Get the name.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the name.
     *
     * @param friendlyName the friendlyName value to set
     * @return the ASRTask object itself.
     */
    public ASRTask withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the State. It is one of these values - NotStarted, InProgress, Succeeded, Failed, Cancelled, Suspended or Other.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the State. It is one of these values - NotStarted, InProgress, Succeeded, Failed, Cancelled, Suspended or Other.
     *
     * @param state the state value to set
     * @return the ASRTask object itself.
     */
    public ASRTask withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the description of the task state. For example - For Succeeded state, description can be Completed, PartiallySucceeded, CompletedWithInformation or Skipped.
     *
     * @return the stateDescription value
     */
    public String stateDescription() {
        return this.stateDescription;
    }

    /**
     * Set the description of the task state. For example - For Succeeded state, description can be Completed, PartiallySucceeded, CompletedWithInformation or Skipped.
     *
     * @param stateDescription the stateDescription value to set
     * @return the ASRTask object itself.
     */
    public ASRTask withStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
        return this;
    }

    /**
     * Get the type of task. Details in CustomDetails property depend on this type.
     *
     * @return the taskType value
     */
    public String taskType() {
        return this.taskType;
    }

    /**
     * Set the type of task. Details in CustomDetails property depend on this type.
     *
     * @param taskType the taskType value to set
     * @return the ASRTask object itself.
     */
    public ASRTask withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * Get the custom task details based on the task type.
     *
     * @return the customDetails value
     */
    public TaskTypeDetails customDetails() {
        return this.customDetails;
    }

    /**
     * Set the custom task details based on the task type.
     *
     * @param customDetails the customDetails value to set
     * @return the ASRTask object itself.
     */
    public ASRTask withCustomDetails(TaskTypeDetails customDetails) {
        this.customDetails = customDetails;
        return this;
    }

    /**
     * Get the custom task details based on the task type, if the task type is GroupTaskDetails or one of the types derived from it.
     *
     * @return the groupTaskCustomDetails value
     */
    public GroupTaskDetails groupTaskCustomDetails() {
        return this.groupTaskCustomDetails;
    }

    /**
     * Set the custom task details based on the task type, if the task type is GroupTaskDetails or one of the types derived from it.
     *
     * @param groupTaskCustomDetails the groupTaskCustomDetails value to set
     * @return the ASRTask object itself.
     */
    public ASRTask withGroupTaskCustomDetails(GroupTaskDetails groupTaskCustomDetails) {
        this.groupTaskCustomDetails = groupTaskCustomDetails;
        return this;
    }

    /**
     * Get the task error details.
     *
     * @return the errors value
     */
    public List<JobErrorDetails> errors() {
        return this.errors;
    }

    /**
     * Set the task error details.
     *
     * @param errors the errors value to set
     * @return the ASRTask object itself.
     */
    public ASRTask withErrors(List<JobErrorDetails> errors) {
        this.errors = errors;
        return this;
    }

}
