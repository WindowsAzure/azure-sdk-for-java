// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LinkedSubscriptions. */
public interface LinkedSubscriptions {
    /**
     * Returns a list of all linked subscriptions under current resource group.
     *
     * @param resourceGroup Name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of linked subscriptions with paging support.
     */
    PagedIterable<LinkedSubscription> listByResourceGroup(String resourceGroup);

    /**
     * Returns a list of all linked subscriptions under current resource group.
     *
     * @param resourceGroup Name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of linked subscriptions with paging support.
     */
    PagedIterable<LinkedSubscription> listByResourceGroup(String resourceGroup, Context context);

    /**
     * Returns a list of all linked subscriptions under current subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of linked subscriptions with paging support.
     */
    PagedIterable<LinkedSubscription> list();

    /**
     * Returns a list of all linked subscriptions under current subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of linked subscriptions with paging support.
     */
    PagedIterable<LinkedSubscription> list(Context context);

    /**
     * Returns the properties of a Linked Subscription resource.
     *
     * @param resourceGroup Name of the resource group.
     * @param linkedSubscriptionName Name of the Linked Subscription resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linked Subscription information.
     */
    LinkedSubscription getByResourceGroup(String resourceGroup, String linkedSubscriptionName);

    /**
     * Returns the properties of a Linked Subscription resource.
     *
     * @param resourceGroup Name of the resource group.
     * @param linkedSubscriptionName Name of the Linked Subscription resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linked Subscription information.
     */
    Response<LinkedSubscription> getByResourceGroupWithResponse(
        String resourceGroup, String linkedSubscriptionName, Context context);

    /**
     * Delete the requested Linked Subscription resource.
     *
     * @param resourceGroup Name of the resource group.
     * @param linkedSubscriptionName Name of the Linked Subscription resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroup, String linkedSubscriptionName);

    /**
     * Delete the requested Linked Subscription resource.
     *
     * @param resourceGroup Name of the resource group.
     * @param linkedSubscriptionName Name of the Linked Subscription resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroup, String linkedSubscriptionName, Context context);

    /**
     * Returns the properties of a Linked Subscription resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linked Subscription information.
     */
    LinkedSubscription getById(String id);

    /**
     * Returns the properties of a Linked Subscription resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linked Subscription information.
     */
    Response<LinkedSubscription> getByIdWithResponse(String id, Context context);

    /**
     * Delete the requested Linked Subscription resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete the requested Linked Subscription resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new LinkedSubscription resource.
     *
     * @param name resource name.
     * @return the first stage of the new LinkedSubscription definition.
     */
    LinkedSubscription.DefinitionStages.Blank define(String name);
}
