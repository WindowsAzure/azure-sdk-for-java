// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The HealthcareEntity model.
 */
@Fluent
public final class HealthcareEntity extends Entity {
    /*
     * The isNegated property.
     */
    @JsonProperty(value = "isNegated", required = true)
    private boolean isNegated;

    /*
     * Entity references in known data sources.
     */
    @JsonProperty(value = "links")
    private List<HealthcareEntityLink> links;

    /**
     * Get the isNegated property: The isNegated property.
     * 
     * @return the isNegated value.
     */
    public boolean isNegated() {
        return this.isNegated;
    }

    /**
     * Set the isNegated property: The isNegated property.
     * 
     * @param isNegated the isNegated value to set.
     * @return the HealthcareEntity object itself.
     */
    public HealthcareEntity setIsNegated(boolean isNegated) {
        this.isNegated = isNegated;
        return this;
    }

    /**
     * Get the links property: Entity references in known data sources.
     * 
     * @return the links value.
     */
    public List<HealthcareEntityLink> getLinks() {
        return this.links;
    }

    /**
     * Set the links property: Entity references in known data sources.
     * 
     * @param links the links value to set.
     * @return the HealthcareEntity object itself.
     */
    public HealthcareEntity setLinks(List<HealthcareEntityLink> links) {
        this.links = links;
        return this;
    }
}
