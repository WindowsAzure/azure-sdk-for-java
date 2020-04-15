/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2018_02_14_preview.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Key Vault REST API operation definition.
 */
@JsonFlatten
public class Operation {
    /**
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Display metadata associated with the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * The origin of operations.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * One property of operation, include metric specifications.
     */
    @JsonProperty(value = "properties.serviceSpecification")
    private ServiceSpecification serviceSpecification;

    /**
     * Get operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set operation name: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set
     * @return the Operation object itself.
     */
    public Operation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get display metadata associated with the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set display metadata associated with the operation.
     *
     * @param display the display value to set
     * @return the Operation object itself.
     */
    public Operation withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin of operations.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin of operations.
     *
     * @param origin the origin value to set
     * @return the Operation object itself.
     */
    public Operation withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get one property of operation, include metric specifications.
     *
     * @return the serviceSpecification value
     */
    public ServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set one property of operation, include metric specifications.
     *
     * @param serviceSpecification the serviceSpecification value to set
     * @return the Operation object itself.
     */
    public Operation withServiceSpecification(ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

}
