// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The basic information of an event. */
@Fluent
public class EventInfoInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventInfoInner.class);

    /*
     * The event ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The event ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The event ID.
     *
     * @param id the id value to set.
     * @return the EventInfoInner object itself.
     */
    public EventInfoInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
