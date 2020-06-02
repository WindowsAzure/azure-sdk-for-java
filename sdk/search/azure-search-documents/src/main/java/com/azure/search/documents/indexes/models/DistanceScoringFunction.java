// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines a function that boosts scores based on distance from a geographic
 * location.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("distance")
@Fluent
public final class DistanceScoringFunction extends ScoringFunction {
    /*
     * Parameter values for the distance scoring function.
     */
    @JsonProperty(value = "distance", required = true)
    private DistanceScoringParameters parameters;

    /**
     * Get the parameters property: Parameter values for the distance scoring
     * function.
     *
     * @return the parameters value.
     */
    public DistanceScoringParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameter values for the distance scoring
     * function.
     *
     * @param parameters the parameters value to set.
     * @return the DistanceScoringFunction object itself.
     */
    public DistanceScoringFunction setParameters(DistanceScoringParameters parameters) {
        this.parameters = parameters;
        return this;
    }
}
