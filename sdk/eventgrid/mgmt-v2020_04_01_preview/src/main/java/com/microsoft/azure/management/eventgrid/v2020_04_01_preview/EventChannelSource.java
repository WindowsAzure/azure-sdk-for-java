/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the source of an event channel.
 */
public class EventChannelSource {
    /**
     * The identifier of the resource that's the source of the events.
     * This represents a unique resource in the partner's resource model.
     */
    @JsonProperty(value = "source")
    private String source;

    /**
     * Get the identifier of the resource that's the source of the events.
     This represents a unique resource in the partner's resource model.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the identifier of the resource that's the source of the events.
     This represents a unique resource in the partner's resource model.
     *
     * @param source the source value to set
     * @return the EventChannelSource object itself.
     */
    public EventChannelSource withSource(String source) {
        this.source = source;
        return this;
    }

}
