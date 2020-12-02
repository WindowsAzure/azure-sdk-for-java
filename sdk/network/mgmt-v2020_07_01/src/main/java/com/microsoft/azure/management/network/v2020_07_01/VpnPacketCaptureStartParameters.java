/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Start packet capture parameters on virtual network gateway.
 */
public class VpnPacketCaptureStartParameters {
    /**
     * Start Packet capture parameters.
     */
    @JsonProperty(value = "filterData")
    private String filterData;

    /**
     * Get start Packet capture parameters.
     *
     * @return the filterData value
     */
    public String filterData() {
        return this.filterData;
    }

    /**
     * Set start Packet capture parameters.
     *
     * @param filterData the filterData value to set
     * @return the VpnPacketCaptureStartParameters object itself.
     */
    public VpnPacketCaptureStartParameters withFilterData(String filterData) {
        this.filterData = filterData;
        return this;
    }

}
