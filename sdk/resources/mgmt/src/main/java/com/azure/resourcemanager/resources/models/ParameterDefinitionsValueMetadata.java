// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The ParameterDefinitionsValueMetadata model. */
@Fluent
public final class ParameterDefinitionsValueMetadata {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ParameterDefinitionsValueMetadata.class);

    /*
     * The display name for the parameter.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description of the parameter.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * General metadata for the parameter.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the displayName property: The display name for the parameter.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the parameter.
     *
     * @param displayName the displayName value to set.
     * @return the ParameterDefinitionsValueMetadata object itself.
     */
    public ParameterDefinitionsValueMetadata withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description of the parameter.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the parameter.
     *
     * @param description the description value to set.
     * @return the ParameterDefinitionsValueMetadata object itself.
     */
    public ParameterDefinitionsValueMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the additionalProperties property: General metadata for the parameter.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: General metadata for the parameter.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ParameterDefinitionsValueMetadata object itself.
     */
    public ParameterDefinitionsValueMetadata withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
