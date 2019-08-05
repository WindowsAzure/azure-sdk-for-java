/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.search.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines a function that boosts scores of documents with string values
 * matching a given list of tags.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("tag")
public class TagScoringFunction extends ScoringFunction {
    /**
     * Parameter values for the tag scoring function.
     */
    @JsonProperty(value = "tag", required = true)
    private TagScoringParameters parameters;

    /**
     * Get parameter values for the tag scoring function.
     *
     * @return the parameters value
     */
    public TagScoringParameters parameters() {
        return this.parameters;
    }

    /**
     * Set parameter values for the tag scoring function.
     *
     * @param parameters the parameters value to set
     * @return the TagScoringFunction object itself.
     */
    public TagScoringFunction withParameters(TagScoringParameters parameters) {
        this.parameters = parameters;
        return this;
    }

}
