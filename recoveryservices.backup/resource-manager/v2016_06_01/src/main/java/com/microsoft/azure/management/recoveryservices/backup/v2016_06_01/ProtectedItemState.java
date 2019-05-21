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
 * Defines values for ProtectedItemState.
 */
public enum ProtectedItemState {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value IRPending. */
    IRPENDING("IRPending"),

    /** Enum value Protected. */
    PROTECTED("Protected"),

    /** Enum value ProtectionError. */
    PROTECTION_ERROR("ProtectionError"),

    /** Enum value ProtectionStopped. */
    PROTECTION_STOPPED("ProtectionStopped"),

    /** Enum value ProtectionPaused. */
    PROTECTION_PAUSED("ProtectionPaused");

    /** The actual serialized value for a ProtectedItemState instance. */
    private String value;

    ProtectedItemState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ProtectedItemState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ProtectedItemState object, or null if unable to parse.
     */
    @JsonCreator
    public static ProtectedItemState fromString(String value) {
        ProtectedItemState[] items = ProtectedItemState.values();
        for (ProtectedItemState item : items) {
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
