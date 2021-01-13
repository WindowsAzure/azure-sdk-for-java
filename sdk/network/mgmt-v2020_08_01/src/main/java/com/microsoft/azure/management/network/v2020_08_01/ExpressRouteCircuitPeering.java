/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_08_01.implementation.ExpressRouteCircuitPeeringInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_08_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2020_08_01.implementation.ExpressRouteCircuitConnectionInner;
import com.microsoft.azure.management.network.v2020_08_01.implementation.ExpressRouteCircuitStatsInner;

/**
 * Type representing ExpressRouteCircuitPeering.
 */
public interface ExpressRouteCircuitPeering extends HasInner<ExpressRouteCircuitPeeringInner>, Indexable, Refreshable<ExpressRouteCircuitPeering>, Updatable<ExpressRouteCircuitPeering.Update>, HasManager<NetworkManager> {
    /**
     * @return the azureASN value.
     */
    Integer azureASN();

    /**
     * @return the connections value.
     */
    List<ExpressRouteCircuitConnection> connections();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the expressRouteConnection value.
     */
    ExpressRouteConnectionId expressRouteConnection();

    /**
     * @return the gatewayManagerEtag value.
     */
    String gatewayManagerEtag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ipv6PeeringConfig value.
     */
    Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig();

    /**
     * @return the lastModifiedBy value.
     */
    String lastModifiedBy();

    /**
     * @return the microsoftPeeringConfig value.
     */
    ExpressRouteCircuitPeeringConfig microsoftPeeringConfig();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the peerASN value.
     */
    Long peerASN();

    /**
     * @return the peeredConnections value.
     */
    List<PeerExpressRouteCircuitConnection> peeredConnections();

    /**
     * @return the peeringType value.
     */
    ExpressRoutePeeringType peeringType();

    /**
     * @return the primaryAzurePort value.
     */
    String primaryAzurePort();

    /**
     * @return the primaryPeerAddressPrefix value.
     */
    String primaryPeerAddressPrefix();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the routeFilter value.
     */
    SubResource routeFilter();

    /**
     * @return the secondaryAzurePort value.
     */
    String secondaryAzurePort();

    /**
     * @return the secondaryPeerAddressPrefix value.
     */
    String secondaryPeerAddressPrefix();

    /**
     * @return the sharedKey value.
     */
    String sharedKey();

    /**
     * @return the state value.
     */
    ExpressRoutePeeringState state();

    /**
     * @return the stats value.
     */
    ExpressRouteCircuitStats stats();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vlanId value.
     */
    Integer vlanId();

    /**
     * The entirety of the ExpressRouteCircuitPeering definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithExpressRouteCircuit, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ExpressRouteCircuitPeering definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ExpressRouteCircuitPeering definition.
         */
        interface Blank extends WithExpressRouteCircuit {
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify ExpressRouteCircuit.
         */
        interface WithExpressRouteCircuit {
           /**
            * Specifies resourceGroupName, circuitName.
            * @param resourceGroupName The name of the resource group
            * @param circuitName The name of the express route circuit
            * @return the next definition stage
            */
            WithCreate withExistingExpressRouteCircuit(String resourceGroupName, String circuitName);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify AzureASN.
         */
        interface WithAzureASN {
            /**
             * Specifies azureASN.
             * @param azureASN The Azure ASN
             * @return the next definition stage
             */
            WithCreate withAzureASN(Integer azureASN);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify Connections.
         */
        interface WithConnections {
            /**
             * Specifies connections.
             * @param connections The list of circuit connections associated with Azure Private Peering for this circuit
             * @return the next definition stage
             */
            WithCreate withConnections(List<ExpressRouteCircuitConnectionInner> connections);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify ExpressRouteConnection.
         */
        interface WithExpressRouteConnection {
            /**
             * Specifies expressRouteConnection.
             * @param expressRouteConnection The ExpressRoute connection
             * @return the next definition stage
             */
            WithCreate withExpressRouteConnection(ExpressRouteConnectionId expressRouteConnection);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify GatewayManagerEtag.
         */
        interface WithGatewayManagerEtag {
            /**
             * Specifies gatewayManagerEtag.
             * @param gatewayManagerEtag The GatewayManager Etag
             * @return the next definition stage
             */
            WithCreate withGatewayManagerEtag(String gatewayManagerEtag);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify Id.
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
         * The stage of the expressroutecircuitpeering definition allowing to specify Ipv6PeeringConfig.
         */
        interface WithIpv6PeeringConfig {
            /**
             * Specifies ipv6PeeringConfig.
             * @param ipv6PeeringConfig The IPv6 peering configuration
             * @return the next definition stage
             */
            WithCreate withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify MicrosoftPeeringConfig.
         */
        interface WithMicrosoftPeeringConfig {
            /**
             * Specifies microsoftPeeringConfig.
             * @param microsoftPeeringConfig The Microsoft peering configuration
             * @return the next definition stage
             */
            WithCreate withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify Name.
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
         * The stage of the expressroutecircuitpeering definition allowing to specify PeerASN.
         */
        interface WithPeerASN {
            /**
             * Specifies peerASN.
             * @param peerASN The peer ASN
             * @return the next definition stage
             */
            WithCreate withPeerASN(Long peerASN);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify PeeringType.
         */
        interface WithPeeringType {
            /**
             * Specifies peeringType.
             * @param peeringType The peering type. Possible values include: 'AzurePublicPeering', 'AzurePrivatePeering', 'MicrosoftPeering'
             * @return the next definition stage
             */
            WithCreate withPeeringType(ExpressRoutePeeringType peeringType);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify PrimaryAzurePort.
         */
        interface WithPrimaryAzurePort {
            /**
             * Specifies primaryAzurePort.
             * @param primaryAzurePort The primary port
             * @return the next definition stage
             */
            WithCreate withPrimaryAzurePort(String primaryAzurePort);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify PrimaryPeerAddressPrefix.
         */
        interface WithPrimaryPeerAddressPrefix {
            /**
             * Specifies primaryPeerAddressPrefix.
             * @param primaryPeerAddressPrefix The primary address prefix
             * @return the next definition stage
             */
            WithCreate withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify RouteFilter.
         */
        interface WithRouteFilter {
            /**
             * Specifies routeFilter.
             * @param routeFilter The reference to the RouteFilter resource
             * @return the next definition stage
             */
            WithCreate withRouteFilter(SubResource routeFilter);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify SecondaryAzurePort.
         */
        interface WithSecondaryAzurePort {
            /**
             * Specifies secondaryAzurePort.
             * @param secondaryAzurePort The secondary port
             * @return the next definition stage
             */
            WithCreate withSecondaryAzurePort(String secondaryAzurePort);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify SecondaryPeerAddressPrefix.
         */
        interface WithSecondaryPeerAddressPrefix {
            /**
             * Specifies secondaryPeerAddressPrefix.
             * @param secondaryPeerAddressPrefix The secondary address prefix
             * @return the next definition stage
             */
            WithCreate withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             * @param sharedKey The shared key
             * @return the next definition stage
             */
            WithCreate withSharedKey(String sharedKey);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             * @param state The peering state. Possible values include: 'Disabled', 'Enabled'
             * @return the next definition stage
             */
            WithCreate withState(ExpressRoutePeeringState state);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify Stats.
         */
        interface WithStats {
            /**
             * Specifies stats.
             * @param stats The peering stats of express route circuit
             * @return the next definition stage
             */
            WithCreate withStats(ExpressRouteCircuitStatsInner stats);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify VlanId.
         */
        interface WithVlanId {
            /**
             * Specifies vlanId.
             * @param vlanId The VLAN ID
             * @return the next definition stage
             */
            WithCreate withVlanId(Integer vlanId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ExpressRouteCircuitPeering>, DefinitionStages.WithAzureASN, DefinitionStages.WithConnections, DefinitionStages.WithExpressRouteConnection, DefinitionStages.WithGatewayManagerEtag, DefinitionStages.WithId, DefinitionStages.WithIpv6PeeringConfig, DefinitionStages.WithMicrosoftPeeringConfig, DefinitionStages.WithName, DefinitionStages.WithPeerASN, DefinitionStages.WithPeeringType, DefinitionStages.WithPrimaryAzurePort, DefinitionStages.WithPrimaryPeerAddressPrefix, DefinitionStages.WithRouteFilter, DefinitionStages.WithSecondaryAzurePort, DefinitionStages.WithSecondaryPeerAddressPrefix, DefinitionStages.WithSharedKey, DefinitionStages.WithState, DefinitionStages.WithStats, DefinitionStages.WithVlanId {
        }
    }
    /**
     * The template for a ExpressRouteCircuitPeering update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ExpressRouteCircuitPeering>, UpdateStages.WithAzureASN, UpdateStages.WithConnections, UpdateStages.WithExpressRouteConnection, UpdateStages.WithGatewayManagerEtag, UpdateStages.WithId, UpdateStages.WithIpv6PeeringConfig, UpdateStages.WithMicrosoftPeeringConfig, UpdateStages.WithName, UpdateStages.WithPeerASN, UpdateStages.WithPeeringType, UpdateStages.WithPrimaryAzurePort, UpdateStages.WithPrimaryPeerAddressPrefix, UpdateStages.WithRouteFilter, UpdateStages.WithSecondaryAzurePort, UpdateStages.WithSecondaryPeerAddressPrefix, UpdateStages.WithSharedKey, UpdateStages.WithState, UpdateStages.WithStats, UpdateStages.WithVlanId {
    }

    /**
     * Grouping of ExpressRouteCircuitPeering update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the expressroutecircuitpeering update allowing to specify AzureASN.
         */
        interface WithAzureASN {
            /**
             * Specifies azureASN.
             * @param azureASN The Azure ASN
             * @return the next update stage
             */
            Update withAzureASN(Integer azureASN);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify Connections.
         */
        interface WithConnections {
            /**
             * Specifies connections.
             * @param connections The list of circuit connections associated with Azure Private Peering for this circuit
             * @return the next update stage
             */
            Update withConnections(List<ExpressRouteCircuitConnectionInner> connections);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify ExpressRouteConnection.
         */
        interface WithExpressRouteConnection {
            /**
             * Specifies expressRouteConnection.
             * @param expressRouteConnection The ExpressRoute connection
             * @return the next update stage
             */
            Update withExpressRouteConnection(ExpressRouteConnectionId expressRouteConnection);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify GatewayManagerEtag.
         */
        interface WithGatewayManagerEtag {
            /**
             * Specifies gatewayManagerEtag.
             * @param gatewayManagerEtag The GatewayManager Etag
             * @return the next update stage
             */
            Update withGatewayManagerEtag(String gatewayManagerEtag);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify Id.
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
         * The stage of the expressroutecircuitpeering update allowing to specify Ipv6PeeringConfig.
         */
        interface WithIpv6PeeringConfig {
            /**
             * Specifies ipv6PeeringConfig.
             * @param ipv6PeeringConfig The IPv6 peering configuration
             * @return the next update stage
             */
            Update withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify MicrosoftPeeringConfig.
         */
        interface WithMicrosoftPeeringConfig {
            /**
             * Specifies microsoftPeeringConfig.
             * @param microsoftPeeringConfig The Microsoft peering configuration
             * @return the next update stage
             */
            Update withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify Name.
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
         * The stage of the expressroutecircuitpeering update allowing to specify PeerASN.
         */
        interface WithPeerASN {
            /**
             * Specifies peerASN.
             * @param peerASN The peer ASN
             * @return the next update stage
             */
            Update withPeerASN(Long peerASN);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify PeeringType.
         */
        interface WithPeeringType {
            /**
             * Specifies peeringType.
             * @param peeringType The peering type. Possible values include: 'AzurePublicPeering', 'AzurePrivatePeering', 'MicrosoftPeering'
             * @return the next update stage
             */
            Update withPeeringType(ExpressRoutePeeringType peeringType);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify PrimaryAzurePort.
         */
        interface WithPrimaryAzurePort {
            /**
             * Specifies primaryAzurePort.
             * @param primaryAzurePort The primary port
             * @return the next update stage
             */
            Update withPrimaryAzurePort(String primaryAzurePort);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify PrimaryPeerAddressPrefix.
         */
        interface WithPrimaryPeerAddressPrefix {
            /**
             * Specifies primaryPeerAddressPrefix.
             * @param primaryPeerAddressPrefix The primary address prefix
             * @return the next update stage
             */
            Update withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify RouteFilter.
         */
        interface WithRouteFilter {
            /**
             * Specifies routeFilter.
             * @param routeFilter The reference to the RouteFilter resource
             * @return the next update stage
             */
            Update withRouteFilter(SubResource routeFilter);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify SecondaryAzurePort.
         */
        interface WithSecondaryAzurePort {
            /**
             * Specifies secondaryAzurePort.
             * @param secondaryAzurePort The secondary port
             * @return the next update stage
             */
            Update withSecondaryAzurePort(String secondaryAzurePort);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify SecondaryPeerAddressPrefix.
         */
        interface WithSecondaryPeerAddressPrefix {
            /**
             * Specifies secondaryPeerAddressPrefix.
             * @param secondaryPeerAddressPrefix The secondary address prefix
             * @return the next update stage
             */
            Update withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             * @param sharedKey The shared key
             * @return the next update stage
             */
            Update withSharedKey(String sharedKey);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             * @param state The peering state. Possible values include: 'Disabled', 'Enabled'
             * @return the next update stage
             */
            Update withState(ExpressRoutePeeringState state);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify Stats.
         */
        interface WithStats {
            /**
             * Specifies stats.
             * @param stats The peering stats of express route circuit
             * @return the next update stage
             */
            Update withStats(ExpressRouteCircuitStatsInner stats);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify VlanId.
         */
        interface WithVlanId {
            /**
             * Specifies vlanId.
             * @param vlanId The VLAN ID
             * @return the next update stage
             */
            Update withVlanId(Integer vlanId);
        }

    }
}
