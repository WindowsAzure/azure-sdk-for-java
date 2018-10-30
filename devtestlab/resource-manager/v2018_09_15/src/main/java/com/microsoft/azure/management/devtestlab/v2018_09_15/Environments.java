/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.devtestlab.v2018_09_15.implementation.EnvironmentsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Environments.
 */
public interface Environments extends SupportsCreating<DtlEnvironment.DefinitionStages.Blank>, HasInner<EnvironmentsInner> {
    /**
     * Get environment.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param userName The name of the user profile.
     * @param name The name of the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DtlEnvironment> getAsync(String resourceGroupName, String labName, String userName, String name);

    /**
     * List environments in a given user profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param userName The name of the user profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DtlEnvironment> listAsync(final String resourceGroupName, final String labName, final String userName);

    /**
     * Delete environment. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param userName The name of the user profile.
     * @param name The name of the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String labName, String userName, String name);

}
