// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DetectedLanguage model.
 */
@Fluent
public final class DetectedLanguage {
    /*
     * Long name of a detected language (e.g. English, French).
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A two letter representation of the detected language according to the
     * ISO 639-1 standard (e.g. en, fr).
     */
    @JsonProperty(value = "iso6391Name", required = true)
    private String iso6391Name;

    /*
     * A confidence score between 0 and 1. Scores close to 1 indicate 100%
     * certainty that the identified language is true.
     */
    @JsonProperty(value = "score", required = true)
    private double score;

    /**
     * Get the name property: Long name of a detected language (e.g. English,
     * French).
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Long name of a detected language (e.g. English,
     * French).
     *
     * @param name the name value to set.
     * @return the DetectedLanguage object itself.
     */
    public DetectedLanguage setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the iso6391Name property: A two letter representation of the
     * detected language according to the ISO 639-1 standard (e.g. en, fr).
     *
     * @return the iso6391Name value.
     */
    public String getIso6391Name() {
        return this.iso6391Name;
    }

    /**
     * Set the iso6391Name property: A two letter representation of the
     * detected language according to the ISO 639-1 standard (e.g. en, fr).
     *
     * @param iso6391Name the iso6391Name value to set.
     * @return the DetectedLanguage object itself.
     */
    public DetectedLanguage setIso6391Name(String iso6391Name) {
        this.iso6391Name = iso6391Name;
        return this;
    }

    /**
     * Get the score property: A confidence score between 0 and 1. Scores close
     * to 1 indicate 100% certainty that the identified language is true.
     *
     * @return the score value.
     */
    public double getScore() {
        return this.score;
    }

    /**
     * Set the score property: A confidence score between 0 and 1. Scores close
     * to 1 indicate 100% certainty that the identified language is true.
     *
     * @param score the score value to set.
     * @return the DetectedLanguage object itself.
     */
    public DetectedLanguage setScore(double score) {
        this.score = score;
        return this;
    }
}
