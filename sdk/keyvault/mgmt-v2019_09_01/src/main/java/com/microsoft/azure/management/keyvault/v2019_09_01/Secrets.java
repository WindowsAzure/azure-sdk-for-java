/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.keyvault.v2019_09_01.implementation.SecretsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Secrets.
 */
public interface Secrets extends SupportsCreating<Secret.DefinitionStages.Blank>, HasInner<SecretsInner> {
    /**
     * Gets the specified secret.  NOTE: This API is intended for internal use in ARM deployments. Users should use the data-plane REST service for interaction with vault secrets.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault.
     * @param secretName The name of the secret.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Secret> getAsync(String resourceGroupName, String vaultName, String secretName);

    /**
     * The List operation gets information about the secrets in a vault.  NOTE: This API is intended for internal use in ARM deployments. Users should use the data-plane REST service for interaction with vault secrets.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Secret> listAsync(final String resourceGroupName, final String vaultName);

}
