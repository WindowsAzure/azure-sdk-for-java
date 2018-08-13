/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object describing identified category.
 */
public class Category {
    /**
     * Name of the category.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Scoring of the category.
     */
    @JsonProperty(value = "score")
    private double score;

    /**
     * The detail property.
     */
    @JsonProperty(value = "detail")
    private CategoryDetail detail;

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
     * @return the Category object itself.
     */
    public Category withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the score value.
     *
     * @return the score value
     */
    public double score() {
        return this.score;
    }

    /**
     * Set the score value.
     *
     * @param score the score value to set
     * @return the Category object itself.
     */
    public Category withScore(double score) {
        this.score = score;
        return this;
    }

    /**
     * Get the detail value.
     *
     * @return the detail value
     */
    public CategoryDetail detail() {
        return this.detail;
    }

    /**
     * Set the detail value.
     *
     * @param detail the detail value to set
     * @return the Category object itself.
     */
    public Category withDetail(CategoryDetail detail) {
        this.detail = detail;
        return this;
    }

}
