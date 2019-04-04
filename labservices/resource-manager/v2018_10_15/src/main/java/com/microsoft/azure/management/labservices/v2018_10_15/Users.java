/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.labservices.v2018_10_15.implementation.UsersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Users.
 */
public interface Users extends SupportsCreating<User.DefinitionStages.Blank>, HasInner<UsersInner> {
    /**
     * Get user.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param userName The name of the user.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<User> getAsync(String resourceGroupName, String labAccountName, String labName, String userName);

    /**
     * List users in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<User> listAsync(final String resourceGroupName, final String labAccountName, final String labName);

    /**
     * Delete user. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param userName The name of the user.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String labAccountName, String labName, String userName);

}
