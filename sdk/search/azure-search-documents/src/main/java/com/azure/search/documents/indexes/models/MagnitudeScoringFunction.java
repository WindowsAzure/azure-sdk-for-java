// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines a function that boosts scores based on the magnitude of a numeric
 * field.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("magnitude")
@Fluent
public final class MagnitudeScoringFunction extends ScoringFunction {
    /*
     * Parameter values for the magnitude scoring function.
     */
    @JsonProperty(value = "magnitude", required = true)
    private MagnitudeScoringParameters parameters;

    @JsonCreator
    public MagnitudeScoringFunction(
        @JsonProperty(value = "fieldName", required = true) String fieldName,
        @JsonProperty(value = "boost", required = true) double boost,
        @JsonProperty(value = "magnitude", required = true) MagnitudeScoringParameters parameters) {
        super(fieldName, boost);
        this.parameters = parameters;
    }

    /**
     * Get the parameters property: Parameter values for the magnitude scoring
     * function.
     *
     * @return the parameters value.
     */
    public MagnitudeScoringParameters getParameters() {
        return this.parameters;
    }
}
