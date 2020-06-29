/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation.DataExportsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DataExports.
 */
public interface DataExports extends SupportsCreating<DataExport.DefinitionStages.Blank>, HasInner<DataExportsInner> {
    /**
     * Gets a data export instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataExportName The data export rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataExport> getAsync(String resourceGroupName, String workspaceName, String dataExportName);

    /**
     * Lists the data export instances within a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataExport> listByWorkspaceAsync(String resourceGroupName, String workspaceName);

    /**
     * Deletes the specified data export in a given workspace..
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataExportName The data export rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String workspaceName, String dataExportName);

}
