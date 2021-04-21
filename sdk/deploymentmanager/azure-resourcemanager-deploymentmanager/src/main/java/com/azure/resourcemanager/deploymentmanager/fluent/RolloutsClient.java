// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.deploymentmanager.fluent.models.RolloutInner;
import com.azure.resourcemanager.deploymentmanager.fluent.models.RolloutRequestInner;
import java.util.List;

/** An instance of this class provides access to all the operations defined in RolloutsClient. */
public interface RolloutsClient {
    /**
     * This is an asynchronous operation and can be polled to completion using the location header returned by this
     * operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @param rolloutRequest Source rollout request object that defines the rollout.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the PUT rollout request body.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RolloutRequestInner>, RolloutRequestInner> beginCreateOrUpdate(
        String resourceGroupName, String rolloutName, RolloutRequestInner rolloutRequest);

    /**
     * This is an asynchronous operation and can be polled to completion using the location header returned by this
     * operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @param rolloutRequest Source rollout request object that defines the rollout.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the PUT rollout request body.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RolloutRequestInner>, RolloutRequestInner> beginCreateOrUpdate(
        String resourceGroupName, String rolloutName, RolloutRequestInner rolloutRequest, Context context);

    /**
     * This is an asynchronous operation and can be polled to completion using the location header returned by this
     * operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @param rolloutRequest Source rollout request object that defines the rollout.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the PUT rollout request body.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RolloutRequestInner createOrUpdate(
        String resourceGroupName, String rolloutName, RolloutRequestInner rolloutRequest);

    /**
     * This is an asynchronous operation and can be polled to completion using the location header returned by this
     * operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the PUT rollout request body.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RolloutRequestInner createOrUpdate(String resourceGroupName, String rolloutName);

    /**
     * This is an asynchronous operation and can be polled to completion using the location header returned by this
     * operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @param rolloutRequest Source rollout request object that defines the rollout.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the PUT rollout request body.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RolloutRequestInner createOrUpdate(
        String resourceGroupName, String rolloutName, RolloutRequestInner rolloutRequest, Context context);

    /**
     * Gets detailed information of a rollout.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detailed information of a rollout.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RolloutInner getByResourceGroup(String resourceGroupName, String rolloutName);

    /**
     * Gets detailed information of a rollout.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @param retryAttempt Rollout retry attempt ordinal to get the result of. If not specified, result of the latest
     *     attempt will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detailed information of a rollout.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RolloutInner> getByResourceGroupWithResponse(
        String resourceGroupName, String rolloutName, Integer retryAttempt, Context context);

    /**
     * Only rollouts in terminal state can be deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String rolloutName);

    /**
     * Only rollouts in terminal state can be deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String rolloutName, Context context);

    /**
     * Only running rollouts can be canceled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the rollout.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RolloutInner cancel(String resourceGroupName, String rolloutName);

    /**
     * Only running rollouts can be canceled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the rollout.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RolloutInner> cancelWithResponse(String resourceGroupName, String rolloutName, Context context);

    /**
     * Only failed rollouts can be restarted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the rollout.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RolloutInner restart(String resourceGroupName, String rolloutName);

    /**
     * Only failed rollouts can be restarted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @param skipSucceeded If true, will skip all succeeded steps so far in the rollout. If false, will execute the
     *     entire rollout again regardless of the current state of individual resources. Defaults to false if not
     *     specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the rollout.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RolloutInner> restartWithResponse(
        String resourceGroupName, String rolloutName, Boolean skipSucceeded, Context context);

    /**
     * Lists the rollouts in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of rollouts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<RolloutInner> list(String resourceGroupName);

    /**
     * Lists the rollouts in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of rollouts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<RolloutInner>> listWithResponse(String resourceGroupName, Context context);
}
