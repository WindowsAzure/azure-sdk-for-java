/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_12_01.implementation.ExpressRouteConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ExpressRouteConnections.
 */
public interface ExpressRouteConnections extends SupportsCreating<ExpressRouteConnection.DefinitionStages.Blank>, HasInner<ExpressRouteConnectionsInner> {
    /**
     * Lists ExpressRouteConnections.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteConnectionList> listAsync(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Gets the specified ExpressRouteConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the ExpressRoute connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteConnection> getAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName);

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName);

}
