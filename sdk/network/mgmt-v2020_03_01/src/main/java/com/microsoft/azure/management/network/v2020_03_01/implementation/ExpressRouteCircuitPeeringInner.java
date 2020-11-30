/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.management.network.v2020_03_01.ExpressRoutePeeringType;
import com.microsoft.azure.management.network.v2020_03_01.ExpressRoutePeeringState;
import com.microsoft.azure.management.network.v2020_03_01.ExpressRouteCircuitPeeringConfig;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_03_01.Ipv6ExpressRouteCircuitPeeringConfig;
import com.microsoft.azure.management.network.v2020_03_01.ExpressRouteConnectionId;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Peering in an ExpressRouteCircuit resource.
 */
@JsonFlatten
public class ExpressRouteCircuitPeeringInner extends SubResource {
    /**
     * The peering type. Possible values include: 'AzurePublicPeering',
     * 'AzurePrivatePeering', 'MicrosoftPeering'.
     */
    @JsonProperty(value = "properties.peeringType")
    private ExpressRoutePeeringType peeringType;

    /**
     * The peering state. Possible values include: 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "properties.state")
    private ExpressRoutePeeringState state;

    /**
     * The Azure ASN.
     */
    @JsonProperty(value = "properties.azureASN")
    private Integer azureASN;

    /**
     * The peer ASN.
     */
    @JsonProperty(value = "properties.peerASN")
    private Long peerASN;

    /**
     * The primary address prefix.
     */
    @JsonProperty(value = "properties.primaryPeerAddressPrefix")
    private String primaryPeerAddressPrefix;

    /**
     * The secondary address prefix.
     */
    @JsonProperty(value = "properties.secondaryPeerAddressPrefix")
    private String secondaryPeerAddressPrefix;

    /**
     * The primary port.
     */
    @JsonProperty(value = "properties.primaryAzurePort")
    private String primaryAzurePort;

    /**
     * The secondary port.
     */
    @JsonProperty(value = "properties.secondaryAzurePort")
    private String secondaryAzurePort;

    /**
     * The shared key.
     */
    @JsonProperty(value = "properties.sharedKey")
    private String sharedKey;

    /**
     * The VLAN ID.
     */
    @JsonProperty(value = "properties.vlanId")
    private Integer vlanId;

    /**
     * The Microsoft peering configuration.
     */
    @JsonProperty(value = "properties.microsoftPeeringConfig")
    private ExpressRouteCircuitPeeringConfig microsoftPeeringConfig;

    /**
     * The peering stats of express route circuit.
     */
    @JsonProperty(value = "properties.stats")
    private ExpressRouteCircuitStatsInner stats;

    /**
     * The provisioning state of the express route circuit peering resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The GatewayManager Etag.
     */
    @JsonProperty(value = "properties.gatewayManagerEtag")
    private String gatewayManagerEtag;

    /**
     * Who was the last to modify the peering.
     */
    @JsonProperty(value = "properties.lastModifiedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String lastModifiedBy;

    /**
     * The reference to the RouteFilter resource.
     */
    @JsonProperty(value = "properties.routeFilter")
    private SubResource routeFilter;

    /**
     * The IPv6 peering configuration.
     */
    @JsonProperty(value = "properties.ipv6PeeringConfig")
    private Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig;

    /**
     * The ExpressRoute connection.
     */
    @JsonProperty(value = "properties.expressRouteConnection")
    private ExpressRouteConnectionId expressRouteConnection;

    /**
     * The list of circuit connections associated with Azure Private Peering
     * for this circuit.
     */
    @JsonProperty(value = "properties.connections")
    private List<ExpressRouteCircuitConnectionInner> connections;

    /**
     * The list of peered circuit connections associated with Azure Private
     * Peering for this circuit.
     */
    @JsonProperty(value = "properties.peeredConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PeerExpressRouteCircuitConnectionInner> peeredConnections;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the peering type. Possible values include: 'AzurePublicPeering', 'AzurePrivatePeering', 'MicrosoftPeering'.
     *
     * @return the peeringType value
     */
    public ExpressRoutePeeringType peeringType() {
        return this.peeringType;
    }

    /**
     * Set the peering type. Possible values include: 'AzurePublicPeering', 'AzurePrivatePeering', 'MicrosoftPeering'.
     *
     * @param peeringType the peeringType value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withPeeringType(ExpressRoutePeeringType peeringType) {
        this.peeringType = peeringType;
        return this;
    }

    /**
     * Get the peering state. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the state value
     */
    public ExpressRoutePeeringState state() {
        return this.state;
    }

    /**
     * Set the peering state. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param state the state value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withState(ExpressRoutePeeringState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the Azure ASN.
     *
     * @return the azureASN value
     */
    public Integer azureASN() {
        return this.azureASN;
    }

    /**
     * Set the Azure ASN.
     *
     * @param azureASN the azureASN value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withAzureASN(Integer azureASN) {
        this.azureASN = azureASN;
        return this;
    }

    /**
     * Get the peer ASN.
     *
     * @return the peerASN value
     */
    public Long peerASN() {
        return this.peerASN;
    }

    /**
     * Set the peer ASN.
     *
     * @param peerASN the peerASN value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withPeerASN(Long peerASN) {
        this.peerASN = peerASN;
        return this;
    }

    /**
     * Get the primary address prefix.
     *
     * @return the primaryPeerAddressPrefix value
     */
    public String primaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix;
    }

    /**
     * Set the primary address prefix.
     *
     * @param primaryPeerAddressPrefix the primaryPeerAddressPrefix value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the secondary address prefix.
     *
     * @return the secondaryPeerAddressPrefix value
     */
    public String secondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix;
    }

    /**
     * Set the secondary address prefix.
     *
     * @param secondaryPeerAddressPrefix the secondaryPeerAddressPrefix value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the primary port.
     *
     * @return the primaryAzurePort value
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Set the primary port.
     *
     * @param primaryAzurePort the primaryAzurePort value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withPrimaryAzurePort(String primaryAzurePort) {
        this.primaryAzurePort = primaryAzurePort;
        return this;
    }

    /**
     * Get the secondary port.
     *
     * @return the secondaryAzurePort value
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Set the secondary port.
     *
     * @param secondaryAzurePort the secondaryAzurePort value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withSecondaryAzurePort(String secondaryAzurePort) {
        this.secondaryAzurePort = secondaryAzurePort;
        return this;
    }

    /**
     * Get the shared key.
     *
     * @return the sharedKey value
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the shared key.
     *
     * @param sharedKey the sharedKey value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the VLAN ID.
     *
     * @return the vlanId value
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    /**
     * Set the VLAN ID.
     *
     * @param vlanId the vlanId value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get the Microsoft peering configuration.
     *
     * @return the microsoftPeeringConfig value
     */
    public ExpressRouteCircuitPeeringConfig microsoftPeeringConfig() {
        return this.microsoftPeeringConfig;
    }

    /**
     * Set the Microsoft peering configuration.
     *
     * @param microsoftPeeringConfig the microsoftPeeringConfig value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig) {
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        return this;
    }

    /**
     * Get the peering stats of express route circuit.
     *
     * @return the stats value
     */
    public ExpressRouteCircuitStatsInner stats() {
        return this.stats;
    }

    /**
     * Set the peering stats of express route circuit.
     *
     * @param stats the stats value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withStats(ExpressRouteCircuitStatsInner stats) {
        this.stats = stats;
        return this;
    }

    /**
     * Get the provisioning state of the express route circuit peering resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the GatewayManager Etag.
     *
     * @return the gatewayManagerEtag value
     */
    public String gatewayManagerEtag() {
        return this.gatewayManagerEtag;
    }

    /**
     * Set the GatewayManager Etag.
     *
     * @param gatewayManagerEtag the gatewayManagerEtag value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withGatewayManagerEtag(String gatewayManagerEtag) {
        this.gatewayManagerEtag = gatewayManagerEtag;
        return this;
    }

    /**
     * Get who was the last to modify the peering.
     *
     * @return the lastModifiedBy value
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Get the reference to the RouteFilter resource.
     *
     * @return the routeFilter value
     */
    public SubResource routeFilter() {
        return this.routeFilter;
    }

    /**
     * Set the reference to the RouteFilter resource.
     *
     * @param routeFilter the routeFilter value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withRouteFilter(SubResource routeFilter) {
        this.routeFilter = routeFilter;
        return this;
    }

    /**
     * Get the IPv6 peering configuration.
     *
     * @return the ipv6PeeringConfig value
     */
    public Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig() {
        return this.ipv6PeeringConfig;
    }

    /**
     * Set the IPv6 peering configuration.
     *
     * @param ipv6PeeringConfig the ipv6PeeringConfig value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig) {
        this.ipv6PeeringConfig = ipv6PeeringConfig;
        return this;
    }

    /**
     * Get the ExpressRoute connection.
     *
     * @return the expressRouteConnection value
     */
    public ExpressRouteConnectionId expressRouteConnection() {
        return this.expressRouteConnection;
    }

    /**
     * Set the ExpressRoute connection.
     *
     * @param expressRouteConnection the expressRouteConnection value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withExpressRouteConnection(ExpressRouteConnectionId expressRouteConnection) {
        this.expressRouteConnection = expressRouteConnection;
        return this;
    }

    /**
     * Get the list of circuit connections associated with Azure Private Peering for this circuit.
     *
     * @return the connections value
     */
    public List<ExpressRouteCircuitConnectionInner> connections() {
        return this.connections;
    }

    /**
     * Set the list of circuit connections associated with Azure Private Peering for this circuit.
     *
     * @param connections the connections value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withConnections(List<ExpressRouteCircuitConnectionInner> connections) {
        this.connections = connections;
        return this;
    }

    /**
     * Get the list of peered circuit connections associated with Azure Private Peering for this circuit.
     *
     * @return the peeredConnections value
     */
    public List<PeerExpressRouteCircuitConnectionInner> peeredConnections() {
        return this.peeredConnections;
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
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withName(String name) {
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
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
