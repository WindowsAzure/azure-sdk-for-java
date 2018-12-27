/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import com.microsoft.azure.management.network.v2018_05_01.NextHopType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The information about next hop from the specified VM.
 */
public class NextHopResultInner {
    /**
     * Next hop type. Possible values include: 'Internet', 'VirtualAppliance',
     * 'VirtualNetworkGateway', 'VnetLocal', 'HyperNetGateway', 'None'.
     */
    @JsonProperty(value = "nextHopType")
    private NextHopType nextHopType;

    /**
     * Next hop IP Address.
     */
    @JsonProperty(value = "nextHopIpAddress")
    private String nextHopIpAddress;

    /**
     * The resource identifier for the route table associated with the route
     * being returned. If the route being returned does not correspond to any
     * user created routes then this field will be the string 'System Route'.
     */
    @JsonProperty(value = "routeTableId")
    private String routeTableId;

    /**
     * Get next hop type. Possible values include: 'Internet', 'VirtualAppliance', 'VirtualNetworkGateway', 'VnetLocal', 'HyperNetGateway', 'None'.
     *
     * @return the nextHopType value
     */
    public NextHopType nextHopType() {
        return this.nextHopType;
    }

    /**
     * Set next hop type. Possible values include: 'Internet', 'VirtualAppliance', 'VirtualNetworkGateway', 'VnetLocal', 'HyperNetGateway', 'None'.
     *
     * @param nextHopType the nextHopType value to set
     * @return the NextHopResultInner object itself.
     */
    public NextHopResultInner withNextHopType(NextHopType nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }

    /**
     * Get next hop IP Address.
     *
     * @return the nextHopIpAddress value
     */
    public String nextHopIpAddress() {
        return this.nextHopIpAddress;
    }

    /**
     * Set next hop IP Address.
     *
     * @param nextHopIpAddress the nextHopIpAddress value to set
     * @return the NextHopResultInner object itself.
     */
    public NextHopResultInner withNextHopIpAddress(String nextHopIpAddress) {
        this.nextHopIpAddress = nextHopIpAddress;
        return this;
    }

    /**
     * Get the resource identifier for the route table associated with the route being returned. If the route being returned does not correspond to any user created routes then this field will be the string 'System Route'.
     *
     * @return the routeTableId value
     */
    public String routeTableId() {
        return this.routeTableId;
    }

    /**
     * Set the resource identifier for the route table associated with the route being returned. If the route being returned does not correspond to any user created routes then this field will be the string 'System Route'.
     *
     * @param routeTableId the routeTableId value to set
     * @return the NextHopResultInner object itself.
     */
    public NextHopResultInner withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

}
