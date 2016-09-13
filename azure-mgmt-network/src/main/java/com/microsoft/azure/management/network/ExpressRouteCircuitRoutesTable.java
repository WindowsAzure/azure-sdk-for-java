/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;


/**
 * The routes table associated with the ExpressRouteCircuit.
 */
public class ExpressRouteCircuitRoutesTable {
    /**
     * network.
     */
    private String network;

    /**
     * nextHop.
     */
    private String nextHop;

    /**
     * locPrf.
     */
    private String locPrf;

    /**
     * weight.
     */
    private Integer weight;

    /**
     * path .
     */
    private String path;

    /**
     * Get the network value.
     *
     * @return the network value
     */
    public String network() {
        return this.network;
    }

    /**
     * Set the network value.
     *
     * @param network the network value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withNetwork(String network) {
        this.network = network;
        return this;
    }

    /**
     * Get the nextHop value.
     *
     * @return the nextHop value
     */
    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Set the nextHop value.
     *
     * @param nextHop the nextHop value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }

    /**
     * Get the locPrf value.
     *
     * @return the locPrf value
     */
    public String locPrf() {
        return this.locPrf;
    }

    /**
     * Set the locPrf value.
     *
     * @param locPrf the locPrf value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withLocPrf(String locPrf) {
        this.locPrf = locPrf;
        return this;
    }

    /**
     * Get the weight value.
     *
     * @return the weight value
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * Set the weight value.
     *
     * @param weight the weight value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the path value.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path value.
     *
     * @param path the path value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withPath(String path) {
        this.path = path;
        return this;
    }

}
