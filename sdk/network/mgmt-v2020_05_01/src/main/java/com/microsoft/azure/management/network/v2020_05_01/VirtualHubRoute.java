/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VirtualHub route.
 */
public class VirtualHubRoute {
    /**
     * List of all addressPrefixes.
     */
    @JsonProperty(value = "addressPrefixes")
    private List<String> addressPrefixes;

    /**
     * NextHop ip address.
     */
    @JsonProperty(value = "nextHopIpAddress")
    private String nextHopIpAddress;

    /**
     * Get list of all addressPrefixes.
     *
     * @return the addressPrefixes value
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set list of all addressPrefixes.
     *
     * @param addressPrefixes the addressPrefixes value to set
     * @return the VirtualHubRoute object itself.
     */
    public VirtualHubRoute withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }

    /**
     * Get nextHop ip address.
     *
     * @return the nextHopIpAddress value
     */
    public String nextHopIpAddress() {
        return this.nextHopIpAddress;
    }

    /**
     * Set nextHop ip address.
     *
     * @param nextHopIpAddress the nextHopIpAddress value to set
     * @return the VirtualHubRoute object itself.
     */
    public VirtualHubRoute withNextHopIpAddress(String nextHopIpAddress) {
        this.nextHopIpAddress = nextHopIpAddress;
        return this;
    }

}
