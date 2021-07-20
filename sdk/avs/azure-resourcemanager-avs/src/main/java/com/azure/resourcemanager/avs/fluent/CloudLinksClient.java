// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.avs.fluent.models.CloudLinkInner;

/** An instance of this class provides access to all the operations defined in CloudLinksClient. */
public interface CloudLinksClient {
    /**
     * List cloud link in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paged list of cloud links.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudLinkInner> list(String resourceGroupName, String privateCloudName);

    /**
     * List cloud link in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paged list of cloud links.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudLinkInner> list(String resourceGroupName, String privateCloudName, Context context);

    /**
     * Get an cloud link by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param cloudLinkName Name of the cloud link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an cloud link by name in a private cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudLinkInner get(String resourceGroupName, String privateCloudName, String cloudLinkName);

    /**
     * Get an cloud link by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param cloudLinkName Name of the cloud link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an cloud link by name in a private cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CloudLinkInner> getWithResponse(
        String resourceGroupName, String privateCloudName, String cloudLinkName, Context context);

    /**
     * Create or update a cloud link in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param cloudLinkName Name of the cloud link resource.
     * @param cloudLink A cloud link in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cloud link resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CloudLinkInner>, CloudLinkInner> beginCreateOrUpdate(
        String resourceGroupName, String privateCloudName, String cloudLinkName, CloudLinkInner cloudLink);

    /**
     * Create or update a cloud link in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param cloudLinkName Name of the cloud link resource.
     * @param cloudLink A cloud link in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cloud link resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CloudLinkInner>, CloudLinkInner> beginCreateOrUpdate(
        String resourceGroupName,
        String privateCloudName,
        String cloudLinkName,
        CloudLinkInner cloudLink,
        Context context);

    /**
     * Create or update a cloud link in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param cloudLinkName Name of the cloud link resource.
     * @param cloudLink A cloud link in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cloud link resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudLinkInner createOrUpdate(
        String resourceGroupName, String privateCloudName, String cloudLinkName, CloudLinkInner cloudLink);

    /**
     * Create or update a cloud link in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param cloudLinkName Name of the cloud link resource.
     * @param cloudLink A cloud link in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cloud link resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudLinkInner createOrUpdate(
        String resourceGroupName,
        String privateCloudName,
        String cloudLinkName,
        CloudLinkInner cloudLink,
        Context context);

    /**
     * Delete a cloud link in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param cloudLinkName Name of the cloud link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String privateCloudName, String cloudLinkName);

    /**
     * Delete a cloud link in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param cloudLinkName Name of the cloud link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String privateCloudName, String cloudLinkName, Context context);

    /**
     * Delete a cloud link in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param cloudLinkName Name of the cloud link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateCloudName, String cloudLinkName);

    /**
     * Delete a cloud link in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param cloudLinkName Name of the cloud link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateCloudName, String cloudLinkName, Context context);
}
