/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mixedreality.v2020_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.mixedreality.v2020_05_01.implementation.SpatialAnchorsAccountsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SpatialAnchorsAccounts.
 */
public interface SpatialAnchorsAccounts extends SupportsCreating<SpatialAnchorsAccount.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<SpatialAnchorsAccount>, SupportsListingByResourceGroup<SpatialAnchorsAccount>, SupportsListing<SpatialAnchorsAccount>, HasInner<SpatialAnchorsAccountsInner> {
    /**
     * List Both of the 2 Keys of a Spatial Anchors Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccountKeys> listKeysAsync(String resourceGroupName, String accountName);

    /**
     * Regenerate specified Key of a Spatial Anchors Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccountKeys> regenerateKeysAsync(String resourceGroupName, String accountName);

}
