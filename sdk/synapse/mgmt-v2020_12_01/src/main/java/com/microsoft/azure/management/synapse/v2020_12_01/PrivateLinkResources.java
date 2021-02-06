/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import rx.Observable;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.PrivateLinkResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PrivateLinkResources.
 */
public interface PrivateLinkResources extends HasInner<PrivateLinkResourcesInner> {
    /**
     * Get Private Link Resource.
     * Get private link resource in workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param privateLinkResourceName The name of the private link resource
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkspacePrivateLinkResource> getAsync(String resourceGroupName, String workspaceName, String privateLinkResourceName);

    /**
     * Private Link Resources.
     * Get all private link resources for a workspaces.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkspacePrivateLinkResource> listAsync(final String resourceGroupName, final String workspaceName);

}
