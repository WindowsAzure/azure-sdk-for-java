/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation.DataCollectorLogsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DataCollectorLogs.
 */
public interface DataCollectorLogs extends HasInner<DataCollectorLogsInner> {
    /**
     * Retrieves a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataCollectorLog> getAsync(String resourceGroupName, String workspaceName, String tableName);

    /**
     * Listing all data collector log tables, being created via data collector endpoint and scoped to the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataCollectorLog> listByWorkspaceAsync(String resourceGroupName, String workspaceName);

    /**
     * Deletes a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String workspaceName, String tableName);

}
