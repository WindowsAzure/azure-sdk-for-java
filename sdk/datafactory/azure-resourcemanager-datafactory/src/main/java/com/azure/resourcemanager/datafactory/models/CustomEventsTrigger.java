// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Trigger that runs every time a custom event is received. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CustomEventsTrigger")
@JsonFlatten
@Fluent
public class CustomEventsTrigger extends MultiplePipelineTrigger {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomEventsTrigger.class);

    /*
     * The event subject must begin with the pattern provided for trigger to
     * fire. At least one of these must be provided: subjectBeginsWith,
     * subjectEndsWith.
     */
    @JsonProperty(value = "typeProperties.subjectBeginsWith")
    private String subjectBeginsWith;

    /*
     * The event subject must end with the pattern provided for trigger to
     * fire. At least one of these must be provided: subjectBeginsWith,
     * subjectEndsWith.
     */
    @JsonProperty(value = "typeProperties.subjectEndsWith")
    private String subjectEndsWith;

    /*
     * The list of event types that cause this trigger to fire.
     */
    @JsonProperty(value = "typeProperties.events", required = true)
    private List<Object> events;

    /*
     * The ARM resource ID of the Azure Event Grid Topic.
     */
    @JsonProperty(value = "typeProperties.scope", required = true)
    private String scope;

    /**
     * Get the subjectBeginsWith property: The event subject must begin with the pattern provided for trigger to fire.
     * At least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     *
     * @return the subjectBeginsWith value.
     */
    public String subjectBeginsWith() {
        return this.subjectBeginsWith;
    }

    /**
     * Set the subjectBeginsWith property: The event subject must begin with the pattern provided for trigger to fire.
     * At least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     *
     * @param subjectBeginsWith the subjectBeginsWith value to set.
     * @return the CustomEventsTrigger object itself.
     */
    public CustomEventsTrigger withSubjectBeginsWith(String subjectBeginsWith) {
        this.subjectBeginsWith = subjectBeginsWith;
        return this;
    }

    /**
     * Get the subjectEndsWith property: The event subject must end with the pattern provided for trigger to fire. At
     * least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     *
     * @return the subjectEndsWith value.
     */
    public String subjectEndsWith() {
        return this.subjectEndsWith;
    }

    /**
     * Set the subjectEndsWith property: The event subject must end with the pattern provided for trigger to fire. At
     * least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     *
     * @param subjectEndsWith the subjectEndsWith value to set.
     * @return the CustomEventsTrigger object itself.
     */
    public CustomEventsTrigger withSubjectEndsWith(String subjectEndsWith) {
        this.subjectEndsWith = subjectEndsWith;
        return this;
    }

    /**
     * Get the events property: The list of event types that cause this trigger to fire.
     *
     * @return the events value.
     */
    public List<Object> events() {
        return this.events;
    }

    /**
     * Set the events property: The list of event types that cause this trigger to fire.
     *
     * @param events the events value to set.
     * @return the CustomEventsTrigger object itself.
     */
    public CustomEventsTrigger withEvents(List<Object> events) {
        this.events = events;
        return this;
    }

    /**
     * Get the scope property: The ARM resource ID of the Azure Event Grid Topic.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The ARM resource ID of the Azure Event Grid Topic.
     *
     * @param scope the scope value to set.
     * @return the CustomEventsTrigger object itself.
     */
    public CustomEventsTrigger withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEventsTrigger withPipelines(List<TriggerPipelineReference> pipelines) {
        super.withPipelines(pipelines);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEventsTrigger withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEventsTrigger withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (events() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property events in model CustomEventsTrigger"));
        }
        if (scope() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property scope in model CustomEventsTrigger"));
        }
    }
}
