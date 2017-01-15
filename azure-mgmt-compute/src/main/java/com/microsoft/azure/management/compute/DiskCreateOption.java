/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DiskCreateOption.
 */
public enum DiskCreateOption {
    /** Enum value Empty. */
    EMPTY("Empty"),

    /** Enum value Attach. */
    ATTACH("Attach"),

    /** Enum value FromImage. */
    FROM_IMAGE("FromImage"),

    /** Enum value Import. */
    IMPORT("Import"),

    /** Enum value Copy. */
    COPY("Copy"),

    /** Enum value Restore. */
    RESTORE("Restore");

    /** The actual serialized value for a DiskCreateOption instance. */
    private String value;

    DiskCreateOption(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DiskCreateOption instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DiskCreateOption object, or null if unable to parse.
     */
    @JsonCreator
    public static DiskCreateOption fromString(String value) {
        DiskCreateOption[] items = DiskCreateOption.values();
        for (DiskCreateOption item : items) {
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
