/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for GeoBackupPolicyState.
 */
public enum GeoBackupPolicyState {
    /** Enum value Disabled. */
    DISABLED("Disabled"),

    /** Enum value Enabled. */
    ENABLED("Enabled");

    /** The actual serialized value for a GeoBackupPolicyState instance. */
    private String value;

    GeoBackupPolicyState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a GeoBackupPolicyState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed GeoBackupPolicyState object, or null if unable to parse.
     */
    @JsonCreator
    public static GeoBackupPolicyState fromString(String value) {
        GeoBackupPolicyState[] items = GeoBackupPolicyState.values();
        for (GeoBackupPolicyState item : items) {
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
