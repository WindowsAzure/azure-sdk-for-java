/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RecoveryPointTierStatus.
 */
public enum RecoveryPointTierStatus {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value Valid. */
    VALID("Valid"),

    /** Enum value Disabled. */
    DISABLED("Disabled"),

    /** Enum value Deleted. */
    DELETED("Deleted");

    /** The actual serialized value for a RecoveryPointTierStatus instance. */
    private String value;

    RecoveryPointTierStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RecoveryPointTierStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RecoveryPointTierStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static RecoveryPointTierStatus fromString(String value) {
        RecoveryPointTierStatus[] items = RecoveryPointTierStatus.values();
        for (RecoveryPointTierStatus item : items) {
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
