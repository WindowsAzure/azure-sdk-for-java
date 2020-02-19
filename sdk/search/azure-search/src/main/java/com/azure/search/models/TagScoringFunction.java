// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines a function that boosts scores of documents with string values
 * matching a given list of tags.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("tag")
@Fluent
public final class TagScoringFunction extends ScoringFunction {
    /*
     * Parameter values for the tag scoring function.
     */
    @JsonProperty(value = "tag", required = true)
    private TagScoringParameters parameters;

    /**
     * Get the parameters property: Parameter values for the tag scoring
     * function.
     *
     * @return the parameters value.
     */
    public TagScoringParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameter values for the tag scoring
     * function.
     *
     * @param parameters the parameters value to set.
     * @return the TagScoringFunction object itself.
     */
    public TagScoringFunction setParameters(TagScoringParameters parameters) {
        this.parameters = parameters;
        return this;
    }
}
