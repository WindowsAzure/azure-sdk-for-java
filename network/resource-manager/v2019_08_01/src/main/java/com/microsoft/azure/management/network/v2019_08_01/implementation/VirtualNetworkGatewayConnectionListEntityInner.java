/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import com.microsoft.azure.management.network.v2019_08_01.VirtualNetworkConnectionGatewayReference;
import com.microsoft.azure.management.network.v2019_08_01.VirtualNetworkGatewayConnectionType;
import com.microsoft.azure.management.network.v2019_08_01.VirtualNetworkGatewayConnectionProtocol;
import com.microsoft.azure.management.network.v2019_08_01.VirtualNetworkGatewayConnectionStatus;
import java.util.List;
import com.microsoft.azure.management.network.v2019_08_01.TunnelConnectionHealth;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_08_01.IpsecPolicy;
import com.microsoft.azure.management.network.v2019_08_01.TrafficSelectorPolicy;
import com.microsoft.azure.management.network.v2019_08_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A common class for general resource information.
 */
@JsonFlatten
@SkipParentValidation
public class VirtualNetworkGatewayConnectionListEntityInner extends Resource {
    /**
     * The authorizationKey.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /**
     * The reference to virtual network gateway resource.
     */
    @JsonProperty(value = "properties.virtualNetworkGateway1", required = true)
    private VirtualNetworkConnectionGatewayReference virtualNetworkGateway1;

    /**
     * The reference to virtual network gateway resource.
     */
    @JsonProperty(value = "properties.virtualNetworkGateway2")
    private VirtualNetworkConnectionGatewayReference virtualNetworkGateway2;

    /**
     * The reference to local network gateway resource.
     */
    @JsonProperty(value = "properties.localNetworkGateway2")
    private VirtualNetworkConnectionGatewayReference localNetworkGateway2;

    /**
     * Gateway connection type. Possible values include: 'IPsec', 'Vnet2Vnet',
     * 'ExpressRoute', 'VPNClient'.
     */
    @JsonProperty(value = "properties.connectionType", required = true)
    private VirtualNetworkGatewayConnectionType connectionType;

    /**
     * Connection protocol used for this connection. Possible values include:
     * 'IKEv2', 'IKEv1'.
     */
    @JsonProperty(value = "properties.connectionProtocol")
    private VirtualNetworkGatewayConnectionProtocol connectionProtocol;

    /**
     * The routing weight.
     */
    @JsonProperty(value = "properties.routingWeight")
    private Integer routingWeight;

    /**
     * The IPSec shared key.
     */
    @JsonProperty(value = "properties.sharedKey")
    private String sharedKey;

    /**
     * Virtual Network Gateway connection status. Possible values include:
     * 'Unknown', 'Connecting', 'Connected', 'NotConnected'.
     */
    @JsonProperty(value = "properties.connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkGatewayConnectionStatus connectionStatus;

    /**
     * Collection of all tunnels' connection health status.
     */
    @JsonProperty(value = "properties.tunnelConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private List<TunnelConnectionHealth> tunnelConnectionStatus;

    /**
     * The egress bytes transferred in this connection.
     */
    @JsonProperty(value = "properties.egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /**
     * The ingress bytes transferred in this connection.
     */
    @JsonProperty(value = "properties.ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /**
     * The reference to peerings resource.
     */
    @JsonProperty(value = "properties.peer")
    private SubResource peer;

    /**
     * EnableBgp flag.
     */
    @JsonProperty(value = "properties.enableBgp")
    private Boolean enableBgp;

    /**
     * Enable policy-based traffic selectors.
     */
    @JsonProperty(value = "properties.usePolicyBasedTrafficSelectors")
    private Boolean usePolicyBasedTrafficSelectors;

    /**
     * The IPSec Policies to be considered by this connection.
     */
    @JsonProperty(value = "properties.ipsecPolicies")
    private List<IpsecPolicy> ipsecPolicies;

    /**
     * The Traffic Selector Policies to be considered by this connection.
     */
    @JsonProperty(value = "properties.trafficSelectorPolicies")
    private List<TrafficSelectorPolicy> trafficSelectorPolicies;

    /**
     * The resource GUID property of the virtual network gateway connection
     * resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * The provisioning state of the virtual network gateway connection
     * resource. Possible values include: 'Succeeded', 'Updating', 'Deleting',
     * 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Bypass ExpressRoute Gateway for data forwarding.
     */
    @JsonProperty(value = "properties.expressRouteGatewayBypass")
    private Boolean expressRouteGatewayBypass;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the authorizationKey.
     *
     * @return the authorizationKey value
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey.
     *
     * @param authorizationKey the authorizationKey value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the reference to virtual network gateway resource.
     *
     * @return the virtualNetworkGateway1 value
     */
    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway1() {
        return this.virtualNetworkGateway1;
    }

    /**
     * Set the reference to virtual network gateway resource.
     *
     * @param virtualNetworkGateway1 the virtualNetworkGateway1 value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withVirtualNetworkGateway1(VirtualNetworkConnectionGatewayReference virtualNetworkGateway1) {
        this.virtualNetworkGateway1 = virtualNetworkGateway1;
        return this;
    }

    /**
     * Get the reference to virtual network gateway resource.
     *
     * @return the virtualNetworkGateway2 value
     */
    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway2() {
        return this.virtualNetworkGateway2;
    }

    /**
     * Set the reference to virtual network gateway resource.
     *
     * @param virtualNetworkGateway2 the virtualNetworkGateway2 value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withVirtualNetworkGateway2(VirtualNetworkConnectionGatewayReference virtualNetworkGateway2) {
        this.virtualNetworkGateway2 = virtualNetworkGateway2;
        return this;
    }

    /**
     * Get the reference to local network gateway resource.
     *
     * @return the localNetworkGateway2 value
     */
    public VirtualNetworkConnectionGatewayReference localNetworkGateway2() {
        return this.localNetworkGateway2;
    }

    /**
     * Set the reference to local network gateway resource.
     *
     * @param localNetworkGateway2 the localNetworkGateway2 value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withLocalNetworkGateway2(VirtualNetworkConnectionGatewayReference localNetworkGateway2) {
        this.localNetworkGateway2 = localNetworkGateway2;
        return this;
    }

    /**
     * Get gateway connection type. Possible values include: 'IPsec', 'Vnet2Vnet', 'ExpressRoute', 'VPNClient'.
     *
     * @return the connectionType value
     */
    public VirtualNetworkGatewayConnectionType connectionType() {
        return this.connectionType;
    }

    /**
     * Set gateway connection type. Possible values include: 'IPsec', 'Vnet2Vnet', 'ExpressRoute', 'VPNClient'.
     *
     * @param connectionType the connectionType value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withConnectionType(VirtualNetworkGatewayConnectionType connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Get connection protocol used for this connection. Possible values include: 'IKEv2', 'IKEv1'.
     *
     * @return the connectionProtocol value
     */
    public VirtualNetworkGatewayConnectionProtocol connectionProtocol() {
        return this.connectionProtocol;
    }

    /**
     * Set connection protocol used for this connection. Possible values include: 'IKEv2', 'IKEv1'.
     *
     * @param connectionProtocol the connectionProtocol value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withConnectionProtocol(VirtualNetworkGatewayConnectionProtocol connectionProtocol) {
        this.connectionProtocol = connectionProtocol;
        return this;
    }

    /**
     * Get the routing weight.
     *
     * @return the routingWeight value
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routing weight.
     *
     * @param routingWeight the routingWeight value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }

    /**
     * Get the IPSec shared key.
     *
     * @return the sharedKey value
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the IPSec shared key.
     *
     * @param sharedKey the sharedKey value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get virtual Network Gateway connection status. Possible values include: 'Unknown', 'Connecting', 'Connected', 'NotConnected'.
     *
     * @return the connectionStatus value
     */
    public VirtualNetworkGatewayConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get collection of all tunnels' connection health status.
     *
     * @return the tunnelConnectionStatus value
     */
    public List<TunnelConnectionHealth> tunnelConnectionStatus() {
        return this.tunnelConnectionStatus;
    }

    /**
     * Get the egress bytes transferred in this connection.
     *
     * @return the egressBytesTransferred value
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the ingress bytes transferred in this connection.
     *
     * @return the ingressBytesTransferred value
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the reference to peerings resource.
     *
     * @return the peer value
     */
    public SubResource peer() {
        return this.peer;
    }

    /**
     * Set the reference to peerings resource.
     *
     * @param peer the peer value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withPeer(SubResource peer) {
        this.peer = peer;
        return this;
    }

    /**
     * Get enableBgp flag.
     *
     * @return the enableBgp value
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set enableBgp flag.
     *
     * @param enableBgp the enableBgp value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get enable policy-based traffic selectors.
     *
     * @return the usePolicyBasedTrafficSelectors value
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }

    /**
     * Set enable policy-based traffic selectors.
     *
     * @param usePolicyBasedTrafficSelectors the usePolicyBasedTrafficSelectors value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        return this;
    }

    /**
     * Get the IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.ipsecPolicies;
    }

    /**
     * Set the IPSec Policies to be considered by this connection.
     *
     * @param ipsecPolicies the ipsecPolicies value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.ipsecPolicies = ipsecPolicies;
        return this;
    }

    /**
     * Get the Traffic Selector Policies to be considered by this connection.
     *
     * @return the trafficSelectorPolicies value
     */
    public List<TrafficSelectorPolicy> trafficSelectorPolicies() {
        return this.trafficSelectorPolicies;
    }

    /**
     * Set the Traffic Selector Policies to be considered by this connection.
     *
     * @param trafficSelectorPolicies the trafficSelectorPolicies value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withTrafficSelectorPolicies(List<TrafficSelectorPolicy> trafficSelectorPolicies) {
        this.trafficSelectorPolicies = trafficSelectorPolicies;
        return this;
    }

    /**
     * Get the resource GUID property of the virtual network gateway connection resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resource GUID property of the virtual network gateway connection resource.
     *
     * @param resourceGuid the resourceGuid value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioning state of the virtual network gateway connection resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get bypass ExpressRoute Gateway for data forwarding.
     *
     * @return the expressRouteGatewayBypass value
     */
    public Boolean expressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
    }

    /**
     * Set bypass ExpressRoute Gateway for data forwarding.
     *
     * @param expressRouteGatewayBypass the expressRouteGatewayBypass value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withExpressRouteGatewayBypass(Boolean expressRouteGatewayBypass) {
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
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
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withEtag(String etag) {
        this.etag = etag;
        return this;
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
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withId(String id) {
        this.id = id;
        return this;
    }

}
