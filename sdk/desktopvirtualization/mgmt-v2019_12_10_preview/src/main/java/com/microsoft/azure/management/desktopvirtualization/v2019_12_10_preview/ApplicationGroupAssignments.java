/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview;

import rx.Observable;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation.ApplicationGroupAssignmentsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ApplicationGroupAssignments.
 */
public interface ApplicationGroupAssignments extends HasInner<ApplicationGroupAssignmentsInner> {
    /**
     * List application group that user can use.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkspaceApplicationGroup> workspaceLevelListAsync(final String resourceGroupName, final String workspaceName);

}
