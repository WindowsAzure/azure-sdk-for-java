// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managedapplications.fluent.models.ApplicationInner;

/** Resource collection API of Applications. */
public interface Applications {
    /**
     * Gets the managed application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationName The name of the managed application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application.
     */
    Application getByResourceGroup(String resourceGroupName, String applicationName);

    /**
     * Gets the managed application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationName The name of the managed application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application.
     */
    Response<Application> getByResourceGroupWithResponse(
        String resourceGroupName, String applicationName, Context context);

    /**
     * Deletes the managed application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationName The name of the managed application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String applicationName);

    /**
     * Deletes the managed application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationName The name of the managed application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String applicationName, Context context);

    /**
     * Gets all the applications within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the applications within a resource group.
     */
    PagedIterable<Application> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the applications within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the applications within a resource group.
     */
    PagedIterable<Application> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the applications within a subscription.
     *
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the applications within a subscription.
     */
    PagedIterable<Application> list();

    /**
     * Gets all the applications within a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the applications within a subscription.
     */
    PagedIterable<Application> list(Context context);

    /**
     * Gets the managed application.
     *
     * @param applicationId The fully qualified ID of the managed application, including the managed application name
     *     and the managed application resource type. Use the format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applications/{application-name}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application.
     */
    Application getById(String applicationId);

    /**
     * Gets the managed application.
     *
     * @param applicationId The fully qualified ID of the managed application, including the managed application name
     *     and the managed application resource type. Use the format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applications/{application-name}.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application.
     */
    Response<Application> getByIdWithResponse(String applicationId, Context context);

    /**
     * Deletes the managed application.
     *
     * @param applicationId The fully qualified ID of the managed application, including the managed application name
     *     and the managed application resource type. Use the format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applications/{application-name}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String applicationId);

    /**
     * Deletes the managed application.
     *
     * @param applicationId The fully qualified ID of the managed application, including the managed application name
     *     and the managed application resource type. Use the format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applications/{application-name}.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String applicationId, Context context);

    /**
     * Creates a new managed application.
     *
     * @param applicationId The fully qualified ID of the managed application, including the managed application name
     *     and the managed application resource type. Use the format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applications/{application-name}.
     * @param parameters Parameters supplied to the create or update a managed application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application.
     */
    Application createOrUpdateById(String applicationId, ApplicationInner parameters);

    /**
     * Creates a new managed application.
     *
     * @param applicationId The fully qualified ID of the managed application, including the managed application name
     *     and the managed application resource type. Use the format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applications/{application-name}.
     * @param parameters Parameters supplied to the create or update a managed application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application.
     */
    Application createOrUpdateById(String applicationId, ApplicationInner parameters, Context context);

    /**
     * Updates an existing managed application. The only value that can be updated via PATCH currently is the tags.
     *
     * @param applicationId The fully qualified ID of the managed application, including the managed application name
     *     and the managed application resource type. Use the format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applications/{application-name}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application.
     */
    Application updateById(String applicationId);

    /**
     * Updates an existing managed application. The only value that can be updated via PATCH currently is the tags.
     *
     * @param applicationId The fully qualified ID of the managed application, including the managed application name
     *     and the managed application resource type. Use the format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applications/{application-name}.
     * @param parameters Parameters supplied to update an existing managed application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application.
     */
    Response<Application> updateByIdWithResponse(String applicationId, ApplicationInner parameters, Context context);

    /**
     * Begins definition for a new Application resource.
     *
     * @param name resource name.
     * @return the first stage of the new Application definition.
     */
    Application.DefinitionStages.Blank define(String name);
}
