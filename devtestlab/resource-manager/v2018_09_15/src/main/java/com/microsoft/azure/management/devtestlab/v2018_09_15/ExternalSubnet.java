/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subnet information as returned by the Microsoft.Network API.
 */
public class ExternalSubnet {
    /**
     * Gets or sets the identifier.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Gets or sets the name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get gets or sets the identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set gets or sets the identifier.
     *
     * @param id the id value to set
     * @return the ExternalSubnet object itself.
     */
    public ExternalSubnet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get gets or sets the name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets the name.
     *
     * @param name the name value to set
     * @return the ExternalSubnet object itself.
     */
    public ExternalSubnet withName(String name) {
        this.name = name;
        return this;
    }

}
