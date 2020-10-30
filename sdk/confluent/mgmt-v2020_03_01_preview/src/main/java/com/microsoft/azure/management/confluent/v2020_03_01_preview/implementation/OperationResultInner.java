/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.confluent.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.confluent.v2020_03_01_preview.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Confluent REST API operation.
 */
public class OperationResultInner {
    /**
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The object that represents the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

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
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the object that represents the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the object that represents the operation.
     *
     * @param display the display value to set
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

}
