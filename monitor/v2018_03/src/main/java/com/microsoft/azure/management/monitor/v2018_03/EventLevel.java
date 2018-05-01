/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_03;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for EventLevel.
 */
public enum EventLevel {
    /** Enum value Critical. */
    CRITICAL("Critical"),

    /** Enum value Error. */
    ERROR("Error"),

    /** Enum value Warning. */
    WARNING("Warning"),

    /** Enum value Informational. */
    INFORMATIONAL("Informational"),

    /** Enum value Verbose. */
    VERBOSE("Verbose");

    /** The actual serialized value for a EventLevel instance. */
    private String value;

    EventLevel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EventLevel instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EventLevel object, or null if unable to parse.
     */
    @JsonCreator
    public static EventLevel fromString(String value) {
        EventLevel[] items = EventLevel.values();
        for (EventLevel item : items) {
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
