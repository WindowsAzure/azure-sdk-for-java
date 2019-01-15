/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Localized display text.
 */
public class ServiceOperationDisplay {
    /**
     * The localized resource provider name.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * The localized resource type name.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * The localized operation name.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * The localized operation description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the localized resource provider name.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the localized resource provider name.
     *
     * @param provider the provider value to set
     * @return the ServiceOperationDisplay object itself.
     */
    public ServiceOperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the localized resource type name.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the localized resource type name.
     *
     * @param resource the resource value to set
     * @return the ServiceOperationDisplay object itself.
     */
    public ServiceOperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the localized operation name.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the localized operation name.
     *
     * @param operation the operation value to set
     * @return the ServiceOperationDisplay object itself.
     */
    public ServiceOperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the localized operation description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the localized operation description.
     *
     * @param description the description value to set
     * @return the ServiceOperationDisplay object itself.
     */
    public ServiceOperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

}
