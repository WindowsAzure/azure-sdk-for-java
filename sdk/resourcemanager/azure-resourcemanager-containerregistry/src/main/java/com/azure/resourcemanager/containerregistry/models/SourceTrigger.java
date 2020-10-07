// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of a source based trigger. */
@Fluent
public final class SourceTrigger {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SourceTrigger.class);

    /*
     * The properties that describes the source(code) for the task.
     */
    @JsonProperty(value = "sourceRepository", required = true)
    private SourceProperties sourceRepository;

    /*
     * The source event corresponding to the trigger.
     */
    @JsonProperty(value = "sourceTriggerEvents", required = true)
    private List<SourceTriggerEvent> sourceTriggerEvents;

    /*
     * The current status of trigger.
     */
    @JsonProperty(value = "status")
    private TriggerStatus status;

    /*
     * The name of the trigger.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the sourceRepository property: The properties that describes the source(code) for the task.
     *
     * @return the sourceRepository value.
     */
    public SourceProperties sourceRepository() {
        return this.sourceRepository;
    }

    /**
     * Set the sourceRepository property: The properties that describes the source(code) for the task.
     *
     * @param sourceRepository the sourceRepository value to set.
     * @return the SourceTrigger object itself.
     */
    public SourceTrigger withSourceRepository(SourceProperties sourceRepository) {
        this.sourceRepository = sourceRepository;
        return this;
    }

    /**
     * Get the sourceTriggerEvents property: The source event corresponding to the trigger.
     *
     * @return the sourceTriggerEvents value.
     */
    public List<SourceTriggerEvent> sourceTriggerEvents() {
        return this.sourceTriggerEvents;
    }

    /**
     * Set the sourceTriggerEvents property: The source event corresponding to the trigger.
     *
     * @param sourceTriggerEvents the sourceTriggerEvents value to set.
     * @return the SourceTrigger object itself.
     */
    public SourceTrigger withSourceTriggerEvents(List<SourceTriggerEvent> sourceTriggerEvents) {
        this.sourceTriggerEvents = sourceTriggerEvents;
        return this;
    }

    /**
     * Get the status property: The current status of trigger.
     *
     * @return the status value.
     */
    public TriggerStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of trigger.
     *
     * @param status the status value to set.
     * @return the SourceTrigger object itself.
     */
    public SourceTrigger withStatus(TriggerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the name property: The name of the trigger.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the trigger.
     *
     * @param name the name value to set.
     * @return the SourceTrigger object itself.
     */
    public SourceTrigger withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceRepository() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sourceRepository in model SourceTrigger"));
        } else {
            sourceRepository().validate();
        }
        if (sourceTriggerEvents() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceTriggerEvents in model SourceTrigger"));
        }
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model SourceTrigger"));
        }
    }
}
