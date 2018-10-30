/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.devtestlab.v2016_05_15.implementation.SecretsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Secrets.
 */
public interface Secrets extends SupportsCreating<Secret.DefinitionStages.Blank>, HasInner<SecretsInner> {
    /**
     * Get secret.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param userName The name of the user profile.
     * @param name The name of the secret.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Secret> getAsync(String resourceGroupName, String labName, String userName, String name);

    /**
     * List secrets in a given user profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param userName The name of the user profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Secret> listAsync(final String resourceGroupName, final String labName, final String userName);

    /**
     * Delete secret.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param userName The name of the user profile.
     * @param name The name of the secret.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String labName, String userName, String name);

}
