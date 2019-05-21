/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RecoveryType.
 */
public enum RecoveryType {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value OriginalLocation. */
    ORIGINAL_LOCATION("OriginalLocation"),

    /** Enum value AlternateLocation. */
    ALTERNATE_LOCATION("AlternateLocation"),

    /** Enum value RestoreDisks. */
    RESTORE_DISKS("RestoreDisks");

    /** The actual serialized value for a RecoveryType instance. */
    private String value;

    RecoveryType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RecoveryType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RecoveryType object, or null if unable to parse.
     */
    @JsonCreator
    public static RecoveryType fromString(String value) {
        RecoveryType[] items = RecoveryType.values();
        for (RecoveryType item : items) {
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
