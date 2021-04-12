// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobByIdInner;
import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobInner;
import com.azure.resourcemanager.automation.models.SourceControlSyncJobCreateParameters;
import java.util.UUID;

/** An instance of this class provides access to all the operations defined in SourceControlSyncJobsClient. */
public interface SourceControlSyncJobsClient {
    /**
     * Creates the sync job for a source control.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param sourceControlSyncJobId The source control sync job id.
     * @param parameters The parameters supplied to the create source control sync job operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the source control sync job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SourceControlSyncJobInner create(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        UUID sourceControlSyncJobId,
        SourceControlSyncJobCreateParameters parameters);

    /**
     * Creates the sync job for a source control.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param sourceControlSyncJobId The source control sync job id.
     * @param parameters The parameters supplied to the create source control sync job operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the source control sync job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SourceControlSyncJobInner> createWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        UUID sourceControlSyncJobId,
        SourceControlSyncJobCreateParameters parameters,
        Context context);

    /**
     * Retrieve the source control sync job identified by job id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param sourceControlSyncJobId The source control sync job id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the source control sync job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SourceControlSyncJobByIdInner get(
        String resourceGroupName, String automationAccountName, String sourceControlName, UUID sourceControlSyncJobId);

    /**
     * Retrieve the source control sync job identified by job id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param sourceControlSyncJobId The source control sync job id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the source control sync job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SourceControlSyncJobByIdInner> getWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        UUID sourceControlSyncJobId,
        Context context);

    /**
     * Retrieve a list of source control sync jobs.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list source control sync jobs operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SourceControlSyncJobInner> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, String sourceControlName);

    /**
     * Retrieve a list of source control sync jobs.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param filter The filter to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list source control sync jobs operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SourceControlSyncJobInner> listByAutomationAccount(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        String filter,
        Context context);
}
