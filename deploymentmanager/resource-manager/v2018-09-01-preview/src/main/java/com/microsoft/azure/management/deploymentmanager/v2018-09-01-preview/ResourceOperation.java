/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Individial resource operation information.
 */
public class ResourceOperation {
    /**
     * Name of the resource as specified in the artifacts. For ARM resources,
     * this is the name of the resource specified in the template.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /**
     * Unique identifier of the operation. For ARM resources, this is the
     * operationId obtained from ARM service.
     */
    @JsonProperty(value = "operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /**
     * Type of the resource as specified in the artifacts. For ARM resources,
     * this is the type of the resource specified in the template.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * State of the resource deployment. For ARM resources, this is the current
     * provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Descriptive information of the resource operation.
     */
    @JsonProperty(value = "statusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String statusMessage;

    /**
     * Http status code of the operation.
     */
    @JsonProperty(value = "statusCode", access = JsonProperty.Access.WRITE_ONLY)
    private String statusCode;

    /**
     * Get name of the resource as specified in the artifacts. For ARM resources, this is the name of the resource specified in the template.
     *
     * @return the resourceName value
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set name of the resource as specified in the artifacts. For ARM resources, this is the name of the resource specified in the template.
     *
     * @param resourceName the resourceName value to set
     * @return the ResourceOperation object itself.
     */
    public ResourceOperation withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get unique identifier of the operation. For ARM resources, this is the operationId obtained from ARM service.
     *
     * @return the operationId value
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Get type of the resource as specified in the artifacts. For ARM resources, this is the type of the resource specified in the template.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set type of the resource as specified in the artifacts. For ARM resources, this is the type of the resource specified in the template.
     *
     * @param resourceType the resourceType value to set
     * @return the ResourceOperation object itself.
     */
    public ResourceOperation withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get state of the resource deployment. For ARM resources, this is the current provisioning state of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get descriptive information of the resource operation.
     *
     * @return the statusMessage value
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Get http status code of the operation.
     *
     * @return the statusCode value
     */
    public String statusCode() {
        return this.statusCode;
    }

}
