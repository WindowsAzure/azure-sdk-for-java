/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01.implementation;

import com.microsoft.azure.management.resources.v2018_02_01.DeploymentPropertiesExtended;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment information.
 */
public class DeploymentExtendedInner {
    /**
     * The ID of the deployment.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The name of the deployment.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Deployment properties.
     */
    @JsonProperty(value = "properties")
    private DeploymentPropertiesExtended properties;

    /**
     * Get the ID of the deployment.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name of the deployment.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the deployment.
     *
     * @param name the name value to set
     * @return the DeploymentExtendedInner object itself.
     */
    public DeploymentExtendedInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get deployment properties.
     *
     * @return the properties value
     */
    public DeploymentPropertiesExtended properties() {
        return this.properties;
    }

    /**
     * Set deployment properties.
     *
     * @param properties the properties value to set
     * @return the DeploymentExtendedInner object itself.
     */
    public DeploymentExtendedInner withProperties(DeploymentPropertiesExtended properties) {
        this.properties = properties;
        return this;
    }

}
