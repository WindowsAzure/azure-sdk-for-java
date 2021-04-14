// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP firewall rule. */
@JsonFlatten
@Fluent
public class IpFirewallRuleInfoInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpFirewallRuleInfoInner.class);

    /*
     * The end IP address of the firewall rule. Must be IPv4 format. Must be
     * greater than or equal to startIpAddress
     */
    @JsonProperty(value = "properties.endIpAddress")
    private String endIpAddress;

    /*
     * Resource provisioning state
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The start IP address of the firewall rule. Must be IPv4 format
     */
    @JsonProperty(value = "properties.startIpAddress")
    private String startIpAddress;

    /**
     * Get the endIpAddress property: The end IP address of the firewall rule. Must be IPv4 format. Must be greater than
     * or equal to startIpAddress.
     *
     * @return the endIpAddress value.
     */
    public String endIpAddress() {
        return this.endIpAddress;
    }

    /**
     * Set the endIpAddress property: The end IP address of the firewall rule. Must be IPv4 format. Must be greater than
     * or equal to startIpAddress.
     *
     * @param endIpAddress the endIpAddress value to set.
     * @return the IpFirewallRuleInfoInner object itself.
     */
    public IpFirewallRuleInfoInner withEndIpAddress(String endIpAddress) {
        this.endIpAddress = endIpAddress;
        return this;
    }

    /**
     * Get the provisioningState property: Resource provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the startIpAddress property: The start IP address of the firewall rule. Must be IPv4 format.
     *
     * @return the startIpAddress value.
     */
    public String startIpAddress() {
        return this.startIpAddress;
    }

    /**
     * Set the startIpAddress property: The start IP address of the firewall rule. Must be IPv4 format.
     *
     * @param startIpAddress the startIpAddress value to set.
     * @return the IpFirewallRuleInfoInner object itself.
     */
    public IpFirewallRuleInfoInner withStartIpAddress(String startIpAddress) {
        this.startIpAddress = startIpAddress;
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
