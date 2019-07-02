/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2015_01_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ReasonChronicityTypes.
 */
public enum ReasonChronicityTypes {
    /** Enum value Transient. */
    TRANSIENT("Transient"),

    /** Enum value Persistent. */
    PERSISTENT("Persistent");

    /** The actual serialized value for a ReasonChronicityTypes instance. */
    private String value;

    ReasonChronicityTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ReasonChronicityTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ReasonChronicityTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static ReasonChronicityTypes fromString(String value) {
        ReasonChronicityTypes[] items = ReasonChronicityTypes.values();
        for (ReasonChronicityTypes item : items) {
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
