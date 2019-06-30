/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.monitor.v2018_09_01.implementation.ActionGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ActionGroups.
 */
public interface ActionGroups extends SupportsCreating<ActionGroupResource.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<ActionGroupResource>, SupportsListingByResourceGroup<ActionGroupResource>, SupportsListing<ActionGroupResource>, HasInner<ActionGroupsInner> {
    /**
     * Enable a receiver in an action group. This changes the receiver's status from Disabled to Enabled. This operation is only supported for Email or SMS receivers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param actionGroupName The name of the action group.
     * @param receiverName The name of the receiver to resubscribe.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable enableReceiverAsync(String resourceGroupName, String actionGroupName, String receiverName);

}
