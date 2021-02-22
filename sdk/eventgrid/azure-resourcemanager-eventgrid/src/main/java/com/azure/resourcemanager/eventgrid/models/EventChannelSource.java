// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the source of an event channel. */
@Fluent
public final class EventChannelSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventChannelSource.class);

    /*
     * The identifier of the resource that's the source of the events.
     * This represents a unique resource in the partner's resource model.
     */
    @JsonProperty(value = "source")
    private String source;

    /**
     * Get the source property: The identifier of the resource that's the source of the events. This represents a unique
     * resource in the partner's resource model.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: The identifier of the resource that's the source of the events. This represents a unique
     * resource in the partner's resource model.
     *
     * @param source the source value to set.
     * @return the EventChannelSource object itself.
     */
    public EventChannelSource withSource(String source) {
        this.source = source;
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
