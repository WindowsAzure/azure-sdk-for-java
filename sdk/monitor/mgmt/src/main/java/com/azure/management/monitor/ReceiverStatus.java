// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ReceiverStatus. */
public enum ReceiverStatus {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a ReceiverStatus instance. */
    private final String value;

    ReceiverStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ReceiverStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ReceiverStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static ReceiverStatus fromString(String value) {
        ReceiverStatus[] items = ReceiverStatus.values();
        for (ReceiverStatus item : items) {
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
