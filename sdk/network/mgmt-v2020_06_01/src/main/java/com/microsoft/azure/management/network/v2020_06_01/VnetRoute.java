/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of routes that control routing from VirtualHub into a virtual network
 * connection.
 */
public class VnetRoute {
    /**
     * List of all Static Routes.
     */
    @JsonProperty(value = "staticRoutes")
    private List<StaticRoute> staticRoutes;

    /**
     * Get list of all Static Routes.
     *
     * @return the staticRoutes value
     */
    public List<StaticRoute> staticRoutes() {
        return this.staticRoutes;
    }

    /**
     * Set list of all Static Routes.
     *
     * @param staticRoutes the staticRoutes value to set
     * @return the VnetRoute object itself.
     */
    public VnetRoute withStaticRoutes(List<StaticRoute> staticRoutes) {
        this.staticRoutes = staticRoutes;
        return this;
    }

}
