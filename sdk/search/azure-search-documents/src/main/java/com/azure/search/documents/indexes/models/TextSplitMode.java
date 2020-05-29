// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TextSplitMode.
 */
public enum TextSplitMode {
    /**
     * Enum value pages.
     */
    PAGES("pages"),

    /**
     * Enum value sentences.
     */
    SENTENCES("sentences");

    /**
     * The actual serialized value for a TextSplitMode instance.
     */
    private final String value;

    TextSplitMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TextSplitMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TextSplitMode object, or null if unable to parse.
     */
    @JsonCreator
    public static TextSplitMode fromString(String value) {
        TextSplitMode[] items = TextSplitMode.values();
        for (TextSplitMode item : items) {
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
