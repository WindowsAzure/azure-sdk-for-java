// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.time.OffsetDateTime;
import java.util.UUID;

/** Resource collection API of JobExecutions. */
public interface JobExecutions {
    /**
     * Lists all executions in a job agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    PagedIterable<JobExecution> listByAgent(String resourceGroupName, String serverName, String jobAgentName);

    /**
     * Lists all executions in a job agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param createTimeMin If specified, only job executions created at or after the specified time are included.
     * @param createTimeMax If specified, only job executions created before the specified time are included.
     * @param endTimeMin If specified, only job executions completed at or after the specified time are included.
     * @param endTimeMax If specified, only job executions completed before the specified time are included.
     * @param isActive If specified, only active or only completed job executions are included.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    PagedIterable<JobExecution> listByAgent(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        OffsetDateTime createTimeMin,
        OffsetDateTime createTimeMax,
        OffsetDateTime endTimeMin,
        OffsetDateTime endTimeMax,
        Boolean isActive,
        Integer skip,
        Integer top,
        Context context);

    /**
     * Requests cancellation of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobExecutionId The id of the job execution to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId);

    /**
     * Requests cancellation of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobExecutionId The id of the job execution to cancel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> cancelWithResponse(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        Context context);

    /**
     * Starts an elastic job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an execution of a job.
     */
    JobExecution create(String resourceGroupName, String serverName, String jobAgentName, String jobName);

    /**
     * Starts an elastic job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an execution of a job.
     */
    JobExecution create(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, Context context);

    /**
     * Lists a job's executions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    PagedIterable<JobExecution> listByJob(
        String resourceGroupName, String serverName, String jobAgentName, String jobName);

    /**
     * Lists a job's executions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param createTimeMin If specified, only job executions created at or after the specified time are included.
     * @param createTimeMax If specified, only job executions created before the specified time are included.
     * @param endTimeMin If specified, only job executions completed at or after the specified time are included.
     * @param endTimeMax If specified, only job executions completed before the specified time are included.
     * @param isActive If specified, only active or only completed job executions are included.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    PagedIterable<JobExecution> listByJob(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        OffsetDateTime createTimeMin,
        OffsetDateTime createTimeMax,
        OffsetDateTime endTimeMin,
        OffsetDateTime endTimeMax,
        Boolean isActive,
        Integer skip,
        Integer top,
        Context context);

    /**
     * Gets a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobExecutionId The id of the job execution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job execution.
     */
    JobExecution get(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId);

    /**
     * Gets a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobExecutionId The id of the job execution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job execution.
     */
    Response<JobExecution> getWithResponse(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        Context context);

    /**
     * Creates or updates a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The job execution id to create the job execution under.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an execution of a job.
     */
    JobExecution createOrUpdate(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId);

    /**
     * Creates or updates a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The job execution id to create the job execution under.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an execution of a job.
     */
    JobExecution createOrUpdate(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        Context context);
}
