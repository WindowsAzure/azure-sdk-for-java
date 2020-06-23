/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation.WorkspacePurgesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WorkspacePurges.
 */
public interface WorkspacePurges extends HasInner<WorkspacePurgesInner> {
    /**
     * Gets status of an ongoing purge operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param purgeId In a purge status request, this is the Id of the operation the status of which is returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkspacePurgeStatusResponse> getPurgeStatusAsync(String resourceGroupName, String workspaceName, String purgeId);

    /**
     * Purges data in an Log Analytics workspace by a set of user-defined filters.
    In order to manage system resources, purge requests are throttled at 50 requests per hour. You should batch the execution of purge requests by sending a single command whose predicate includes all user identities that require purging. Use the in operator to specify multiple identities. You should run the query prior to using for a purge request to verify that the results are expected.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param body Describes the body of a request to purge data in a single table of an Log Analytics Workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkspacePurgeResponse> purgeAsync(String resourceGroupName, String workspaceName, WorkspacePurgeBody body);

}
