// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.PrivateLinkResourceInner;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient. */
public interface PrivateLinkResourcesClient {
    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkResourceInner> listByPrivateLinkScope(String resourceGroupName, String scopeName);

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkResourceInner> listByPrivateLinkScope(
        String resourceGroupName, String scopeName, Context context);

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourceInner get(String resourceGroupName, String scopeName, String groupName);

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param groupName The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourceInner> getWithResponse(
        String resourceGroupName, String scopeName, String groupName, Context context);
}
