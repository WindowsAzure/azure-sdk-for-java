// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresql.fluent.models.ServerInner;

/** An instance of this class provides access to all the operations defined in ReplicasClient. */
public interface ReplicasClient {
    /**
     * List all the replicas for a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of servers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerInner> listByServer(String resourceGroupName, String serverName);

    /**
     * List all the replicas for a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of servers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerInner> listByServer(String resourceGroupName, String serverName, Context context);
}
