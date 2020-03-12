/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IP firewall rule properties.
 */
public class IpFirewallRuleProperties {
    /**
     * The end IP address of the firewall rule. Must be IPv4 format. Must be
     * greater than or equal to startIpAddress.
     */
    @JsonProperty(value = "endIpAddress")
    private String endIpAddress;

    /**
     * Resource provisioning state. Possible values include: 'Provisioning',
     * 'Succeeded', 'Deleting', 'Failed', 'DeleteError'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The start IP address of the firewall rule. Must be IPv4 format.
     */
    @JsonProperty(value = "startIpAddress")
    private String startIpAddress;

    /**
     * Get the end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress.
     *
     * @return the endIpAddress value
     */
    public String endIpAddress() {
        return this.endIpAddress;
    }

    /**
     * Set the end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress.
     *
     * @param endIpAddress the endIpAddress value to set
     * @return the IpFirewallRuleProperties object itself.
     */
    public IpFirewallRuleProperties withEndIpAddress(String endIpAddress) {
        this.endIpAddress = endIpAddress;
        return this;
    }

    /**
     * Get resource provisioning state. Possible values include: 'Provisioning', 'Succeeded', 'Deleting', 'Failed', 'DeleteError'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the start IP address of the firewall rule. Must be IPv4 format.
     *
     * @return the startIpAddress value
     */
    public String startIpAddress() {
        return this.startIpAddress;
    }

    /**
     * Set the start IP address of the firewall rule. Must be IPv4 format.
     *
     * @param startIpAddress the startIpAddress value to set
     * @return the IpFirewallRuleProperties object itself.
     */
    public IpFirewallRuleProperties withStartIpAddress(String startIpAddress) {
        this.startIpAddress = startIpAddress;
        return this;
    }

}
