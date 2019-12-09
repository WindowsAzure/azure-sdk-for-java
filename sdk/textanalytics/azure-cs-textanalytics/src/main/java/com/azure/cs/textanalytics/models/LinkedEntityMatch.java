// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cs.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LinkedEntityMatch model.
 */
@Fluent
public final class LinkedEntityMatch {
    /*
     * If a well-known item is recognized, a decimal number denoting the
     * confidence level between 0 and 1 will be returned.
     */
    @JsonProperty(value = "score", required = true)
    private double score;

    /*
     * Entity text as appears in the request.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * Start position (in Unicode characters) for the entity match text.
     */
    @JsonProperty(value = "offset", required = true)
    private int offset;

    /*
     * Length (in Unicode characters) for the entity match text.
     */
    @JsonProperty(value = "length", required = true)
    private int length;

    /**
     * Get the score property: If a well-known item is recognized, a decimal
     * number denoting the confidence level between 0 and 1 will be returned.
     *
     * @return the score value.
     */
    public double getScore() {
        return this.score;
    }

    /**
     * Set the score property: If a well-known item is recognized, a decimal
     * number denoting the confidence level between 0 and 1 will be returned.
     *
     * @param score the score value to set.
     * @return the LinkedEntityMatch object itself.
     */
    LinkedEntityMatch setScore(double score) {
        this.score = score;
        return this;
    }

    /**
     * Get the text property: Entity text as appears in the request.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: Entity text as appears in the request.
     *
     * @param text the text value to set.
     * @return the LinkedEntityMatch object itself.
     */
    LinkedEntityMatch setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the offset property: Start position (in Unicode characters) for the
     * entity match text.
     *
     * @return the offset value.
     */
    public int getOffset() {
        return this.offset;
    }

    /**
     * Set the offset property: Start position (in Unicode characters) for the
     * entity match text.
     *
     * @param offset the offset value to set.
     * @return the LinkedEntityMatch object itself.
     */
    LinkedEntityMatch setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the length property: Length (in Unicode characters) for the entity
     * match text.
     *
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Set the length property: Length (in Unicode characters) for the entity
     * match text.
     *
     * @param length the length value to set.
     * @return the LinkedEntityMatch object itself.
     */
    LinkedEntityMatch setLength(int length) {
        this.length = length;
        return this;
    }
}
