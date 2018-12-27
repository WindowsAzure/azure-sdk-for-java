/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Display metadata associated with the operation.
 */
public class OperationDisplay {
    /**
     * Service provider: Microsoft Network.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Resource on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Type of the operation: get, read, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Description of the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get service provider: Microsoft Network.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set service provider: Microsoft Network.
     *
     * @param provider the provider value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get resource on which the operation is performed.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set resource on which the operation is performed.
     *
     * @param resource the resource value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get type of the operation: get, read, delete, etc.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set type of the operation: get, read, delete, etc.
     *
     * @param operation the operation value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
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
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

}
