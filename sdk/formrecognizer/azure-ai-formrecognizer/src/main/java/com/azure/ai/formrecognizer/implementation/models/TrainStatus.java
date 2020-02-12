// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TrainStatus.
 */
public enum TrainStatus {
    /**
     * Enum value succeeded.
     */
    SUCCEEDED("succeeded"),

    /**
     * Enum value partiallySucceeded.
     */
    PARTIALLY_SUCCEEDED("partiallySucceeded"),

    /**
     * Enum value failed.
     */
    FAILED("failed");

    /**
     * The actual serialized value for a TrainStatus instance.
     */
    private final String value;

    TrainStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TrainStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TrainStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static TrainStatus fromString(String value) {
        TrainStatus[] items = TrainStatus.values();
        for (TrainStatus item : items) {
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
