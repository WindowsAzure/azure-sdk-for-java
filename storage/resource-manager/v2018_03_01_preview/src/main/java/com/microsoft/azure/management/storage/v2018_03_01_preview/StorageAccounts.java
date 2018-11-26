/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.storage.v2018_03_01_preview.implementation.StorageAccountsInner;
import com.microsoft.azure.arm.model.HasInner;
import rx.Completable;

/**
 * Type representing StorageAccounts.
 */
public interface StorageAccounts extends SupportsCreating<StorageAccount.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<StorageAccount>, SupportsListingByResourceGroup<StorageAccount>, SupportsListing<StorageAccount>, HasInner<StorageAccountsInner> {
    /**
     * Begins definition for a new ManagementPolicy resource.
     * @param name resource name.
     * @return the first stage of the new ManagementPolicy definition.
     */
    StorageAccountManagementPolicies.DefinitionStages.Blank defineManagementPolicy(String name);

    /**
     * Lists the access keys for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageAccountListKeysResult> listKeysAsync(String resourceGroupName, String accountName);

    /**
     * Regenerates one of the access keys for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param keyName The name of storage keys that want to be regenerated, possible vaules are key1, key2.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageAccountListKeysResult> regenerateKeyAsync(String resourceGroupName, String accountName, String keyName);

    /**
     * List SAS credentials of a storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to provide to list SAS credentials for the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ListAccountSasResponse> listAccountSASAsync(String resourceGroupName, String accountName, AccountSasParameters parameters);

    /**
     * List service SAS credentials of a specific resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to provide to list service SAS credentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ListServiceSasResponse> listServiceSASAsync(String resourceGroupName, String accountName, ServiceSasParameters parameters);

    /**
     * Checks that the storage account name is valid and is not already in use.
     *
     * @param name The storage account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckNameAvailabilityResult> checkNameAvailabilityAsync(String name);

    /**
     * Gets the data policy rules associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageAccountManagementPolicies> getManagementPoliciesAsync(String resourceGroupName, String accountName);

    /**
     * Deletes the data policy rules associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteManagementPoliciesAsync(String resourceGroupName, String accountName);

}
