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
 * Exported Model - Extracted Entity from utterance.
 */
public class JSONEntity {
    /**
     * The index within the utterance where the extracted entity starts.
     */
    @JsonProperty(value = "startPos", required = true)
    private int startPos;

    /**
     * The index within the utterance where the extracted entity ends.
     */
    @JsonProperty(value = "endPos", required = true)
    private int endPos;

    /**
     * The entity name.
     */
    @JsonProperty(value = "entity", required = true)
    private String entity;

    /**
     * Get the startPos value.
     *
     * @return the startPos value
     */
    public int startPos() {
        return this.startPos;
    }

    /**
     * Set the startPos value.
     *
     * @param startPos the startPos value to set
     * @return the JSONEntity object itself.
     */
    public JSONEntity withStartPos(int startPos) {
        this.startPos = startPos;
        return this;
    }

    /**
     * Get the endPos value.
     *
     * @return the endPos value
     */
    public int endPos() {
        return this.endPos;
    }

    /**
     * Set the endPos value.
     *
     * @param endPos the endPos value to set
     * @return the JSONEntity object itself.
     */
    public JSONEntity withEndPos(int endPos) {
        this.endPos = endPos;
        return this;
    }

    /**
     * Get the entity value.
     *
     * @return the entity value
     */
    public String entity() {
        return this.entity;
    }

    /**
     * Set the entity value.
     *
     * @param entity the entity value to set
     * @return the JSONEntity object itself.
     */
    public JSONEntity withEntity(String entity) {
        this.entity = entity;
        return this;
    }

}
