/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The display information for a container registry operation.
 */
public class OperationDisplayDefinition {
    /**
     * The resource provider name: Microsoft.ContainerRegistry.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * The resource on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * The operation that users can perform.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * The description for the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the resource provider name: Microsoft.ContainerRegistry.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the resource provider name: Microsoft.ContainerRegistry.
     *
     * @param provider the provider value to set
     * @return the OperationDisplayDefinition object itself.
     */
    public OperationDisplayDefinition withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource on which the operation is performed.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource on which the operation is performed.
     *
     * @param resource the resource value to set
     * @return the OperationDisplayDefinition object itself.
     */
    public OperationDisplayDefinition withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation that users can perform.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation that users can perform.
     *
     * @param operation the operation value to set
     * @return the OperationDisplayDefinition object itself.
     */
    public OperationDisplayDefinition withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description for the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description for the operation.
     *
     * @param description the description value to set
     * @return the OperationDisplayDefinition object itself.
     */
    public OperationDisplayDefinition withDescription(String description) {
        this.description = description;
        return this;
    }

}
