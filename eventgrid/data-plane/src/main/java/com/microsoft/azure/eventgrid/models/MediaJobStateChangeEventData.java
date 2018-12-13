/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for a
 * Microsoft.Media.JobStateChange event.
 */
public class MediaJobStateChangeEventData {
    /**
     * The previous state of the Job. Possible values include: 'Canceled',
     * 'Canceling', 'Error', 'Finished', 'Processing', 'Queued', 'Scheduled'.
     */
    @JsonProperty(value = "previousState", access = JsonProperty.Access.WRITE_ONLY)
    private MediaJobState previousState;

    /**
     * The new state of the Job. Possible values include: 'Canceled',
     * 'Canceling', 'Error', 'Finished', 'Processing', 'Queued', 'Scheduled'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private MediaJobState state;

    /**
     * Gets the Job correlation data.
     */
    @JsonProperty(value = "correlationData")
    private Map<String, String> correlationData;

    /**
     * Get the previous state of the Job. Possible values include: 'Canceled', 'Canceling', 'Error', 'Finished', 'Processing', 'Queued', 'Scheduled'.
     *
     * @return the previousState value
     */
    public MediaJobState previousState() {
        return this.previousState;
    }

    /**
     * Get the new state of the Job. Possible values include: 'Canceled', 'Canceling', 'Error', 'Finished', 'Processing', 'Queued', 'Scheduled'.
     *
     * @return the state value
     */
    public MediaJobState state() {
        return this.state;
    }

    /**
     * Get gets the Job correlation data.
     *
     * @return the correlationData value
     */
    public Map<String, String> correlationData() {
        return this.correlationData;
    }

    /**
     * Set gets the Job correlation data.
     *
     * @param correlationData the correlationData value to set
     * @return the MediaJobStateChangeEventData object itself.
     */
    public MediaJobStateChangeEventData withCorrelationData(Map<String, String> correlationData) {
        this.correlationData = correlationData;
        return this;
    }

}
