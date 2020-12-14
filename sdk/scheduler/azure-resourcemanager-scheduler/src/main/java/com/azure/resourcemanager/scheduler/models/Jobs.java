// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scheduler.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Jobs. */
public interface Jobs {
    /**
     * Gets a job.
     *
     * @param resourceGroupName The resource group name.
     * @param jobCollectionName The job collection name.
     * @param jobName The job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job.
     */
    JobDefinition get(String resourceGroupName, String jobCollectionName, String jobName);

    /**
     * Gets a job.
     *
     * @param resourceGroupName The resource group name.
     * @param jobCollectionName The job collection name.
     * @param jobName The job name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job.
     */
    Response<JobDefinition> getWithResponse(
        String resourceGroupName, String jobCollectionName, String jobName, Context context);

    /**
     * Deletes a job.
     *
     * @param resourceGroupName The resource group name.
     * @param jobCollectionName The job collection name.
     * @param jobName The job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String jobCollectionName, String jobName);

    /**
     * Deletes a job.
     *
     * @param resourceGroupName The resource group name.
     * @param jobCollectionName The job collection name.
     * @param jobName The job name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String jobCollectionName, String jobName, Context context);

    /**
     * Runs a job.
     *
     * @param resourceGroupName The resource group name.
     * @param jobCollectionName The job collection name.
     * @param jobName The job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void run(String resourceGroupName, String jobCollectionName, String jobName);

    /**
     * Runs a job.
     *
     * @param resourceGroupName The resource group name.
     * @param jobCollectionName The job collection name.
     * @param jobName The job name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> runWithResponse(String resourceGroupName, String jobCollectionName, String jobName, Context context);

    /**
     * Lists all jobs under the specified job collection.
     *
     * @param resourceGroupName The resource group name.
     * @param jobCollectionName The job collection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    PagedIterable<JobDefinition> list(String resourceGroupName, String jobCollectionName);

    /**
     * Lists all jobs under the specified job collection.
     *
     * @param resourceGroupName The resource group name.
     * @param jobCollectionName The job collection name.
     * @param top The number of jobs to request, in the of range of [1..100].
     * @param skip The (0-based) index of the job history list from which to begin requesting entries.
     * @param filter The filter to apply on the job state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    PagedIterable<JobDefinition> list(
        String resourceGroupName, String jobCollectionName, Integer top, Integer skip, String filter, Context context);

    /**
     * Lists job history.
     *
     * @param resourceGroupName The resource group name.
     * @param jobCollectionName The job collection name.
     * @param jobName The job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    PagedIterable<JobHistoryDefinition> listJobHistory(
        String resourceGroupName, String jobCollectionName, String jobName);

    /**
     * Lists job history.
     *
     * @param resourceGroupName The resource group name.
     * @param jobCollectionName The job collection name.
     * @param jobName The job name.
     * @param top the number of job history to request, in the of range of [1..100].
     * @param skip The (0-based) index of the job history list from which to begin requesting entries.
     * @param filter The filter to apply on the job state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    PagedIterable<JobHistoryDefinition> listJobHistory(
        String resourceGroupName,
        String jobCollectionName,
        String jobName,
        Integer top,
        Integer skip,
        String filter,
        Context context);

    /**
     * Gets a job.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job.
     */
    JobDefinition getById(String id);

    /**
     * Gets a job.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job.
     */
    Response<JobDefinition> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a job.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a job.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new JobDefinition resource.
     *
     * @param name resource name.
     * @return the first stage of the new JobDefinition definition.
     */
    JobDefinition.DefinitionStages.Blank define(String name);
}
