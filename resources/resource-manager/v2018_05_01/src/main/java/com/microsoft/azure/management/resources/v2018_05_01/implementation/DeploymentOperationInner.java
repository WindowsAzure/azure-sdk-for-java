/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_05_01.implementation;

import com.microsoft.azure.management.resources.v2018_05_01.DeploymentOperationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment operation information.
 */
public class DeploymentOperationInner {
    /**
     * Full deployment operation ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Deployment operation ID.
     */
    @JsonProperty(value = "operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /**
     * Deployment properties.
     */
    @JsonProperty(value = "properties")
    private DeploymentOperationProperties properties;

    /**
     * Get full deployment operation ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get deployment operation ID.
     *
     * @return the operationId value
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Get deployment properties.
     *
     * @return the properties value
     */
    public DeploymentOperationProperties properties() {
        return this.properties;
    }

    /**
     * Set deployment properties.
     *
     * @param properties the properties value to set
     * @return the DeploymentOperationInner object itself.
     */
    public DeploymentOperationInner withProperties(DeploymentOperationProperties properties) {
        this.properties = properties;
        return this;
    }

}
