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
 * IP addresses associated with azure firewall.
 */
public class HubIPAddresses {
    /**
     * Public IP addresses associated with azure firewall.
     */
    @JsonProperty(value = "publicIPs")
    private HubPublicIPAddresses publicIPs;

    /**
     * Private IP Address associated with azure firewall.
     */
    @JsonProperty(value = "privateIPAddress")
    private String privateIPAddress;

    /**
     * Get public IP addresses associated with azure firewall.
     *
     * @return the publicIPs value
     */
    public HubPublicIPAddresses publicIPs() {
        return this.publicIPs;
    }

    /**
     * Set public IP addresses associated with azure firewall.
     *
     * @param publicIPs the publicIPs value to set
     * @return the HubIPAddresses object itself.
     */
    public HubIPAddresses withPublicIPs(HubPublicIPAddresses publicIPs) {
        this.publicIPs = publicIPs;
        return this;
    }

    /**
     * Get private IP Address associated with azure firewall.
     *
     * @return the privateIPAddress value
     */
    public String privateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * Set private IP Address associated with azure firewall.
     *
     * @param privateIPAddress the privateIPAddress value to set
     * @return the HubIPAddresses object itself.
     */
    public HubIPAddresses withPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
        return this;
    }

}
