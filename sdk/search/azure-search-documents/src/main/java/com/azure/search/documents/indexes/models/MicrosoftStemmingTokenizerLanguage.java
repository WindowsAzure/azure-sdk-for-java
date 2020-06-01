// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for MicrosoftStemmingTokenizerLanguage.
 */
public enum MicrosoftStemmingTokenizerLanguage {
    /**
     * Enum value arabic.
     */
    ARABIC("arabic"),

    /**
     * Enum value bangla.
     */
    BANGLA("bangla"),

    /**
     * Enum value bulgarian.
     */
    BULGARIAN("bulgarian"),

    /**
     * Enum value catalan.
     */
    CATALAN("catalan"),

    /**
     * Enum value croatian.
     */
    CROATIAN("croatian"),

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
     * Enum value estonian.
     */
    ESTONIAN("estonian"),

    /**
     * Enum value finnish.
     */
    FINNISH("finnish"),

    /**
     * Enum value french.
     */
    FRENCH("french"),

    /**
     * Enum value german.
     */
    GERMAN("german"),

    /**
     * Enum value greek.
     */
    GREEK("greek"),

    /**
     * Enum value gujarati.
     */
    GUJARATI("gujarati"),

    /**
     * Enum value hebrew.
     */
    HEBREW("hebrew"),

    /**
     * Enum value hindi.
     */
    HINDI("hindi"),

    /**
     * Enum value hungarian.
     */
    HUNGARIAN("hungarian"),

    /**
     * Enum value icelandic.
     */
    ICELANDIC("icelandic"),

    /**
     * Enum value indonesian.
     */
    INDONESIAN("indonesian"),

    /**
     * Enum value italian.
     */
    ITALIAN("italian"),

    /**
     * Enum value kannada.
     */
    KANNADA("kannada"),

    /**
     * Enum value latvian.
     */
    LATVIAN("latvian"),

    /**
     * Enum value lithuanian.
     */
    LITHUANIAN("lithuanian"),

    /**
     * Enum value malay.
     */
    MALAY("malay"),

    /**
     * Enum value malayalam.
     */
    MALAYALAM("malayalam"),

    /**
     * Enum value marathi.
     */
    MARATHI("marathi"),

    /**
     * Enum value norwegianBokmaal.
     */
    NORWEGIAN_BOKMAAL("norwegianBokmaal"),

    /**
     * Enum value polish.
     */
    POLISH("polish"),

    /**
     * Enum value portuguese.
     */
    PORTUGUESE("portuguese"),

    /**
     * Enum value portugueseBrazilian.
     */
    PORTUGUESE_BRAZILIAN("portugueseBrazilian"),

    /**
     * Enum value punjabi.
     */
    PUNJABI("punjabi"),

    /**
     * Enum value romanian.
     */
    ROMANIAN("romanian"),

    /**
     * Enum value russian.
     */
    RUSSIAN("russian"),

    /**
     * Enum value serbianCyrillic.
     */
    SERBIAN_CYRILLIC("serbianCyrillic"),

    /**
     * Enum value serbianLatin.
     */
    SERBIAN_LATIN("serbianLatin"),

    /**
     * Enum value slovak.
     */
    SLOVAK("slovak"),

    /**
     * Enum value slovenian.
     */
    SLOVENIAN("slovenian"),

    /**
     * Enum value spanish.
     */
    SPANISH("spanish"),

    /**
     * Enum value swedish.
     */
    SWEDISH("swedish"),

    /**
     * Enum value tamil.
     */
    TAMIL("tamil"),

    /**
     * Enum value telugu.
     */
    TELUGU("telugu"),

    /**
     * Enum value turkish.
     */
    TURKISH("turkish"),

    /**
     * Enum value ukrainian.
     */
    UKRAINIAN("ukrainian"),

    /**
     * Enum value urdu.
     */
    URDU("urdu");

    /**
     * The actual serialized value for a MicrosoftStemmingTokenizerLanguage instance.
     */
    private final String value;

    MicrosoftStemmingTokenizerLanguage(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
