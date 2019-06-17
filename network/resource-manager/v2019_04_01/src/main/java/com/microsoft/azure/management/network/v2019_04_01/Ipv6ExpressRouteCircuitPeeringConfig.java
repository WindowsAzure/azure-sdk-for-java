/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains IPv6 peering config.
 */
public class Ipv6ExpressRouteCircuitPeeringConfig {
    /**
     * The primary address prefix.
     */
    @JsonProperty(value = "primaryPeerAddressPrefix")
    private String primaryPeerAddressPrefix;

    /**
     * The secondary address prefix.
     */
    @JsonProperty(value = "secondaryPeerAddressPrefix")
    private String secondaryPeerAddressPrefix;

    /**
     * The Microsoft peering configuration.
     */
    @JsonProperty(value = "microsoftPeeringConfig")
    private ExpressRouteCircuitPeeringConfig microsoftPeeringConfig;

    /**
     * The reference of the RouteFilter resource.
     */
    @JsonProperty(value = "routeFilter")
    private SubResource routeFilter;

    /**
     * The state of peering. Possible values include: 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "state")
    private ExpressRouteCircuitPeeringState state;

    /**
     * Get the primary address prefix.
     *
     * @return the primaryPeerAddressPrefix value
     */
    public String primaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix;
    }

    /**
     * Set the primary address prefix.
     *
     * @param primaryPeerAddressPrefix the primaryPeerAddressPrefix value to set
     * @return the Ipv6ExpressRouteCircuitPeeringConfig object itself.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the secondary address prefix.
     *
     * @return the secondaryPeerAddressPrefix value
     */
    public String secondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix;
    }

    /**
     * Set the secondary address prefix.
     *
     * @param secondaryPeerAddressPrefix the secondaryPeerAddressPrefix value to set
     * @return the Ipv6ExpressRouteCircuitPeeringConfig object itself.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the Microsoft peering configuration.
     *
     * @return the microsoftPeeringConfig value
     */
    public ExpressRouteCircuitPeeringConfig microsoftPeeringConfig() {
        return this.microsoftPeeringConfig;
    }

    /**
     * Set the Microsoft peering configuration.
     *
     * @param microsoftPeeringConfig the microsoftPeeringConfig value to set
     * @return the Ipv6ExpressRouteCircuitPeeringConfig object itself.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig) {
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        return this;
    }

    /**
     * Get the reference of the RouteFilter resource.
     *
     * @return the routeFilter value
     */
    public SubResource routeFilter() {
        return this.routeFilter;
    }

    /**
     * Set the reference of the RouteFilter resource.
     *
     * @param routeFilter the routeFilter value to set
     * @return the Ipv6ExpressRouteCircuitPeeringConfig object itself.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig withRouteFilter(SubResource routeFilter) {
        this.routeFilter = routeFilter;
        return this;
    }

    /**
     * Get the state of peering. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the state value
     */
    public ExpressRouteCircuitPeeringState state() {
        return this.state;
    }

    /**
     * Set the state of peering. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param state the state value to set
     * @return the Ipv6ExpressRouteCircuitPeeringConfig object itself.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig withState(ExpressRouteCircuitPeeringState state) {
        this.state = state;
        return this;
    }

}
