/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Rule of type network.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType", defaultImpl = NetworkRule.class)
@JsonTypeName("NetworkRule")
public class NetworkRule extends FirewallPolicyRule {
    /**
     * Array of FirewallPolicyRuleNetworkProtocols.
     */
    @JsonProperty(value = "ipProtocols")
    private List<FirewallPolicyRuleNetworkProtocol> ipProtocols;

    /**
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /**
     * List of destination IP addresses or Service Tags.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /**
     * List of destination ports.
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

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
     * List of destination FQDNs.
     */
    @JsonProperty(value = "destinationFqdns")
    private List<String> destinationFqdns;

    /**
     * Get array of FirewallPolicyRuleNetworkProtocols.
     *
     * @return the ipProtocols value
     */
    public List<FirewallPolicyRuleNetworkProtocol> ipProtocols() {
        return this.ipProtocols;
    }

    /**
     * Set array of FirewallPolicyRuleNetworkProtocols.
     *
     * @param ipProtocols the ipProtocols value to set
     * @return the NetworkRule object itself.
     */
    public NetworkRule withIpProtocols(List<FirewallPolicyRuleNetworkProtocol> ipProtocols) {
        this.ipProtocols = ipProtocols;
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
     * @return the NetworkRule object itself.
     */
    public NetworkRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get list of destination IP addresses or Service Tags.
     *
     * @return the destinationAddresses value
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set list of destination IP addresses or Service Tags.
     *
     * @param destinationAddresses the destinationAddresses value to set
     * @return the NetworkRule object itself.
     */
    public NetworkRule withDestinationAddresses(List<String> destinationAddresses) {
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
     * @return the NetworkRule object itself.
     */
    public NetworkRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
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
     * @return the NetworkRule object itself.
     */
    public NetworkRule withSourceIpGroups(List<String> sourceIpGroups) {
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
     * @return the NetworkRule object itself.
     */
    public NetworkRule withDestinationIpGroups(List<String> destinationIpGroups) {
        this.destinationIpGroups = destinationIpGroups;
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
     * @return the NetworkRule object itself.
     */
    public NetworkRule withDestinationFqdns(List<String> destinationFqdns) {
        this.destinationFqdns = destinationFqdns;
        return this;
    }

}
