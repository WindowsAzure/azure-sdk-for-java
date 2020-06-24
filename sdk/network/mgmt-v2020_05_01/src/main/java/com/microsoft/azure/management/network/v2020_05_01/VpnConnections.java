/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_05_01.implementation.VpnConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VpnConnections.
 */
public interface VpnConnections extends SupportsCreating<VpnConnection.DefinitionStages.Blank>, HasInner<VpnConnectionsInner> {
    /**
     * Retrieves the details of a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VpnConnection> getAsync(String resourceGroupName, String gatewayName, String connectionName);

    /**
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VpnConnection> listByVpnGatewayAsync(final String resourceGroupName, final String gatewayName);

    /**
     * Deletes a vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String gatewayName, String connectionName);

}
