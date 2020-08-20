/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_06_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2020_06_01.implementation.VirtualHubRouteTableV2Inner;
import com.microsoft.azure.management.network.v2020_06_01.implementation.VirtualHubInner;

/**
 * Type representing VirtualHub.
 */
public interface VirtualHub extends HasInner<VirtualHubInner>, Resource, GroupableResourceCore<NetworkManager, VirtualHubInner>, HasResourceGroup, Refreshable<VirtualHub>, Updatable<VirtualHub.Update>, HasManager<NetworkManager> {
    /**
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * @return the azureFirewall value.
     */
    SubResource azureFirewall();

    /**
     * @return the bgpConnections value.
     */
    List<SubResource> bgpConnections();

    /**
     * @return the enableVirtualRouterRoutePropogation value.
     */
    Boolean enableVirtualRouterRoutePropogation();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the expressRouteGateway value.
     */
    SubResource expressRouteGateway();

    /**
     * @return the ipConfigurations value.
     */
    List<SubResource> ipConfigurations();

    /**
     * @return the p2SVpnGateway value.
     */
    SubResource p2SVpnGateway();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the routeTable value.
     */
    VirtualHubRouteTable routeTable();

    /**
     * @return the routingState value.
     */
    RoutingState routingState();

    /**
     * @return the securityPartnerProvider value.
     */
    SubResource securityPartnerProvider();

    /**
     * @return the securityProviderName value.
     */
    String securityProviderName();

    /**
     * @return the sku value.
     */
    String sku();

    /**
     * @return the virtualHubRouteTableV2s value.
     */
    List<VirtualHubRouteTableV2> virtualHubRouteTableV2s();

    /**
     * @return the virtualRouterAsn value.
     */
    Long virtualRouterAsn();

    /**
     * @return the virtualRouterIps value.
     */
    List<String> virtualRouterIps();

    /**
     * @return the virtualWan value.
     */
    SubResource virtualWan();

    /**
     * @return the vpnGateway value.
     */
    SubResource vpnGateway();

    /**
     * The entirety of the VirtualHub definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualHub definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualHub definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VirtualHub definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the virtualhub definition allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             * @param addressPrefix Address-prefix for this VirtualHub
             * @return the next definition stage
             */
            WithCreate withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the virtualhub definition allowing to specify AzureFirewall.
         */
        interface WithAzureFirewall {
            /**
             * Specifies azureFirewall.
             * @param azureFirewall The azureFirewall associated with this VirtualHub
             * @return the next definition stage
             */
            WithCreate withAzureFirewall(SubResource azureFirewall);
        }

        /**
         * The stage of the virtualhub definition allowing to specify EnableVirtualRouterRoutePropogation.
         */
        interface WithEnableVirtualRouterRoutePropogation {
            /**
             * Specifies enableVirtualRouterRoutePropogation.
             * @param enableVirtualRouterRoutePropogation Flag to control route propogation for VirtualRouter hub
             * @return the next definition stage
             */
            WithCreate withEnableVirtualRouterRoutePropogation(Boolean enableVirtualRouterRoutePropogation);
        }

        /**
         * The stage of the virtualhub definition allowing to specify ExpressRouteGateway.
         */
        interface WithExpressRouteGateway {
            /**
             * Specifies expressRouteGateway.
             * @param expressRouteGateway The expressRouteGateway associated with this VirtualHub
             * @return the next definition stage
             */
            WithCreate withExpressRouteGateway(SubResource expressRouteGateway);
        }

        /**
         * The stage of the virtualhub definition allowing to specify P2SVpnGateway.
         */
        interface WithP2SVpnGateway {
            /**
             * Specifies p2SVpnGateway.
             * @param p2SVpnGateway The P2SVpnGateway associated with this VirtualHub
             * @return the next definition stage
             */
            WithCreate withP2SVpnGateway(SubResource p2SVpnGateway);
        }

        /**
         * The stage of the virtualhub definition allowing to specify RouteTable.
         */
        interface WithRouteTable {
            /**
             * Specifies routeTable.
             * @param routeTable The routeTable associated with this virtual hub
             * @return the next definition stage
             */
            WithCreate withRouteTable(VirtualHubRouteTable routeTable);
        }

        /**
         * The stage of the virtualhub definition allowing to specify RoutingState.
         */
        interface WithRoutingState {
            /**
             * Specifies routingState.
             * @param routingState The routing state. Possible values include: 'None', 'Provisioned', 'Provisioning', 'Failed'
             * @return the next definition stage
             */
            WithCreate withRoutingState(RoutingState routingState);
        }

        /**
         * The stage of the virtualhub definition allowing to specify SecurityPartnerProvider.
         */
        interface WithSecurityPartnerProvider {
            /**
             * Specifies securityPartnerProvider.
             * @param securityPartnerProvider The securityPartnerProvider associated with this VirtualHub
             * @return the next definition stage
             */
            WithCreate withSecurityPartnerProvider(SubResource securityPartnerProvider);
        }

        /**
         * The stage of the virtualhub definition allowing to specify SecurityProviderName.
         */
        interface WithSecurityProviderName {
            /**
             * Specifies securityProviderName.
             * @param securityProviderName The Security Provider name
             * @return the next definition stage
             */
            WithCreate withSecurityProviderName(String securityProviderName);
        }

        /**
         * The stage of the virtualhub definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The sku of this VirtualHub
             * @return the next definition stage
             */
            WithCreate withSku(String sku);
        }

        /**
         * The stage of the virtualhub definition allowing to specify VirtualHubRouteTableV2s.
         */
        interface WithVirtualHubRouteTableV2s {
            /**
             * Specifies virtualHubRouteTableV2s.
             * @param virtualHubRouteTableV2s List of all virtual hub route table v2s associated with this VirtualHub
             * @return the next definition stage
             */
            WithCreate withVirtualHubRouteTableV2s(List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2s);
        }

        /**
         * The stage of the virtualhub definition allowing to specify VirtualRouterAsn.
         */
        interface WithVirtualRouterAsn {
            /**
             * Specifies virtualRouterAsn.
             * @param virtualRouterAsn VirtualRouter ASN
             * @return the next definition stage
             */
            WithCreate withVirtualRouterAsn(Long virtualRouterAsn);
        }

        /**
         * The stage of the virtualhub definition allowing to specify VirtualRouterIps.
         */
        interface WithVirtualRouterIps {
            /**
             * Specifies virtualRouterIps.
             * @param virtualRouterIps VirtualRouter IPs
             * @return the next definition stage
             */
            WithCreate withVirtualRouterIps(List<String> virtualRouterIps);
        }

        /**
         * The stage of the virtualhub definition allowing to specify VirtualWan.
         */
        interface WithVirtualWan {
            /**
             * Specifies virtualWan.
             * @param virtualWan The VirtualWAN to which the VirtualHub belongs
             * @return the next definition stage
             */
            WithCreate withVirtualWan(SubResource virtualWan);
        }

        /**
         * The stage of the virtualhub definition allowing to specify VpnGateway.
         */
        interface WithVpnGateway {
            /**
             * Specifies vpnGateway.
             * @param vpnGateway The VpnGateway associated with this VirtualHub
             * @return the next definition stage
             */
            WithCreate withVpnGateway(SubResource vpnGateway);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualHub>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAddressPrefix, DefinitionStages.WithAzureFirewall, DefinitionStages.WithEnableVirtualRouterRoutePropogation, DefinitionStages.WithExpressRouteGateway, DefinitionStages.WithP2SVpnGateway, DefinitionStages.WithRouteTable, DefinitionStages.WithRoutingState, DefinitionStages.WithSecurityPartnerProvider, DefinitionStages.WithSecurityProviderName, DefinitionStages.WithSku, DefinitionStages.WithVirtualHubRouteTableV2s, DefinitionStages.WithVirtualRouterAsn, DefinitionStages.WithVirtualRouterIps, DefinitionStages.WithVirtualWan, DefinitionStages.WithVpnGateway {
        }
    }
    /**
     * The template for a VirtualHub update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualHub>, Resource.UpdateWithTags<Update>, UpdateStages.WithAddressPrefix, UpdateStages.WithAzureFirewall, UpdateStages.WithEnableVirtualRouterRoutePropogation, UpdateStages.WithExpressRouteGateway, UpdateStages.WithP2SVpnGateway, UpdateStages.WithRouteTable, UpdateStages.WithRoutingState, UpdateStages.WithSecurityPartnerProvider, UpdateStages.WithSecurityProviderName, UpdateStages.WithSku, UpdateStages.WithVirtualHubRouteTableV2s, UpdateStages.WithVirtualRouterAsn, UpdateStages.WithVirtualRouterIps, UpdateStages.WithVirtualWan, UpdateStages.WithVpnGateway {
    }

    /**
     * Grouping of VirtualHub update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualhub update allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             * @param addressPrefix Address-prefix for this VirtualHub
             * @return the next update stage
             */
            Update withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the virtualhub update allowing to specify AzureFirewall.
         */
        interface WithAzureFirewall {
            /**
             * Specifies azureFirewall.
             * @param azureFirewall The azureFirewall associated with this VirtualHub
             * @return the next update stage
             */
            Update withAzureFirewall(SubResource azureFirewall);
        }

        /**
         * The stage of the virtualhub update allowing to specify EnableVirtualRouterRoutePropogation.
         */
        interface WithEnableVirtualRouterRoutePropogation {
            /**
             * Specifies enableVirtualRouterRoutePropogation.
             * @param enableVirtualRouterRoutePropogation Flag to control route propogation for VirtualRouter hub
             * @return the next update stage
             */
            Update withEnableVirtualRouterRoutePropogation(Boolean enableVirtualRouterRoutePropogation);
        }

        /**
         * The stage of the virtualhub update allowing to specify ExpressRouteGateway.
         */
        interface WithExpressRouteGateway {
            /**
             * Specifies expressRouteGateway.
             * @param expressRouteGateway The expressRouteGateway associated with this VirtualHub
             * @return the next update stage
             */
            Update withExpressRouteGateway(SubResource expressRouteGateway);
        }

        /**
         * The stage of the virtualhub update allowing to specify P2SVpnGateway.
         */
        interface WithP2SVpnGateway {
            /**
             * Specifies p2SVpnGateway.
             * @param p2SVpnGateway The P2SVpnGateway associated with this VirtualHub
             * @return the next update stage
             */
            Update withP2SVpnGateway(SubResource p2SVpnGateway);
        }

        /**
         * The stage of the virtualhub update allowing to specify RouteTable.
         */
        interface WithRouteTable {
            /**
             * Specifies routeTable.
             * @param routeTable The routeTable associated with this virtual hub
             * @return the next update stage
             */
            Update withRouteTable(VirtualHubRouteTable routeTable);
        }

        /**
         * The stage of the virtualhub update allowing to specify RoutingState.
         */
        interface WithRoutingState {
            /**
             * Specifies routingState.
             * @param routingState The routing state. Possible values include: 'None', 'Provisioned', 'Provisioning', 'Failed'
             * @return the next update stage
             */
            Update withRoutingState(RoutingState routingState);
        }

        /**
         * The stage of the virtualhub update allowing to specify SecurityPartnerProvider.
         */
        interface WithSecurityPartnerProvider {
            /**
             * Specifies securityPartnerProvider.
             * @param securityPartnerProvider The securityPartnerProvider associated with this VirtualHub
             * @return the next update stage
             */
            Update withSecurityPartnerProvider(SubResource securityPartnerProvider);
        }

        /**
         * The stage of the virtualhub update allowing to specify SecurityProviderName.
         */
        interface WithSecurityProviderName {
            /**
             * Specifies securityProviderName.
             * @param securityProviderName The Security Provider name
             * @return the next update stage
             */
            Update withSecurityProviderName(String securityProviderName);
        }

        /**
         * The stage of the virtualhub update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The sku of this VirtualHub
             * @return the next update stage
             */
            Update withSku(String sku);
        }

        /**
         * The stage of the virtualhub update allowing to specify VirtualHubRouteTableV2s.
         */
        interface WithVirtualHubRouteTableV2s {
            /**
             * Specifies virtualHubRouteTableV2s.
             * @param virtualHubRouteTableV2s List of all virtual hub route table v2s associated with this VirtualHub
             * @return the next update stage
             */
            Update withVirtualHubRouteTableV2s(List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2s);
        }

        /**
         * The stage of the virtualhub update allowing to specify VirtualRouterAsn.
         */
        interface WithVirtualRouterAsn {
            /**
             * Specifies virtualRouterAsn.
             * @param virtualRouterAsn VirtualRouter ASN
             * @return the next update stage
             */
            Update withVirtualRouterAsn(Long virtualRouterAsn);
        }

        /**
         * The stage of the virtualhub update allowing to specify VirtualRouterIps.
         */
        interface WithVirtualRouterIps {
            /**
             * Specifies virtualRouterIps.
             * @param virtualRouterIps VirtualRouter IPs
             * @return the next update stage
             */
            Update withVirtualRouterIps(List<String> virtualRouterIps);
        }

        /**
         * The stage of the virtualhub update allowing to specify VirtualWan.
         */
        interface WithVirtualWan {
            /**
             * Specifies virtualWan.
             * @param virtualWan The VirtualWAN to which the VirtualHub belongs
             * @return the next update stage
             */
            Update withVirtualWan(SubResource virtualWan);
        }

        /**
         * The stage of the virtualhub update allowing to specify VpnGateway.
         */
        interface WithVpnGateway {
            /**
             * Specifies vpnGateway.
             * @param vpnGateway The VpnGateway associated with this VirtualHub
             * @return the next update stage
             */
            Update withVpnGateway(SubResource vpnGateway);
        }

    }
}
