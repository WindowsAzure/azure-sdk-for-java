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
import com.microsoft.azure.management.network.v2019_04_01.implementation.PrivateLinkServicesInner;
import com.microsoft.azure.arm.model.HasInner;
import rx.Completable;
import com.microsoft.azure.management.network.v2019_04_01.AutoApprovedPrivateLinkService;

/**
 * Type representing PrivateLinkServices.
 */
public interface PrivateLinkServices extends SupportsCreating<PrivateLinkService.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<PrivateLinkService>, SupportsListingByResourceGroup<PrivateLinkService>, SupportsListing<PrivateLinkService>, HasInner<PrivateLinkServicesInner> {
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

    /**
     * Checks the subscription is visible to private link service.
     *
     * @param location The location of the domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateLinkServiceVisibility> checkPrivateLinkServiceVisibilityAsync(String location);

    /**
     * Checks the subscription is visible to private link service.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateLinkServiceVisibility> checkPrivateLinkServiceVisibilityByResourceGroupAsync(String location, String resourceGroupName);

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServicesAsync(final String location);

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServicesByResourceGroupAsync(final String location, final String resourceGroupName);

}
