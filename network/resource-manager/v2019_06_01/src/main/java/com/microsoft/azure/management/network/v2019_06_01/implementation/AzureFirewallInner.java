/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_06_01.AzureFirewallApplicationRuleCollection;
import com.microsoft.azure.management.network.v2019_06_01.AzureFirewallNatRuleCollection;
import com.microsoft.azure.management.network.v2019_06_01.AzureFirewallNetworkRuleCollection;
import com.microsoft.azure.management.network.v2019_06_01.AzureFirewallIPConfiguration;
import com.microsoft.azure.management.network.v2019_06_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_06_01.AzureFirewallThreatIntelMode;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_06_01.HubIPAddresses;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Azure Firewall resource.
 */
@JsonFlatten
@SkipParentValidation
public class AzureFirewallInner extends Resource {
    /**
     * Collection of application rule collections used by Azure Firewall.
     */
    @JsonProperty(value = "properties.applicationRuleCollections")
    private List<AzureFirewallApplicationRuleCollection> applicationRuleCollections;

    /**
     * Collection of NAT rule collections used by Azure Firewall.
     */
    @JsonProperty(value = "properties.natRuleCollections")
    private List<AzureFirewallNatRuleCollection> natRuleCollections;

    /**
     * Collection of network rule collections used by Azure Firewall.
     */
    @JsonProperty(value = "properties.networkRuleCollections")
    private List<AzureFirewallNetworkRuleCollection> networkRuleCollections;

    /**
     * IP configuration of the Azure Firewall resource.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<AzureFirewallIPConfiguration> ipConfigurations;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * The operation mode for Threat Intelligence. Possible values include:
     * 'Alert', 'Deny', 'Off'.
     */
    @JsonProperty(value = "properties.threatIntelMode")
    private AzureFirewallThreatIntelMode threatIntelMode;

    /**
     * The virtualHub to which the firewall belongs.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /**
     * The firewallPolicy associated with this azure firewall.
     */
    @JsonProperty(value = "properties.firewallPolicy")
    private SubResource firewallPolicy;

    /**
     * IP addresses associated with AzureFirewall.
     */
    @JsonProperty(value = "properties.hubIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private HubIPAddresses hubIpAddresses;

    /**
     * A list of availability zones denoting where the resource needs to come
     * from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get collection of application rule collections used by Azure Firewall.
     *
     * @return the applicationRuleCollections value
     */
    public List<AzureFirewallApplicationRuleCollection> applicationRuleCollections() {
        return this.applicationRuleCollections;
    }

    /**
     * Set collection of application rule collections used by Azure Firewall.
     *
     * @param applicationRuleCollections the applicationRuleCollections value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withApplicationRuleCollections(List<AzureFirewallApplicationRuleCollection> applicationRuleCollections) {
        this.applicationRuleCollections = applicationRuleCollections;
        return this;
    }

    /**
     * Get collection of NAT rule collections used by Azure Firewall.
     *
     * @return the natRuleCollections value
     */
    public List<AzureFirewallNatRuleCollection> natRuleCollections() {
        return this.natRuleCollections;
    }

    /**
     * Set collection of NAT rule collections used by Azure Firewall.
     *
     * @param natRuleCollections the natRuleCollections value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withNatRuleCollections(List<AzureFirewallNatRuleCollection> natRuleCollections) {
        this.natRuleCollections = natRuleCollections;
        return this;
    }

    /**
     * Get collection of network rule collections used by Azure Firewall.
     *
     * @return the networkRuleCollections value
     */
    public List<AzureFirewallNetworkRuleCollection> networkRuleCollections() {
        return this.networkRuleCollections;
    }

    /**
     * Set collection of network rule collections used by Azure Firewall.
     *
     * @param networkRuleCollections the networkRuleCollections value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withNetworkRuleCollections(List<AzureFirewallNetworkRuleCollection> networkRuleCollections) {
        this.networkRuleCollections = networkRuleCollections;
        return this;
    }

    /**
     * Get iP configuration of the Azure Firewall resource.
     *
     * @return the ipConfigurations value
     */
    public List<AzureFirewallIPConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set iP configuration of the Azure Firewall resource.
     *
     * @param ipConfigurations the ipConfigurations value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withIpConfigurations(List<AzureFirewallIPConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the operation mode for Threat Intelligence. Possible values include: 'Alert', 'Deny', 'Off'.
     *
     * @return the threatIntelMode value
     */
    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.threatIntelMode;
    }

    /**
     * Set the operation mode for Threat Intelligence. Possible values include: 'Alert', 'Deny', 'Off'.
     *
     * @param threatIntelMode the threatIntelMode value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.threatIntelMode = threatIntelMode;
        return this;
    }

    /**
     * Get the virtualHub to which the firewall belongs.
     *
     * @return the virtualHub value
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub to which the firewall belongs.
     *
     * @param virtualHub the virtualHub value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the firewallPolicy associated with this azure firewall.
     *
     * @return the firewallPolicy value
     */
    public SubResource firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * Set the firewallPolicy associated with this azure firewall.
     *
     * @param firewallPolicy the firewallPolicy value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withFirewallPolicy(SubResource firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    /**
     * Get iP addresses associated with AzureFirewall.
     *
     * @return the hubIpAddresses value
     */
    public HubIPAddresses hubIpAddresses() {
        return this.hubIpAddresses;
    }

    /**
     * Get a list of availability zones denoting where the resource needs to come from.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set a list of availability zones denoting where the resource needs to come from.
     *
     * @param zones the zones value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withId(String id) {
        this.id = id;
        return this;
    }

}
