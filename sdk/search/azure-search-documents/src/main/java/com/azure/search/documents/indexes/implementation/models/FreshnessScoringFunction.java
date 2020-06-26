// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The FreshnessScoringFunction model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("freshness")
@Fluent
public final class FreshnessScoringFunction extends ScoringFunction {
    /*
     * Parameter values for the freshness scoring function.
     */
    @JsonProperty(value = "freshness", required = true)
    private FreshnessScoringParameters parameters;

    /**
     * Get the parameters property: Parameter values for the freshness scoring function.
     *
     * @return the parameters value.
     */
    public FreshnessScoringParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameter values for the freshness scoring function.
     *
     * @param parameters the parameters value to set.
     * @return the FreshnessScoringFunction object itself.
     */
    public FreshnessScoringFunction setParameters(FreshnessScoringParameters parameters) {
        this.parameters = parameters;
        return this;
    }
}
