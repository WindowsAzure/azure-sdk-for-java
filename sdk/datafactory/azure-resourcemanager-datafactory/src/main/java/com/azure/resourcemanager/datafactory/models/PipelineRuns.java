// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PipelineRuns. */
public interface PipelineRuns {
    /**
     * Query pipeline runs in the factory based on input filter conditions.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs.
     */
    PipelineRunsQueryResponse queryByFactory(
        String resourceGroupName, String factoryName, RunFilterParameters filterParameters);

    /**
     * Query pipeline runs in the factory based on input filter conditions.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the pipeline run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs.
     */
    Response<PipelineRunsQueryResponse> queryByFactoryWithResponse(
        String resourceGroupName, String factoryName, RunFilterParameters filterParameters, Context context);

    /**
     * Get a pipeline run by its run ID.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID.
     */
    PipelineRun get(String resourceGroupName, String factoryName, String runId);

    /**
     * Get a pipeline run by its run ID.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID.
     */
    Response<PipelineRun> getWithResponse(String resourceGroupName, String factoryName, String runId, Context context);

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel(String resourceGroupName, String factoryName, String runId);

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param isRecursive If true, cancel all the Child pipelines that are triggered by the current pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> cancelWithResponse(
        String resourceGroupName, String factoryName, String runId, Boolean isRecursive, Context context);
}
