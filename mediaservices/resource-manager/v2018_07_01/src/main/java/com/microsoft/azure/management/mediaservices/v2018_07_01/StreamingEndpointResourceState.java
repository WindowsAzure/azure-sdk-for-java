/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for StreamingEndpointResourceState.
 */
public enum StreamingEndpointResourceState {
    /** Enum value Stopped. */
    STOPPED("Stopped"),

    /** Enum value Starting. */
    STARTING("Starting"),

    /** Enum value Running. */
    RUNNING("Running"),

    /** Enum value Stopping. */
    STOPPING("Stopping"),

    /** Enum value Deleting. */
    DELETING("Deleting"),

    /** Enum value Scaling. */
    SCALING("Scaling");

    /** The actual serialized value for a StreamingEndpointResourceState instance. */
    private String value;

    StreamingEndpointResourceState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a StreamingEndpointResourceState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StreamingEndpointResourceState object, or null if unable to parse.
     */
    @JsonCreator
    public static StreamingEndpointResourceState fromString(String value) {
        StreamingEndpointResourceState[] items = StreamingEndpointResourceState.values();
        for (StreamingEndpointResourceState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
