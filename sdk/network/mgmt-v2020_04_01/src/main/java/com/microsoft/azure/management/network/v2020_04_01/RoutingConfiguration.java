/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Routing Configuration indicating the associated and propagated route tables
 * for this connection.
 */
public class RoutingConfiguration {
    /**
     * The resource id RouteTable associated with this RoutingConfiguration.
     */
    @JsonProperty(value = "associatedRouteTable")
    private SubResource associatedRouteTable;

    /**
     * The list of RouteTables to advertise the routes to.
     */
    @JsonProperty(value = "propagatedRouteTables")
    private PropagatedRouteTable propagatedRouteTables;

    /**
     * List of routes that control routing from VirtualHub into a virtual
     * network connection.
     */
    @JsonProperty(value = "vnetRoutes")
    private VnetRoute vnetRoutes;

    /**
     * Get the resource id RouteTable associated with this RoutingConfiguration.
     *
     * @return the associatedRouteTable value
     */
    public SubResource associatedRouteTable() {
        return this.associatedRouteTable;
    }

    /**
     * Set the resource id RouteTable associated with this RoutingConfiguration.
     *
     * @param associatedRouteTable the associatedRouteTable value to set
     * @return the RoutingConfiguration object itself.
     */
    public RoutingConfiguration withAssociatedRouteTable(SubResource associatedRouteTable) {
        this.associatedRouteTable = associatedRouteTable;
        return this;
    }

    /**
     * Get the list of RouteTables to advertise the routes to.
     *
     * @return the propagatedRouteTables value
     */
    public PropagatedRouteTable propagatedRouteTables() {
        return this.propagatedRouteTables;
    }

    /**
     * Set the list of RouteTables to advertise the routes to.
     *
     * @param propagatedRouteTables the propagatedRouteTables value to set
     * @return the RoutingConfiguration object itself.
     */
    public RoutingConfiguration withPropagatedRouteTables(PropagatedRouteTable propagatedRouteTables) {
        this.propagatedRouteTables = propagatedRouteTables;
        return this;
    }

    /**
     * Get list of routes that control routing from VirtualHub into a virtual network connection.
     *
     * @return the vnetRoutes value
     */
    public VnetRoute vnetRoutes() {
        return this.vnetRoutes;
    }

    /**
     * Set list of routes that control routing from VirtualHub into a virtual network connection.
     *
     * @param vnetRoutes the vnetRoutes value to set
     * @return the RoutingConfiguration object itself.
     */
    public RoutingConfiguration withVnetRoutes(VnetRoute vnetRoutes) {
        this.vnetRoutes = vnetRoutes;
        return this;
    }

}
