/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview;

import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.implementation.PrivateLinkResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PrivateLinkResources.
 */
public interface PrivateLinkResources extends HasInner<PrivateLinkResourcesInner> {
    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateLinkResource> getAsync(String resourceGroupName, String accountName, String groupName);

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateLinkResource> listByDatabaseAccountAsync(String resourceGroupName, String accountName);

}
