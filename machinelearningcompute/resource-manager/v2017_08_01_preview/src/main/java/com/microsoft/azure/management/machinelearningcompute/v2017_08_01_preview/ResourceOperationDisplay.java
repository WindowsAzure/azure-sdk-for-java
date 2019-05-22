/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Display of the operation.
 */
public class ResourceOperationDisplay {
    /**
     * The resource provider name.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * The resource name.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * The operation.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * The description of the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the resource provider name.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the resource provider name.
     *
     * @param provider the provider value to set
     * @return the ResourceOperationDisplay object itself.
     */
    public ResourceOperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource name.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource name.
     *
     * @param resource the resource value to set
     * @return the ResourceOperationDisplay object itself.
     */
    public ResourceOperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation.
     *
     * @param operation the operation value to set
     * @return the ResourceOperationDisplay object itself.
     */
    public ResourceOperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description of the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the operation.
     *
     * @param description the description value to set
     * @return the ResourceOperationDisplay object itself.
     */
    public ResourceOperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

}
