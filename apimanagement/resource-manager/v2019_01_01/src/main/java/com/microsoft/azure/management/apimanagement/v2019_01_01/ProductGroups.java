/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ProductGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProductGroups.
 */
public interface ProductGroups extends SupportsCreating<ProductGroupContract.DefinitionStages.Blank>, HasInner<ProductGroupsInner> {
    /**
     * Checks that Group entity specified by identifier is associated with the Product entity.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param groupId Group identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable checkEntityExistsAsync(String resourceGroupName, String serviceName, String productId, String groupId);

    /**
     * Lists the collection of developer groups associated with the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProductGroupContract> listByProductAsync(final String resourceGroupName, final String serviceName, final String productId);

    /**
     * Deletes the association between the specified group and product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param groupId Group identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, String productId, String groupId);

}
