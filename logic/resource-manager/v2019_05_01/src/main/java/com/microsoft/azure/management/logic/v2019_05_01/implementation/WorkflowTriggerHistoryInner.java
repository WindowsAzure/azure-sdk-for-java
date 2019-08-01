/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowStatus;
import com.microsoft.azure.management.logic.v2019_05_01.Correlation;
import com.microsoft.azure.management.logic.v2019_05_01.ContentLink;
import com.microsoft.azure.management.logic.v2019_05_01.ResourceReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * The workflow trigger history.
 */
@JsonFlatten
public class WorkflowTriggerHistoryInner extends SubResource {
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
     * Gets the tracking id.
     */
    @JsonProperty(value = "properties.trackingId", access = JsonProperty.Access.WRITE_ONLY)
    private String trackingId;

    /**
     * The run correlation.
     */
    @JsonProperty(value = "properties.correlation")
    private Correlation correlation;

    /**
     * Gets the link to input parameters.
     */
    @JsonProperty(value = "properties.inputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink inputsLink;

    /**
     * Gets the link to output parameters.
     */
    @JsonProperty(value = "properties.outputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink outputsLink;

    /**
     * Gets a value indicating whether trigger was fired.
     */
    @JsonProperty(value = "properties.fired", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean fired;

    /**
     * Gets the reference to workflow run.
     */
    @JsonProperty(value = "properties.run", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceReference run;

    /**
     * Gets the workflow trigger history name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Gets the workflow trigger history type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get gets the start time.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get gets the end time.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get gets the status. Possible values include: 'NotSpecified', 'Paused', 'Running', 'Waiting', 'Succeeded', 'Skipped', 'Suspended', 'Cancelled', 'Failed', 'Faulted', 'TimedOut', 'Aborted', 'Ignored'.
     *
     * @return the status value
     */
    public WorkflowStatus status() {
        return this.status;
    }

    /**
     * Get gets the code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get gets the error.
     *
     * @return the error value
     */
    public Object error() {
        return this.error;
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
     * Get the run correlation.
     *
     * @return the correlation value
     */
    public Correlation correlation() {
        return this.correlation;
    }

    /**
     * Set the run correlation.
     *
     * @param correlation the correlation value to set
     * @return the WorkflowTriggerHistoryInner object itself.
     */
    public WorkflowTriggerHistoryInner withCorrelation(Correlation correlation) {
        this.correlation = correlation;
        return this;
    }

    /**
     * Get gets the link to input parameters.
     *
     * @return the inputsLink value
     */
    public ContentLink inputsLink() {
        return this.inputsLink;
    }

    /**
     * Get gets the link to output parameters.
     *
     * @return the outputsLink value
     */
    public ContentLink outputsLink() {
        return this.outputsLink;
    }

    /**
     * Get gets a value indicating whether trigger was fired.
     *
     * @return the fired value
     */
    public Boolean fired() {
        return this.fired;
    }

    /**
     * Get gets the reference to workflow run.
     *
     * @return the run value
     */
    public ResourceReference run() {
        return this.run;
    }

    /**
     * Get gets the workflow trigger history name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get gets the workflow trigger history type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
