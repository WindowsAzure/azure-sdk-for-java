// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExpressRouteCircuitPeeringConfig model. */
@Fluent
public final class ExpressRouteCircuitPeeringConfig {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitPeeringConfig.class);

    /*
     * The reference of AdvertisedPublicPrefixes.
     */
    @JsonProperty(value = "advertisedPublicPrefixes")
    private List<String> advertisedPublicPrefixes;

    /*
     * The communities of bgp peering. Specified for microsoft peering.
     */
    @JsonProperty(value = "advertisedCommunities")
    private List<String> advertisedCommunities;

    /*
     * The advertised public prefix state of the Peering resource.
     */
    @JsonProperty(value = "advertisedPublicPrefixesState")
    private ExpressRouteCircuitPeeringAdvertisedPublicPrefixState advertisedPublicPrefixesState;

    /*
     * The legacy mode of the peering.
     */
    @JsonProperty(value = "legacyMode")
    private Integer legacyMode;

    /*
     * The CustomerASN of the peering.
     */
    @JsonProperty(value = "customerASN")
    private Integer customerAsn;

    /*
     * The RoutingRegistryName of the configuration.
     */
    @JsonProperty(value = "routingRegistryName")
    private String routingRegistryName;

    /**
     * Get the advertisedPublicPrefixes property: The reference of AdvertisedPublicPrefixes.
     *
     * @return the advertisedPublicPrefixes value.
     */
    public List<String> advertisedPublicPrefixes() {
        return this.advertisedPublicPrefixes;
    }

    /**
     * Set the advertisedPublicPrefixes property: The reference of AdvertisedPublicPrefixes.
     *
     * @param advertisedPublicPrefixes the advertisedPublicPrefixes value to set.
     * @return the ExpressRouteCircuitPeeringConfig object itself.
     */
    public ExpressRouteCircuitPeeringConfig withAdvertisedPublicPrefixes(List<String> advertisedPublicPrefixes) {
        this.advertisedPublicPrefixes = advertisedPublicPrefixes;
        return this;
    }

    /**
     * Get the advertisedCommunities property: The communities of bgp peering. Specified for microsoft peering.
     *
     * @return the advertisedCommunities value.
     */
    public List<String> advertisedCommunities() {
        return this.advertisedCommunities;
    }

    /**
     * Set the advertisedCommunities property: The communities of bgp peering. Specified for microsoft peering.
     *
     * @param advertisedCommunities the advertisedCommunities value to set.
     * @return the ExpressRouteCircuitPeeringConfig object itself.
     */
    public ExpressRouteCircuitPeeringConfig withAdvertisedCommunities(List<String> advertisedCommunities) {
        this.advertisedCommunities = advertisedCommunities;
        return this;
    }

    /**
     * Get the advertisedPublicPrefixesState property: The advertised public prefix state of the Peering resource.
     *
     * @return the advertisedPublicPrefixesState value.
     */
    public ExpressRouteCircuitPeeringAdvertisedPublicPrefixState advertisedPublicPrefixesState() {
        return this.advertisedPublicPrefixesState;
    }

    /**
     * Set the advertisedPublicPrefixesState property: The advertised public prefix state of the Peering resource.
     *
     * @param advertisedPublicPrefixesState the advertisedPublicPrefixesState value to set.
     * @return the ExpressRouteCircuitPeeringConfig object itself.
     */
    public ExpressRouteCircuitPeeringConfig withAdvertisedPublicPrefixesState(
        ExpressRouteCircuitPeeringAdvertisedPublicPrefixState advertisedPublicPrefixesState) {
        this.advertisedPublicPrefixesState = advertisedPublicPrefixesState;
        return this;
    }

    /**
     * Get the legacyMode property: The legacy mode of the peering.
     *
     * @return the legacyMode value.
     */
    public Integer legacyMode() {
        return this.legacyMode;
    }

    /**
     * Set the legacyMode property: The legacy mode of the peering.
     *
     * @param legacyMode the legacyMode value to set.
     * @return the ExpressRouteCircuitPeeringConfig object itself.
     */
    public ExpressRouteCircuitPeeringConfig withLegacyMode(Integer legacyMode) {
        this.legacyMode = legacyMode;
        return this;
    }

    /**
     * Get the customerAsn property: The CustomerASN of the peering.
     *
     * @return the customerAsn value.
     */
    public Integer customerAsn() {
        return this.customerAsn;
    }

    /**
     * Set the customerAsn property: The CustomerASN of the peering.
     *
     * @param customerAsn the customerAsn value to set.
     * @return the ExpressRouteCircuitPeeringConfig object itself.
     */
    public ExpressRouteCircuitPeeringConfig withCustomerAsn(Integer customerAsn) {
        this.customerAsn = customerAsn;
        return this;
    }

    /**
     * Get the routingRegistryName property: The RoutingRegistryName of the configuration.
     *
     * @return the routingRegistryName value.
     */
    public String routingRegistryName() {
        return this.routingRegistryName;
    }

    /**
     * Set the routingRegistryName property: The RoutingRegistryName of the configuration.
     *
     * @param routingRegistryName the routingRegistryName value to set.
     * @return the ExpressRouteCircuitPeeringConfig object itself.
     */
    public ExpressRouteCircuitPeeringConfig withRoutingRegistryName(String routingRegistryName) {
        this.routingRegistryName = routingRegistryName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
