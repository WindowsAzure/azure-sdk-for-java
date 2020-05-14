// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VpnLinkProviderProperties model. */
@Fluent
public final class VpnLinkProviderProperties {
    /*
     * Name of the link provider.
     */
    @JsonProperty(value = "linkProviderName")
    private String linkProviderName;

    /*
     * Link speed.
     */
    @JsonProperty(value = "linkSpeedInMbps")
    private Integer linkSpeedInMbps;

    /**
     * Get the linkProviderName property: Name of the link provider.
     *
     * @return the linkProviderName value.
     */
    public String linkProviderName() {
        return this.linkProviderName;
    }

    /**
     * Set the linkProviderName property: Name of the link provider.
     *
     * @param linkProviderName the linkProviderName value to set.
     * @return the VpnLinkProviderProperties object itself.
     */
    public VpnLinkProviderProperties withLinkProviderName(String linkProviderName) {
        this.linkProviderName = linkProviderName;
        return this;
    }

    /**
     * Get the linkSpeedInMbps property: Link speed.
     *
     * @return the linkSpeedInMbps value.
     */
    public Integer linkSpeedInMbps() {
        return this.linkSpeedInMbps;
    }

    /**
     * Set the linkSpeedInMbps property: Link speed.
     *
     * @param linkSpeedInMbps the linkSpeedInMbps value to set.
     * @return the VpnLinkProviderProperties object itself.
     */
    public VpnLinkProviderProperties withLinkSpeedInMbps(Integer linkSpeedInMbps) {
        this.linkSpeedInMbps = linkSpeedInMbps;
        return this;
    }
}
