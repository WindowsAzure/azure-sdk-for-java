// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Triggers. */
public interface Triggers {
    /**
     * Lists triggers.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger resources.
     */
    PagedIterable<TriggerResource> listByFactory(String resourceGroupName, String factoryName);

    /**
     * Lists triggers.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger resources.
     */
    PagedIterable<TriggerResource> listByFactory(String resourceGroupName, String factoryName, Context context);

    /**
     * Query triggers.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the triggers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a query of triggers.
     */
    TriggerQueryResponse queryByFactory(
        String resourceGroupName, String factoryName, TriggerFilterParameters filterParameters);

    /**
     * Query triggers.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the triggers.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a query of triggers.
     */
    Response<TriggerQueryResponse> queryByFactoryWithResponse(
        String resourceGroupName, String factoryName, TriggerFilterParameters filterParameters, Context context);

    /**
     * Gets a trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a trigger.
     */
    TriggerResource get(String resourceGroupName, String factoryName, String triggerName);

    /**
     * Gets a trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param ifNoneMatch ETag of the trigger entity. Should only be specified for get. If the ETag matches the existing
     *     entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a trigger.
     */
    Response<TriggerResource> getWithResponse(
        String resourceGroupName, String factoryName, String triggerName, String ifNoneMatch, Context context);

    /**
     * Deletes a trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String factoryName, String triggerName);

    /**
     * Deletes a trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String triggerName, Context context);

    /**
     * Subscribe event trigger to events.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the response of a trigger subscription operation.
     */
    TriggerSubscriptionOperationStatus subscribeToEvents(
        String resourceGroupName, String factoryName, String triggerName);

    /**
     * Subscribe event trigger to events.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the response of a trigger subscription operation.
     */
    TriggerSubscriptionOperationStatus subscribeToEvents(
        String resourceGroupName, String factoryName, String triggerName, Context context);

    /**
     * Get a trigger's event subscription status.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a trigger's event subscription status.
     */
    TriggerSubscriptionOperationStatus getEventSubscriptionStatus(
        String resourceGroupName, String factoryName, String triggerName);

    /**
     * Get a trigger's event subscription status.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a trigger's event subscription status.
     */
    Response<TriggerSubscriptionOperationStatus> getEventSubscriptionStatusWithResponse(
        String resourceGroupName, String factoryName, String triggerName, Context context);

    /**
     * Unsubscribe event trigger from events.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the response of a trigger subscription operation.
     */
    TriggerSubscriptionOperationStatus unsubscribeFromEvents(
        String resourceGroupName, String factoryName, String triggerName);

    /**
     * Unsubscribe event trigger from events.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the response of a trigger subscription operation.
     */
    TriggerSubscriptionOperationStatus unsubscribeFromEvents(
        String resourceGroupName, String factoryName, String triggerName, Context context);

    /**
     * Starts a trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String factoryName, String triggerName);

    /**
     * Starts a trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String factoryName, String triggerName, Context context);

    /**
     * Stops a trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String factoryName, String triggerName);

    /**
     * Stops a trigger.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String factoryName, String triggerName, Context context);

    /**
     * Gets a trigger.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a trigger.
     */
    TriggerResource getById(String id);

    /**
     * Gets a trigger.
     *
     * @param id the resource ID.
     * @param ifNoneMatch ETag of the trigger entity. Should only be specified for get. If the ETag matches the existing
     *     entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a trigger.
     */
    Response<TriggerResource> getByIdWithResponse(String id, String ifNoneMatch, Context context);

    /**
     * Deletes a trigger.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a trigger.
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
     * Begins definition for a new TriggerResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new TriggerResource definition.
     */
    TriggerResource.DefinitionStages.Blank define(String name);
}
