// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Application Insights apps that were part of the metadata request and that the user has access to. */
@Fluent
public final class MetadataApplication {
    /*
     * The ID of the Application Insights app.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The ARM resource ID of the Application Insights app.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /*
     * The name of the Application Insights app.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The Azure region of the Application Insights app.
     */
    @JsonProperty(value = "region", required = true)
    private String region;

    /*
     * The related metadata items for the Application Insights app.
     */
    @JsonProperty(value = "related")
    private MetadataApplicationRelated related;

    /**
     * Creates an instance of MetadataApplication class.
     *
     * @param id the id value to set.
     * @param resourceId the resourceId value to set.
     * @param name the name value to set.
     * @param region the region value to set.
     */
    @JsonCreator
    public MetadataApplication(
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "resourceId", required = true) String resourceId,
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "region", required = true) String region) {
        this.id = id;
        this.resourceId = resourceId;
        this.name = name;
        this.region = region;
    }

    /**
     * Get the id property: The ID of the Application Insights app.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the resourceId property: The ARM resource ID of the Application Insights app.
     *
     * @return the resourceId value.
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Get the name property: The name of the Application Insights app.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the region property: The Azure region of the Application Insights app.
     *
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Get the related property: The related metadata items for the Application Insights app.
     *
     * @return the related value.
     */
    public MetadataApplicationRelated getRelated() {
        return this.related;
    }

    /**
     * Set the related property: The related metadata items for the Application Insights app.
     *
     * @param related the related value to set.
     * @return the MetadataApplication object itself.
     */
    public MetadataApplication setRelated(MetadataApplicationRelated related) {
        this.related = related;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getId() == null) {
            throw new IllegalArgumentException("Missing required property id in model MetadataApplication");
        }
        if (getResourceId() == null) {
            throw new IllegalArgumentException("Missing required property resourceId in model MetadataApplication");
        }
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model MetadataApplication");
        }
        if (getRegion() == null) {
            throw new IllegalArgumentException("Missing required property region in model MetadataApplication");
        }
        if (getRelated() != null) {
            getRelated().validate();
        }
    }
}
