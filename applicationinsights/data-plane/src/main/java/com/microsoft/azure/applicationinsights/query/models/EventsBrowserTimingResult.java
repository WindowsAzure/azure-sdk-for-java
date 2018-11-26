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
 * A browser timing result.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("browserTiming")
public class EventsBrowserTimingResult extends EventsResultData {
    /**
     * The browserTiming property.
     */
    @JsonProperty(value = "browserTiming")
    private EventsBrowserTimingInfo browserTiming;

    /**
     * The clientPerformance property.
     */
    @JsonProperty(value = "clientPerformance")
    private EventsClientPerformanceInfo clientPerformance;

    /**
     * Get the browserTiming value.
     *
     * @return the browserTiming value
     */
    public EventsBrowserTimingInfo browserTiming() {
        return this.browserTiming;
    }

    /**
     * Set the browserTiming value.
     *
     * @param browserTiming the browserTiming value to set
     * @return the EventsBrowserTimingResult object itself.
     */
    public EventsBrowserTimingResult withBrowserTiming(EventsBrowserTimingInfo browserTiming) {
        this.browserTiming = browserTiming;
        return this;
    }

    /**
     * Get the clientPerformance value.
     *
     * @return the clientPerformance value
     */
    public EventsClientPerformanceInfo clientPerformance() {
        return this.clientPerformance;
    }

    /**
     * Set the clientPerformance value.
     *
     * @param clientPerformance the clientPerformance value to set
     * @return the EventsBrowserTimingResult object itself.
     */
    public EventsBrowserTimingResult withClientPerformance(EventsClientPerformanceInfo clientPerformance) {
        this.clientPerformance = clientPerformance;
        return this;
    }

}
