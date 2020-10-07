// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.search.documents.indexes.models.EdgeNGramTokenFilterSide;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Generates n-grams of the given size(s) starting from the front or the back of an input token. This token filter is
 * implemented using Apache Lucene.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.EdgeNGramTokenFilterV2")
@JsonFlatten
@Fluent
public class EdgeNGramTokenFilterV2 extends TokenFilter {
    /*
     * The minimum n-gram length. Default is 1. Maximum is 300. Must be less
     * than the value of maxGram.
     */
    @JsonProperty(value = "minGram")
    private Integer minGram;

    /*
     * The maximum n-gram length. Default is 2. Maximum is 300.
     */
    @JsonProperty(value = "maxGram")
    private Integer maxGram;

    /*
     * Specifies which side of the input the n-gram should be generated from.
     * Default is "front".
     */
    @JsonProperty(value = "side")
    private EdgeNGramTokenFilterSide side;

    /**
     * Creates an instance of EdgeNGramTokenFilterV2 class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public EdgeNGramTokenFilterV2(@JsonProperty(value = "name", required = true) String name) {
        super(name);
    }

    /**
     * Get the minGram property: The minimum n-gram length. Default is 1. Maximum is 300. Must be less than the value of
     * maxGram.
     *
     * @return the minGram value.
     */
    public Integer getMinGram() {
        return this.minGram;
    }

    /**
     * Set the minGram property: The minimum n-gram length. Default is 1. Maximum is 300. Must be less than the value of
     * maxGram.
     *
     * @param minGram the minGram value to set.
     * @return the EdgeNGramTokenFilterV2 object itself.
     */
    public EdgeNGramTokenFilterV2 setMinGram(Integer minGram) {
        this.minGram = minGram;
        return this;
    }

    /**
     * Get the maxGram property: The maximum n-gram length. Default is 2. Maximum is 300.
     *
     * @return the maxGram value.
     */
    public Integer getMaxGram() {
        return this.maxGram;
    }

    /**
     * Set the maxGram property: The maximum n-gram length. Default is 2. Maximum is 300.
     *
     * @param maxGram the maxGram value to set.
     * @return the EdgeNGramTokenFilterV2 object itself.
     */
    public EdgeNGramTokenFilterV2 setMaxGram(Integer maxGram) {
        this.maxGram = maxGram;
        return this;
    }

    /**
     * Get the side property: Specifies which side of the input the n-gram should be generated from. Default is "front".
     *
     * @return the side value.
     */
    public EdgeNGramTokenFilterSide getSide() {
        return this.side;
    }

    /**
     * Set the side property: Specifies which side of the input the n-gram should be generated from. Default is "front".
     *
     * @param side the side value to set.
     * @return the EdgeNGramTokenFilterV2 object itself.
     */
    public EdgeNGramTokenFilterV2 setSide(EdgeNGramTokenFilterSide side) {
        this.side = side;
        return this;
    }
}
