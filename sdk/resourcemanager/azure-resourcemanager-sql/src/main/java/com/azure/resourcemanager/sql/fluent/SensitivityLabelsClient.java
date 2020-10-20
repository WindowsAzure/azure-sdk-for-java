// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.sql.models.SensitivityLabelSource;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SensitivityLabelsClient. */
public interface SensitivityLabelsClient {
    /**
     * Gets the sensitivity labels of a given database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity labels of a given database.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SensitivityLabelInner> listCurrentByDatabaseAsync(
        String resourceGroupName, String serverName, String databaseName, String filter);

    /**
     * Gets the sensitivity labels of a given database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity labels of a given database.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SensitivityLabelInner> listCurrentByDatabaseAsync(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets the sensitivity labels of a given database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity labels of a given database.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SensitivityLabelInner> listCurrentByDatabase(
        String resourceGroupName, String serverName, String databaseName, String filter, Context context);

    /**
     * Gets the sensitivity labels of a given database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity labels of a given database.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SensitivityLabelInner> listCurrentByDatabase(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets the sensitivity labels of a given database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param includeDisabledRecommendations Specifies whether to include disabled recommendations or not.
     * @param skipToken The skipToken parameter.
     * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity labels of a given database.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SensitivityLabelInner> listRecommendedByDatabaseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        Boolean includeDisabledRecommendations,
        String skipToken,
        String filter);

    /**
     * Gets the sensitivity labels of a given database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity labels of a given database.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SensitivityLabelInner> listRecommendedByDatabaseAsync(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets the sensitivity labels of a given database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param includeDisabledRecommendations Specifies whether to include disabled recommendations or not.
     * @param skipToken The skipToken parameter.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity labels of a given database.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SensitivityLabelInner> listRecommendedByDatabase(
        String resourceGroupName,
        String serverName,
        String databaseName,
        Boolean includeDisabledRecommendations,
        String skipToken,
        String filter,
        Context context);

    /**
     * Gets the sensitivity labels of a given database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity labels of a given database.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SensitivityLabelInner> listRecommendedByDatabase(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Enables sensitivity recommendations on a given column (recommendations are enabled by default on all columns).
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> enableRecommendationWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName);

    /**
     * Enables sensitivity recommendations on a given column (recommendations are enabled by default on all columns).
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> enableRecommendationAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName);

    /**
     * Enables sensitivity recommendations on a given column (recommendations are enabled by default on all columns).
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableRecommendation(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName);

    /**
     * Enables sensitivity recommendations on a given column (recommendations are enabled by default on all columns).
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> enableRecommendationWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        Context context);

    /**
     * Disables sensitivity recommendations on a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> disableRecommendationWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName);

    /**
     * Disables sensitivity recommendations on a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> disableRecommendationAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName);

    /**
     * Disables sensitivity recommendations on a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableRecommendation(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName);

    /**
     * Disables sensitivity recommendations on a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> disableRecommendationWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        Context context);

    /**
     * Gets the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param sensitivityLabelSource The source of the sensitivity label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity label of a given column.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SensitivityLabelInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelSource sensitivityLabelSource);

    /**
     * Gets the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param sensitivityLabelSource The source of the sensitivity label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity label of a given column.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SensitivityLabelInner> getAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelSource sensitivityLabelSource);

    /**
     * Gets the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param sensitivityLabelSource The source of the sensitivity label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity label of a given column.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SensitivityLabelInner get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelSource sensitivityLabelSource);

    /**
     * Gets the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param sensitivityLabelSource The source of the sensitivity label.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity label of a given column.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SensitivityLabelInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelSource sensitivityLabelSource,
        Context context);

    /**
     * Creates or updates the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param parameters A sensitivity label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sensitivity label.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SensitivityLabelInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelInner parameters);

    /**
     * Creates or updates the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param parameters A sensitivity label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sensitivity label.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SensitivityLabelInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelInner parameters);

    /**
     * Creates or updates the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param parameters A sensitivity label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sensitivity label.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SensitivityLabelInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelInner parameters);

    /**
     * Creates or updates the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param parameters A sensitivity label.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sensitivity label.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SensitivityLabelInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelInner parameters,
        Context context);

    /**
     * Deletes the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName);

    /**
     * Deletes the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName);

    /**
     * Deletes the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName);

    /**
     * Deletes the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        Context context);
}
