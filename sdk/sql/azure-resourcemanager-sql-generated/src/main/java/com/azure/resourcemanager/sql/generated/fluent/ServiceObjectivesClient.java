// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ServiceObjectiveInner;

/** An instance of this class provides access to all the operations defined in ServiceObjectivesClient. */
public interface ServiceObjectivesClient {
    /**
     * Gets a database service objective.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceObjectiveName The name of the service objective to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database service objective.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceObjectiveInner get(String resourceGroupName, String serverName, String serviceObjectiveName);

    /**
     * Gets a database service objective.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceObjectiveName The name of the service objective to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database service objective.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServiceObjectiveInner> getWithResponse(
        String resourceGroupName, String serverName, String serviceObjectiveName, Context context);

    /**
     * Returns database service objectives.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a get database service objectives request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceObjectiveInner> listByServer(String resourceGroupName, String serverName);

    /**
     * Returns database service objectives.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a get database service objectives request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceObjectiveInner> listByServer(String resourceGroupName, String serverName, Context context);
}
