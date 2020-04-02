// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.management.resources.DeploymentPropertiesExtended;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DeploymentExtended model.
 */
@Fluent
public final class DeploymentExtendedInner extends ProxyResource {
    /*
     * the location of the deployment.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Deployment properties.
     */
    @JsonProperty(value = "properties")
    private DeploymentPropertiesExtended properties;

    /**
     * Get the location property: the location of the deployment.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: the location of the deployment.
     * 
     * @param location the location value to set.
     * @return the DeploymentExtendedInner object itself.
     */
    public DeploymentExtendedInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the properties property: Deployment properties.
     * 
     * @return the properties value.
     */
    public DeploymentPropertiesExtended properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Deployment properties.
     * 
     * @param properties the properties value to set.
     * @return the DeploymentExtendedInner object itself.
     */
    public DeploymentExtendedInner withProperties(DeploymentPropertiesExtended properties) {
        this.properties = properties;
        return this;
    }
}
