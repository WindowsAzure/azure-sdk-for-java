// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TokenCharacterKind.
 */
public enum TokenCharacterKind {
    /**
     * Enum value letter.
     */
    LETTER("letter"),

    /**
     * Enum value digit.
     */
    DIGIT("digit"),

    /**
     * Enum value whitespace.
     */
    WHITESPACE("whitespace"),

    /**
     * Enum value punctuation.
     */
    PUNCTUATION("punctuation"),

    /**
     * Enum value symbol.
     */
    SYMBOL("symbol");

    /**
     * The actual serialized value for a TokenCharacterKind instance.
     */
    private final String value;

    TokenCharacterKind(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TokenCharacterKind instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TokenCharacterKind object, or null if unable to parse.
     */
    @JsonCreator
    public static TokenCharacterKind fromString(String value) {
        TokenCharacterKind[] items = TokenCharacterKind.values();
        for (TokenCharacterKind item : items) {
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
