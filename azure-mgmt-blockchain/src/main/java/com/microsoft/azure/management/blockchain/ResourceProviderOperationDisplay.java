/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.blockchain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation display payload which is exposed in the response of the resource
 * provider.
 */
public class ResourceProviderOperationDisplay {
    /**
     * Gets or sets the name of the provider for display purposes.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Gets or sets the name of the resource type for display purposes.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Gets or sets the name of the operation for display purposes.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Gets or sets the description of the provider for display purposes.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get gets or sets the name of the provider for display purposes.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set gets or sets the name of the provider for display purposes.
     *
     * @param provider the provider value to set
     * @return the ResourceProviderOperationDisplay object itself.
     */
    public ResourceProviderOperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get gets or sets the name of the resource type for display purposes.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set gets or sets the name of the resource type for display purposes.
     *
     * @param resource the resource value to set
     * @return the ResourceProviderOperationDisplay object itself.
     */
    public ResourceProviderOperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get gets or sets the name of the operation for display purposes.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set gets or sets the name of the operation for display purposes.
     *
     * @param operation the operation value to set
     * @return the ResourceProviderOperationDisplay object itself.
     */
    public ResourceProviderOperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get gets or sets the description of the provider for display purposes.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description of the provider for display purposes.
     *
     * @param description the description value to set
     * @return the ResourceProviderOperationDisplay object itself.
     */
    public ResourceProviderOperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

}
