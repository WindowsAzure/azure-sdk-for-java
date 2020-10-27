/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import com.microsoft.azure.management.network.v2018_11_01.SecurityRuleProtocol;
import java.util.List;
import com.microsoft.azure.management.network.v2018_11_01.SecurityRuleAccess;
import com.microsoft.azure.management.network.v2018_11_01.SecurityRuleDirection;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Network security rule.
 */
@JsonFlatten
public class SecurityRuleInner extends SubResource {
    /**
     * A description for this rule. Restricted to 140 chars.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Network protocol this rule applies to. Possible values are 'Tcp', 'Udp',
     * and '*'. Possible values include: 'Tcp', 'Udp', '*'.
     */
    @JsonProperty(value = "properties.protocol", required = true)
    private SecurityRuleProtocol protocol;

    /**
     * The source port or range. Integer or range between 0 and 65535.
     * Asterisks '*' can also be used to match all ports.
     */
    @JsonProperty(value = "properties.sourcePortRange")
    private String sourcePortRange;

    /**
     * The destination port or range. Integer or range between 0 and 65535.
     * Asterisks '*' can also be used to match all ports.
     */
    @JsonProperty(value = "properties.destinationPortRange")
    private String destinationPortRange;

    /**
     * The CIDR or source IP range. Asterisks '*' can also be used to match all
     * source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer'
     * and 'Internet' can also be used. If this is an ingress rule, specifies
     * where network traffic originates from.
     */
    @JsonProperty(value = "properties.sourceAddressPrefix")
    private String sourceAddressPrefix;

    /**
     * The CIDR or source IP ranges.
     */
    @JsonProperty(value = "properties.sourceAddressPrefixes")
    private List<String> sourceAddressPrefixes;

    /**
     * The application security group specified as source.
     */
    @JsonProperty(value = "properties.sourceApplicationSecurityGroups")
    private List<ApplicationSecurityGroupInner> sourceApplicationSecurityGroups;

    /**
     * The destination address prefix. CIDR or destination IP range. Asterisks
     * '*' can also be used to match all source IPs. Default tags such as
     * 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     */
    @JsonProperty(value = "properties.destinationAddressPrefix")
    private String destinationAddressPrefix;

    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     */
    @JsonProperty(value = "properties.destinationAddressPrefixes")
    private List<String> destinationAddressPrefixes;

    /**
     * The application security group specified as destination.
     */
    @JsonProperty(value = "properties.destinationApplicationSecurityGroups")
    private List<ApplicationSecurityGroupInner> destinationApplicationSecurityGroups;

    /**
     * The source port ranges.
     */
    @JsonProperty(value = "properties.sourcePortRanges")
    private List<String> sourcePortRanges;

    /**
     * The destination port ranges.
     */
    @JsonProperty(value = "properties.destinationPortRanges")
    private List<String> destinationPortRanges;

    /**
     * The network traffic is allowed or denied. Possible values are: 'Allow'
     * and 'Deny'. Possible values include: 'Allow', 'Deny'.
     */
    @JsonProperty(value = "properties.access", required = true)
    private SecurityRuleAccess access;

    /**
     * The priority of the rule. The value can be between 100 and 4096. The
     * priority number must be unique for each rule in the collection. The
     * lower the priority number, the higher the priority of the rule.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /**
     * The direction of the rule. The direction specifies if rule will be
     * evaluated on incoming or outgoing traffic. Possible values are:
     * 'Inbound' and 'Outbound'. Possible values include: 'Inbound',
     * 'Outbound'.
     */
    @JsonProperty(value = "properties.direction", required = true)
    private SecurityRuleDirection direction;

    /**
     * The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get a description for this rule. Restricted to 140 chars.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set a description for this rule. Restricted to 140 chars.
     *
     * @param description the description value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get network protocol this rule applies to. Possible values are 'Tcp', 'Udp', and '*'. Possible values include: 'Tcp', 'Udp', '*'.
     *
     * @return the protocol value
     */
    public SecurityRuleProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set network protocol this rule applies to. Possible values are 'Tcp', 'Udp', and '*'. Possible values include: 'Tcp', 'Udp', '*'.
     *
     * @param protocol the protocol value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withProtocol(SecurityRuleProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the source port or range. Integer or range between 0 and 65535. Asterisks '*' can also be used to match all ports.
     *
     * @return the sourcePortRange value
     */
    public String sourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * Set the source port or range. Integer or range between 0 and 65535. Asterisks '*' can also be used to match all ports.
     *
     * @param sourcePortRange the sourcePortRange value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    /**
     * Get the destination port or range. Integer or range between 0 and 65535. Asterisks '*' can also be used to match all ports.
     *
     * @return the destinationPortRange value
     */
    public String destinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * Set the destination port or range. Integer or range between 0 and 65535. Asterisks '*' can also be used to match all ports.
     *
     * @param destinationPortRange the destinationPortRange value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * Get the CIDR or source IP range. Asterisks '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this is an ingress rule, specifies where network traffic originates from.
     *
     * @return the sourceAddressPrefix value
     */
    public String sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Set the CIDR or source IP range. Asterisks '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this is an ingress rule, specifies where network traffic originates from.
     *
     * @param sourceAddressPrefix the sourceAddressPrefix value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withSourceAddressPrefix(String sourceAddressPrefix) {
        this.sourceAddressPrefix = sourceAddressPrefix;
        return this;
    }

    /**
     * Get the CIDR or source IP ranges.
     *
     * @return the sourceAddressPrefixes value
     */
    public List<String> sourceAddressPrefixes() {
        return this.sourceAddressPrefixes;
    }

    /**
     * Set the CIDR or source IP ranges.
     *
     * @param sourceAddressPrefixes the sourceAddressPrefixes value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withSourceAddressPrefixes(List<String> sourceAddressPrefixes) {
        this.sourceAddressPrefixes = sourceAddressPrefixes;
        return this;
    }

    /**
     * Get the application security group specified as source.
     *
     * @return the sourceApplicationSecurityGroups value
     */
    public List<ApplicationSecurityGroupInner> sourceApplicationSecurityGroups() {
        return this.sourceApplicationSecurityGroups;
    }

    /**
     * Set the application security group specified as source.
     *
     * @param sourceApplicationSecurityGroups the sourceApplicationSecurityGroups value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withSourceApplicationSecurityGroups(List<ApplicationSecurityGroupInner> sourceApplicationSecurityGroups) {
        this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
        return this;
    }

    /**
     * Get the destination address prefix. CIDR or destination IP range. Asterisks '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     *
     * @return the destinationAddressPrefix value
     */
    public String destinationAddressPrefix() {
        return this.destinationAddressPrefix;
    }

    /**
     * Set the destination address prefix. CIDR or destination IP range. Asterisks '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     *
     * @param destinationAddressPrefix the destinationAddressPrefix value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withDestinationAddressPrefix(String destinationAddressPrefix) {
        this.destinationAddressPrefix = destinationAddressPrefix;
        return this;
    }

    /**
     * Get the destination address prefixes. CIDR or destination IP ranges.
     *
     * @return the destinationAddressPrefixes value
     */
    public List<String> destinationAddressPrefixes() {
        return this.destinationAddressPrefixes;
    }

    /**
     * Set the destination address prefixes. CIDR or destination IP ranges.
     *
     * @param destinationAddressPrefixes the destinationAddressPrefixes value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withDestinationAddressPrefixes(List<String> destinationAddressPrefixes) {
        this.destinationAddressPrefixes = destinationAddressPrefixes;
        return this;
    }

    /**
     * Get the application security group specified as destination.
     *
     * @return the destinationApplicationSecurityGroups value
     */
    public List<ApplicationSecurityGroupInner> destinationApplicationSecurityGroups() {
        return this.destinationApplicationSecurityGroups;
    }

    /**
     * Set the application security group specified as destination.
     *
     * @param destinationApplicationSecurityGroups the destinationApplicationSecurityGroups value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withDestinationApplicationSecurityGroups(List<ApplicationSecurityGroupInner> destinationApplicationSecurityGroups) {
        this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
        return this;
    }

    /**
     * Get the source port ranges.
     *
     * @return the sourcePortRanges value
     */
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * Set the source port ranges.
     *
     * @param sourcePortRanges the sourcePortRanges value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withSourcePortRanges(List<String> sourcePortRanges) {
        this.sourcePortRanges = sourcePortRanges;
        return this;
    }

    /**
     * Get the destination port ranges.
     *
     * @return the destinationPortRanges value
     */
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges;
    }

    /**
     * Set the destination port ranges.
     *
     * @param destinationPortRanges the destinationPortRanges value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withDestinationPortRanges(List<String> destinationPortRanges) {
        this.destinationPortRanges = destinationPortRanges;
        return this;
    }

    /**
     * Get the network traffic is allowed or denied. Possible values are: 'Allow' and 'Deny'. Possible values include: 'Allow', 'Deny'.
     *
     * @return the access value
     */
    public SecurityRuleAccess access() {
        return this.access;
    }

    /**
     * Set the network traffic is allowed or denied. Possible values are: 'Allow' and 'Deny'. Possible values include: 'Allow', 'Deny'.
     *
     * @param access the access value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withAccess(SecurityRuleAccess access) {
        this.access = access;
        return this;
    }

    /**
     * Get the priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     *
     * @param priority the priority value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic. Possible values are: 'Inbound' and 'Outbound'. Possible values include: 'Inbound', 'Outbound'.
     *
     * @return the direction value
     */
    public SecurityRuleDirection direction() {
        return this.direction;
    }

    /**
     * Set the direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic. Possible values are: 'Inbound' and 'Outbound'. Possible values include: 'Inbound', 'Outbound'.
     *
     * @param direction the direction value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withDirection(SecurityRuleDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the SecurityRuleInner object itself.
     */
    public SecurityRuleInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
