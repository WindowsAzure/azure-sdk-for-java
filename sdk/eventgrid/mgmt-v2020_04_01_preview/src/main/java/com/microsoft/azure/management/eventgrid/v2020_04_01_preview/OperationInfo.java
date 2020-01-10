/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about an operation.
 */
public class OperationInfo {
    /**
     * Name of the provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Name of the resource type.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Name of the operation.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Description of the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get name of the provider.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set name of the provider.
     *
     * @param provider the provider value to set
     * @return the OperationInfo object itself.
     */
    public OperationInfo withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get name of the resource type.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set name of the resource type.
     *
     * @param resource the resource value to set
     * @return the OperationInfo object itself.
     */
    public OperationInfo withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get name of the operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set name of the operation.
     *
     * @param operation the operation value to set
     * @return the OperationInfo object itself.
     */
    public OperationInfo withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get description of the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the operation.
     *
     * @param description the description value to set
     * @return the OperationInfo object itself.
     */
    public OperationInfo withDescription(String description) {
        this.description = description;
        return this;
    }

}
