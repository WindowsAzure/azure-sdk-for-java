/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for PasswordName.
 */
public enum PasswordName {
    /** Enum value password. */
    PASSWORD("password"),

    /** Enum value password2. */
    PASSWORD2("password2");

    /** The actual serialized value for a PasswordName instance. */
    private String value;

    PasswordName(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PasswordName instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PasswordName object, or null if unable to parse.
     */
    @JsonCreator
    public static PasswordName fromString(String value) {
        PasswordName[] items = PasswordName.values();
        for (PasswordName item : items) {
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
