/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_05_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_05_01.implementation.VirtualNetworkGatewayInner;

/**
 * Type representing VirtualNetworkGateway.
 */
public interface VirtualNetworkGateway extends HasInner<VirtualNetworkGatewayInner>, Resource, GroupableResourceCore<NetworkManager, VirtualNetworkGatewayInner>, HasResourceGroup, Refreshable<VirtualNetworkGateway>, Updatable<VirtualNetworkGateway.Update>, HasManager<NetworkManager> {
    /**
     * @return the activeActive value.
     */
    Boolean activeActive();

    /**
     * @return the bgpSettings value.
     */
    BgpSettings bgpSettings();

    /**
     * @return the enableBgp value.
     */
    Boolean enableBgp();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the gatewayDefaultSite value.
     */
    SubResource gatewayDefaultSite();

    /**
     * @return the gatewayType value.
     */
    VirtualNetworkGatewayType gatewayType();

    /**
     * @return the ipConfigurations value.
     */
    List<VirtualNetworkGatewayIPConfiguration> ipConfigurations();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the sku value.
     */
    VirtualNetworkGatewaySku sku();

    /**
     * @return the vpnClientConfiguration value.
     */
    VpnClientConfiguration vpnClientConfiguration();

    /**
     * @return the vpnType value.
     */
    VpnType vpnType();

    /**
     * The entirety of the VirtualNetworkGateway definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualNetworkGateway definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualNetworkGateway definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VirtualNetworkGateway definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the virtualnetworkgateway definition allowing to specify ActiveActive.
         */
        interface WithActiveActive {
            /**
             * Specifies activeActive.
             * @param activeActive ActiveActive flag
             * @return the next definition stage
             */
            WithCreate withActiveActive(Boolean activeActive);
        }

        /**
         * The stage of the virtualnetworkgateway definition allowing to specify BgpSettings.
         */
        interface WithBgpSettings {
            /**
             * Specifies bgpSettings.
             * @param bgpSettings Virtual network gateway's BGP speaker settings
             * @return the next definition stage
             */
            WithCreate withBgpSettings(BgpSettings bgpSettings);
        }

        /**
         * The stage of the virtualnetworkgateway definition allowing to specify EnableBgp.
         */
        interface WithEnableBgp {
            /**
             * Specifies enableBgp.
             * @param enableBgp Whether BGP is enabled for this virtual network gateway or not
             * @return the next definition stage
             */
            WithCreate withEnableBgp(Boolean enableBgp);
        }

        /**
         * The stage of the virtualnetworkgateway definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag Gets a unique read-only string that changes whenever the resource is updated
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the virtualnetworkgateway definition allowing to specify GatewayDefaultSite.
         */
        interface WithGatewayDefaultSite {
            /**
             * Specifies gatewayDefaultSite.
             * @param gatewayDefaultSite The reference of the LocalNetworkGateway resource which represents local network site having default routes. Assign Null value in case of removing existing default site setting
             * @return the next definition stage
             */
            WithCreate withGatewayDefaultSite(SubResource gatewayDefaultSite);
        }

        /**
         * The stage of the virtualnetworkgateway definition allowing to specify GatewayType.
         */
        interface WithGatewayType {
            /**
             * Specifies gatewayType.
             * @param gatewayType The type of this virtual network gateway. Possible values are: 'Vpn' and 'ExpressRoute'. Possible values include: 'Vpn', 'ExpressRoute'
             * @return the next definition stage
             */
            WithCreate withGatewayType(VirtualNetworkGatewayType gatewayType);
        }

        /**
         * The stage of the virtualnetworkgateway definition allowing to specify IpConfigurations.
         */
        interface WithIpConfigurations {
            /**
             * Specifies ipConfigurations.
             * @param ipConfigurations IP configurations for virtual network gateway
             * @return the next definition stage
             */
            WithCreate withIpConfigurations(List<VirtualNetworkGatewayIPConfiguration> ipConfigurations);
        }

        /**
         * The stage of the virtualnetworkgateway definition allowing to specify ResourceGuid.
         */
        interface WithResourceGuid {
            /**
             * Specifies resourceGuid.
             * @param resourceGuid The resource GUID property of the VirtualNetworkGateway resource
             * @return the next definition stage
             */
            WithCreate withResourceGuid(String resourceGuid);
        }

        /**
         * The stage of the virtualnetworkgateway definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The reference of the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network gateway
             * @return the next definition stage
             */
            WithCreate withSku(VirtualNetworkGatewaySku sku);
        }

        /**
         * The stage of the virtualnetworkgateway definition allowing to specify VpnClientConfiguration.
         */
        interface WithVpnClientConfiguration {
            /**
             * Specifies vpnClientConfiguration.
             * @param vpnClientConfiguration The reference of the VpnClientConfiguration resource which represents the P2S VpnClient configurations
             * @return the next definition stage
             */
            WithCreate withVpnClientConfiguration(VpnClientConfiguration vpnClientConfiguration);
        }

        /**
         * The stage of the virtualnetworkgateway definition allowing to specify VpnType.
         */
        interface WithVpnType {
            /**
             * Specifies vpnType.
             * @param vpnType The type of this virtual network gateway. Possible values are: 'PolicyBased' and 'RouteBased'. Possible values include: 'PolicyBased', 'RouteBased'
             * @return the next definition stage
             */
            WithCreate withVpnType(VpnType vpnType);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualNetworkGateway>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithActiveActive, DefinitionStages.WithBgpSettings, DefinitionStages.WithEnableBgp, DefinitionStages.WithEtag, DefinitionStages.WithGatewayDefaultSite, DefinitionStages.WithGatewayType, DefinitionStages.WithIpConfigurations, DefinitionStages.WithResourceGuid, DefinitionStages.WithSku, DefinitionStages.WithVpnClientConfiguration, DefinitionStages.WithVpnType {
        }
    }
    /**
     * The template for a VirtualNetworkGateway update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualNetworkGateway>, Resource.UpdateWithTags<Update>, UpdateStages.WithActiveActive, UpdateStages.WithBgpSettings, UpdateStages.WithEnableBgp, UpdateStages.WithEtag, UpdateStages.WithGatewayDefaultSite, UpdateStages.WithGatewayType, UpdateStages.WithIpConfigurations, UpdateStages.WithResourceGuid, UpdateStages.WithSku, UpdateStages.WithVpnClientConfiguration, UpdateStages.WithVpnType {
    }

    /**
     * Grouping of VirtualNetworkGateway update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualnetworkgateway update allowing to specify ActiveActive.
         */
        interface WithActiveActive {
            /**
             * Specifies activeActive.
             * @param activeActive ActiveActive flag
             * @return the next update stage
             */
            Update withActiveActive(Boolean activeActive);
        }

        /**
         * The stage of the virtualnetworkgateway update allowing to specify BgpSettings.
         */
        interface WithBgpSettings {
            /**
             * Specifies bgpSettings.
             * @param bgpSettings Virtual network gateway's BGP speaker settings
             * @return the next update stage
             */
            Update withBgpSettings(BgpSettings bgpSettings);
        }

        /**
         * The stage of the virtualnetworkgateway update allowing to specify EnableBgp.
         */
        interface WithEnableBgp {
            /**
             * Specifies enableBgp.
             * @param enableBgp Whether BGP is enabled for this virtual network gateway or not
             * @return the next update stage
             */
            Update withEnableBgp(Boolean enableBgp);
        }

        /**
         * The stage of the virtualnetworkgateway update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag Gets a unique read-only string that changes whenever the resource is updated
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the virtualnetworkgateway update allowing to specify GatewayDefaultSite.
         */
        interface WithGatewayDefaultSite {
            /**
             * Specifies gatewayDefaultSite.
             * @param gatewayDefaultSite The reference of the LocalNetworkGateway resource which represents local network site having default routes. Assign Null value in case of removing existing default site setting
             * @return the next update stage
             */
            Update withGatewayDefaultSite(SubResource gatewayDefaultSite);
        }

        /**
         * The stage of the virtualnetworkgateway update allowing to specify GatewayType.
         */
        interface WithGatewayType {
            /**
             * Specifies gatewayType.
             * @param gatewayType The type of this virtual network gateway. Possible values are: 'Vpn' and 'ExpressRoute'. Possible values include: 'Vpn', 'ExpressRoute'
             * @return the next update stage
             */
            Update withGatewayType(VirtualNetworkGatewayType gatewayType);
        }

        /**
         * The stage of the virtualnetworkgateway update allowing to specify IpConfigurations.
         */
        interface WithIpConfigurations {
            /**
             * Specifies ipConfigurations.
             * @param ipConfigurations IP configurations for virtual network gateway
             * @return the next update stage
             */
            Update withIpConfigurations(List<VirtualNetworkGatewayIPConfiguration> ipConfigurations);
        }

        /**
         * The stage of the virtualnetworkgateway update allowing to specify ResourceGuid.
         */
        interface WithResourceGuid {
            /**
             * Specifies resourceGuid.
             * @param resourceGuid The resource GUID property of the VirtualNetworkGateway resource
             * @return the next update stage
             */
            Update withResourceGuid(String resourceGuid);
        }

        /**
         * The stage of the virtualnetworkgateway update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The reference of the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network gateway
             * @return the next update stage
             */
            Update withSku(VirtualNetworkGatewaySku sku);
        }

        /**
         * The stage of the virtualnetworkgateway update allowing to specify VpnClientConfiguration.
         */
        interface WithVpnClientConfiguration {
            /**
             * Specifies vpnClientConfiguration.
             * @param vpnClientConfiguration The reference of the VpnClientConfiguration resource which represents the P2S VpnClient configurations
             * @return the next update stage
             */
            Update withVpnClientConfiguration(VpnClientConfiguration vpnClientConfiguration);
        }

        /**
         * The stage of the virtualnetworkgateway update allowing to specify VpnType.
         */
        interface WithVpnType {
            /**
             * Specifies vpnType.
             * @param vpnType The type of this virtual network gateway. Possible values are: 'PolicyBased' and 'RouteBased'. Possible values include: 'PolicyBased', 'RouteBased'
             * @return the next update stage
             */
            Update withVpnType(VpnType vpnType);
        }

    }
}
