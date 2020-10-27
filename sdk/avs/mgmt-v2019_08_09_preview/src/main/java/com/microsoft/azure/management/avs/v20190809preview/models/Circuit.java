/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An ExpressRoute Circuit.
 */
public class Circuit {
    /**
     * CIDR of primary subnet.
     */
    @JsonProperty(value = "primarySubnet", access = JsonProperty.Access.WRITE_ONLY)
    private String primarySubnet;

    /**
     * CIDR of secondary subnet.
     */
    @JsonProperty(value = "secondarySubnet", access = JsonProperty.Access.WRITE_ONLY)
    private String secondarySubnet;

    /**
     * Identifier of the ExpressRoute (Microsoft Colo only).
     */
    @JsonProperty(value = "expressRouteID", access = JsonProperty.Access.WRITE_ONLY)
    private String expressRouteID;

    /**
     * Authorizations for the ExpressRoute (Microsoft Colo only).
     */
    @JsonProperty(value = "authorizations")
    private List<ExpressRouteAuthorization> authorizations;

    /**
     * ExpressRoute private peering identifier.
     */
    @JsonProperty(value = "expressRoutePrivatePeeringID", access = JsonProperty.Access.WRITE_ONLY)
    private String expressRoutePrivatePeeringID;

    /**
     * Get cIDR of primary subnet.
     *
     * @return the primarySubnet value
     */
    public String primarySubnet() {
        return this.primarySubnet;
    }

    /**
     * Get cIDR of secondary subnet.
     *
     * @return the secondarySubnet value
     */
    public String secondarySubnet() {
        return this.secondarySubnet;
    }

    /**
     * Get identifier of the ExpressRoute (Microsoft Colo only).
     *
     * @return the expressRouteID value
     */
    public String expressRouteID() {
        return this.expressRouteID;
    }

    /**
     * Get authorizations for the ExpressRoute (Microsoft Colo only).
     *
     * @return the authorizations value
     */
    public List<ExpressRouteAuthorization> authorizations() {
        return this.authorizations;
    }

    /**
     * Set authorizations for the ExpressRoute (Microsoft Colo only).
     *
     * @param authorizations the authorizations value to set
     * @return the Circuit object itself.
     */
    public Circuit withAuthorizations(List<ExpressRouteAuthorization> authorizations) {
        this.authorizations = authorizations;
        return this;
    }

    /**
     * Get expressRoute private peering identifier.
     *
     * @return the expressRoutePrivatePeeringID value
     */
    public String expressRoutePrivatePeeringID() {
        return this.expressRoutePrivatePeeringID;
    }

}
