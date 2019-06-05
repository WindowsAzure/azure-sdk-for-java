/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.IdentityProvidersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing IdentityProviders.
 */
public interface IdentityProviders extends SupportsCreating<IdentityProviderContract.DefinitionStages.Blank>, HasInner<IdentityProvidersInner> {
    /**
     * Lists a collection of Identity Provider configured in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IdentityProviderContract> listByServiceAsync(final String resourceGroupName, final String serviceName);

    /**
     * Gets the entity state (Etag) version of the identityProvider specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier. Possible values include: 'facebook', 'google', 'microsoft', 'twitter', 'aad', 'aadB2C'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getEntityTagAsync(String resourceGroupName, String serviceName, IdentityProviderType identityProviderName);

    /**
     * Gets the configuration details of the identity Provider configured in specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier. Possible values include: 'facebook', 'google', 'microsoft', 'twitter', 'aad', 'aadB2C'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IdentityProviderContract> getAsync(String resourceGroupName, String serviceName, IdentityProviderType identityProviderName);

    /**
     * Deletes the specified identity provider configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier. Possible values include: 'facebook', 'google', 'microsoft', 'twitter', 'aad', 'aadB2C'
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, IdentityProviderType identityProviderName, String ifMatch);

}
