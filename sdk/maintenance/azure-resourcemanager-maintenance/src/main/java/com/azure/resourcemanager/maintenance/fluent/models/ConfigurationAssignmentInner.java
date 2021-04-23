// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration Assignment. */
@JsonFlatten
@Fluent
public class ConfigurationAssignmentInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConfigurationAssignmentInner.class);

    /*
     * Location of the resource
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The maintenance configuration Id
     */
    @JsonProperty(value = "properties.maintenanceConfigurationId")
    private String maintenanceConfigurationId;

    /*
     * The unique resourceId
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /**
     * Get the location property: Location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location of the resource.
     *
     * @param location the location value to set.
     * @return the ConfigurationAssignmentInner object itself.
     */
    public ConfigurationAssignmentInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the maintenanceConfigurationId property: The maintenance configuration Id.
     *
     * @return the maintenanceConfigurationId value.
     */
    public String maintenanceConfigurationId() {
        return this.maintenanceConfigurationId;
    }

    /**
     * Set the maintenanceConfigurationId property: The maintenance configuration Id.
     *
     * @param maintenanceConfigurationId the maintenanceConfigurationId value to set.
     * @return the ConfigurationAssignmentInner object itself.
     */
    public ConfigurationAssignmentInner withMaintenanceConfigurationId(String maintenanceConfigurationId) {
        this.maintenanceConfigurationId = maintenanceConfigurationId;
        return this;
    }

    /**
     * Get the resourceId property: The unique resourceId.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The unique resourceId.
     *
     * @param resourceId the resourceId value to set.
     * @return the ConfigurationAssignmentInner object itself.
     */
    public ConfigurationAssignmentInner withResourceId(String resourceId) {
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
