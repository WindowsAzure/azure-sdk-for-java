// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for IssueType. */
public enum IssueType {
    /** Enum value ServiceIncident. */
    SERVICE_INCIDENT("ServiceIncident"),

    /** Enum value AppDeployment. */
    APP_DEPLOYMENT("AppDeployment"),

    /** Enum value AppCrash. */
    APP_CRASH("AppCrash"),

    /** Enum value RuntimeIssueDetected. */
    RUNTIME_ISSUE_DETECTED("RuntimeIssueDetected"),

    /** Enum value AseDeployment. */
    ASE_DEPLOYMENT("AseDeployment"),

    /** Enum value UserIssue. */
    USER_ISSUE("UserIssue"),

    /** Enum value PlatformIssue. */
    PLATFORM_ISSUE("PlatformIssue"),

    /** Enum value Other. */
    OTHER("Other");

    /** The actual serialized value for a IssueType instance. */
    private final String value;

    IssueType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IssueType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IssueType object, or null if unable to parse.
     */
    @JsonCreator
    public static IssueType fromString(String value) {
        IssueType[] items = IssueType.values();
        for (IssueType item : items) {
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
