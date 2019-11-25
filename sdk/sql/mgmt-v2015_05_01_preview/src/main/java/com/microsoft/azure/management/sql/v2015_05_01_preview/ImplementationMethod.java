/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ImplementationMethod.
 */
public enum ImplementationMethod {
    /** Enum value TSql. */
    TSQL("TSql"),

    /** Enum value AzurePowerShell. */
    AZURE_POWER_SHELL("AzurePowerShell");

    /** The actual serialized value for a ImplementationMethod instance. */
    private String value;

    ImplementationMethod(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ImplementationMethod instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ImplementationMethod object, or null if unable to parse.
     */
    @JsonCreator
    public static ImplementationMethod fromString(String value) {
        ImplementationMethod[] items = ImplementationMethod.values();
        for (ImplementationMethod item : items) {
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
