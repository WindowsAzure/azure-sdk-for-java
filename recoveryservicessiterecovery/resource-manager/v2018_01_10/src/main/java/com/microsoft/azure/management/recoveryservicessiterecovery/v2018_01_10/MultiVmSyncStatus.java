/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for MultiVmSyncStatus.
 */
public enum MultiVmSyncStatus {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a MultiVmSyncStatus instance. */
    private String value;

    MultiVmSyncStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MultiVmSyncStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MultiVmSyncStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static MultiVmSyncStatus fromString(String value) {
        MultiVmSyncStatus[] items = MultiVmSyncStatus.values();
        for (MultiVmSyncStatus item : items) {
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
