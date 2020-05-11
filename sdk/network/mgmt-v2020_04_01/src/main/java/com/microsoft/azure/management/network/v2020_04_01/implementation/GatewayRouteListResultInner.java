/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2020_04_01.GatewayRoute;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of virtual network gateway routes.
 */
public class GatewayRouteListResultInner {
    /**
     * List of gateway routes.
     */
    @JsonProperty(value = "value")
    private List<GatewayRoute> value;

    /**
     * Get list of gateway routes.
     *
     * @return the value value
     */
    public List<GatewayRoute> value() {
        return this.value;
    }

    /**
     * Set list of gateway routes.
     *
     * @param value the value value to set
     * @return the GatewayRouteListResultInner object itself.
     */
    public GatewayRouteListResultInner withValue(List<GatewayRoute> value) {
        this.value = value;
        return this;
    }

}
