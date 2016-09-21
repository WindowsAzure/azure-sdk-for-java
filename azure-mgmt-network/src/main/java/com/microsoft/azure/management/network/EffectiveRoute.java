/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import java.util.List;

/**
 * Effective Route.
 */
public class EffectiveRoute {
    /**
     * Gets the name of the user defined route. This is optional.
     */
    private String name;

    /**
     * Gets who created the route. Possible values include: 'Unknown', 'User',
     * 'VirtualNetworkGateway', 'Default'.
     */
    private EffectiveRouteSource source;

    /**
     * Gets value of effective route. Possible values include: 'Active',
     * 'Invalid'.
     */
    private EffectiveRouteState state;

    /**
     * Gets address prefixes of the effective routes in CIDR notation.
     */
    private List<String> addressPrefix;

    /**
     * Gets the IP address of the next hop of the effective route.
     */
    private List<String> nextHopIpAddress;

    /**
     * Gets or sets the type of Azure hop the packet should be sent to.
     * Possible values include: 'VirtualNetworkGateway', 'VnetLocal',
     * 'Internet', 'VirtualAppliance', 'None'.
     */
    private RouteNextHopType nextHopType;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public EffectiveRouteSource source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withSource(EffectiveRouteSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public EffectiveRouteState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withState(EffectiveRouteState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the addressPrefix value.
     *
     * @return the addressPrefix value
     */
    public List<String> addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix value.
     *
     * @param addressPrefix the addressPrefix value to set
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withAddressPrefix(List<String> addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the nextHopIpAddress value.
     *
     * @return the nextHopIpAddress value
     */
    public List<String> nextHopIpAddress() {
        return this.nextHopIpAddress;
    }

    /**
     * Set the nextHopIpAddress value.
     *
     * @param nextHopIpAddress the nextHopIpAddress value to set
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withNextHopIpAddress(List<String> nextHopIpAddress) {
        this.nextHopIpAddress = nextHopIpAddress;
        return this;
    }

    /**
     * Get the nextHopType value.
     *
     * @return the nextHopType value
     */
    public RouteNextHopType nextHopType() {
        return this.nextHopType;
    }

    /**
     * Set the nextHopType value.
     *
     * @param nextHopType the nextHopType value to set
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withNextHopType(RouteNextHopType nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }

}
