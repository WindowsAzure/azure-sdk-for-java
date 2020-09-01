/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.resourcemanager.trafficmanager.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters supplied to check Traffic Manager name operation.
 */
public class CheckTrafficManagerRelativeDnsNameAvailabilityParameters {
    /**
     * The name of the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name of the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource.
     *
     * @param name the name value to set
     * @return the CheckTrafficManagerRelativeDnsNameAvailabilityParameters object itself.
     */
    public CheckTrafficManagerRelativeDnsNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the resource.
     *
     * @param type the type value to set
     * @return the CheckTrafficManagerRelativeDnsNameAvailabilityParameters object itself.
     */
    public CheckTrafficManagerRelativeDnsNameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

}
