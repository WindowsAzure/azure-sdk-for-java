/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Exported Model - A Pattern feature.
 */
public class JSONRegexFeature {
    /**
     * The Regular Expression to match.
     */
    @JsonProperty(value = "pattern")
    private String pattern;

    /**
     * Indicates if the Pattern feature is enabled.
     */
    @JsonProperty(value = "activated")
    private Boolean activated;

    /**
     * Name of the feature.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the pattern value.
     *
     * @return the pattern value
     */
    public String pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern value.
     *
     * @param pattern the pattern value to set
     * @return the JSONRegexFeature object itself.
     */
    public JSONRegexFeature withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the activated value.
     *
     * @return the activated value
     */
    public Boolean activated() {
        return this.activated;
    }

    /**
     * Set the activated value.
     *
     * @param activated the activated value to set
     * @return the JSONRegexFeature object itself.
     */
    public JSONRegexFeature withActivated(Boolean activated) {
        this.activated = activated;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the JSONRegexFeature object itself.
     */
    public JSONRegexFeature withName(String name) {
        this.name = name;
        return this;
    }

}
