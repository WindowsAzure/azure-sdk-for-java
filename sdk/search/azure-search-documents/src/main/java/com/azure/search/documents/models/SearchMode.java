// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SearchMode.
 */
public enum SearchMode {
    /**
     * Enum value any.
     */
    ANY("any"),

    /**
     * Enum value all.
     */
    ALL("all");

    /**
     * The actual serialized value for a SearchMode instance.
     */
    private final String value;

    SearchMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SearchMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SearchMode object, or null if unable to parse.
     */
    @JsonCreator
    public static SearchMode fromString(String value) {
        SearchMode[] items = SearchMode.values();
        for (SearchMode item : items) {
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
