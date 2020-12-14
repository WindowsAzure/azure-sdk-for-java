// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ManagementGroupSubscriptions. */
public interface ManagementGroupSubscriptions {
    /**
     * Associates existing subscription with the management group.
     *
     * @param groupId Management Group ID.
     * @param subscriptionId Subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of subscription under management group.
     */
    SubscriptionUnderManagementGroup create(String groupId, String subscriptionId);

    /**
     * Associates existing subscription with the management group.
     *
     * @param groupId Management Group ID.
     * @param subscriptionId Subscription ID.
     * @param cacheControl Indicates that the request shouldn't utilize any caches.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of subscription under management group.
     */
    Response<SubscriptionUnderManagementGroup> createWithResponse(
        String groupId, String subscriptionId, String cacheControl, Context context);

    /**
     * De-associates subscription from the management group.
     *
     * @param groupId Management Group ID.
     * @param subscriptionId Subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String groupId, String subscriptionId);

    /**
     * De-associates subscription from the management group.
     *
     * @param groupId Management Group ID.
     * @param subscriptionId Subscription ID.
     * @param cacheControl Indicates that the request shouldn't utilize any caches.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String groupId, String subscriptionId, String cacheControl, Context context);

    /**
     * Retrieves details about given subscription which is associated with the management group.
     *
     * @param groupId Management Group ID.
     * @param subscriptionId Subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of subscription under management group.
     */
    SubscriptionUnderManagementGroup getSubscription(String groupId, String subscriptionId);

    /**
     * Retrieves details about given subscription which is associated with the management group.
     *
     * @param groupId Management Group ID.
     * @param subscriptionId Subscription ID.
     * @param cacheControl Indicates that the request shouldn't utilize any caches.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of subscription under management group.
     */
    Response<SubscriptionUnderManagementGroup> getSubscriptionWithResponse(
        String groupId, String subscriptionId, String cacheControl, Context context);

    /**
     * Retrieves details about all subscriptions which are associated with the management group.
     *
     * @param groupId Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of all subscriptions under management group.
     */
    PagedIterable<SubscriptionUnderManagementGroup> getSubscriptionsUnderManagementGroup(String groupId);

    /**
     * Retrieves details about all subscriptions which are associated with the management group.
     *
     * @param groupId Management Group ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of all subscriptions under management group.
     */
    PagedIterable<SubscriptionUnderManagementGroup> getSubscriptionsUnderManagementGroup(
        String groupId, Context context);
}
