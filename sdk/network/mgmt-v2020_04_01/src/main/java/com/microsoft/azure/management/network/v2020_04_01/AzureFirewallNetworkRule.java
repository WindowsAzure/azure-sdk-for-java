/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the network rule.
 */
public class AzureFirewallNetworkRule {
    /**
     * Name of the network rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Description of the rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Array of AzureFirewallNetworkRuleProtocols.
     */
    @JsonProperty(value = "protocols")
    private List<AzureFirewallNetworkRuleProtocol> protocols;

    /**
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /**
     * List of destination IP addresses.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /**
     * List of destination ports.
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

    /**
     * List of destination FQDNs.
     */
    @JsonProperty(value = "destinationFqdns")
    private List<String> destinationFqdns;

    /**
     * List of source IpGroups for this rule.
     */
    @JsonProperty(value = "sourceIpGroups")
    private List<String> sourceIpGroups;

    /**
     * List of destination IpGroups for this rule.
     */
    @JsonProperty(value = "destinationIpGroups")
    private List<String> destinationIpGroups;

    /**
     * Get name of the network rule.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the network rule.
     *
     * @param name the name value to set
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get description of the rule.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the rule.
     *
     * @param description the description value to set
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get array of AzureFirewallNetworkRuleProtocols.
     *
     * @return the protocols value
     */
    public List<AzureFirewallNetworkRuleProtocol> protocols() {
        return this.protocols;
    }

    /**
     * Set array of AzureFirewallNetworkRuleProtocols.
     *
     * @param protocols the protocols value to set
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withProtocols(List<AzureFirewallNetworkRuleProtocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get list of source IP addresses for this rule.
     *
     * @return the sourceAddresses value
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set list of source IP addresses for this rule.
     *
     * @param sourceAddresses the sourceAddresses value to set
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get list of destination IP addresses.
     *
     * @return the destinationAddresses value
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set list of destination IP addresses.
     *
     * @param destinationAddresses the destinationAddresses value to set
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get list of destination ports.
     *
     * @return the destinationPorts value
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set list of destination ports.
     *
     * @param destinationPorts the destinationPorts value to set
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Get list of destination FQDNs.
     *
     * @return the destinationFqdns value
     */
    public List<String> destinationFqdns() {
        return this.destinationFqdns;
    }

    /**
     * Set list of destination FQDNs.
     *
     * @param destinationFqdns the destinationFqdns value to set
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withDestinationFqdns(List<String> destinationFqdns) {
        this.destinationFqdns = destinationFqdns;
        return this;
    }

    /**
     * Get list of source IpGroups for this rule.
     *
     * @return the sourceIpGroups value
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups;
    }

    /**
     * Set list of source IpGroups for this rule.
     *
     * @param sourceIpGroups the sourceIpGroups value to set
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withSourceIpGroups(List<String> sourceIpGroups) {
        this.sourceIpGroups = sourceIpGroups;
        return this;
    }

    /**
     * Get list of destination IpGroups for this rule.
     *
     * @return the destinationIpGroups value
     */
    public List<String> destinationIpGroups() {
        return this.destinationIpGroups;
    }

    /**
     * Set list of destination IpGroups for this rule.
     *
     * @param destinationIpGroups the destinationIpGroups value to set
     * @return the AzureFirewallNetworkRule object itself.
     */
    public AzureFirewallNetworkRule withDestinationIpGroups(List<String> destinationIpGroups) {
        this.destinationIpGroups = destinationIpGroups;
        return this;
    }

}
