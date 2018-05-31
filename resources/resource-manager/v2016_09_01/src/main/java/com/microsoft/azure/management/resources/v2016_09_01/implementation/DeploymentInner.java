/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_09_01.implementation;

import com.microsoft.azure.management.resources.v2016_09_01.DeploymentProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment operation parameters.
 */
public class DeploymentInner {
    /**
     * The deployment properties.
     */
    @JsonProperty(value = "properties", required = true)
    private DeploymentProperties properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public DeploymentProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withProperties(DeploymentProperties properties) {
        this.properties = properties;
        return this;
    }

}
