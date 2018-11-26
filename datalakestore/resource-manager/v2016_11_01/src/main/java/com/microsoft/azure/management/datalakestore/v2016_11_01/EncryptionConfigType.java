/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2016_11_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for EncryptionConfigType.
 */
public enum EncryptionConfigType {
    /** Enum value UserManaged. */
    USER_MANAGED("UserManaged"),

    /** Enum value ServiceManaged. */
    SERVICE_MANAGED("ServiceManaged");

    /** The actual serialized value for a EncryptionConfigType instance. */
    private String value;

    EncryptionConfigType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EncryptionConfigType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EncryptionConfigType object, or null if unable to parse.
     */
    @JsonCreator
    public static EncryptionConfigType fromString(String value) {
        EncryptionConfigType[] items = EncryptionConfigType.values();
        for (EncryptionConfigType item : items) {
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
