// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcegraph.fluent.models.QueryResponseInner;
import com.azure.resourcemanager.resourcegraph.fluent.models.ResourceChangeDataInner;
import com.azure.resourcemanager.resourcegraph.fluent.models.ResourceChangeListInner;
import com.azure.resourcemanager.resourcegraph.models.QueryRequest;
import com.azure.resourcemanager.resourcegraph.models.ResourceChangeDetailsRequestParameters;
import com.azure.resourcemanager.resourcegraph.models.ResourceChangesRequestParameters;
import com.azure.resourcemanager.resourcegraph.models.ResourcesHistoryRequest;
import java.util.List;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public interface ResourceProvidersClient {
    /**
     * List changes to a resource for a given time interval.
     *
     * @param parameters the parameters for this request for changes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of changes associated with a resource over a specific time interval.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceChangeListInner resourceChanges(ResourceChangesRequestParameters parameters);

    /**
     * List changes to a resource for a given time interval.
     *
     * @param parameters the parameters for this request for changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of changes associated with a resource over a specific time interval.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceChangeListInner> resourceChangesWithResponse(
        ResourceChangesRequestParameters parameters, Context context);

    /**
     * Get resource change details.
     *
     * @param parameters The parameters for this request for resource change details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource change details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<ResourceChangeDataInner> resourceChangeDetails(ResourceChangeDetailsRequestParameters parameters);

    /**
     * Get resource change details.
     *
     * @param parameters The parameters for this request for resource change details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource change details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<ResourceChangeDataInner>> resourceChangeDetailsWithResponse(
        ResourceChangeDetailsRequestParameters parameters, Context context);

    /**
     * Queries the resources managed by Azure Resource Manager for scopes specified in the request.
     *
     * @param query Request specifying query and its options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    QueryResponseInner resources(QueryRequest query);

    /**
     * Queries the resources managed by Azure Resource Manager for scopes specified in the request.
     *
     * @param query Request specifying query and its options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<QueryResponseInner> resourcesWithResponse(QueryRequest query, Context context);

    /**
     * List all snapshots of a resource for a given time interval.
     *
     * @param request The request parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object resourcesHistory(ResourcesHistoryRequest request);

    /**
     * List all snapshots of a resource for a given time interval.
     *
     * @param request The request parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Object> resourcesHistoryWithResponse(ResourcesHistoryRequest request, Context context);
}
