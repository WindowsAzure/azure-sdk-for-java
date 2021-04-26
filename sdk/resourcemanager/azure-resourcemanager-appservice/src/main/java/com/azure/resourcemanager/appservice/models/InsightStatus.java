// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for InsightStatus. */
public enum InsightStatus {
    /** Enum value Critical. */
    CRITICAL("Critical"),

    /** Enum value Warning. */
    WARNING("Warning"),

    /** Enum value Info. */
    INFO("Info"),

    /** Enum value Success. */
    SUCCESS("Success"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a InsightStatus instance. */
    private final String value;

    InsightStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a InsightStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed InsightStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static InsightStatus fromString(String value) {
        InsightStatus[] items = InsightStatus.values();
        for (InsightStatus item : items) {
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
