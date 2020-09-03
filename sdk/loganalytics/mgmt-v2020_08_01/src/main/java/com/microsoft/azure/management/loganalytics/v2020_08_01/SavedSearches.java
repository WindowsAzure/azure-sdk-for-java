/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_08_01.implementation.SavedSearchesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SavedSearches.
 */
public interface SavedSearches extends SupportsCreating<SavedSearch.DefinitionStages.Blank>, HasInner<SavedSearchesInner> {
    /**
     * Gets the saved searches for a given Log Analytics Workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SavedSearchesListResult> listByWorkspaceAsync(String resourceGroupName, String workspaceName);

    /**
     * Gets the specified saved search for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SavedSearch> getAsync(String resourceGroupName, String workspaceName, String savedSearchId);

    /**
     * Deletes the specified saved search in a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String workspaceName, String savedSearchId);

}
