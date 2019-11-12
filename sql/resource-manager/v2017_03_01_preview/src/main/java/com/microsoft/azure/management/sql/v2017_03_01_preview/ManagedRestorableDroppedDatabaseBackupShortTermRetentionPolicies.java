/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies.
 */
public interface ManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies extends SupportsCreating<RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy.DefinitionStages.Blank>, HasInner<ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesInner> {
    /**
     * Gets a dropped database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy> getAsync(String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId);

    /**
     * Gets a dropped database's short term retention policy list.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy> listByRestorableDroppedDatabaseAsync(final String resourceGroupName, final String managedInstanceName, final String restorableDroppedDatabaseId);

}
