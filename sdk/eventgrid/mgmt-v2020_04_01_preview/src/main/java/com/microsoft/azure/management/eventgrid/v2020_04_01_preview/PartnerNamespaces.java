/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation.PartnerNamespacesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PartnerNamespaces.
 */
public interface PartnerNamespaces extends SupportsCreating<PartnerNamespace.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<PartnerNamespace>, SupportsListingByResourceGroup<PartnerNamespace>, SupportsListing<PartnerNamespace>, HasInner<PartnerNamespacesInner> {
    /**
     * List keys for a partner namespace.
     * List the two keys used to publish to a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PartnerNamespaceSharedAccessKeys> listSharedAccessKeysAsync(String resourceGroupName, String partnerNamespaceName);

    /**
     * Regenerate key for a partner namespace.
     * Regenerate a shared access key for a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param keyName Key name to regenerate (key1 or key2).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PartnerNamespaceSharedAccessKeys> regenerateKeyAsync(String resourceGroupName, String partnerNamespaceName, String keyName);

}
