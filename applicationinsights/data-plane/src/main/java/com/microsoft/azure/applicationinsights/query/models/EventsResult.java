/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An event query result.
 */
public class EventsResult {
    /**
     * OData messages for this response.
     */
    @JsonProperty(value = "@ai\\.messages")
    private List<ErrorInfo> aimessages;

    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private EventsResultData value;

    /**
     * Get oData messages for this response.
     *
     * @return the aimessages value
     */
    public List<ErrorInfo> aimessages() {
        return this.aimessages;
    }

    /**
     * Set oData messages for this response.
     *
     * @param aimessages the aimessages value to set
     * @return the EventsResult object itself.
     */
    public EventsResult withAimessages(List<ErrorInfo> aimessages) {
        this.aimessages = aimessages;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public EventsResultData value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the EventsResult object itself.
     */
    public EventsResult withValue(EventsResultData value) {
        this.value = value;
        return this;
    }

}
