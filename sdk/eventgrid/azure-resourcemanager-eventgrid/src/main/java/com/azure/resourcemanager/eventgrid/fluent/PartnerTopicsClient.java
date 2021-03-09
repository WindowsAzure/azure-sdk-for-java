// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerTopicInner;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicUpdateParameters;

/** An instance of this class provides access to all the operations defined in PartnerTopicsClient. */
public interface PartnerTopicsClient {
    /**
     * Get properties of a partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerTopicInner getByResourceGroup(String resourceGroupName, String partnerTopicName);

    /**
     * Get properties of a partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PartnerTopicInner> getByResourceGroupWithResponse(
        String resourceGroupName, String partnerTopicName, Context context);

    /**
     * Delete existing partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String partnerTopicName);

    /**
     * Delete existing partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String partnerTopicName, Context context);

    /**
     * Delete existing partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String partnerTopicName);

    /**
     * Delete existing partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String partnerTopicName, Context context);

    /**
     * Asynchronously updates a partner topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param partnerTopicUpdateParameters PartnerTopic update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerTopicInner update(
        String resourceGroupName, String partnerTopicName, PartnerTopicUpdateParameters partnerTopicUpdateParameters);

    /**
     * Asynchronously updates a partner topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param partnerTopicUpdateParameters PartnerTopic update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PartnerTopicInner> updateWithResponse(
        String resourceGroupName,
        String partnerTopicName,
        PartnerTopicUpdateParameters partnerTopicUpdateParameters,
        Context context);

    /**
     * List all the partner topics under an Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Topics operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerTopicInner> list();

    /**
     * List all the partner topics under an Azure subscription.
     *
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Topics operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerTopicInner> list(String filter, Integer top, Context context);

    /**
     * List all the partner topics under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Topics operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerTopicInner> listByResourceGroup(String resourceGroupName);

    /**
     * List all the partner topics under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Topics operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerTopicInner> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context);

    /**
     * Activate a newly created partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eventGrid Partner Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerTopicInner activate(String resourceGroupName, String partnerTopicName);

    /**
     * Activate a newly created partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eventGrid Partner Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PartnerTopicInner> activateWithResponse(
        String resourceGroupName, String partnerTopicName, Context context);

    /**
     * Deactivate specific partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eventGrid Partner Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerTopicInner deactivate(String resourceGroupName, String partnerTopicName);

    /**
     * Deactivate specific partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eventGrid Partner Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PartnerTopicInner> deactivateWithResponse(
        String resourceGroupName, String partnerTopicName, Context context);
}
