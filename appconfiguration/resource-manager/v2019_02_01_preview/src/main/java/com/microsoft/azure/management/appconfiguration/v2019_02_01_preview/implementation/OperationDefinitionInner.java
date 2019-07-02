/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2019_02_01_preview.implementation;

import com.microsoft.azure.management.appconfiguration.v2019_02_01_preview.OperationDefinitionDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The definition of a configuration store operation.
 */
public class OperationDefinitionInner {
    /**
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The display information for the configuration store operation.
     */
    @JsonProperty(value = "display")
    private OperationDefinitionDisplay display;

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
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display information for the configuration store operation.
     *
     * @return the display value
     */
    public OperationDefinitionDisplay display() {
        return this.display;
    }

    /**
     * Set the display information for the configuration store operation.
     *
     * @param display the display value to set
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withDisplay(OperationDefinitionDisplay display) {
        this.display = display;
        return this;
    }

}
