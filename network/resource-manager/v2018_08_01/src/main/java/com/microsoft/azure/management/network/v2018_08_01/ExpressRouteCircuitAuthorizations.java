/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_08_01.implementation.ExpressRouteCircuitAuthorizationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ExpressRouteCircuitAuthorizations.
 */
public interface ExpressRouteCircuitAuthorizations extends SupportsCreating<ExpressRouteCircuitAuthorization.DefinitionStages.Blank>, HasInner<ExpressRouteCircuitAuthorizationsInner> {
    /**
     * Gets the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCircuitAuthorization> getAsync(String resourceGroupName, String circuitName, String authorizationName);

    /**
     * Gets all authorizations in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCircuitAuthorization> listAsync(final String resourceGroupName, final String circuitName);

    /**
     * Deletes the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String circuitName, String authorizationName);

}
