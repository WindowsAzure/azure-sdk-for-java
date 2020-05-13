/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2020_04_01.implementation.VpnLinkConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VpnLinkConnections.
 */
public interface VpnLinkConnections extends HasInner<VpnLinkConnectionsInner> {
    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VpnConnectionVpnGatewayVpnSiteLinkConnectionModel> listByVpnConnectionAsync(final String resourceGroupName, final String gatewayName, final String connectionName);

}
