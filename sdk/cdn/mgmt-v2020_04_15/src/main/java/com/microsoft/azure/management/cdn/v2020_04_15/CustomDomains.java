/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_04_15.implementation.CustomDomainsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing CustomDomains.
 */
public interface CustomDomains extends SupportsCreating<CustomDomain.DefinitionStages.Blank>, HasInner<CustomDomainsInner> {
    /**
     * Disable https delivery of the custom domain.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param customDomainName Name of the custom domain within an endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CustomDomain> disableCustomHttpsAsync(String resourceGroupName, String profileName, String endpointName, String customDomainName);

    /**
     * Enable https delivery of the custom domain.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param customDomainName Name of the custom domain within an endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CustomDomain> enableCustomHttpsAsync(String resourceGroupName, String profileName, String endpointName, String customDomainName);

    /**
     * Gets an existing custom domain within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param customDomainName Name of the custom domain within an endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CustomDomain> getAsync(String resourceGroupName, String profileName, String endpointName, String customDomainName);

    /**
     * Lists all of the existing custom domains within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CustomDomain> listByEndpointAsync(final String resourceGroupName, final String profileName, final String endpointName);

    /**
     * Deletes an existing custom domain within an endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param customDomainName Name of the custom domain within an endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String profileName, String endpointName, String customDomainName);

}
