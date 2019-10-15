/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_07_01.implementation;

import com.microsoft.azure.management.resources.v2019_07_01.DeploymentProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment operation parameters.
 */
public class DeploymentInner {
    /**
     * The location to store the deployment data.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The deployment properties.
     */
    @JsonProperty(value = "properties", required = true)
    private DeploymentProperties properties;

    /**
     * Get the location to store the deployment data.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location to store the deployment data.
     *
     * @param location the location value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the deployment properties.
     *
     * @return the properties value
     */
    public DeploymentProperties properties() {
        return this.properties;
    }

    /**
     * Set the deployment properties.
     *
     * @param properties the properties value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withProperties(DeploymentProperties properties) {
        this.properties = properties;
        return this;
    }

}
