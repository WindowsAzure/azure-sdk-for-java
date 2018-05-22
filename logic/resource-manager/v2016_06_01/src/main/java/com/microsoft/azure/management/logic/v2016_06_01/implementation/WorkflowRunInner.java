/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowStatus;
import com.microsoft.azure.management.logic.v2016_06_01.Correlation;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowRunTrigger;
import java.util.Map;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowOutputParameter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * The workflow run.
 */
@JsonFlatten
public class WorkflowRunInner extends SubResource {
    /**
     * Gets the wait end time.
     */
    @JsonProperty(value = "properties.waitEndTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime waitEndTime;

    /**
     * Gets the start time.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * Gets the end time.
     */
    @JsonProperty(value = "properties.endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * Gets the status. Possible values include: 'NotSpecified', 'Paused',
     * 'Running', 'Waiting', 'Succeeded', 'Skipped', 'Suspended', 'Cancelled',
     * 'Failed', 'Faulted', 'TimedOut', 'Aborted', 'Ignored'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowStatus status;

    /**
     * Gets the code.
     */
    @JsonProperty(value = "properties.code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Gets the error.
     */
    @JsonProperty(value = "properties.error", access = JsonProperty.Access.WRITE_ONLY)
    private Object error;

    /**
     * Gets the correlation id.
     */
    @JsonProperty(value = "properties.correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /**
     * The run correlation.
     */
    @JsonProperty(value = "properties.correlation")
    private Correlation correlation;

    /**
     * Gets the reference to workflow version.
     */
    @JsonProperty(value = "properties.workflow", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceReferenceInner workflow;

    /**
     * Gets the fired trigger.
     */
    @JsonProperty(value = "properties.trigger", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowRunTrigger trigger;

    /**
     * Gets the outputs.
     */
    @JsonProperty(value = "properties.outputs", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, WorkflowOutputParameter> outputs;

    /**
     * Gets the response of the flow run.
     */
    @JsonProperty(value = "properties.response", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowRunTrigger response;

    /**
     * Gets the workflow run name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Gets the workflow run type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the waitEndTime value.
     *
     * @return the waitEndTime value
     */
    public DateTime waitEndTime() {
        return this.waitEndTime;
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
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public WorkflowStatus status() {
        return this.status;
    }

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
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
     * Get the correlationId value.
     *
     * @return the correlationId value
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Get the correlation value.
     *
     * @return the correlation value
     */
    public Correlation correlation() {
        return this.correlation;
    }

    /**
     * Set the correlation value.
     *
     * @param correlation the correlation value to set
     * @return the WorkflowRunInner object itself.
     */
    public WorkflowRunInner withCorrelation(Correlation correlation) {
        this.correlation = correlation;
        return this;
    }

    /**
     * Get the workflow value.
     *
     * @return the workflow value
     */
    public ResourceReferenceInner workflow() {
        return this.workflow;
    }

    /**
     * Get the trigger value.
     *
     * @return the trigger value
     */
    public WorkflowRunTrigger trigger() {
        return this.trigger;
    }

    /**
     * Get the outputs value.
     *
     * @return the outputs value
     */
    public Map<String, WorkflowOutputParameter> outputs() {
        return this.outputs;
    }

    /**
     * Get the response value.
     *
     * @return the response value
     */
    public WorkflowRunTrigger response() {
        return this.response;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
