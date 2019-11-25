/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of Vpn-Sites.
 */
public class GetVpnSitesConfigurationRequest {
    /**
     * List of resource-ids of the vpn-sites for which config is to be
     * downloaded.
     */
    @JsonProperty(value = "vpnSites")
    private List<SubResource> vpnSites;

    /**
     * The sas-url to download the configurations for vpn-sites.
     */
    @JsonProperty(value = "outputBlobSasUrl")
    private String outputBlobSasUrl;

    /**
     * Get list of resource-ids of the vpn-sites for which config is to be downloaded.
     *
     * @return the vpnSites value
     */
    public List<SubResource> vpnSites() {
        return this.vpnSites;
    }

    /**
     * Set list of resource-ids of the vpn-sites for which config is to be downloaded.
     *
     * @param vpnSites the vpnSites value to set
     * @return the GetVpnSitesConfigurationRequest object itself.
     */
    public GetVpnSitesConfigurationRequest withVpnSites(List<SubResource> vpnSites) {
        this.vpnSites = vpnSites;
        return this;
    }

    /**
     * Get the sas-url to download the configurations for vpn-sites.
     *
     * @return the outputBlobSasUrl value
     */
    public String outputBlobSasUrl() {
        return this.outputBlobSasUrl;
    }

    /**
     * Set the sas-url to download the configurations for vpn-sites.
     *
     * @param outputBlobSasUrl the outputBlobSasUrl value to set
     * @return the GetVpnSitesConfigurationRequest object itself.
     */
    public GetVpnSitesConfigurationRequest withOutputBlobSasUrl(String outputBlobSasUrl) {
        this.outputBlobSasUrl = outputBlobSasUrl;
        return this;
    }

}
