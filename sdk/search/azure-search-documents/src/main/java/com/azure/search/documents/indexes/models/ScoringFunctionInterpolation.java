// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ScoringFunctionInterpolation.
 */
public enum ScoringFunctionInterpolation {
    /**
     * Enum value linear.
     */
    LINEAR("linear"),

    /**
     * Enum value constant.
     */
    CONSTANT("constant"),

    /**
     * Enum value quadratic.
     */
    QUADRATIC("quadratic"),

    /**
     * Enum value logarithmic.
     */
    LOGARITHMIC("logarithmic");

    /**
     * The actual serialized value for a ScoringFunctionInterpolation instance.
     */
    private final String value;

    ScoringFunctionInterpolation(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ScoringFunctionInterpolation instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ScoringFunctionInterpolation object, or null if unable to parse.
     */
    @JsonCreator
    public static ScoringFunctionInterpolation fromString(String value) {
        ScoringFunctionInterpolation[] items = ScoringFunctionInterpolation.values();
        for (ScoringFunctionInterpolation item : items) {
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
