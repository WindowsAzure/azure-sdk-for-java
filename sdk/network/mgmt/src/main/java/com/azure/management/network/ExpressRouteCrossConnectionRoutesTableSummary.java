// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExpressRouteCrossConnectionRoutesTableSummary model. */
@Fluent
public final class ExpressRouteCrossConnectionRoutesTableSummary {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ExpressRouteCrossConnectionRoutesTableSummary.class);

    /*
     * IP address of Neighbor router.
     */
    @JsonProperty(value = "neighbor")
    private String neighbor;

    /*
     * Autonomous system number.
     */
    @JsonProperty(value = "asn")
    private Integer asn;

    /*
     * The length of time that the BGP session has been in the Established
     * state, or the current status if not in the Established state.
     */
    @JsonProperty(value = "upDown")
    private String upDown;

    /*
     * Current state of the BGP session, and the number of prefixes that have
     * been received from a neighbor or peer group.
     */
    @JsonProperty(value = "stateOrPrefixesReceived")
    private String stateOrPrefixesReceived;

    /**
     * Get the neighbor property: IP address of Neighbor router.
     *
     * @return the neighbor value.
     */
    public String neighbor() {
        return this.neighbor;
    }

    /**
     * Set the neighbor property: IP address of Neighbor router.
     *
     * @param neighbor the neighbor value to set.
     * @return the ExpressRouteCrossConnectionRoutesTableSummary object itself.
     */
    public ExpressRouteCrossConnectionRoutesTableSummary withNeighbor(String neighbor) {
        this.neighbor = neighbor;
        return this;
    }

    /**
     * Get the asn property: Autonomous system number.
     *
     * @return the asn value.
     */
    public Integer asn() {
        return this.asn;
    }

    /**
     * Set the asn property: Autonomous system number.
     *
     * @param asn the asn value to set.
     * @return the ExpressRouteCrossConnectionRoutesTableSummary object itself.
     */
    public ExpressRouteCrossConnectionRoutesTableSummary withAsn(Integer asn) {
        this.asn = asn;
        return this;
    }

    /**
     * Get the upDown property: The length of time that the BGP session has been in the Established state, or the
     * current status if not in the Established state.
     *
     * @return the upDown value.
     */
    public String upDown() {
        return this.upDown;
    }

    /**
     * Set the upDown property: The length of time that the BGP session has been in the Established state, or the
     * current status if not in the Established state.
     *
     * @param upDown the upDown value to set.
     * @return the ExpressRouteCrossConnectionRoutesTableSummary object itself.
     */
    public ExpressRouteCrossConnectionRoutesTableSummary withUpDown(String upDown) {
        this.upDown = upDown;
        return this;
    }

    /**
     * Get the stateOrPrefixesReceived property: Current state of the BGP session, and the number of prefixes that have
     * been received from a neighbor or peer group.
     *
     * @return the stateOrPrefixesReceived value.
     */
    public String stateOrPrefixesReceived() {
        return this.stateOrPrefixesReceived;
    }

    /**
     * Set the stateOrPrefixesReceived property: Current state of the BGP session, and the number of prefixes that have
     * been received from a neighbor or peer group.
     *
     * @param stateOrPrefixesReceived the stateOrPrefixesReceived value to set.
     * @return the ExpressRouteCrossConnectionRoutesTableSummary object itself.
     */
    public ExpressRouteCrossConnectionRoutesTableSummary withStateOrPrefixesReceived(String stateOrPrefixesReceived) {
        this.stateOrPrefixesReceived = stateOrPrefixesReceived;
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
