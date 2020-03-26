// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.resources.DeploymentOperationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DeploymentOperation model.
 */
@Fluent
public final class DeploymentOperationInner {
    /*
     * Full deployment operation ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Deployment operation ID.
     */
    @JsonProperty(value = "operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /*
     * Deployment properties.
     */
    @JsonProperty(value = "properties")
    private DeploymentOperationProperties properties;

    /**
     * Get the id property: Full deployment operation ID.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the operationId property: Deployment operation ID.
     * 
     * @return the operationId value.
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Get the properties property: Deployment properties.
     * 
     * @return the properties value.
     */
    public DeploymentOperationProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Deployment properties.
     * 
     * @param properties the properties value to set.
     * @return the DeploymentOperationInner object itself.
     */
    public DeploymentOperationInner setProperties(DeploymentOperationProperties properties) {
        this.properties = properties;
        return this;
    }
}
