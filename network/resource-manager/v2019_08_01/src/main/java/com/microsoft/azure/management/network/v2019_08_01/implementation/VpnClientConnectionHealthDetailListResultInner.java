/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_08_01.VpnClientConnectionHealthDetail;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of virtual network gateway vpn client connection health.
 */
public class VpnClientConnectionHealthDetailListResultInner {
    /**
     * List of vpn client connection health.
     */
    @JsonProperty(value = "value")
    private List<VpnClientConnectionHealthDetail> value;

    /**
     * Get list of vpn client connection health.
     *
     * @return the value value
     */
    public List<VpnClientConnectionHealthDetail> value() {
        return this.value;
    }

    /**
     * Set list of vpn client connection health.
     *
     * @param value the value value to set
     * @return the VpnClientConnectionHealthDetailListResultInner object itself.
     */
    public VpnClientConnectionHealthDetailListResultInner withValue(List<VpnClientConnectionHealthDetail> value) {
        this.value = value;
        return this;
    }

}
