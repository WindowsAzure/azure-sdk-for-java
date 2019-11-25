/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2016_06_01.RunActionCorrelation;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowStatus;
import com.microsoft.azure.management.logic.v2016_06_01.ContentLink;
import java.util.List;
import com.microsoft.azure.management.logic.v2016_06_01.RetryHistory;
import com.microsoft.azure.management.logic.v2016_06_01.RepetitionIndex;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The workflow run action repetition definition.
 */
@JsonFlatten
@SkipParentValidation
public class WorkflowRunActionRepetitionDefinitionInner extends Resource {
    /**
     * The start time of the workflow scope repetition.
     */
    @JsonProperty(value = "properties.startTime")
    private DateTime startTime;

    /**
     * The end time of the workflow scope repetition.
     */
    @JsonProperty(value = "properties.endTime")
    private DateTime endTime;

    /**
     * The correlation properties.
     */
    @JsonProperty(value = "properties.correlation")
    private RunActionCorrelation correlation;

    /**
     * The status of the workflow scope repetition. Possible values include:
     * 'NotSpecified', 'Paused', 'Running', 'Waiting', 'Succeeded', 'Skipped',
     * 'Suspended', 'Cancelled', 'Failed', 'Faulted', 'TimedOut', 'Aborted',
     * 'Ignored'.
     */
    @JsonProperty(value = "properties.status")
    private WorkflowStatus status;

    /**
     * The workflow scope repetition code.
     */
    @JsonProperty(value = "properties.code")
    private String code;

    /**
     * The error property.
     */
    @JsonProperty(value = "properties.error")
    private Object error;

    /**
     * Gets the tracking id.
     */
    @JsonProperty(value = "properties.trackingId", access = JsonProperty.Access.WRITE_ONLY)
    private String trackingId;

    /**
     * Gets the inputs.
     */
    @JsonProperty(value = "properties.inputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object inputs;

    /**
     * Gets the link to inputs.
     */
    @JsonProperty(value = "properties.inputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink inputsLink;

    /**
     * Gets the outputs.
     */
    @JsonProperty(value = "properties.outputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object outputs;

    /**
     * Gets the link to outputs.
     */
    @JsonProperty(value = "properties.outputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink outputsLink;

    /**
     * Gets the tracked properties.
     */
    @JsonProperty(value = "properties.trackedProperties", access = JsonProperty.Access.WRITE_ONLY)
    private Object trackedProperties;

    /**
     * Gets the retry histories.
     */
    @JsonProperty(value = "properties.retryHistory")
    private List<RetryHistory> retryHistory;

    /**
     * The iterationCount property.
     */
    @JsonProperty(value = "properties.iterationCount")
    private Integer iterationCount;

    /**
     * The repetition indexes.
     */
    @JsonProperty(value = "properties.repetitionIndexes")
    private List<RepetitionIndex> repetitionIndexes;

    /**
     * Get the start time of the workflow scope repetition.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the start time of the workflow scope repetition.
     *
     * @param startTime the startTime value to set
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the end time of the workflow scope repetition.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the end time of the workflow scope repetition.
     *
     * @param endTime the endTime value to set
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the correlation properties.
     *
     * @return the correlation value
     */
    public RunActionCorrelation correlation() {
        return this.correlation;
    }

    /**
     * Set the correlation properties.
     *
     * @param correlation the correlation value to set
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withCorrelation(RunActionCorrelation correlation) {
        this.correlation = correlation;
        return this;
    }

    /**
     * Get the status of the workflow scope repetition. Possible values include: 'NotSpecified', 'Paused', 'Running', 'Waiting', 'Succeeded', 'Skipped', 'Suspended', 'Cancelled', 'Failed', 'Faulted', 'TimedOut', 'Aborted', 'Ignored'.
     *
     * @return the status value
     */
    public WorkflowStatus status() {
        return this.status;
    }

    /**
     * Set the status of the workflow scope repetition. Possible values include: 'NotSpecified', 'Paused', 'Running', 'Waiting', 'Succeeded', 'Skipped', 'Suspended', 'Cancelled', 'Failed', 'Faulted', 'TimedOut', 'Aborted', 'Ignored'.
     *
     * @param status the status value to set
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withStatus(WorkflowStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the workflow scope repetition code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the workflow scope repetition code.
     *
     * @param code the code value to set
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public Object error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withError(Object error) {
        this.error = error;
        return this;
    }

    /**
     * Get gets the tracking id.
     *
     * @return the trackingId value
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Get gets the inputs.
     *
     * @return the inputs value
     */
    public Object inputs() {
        return this.inputs;
    }

    /**
     * Get gets the link to inputs.
     *
     * @return the inputsLink value
     */
    public ContentLink inputsLink() {
        return this.inputsLink;
    }

    /**
     * Get gets the outputs.
     *
     * @return the outputs value
     */
    public Object outputs() {
        return this.outputs;
    }

    /**
     * Get gets the link to outputs.
     *
     * @return the outputsLink value
     */
    public ContentLink outputsLink() {
        return this.outputsLink;
    }

    /**
     * Get gets the tracked properties.
     *
     * @return the trackedProperties value
     */
    public Object trackedProperties() {
        return this.trackedProperties;
    }

    /**
     * Get gets the retry histories.
     *
     * @return the retryHistory value
     */
    public List<RetryHistory> retryHistory() {
        return this.retryHistory;
    }

    /**
     * Set gets the retry histories.
     *
     * @param retryHistory the retryHistory value to set
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withRetryHistory(List<RetryHistory> retryHistory) {
        this.retryHistory = retryHistory;
        return this;
    }

    /**
     * Get the iterationCount value.
     *
     * @return the iterationCount value
     */
    public Integer iterationCount() {
        return this.iterationCount;
    }

    /**
     * Set the iterationCount value.
     *
     * @param iterationCount the iterationCount value to set
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withIterationCount(Integer iterationCount) {
        this.iterationCount = iterationCount;
        return this;
    }

    /**
     * Get the repetition indexes.
     *
     * @return the repetitionIndexes value
     */
    public List<RepetitionIndex> repetitionIndexes() {
        return this.repetitionIndexes;
    }

    /**
     * Set the repetition indexes.
     *
     * @param repetitionIndexes the repetitionIndexes value to set
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withRepetitionIndexes(List<RepetitionIndex> repetitionIndexes) {
        this.repetitionIndexes = repetitionIndexes;
        return this;
    }

}
