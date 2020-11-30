// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.models.FeatureProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Previewed feature information. */
@Fluent
public final class FeatureResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FeatureResultInner.class);

    /*
     * The name of the feature.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Properties of the previewed feature.
     */
    @JsonProperty(value = "properties")
    private FeatureProperties properties;

    /*
     * The resource ID of the feature.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The resource type of the feature.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name property: The name of the feature.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the feature.
     *
     * @param name the name value to set.
     * @return the FeatureResultInner object itself.
     */
    public FeatureResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: Properties of the previewed feature.
     *
     * @return the properties value.
     */
    public FeatureProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the previewed feature.
     *
     * @param properties the properties value to set.
     * @return the FeatureResultInner object itself.
     */
    public FeatureResultInner withProperties(FeatureProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the id property: The resource ID of the feature.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The resource ID of the feature.
     *
     * @param id the id value to set.
     * @return the FeatureResultInner object itself.
     */
    public FeatureResultInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: The resource type of the feature.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type of the feature.
     *
     * @param type the type value to set.
     * @return the FeatureResultInner object itself.
     */
    public FeatureResultInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
