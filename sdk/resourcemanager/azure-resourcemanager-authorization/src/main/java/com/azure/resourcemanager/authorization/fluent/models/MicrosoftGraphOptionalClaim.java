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
import java.util.List;
import java.util.Map;

/** optionalClaim. */
@Fluent
public final class MicrosoftGraphOptionalClaim {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphOptionalClaim.class);

    /*
     * Additional properties of the claim. If a property exists in this
     * collection, it modifies the behavior of the optional claim specified in
     * the name property.
     */
    @JsonProperty(value = "additionalProperties")
    private List<String> additionalPropertiesProperty;

    /*
     * If the value is true, the claim specified by the client is necessary to
     * ensure a smooth authorization experience for the specific task requested
     * by the end user. The default value is false.
     */
    @JsonProperty(value = "essential")
    private Boolean essential;

    /*
     * The name of the optional claim.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The source (directory object) of the claim. There are predefined claims
     * and user-defined claims from extension properties. If the source value
     * is null, the claim is a predefined optional claim. If the source value
     * is user, the value in the name property is the extension property from
     * the user object.
     */
    @JsonProperty(value = "source")
    private String source;

    /*
     * optionalClaim
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the additionalPropertiesProperty property: Additional properties of the claim. If a property exists in this
     * collection, it modifies the behavior of the optional claim specified in the name property.
     *
     * @return the additionalPropertiesProperty value.
     */
    public List<String> additionalPropertiesProperty() {
        return this.additionalPropertiesProperty;
    }

    /**
     * Set the additionalPropertiesProperty property: Additional properties of the claim. If a property exists in this
     * collection, it modifies the behavior of the optional claim specified in the name property.
     *
     * @param additionalPropertiesProperty the additionalPropertiesProperty value to set.
     * @return the MicrosoftGraphOptionalClaim object itself.
     */
    public MicrosoftGraphOptionalClaim withAdditionalPropertiesProperty(List<String> additionalPropertiesProperty) {
        this.additionalPropertiesProperty = additionalPropertiesProperty;
        return this;
    }

    /**
     * Get the essential property: If the value is true, the claim specified by the client is necessary to ensure a
     * smooth authorization experience for the specific task requested by the end user. The default value is false.
     *
     * @return the essential value.
     */
    public Boolean essential() {
        return this.essential;
    }

    /**
     * Set the essential property: If the value is true, the claim specified by the client is necessary to ensure a
     * smooth authorization experience for the specific task requested by the end user. The default value is false.
     *
     * @param essential the essential value to set.
     * @return the MicrosoftGraphOptionalClaim object itself.
     */
    public MicrosoftGraphOptionalClaim withEssential(Boolean essential) {
        this.essential = essential;
        return this;
    }

    /**
     * Get the name property: The name of the optional claim.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the optional claim.
     *
     * @param name the name value to set.
     * @return the MicrosoftGraphOptionalClaim object itself.
     */
    public MicrosoftGraphOptionalClaim withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the source property: The source (directory object) of the claim. There are predefined claims and user-defined
     * claims from extension properties. If the source value is null, the claim is a predefined optional claim. If the
     * source value is user, the value in the name property is the extension property from the user object.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: The source (directory object) of the claim. There are predefined claims and user-defined
     * claims from extension properties. If the source value is null, the claim is a predefined optional claim. If the
     * source value is user, the value in the name property is the extension property from the user object.
     *
     * @param source the source value to set.
     * @return the MicrosoftGraphOptionalClaim object itself.
     */
    public MicrosoftGraphOptionalClaim withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the additionalProperties property: optionalClaim.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: optionalClaim.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOptionalClaim object itself.
     */
    public MicrosoftGraphOptionalClaim withAdditionalProperties(Map<String, Object> additionalProperties) {
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
