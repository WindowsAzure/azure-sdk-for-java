// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.fluent.models.MetricDefinitionInner;
import com.azure.resourcemanager.cosmos.fluent.models.MetricInner;
import com.azure.resourcemanager.cosmos.fluent.models.UsageInner;

/** An instance of this class provides access to all the operations defined in DatabasesClient. */
public interface DatabasesClient {
    /**
     * Retrieves the metrics determined by the given filter for the given database account and database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MetricInner> listMetricsAsync(
        String resourceGroupName, String accountName, String databaseRid, String filter);

    /**
     * Retrieves the metrics determined by the given filter for the given database account and database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MetricInner> listMetrics(
        String resourceGroupName, String accountName, String databaseRid, String filter);

    /**
     * Retrieves the metrics determined by the given filter for the given database account and database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MetricInner> listMetrics(
        String resourceGroupName, String accountName, String databaseRid, String filter, Context context);

    /**
     * Retrieves the usages (most recent data) for the given database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is
     *     name.value (name of the metric, can have an or of multiple names).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list usage request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<UsageInner> listUsagesAsync(
        String resourceGroupName, String accountName, String databaseRid, String filter);

    /**
     * Retrieves the usages (most recent data) for the given database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list usage request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<UsageInner> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid);

    /**
     * Retrieves the usages (most recent data) for the given database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is
     *     name.value (name of the metric, can have an or of multiple names).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list usage request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UsageInner> listUsages(
        String resourceGroupName, String accountName, String databaseRid, String filter, Context context);

    /**
     * Retrieves the usages (most recent data) for the given database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list usage request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UsageInner> listUsages(String resourceGroupName, String accountName, String databaseRid);

    /**
     * Retrieves metric definitions for the given database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list metric definitions request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MetricDefinitionInner> listMetricDefinitionsAsync(
        String resourceGroupName, String accountName, String databaseRid);

    /**
     * Retrieves metric definitions for the given database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list metric definitions request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MetricDefinitionInner> listMetricDefinitions(
        String resourceGroupName, String accountName, String databaseRid);

    /**
     * Retrieves metric definitions for the given database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list metric definitions request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MetricDefinitionInner> listMetricDefinitions(
        String resourceGroupName, String accountName, String databaseRid, Context context);
}
