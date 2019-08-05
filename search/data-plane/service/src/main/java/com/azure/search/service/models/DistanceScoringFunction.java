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
 * Defines a function that boosts scores based on distance from a geographic
 * location.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("distance")
public class DistanceScoringFunction extends ScoringFunction {
    /**
     * Parameter values for the distance scoring function.
     */
    @JsonProperty(value = "distance", required = true)
    private DistanceScoringParameters parameters;

    /**
     * Get parameter values for the distance scoring function.
     *
     * @return the parameters value
     */
    public DistanceScoringParameters parameters() {
        return this.parameters;
    }

    /**
     * Set parameter values for the distance scoring function.
     *
     * @param parameters the parameters value to set
     * @return the DistanceScoringFunction object itself.
     */
    public DistanceScoringFunction withParameters(DistanceScoringParameters parameters) {
        this.parameters = parameters;
        return this;
    }

}
