/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_09_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for InboundEndpointProtocol.
 */
public enum InboundEndpointProtocol {
    /** Enum value TCP. */
    TCP("TCP"),

    /** Enum value UDP. */
    UDP("UDP");

    /** The actual serialized value for a InboundEndpointProtocol instance. */
    private String value;

    InboundEndpointProtocol(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a InboundEndpointProtocol instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed InboundEndpointProtocol object, or null if unable to parse.
     */
    @JsonCreator
    public static InboundEndpointProtocol fromString(String value) {
        InboundEndpointProtocol[] items = InboundEndpointProtocol.values();
        for (InboundEndpointProtocol item : items) {
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
