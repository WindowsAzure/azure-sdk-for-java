/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.v2017_05_01;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.trafficmanager.v2017_05_01.implementation.EndpointInner;
import com.microsoft.azure.management.trafficmanager.v2017_05_01.implementation.EndpointsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Endpoints.
 */
public interface Endpoints extends HasInner<EndpointsInner> {
    /**
     * Update a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be updated.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be updated.
     * @param endpointName The name of the Traffic Manager endpoint to be updated.
     * @param parameters The Traffic Manager endpoint parameters supplied to the Update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Endpoint> updateAsync(String resourceGroupName, String profileName, String endpointType, String endpointName, EndpointInner parameters);

    /**
     * Gets a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint.
     * @param endpointName The name of the Traffic Manager endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Endpoint> getAsync(String resourceGroupName, String profileName, String endpointType, String endpointName);

    /**
     * Create or update a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be created or updated.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be created or updated.
     * @param endpointName The name of the Traffic Manager endpoint to be created or updated.
     * @param parameters The Traffic Manager endpoint parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Endpoint> createOrUpdateAsync(String resourceGroupName, String profileName, String endpointType, String endpointName, EndpointInner parameters);

    /**
     * Deletes a Traffic Manager endpoint.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint to be deleted.
     * @param profileName The name of the Traffic Manager profile.
     * @param endpointType The type of the Traffic Manager endpoint to be deleted.
     * @param endpointName The name of the Traffic Manager endpoint to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeleteOperationResult> deleteAsync(String resourceGroupName, String profileName, String endpointType, String endpointName);

}
