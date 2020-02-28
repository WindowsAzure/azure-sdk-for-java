/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the information necessary to perform a resource move (rename).
 */
public class ResourceMoveDefinition {
    /**
     * The target ID for the resource.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the target ID for the resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the target ID for the resource.
     *
     * @param id the id value to set
     * @return the ResourceMoveDefinition object itself.
     */
    public ResourceMoveDefinition withId(String id) {
        this.id = id;
        return this;
    }

}
