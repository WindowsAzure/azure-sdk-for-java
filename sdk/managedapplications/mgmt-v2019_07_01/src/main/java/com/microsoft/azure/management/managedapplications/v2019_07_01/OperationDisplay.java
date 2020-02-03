/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The object that represents the operation.
 */
public class OperationDisplay {
    /**
     * Service provider: Microsoft.Solutions.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Resource on which the operation is performed: Application, JitRequest,
     * etc.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Operation type: Read, write, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Get service provider: Microsoft.Solutions.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set service provider: Microsoft.Solutions.
     *
     * @param provider the provider value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get resource on which the operation is performed: Application, JitRequest, etc.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set resource on which the operation is performed: Application, JitRequest, etc.
     *
     * @param resource the resource value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get operation type: Read, write, delete, etc.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set operation type: Read, write, delete, etc.
     *
     * @param operation the operation value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

}
