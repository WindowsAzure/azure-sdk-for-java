/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IP addresses associated with azure firewall.
 */
public class HubIPAddresses {
    /**
     * List of Public IP addresses associated with azure firewall.
     */
    @JsonProperty(value = "publicIPAddresses")
    private List<AzureFirewallPublicIPAddress> publicIPAddresses;

    /**
     * Private IP Address associated with azure firewall.
     */
    @JsonProperty(value = "privateIPAddress")
    private String privateIPAddress;

    /**
     * Get list of Public IP addresses associated with azure firewall.
     *
     * @return the publicIPAddresses value
     */
    public List<AzureFirewallPublicIPAddress> publicIPAddresses() {
        return this.publicIPAddresses;
    }

    /**
     * Set list of Public IP addresses associated with azure firewall.
     *
     * @param publicIPAddresses the publicIPAddresses value to set
     * @return the HubIPAddresses object itself.
     */
    public HubIPAddresses withPublicIPAddresses(List<AzureFirewallPublicIPAddress> publicIPAddresses) {
        this.publicIPAddresses = publicIPAddresses;
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
