/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Public IP addresses associated with azure firewall.
 */
public class HubPublicIPAddresses {
    /**
     * The number of Public IP addresses associated with azure firewall.
     */
    @JsonProperty(value = "addresses")
    private List<AzureFirewallPublicIPAddress> addresses;

    /**
     * Private IP Address associated with azure firewall.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Get the number of Public IP addresses associated with azure firewall.
     *
     * @return the addresses value
     */
    public List<AzureFirewallPublicIPAddress> addresses() {
        return this.addresses;
    }

    /**
     * Set the number of Public IP addresses associated with azure firewall.
     *
     * @param addresses the addresses value to set
     * @return the HubPublicIPAddresses object itself.
     */
    public HubPublicIPAddresses withAddresses(List<AzureFirewallPublicIPAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Get private IP Address associated with azure firewall.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set private IP Address associated with azure firewall.
     *
     * @param count the count value to set
     * @return the HubPublicIPAddresses object itself.
     */
    public HubPublicIPAddresses withCount(Integer count) {
        this.count = count;
        return this;
    }

}
