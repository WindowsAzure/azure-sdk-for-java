// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.healthcareapis.fluent.models.ServicesDescriptionInner;
import com.azure.resourcemanager.healthcareapis.fluent.models.ServicesNameAvailabilityInfoInner;
import com.azure.resourcemanager.healthcareapis.models.CheckNameAvailabilityParameters;
import com.azure.resourcemanager.healthcareapis.models.ServicesPatchDescription;

/** An instance of this class provides access to all the operations defined in ServicesClient. */
public interface ServicesClient {
    /**
     * Get the metadata of a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of a service instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServicesDescriptionInner getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Get the metadata of a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of a service instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServicesDescriptionInner> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Create or update the metadata of a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param serviceDescription The service instance metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServicesDescriptionInner>, ServicesDescriptionInner> beginCreateOrUpdate(
        String resourceGroupName, String resourceName, ServicesDescriptionInner serviceDescription);

    /**
     * Create or update the metadata of a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param serviceDescription The service instance metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServicesDescriptionInner>, ServicesDescriptionInner> beginCreateOrUpdate(
        String resourceGroupName, String resourceName, ServicesDescriptionInner serviceDescription, Context context);

    /**
     * Create or update the metadata of a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param serviceDescription The service instance metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServicesDescriptionInner createOrUpdate(
        String resourceGroupName, String resourceName, ServicesDescriptionInner serviceDescription);

    /**
     * Create or update the metadata of a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param serviceDescription The service instance metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServicesDescriptionInner createOrUpdate(
        String resourceGroupName, String resourceName, ServicesDescriptionInner serviceDescription, Context context);

    /**
     * Update the metadata of a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param servicePatchDescription The service instance metadata and security metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServicesDescriptionInner>, ServicesDescriptionInner> beginUpdate(
        String resourceGroupName, String resourceName, ServicesPatchDescription servicePatchDescription);

    /**
     * Update the metadata of a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param servicePatchDescription The service instance metadata and security metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServicesDescriptionInner>, ServicesDescriptionInner> beginUpdate(
        String resourceGroupName,
        String resourceName,
        ServicesPatchDescription servicePatchDescription,
        Context context);

    /**
     * Update the metadata of a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param servicePatchDescription The service instance metadata and security metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServicesDescriptionInner update(
        String resourceGroupName, String resourceName, ServicesPatchDescription servicePatchDescription);

    /**
     * Update the metadata of a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param servicePatchDescription The service instance metadata and security metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServicesDescriptionInner update(
        String resourceGroupName,
        String resourceName,
        ServicesPatchDescription servicePatchDescription,
        Context context);

    /**
     * Delete a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String resourceName);

    /**
     * Delete a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String resourceName, Context context);

    /**
     * Delete a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName);

    /**
     * Delete a service instance.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, Context context);

    /**
     * Get all the service instances in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service instances in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServicesDescriptionInner> list();

    /**
     * Get all the service instances in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service instances in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServicesDescriptionInner> list(Context context);

    /**
     * Get all the service instances in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service instances in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServicesDescriptionInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get all the service instances in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service instances in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServicesDescriptionInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Check if a service instance name is available.
     *
     * @param checkNameAvailabilityInputs Set the name parameter in the CheckNameAvailabilityParameters structure to the
     *     name of the service instance to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties indicating whether a given service name is available.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServicesNameAvailabilityInfoInner checkNameAvailability(
        CheckNameAvailabilityParameters checkNameAvailabilityInputs);

    /**
     * Check if a service instance name is available.
     *
     * @param checkNameAvailabilityInputs Set the name parameter in the CheckNameAvailabilityParameters structure to the
     *     name of the service instance to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties indicating whether a given service name is available.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServicesNameAvailabilityInfoInner> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityParameters checkNameAvailabilityInputs, Context context);
}
