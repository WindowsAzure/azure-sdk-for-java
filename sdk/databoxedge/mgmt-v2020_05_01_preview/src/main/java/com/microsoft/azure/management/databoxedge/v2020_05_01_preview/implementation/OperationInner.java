/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation;

import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.OperationDisplay;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.ServiceSpecification;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Operations.
 */
@JsonFlatten
public class OperationInner {
    /**
     * Name of the operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Properties displayed for the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * Origin of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * Service specification.
     */
    @JsonProperty(value = "properties.serviceSpecification")
    private ServiceSpecification serviceSpecification;

    /**
     * Get name of the operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the operation.
     *
     * @param name the name value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get properties displayed for the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set properties displayed for the operation.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get origin of the operation.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set origin of the operation.
     *
     * @param origin the origin value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get service specification.
     *
     * @return the serviceSpecification value
     */
    public ServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set service specification.
     *
     * @param serviceSpecification the serviceSpecification value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withServiceSpecification(ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

}
