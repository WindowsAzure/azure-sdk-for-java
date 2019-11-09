/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.netapp.v2019_08_01.implementation.PoolsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Pools.
 */
public interface Pools extends SupportsCreating<CapacityPool.DefinitionStages.Blank>, HasInner<PoolsInner> {
    /**
     * Describe a Capacity Pool.
     * Get details of the specified capacity pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CapacityPool> getAsync(String resourceGroupName, String accountName, String poolName);

    /**
     * Describe all Capacity Pools.
     * List all capacity pools in the NetApp Account.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CapacityPool> listAsync(String resourceGroupName, String accountName);

    /**
     * Delete a capacity pool.
     * Delete the specified capacity pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String poolName);

}
