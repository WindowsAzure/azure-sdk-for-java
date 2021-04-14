// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobStreamByIdInner;
import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobStreamInner;
import java.util.UUID;

/** An instance of this class provides access to all the operations defined in SourceControlSyncJobStreamsClient. */
public interface SourceControlSyncJobStreamsClient {
    /**
     * Retrieve a list of sync job streams identified by sync job id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param sourceControlSyncJobId The source control sync job id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list source control sync job streams operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SourceControlSyncJobStreamInner> listBySyncJob(
        String resourceGroupName, String automationAccountName, String sourceControlName, UUID sourceControlSyncJobId);

    /**
     * Retrieve a list of sync job streams identified by sync job id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param sourceControlSyncJobId The source control sync job id.
     * @param filter The filter to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list source control sync job streams operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SourceControlSyncJobStreamInner> listBySyncJob(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        UUID sourceControlSyncJobId,
        String filter,
        Context context);

    /**
     * Retrieve a sync job stream identified by stream id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param sourceControlSyncJobId The source control sync job id.
     * @param streamId The id of the sync job stream.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the source control sync job stream by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SourceControlSyncJobStreamByIdInner get(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        UUID sourceControlSyncJobId,
        String streamId);

    /**
     * Retrieve a sync job stream identified by stream id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param sourceControlSyncJobId The source control sync job id.
     * @param streamId The id of the sync job stream.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the source control sync job stream by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SourceControlSyncJobStreamByIdInner> getWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        UUID sourceControlSyncJobId,
        String streamId,
        Context context);
}
