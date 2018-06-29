/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ProtectionStatus.
 */
public enum ProtectionStatus {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value NotProtected. */
    NOT_PROTECTED("NotProtected"),

    /** Enum value Protecting. */
    PROTECTING("Protecting"),

    /** Enum value Protected. */
    PROTECTED("Protected");

    /** The actual serialized value for a ProtectionStatus instance. */
    private String value;

    ProtectionStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ProtectionStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ProtectionStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static ProtectionStatus fromString(String value) {
        ProtectionStatus[] items = ProtectionStatus.values();
        for (ProtectionStatus item : items) {
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
