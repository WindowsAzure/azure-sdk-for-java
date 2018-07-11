/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devspaces.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.devspaces.v2018_06_01_preview.ResourceProviderOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResourceProviderOperationDefinitionInner model.
 */
public class ResourceProviderOperationDefinitionInner {
    /**
     * Resource provider operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The display property.
     */
    @JsonProperty(value = "display")
    private ResourceProviderOperationDisplay display;

    /**
     * Get resource provider operation name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set resource provider operation name.
     *
     * @param name the name value to set
     * @return the ResourceProviderOperationDefinitionInner object itself.
     */
    public ResourceProviderOperationDefinitionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display value.
     *
     * @return the display value
     */
    public ResourceProviderOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display value.
     *
     * @param display the display value to set
     * @return the ResourceProviderOperationDefinitionInner object itself.
     */
    public ResourceProviderOperationDefinitionInner withDisplay(ResourceProviderOperationDisplay display) {
        this.display = display;
        return this;
    }

}
