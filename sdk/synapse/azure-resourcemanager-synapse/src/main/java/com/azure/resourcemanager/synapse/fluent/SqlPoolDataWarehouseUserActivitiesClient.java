// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.DataWarehouseUserActivitiesInner;
import com.azure.resourcemanager.synapse.models.DataWarehouseUserActivityName;

/**
 * An instance of this class provides access to all the operations defined in SqlPoolDataWarehouseUserActivitiesClient.
 */
public interface SqlPoolDataWarehouseUserActivitiesClient {
    /**
     * Gets the user activities of a SQL pool which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataWarehouseUserActivityName The activity name of the Sql pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a SQL pool which includes running and suspended queries.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataWarehouseUserActivitiesInner get(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName);

    /**
     * Gets the user activities of a SQL pool which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataWarehouseUserActivityName The activity name of the Sql pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a SQL pool which includes running and suspended queries.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataWarehouseUserActivitiesInner> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName,
        Context context);
}
