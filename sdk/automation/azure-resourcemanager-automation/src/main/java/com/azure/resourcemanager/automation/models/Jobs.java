// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Jobs. */
public interface Jobs {
    /**
     * Retrieve the job output identified by job name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The name of the job to be created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String getOutput(String resourceGroupName, String automationAccountName, String jobName);

    /**
     * Retrieve the job output identified by job name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The name of the job to be created.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<String> getOutputWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String clientRequestId,
        Context context);

    /**
     * Retrieve the runbook content of the job identified by job name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String getRunbookContent(String resourceGroupName, String automationAccountName, String jobName);

    /**
     * Retrieve the runbook content of the job identified by job name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<String> getRunbookContentWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String clientRequestId,
        Context context);

    /**
     * Suspend the job identified by job name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void suspend(String resourceGroupName, String automationAccountName, String jobName);

    /**
     * Suspend the job identified by job name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> suspendWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String clientRequestId,
        Context context);

    /**
     * Stop the job identified by jobName.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String automationAccountName, String jobName);

    /**
     * Stop the job identified by jobName.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> stopWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String clientRequestId,
        Context context);

    /**
     * Retrieve the job identified by job name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job.
     */
    Job get(String resourceGroupName, String automationAccountName, String jobName);

    /**
     * Retrieve the job identified by job name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job.
     */
    Response<Job> getWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String clientRequestId,
        Context context);

    /**
     * Retrieve a list of jobs.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job operation.
     */
    PagedIterable<JobCollectionItem> listByAutomationAccount(String resourceGroupName, String automationAccountName);

    /**
     * Retrieve a list of jobs.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param filter The filter to apply on the operation.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job operation.
     */
    PagedIterable<JobCollectionItem> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, String filter, String clientRequestId, Context context);

    /**
     * Resume the job identified by jobName.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resume(String resourceGroupName, String automationAccountName, String jobName);

    /**
     * Resume the job identified by jobName.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> resumeWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String clientRequestId,
        Context context);

    /**
     * Retrieve the job identified by job name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job.
     */
    Job getById(String id);

    /**
     * Retrieve the job identified by job name.
     *
     * @param id the resource ID.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job.
     */
    Response<Job> getByIdWithResponse(String id, String clientRequestId, Context context);

    /**
     * Begins definition for a new Job resource.
     *
     * @param name resource name.
     * @return the first stage of the new Job definition.
     */
    Job.DefinitionStages.Blank define(String name);
}
