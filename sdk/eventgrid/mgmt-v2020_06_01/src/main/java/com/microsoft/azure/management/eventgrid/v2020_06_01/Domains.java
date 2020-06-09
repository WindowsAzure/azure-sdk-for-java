/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.eventgrid.v2020_06_01.implementation.DomainsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Domains.
 */
public interface Domains extends SupportsCreating<Domain.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Domain>, SupportsListingByResourceGroup<Domain>, SupportsListing<Domain>, HasInner<DomainsInner> {
    /**
     * List keys for a domain.
     * List the two keys used to publish to a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DomainSharedAccessKeys> listSharedAccessKeysAsync(String resourceGroupName, String domainName);

    /**
     * Regenerate key for a domain.
     * Regenerate a shared access key for a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param keyName Key name to regenerate key1 or key2.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DomainSharedAccessKeys> regenerateKeyAsync(String resourceGroupName, String domainName, String keyName);

}
