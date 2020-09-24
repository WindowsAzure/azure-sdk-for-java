/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_06_01;

import rx.Observable;
import com.microsoft.azure.management.netapp.v2020_06_01.implementation.NetAppResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing NetAppResources.
 */
public interface NetAppResources extends HasInner<NetAppResourcesInner> {
    /**
     * Check resource name availability.
     * Check if a resource name is available.
     *
     * @param location The location
     * @param name Resource name to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckAvailabilityResponse> checkNameAvailabilityAsync(String location, String name, CheckNameResourceTypes type, String resourceGroup);

    /**
     * Check file path availability.
     * Check if a file path is available.
     *
     * @param location The location
     * @param name Resource name to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckAvailabilityResponse> checkFilePathAvailabilityAsync(String location, String name, CheckNameResourceTypes type, String resourceGroup);

    /**
     * Check quota availability.
     * Check if a quota is available.
     *
     * @param location The location
     * @param name Name of the resource to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckAvailabilityResponse> checkQuotaAvailabilityAsync(String location, String name, CheckQuotaNameResourceTypes type, String resourceGroup);

}
