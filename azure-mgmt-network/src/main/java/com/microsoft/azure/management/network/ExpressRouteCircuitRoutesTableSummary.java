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
public class ExpressRouteCircuitRoutesTableSummary {
    /**
     * Neighbor.
     */
    private String neighbor;

    /**
     * BGP version number spoken to the neighbor.
     */
    private Integer v;

    /**
     * Autonomous system number.
     */
    private Integer as;

    /**
     * The length of time that the BGP session has been in the Established
     * state, or the current status if not in the Established state.
     */
    private String upDown;

    /**
     * Current state of the BGP session, and the number of prefixes that have
     * been received from a neighbor or peer group.
     */
    private String statePfxRcd;

    /**
     * Get the neighbor value.
     *
     * @return the neighbor value
     */
    public String neighbor() {
        return this.neighbor;
    }

    /**
     * Set the neighbor value.
     *
     * @param neighbor the neighbor value to set
     * @return the ExpressRouteCircuitRoutesTableSummary object itself.
     */
    public ExpressRouteCircuitRoutesTableSummary withNeighbor(String neighbor) {
        this.neighbor = neighbor;
        return this;
    }

    /**
     * Get the v value.
     *
     * @return the v value
     */
    public Integer v() {
        return this.v;
    }

    /**
     * Set the v value.
     *
     * @param v the v value to set
     * @return the ExpressRouteCircuitRoutesTableSummary object itself.
     */
    public ExpressRouteCircuitRoutesTableSummary withV(Integer v) {
        this.v = v;
        return this;
    }

    /**
     * Get the as value.
     *
     * @return the as value
     */
    public Integer as() {
        return this.as;
    }

    /**
     * Set the as value.
     *
     * @param as the as value to set
     * @return the ExpressRouteCircuitRoutesTableSummary object itself.
     */
    public ExpressRouteCircuitRoutesTableSummary withAs(Integer as) {
        this.as = as;
        return this;
    }

    /**
     * Get the upDown value.
     *
     * @return the upDown value
     */
    public String upDown() {
        return this.upDown;
    }

    /**
     * Set the upDown value.
     *
     * @param upDown the upDown value to set
     * @return the ExpressRouteCircuitRoutesTableSummary object itself.
     */
    public ExpressRouteCircuitRoutesTableSummary withUpDown(String upDown) {
        this.upDown = upDown;
        return this;
    }

    /**
     * Get the statePfxRcd value.
     *
     * @return the statePfxRcd value
     */
    public String statePfxRcd() {
        return this.statePfxRcd;
    }

    /**
     * Set the statePfxRcd value.
     *
     * @param statePfxRcd the statePfxRcd value to set
     * @return the ExpressRouteCircuitRoutesTableSummary object itself.
     */
    public ExpressRouteCircuitRoutesTableSummary withStatePfxRcd(String statePfxRcd) {
        this.statePfxRcd = statePfxRcd;
        return this;
    }

}
