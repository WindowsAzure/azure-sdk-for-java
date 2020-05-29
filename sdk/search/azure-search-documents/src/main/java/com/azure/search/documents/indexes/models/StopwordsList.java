// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for StopwordsList.
 */
public enum StopwordsList {
    /**
     * Enum value arabic.
     */
    ARABIC("arabic"),

    /**
     * Enum value armenian.
     */
    ARMENIAN("armenian"),

    /**
     * Enum value basque.
     */
    BASQUE("basque"),

    /**
     * Enum value brazilian.
     */
    BRAZILIAN("brazilian"),

    /**
     * Enum value bulgarian.
     */
    BULGARIAN("bulgarian"),

    /**
     * Enum value catalan.
     */
    CATALAN("catalan"),

    /**
     * Enum value czech.
     */
    CZECH("czech"),

    /**
     * Enum value danish.
     */
    DANISH("danish"),

    /**
     * Enum value dutch.
     */
    DUTCH("dutch"),

    /**
     * Enum value english.
     */
    ENGLISH("english"),

    /**
     * Enum value finnish.
     */
    FINNISH("finnish"),

    /**
     * Enum value french.
     */
    FRENCH("french"),

    /**
     * Enum value galician.
     */
    GALICIAN("galician"),

    /**
     * Enum value german.
     */
    GERMAN("german"),

    /**
     * Enum value greek.
     */
    GREEK("greek"),

    /**
     * Enum value hindi.
     */
    HINDI("hindi"),

    /**
     * Enum value hungarian.
     */
    HUNGARIAN("hungarian"),

    /**
     * Enum value indonesian.
     */
    INDONESIAN("indonesian"),

    /**
     * Enum value irish.
     */
    IRISH("irish"),

    /**
     * Enum value italian.
     */
    ITALIAN("italian"),

    /**
     * Enum value latvian.
     */
    LATVIAN("latvian"),

    /**
     * Enum value norwegian.
     */
    NORWEGIAN("norwegian"),

    /**
     * Enum value persian.
     */
    PERSIAN("persian"),

    /**
     * Enum value portuguese.
     */
    PORTUGUESE("portuguese"),

    /**
     * Enum value romanian.
     */
    ROMANIAN("romanian"),

    /**
     * Enum value russian.
     */
    RUSSIAN("russian"),

    /**
     * Enum value sorani.
     */
    SORANI("sorani"),

    /**
     * Enum value spanish.
     */
    SPANISH("spanish"),

    /**
     * Enum value swedish.
     */
    SWEDISH("swedish"),

    /**
     * Enum value thai.
     */
    THAI("thai"),

    /**
     * Enum value turkish.
     */
    TURKISH("turkish");

    /**
     * The actual serialized value for a StopwordsList instance.
     */
    private final String value;

    StopwordsList(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a StopwordsList instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StopwordsList object, or null if unable to parse.
     */
    @JsonCreator
    public static StopwordsList fromString(String value) {
        StopwordsList[] items = StopwordsList.values();
        for (StopwordsList item : items) {
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
