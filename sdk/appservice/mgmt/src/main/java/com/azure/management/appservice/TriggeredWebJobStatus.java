// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for TriggeredWebJobStatus. */
public enum TriggeredWebJobStatus {
    /** Enum value Success. */
    SUCCESS("Success"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Error. */
    ERROR("Error");

    /** The actual serialized value for a TriggeredWebJobStatus instance. */
    private final String value;

    TriggeredWebJobStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TriggeredWebJobStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TriggeredWebJobStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static TriggeredWebJobStatus fromString(String value) {
        TriggeredWebJobStatus[] items = TriggeredWebJobStatus.values();
        for (TriggeredWebJobStatus item : items) {
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
