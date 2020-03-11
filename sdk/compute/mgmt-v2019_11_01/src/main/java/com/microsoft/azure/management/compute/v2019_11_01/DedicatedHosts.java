/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.compute.v2019_11_01.implementation.DedicatedHostsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DedicatedHosts.
 */
public interface DedicatedHosts extends SupportsCreating<DedicatedHost.DefinitionStages.Blank>, HasInner<DedicatedHostsInner> {
    /**
     * Retrieves information about a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostName The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DedicatedHost> getAsync(String resourceGroupName, String hostGroupName, String hostName);

    /**
     * Lists all of the dedicated hosts in the specified dedicated host group. Use the nextLink property in the response to get the next page of dedicated hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DedicatedHost> listByHostGroupAsync(final String resourceGroupName, final String hostGroupName);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostName The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String hostGroupName, String hostName);

}
