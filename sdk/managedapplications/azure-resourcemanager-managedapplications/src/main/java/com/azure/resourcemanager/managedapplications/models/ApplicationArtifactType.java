// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ApplicationArtifactType. */
public enum ApplicationArtifactType {
    /** Enum value Template. */
    TEMPLATE("Template"),

    /** Enum value Custom. */
    CUSTOM("Custom");

    /** The actual serialized value for a ApplicationArtifactType instance. */
    private final String value;

    ApplicationArtifactType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ApplicationArtifactType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ApplicationArtifactType object, or null if unable to parse.
     */
    @JsonCreator
    public static ApplicationArtifactType fromString(String value) {
        ApplicationArtifactType[] items = ApplicationArtifactType.values();
        for (ApplicationArtifactType item : items) {
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
