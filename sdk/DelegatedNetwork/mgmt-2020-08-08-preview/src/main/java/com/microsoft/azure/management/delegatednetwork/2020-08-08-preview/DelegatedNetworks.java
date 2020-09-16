/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview;

import rx.Observable;
import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.implementation.DelegatedNetworksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DelegatedNetworks.
 */
public interface DelegatedNetworks extends HasInner<DelegatedNetworksInner> {
    /**
     * Get all the delegatedController resources in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DelegatedController> listAsync();

    /**
     * Get all the delegatedController resources in a resource group.
     *
     * @param resourceGroupName The name of the Azure Resource group of which a given DelegatedNetwork resource is part. This name must be at least 1 character in length, and no more than 90.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DelegatedController> listByResourceGroupAsync(String resourceGroupName);

}
