// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.VpnSiteLinkConnectionInner;

/** An instance of this class provides access to all the operations defined in VpnLinkConnectionsClient. */
public interface VpnLinkConnectionsClient {
    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<VpnSiteLinkConnectionInner> listByVpnConnectionAsync(
        String resourceGroupName, String gatewayName, String connectionName);

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnSiteLinkConnectionInner> listByVpnConnection(
        String resourceGroupName, String gatewayName, String connectionName);

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnSiteLinkConnectionInner> listByVpnConnection(
        String resourceGroupName, String gatewayName, String connectionName, Context context);
}
