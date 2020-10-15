/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.mediaservices.v2020_05_01.implementation.ContentKeyPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ContentKeyPolicies.
 */
public interface ContentKeyPolicies extends SupportsCreating<ContentKeyPolicy.DefinitionStages.Blank>, HasInner<ContentKeyPoliciesInner> {
    /**
     * Get a Content Key Policy with secrets.
     * Get a Content Key Policy including secret values.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param contentKeyPolicyName The Content Key Policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ContentKeyPolicyProperties> getPolicyPropertiesWithSecretsAsync(String resourceGroupName, String accountName, String contentKeyPolicyName);

    /**
     * Get a Content Key Policy.
     * Get the details of a Content Key Policy in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param contentKeyPolicyName The Content Key Policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ContentKeyPolicy> getAsync(String resourceGroupName, String accountName, String contentKeyPolicyName);

    /**
     * List Content Key Policies.
     * Lists the Content Key Policies in the account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ContentKeyPolicy> listAsync(final String resourceGroupName, final String accountName);

    /**
     * Delete a Content Key Policy.
     * Deletes a Content Key Policy in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param contentKeyPolicyName The Content Key Policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String contentKeyPolicyName);

}
