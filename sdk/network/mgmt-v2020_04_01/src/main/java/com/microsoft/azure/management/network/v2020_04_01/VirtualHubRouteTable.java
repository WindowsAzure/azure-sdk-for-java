/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VirtualHub route table.
 */
public class VirtualHubRouteTable {
    /**
     * List of all routes.
     */
    @JsonProperty(value = "routes")
    private List<VirtualHubRoute> routes;

    /**
     * Get list of all routes.
     *
     * @return the routes value
     */
    public List<VirtualHubRoute> routes() {
        return this.routes;
    }

    /**
     * Set list of all routes.
     *
     * @param routes the routes value to set
     * @return the VirtualHubRouteTable object itself.
     */
    public VirtualHubRouteTable withRoutes(List<VirtualHubRoute> routes) {
        this.routes = routes;
        return this;
    }

}
