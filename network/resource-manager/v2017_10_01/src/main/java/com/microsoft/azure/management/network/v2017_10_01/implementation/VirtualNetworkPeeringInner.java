/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2017_10_01.AddressSpace;
import com.microsoft.azure.management.network.v2017_10_01.VirtualNetworkPeeringState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Peerings in a virtual network resource.
 */
@JsonFlatten
public class VirtualNetworkPeeringInner extends SubResource {
    /**
     * Whether the VMs in the linked virtual network space would be able to
     * access all the VMs in local Virtual network space.
     */
    @JsonProperty(value = "properties.allowVirtualNetworkAccess")
    private Boolean allowVirtualNetworkAccess;

    /**
     * Whether the forwarded traffic from the VMs in the remote virtual network
     * will be allowed/disallowed.
     */
    @JsonProperty(value = "properties.allowForwardedTraffic")
    private Boolean allowForwardedTraffic;

    /**
     * If gateway links can be used in remote virtual networking to link to
     * this virtual network.
     */
    @JsonProperty(value = "properties.allowGatewayTransit")
    private Boolean allowGatewayTransit;

    /**
     * If remote gateways can be used on this virtual network. If the flag is
     * set to true, and allowGatewayTransit on remote peering is also true,
     * virtual network will use gateways of remote virtual network for transit.
     * Only one peering can have this flag set to true. This flag cannot be set
     * if virtual network already has a gateway.
     */
    @JsonProperty(value = "properties.useRemoteGateways")
    private Boolean useRemoteGateways;

    /**
     * The reference of the remote virtual network. The remote virtual network
     * can be in the same or different region (preview). See here to register
     * for the preview and learn more
     * (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     */
    @JsonProperty(value = "properties.remoteVirtualNetwork")
    private SubResource remoteVirtualNetwork;

    /**
     * The reference of the remote virtual network address space.
     */
    @JsonProperty(value = "properties.remoteAddressSpace")
    private AddressSpace remoteAddressSpace;

    /**
     * The status of the virtual network peering. Possible values are
     * 'Initiated', 'Connected', and 'Disconnected'. Possible values include:
     * 'Initiated', 'Connected', 'Disconnected'.
     */
    @JsonProperty(value = "properties.peeringState")
    private VirtualNetworkPeeringState peeringState;

    /**
     * The provisioning state of the resource.
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
     * Get the allowVirtualNetworkAccess value.
     *
     * @return the allowVirtualNetworkAccess value
     */
    public Boolean allowVirtualNetworkAccess() {
        return this.allowVirtualNetworkAccess;
    }

    /**
     * Set the allowVirtualNetworkAccess value.
     *
     * @param allowVirtualNetworkAccess the allowVirtualNetworkAccess value to set
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess) {
        this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
        return this;
    }

    /**
     * Get the allowForwardedTraffic value.
     *
     * @return the allowForwardedTraffic value
     */
    public Boolean allowForwardedTraffic() {
        return this.allowForwardedTraffic;
    }

    /**
     * Set the allowForwardedTraffic value.
     *
     * @param allowForwardedTraffic the allowForwardedTraffic value to set
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withAllowForwardedTraffic(Boolean allowForwardedTraffic) {
        this.allowForwardedTraffic = allowForwardedTraffic;
        return this;
    }

    /**
     * Get the allowGatewayTransit value.
     *
     * @return the allowGatewayTransit value
     */
    public Boolean allowGatewayTransit() {
        return this.allowGatewayTransit;
    }

    /**
     * Set the allowGatewayTransit value.
     *
     * @param allowGatewayTransit the allowGatewayTransit value to set
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withAllowGatewayTransit(Boolean allowGatewayTransit) {
        this.allowGatewayTransit = allowGatewayTransit;
        return this;
    }

    /**
     * Get the useRemoteGateways value.
     *
     * @return the useRemoteGateways value
     */
    public Boolean useRemoteGateways() {
        return this.useRemoteGateways;
    }

    /**
     * Set the useRemoteGateways value.
     *
     * @param useRemoteGateways the useRemoteGateways value to set
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withUseRemoteGateways(Boolean useRemoteGateways) {
        this.useRemoteGateways = useRemoteGateways;
        return this;
    }

    /**
     * Get the remoteVirtualNetwork value.
     *
     * @return the remoteVirtualNetwork value
     */
    public SubResource remoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }

    /**
     * Set the remoteVirtualNetwork value.
     *
     * @param remoteVirtualNetwork the remoteVirtualNetwork value to set
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withRemoteVirtualNetwork(SubResource remoteVirtualNetwork) {
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        return this;
    }

    /**
     * Get the remoteAddressSpace value.
     *
     * @return the remoteAddressSpace value
     */
    public AddressSpace remoteAddressSpace() {
        return this.remoteAddressSpace;
    }

    /**
     * Set the remoteAddressSpace value.
     *
     * @param remoteAddressSpace the remoteAddressSpace value to set
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withRemoteAddressSpace(AddressSpace remoteAddressSpace) {
        this.remoteAddressSpace = remoteAddressSpace;
        return this;
    }

    /**
     * Get the peeringState value.
     *
     * @return the peeringState value
     */
    public VirtualNetworkPeeringState peeringState() {
        return this.peeringState;
    }

    /**
     * Set the peeringState value.
     *
     * @param peeringState the peeringState value to set
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withPeeringState(VirtualNetworkPeeringState peeringState) {
        this.peeringState = peeringState;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
