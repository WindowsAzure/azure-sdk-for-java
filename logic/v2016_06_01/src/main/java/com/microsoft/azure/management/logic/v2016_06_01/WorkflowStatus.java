/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for WorkflowStatus.
 */
public enum WorkflowStatus {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value Paused. */
    PAUSED("Paused"),

    /** Enum value Running. */
    RUNNING("Running"),

    /** Enum value Waiting. */
    WAITING("Waiting"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Skipped. */
    SKIPPED("Skipped"),

    /** Enum value Suspended. */
    SUSPENDED("Suspended"),

    /** Enum value Cancelled. */
    CANCELLED("Cancelled"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Faulted. */
    FAULTED("Faulted"),

    /** Enum value TimedOut. */
    TIMED_OUT("TimedOut"),

    /** Enum value Aborted. */
    ABORTED("Aborted"),

    /** Enum value Ignored. */
    IGNORED("Ignored");

    /** The actual serialized value for a WorkflowStatus instance. */
    private String value;

    WorkflowStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a WorkflowStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed WorkflowStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static WorkflowStatus fromString(String value) {
        WorkflowStatus[] items = WorkflowStatus.values();
        for (WorkflowStatus item : items) {
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
