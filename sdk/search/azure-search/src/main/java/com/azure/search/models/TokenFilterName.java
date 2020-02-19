// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for TokenFilterName.
 */
public final class TokenFilterName extends ExpandableStringEnum<TokenFilterName> {
    /**
     * Static value arabic_normalization for TokenFilterName.
     */
    public static final TokenFilterName ARABIC_NORMALIZATION = fromString("arabic_normalization");

    /**
     * Static value apostrophe for TokenFilterName.
     */
    public static final TokenFilterName APOSTROPHE = fromString("apostrophe");

    /**
     * Static value asciifolding for TokenFilterName.
     */
    public static final TokenFilterName ASCII_FOLDING = fromString("asciifolding");

    /**
     * Static value cjk_bigram for TokenFilterName.
     */
    public static final TokenFilterName CJK_BIGRAM = fromString("cjk_bigram");

    /**
     * Static value cjk_width for TokenFilterName.
     */
    public static final TokenFilterName CJK_WIDTH = fromString("cjk_width");

    /**
     * Static value classic for TokenFilterName.
     */
    public static final TokenFilterName CLASSIC = fromString("classic");

    /**
     * Static value common_grams for TokenFilterName.
     */
    public static final TokenFilterName COMMON_GRAM = fromString("common_grams");

    /**
     * Static value edgeNGram_v2 for TokenFilterName.
     */
    public static final TokenFilterName EDGE_NGRAM = fromString("edgeNGram_v2");

    /**
     * Static value elision for TokenFilterName.
     */
    public static final TokenFilterName ELISION = fromString("elision");

    /**
     * Static value german_normalization for TokenFilterName.
     */
    public static final TokenFilterName GERMAN_NORMALIZATION = fromString("german_normalization");

    /**
     * Static value hindi_normalization for TokenFilterName.
     */
    public static final TokenFilterName HINDI_NORMALIZATION = fromString("hindi_normalization");

    /**
     * Static value indic_normalization for TokenFilterName.
     */
    public static final TokenFilterName INDIC_NORMALIZATION = fromString("indic_normalization");

    /**
     * Static value keyword_repeat for TokenFilterName.
     */
    public static final TokenFilterName KEYWORD_REPEAT = fromString("keyword_repeat");

    /**
     * Static value kstem for TokenFilterName.
     */
    public static final TokenFilterName KSTEM = fromString("kstem");

    /**
     * Static value length for TokenFilterName.
     */
    public static final TokenFilterName LENGTH = fromString("length");

    /**
     * Static value limit for TokenFilterName.
     */
    public static final TokenFilterName LIMIT = fromString("limit");

    /**
     * Static value lowercase for TokenFilterName.
     */
    public static final TokenFilterName LOWERCASE = fromString("lowercase");

    /**
     * Static value nGram_v2 for TokenFilterName.
     */
    public static final TokenFilterName NGRAM = fromString("nGram_v2");

    /**
     * Static value persian_normalization for TokenFilterName.
     */
    public static final TokenFilterName PERSIAN_NORMALIZATION = fromString("persian_normalization");

    /**
     * Static value phonetic for TokenFilterName.
     */
    public static final TokenFilterName PHONETIC = fromString("phonetic");

    /**
     * Static value porter_stem for TokenFilterName.
     */
    public static final TokenFilterName PORTER_STEM = fromString("porter_stem");

    /**
     * Static value reverse for TokenFilterName.
     */
    public static final TokenFilterName REVERSE = fromString("reverse");

    /**
     * Static value scandinavian_normalization for TokenFilterName.
     */
    public static final TokenFilterName SCANDINAVIAN_NORMALIZATION = fromString("scandinavian_normalization");

    /**
     * Static value scandinavian_folding for TokenFilterName.
     */
    public static final TokenFilterName SCANDINAVIAN_FOLDING_NORMALIZATION = fromString("scandinavian_folding");

    /**
     * Static value shingle for TokenFilterName.
     */
    public static final TokenFilterName SHINGLE = fromString("shingle");

    /**
     * Static value snowball for TokenFilterName.
     */
    public static final TokenFilterName SNOWBALL = fromString("snowball");

    /**
     * Static value sorani_normalization for TokenFilterName.
     */
    public static final TokenFilterName SORANI_NORMALIZATION = fromString("sorani_normalization");

    /**
     * Static value stemmer for TokenFilterName.
     */
    public static final TokenFilterName STEMMER = fromString("stemmer");

    /**
     * Static value stopwords for TokenFilterName.
     */
    public static final TokenFilterName STOPWORDS = fromString("stopwords");

    /**
     * Static value trim for TokenFilterName.
     */
    public static final TokenFilterName TRIM = fromString("trim");

    /**
     * Static value truncate for TokenFilterName.
     */
    public static final TokenFilterName TRUNCATE = fromString("truncate");

    /**
     * Static value unique for TokenFilterName.
     */
    public static final TokenFilterName UNIQUE = fromString("unique");

    /**
     * Static value uppercase for TokenFilterName.
     */
    public static final TokenFilterName UPPERCASE = fromString("uppercase");

    /**
     * Static value word_delimiter for TokenFilterName.
     */
    public static final TokenFilterName WORD_DELIMITER = fromString("word_delimiter");

    /**
     * Creates or finds a TokenFilterName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TokenFilterName.
     */
    @JsonCreator
    public static TokenFilterName fromString(String name) {
        return fromString(name, TokenFilterName.class);
    }

    /**
     * @return known TokenFilterName values.
     */
    public static Collection<TokenFilterName> values() {
        return values(TokenFilterName.class);
    }
}
