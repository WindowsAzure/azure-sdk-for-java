/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import rx.Completable;
import com.microsoft.azure.management.network.v2018_12_01.implementation.VpnClientIPsecParametersInner;
import com.microsoft.azure.management.network.v2018_12_01.implementation.VirtualNetworkGatewaysInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_12_01.VirtualNetworkGatewayConnectionListEntity;

/**
 * Type representing VirtualNetworkGateways.
 */
public interface VirtualNetworkGateways extends SupportsCreating<VirtualNetworkGateway.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<VirtualNetworkGateway>, SupportsListingByResourceGroup<VirtualNetworkGateway>, HasInner<VirtualNetworkGatewaysInner> {
    /**
     * Resets the primary of the virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetworkGateway> resetAsync(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Resets the VPN client shared key of the virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resetVpnClientSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Generates VPN client package for P2S client of the virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the generate virtual network gateway VPN client package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<String> generatevpnclientpackageAsync(String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters);

    /**
     * Generates VPN profile for P2S client of the virtual network gateway in the specified resource group. Used for IKEV2 and radius based authentication.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the generate virtual network gateway VPN client package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<String> generateVpnProfileAsync(String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters);

    /**
     * Gets pre-generated VPN profile for P2S client of the virtual network gateway in the specified resource group. The profile needs to be generated first using generateVpnProfile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<String> getVpnProfilePackageUrlAsync(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * The GetBgpPeerStatus operation retrieves the status of all BGP peers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BgpPeerStatusListResult> getBgpPeerStatusAsync(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Gets a xml format representation for supported vpn devices.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<String> supportedVpnDevicesAsync(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * This operation retrieves a list of routes the virtual network gateway has learned, including routes learned from BGP peers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GatewayRouteListResult> getLearnedRoutesAsync(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * This operation retrieves a list of routes the virtual network gateway is advertising to the specified peer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param peer The IP address of the peer
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GatewayRouteListResult> getAdvertisedRoutesAsync(String resourceGroupName, String virtualNetworkGatewayName, String peer);

    /**
     * The Set VpnclientIpsecParameters operation sets the vpnclient ipsec policy for P2S client of virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param vpnclientIpsecParams Parameters supplied to the Begin Set vpnclient ipsec parameters of Virtual Network Gateway P2S client operation through Network resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VpnClientIPsecParameters> setVpnclientIpsecParametersAsync(String resourceGroupName, String virtualNetworkGatewayName, VpnClientIPsecParametersInner vpnclientIpsecParams);

    /**
     * The Get VpnclientIpsecParameters operation retrieves information about the vpnclient ipsec policy for P2S client of virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The virtual network gateway name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VpnClientIPsecParameters> getVpnclientIpsecParametersAsync(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Gets all the connections in a virtual network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetworkGatewayConnectionListEntity> listConnectionsAsync(final String resourceGroupName, final String virtualNetworkGatewayName);

    /**
     * Gets a xml format representation for vpn device configuration script.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection for which the configuration script is generated.
     * @param parameters Parameters supplied to the generate vpn device script operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<String> vpnDeviceConfigurationScriptAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, VpnDeviceScriptParameters parameters);

}
