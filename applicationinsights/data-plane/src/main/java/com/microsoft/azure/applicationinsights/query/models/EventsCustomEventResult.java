/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A custom event result.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("customEvent")
public class EventsCustomEventResult extends EventsResultData {
    /**
     * The customEvent property.
     */
    @JsonProperty(value = "customEvent")
    private EventsCustomEventInfo customEvent;

    /**
     * Get the customEvent value.
     *
     * @return the customEvent value
     */
    public EventsCustomEventInfo customEvent() {
        return this.customEvent;
    }

    /**
     * Set the customEvent value.
     *
     * @param customEvent the customEvent value to set
     * @return the EventsCustomEventResult object itself.
     */
    public EventsCustomEventResult withCustomEvent(EventsCustomEventInfo customEvent) {
        this.customEvent = customEvent;
        return this;
    }

}
