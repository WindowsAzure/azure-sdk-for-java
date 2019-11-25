/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to VirtualNetworkGateway or LocalNetworkGateway resource.
 */
public class VirtualNetworkConnectionGatewayReference {
    /**
     * The ID of VirtualNetworkGateway or LocalNetworkGateway resource.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the ID of VirtualNetworkGateway or LocalNetworkGateway resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of VirtualNetworkGateway or LocalNetworkGateway resource.
     *
     * @param id the id value to set
     * @return the VirtualNetworkConnectionGatewayReference object itself.
     */
    public VirtualNetworkConnectionGatewayReference withId(String id) {
        this.id = id;
        return this;
    }

}
