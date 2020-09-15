// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.search.documents.indexes.models.TagScoringParameters;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The TagScoringFunction model. */
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
     * Creates an instance of TagScoringFunction class.
     *
     * @param fieldName the fieldName value to set.
     * @param boost the boost value to set.
     * @param parameters the parameters value to set.
     */
    @JsonCreator
    public TagScoringFunction(
            @JsonProperty(value = "fieldName", required = true) String fieldName,
            @JsonProperty(value = "boost", required = true) double boost,
            @JsonProperty(value = "tag", required = true) TagScoringParameters parameters) {
        super(fieldName, boost);
        this.parameters = parameters;
    }

    /**
     * Get the parameters property: Parameter values for the tag scoring function.
     *
     * @return the parameters value.
     */
    public TagScoringParameters getParameters() {
        return this.parameters;
    }
}
