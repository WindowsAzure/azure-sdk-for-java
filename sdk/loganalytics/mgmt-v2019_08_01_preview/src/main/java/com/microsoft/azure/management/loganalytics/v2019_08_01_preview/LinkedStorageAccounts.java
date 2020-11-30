/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2019_08_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2019_08_01_preview.implementation.LinkedStorageAccountsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LinkedStorageAccounts.
 */
public interface LinkedStorageAccounts extends SupportsCreating<LinkedStorageAccountList.DefinitionStages.Blank>, HasInner<LinkedStorageAccountsInner> {
    /**
     * Gets all linked storage account of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that will contain the resource.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LinkedStorageAccountList> getAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType);

    /**
     * Gets all linked storage accounts associated with the specified workspace, storage accounts will be sorted by their data source type.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that will contain the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LinkedStorageAccountList> listByWorkspaceAsync(String resourceGroupName, String workspaceName);

    /**
     * Deletes all linked storage accounts of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that will contain the resource.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType);

}
