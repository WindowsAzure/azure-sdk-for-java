// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The workflow run trigger. */
@Fluent
public final class WorkflowRunTrigger {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkflowRunTrigger.class);

    /*
     * Gets the name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Gets the inputs.
     */
    @JsonProperty(value = "inputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object inputs;

    /*
     * Gets the link to inputs.
     */
    @JsonProperty(value = "inputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink inputsLink;

    /*
     * Gets the outputs.
     */
    @JsonProperty(value = "outputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object outputs;

    /*
     * Gets the link to outputs.
     */
    @JsonProperty(value = "outputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink outputsLink;

    /*
     * Gets the scheduled time.
     */
    @JsonProperty(value = "scheduledTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime scheduledTime;

    /*
     * Gets the start time.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * Gets the end time.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * Gets the tracking id.
     */
    @JsonProperty(value = "trackingId", access = JsonProperty.Access.WRITE_ONLY)
    private String trackingId;

    /*
     * The run correlation.
     */
    @JsonProperty(value = "correlation")
    private Correlation correlation;

    /*
     * Gets the code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * Gets the status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowStatus status;

    /*
     * Gets the error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private Object error;

    /*
     * Gets the tracked properties.
     */
    @JsonProperty(value = "trackedProperties", access = JsonProperty.Access.WRITE_ONLY)
    private Object trackedProperties;

    /**
     * Get the name property: Gets the name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the inputs property: Gets the inputs.
     *
     * @return the inputs value.
     */
    public Object inputs() {
        return this.inputs;
    }

    /**
     * Get the inputsLink property: Gets the link to inputs.
     *
     * @return the inputsLink value.
     */
    public ContentLink inputsLink() {
        return this.inputsLink;
    }

    /**
     * Get the outputs property: Gets the outputs.
     *
     * @return the outputs value.
     */
    public Object outputs() {
        return this.outputs;
    }

    /**
     * Get the outputsLink property: Gets the link to outputs.
     *
     * @return the outputsLink value.
     */
    public ContentLink outputsLink() {
        return this.outputsLink;
    }

    /**
     * Get the scheduledTime property: Gets the scheduled time.
     *
     * @return the scheduledTime value.
     */
    public OffsetDateTime scheduledTime() {
        return this.scheduledTime;
    }

    /**
     * Get the startTime property: Gets the start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: Gets the end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the trackingId property: Gets the tracking id.
     *
     * @return the trackingId value.
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Get the correlation property: The run correlation.
     *
     * @return the correlation value.
     */
    public Correlation correlation() {
        return this.correlation;
    }

    /**
     * Set the correlation property: The run correlation.
     *
     * @param correlation the correlation value to set.
     * @return the WorkflowRunTrigger object itself.
     */
    public WorkflowRunTrigger withCorrelation(Correlation correlation) {
        this.correlation = correlation;
        return this;
    }

    /**
     * Get the code property: Gets the code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the status property: Gets the status.
     *
     * @return the status value.
     */
    public WorkflowStatus status() {
        return this.status;
    }

    /**
     * Get the error property: Gets the error.
     *
     * @return the error value.
     */
    public Object error() {
        return this.error;
    }

    /**
     * Get the trackedProperties property: Gets the tracked properties.
     *
     * @return the trackedProperties value.
     */
    public Object trackedProperties() {
        return this.trackedProperties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inputsLink() != null) {
            inputsLink().validate();
        }
        if (outputsLink() != null) {
            outputsLink().validate();
        }
        if (correlation() != null) {
            correlation().validate();
        }
    }
}
