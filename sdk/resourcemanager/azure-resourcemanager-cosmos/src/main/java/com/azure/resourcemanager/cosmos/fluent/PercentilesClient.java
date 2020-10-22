// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.fluent.models.PercentileMetricInner;

/** An instance of this class provides access to all the operations defined in PercentilesClient. */
public interface PercentilesClient {
    /**
     * Retrieves the metrics determined by the given filter for the given database account. This url is only for PBS and
     * Replication Latency data.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PercentileMetricInner> listMetricsAsync(String resourceGroupName, String accountName, String filter);

    /**
     * Retrieves the metrics determined by the given filter for the given database account. This url is only for PBS and
     * Replication Latency data.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PercentileMetricInner> listMetrics(String resourceGroupName, String accountName, String filter);

    /**
     * Retrieves the metrics determined by the given filter for the given database account. This url is only for PBS and
     * Replication Latency data.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PercentileMetricInner> listMetrics(
        String resourceGroupName, String accountName, String filter, Context context);
}
