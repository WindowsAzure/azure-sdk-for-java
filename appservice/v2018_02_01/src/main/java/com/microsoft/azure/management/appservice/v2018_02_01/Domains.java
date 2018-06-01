/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.DomainsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.DomainOwnershipIdentifier;

/**
 * Type representing Domains.
 */
public interface Domains extends SupportsCreating<Domain.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Domain>, SupportsListingByResourceGroup<Domain>, SupportsListing<Domain>, HasInner<DomainsInner> {
    DomainOwnershipIdentifier.DefinitionStages.Blank defineDomainOwnershipIdentifier(String name);

    /**
     * Renew a domain.
     * Renew a domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable renewAsync(String resourceGroupName, String domainName);

    /**
     * Check if a domain is available for registration.
     * Check if a domain is available for registration.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DomainAvailablilityCheckResult> checkAvailabilityAsync();

    /**
     * Generate a single sign-on request for the domain management portal.
     * Generate a single sign-on request for the domain management portal.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DomainControlCenterSsoRequest> getControlCenterSsoRequestAsync();

    /**
     * Get domain name recommendations based on keywords.
     * Get domain name recommendations based on keywords.
     *
     * @param parameters Search parameters for domain name recommendations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NameIdentifier> listRecommendationsAsync(final DomainRecommendationSearchParameters parameters);

    /**
     * Get ownership identifier for domain.
     * Get ownership identifier for domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of domain.
     * @param name Name of identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DomainOwnershipIdentifier> getOwnershipIdentifierAsync(String resourceGroupName, String domainName, String name);

    /**
     * Lists domain ownership identifiers.
     * Lists domain ownership identifiers.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DomainOwnershipIdentifier> listOwnershipIdentifiersAsync(final String resourceGroupName, final String domainName);

    /**
     * Delete ownership identifier for domain.
     * Delete ownership identifier for domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of domain.
     * @param name Name of identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteOwnershipIdentifierAsync(String resourceGroupName, String domainName, String name);

}
