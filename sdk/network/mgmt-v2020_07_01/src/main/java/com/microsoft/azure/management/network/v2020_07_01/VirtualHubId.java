/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Virtual Hub identifier.
 */
public class VirtualHubId {
    /**
     * The resource URI for the Virtual Hub where the ExpressRoute gateway is
     * or will be deployed. The Virtual Hub resource and the ExpressRoute
     * gateway resource reside in the same subscription.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the resource URI for the Virtual Hub where the ExpressRoute gateway is or will be deployed. The Virtual Hub resource and the ExpressRoute gateway resource reside in the same subscription.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the resource URI for the Virtual Hub where the ExpressRoute gateway is or will be deployed. The Virtual Hub resource and the ExpressRoute gateway resource reside in the same subscription.
     *
     * @param id the id value to set
     * @return the VirtualHubId object itself.
     */
    public VirtualHubId withId(String id) {
        this.id = id;
        return this;
    }

}
