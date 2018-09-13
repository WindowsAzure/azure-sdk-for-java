/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_04_01.implementation.ExpressRouteCircuitPeeringInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_04_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2018_04_01.implementation.ExpressRouteCircuitConnectionInner;
import com.microsoft.azure.management.network.v2018_04_01.implementation.RouteFilterInner;
import com.microsoft.azure.management.network.v2018_04_01.implementation.ExpressRouteCircuitStatsInner;

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
    String provisioningState();

    /**
     * @return the routeFilter value.
     */
    RouteFilter routeFilter();

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
            */
            WithCreate withExistingExpressRouteCircuit(String resourceGroupName, String circuitName);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify AzureASN.
         */
        interface WithAzureASN {
            /**
             * Specifies azureASN.
             */
            WithCreate withAzureASN(Integer azureASN);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify Connections.
         */
        interface WithConnections {
            /**
             * Specifies connections.
             */
            WithCreate withConnections(List<ExpressRouteCircuitConnectionInner> connections);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify GatewayManagerEtag.
         */
        interface WithGatewayManagerEtag {
            /**
             * Specifies gatewayManagerEtag.
             */
            WithCreate withGatewayManagerEtag(String gatewayManagerEtag);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify Ipv6PeeringConfig.
         */
        interface WithIpv6PeeringConfig {
            /**
             * Specifies ipv6PeeringConfig.
             */
            WithCreate withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify LastModifiedBy.
         */
        interface WithLastModifiedBy {
            /**
             * Specifies lastModifiedBy.
             */
            WithCreate withLastModifiedBy(String lastModifiedBy);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify MicrosoftPeeringConfig.
         */
        interface WithMicrosoftPeeringConfig {
            /**
             * Specifies microsoftPeeringConfig.
             */
            WithCreate withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify PeerASN.
         */
        interface WithPeerASN {
            /**
             * Specifies peerASN.
             */
            WithCreate withPeerASN(Long peerASN);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify PeeringType.
         */
        interface WithPeeringType {
            /**
             * Specifies peeringType.
             */
            WithCreate withPeeringType(ExpressRoutePeeringType peeringType);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify PrimaryAzurePort.
         */
        interface WithPrimaryAzurePort {
            /**
             * Specifies primaryAzurePort.
             */
            WithCreate withPrimaryAzurePort(String primaryAzurePort);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify PrimaryPeerAddressPrefix.
         */
        interface WithPrimaryPeerAddressPrefix {
            /**
             * Specifies primaryPeerAddressPrefix.
             */
            WithCreate withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify RouteFilter.
         */
        interface WithRouteFilter {
            /**
             * Specifies routeFilter.
             */
            WithCreate withRouteFilter(RouteFilterInner routeFilter);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify SecondaryAzurePort.
         */
        interface WithSecondaryAzurePort {
            /**
             * Specifies secondaryAzurePort.
             */
            WithCreate withSecondaryAzurePort(String secondaryAzurePort);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify SecondaryPeerAddressPrefix.
         */
        interface WithSecondaryPeerAddressPrefix {
            /**
             * Specifies secondaryPeerAddressPrefix.
             */
            WithCreate withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             */
            WithCreate withSharedKey(String sharedKey);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             */
            WithCreate withState(ExpressRoutePeeringState state);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify Stats.
         */
        interface WithStats {
            /**
             * Specifies stats.
             */
            WithCreate withStats(ExpressRouteCircuitStatsInner stats);
        }

        /**
         * The stage of the expressroutecircuitpeering definition allowing to specify VlanId.
         */
        interface WithVlanId {
            /**
             * Specifies vlanId.
             */
            WithCreate withVlanId(Integer vlanId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ExpressRouteCircuitPeering>, DefinitionStages.WithAzureASN, DefinitionStages.WithConnections, DefinitionStages.WithGatewayManagerEtag, DefinitionStages.WithId, DefinitionStages.WithIpv6PeeringConfig, DefinitionStages.WithLastModifiedBy, DefinitionStages.WithMicrosoftPeeringConfig, DefinitionStages.WithName, DefinitionStages.WithPeerASN, DefinitionStages.WithPeeringType, DefinitionStages.WithPrimaryAzurePort, DefinitionStages.WithPrimaryPeerAddressPrefix, DefinitionStages.WithProvisioningState, DefinitionStages.WithRouteFilter, DefinitionStages.WithSecondaryAzurePort, DefinitionStages.WithSecondaryPeerAddressPrefix, DefinitionStages.WithSharedKey, DefinitionStages.WithState, DefinitionStages.WithStats, DefinitionStages.WithVlanId {
        }
    }
    /**
     * The template for a ExpressRouteCircuitPeering update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ExpressRouteCircuitPeering>, UpdateStages.WithAzureASN, UpdateStages.WithConnections, UpdateStages.WithGatewayManagerEtag, UpdateStages.WithId, UpdateStages.WithIpv6PeeringConfig, UpdateStages.WithLastModifiedBy, UpdateStages.WithMicrosoftPeeringConfig, UpdateStages.WithName, UpdateStages.WithPeerASN, UpdateStages.WithPeeringType, UpdateStages.WithPrimaryAzurePort, UpdateStages.WithPrimaryPeerAddressPrefix, UpdateStages.WithProvisioningState, UpdateStages.WithRouteFilter, UpdateStages.WithSecondaryAzurePort, UpdateStages.WithSecondaryPeerAddressPrefix, UpdateStages.WithSharedKey, UpdateStages.WithState, UpdateStages.WithStats, UpdateStages.WithVlanId {
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
             */
            Update withAzureASN(Integer azureASN);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify Connections.
         */
        interface WithConnections {
            /**
             * Specifies connections.
             */
            Update withConnections(List<ExpressRouteCircuitConnectionInner> connections);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify GatewayManagerEtag.
         */
        interface WithGatewayManagerEtag {
            /**
             * Specifies gatewayManagerEtag.
             */
            Update withGatewayManagerEtag(String gatewayManagerEtag);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            Update withId(String id);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify Ipv6PeeringConfig.
         */
        interface WithIpv6PeeringConfig {
            /**
             * Specifies ipv6PeeringConfig.
             */
            Update withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify LastModifiedBy.
         */
        interface WithLastModifiedBy {
            /**
             * Specifies lastModifiedBy.
             */
            Update withLastModifiedBy(String lastModifiedBy);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify MicrosoftPeeringConfig.
         */
        interface WithMicrosoftPeeringConfig {
            /**
             * Specifies microsoftPeeringConfig.
             */
            Update withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            Update withName(String name);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify PeerASN.
         */
        interface WithPeerASN {
            /**
             * Specifies peerASN.
             */
            Update withPeerASN(Long peerASN);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify PeeringType.
         */
        interface WithPeeringType {
            /**
             * Specifies peeringType.
             */
            Update withPeeringType(ExpressRoutePeeringType peeringType);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify PrimaryAzurePort.
         */
        interface WithPrimaryAzurePort {
            /**
             * Specifies primaryAzurePort.
             */
            Update withPrimaryAzurePort(String primaryAzurePort);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify PrimaryPeerAddressPrefix.
         */
        interface WithPrimaryPeerAddressPrefix {
            /**
             * Specifies primaryPeerAddressPrefix.
             */
            Update withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify RouteFilter.
         */
        interface WithRouteFilter {
            /**
             * Specifies routeFilter.
             */
            Update withRouteFilter(RouteFilterInner routeFilter);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify SecondaryAzurePort.
         */
        interface WithSecondaryAzurePort {
            /**
             * Specifies secondaryAzurePort.
             */
            Update withSecondaryAzurePort(String secondaryAzurePort);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify SecondaryPeerAddressPrefix.
         */
        interface WithSecondaryPeerAddressPrefix {
            /**
             * Specifies secondaryPeerAddressPrefix.
             */
            Update withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             */
            Update withSharedKey(String sharedKey);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             */
            Update withState(ExpressRoutePeeringState state);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify Stats.
         */
        interface WithStats {
            /**
             * Specifies stats.
             */
            Update withStats(ExpressRouteCircuitStatsInner stats);
        }

        /**
         * The stage of the expressroutecircuitpeering update allowing to specify VlanId.
         */
        interface WithVlanId {
            /**
             * Specifies vlanId.
             */
            Update withVlanId(Integer vlanId);
        }

    }
}
