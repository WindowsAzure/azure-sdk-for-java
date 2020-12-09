// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ListSharesExpand. */
public enum ListSharesExpand {
    /** Enum value deleted. */
    DELETED("deleted");

    /** The actual serialized value for a ListSharesExpand instance. */
    private final String value;

    ListSharesExpand(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ListSharesExpand instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ListSharesExpand object, or null if unable to parse.
     */
    @JsonCreator
    public static ListSharesExpand fromString(String value) {
        ListSharesExpand[] items = ListSharesExpand.values();
        for (ListSharesExpand item : items) {
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
