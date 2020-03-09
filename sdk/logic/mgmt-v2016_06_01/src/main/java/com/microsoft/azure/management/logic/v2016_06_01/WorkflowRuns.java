/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.WorkflowRunsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WorkflowRuns.
 */
public interface WorkflowRuns extends HasInner<WorkflowRunsInner> {
    /**
     * Cancels a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAsync(String resourceGroupName, String workflowName, String runName);

    /**
     * Gets a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowWorkflowRun> getAsync(String resourceGroupName, String workflowName, String runName);

    /**
     * Gets a list of workflow runs.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowWorkflowRun> listAsync(final String resourceGroupName, final String workflowName);

    /**
     * Deletes a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String workflowName, String runName);

}
