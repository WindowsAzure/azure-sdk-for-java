/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Rule of type nat.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType", defaultImpl = NatRule.class)
@JsonTypeName("NatRule")
public class NatRule extends FirewallPolicyRule {
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
     * The translated address for this NAT rule.
     */
    @JsonProperty(value = "translatedAddress")
    private String translatedAddress;

    /**
     * The translated port for this NAT rule.
     */
    @JsonProperty(value = "translatedPort")
    private String translatedPort;

    /**
     * List of source IpGroups for this rule.
     */
    @JsonProperty(value = "sourceIpGroups")
    private List<String> sourceIpGroups;

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
     * @return the NatRule object itself.
     */
    public NatRule withIpProtocols(List<FirewallPolicyRuleNetworkProtocol> ipProtocols) {
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
     * @return the NatRule object itself.
     */
    public NatRule withSourceAddresses(List<String> sourceAddresses) {
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
     * @return the NatRule object itself.
     */
    public NatRule withDestinationAddresses(List<String> destinationAddresses) {
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
     * @return the NatRule object itself.
     */
    public NatRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Get the translated address for this NAT rule.
     *
     * @return the translatedAddress value
     */
    public String translatedAddress() {
        return this.translatedAddress;
    }

    /**
     * Set the translated address for this NAT rule.
     *
     * @param translatedAddress the translatedAddress value to set
     * @return the NatRule object itself.
     */
    public NatRule withTranslatedAddress(String translatedAddress) {
        this.translatedAddress = translatedAddress;
        return this;
    }

    /**
     * Get the translated port for this NAT rule.
     *
     * @return the translatedPort value
     */
    public String translatedPort() {
        return this.translatedPort;
    }

    /**
     * Set the translated port for this NAT rule.
     *
     * @param translatedPort the translatedPort value to set
     * @return the NatRule object itself.
     */
    public NatRule withTranslatedPort(String translatedPort) {
        this.translatedPort = translatedPort;
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
     * @return the NatRule object itself.
     */
    public NatRule withSourceIpGroups(List<String> sourceIpGroups) {
        this.sourceIpGroups = sourceIpGroups;
        return this;
    }

}
