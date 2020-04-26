// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for WebJobType. */
public enum WebJobType {
    /** Enum value Continuous. */
    CONTINUOUS("Continuous"),

    /** Enum value Triggered. */
    TRIGGERED("Triggered");

    /** The actual serialized value for a WebJobType instance. */
    private final String value;

    WebJobType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a WebJobType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed WebJobType object, or null if unable to parse.
     */
    @JsonCreator
    public static WebJobType fromString(String value) {
        WebJobType[] items = WebJobType.values();
        for (WebJobType item : items) {
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
