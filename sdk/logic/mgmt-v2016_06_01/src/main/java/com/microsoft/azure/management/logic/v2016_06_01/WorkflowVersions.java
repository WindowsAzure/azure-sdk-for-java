/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import rx.Observable;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowVersion;

/**
 * Type representing WorkflowVersions.
 */
public interface WorkflowVersions {
    /**
     * Gets a workflow version.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowVersion> getAsync(String resourceGroupName, String workflowName, String versionId);

    /**
     * Gets a list of workflow versions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowVersion> listAsync(final String resourceGroupName, final String workflowName);

    /**
     * Get the callback url for a trigger of a workflow version.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowTriggerCallbackUrl> listCallbackUrlAsync(String resourceGroupName, String workflowName, String versionId, String triggerName);

}
