/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_07_01.implementation.VirtualNetworkPeeringInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_07_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;

/**
 * Type representing VirtualNetworkPeering.
 */
public interface VirtualNetworkPeering extends HasInner<VirtualNetworkPeeringInner>, Indexable, Refreshable<VirtualNetworkPeering>, Updatable<VirtualNetworkPeering.Update>, HasManager<NetworkManager> {
    /**
     * @return the allowForwardedTraffic value.
     */
    Boolean allowForwardedTraffic();

    /**
     * @return the allowGatewayTransit value.
     */
    Boolean allowGatewayTransit();

    /**
     * @return the allowVirtualNetworkAccess value.
     */
    Boolean allowVirtualNetworkAccess();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the peeringState value.
     */
    VirtualNetworkPeeringState peeringState();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the remoteAddressSpace value.
     */
    AddressSpace remoteAddressSpace();

    /**
     * @return the remoteBgpCommunities value.
     */
    VirtualNetworkBgpCommunities remoteBgpCommunities();

    /**
     * @return the remoteVirtualNetwork value.
     */
    SubResource remoteVirtualNetwork();

    /**
     * @return the useRemoteGateways value.
     */
    Boolean useRemoteGateways();

    /**
     * The entirety of the VirtualNetworkPeering definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualNetwork, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualNetworkPeering definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualNetworkPeering definition.
         */
        interface Blank extends WithVirtualNetwork {
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify VirtualNetwork.
         */
        interface WithVirtualNetwork {
           /**
            * Specifies resourceGroupName, virtualNetworkName.
            * @param resourceGroupName The name of the resource group
            * @param virtualNetworkName The name of the virtual network
            * @return the next definition stage
            */
            WithCreate withExistingVirtualNetwork(String resourceGroupName, String virtualNetworkName);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify AllowForwardedTraffic.
         */
        interface WithAllowForwardedTraffic {
            /**
             * Specifies allowForwardedTraffic.
             * @param allowForwardedTraffic Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network
             * @return the next definition stage
             */
            WithCreate withAllowForwardedTraffic(Boolean allowForwardedTraffic);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify AllowGatewayTransit.
         */
        interface WithAllowGatewayTransit {
            /**
             * Specifies allowGatewayTransit.
             * @param allowGatewayTransit If gateway links can be used in remote virtual networking to link to this virtual network
             * @return the next definition stage
             */
            WithCreate withAllowGatewayTransit(Boolean allowGatewayTransit);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify AllowVirtualNetworkAccess.
         */
        interface WithAllowVirtualNetworkAccess {
            /**
             * Specifies allowVirtualNetworkAccess.
             * @param allowVirtualNetworkAccess Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space
             * @return the next definition stage
             */
            WithCreate withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify PeeringState.
         */
        interface WithPeeringState {
            /**
             * Specifies peeringState.
             * @param peeringState The status of the virtual network peering. Possible values include: 'Initiated', 'Connected', 'Disconnected'
             * @return the next definition stage
             */
            WithCreate withPeeringState(VirtualNetworkPeeringState peeringState);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify RemoteAddressSpace.
         */
        interface WithRemoteAddressSpace {
            /**
             * Specifies remoteAddressSpace.
             * @param remoteAddressSpace The reference to the remote virtual network address space
             * @return the next definition stage
             */
            WithCreate withRemoteAddressSpace(AddressSpace remoteAddressSpace);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify RemoteBgpCommunities.
         */
        interface WithRemoteBgpCommunities {
            /**
             * Specifies remoteBgpCommunities.
             * @param remoteBgpCommunities The reference to the remote virtual network's Bgp Communities
             * @return the next definition stage
             */
            WithCreate withRemoteBgpCommunities(VirtualNetworkBgpCommunities remoteBgpCommunities);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify RemoteVirtualNetwork.
         */
        interface WithRemoteVirtualNetwork {
            /**
             * Specifies remoteVirtualNetwork.
             * @param remoteVirtualNetwork The reference to the remote virtual network. The remote virtual network can be in the same or different region (preview). See here to register for the preview and learn more (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering)
             * @return the next definition stage
             */
            WithCreate withRemoteVirtualNetwork(SubResource remoteVirtualNetwork);
        }

        /**
         * The stage of the virtualnetworkpeering definition allowing to specify UseRemoteGateways.
         */
        interface WithUseRemoteGateways {
            /**
             * Specifies useRemoteGateways.
             * @param useRemoteGateways If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway
             * @return the next definition stage
             */
            WithCreate withUseRemoteGateways(Boolean useRemoteGateways);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualNetworkPeering>, DefinitionStages.WithAllowForwardedTraffic, DefinitionStages.WithAllowGatewayTransit, DefinitionStages.WithAllowVirtualNetworkAccess, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithPeeringState, DefinitionStages.WithRemoteAddressSpace, DefinitionStages.WithRemoteBgpCommunities, DefinitionStages.WithRemoteVirtualNetwork, DefinitionStages.WithUseRemoteGateways {
        }
    }
    /**
     * The template for a VirtualNetworkPeering update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualNetworkPeering>, UpdateStages.WithAllowForwardedTraffic, UpdateStages.WithAllowGatewayTransit, UpdateStages.WithAllowVirtualNetworkAccess, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithPeeringState, UpdateStages.WithRemoteAddressSpace, UpdateStages.WithRemoteBgpCommunities, UpdateStages.WithRemoteVirtualNetwork, UpdateStages.WithUseRemoteGateways {
    }

    /**
     * Grouping of VirtualNetworkPeering update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualnetworkpeering update allowing to specify AllowForwardedTraffic.
         */
        interface WithAllowForwardedTraffic {
            /**
             * Specifies allowForwardedTraffic.
             * @param allowForwardedTraffic Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network
             * @return the next update stage
             */
            Update withAllowForwardedTraffic(Boolean allowForwardedTraffic);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify AllowGatewayTransit.
         */
        interface WithAllowGatewayTransit {
            /**
             * Specifies allowGatewayTransit.
             * @param allowGatewayTransit If gateway links can be used in remote virtual networking to link to this virtual network
             * @return the next update stage
             */
            Update withAllowGatewayTransit(Boolean allowGatewayTransit);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify AllowVirtualNetworkAccess.
         */
        interface WithAllowVirtualNetworkAccess {
            /**
             * Specifies allowVirtualNetworkAccess.
             * @param allowVirtualNetworkAccess Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space
             * @return the next update stage
             */
            Update withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify PeeringState.
         */
        interface WithPeeringState {
            /**
             * Specifies peeringState.
             * @param peeringState The status of the virtual network peering. Possible values include: 'Initiated', 'Connected', 'Disconnected'
             * @return the next update stage
             */
            Update withPeeringState(VirtualNetworkPeeringState peeringState);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify RemoteAddressSpace.
         */
        interface WithRemoteAddressSpace {
            /**
             * Specifies remoteAddressSpace.
             * @param remoteAddressSpace The reference to the remote virtual network address space
             * @return the next update stage
             */
            Update withRemoteAddressSpace(AddressSpace remoteAddressSpace);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify RemoteBgpCommunities.
         */
        interface WithRemoteBgpCommunities {
            /**
             * Specifies remoteBgpCommunities.
             * @param remoteBgpCommunities The reference to the remote virtual network's Bgp Communities
             * @return the next update stage
             */
            Update withRemoteBgpCommunities(VirtualNetworkBgpCommunities remoteBgpCommunities);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify RemoteVirtualNetwork.
         */
        interface WithRemoteVirtualNetwork {
            /**
             * Specifies remoteVirtualNetwork.
             * @param remoteVirtualNetwork The reference to the remote virtual network. The remote virtual network can be in the same or different region (preview). See here to register for the preview and learn more (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering)
             * @return the next update stage
             */
            Update withRemoteVirtualNetwork(SubResource remoteVirtualNetwork);
        }

        /**
         * The stage of the virtualnetworkpeering update allowing to specify UseRemoteGateways.
         */
        interface WithUseRemoteGateways {
            /**
             * Specifies useRemoteGateways.
             * @param useRemoteGateways If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway
             * @return the next update stage
             */
            Update withUseRemoteGateways(Boolean useRemoteGateways);
        }

    }
}
