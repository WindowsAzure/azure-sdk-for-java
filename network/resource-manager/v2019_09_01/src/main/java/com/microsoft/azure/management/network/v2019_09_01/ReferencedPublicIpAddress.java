/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reference to a public IP address.
 */
public class ReferencedPublicIpAddress {
    /**
     * The PublicIPAddress Reference.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the PublicIPAddress Reference.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the PublicIPAddress Reference.
     *
     * @param id the id value to set
     * @return the ReferencedPublicIpAddress object itself.
     */
    public ReferencedPublicIpAddress withId(String id) {
        this.id = id;
        return this;
    }

}
