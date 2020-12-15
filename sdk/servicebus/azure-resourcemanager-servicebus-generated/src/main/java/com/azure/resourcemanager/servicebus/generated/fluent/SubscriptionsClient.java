// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.generated.fluent.models.SBSubscriptionInner;

/** An instance of this class provides access to all the operations defined in SubscriptionsClient. */
public interface SubscriptionsClient {
    /**
     * List all the subscriptions under a specified topic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to the List Subscriptions operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SBSubscriptionInner> listByTopic(String resourceGroupName, String namespaceName, String topicName);

    /**
     * List all the subscriptions under a specified topic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param skip Skip is only used if a previous operation returned a partial result. If a previous response contains
     *     a nextLink element, the value of the nextLink element will include a skip parameter that specifies a starting
     *     point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to the List Subscriptions operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SBSubscriptionInner> listByTopic(
        String resourceGroupName, String namespaceName, String topicName, Integer skip, Integer top, Context context);

    /**
     * Creates a topic subscription.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param subscriptionName The subscription name.
     * @param parameters Description of subscription resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of subscription resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SBSubscriptionInner createOrUpdate(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        String subscriptionName,
        SBSubscriptionInner parameters);

    /**
     * Creates a topic subscription.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param subscriptionName The subscription name.
     * @param parameters Description of subscription resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of subscription resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SBSubscriptionInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        String subscriptionName,
        SBSubscriptionInner parameters,
        Context context);

    /**
     * Deletes a subscription from the specified topic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param subscriptionName The subscription name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String topicName, String subscriptionName);

    /**
     * Deletes a subscription from the specified topic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param subscriptionName The subscription name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String topicName, String subscriptionName, Context context);

    /**
     * Returns a subscription description for the specified topic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param subscriptionName The subscription name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of subscription resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SBSubscriptionInner get(String resourceGroupName, String namespaceName, String topicName, String subscriptionName);

    /**
     * Returns a subscription description for the specified topic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param topicName The topic name.
     * @param subscriptionName The subscription name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of subscription resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SBSubscriptionInner> getWithResponse(
        String resourceGroupName, String namespaceName, String topicName, String subscriptionName, Context context);
}
