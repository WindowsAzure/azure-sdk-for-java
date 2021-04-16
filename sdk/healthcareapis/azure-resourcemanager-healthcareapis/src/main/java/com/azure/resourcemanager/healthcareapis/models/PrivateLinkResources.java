// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateLinkResources. */
public interface PrivateLinkResources {
    /**
     * Gets the private link resources that need to be created for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a service.
     */
    PrivateLinkResourceListResultDescription listByService(String resourceGroupName, String resourceName);

    /**
     * Gets the private link resources that need to be created for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a service.
     */
    Response<PrivateLinkResourceListResultDescription> listByServiceWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Gets a private link resource that need to be created for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param groupName The name of the private link resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource that need to be created for a service.
     */
    PrivateLinkResourceDescription get(String resourceGroupName, String resourceName, String groupName);

    /**
     * Gets a private link resource that need to be created for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param groupName The name of the private link resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource that need to be created for a service.
     */
    Response<PrivateLinkResourceDescription> getWithResponse(
        String resourceGroupName, String resourceName, String groupName, Context context);
}
