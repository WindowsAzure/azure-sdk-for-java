// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceProviders. */
public interface ResourceProviders {
    /**
     * Queries the resources managed by Azure Resource Manager for all subscriptions specified in the request.
     *
     * @param query Request specifying query and its options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result.
     */
    QueryResponse resources(QueryRequest query);

    /**
     * Queries the resources managed by Azure Resource Manager for all subscriptions specified in the request.
     *
     * @param query Request specifying query and its options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result.
     */
    Response<QueryResponse> resourcesWithResponse(QueryRequest query, Context context);
}
