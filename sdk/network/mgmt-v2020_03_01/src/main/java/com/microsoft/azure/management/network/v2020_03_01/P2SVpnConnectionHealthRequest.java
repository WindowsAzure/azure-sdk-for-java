/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of P2S Vpn connection health request.
 */
public class P2SVpnConnectionHealthRequest {
    /**
     * The list of p2s vpn user names whose p2s vpn connection detailed health
     * to retrieve for.
     */
    @JsonProperty(value = "vpnUserNamesFilter")
    private List<String> vpnUserNamesFilter;

    /**
     * The sas-url to download the P2S Vpn connection health detail.
     */
    @JsonProperty(value = "outputBlobSasUrl")
    private String outputBlobSasUrl;

    /**
     * Get the list of p2s vpn user names whose p2s vpn connection detailed health to retrieve for.
     *
     * @return the vpnUserNamesFilter value
     */
    public List<String> vpnUserNamesFilter() {
        return this.vpnUserNamesFilter;
    }

    /**
     * Set the list of p2s vpn user names whose p2s vpn connection detailed health to retrieve for.
     *
     * @param vpnUserNamesFilter the vpnUserNamesFilter value to set
     * @return the P2SVpnConnectionHealthRequest object itself.
     */
    public P2SVpnConnectionHealthRequest withVpnUserNamesFilter(List<String> vpnUserNamesFilter) {
        this.vpnUserNamesFilter = vpnUserNamesFilter;
        return this;
    }

    /**
     * Get the sas-url to download the P2S Vpn connection health detail.
     *
     * @return the outputBlobSasUrl value
     */
    public String outputBlobSasUrl() {
        return this.outputBlobSasUrl;
    }

    /**
     * Set the sas-url to download the P2S Vpn connection health detail.
     *
     * @param outputBlobSasUrl the outputBlobSasUrl value to set
     * @return the P2SVpnConnectionHealthRequest object itself.
     */
    public P2SVpnConnectionHealthRequest withOutputBlobSasUrl(String outputBlobSasUrl) {
        this.outputBlobSasUrl = outputBlobSasUrl;
        return this;
    }

}
