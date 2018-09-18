/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation Display Resource object.
 */
public class OperationDisplayResource {
    /**
     * Operation Display Resource Provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Operation Display Resource.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Operation Display Resource Operation.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Operation Display Resource Description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get operation Display Resource Provider.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set operation Display Resource Provider.
     *
     * @param provider the provider value to set
     * @return the OperationDisplayResource object itself.
     */
    public OperationDisplayResource withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get operation Display Resource.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set operation Display Resource.
     *
     * @param resource the resource value to set
     * @return the OperationDisplayResource object itself.
     */
    public OperationDisplayResource withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get operation Display Resource Operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set operation Display Resource Operation.
     *
     * @param operation the operation value to set
     * @return the OperationDisplayResource object itself.
     */
    public OperationDisplayResource withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get operation Display Resource Description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set operation Display Resource Description.
     *
     * @param description the description value to set
     * @return the OperationDisplayResource object itself.
     */
    public OperationDisplayResource withDescription(String description) {
        this.description = description;
        return this;
    }

}
