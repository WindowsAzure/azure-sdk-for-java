// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Changing set of properties, depending on the task type that is derived from the name field. */
@Fluent
public final class SecurityTaskParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecurityTaskParameters.class);

    /*
     * Name of the task type
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Changing set of properties, depending on the task type that is derived
     * from the name field
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the name property: Name of the task type.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the additionalProperties property: Changing set of properties, depending on the task type that is derived
     * from the name field.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Changing set of properties, depending on the task type that is derived
     * from the name field.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the SecurityTaskParameters object itself.
     */
    public SecurityTaskParameters withAdditionalProperties(Map<String, Object> additionalProperties) {
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
