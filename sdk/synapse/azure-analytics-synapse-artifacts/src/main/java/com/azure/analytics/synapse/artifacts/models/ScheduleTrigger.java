// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Trigger that creates pipeline runs periodically, on schedule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ScheduleTrigger")
@JsonFlatten
@Fluent
public class ScheduleTrigger extends MultiplePipelineTrigger {
    /*
     * Recurrence schedule configuration.
     */
    @JsonProperty(value = "typeProperties.recurrence", required = true)
    private ScheduleTriggerRecurrence recurrence;

    /**
     * Get the recurrence property: Recurrence schedule configuration.
     *
     * @return the recurrence value.
     */
    public ScheduleTriggerRecurrence getRecurrence() {
        return this.recurrence;
    }

    /**
     * Set the recurrence property: Recurrence schedule configuration.
     *
     * @param recurrence the recurrence value to set.
     * @return the ScheduleTrigger object itself.
     */
    public ScheduleTrigger setRecurrence(ScheduleTriggerRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }
}
