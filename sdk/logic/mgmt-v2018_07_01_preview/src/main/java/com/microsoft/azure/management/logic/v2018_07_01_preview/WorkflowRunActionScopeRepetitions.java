/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import rx.Observable;
import com.microsoft.azure.management.logic.v2018_07_01_preview.implementation.WorkflowRunActionScopeRepetitionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WorkflowRunActionScopeRepetitions.
 */
public interface WorkflowRunActionScopeRepetitions extends HasInner<WorkflowRunActionScopeRepetitionsInner> {
    /**
     * List the workflow run action scoped repetitions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowRunActionRepetitionDefinitionCollection> listAsync(String resourceGroupName, String workflowName, String runName, String actionName);

    /**
     * Get a workflow run action scoped repetition.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel> getAsync(String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName);

}
