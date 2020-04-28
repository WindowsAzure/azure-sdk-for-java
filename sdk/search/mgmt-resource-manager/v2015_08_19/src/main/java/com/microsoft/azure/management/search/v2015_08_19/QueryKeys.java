/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2015_08_19;

import rx.Observable;
import com.microsoft.azure.management.search.v2015_08_19.implementation.QueryKeysInner;
import com.microsoft.azure.arm.model.HasInner;
import rx.Completable;

/**
 * Type representing QueryKeys.
 */
public interface QueryKeys extends HasInner<QueryKeysInner> {
    /**
     * Returns the list of query API keys for the given Azure Cognitive Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<QueryKey> listBySearchServiceGetAsync(String resourceGroupName, String searchServiceName);

    /**
     * Generates a new query key for the specified Search service. You can create up to 50 query keys per service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @param name The name of the new query API key.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<QueryKey> createAsync(String resourceGroupName, String searchServiceName, String name);

    /**
     * Returns the list of query API keys for the given Azure Cognitive Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<QueryKey> listBySearchServiceAsync(String resourceGroupName, String searchServiceName);

    /**
     * Deletes the specified query key. Unlike admin keys, query keys are not regenerated. The process for regenerating a query key is to delete and then recreate it.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @param key The query key to be deleted. Query keys are identified by value, not by name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String searchServiceName, String key);

}
