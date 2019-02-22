// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for StartTaskState.
 */
public enum StartTaskState {
    /** The start task is currently running. */
    RUNNING("running"),

    /** The start task has exited with exit code 0, or the start task has failed and the retry limit has reached, or the start task process did not run due to task preparation errors (such as resource file download failures). */
    COMPLETED("completed");

    /** The actual serialized value for a StartTaskState instance. */
    private String value;

    StartTaskState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a StartTaskState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StartTaskState object, or null if unable to parse.
     */
    @JsonCreator
    public static StartTaskState fromString(String value) {
        StartTaskState[] items = StartTaskState.values();
        for (StartTaskState item : items) {
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
