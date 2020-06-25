/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ListKeyExpand.
 */
public enum ListKeyExpand {
    /** Enum value kerb. */
    KERB("kerb");

    /** The actual serialized value for a ListKeyExpand instance. */
    private String value;

    ListKeyExpand(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ListKeyExpand instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ListKeyExpand object, or null if unable to parse.
     */
    @JsonCreator
    public static ListKeyExpand fromString(String value) {
        ListKeyExpand[] items = ListKeyExpand.values();
        for (ListKeyExpand item : items) {
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
