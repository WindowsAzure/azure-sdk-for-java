/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.face.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for FindSimilarMatchMode.
 */
public enum FindSimilarMatchMode {
    /** Enum value matchPerson. */
    MATCH_PERSON("matchPerson"),

    /** Enum value matchFace. */
    MATCH_FACE("matchFace");

    /** The actual serialized value for a FindSimilarMatchMode instance. */
    private String value;

    FindSimilarMatchMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FindSimilarMatchMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FindSimilarMatchMode object, or null if unable to parse.
     */
    @JsonCreator
    public static FindSimilarMatchMode fromString(String value) {
        FindSimilarMatchMode[] items = FindSimilarMatchMode.values();
        for (FindSimilarMatchMode item : items) {
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
