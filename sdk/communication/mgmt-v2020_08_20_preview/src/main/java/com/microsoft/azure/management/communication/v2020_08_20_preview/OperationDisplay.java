/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.communication.v2020_08_20_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The object that describes a operation.
 */
public class OperationDisplay {
    /**
     * Friendly name of the resource provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Resource type on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * The localized friendly name for the operation.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * The localized friendly description for the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get friendly name of the resource provider.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set friendly name of the resource provider.
     *
     * @param provider the provider value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get resource type on which the operation is performed.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set resource type on which the operation is performed.
     *
     * @param resource the resource value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the localized friendly name for the operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the localized friendly name for the operation.
     *
     * @param operation the operation value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the localized friendly description for the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the localized friendly description for the operation.
     *
     * @param description the description value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

}
