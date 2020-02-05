/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.databox.v2019_09_01.implementation.JobsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Jobs.
 */
public interface Jobs extends SupportsCreating<JobResource.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<JobResource>, SupportsListingByResourceGroup<JobResource>, SupportsListing<JobResource>, HasInner<JobsInner> {
    /**
     * Book shipment pick up.
     *
     * @param resourceGroupName The Resource Group Name
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * @param shipmentPickUpRequest Details of shipment pick up request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ShipmentPickUpResponse> bookShipmentPickUpAsync(String resourceGroupName, String jobName, ShipmentPickUpRequest shipmentPickUpRequest);

    /**
     * CancelJob.
     *
     * @param resourceGroupName The Resource Group Name
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * @param reason Reason for cancellation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAsync(String resourceGroupName, String jobName, String reason);

    /**
     * This method gets the unencrypted secrets related to the job.
     *
     * @param resourceGroupName The Resource Group Name
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UnencryptedCredentials> listCredentialsAsync(String resourceGroupName, String jobName);

}
