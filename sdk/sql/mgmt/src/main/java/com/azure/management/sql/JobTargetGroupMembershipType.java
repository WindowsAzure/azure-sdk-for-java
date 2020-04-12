// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for JobTargetGroupMembershipType. */
public enum JobTargetGroupMembershipType {
    /** Enum value Include. */
    INCLUDE("Include"),

    /** Enum value Exclude. */
    EXCLUDE("Exclude");

    /** The actual serialized value for a JobTargetGroupMembershipType instance. */
    private final String value;

    JobTargetGroupMembershipType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a JobTargetGroupMembershipType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed JobTargetGroupMembershipType object, or null if unable to parse.
     */
    @JsonCreator
    public static JobTargetGroupMembershipType fromString(String value) {
        JobTargetGroupMembershipType[] items = JobTargetGroupMembershipType.values();
        for (JobTargetGroupMembershipType item : items) {
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
