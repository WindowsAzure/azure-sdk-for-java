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
import com.azure.resourcemanager.logic.models.ExpressionRoot;

/** An instance of this class provides access to all the operations defined in WorkflowRunActionRepetitionsClient. */
public interface WorkflowRunActionRepetitionsClient {
    /**
     * Get all of a workflow run action repetitions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all of a workflow run action repetitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowRunActionRepetitionDefinitionInner> list(
        String resourceGroupName, String workflowName, String runName, String actionName);

    /**
     * Get all of a workflow run action repetitions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all of a workflow run action repetitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowRunActionRepetitionDefinitionInner> list(
        String resourceGroupName, String workflowName, String runName, String actionName, Context context);

    /**
     * Get a workflow run action repetition.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run action repetition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowRunActionRepetitionDefinitionInner get(
        String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName);

    /**
     * Get a workflow run action repetition.
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
     * @return a workflow run action repetition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowRunActionRepetitionDefinitionInner> getWithResponse(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        Context context);

    /**
     * Lists a workflow run expression trace.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the expression traces.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressionRoot> listExpressionTraces(
        String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName);

    /**
     * Lists a workflow run expression trace.
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
     * @return the expression traces.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressionRoot> listExpressionTraces(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        Context context);
}
