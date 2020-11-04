// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EntitiesTaskParameters model.
 */
@Fluent
public final class EntitiesTaskParameters {
    /*
     * The model-version property.
     */
    @JsonProperty(value = "model-version")
    private String modelVersion;

    /*
     * The stringIndexType property.
     */
    @JsonProperty(value = "stringIndexType")
    private StringIndexTypeResponse stringIndexType;

    /**
     * Get the modelVersion property: The model-version property.
     * 
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion property: The model-version property.
     * 
     * @param modelVersion the modelVersion value to set.
     * @return the EntitiesTaskParameters object itself.
     */
    public EntitiesTaskParameters setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * Get the stringIndexType property: The stringIndexType property.
     * 
     * @return the stringIndexType value.
     */
    public StringIndexTypeResponse getStringIndexType() {
        return this.stringIndexType;
    }

    /**
     * Set the stringIndexType property: The stringIndexType property.
     * 
     * @param stringIndexType the stringIndexType value to set.
     * @return the EntitiesTaskParameters object itself.
     */
    public EntitiesTaskParameters setStringIndexType(StringIndexTypeResponse stringIndexType) {
        this.stringIndexType = stringIndexType;
        return this;
    }
}
