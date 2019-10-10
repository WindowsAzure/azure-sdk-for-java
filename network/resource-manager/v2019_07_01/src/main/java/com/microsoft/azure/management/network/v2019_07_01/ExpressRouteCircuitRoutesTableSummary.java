/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The routes table associated with the ExpressRouteCircuit.
 */
public class ExpressRouteCircuitRoutesTableSummary {
    /**
     * IP address of the neighbor.
     */
    @JsonProperty(value = "neighbor")
    private String neighbor;

    /**
     * BGP version number spoken to the neighbor.
     */
    @JsonProperty(value = "v")
    private Integer v;

    /**
     * Autonomous system number.
     */
    @JsonProperty(value = "as")
    private Integer as;

    /**
     * The length of time that the BGP session has been in the Established
     * state, or the current status if not in the Established state.
     */
    @JsonProperty(value = "upDown")
    private String upDown;

    /**
     * Current state of the BGP session, and the number of prefixes that have
     * been received from a neighbor or peer group.
     */
    @JsonProperty(value = "statePfxRcd")
    private String statePfxRcd;

    /**
     * Get iP address of the neighbor.
     *
     * @return the neighbor value
     */
    public String neighbor() {
        return this.neighbor;
    }

    /**
     * Set iP address of the neighbor.
     *
     * @param neighbor the neighbor value to set
     * @return the ExpressRouteCircuitRoutesTableSummary object itself.
     */
    public ExpressRouteCircuitRoutesTableSummary withNeighbor(String neighbor) {
        this.neighbor = neighbor;
        return this;
    }

    /**
     * Get bGP version number spoken to the neighbor.
     *
     * @return the v value
     */
    public Integer v() {
        return this.v;
    }

    /**
     * Set bGP version number spoken to the neighbor.
     *
     * @param v the v value to set
     * @return the ExpressRouteCircuitRoutesTableSummary object itself.
     */
    public ExpressRouteCircuitRoutesTableSummary withV(Integer v) {
        this.v = v;
        return this;
    }

    /**
     * Get autonomous system number.
     *
     * @return the as value
     */
    public Integer as() {
        return this.as;
    }

    /**
     * Set autonomous system number.
     *
     * @param as the as value to set
     * @return the ExpressRouteCircuitRoutesTableSummary object itself.
     */
    public ExpressRouteCircuitRoutesTableSummary withAs(Integer as) {
        this.as = as;
        return this;
    }

    /**
     * Get the length of time that the BGP session has been in the Established state, or the current status if not in the Established state.
     *
     * @return the upDown value
     */
    public String upDown() {
        return this.upDown;
    }

    /**
     * Set the length of time that the BGP session has been in the Established state, or the current status if not in the Established state.
     *
     * @param upDown the upDown value to set
     * @return the ExpressRouteCircuitRoutesTableSummary object itself.
     */
    public ExpressRouteCircuitRoutesTableSummary withUpDown(String upDown) {
        this.upDown = upDown;
        return this;
    }

    /**
     * Get current state of the BGP session, and the number of prefixes that have been received from a neighbor or peer group.
     *
     * @return the statePfxRcd value
     */
    public String statePfxRcd() {
        return this.statePfxRcd;
    }

    /**
     * Set current state of the BGP session, and the number of prefixes that have been received from a neighbor or peer group.
     *
     * @param statePfxRcd the statePfxRcd value to set
     * @return the ExpressRouteCircuitRoutesTableSummary object itself.
     */
    public ExpressRouteCircuitRoutesTableSummary withStatePfxRcd(String statePfxRcd) {
        this.statePfxRcd = statePfxRcd;
        return this;
    }

}
