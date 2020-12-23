// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservice.generated.fluent.models.PrivateLinkResourcesListResultInner;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient. */
public interface PrivateLinkResourcesClient {
    /**
     * Gets a list of private link resources in the specified managed cluster. The operation returns properties of each
     * private link resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources in the specified managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourcesListResultInner list(String resourceGroupName, String resourceName);

    /**
     * Gets a list of private link resources in the specified managed cluster. The operation returns properties of each
     * private link resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources in the specified managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourcesListResultInner> listWithResponse(
        String resourceGroupName, String resourceName, Context context);
}
