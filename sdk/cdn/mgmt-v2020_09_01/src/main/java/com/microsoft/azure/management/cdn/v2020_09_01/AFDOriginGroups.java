/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.AFDOriginGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AFDOriginGroups.
 */
public interface AFDOriginGroups extends SupportsCreating<AFDOriginGroup.DefinitionStages.Blank>, HasInner<AFDOriginGroupsInner> {
    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Usage> listResourceUsageAsync(final String resourceGroupName, final String profileName, final String originGroupName);

    /**
     * Gets an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AFDOriginGroup> getAsync(String resourceGroupName, String profileName, String originGroupName);

    /**
     * Lists all of the existing origin groups within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AFDOriginGroup> listByProfileAsync(final String resourceGroupName, final String profileName);

    /**
     * Deletes an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String profileName, String originGroupName);

}
