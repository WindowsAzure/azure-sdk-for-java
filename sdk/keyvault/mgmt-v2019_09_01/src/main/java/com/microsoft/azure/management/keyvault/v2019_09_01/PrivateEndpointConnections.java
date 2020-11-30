/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.keyvault.v2019_09_01.implementation.PrivateEndpointConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PrivateEndpointConnections.
 */
public interface PrivateEndpointConnections extends SupportsCreating<PrivateEndpointConnection.DefinitionStages.Blank>, HasInner<PrivateEndpointConnectionsInner> {
    /**
     * Gets the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateEndpointConnection> getAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName);

}
