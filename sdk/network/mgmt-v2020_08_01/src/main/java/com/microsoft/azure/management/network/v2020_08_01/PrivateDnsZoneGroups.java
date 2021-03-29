/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_08_01.implementation.PrivateDnsZoneGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PrivateDnsZoneGroups.
 */
public interface PrivateDnsZoneGroups extends SupportsCreating<PrivateDnsZoneGroup.DefinitionStages.Blank>, HasInner<PrivateDnsZoneGroupsInner> {
    /**
     * Gets the private dns zone group resource by specified private dns zone group name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateDnsZoneGroup> getAsync(String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName);

    /**
     * Gets all private dns zone groups in a private endpoint.
     *
     * @param privateEndpointName The name of the private endpoint.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateDnsZoneGroup> listAsync(final String privateEndpointName, final String resourceGroupName);

    /**
     * Deletes the specified private dns zone group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName);

}
