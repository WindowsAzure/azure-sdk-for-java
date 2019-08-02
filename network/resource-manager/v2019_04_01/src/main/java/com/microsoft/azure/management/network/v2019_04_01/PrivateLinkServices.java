/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.network.v2019_04_01.implementation.PrivateLinkServicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PrivateLinkServices.
 */
public interface PrivateLinkServices extends SupportsCreating<PrivateLinkService.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<PrivateLinkService>, SupportsListingByResourceGroup<PrivateLinkService>, SupportsListing<PrivateLinkService>, HasInner<PrivateLinkServicesInner> {
    /**
     * Approve or reject private end point connection for a private link service in a subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param parameters Parameters supplied to approve or reject the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable updatePrivateEndpointConnectionAsync(String resourceGroupName, String serviceName, String peConnectionName, PrivateEndpointConnection parameters);

    /**
     * Delete private end point connection for a private link service in a subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deletePrivateEndpointConnectionAsync(String resourceGroupName, String serviceName, String peConnectionName);

}
