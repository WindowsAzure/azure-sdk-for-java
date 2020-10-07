// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.ElasticPoolActivityInner;

/** An instance of this class provides access to all the operations defined in ElasticPoolActivitiesClient. */
public interface ElasticPoolActivitiesClient {
    /**
     * Returns elastic pool activities.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool for which to get the current activity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list elastic pool activity request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ElasticPoolActivityInner> listByElasticPoolAsync(
        String resourceGroupName, String serverName, String elasticPoolName);

    /**
     * Returns elastic pool activities.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool for which to get the current activity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list elastic pool activity request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ElasticPoolActivityInner> listByElasticPool(
        String resourceGroupName, String serverName, String elasticPoolName);

    /**
     * Returns elastic pool activities.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool for which to get the current activity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list elastic pool activity request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ElasticPoolActivityInner> listByElasticPool(
        String resourceGroupName, String serverName, String elasticPoolName, Context context);
}
