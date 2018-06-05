/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.keyvault.v2016_10_01.implementation.VaultsInner;
import com.microsoft.azure.arm.model.HasInner;
import rx.Completable;
import com.microsoft.azure.Resource;

/**
 * Type representing Vaults.
 */
public interface Vaults extends SupportsCreating<Vault.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Vault>, SupportsListingByResourceGroup<Vault>, SupportsListing<Vault>, HasInner<VaultsInner> {
    /**
     * Checks that the vault name is valid and is not already in use.
     *
     * @param name The vault name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckNameAvailabilityResult> checkNameAvailabilityAsync(String name);

    /**
     * Gets the deleted Azure key vault.
     *
     * @param vaultName The name of the vault.
     * @param location The location of the deleted vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeletedVault> getDeletedAsync(String vaultName, String location);

    /**
     * Permanently deletes the specified vault. aka Purges the deleted Azure key vault.
     *
     * @param vaultName The name of the soft-deleted vault.
     * @param location The location of the soft-deleted vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable purgeDeletedAsync(String vaultName, String location);

    /**
     * Gets information about the deleted vaults in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeletedVault> listDeletedAsync();

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Resource> listResourceAsync();

}
