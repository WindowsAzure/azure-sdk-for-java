// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.TestJobInner;
import com.azure.resourcemanager.automation.models.TestJobCreateParameters;

/** An instance of this class provides access to all the operations defined in TestJobsClient. */
public interface TestJobsClient {
    /**
     * Create a test job of the runbook.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The parameters supplied to the create test job operation.
     * @param parameters The parameters supplied to the create test job operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the test job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TestJobInner create(
        String resourceGroupName, String automationAccountName, String runbookName, TestJobCreateParameters parameters);

    /**
     * Create a test job of the runbook.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The parameters supplied to the create test job operation.
     * @param parameters The parameters supplied to the create test job operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the test job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TestJobInner> createWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String runbookName,
        TestJobCreateParameters parameters,
        Context context);

    /**
     * Retrieve the test job for the specified runbook.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the test job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TestJobInner get(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Retrieve the test job for the specified runbook.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the test job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TestJobInner> getWithResponse(
        String resourceGroupName, String automationAccountName, String runbookName, Context context);

    /**
     * Resume the test job.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resume(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Resume the test job.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> resumeWithResponse(
        String resourceGroupName, String automationAccountName, String runbookName, Context context);

    /**
     * Stop the test job.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Stop the test job.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> stopWithResponse(
        String resourceGroupName, String automationAccountName, String runbookName, Context context);

    /**
     * Suspend the test job.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void suspend(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Suspend the test job.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> suspendWithResponse(
        String resourceGroupName, String automationAccountName, String runbookName, Context context);
}
