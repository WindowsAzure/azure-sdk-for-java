// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** System generated entities. */
@Fluent
public final class PredictionSystemGeneratedEntities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PredictionSystemGeneratedEntities.class);

    /*
     * Generated interaction types.
     */
    @JsonProperty(value = "generatedInteractionTypes")
    private List<String> generatedInteractionTypes;

    /*
     * Generated links.
     */
    @JsonProperty(value = "generatedLinks")
    private List<String> generatedLinks;

    /*
     * Generated KPIs.
     */
    @JsonProperty(value = "generatedKpis")
    private Map<String, String> generatedKpis;

    /**
     * Get the generatedInteractionTypes property: Generated interaction types.
     *
     * @return the generatedInteractionTypes value.
     */
    public List<String> generatedInteractionTypes() {
        return this.generatedInteractionTypes;
    }

    /**
     * Set the generatedInteractionTypes property: Generated interaction types.
     *
     * @param generatedInteractionTypes the generatedInteractionTypes value to set.
     * @return the PredictionSystemGeneratedEntities object itself.
     */
    public PredictionSystemGeneratedEntities withGeneratedInteractionTypes(List<String> generatedInteractionTypes) {
        this.generatedInteractionTypes = generatedInteractionTypes;
        return this;
    }

    /**
     * Get the generatedLinks property: Generated links.
     *
     * @return the generatedLinks value.
     */
    public List<String> generatedLinks() {
        return this.generatedLinks;
    }

    /**
     * Set the generatedLinks property: Generated links.
     *
     * @param generatedLinks the generatedLinks value to set.
     * @return the PredictionSystemGeneratedEntities object itself.
     */
    public PredictionSystemGeneratedEntities withGeneratedLinks(List<String> generatedLinks) {
        this.generatedLinks = generatedLinks;
        return this;
    }

    /**
     * Get the generatedKpis property: Generated KPIs.
     *
     * @return the generatedKpis value.
     */
    public Map<String, String> generatedKpis() {
        return this.generatedKpis;
    }

    /**
     * Set the generatedKpis property: Generated KPIs.
     *
     * @param generatedKpis the generatedKpis value to set.
     * @return the PredictionSystemGeneratedEntities object itself.
     */
    public PredictionSystemGeneratedEntities withGeneratedKpis(Map<String, String> generatedKpis) {
        this.generatedKpis = generatedKpis;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
