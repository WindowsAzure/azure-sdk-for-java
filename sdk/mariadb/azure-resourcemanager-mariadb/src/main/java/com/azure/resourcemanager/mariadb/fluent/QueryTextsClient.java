// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mariadb.fluent.models.QueryTextInner;
import java.util.List;

/** An instance of this class provides access to all the operations defined in QueryTextsClient. */
public interface QueryTextsClient {
    /**
     * Retrieve the Query-Store query texts for the queryId.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param queryId The Query-Store query identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Query Text.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    QueryTextInner get(String resourceGroupName, String serverName, String queryId);

    /**
     * Retrieve the Query-Store query texts for the queryId.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param queryId The Query-Store query identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Query Text.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<QueryTextInner> getWithResponse(
        String resourceGroupName, String serverName, String queryId, Context context);

    /**
     * Retrieve the Query-Store query texts for specified queryIds.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param queryIds The query identifiers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of query texts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<QueryTextInner> listByServer(String resourceGroupName, String serverName, List<String> queryIds);

    /**
     * Retrieve the Query-Store query texts for specified queryIds.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param queryIds The query identifiers.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of query texts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<QueryTextInner> listByServer(
        String resourceGroupName, String serverName, List<String> queryIds, Context context);
}
