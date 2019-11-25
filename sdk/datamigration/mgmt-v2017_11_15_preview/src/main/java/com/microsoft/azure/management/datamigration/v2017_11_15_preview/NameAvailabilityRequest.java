/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A resource type and proposed name.
 */
public class NameAvailabilityRequest {
    /**
     * The proposed resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The resource type chain (e.g. virtualMachines/extensions).
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the proposed resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the proposed resource name.
     *
     * @param name the name value to set
     * @return the NameAvailabilityRequest object itself.
     */
    public NameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resource type chain (e.g. virtualMachines/extensions).
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the resource type chain (e.g. virtualMachines/extensions).
     *
     * @param type the type value to set
     * @return the NameAvailabilityRequest object itself.
     */
    public NameAvailabilityRequest withType(String type) {
        this.type = type;
        return this;
    }

}
