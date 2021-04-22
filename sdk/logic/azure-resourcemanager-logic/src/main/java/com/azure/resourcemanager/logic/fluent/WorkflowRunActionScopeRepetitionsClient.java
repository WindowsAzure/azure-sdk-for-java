// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.WorkflowRunActionRepetitionDefinitionInner;

/**
 * An instance of this class provides access to all the operations defined in WorkflowRunActionScopeRepetitionsClient.
 */
public interface WorkflowRunActionScopeRepetitionsClient {
    /**
     * List the workflow run action scoped repetitions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of workflow run action repetitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowRunActionRepetitionDefinitionInner> list(
        String resourceGroupName, String workflowName, String runName, String actionName);

    /**
     * List the workflow run action scoped repetitions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of workflow run action repetitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowRunActionRepetitionDefinitionInner> list(
        String resourceGroupName, String workflowName, String runName, String actionName, Context context);

    /**
     * Get a workflow run action scoped repetition.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run action scoped repetition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowRunActionRepetitionDefinitionInner get(
        String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName);

    /**
     * Get a workflow run action scoped repetition.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run action scoped repetition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowRunActionRepetitionDefinitionInner> getWithResponse(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        Context context);
}