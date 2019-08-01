/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import com.microsoft.azure.management.devtestlabs.v2018_09_15.OperationMetadataDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The REST API operation supported by DevTestLab ResourceProvider.
 */
public class OperationMetadataInner {
    /**
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The object that describes the operations.
     */
    @JsonProperty(value = "display")
    private OperationMetadataDisplay display;

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
     * @return the OperationMetadataInner object itself.
     */
    public OperationMetadataInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the object that describes the operations.
     *
     * @return the display value
     */
    public OperationMetadataDisplay display() {
        return this.display;
    }

    /**
     * Set the object that describes the operations.
     *
     * @param display the display value to set
     * @return the OperationMetadataInner object itself.
     */
    public OperationMetadataInner withDisplay(OperationMetadataDisplay display) {
        this.display = display;
        return this;
    }

}
