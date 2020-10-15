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
import com.microsoft.azure.management.mediaservices.v2020_05_01.implementation.AccountFiltersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AccountFilters.
 */
public interface AccountFilters extends SupportsCreating<AccountFilter.DefinitionStages.Blank>, HasInner<AccountFiltersInner> {
    /**
     * Get an Account Filter.
     * Get the details of an Account Filter in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filterName The Account Filter name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccountFilter> getAsync(String resourceGroupName, String accountName, String filterName);

    /**
     * List Account Filters.
     * List Account Filters in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccountFilter> listAsync(final String resourceGroupName, final String accountName);

    /**
     * Delete an Account Filter.
     * Deletes an Account Filter in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filterName The Account Filter name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String filterName);

}
