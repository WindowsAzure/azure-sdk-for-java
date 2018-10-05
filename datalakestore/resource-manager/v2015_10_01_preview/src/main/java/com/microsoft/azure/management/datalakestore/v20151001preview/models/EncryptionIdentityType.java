/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2015_10_01_preview.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for EncryptionIdentityType.
 */
public enum EncryptionIdentityType {
    /** Enum value SystemAssigned. */
    SYSTEM_ASSIGNED("SystemAssigned");

    /** The actual serialized value for a EncryptionIdentityType instance. */
    private String value;

    EncryptionIdentityType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EncryptionIdentityType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EncryptionIdentityType object, or null if unable to parse.
     */
    @JsonCreator
    public static EncryptionIdentityType fromString(String value) {
        EncryptionIdentityType[] items = EncryptionIdentityType.values();
        for (EncryptionIdentityType item : items) {
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
