/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_01_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for PackageState.
 */
public enum PackageState {
    /** Enum value pending. */
    PENDING("pending"),

    /** Enum value active. */
    ACTIVE("active"),

    /** Enum value unmapped. */
    UNMAPPED("unmapped");

    /** The actual serialized value for a PackageState instance. */
    private String value;

    PackageState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PackageState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PackageState object, or null if unable to parse.
     */
    @JsonCreator
    public static PackageState fromString(String value) {
        PackageState[] items = PackageState.values();
        for (PackageState item : items) {
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
