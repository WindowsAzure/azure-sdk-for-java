/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Vpn Profile Response for package generation.
 */
public class VpnProfileResponseInner {
    /**
     * URL to the VPN profile.
     */
    @JsonProperty(value = "profileUrl")
    private String profileUrl;

    /**
     * Get uRL to the VPN profile.
     *
     * @return the profileUrl value
     */
    public String profileUrl() {
        return this.profileUrl;
    }

    /**
     * Set uRL to the VPN profile.
     *
     * @param profileUrl the profileUrl value to set
     * @return the VpnProfileResponseInner object itself.
     */
    public VpnProfileResponseInner withProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
        return this;
    }

}
