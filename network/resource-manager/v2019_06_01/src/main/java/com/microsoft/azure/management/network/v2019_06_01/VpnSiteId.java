/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VpnSite Resource.
 */
public class VpnSiteId {
    /**
     * The resource-uri of the vpn-site for which config is to be fetched.
     */
    @JsonProperty(value = "vpnSite", access = JsonProperty.Access.WRITE_ONLY)
    private String vpnSite;

    /**
     * Get the resource-uri of the vpn-site for which config is to be fetched.
     *
     * @return the vpnSite value
     */
    public String vpnSite() {
        return this.vpnSite;
    }

}
