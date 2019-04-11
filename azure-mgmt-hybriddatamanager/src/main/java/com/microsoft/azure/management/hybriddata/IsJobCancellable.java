/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybriddata;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for IsJobCancellable.
 */
public enum IsJobCancellable {
    /** Enum value NotCancellable. */
    NOT_CANCELLABLE("NotCancellable"),

    /** Enum value Cancellable. */
    CANCELLABLE("Cancellable");

    /** The actual serialized value for a IsJobCancellable instance. */
    private String value;

    IsJobCancellable(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IsJobCancellable instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IsJobCancellable object, or null if unable to parse.
     */
    @JsonCreator
    public static IsJobCancellable fromString(String value) {
        IsJobCancellable[] items = IsJobCancellable.values();
        for (IsJobCancellable item : items) {
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
