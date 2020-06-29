// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The P2SVpnConnectionHealthRequest model. */
@Fluent
public final class P2SVpnConnectionHealthRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(P2SVpnConnectionHealthRequest.class);

    /*
     * The list of p2s vpn user names whose p2s vpn connection detailed health
     * to retrieve for.
     */
    @JsonProperty(value = "vpnUserNamesFilter")
    private List<String> vpnUserNamesFilter;

    /*
     * The sas-url to download the P2S Vpn connection health detail.
     */
    @JsonProperty(value = "outputBlobSasUrl")
    private String outputBlobSasUrl;

    /**
     * Get the vpnUserNamesFilter property: The list of p2s vpn user names whose p2s vpn connection detailed health to
     * retrieve for.
     *
     * @return the vpnUserNamesFilter value.
     */
    public List<String> vpnUserNamesFilter() {
        return this.vpnUserNamesFilter;
    }

    /**
     * Set the vpnUserNamesFilter property: The list of p2s vpn user names whose p2s vpn connection detailed health to
     * retrieve for.
     *
     * @param vpnUserNamesFilter the vpnUserNamesFilter value to set.
     * @return the P2SVpnConnectionHealthRequest object itself.
     */
    public P2SVpnConnectionHealthRequest withVpnUserNamesFilter(List<String> vpnUserNamesFilter) {
        this.vpnUserNamesFilter = vpnUserNamesFilter;
        return this;
    }

    /**
     * Get the outputBlobSasUrl property: The sas-url to download the P2S Vpn connection health detail.
     *
     * @return the outputBlobSasUrl value.
     */
    public String outputBlobSasUrl() {
        return this.outputBlobSasUrl;
    }

    /**
     * Set the outputBlobSasUrl property: The sas-url to download the P2S Vpn connection health detail.
     *
     * @param outputBlobSasUrl the outputBlobSasUrl value to set.
     * @return the P2SVpnConnectionHealthRequest object itself.
     */
    public P2SVpnConnectionHealthRequest withOutputBlobSasUrl(String outputBlobSasUrl) {
        this.outputBlobSasUrl = outputBlobSasUrl;
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
