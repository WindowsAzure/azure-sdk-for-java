// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The routes table associated with the ExpressRouteCircuit. */
@Fluent
public final class ExpressRouteCircuitRoutesTable {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitRoutesTable.class);

    /*
     * IP address of a network entity.
     */
    @JsonProperty(value = "network")
    private String network;

    /*
     * NextHop address.
     */
    @JsonProperty(value = "nextHop")
    private String nextHop;

    /*
     * Local preference value as set with the set local-preference route-map
     * configuration command.
     */
    @JsonProperty(value = "locPrf")
    private String locPrf;

    /*
     * Route Weight.
     */
    @JsonProperty(value = "weight")
    private Integer weight;

    /*
     * Autonomous system paths to the destination network.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Get the network property: IP address of a network entity.
     *
     * @return the network value.
     */
    public String network() {
        return this.network;
    }

    /**
     * Set the network property: IP address of a network entity.
     *
     * @param network the network value to set.
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withNetwork(String network) {
        this.network = network;
        return this;
    }

    /**
     * Get the nextHop property: NextHop address.
     *
     * @return the nextHop value.
     */
    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Set the nextHop property: NextHop address.
     *
     * @param nextHop the nextHop value to set.
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }

    /**
     * Get the locPrf property: Local preference value as set with the set local-preference route-map configuration
     * command.
     *
     * @return the locPrf value.
     */
    public String locPrf() {
        return this.locPrf;
    }

    /**
     * Set the locPrf property: Local preference value as set with the set local-preference route-map configuration
     * command.
     *
     * @param locPrf the locPrf value to set.
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withLocPrf(String locPrf) {
        this.locPrf = locPrf;
        return this;
    }

    /**
     * Get the weight property: Route Weight.
     *
     * @return the weight value.
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * Set the weight property: Route Weight.
     *
     * @param weight the weight value to set.
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the path property: Autonomous system paths to the destination network.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Autonomous system paths to the destination network.
     *
     * @param path the path value to set.
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withPath(String path) {
        this.path = path;
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
