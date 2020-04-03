/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation.PartnerTopicsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PartnerTopics.
 */
public interface PartnerTopics extends SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<PartnerTopic>, SupportsListingByResourceGroup<PartnerTopic>, SupportsListing<PartnerTopic>, HasInner<PartnerTopicsInner> {
    /**
     * Activate a partner topic.
     * Activate a newly created partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PartnerTopic> activateAsync(String resourceGroupName, String partnerTopicName);

    /**
     * Deactivate a partner topic.
     * Deactivate specific partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PartnerTopic> deactivateAsync(String resourceGroupName, String partnerTopicName);

}
