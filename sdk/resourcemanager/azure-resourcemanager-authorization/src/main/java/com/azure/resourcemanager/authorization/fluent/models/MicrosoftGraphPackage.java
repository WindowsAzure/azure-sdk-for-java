// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** package. */
@Fluent
public final class MicrosoftGraphPackage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphPackage.class);

    /*
     * A string indicating the type of package. While oneNote is the only
     * currently defined value, you should expect other package types to be
     * returned and handle them accordingly.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * package
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the type property: A string indicating the type of package. While oneNote is the only currently defined
     * value, you should expect other package types to be returned and handle them accordingly.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: A string indicating the type of package. While oneNote is the only currently defined
     * value, you should expect other package types to be returned and handle them accordingly.
     *
     * @param type the type value to set.
     * @return the MicrosoftGraphPackage object itself.
     */
    public MicrosoftGraphPackage withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the additionalProperties property: package.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: package.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPackage object itself.
     */
    public MicrosoftGraphPackage withAdditionalProperties(Map<String, Object> additionalProperties) {
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
