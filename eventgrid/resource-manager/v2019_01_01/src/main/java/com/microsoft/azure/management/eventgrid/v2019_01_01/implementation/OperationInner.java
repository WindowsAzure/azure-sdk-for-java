/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_01_01.implementation;

import com.microsoft.azure.management.eventgrid.v2019_01_01.OperationInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an operation returned by the GetOperations request.
 */
public class OperationInner {
    /**
     * Name of the operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Display name of the operation.
     */
    @JsonProperty(value = "display")
    private OperationInfo display;

    /**
     * Origin of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * Properties of the operation.
     */
    @JsonProperty(value = "properties")
    private Object properties;

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
     * Get display name of the operation.
     *
     * @return the display value
     */
    public OperationInfo display() {
        return this.display;
    }

    /**
     * Set display name of the operation.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationInfo display) {
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
     * Get properties of the operation.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set properties of the operation.
     *
     * @param properties the properties value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

}
