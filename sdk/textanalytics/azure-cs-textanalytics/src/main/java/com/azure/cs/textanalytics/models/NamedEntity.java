// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cs.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NamedEntity model.
 */
@Fluent
public final class NamedEntity {
    /*
     * NamedEntity text as appears in the request.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * NamedEntity type, such as Person/Location/Org/SSN etc
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * NamedEntity sub type, such as Age/Year/TimeRange etc
     */
    @JsonProperty(value = "subtype")
    private String subtype;

    /*
     * Start position (in Unicode characters) for the entity text.
     */
    @JsonProperty(value = "offset", required = true)
    private int offset;

    /*
     * Length (in Unicode characters) for the entity text.
     */
    @JsonProperty(value = "length", required = true)
    private int length;

    /*
     * Confidence score between 0 and 1 of the extracted entity.
     */
    @JsonProperty(value = "score", required = true)
    private double score;

    /**
     * Get the text property: NamedEntity text as appears in the request.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: NamedEntity text as appears in the request.
     *
     * @param text the text value to set.
     * @return the NamedEntity object itself.
     */
    NamedEntity setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the type property: NamedEntity type, such as Person/Location/Org/SSN etc.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: NamedEntity type, such as Person/Location/Org/SSN etc.
     *
     * @param type the type value to set.
     * @return the NamedEntity object itself.
     */
    NamedEntity setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the subtype property: NamedEntity sub type, such as Age/Year/TimeRange
     * etc.
     *
     * @return the subtype value.
     */
    public String getSubtype() {
        return this.subtype;
    }

    /**
     * Set the subtype property: NamedEntity sub type, such as Age/Year/TimeRange
     * etc.
     *
     * @param subtype the subtype value to set.
     * @return the NamedEntity object itself.
     */
    NamedEntity setSubtype(String subtype) {
        this.subtype = subtype;
        return this;
    }

    /**
     * Get the offset property: Start position (in Unicode characters) for the
     * entity text.
     *
     * @return the offset value.
     */
    public int getOffset() {
        return this.offset;
    }

    /**
     * Set the offset property: Start position (in Unicode characters) for the
     * entity text.
     *
     * @param offset the offset value to set.
     * @return the NamedEntity object itself.
     */
    NamedEntity setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the length property: Length (in Unicode characters) for the entity
     * text.
     *
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Set the length property: Length (in Unicode characters) for the entity
     * text.
     *
     * @param length the length value to set.
     * @return the NamedEntity object itself.
     */
    NamedEntity setLength(int length) {
        this.length = length;
        return this;
    }

    /**
     * Get the score property: Confidence score between 0 and 1 of the
     * extracted entity.
     *
     * @return the score value.
     */
    public double getScore() {
        return this.score;
    }

    /**
     * Set the score property: Confidence score between 0 and 1 of the
     * extracted entity.
     *
     * @param score the score value to set.
     * @return the NamedEntity object itself.
     */
    NamedEntity setScore(double score) {
        this.score = score;
        return this;
    }
}
