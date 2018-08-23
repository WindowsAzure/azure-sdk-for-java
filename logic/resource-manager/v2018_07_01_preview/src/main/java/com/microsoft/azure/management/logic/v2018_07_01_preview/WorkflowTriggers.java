/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import rx.Observable;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowTrigger;
import rx.Completable;
import com.microsoft.azure.management.logic.v2018_07_01_preview.implementation.WorkflowTriggerInner;

/**
 * Type representing WorkflowTriggers.
 */
public interface WorkflowTriggers {
    /**
     * Gets a workflow trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowTrigger> getAsync(String resourceGroupName, String workflowName, String triggerName);

    /**
     * Gets a list of workflow triggers.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowTrigger> listAsync(final String resourceGroupName, final String workflowName);

    /**
     * Resets a workflow trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resetAsync(String resourceGroupName, String workflowName, String triggerName);

    /**
     * Runs a workflow trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable runAsync(String resourceGroupName, String workflowName, String triggerName);

    /**
     * Sets the state of a workflow trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param source the WorkflowTriggerInner value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable setStateAsync(String resourceGroupName, String workflowName, String triggerName, WorkflowTriggerInner source);

    /**
     * Get the callback URL for a workflow trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowTriggerCallbackUrl> listCallbackUrlAsync(String resourceGroupName, String workflowName, String triggerName);

    /**
     * Get the trigger schema as JSON.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<JsonSchema> getSchemaJsonAsync(String resourceGroupName, String workflowName, String triggerName);

}
