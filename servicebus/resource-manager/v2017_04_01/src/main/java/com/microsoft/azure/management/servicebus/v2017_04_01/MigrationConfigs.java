/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.servicebus.v2017_04_01.implementation.MigrationConfigsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing MigrationConfigs.
 */
public interface MigrationConfigs extends SupportsCreating<MigrationConfigProperties.DefinitionStages.Blank>, HasInner<MigrationConfigsInner> {
    /**
     * This operation Completes Migration of entities by pointing the connection strings to Premium namespace and any entities created after the operation will be under Premium Namespace. CompleteMigration operation will fail when entity migration is in-progress.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable completeMigrationAsync(String resourceGroupName, String namespaceName);

    /**
     * This operation reverts Migration.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable revertAsync(String resourceGroupName, String namespaceName);

    /**
     * Retrieves Migration Config.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MigrationConfigProperties> getAsync(String resourceGroupName, String namespaceName);

    /**
     * Gets all migrationConfigurations.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MigrationConfigProperties> listAsync(final String resourceGroupName, final String namespaceName);

    /**
     * Deletes a MigrationConfiguration.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String namespaceName);

}
