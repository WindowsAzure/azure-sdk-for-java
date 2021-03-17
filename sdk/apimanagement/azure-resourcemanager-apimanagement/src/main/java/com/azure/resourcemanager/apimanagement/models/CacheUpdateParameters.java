// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cache update details. */
@JsonFlatten
@Fluent
public class CacheUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CacheUpdateParameters.class);

    /*
     * Cache description
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Runtime connection string to cache
     */
    @JsonProperty(value = "properties.connectionString")
    private String connectionString;

    /*
     * Location identifier to use cache from (should be either 'default' or
     * valid Azure region identifier)
     */
    @JsonProperty(value = "properties.useFromLocation")
    private String useFromLocation;

    /*
     * Original uri of entity in external system cache points to
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /**
     * Get the description property: Cache description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Cache description.
     *
     * @param description the description value to set.
     * @return the CacheUpdateParameters object itself.
     */
    public CacheUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the connectionString property: Runtime connection string to cache.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: Runtime connection string to cache.
     *
     * @param connectionString the connectionString value to set.
     * @return the CacheUpdateParameters object itself.
     */
    public CacheUpdateParameters withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the useFromLocation property: Location identifier to use cache from (should be either 'default' or valid
     * Azure region identifier).
     *
     * @return the useFromLocation value.
     */
    public String useFromLocation() {
        return this.useFromLocation;
    }

    /**
     * Set the useFromLocation property: Location identifier to use cache from (should be either 'default' or valid
     * Azure region identifier).
     *
     * @param useFromLocation the useFromLocation value to set.
     * @return the CacheUpdateParameters object itself.
     */
    public CacheUpdateParameters withUseFromLocation(String useFromLocation) {
        this.useFromLocation = useFromLocation;
        return this;
    }

    /**
     * Get the resourceId property: Original uri of entity in external system cache points to.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Original uri of entity in external system cache points to.
     *
     * @param resourceId the resourceId value to set.
     * @return the CacheUpdateParameters object itself.
     */
    public CacheUpdateParameters withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
