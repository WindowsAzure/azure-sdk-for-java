/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of p2s vpn connections to be disconnected.
 */
public class P2SVpnConnectionRequest {
    /**
     * List of p2s vpn connection Ids.
     */
    @JsonProperty(value = "vpnConnectionIds")
    private List<String> vpnConnectionIds;

    /**
     * Get list of p2s vpn connection Ids.
     *
     * @return the vpnConnectionIds value
     */
    public List<String> vpnConnectionIds() {
        return this.vpnConnectionIds;
    }

    /**
     * Set list of p2s vpn connection Ids.
     *
     * @param vpnConnectionIds the vpnConnectionIds value to set
     * @return the P2SVpnConnectionRequest object itself.
     */
    public P2SVpnConnectionRequest withVpnConnectionIds(List<String> vpnConnectionIds) {
        this.vpnConnectionIds = vpnConnectionIds;
        return this;
    }

}
