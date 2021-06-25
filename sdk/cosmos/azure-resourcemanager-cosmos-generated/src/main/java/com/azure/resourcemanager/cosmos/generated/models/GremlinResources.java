// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of GremlinResources. */
public interface GremlinResources {
    /**
     * Lists the Gremlin databases under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin databases and their properties.
     */
    PagedIterable<GremlinDatabaseGetResults> listGremlinDatabases(String resourceGroupName, String accountName);

    /**
     * Lists the Gremlin databases under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin databases and their properties.
     */
    PagedIterable<GremlinDatabaseGetResults> listGremlinDatabases(
        String resourceGroupName, String accountName, Context context);

    /**
     * Gets the Gremlin databases under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Gremlin databases under an existing Azure Cosmos DB database account with the provided name.
     */
    GremlinDatabaseGetResults getGremlinDatabase(String resourceGroupName, String accountName, String databaseName);

    /**
     * Gets the Gremlin databases under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Gremlin databases under an existing Azure Cosmos DB database account with the provided name.
     */
    Response<GremlinDatabaseGetResults> getGremlinDatabaseWithResponse(
        String resourceGroupName, String accountName, String databaseName, Context context);

    /**
     * Deletes an existing Azure Cosmos DB Gremlin database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteGremlinDatabase(String resourceGroupName, String accountName, String databaseName);

    /**
     * Deletes an existing Azure Cosmos DB Gremlin database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteGremlinDatabase(String resourceGroupName, String accountName, String databaseName, Context context);

    /**
     * Gets the RUs per second of the Gremlin database under an existing Azure Cosmos DB database account with the
     * provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RUs per second of the Gremlin database under an existing Azure Cosmos DB database account with the
     *     provided name.
     */
    ThroughputSettingsGetResults getGremlinDatabaseThroughput(
        String resourceGroupName, String accountName, String databaseName);

    /**
     * Gets the RUs per second of the Gremlin database under an existing Azure Cosmos DB database account with the
     * provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RUs per second of the Gremlin database under an existing Azure Cosmos DB database account with the
     *     provided name.
     */
    Response<ThroughputSettingsGetResults> getGremlinDatabaseThroughputWithResponse(
        String resourceGroupName, String accountName, String databaseName, Context context);

    /**
     * Update RUs per second of an Azure Cosmos DB Gremlin database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param updateThroughputParameters The RUs per second of the parameters to provide for the current Gremlin
     *     database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults updateGremlinDatabaseThroughput(
        String resourceGroupName,
        String accountName,
        String databaseName,
        ThroughputSettingsUpdateParameters updateThroughputParameters);

    /**
     * Update RUs per second of an Azure Cosmos DB Gremlin database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param updateThroughputParameters The RUs per second of the parameters to provide for the current Gremlin
     *     database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults updateGremlinDatabaseThroughput(
        String resourceGroupName,
        String accountName,
        String databaseName,
        ThroughputSettingsUpdateParameters updateThroughputParameters,
        Context context);

    /**
     * Migrate an Azure Cosmos DB Gremlin database from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateGremlinDatabaseToAutoscale(
        String resourceGroupName, String accountName, String databaseName);

    /**
     * Migrate an Azure Cosmos DB Gremlin database from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateGremlinDatabaseToAutoscale(
        String resourceGroupName, String accountName, String databaseName, Context context);

    /**
     * Migrate an Azure Cosmos DB Gremlin database from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateGremlinDatabaseToManualThroughput(
        String resourceGroupName, String accountName, String databaseName);

    /**
     * Migrate an Azure Cosmos DB Gremlin database from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateGremlinDatabaseToManualThroughput(
        String resourceGroupName, String accountName, String databaseName, Context context);

    /**
     * Lists the Gremlin graph under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the graphs and their properties.
     */
    PagedIterable<GremlinGraphGetResults> listGremlinGraphs(
        String resourceGroupName, String accountName, String databaseName);

    /**
     * Lists the Gremlin graph under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the graphs and their properties.
     */
    PagedIterable<GremlinGraphGetResults> listGremlinGraphs(
        String resourceGroupName, String accountName, String databaseName, Context context);

    /**
     * Gets the Gremlin graph under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Gremlin graph under an existing Azure Cosmos DB database account.
     */
    GremlinGraphGetResults getGremlinGraph(
        String resourceGroupName, String accountName, String databaseName, String graphName);

    /**
     * Gets the Gremlin graph under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Gremlin graph under an existing Azure Cosmos DB database account.
     */
    Response<GremlinGraphGetResults> getGremlinGraphWithResponse(
        String resourceGroupName, String accountName, String databaseName, String graphName, Context context);

    /**
     * Deletes an existing Azure Cosmos DB Gremlin graph.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteGremlinGraph(String resourceGroupName, String accountName, String databaseName, String graphName);

    /**
     * Deletes an existing Azure Cosmos DB Gremlin graph.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteGremlinGraph(
        String resourceGroupName, String accountName, String databaseName, String graphName, Context context);

    /**
     * Gets the Gremlin graph throughput under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Gremlin graph throughput under an existing Azure Cosmos DB database account with the provided name.
     */
    ThroughputSettingsGetResults getGremlinGraphThroughput(
        String resourceGroupName, String accountName, String databaseName, String graphName);

    /**
     * Gets the Gremlin graph throughput under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Gremlin graph throughput under an existing Azure Cosmos DB database account with the provided name.
     */
    Response<ThroughputSettingsGetResults> getGremlinGraphThroughputWithResponse(
        String resourceGroupName, String accountName, String databaseName, String graphName, Context context);

    /**
     * Update RUs per second of an Azure Cosmos DB Gremlin graph.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @param updateThroughputParameters The RUs per second of the parameters to provide for the current Gremlin graph.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults updateGremlinGraphThroughput(
        String resourceGroupName,
        String accountName,
        String databaseName,
        String graphName,
        ThroughputSettingsUpdateParameters updateThroughputParameters);

    /**
     * Update RUs per second of an Azure Cosmos DB Gremlin graph.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @param updateThroughputParameters The RUs per second of the parameters to provide for the current Gremlin graph.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults updateGremlinGraphThroughput(
        String resourceGroupName,
        String accountName,
        String databaseName,
        String graphName,
        ThroughputSettingsUpdateParameters updateThroughputParameters,
        Context context);

    /**
     * Migrate an Azure Cosmos DB Gremlin graph from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateGremlinGraphToAutoscale(
        String resourceGroupName, String accountName, String databaseName, String graphName);

    /**
     * Migrate an Azure Cosmos DB Gremlin graph from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateGremlinGraphToAutoscale(
        String resourceGroupName, String accountName, String databaseName, String graphName, Context context);

    /**
     * Migrate an Azure Cosmos DB Gremlin graph from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateGremlinGraphToManualThroughput(
        String resourceGroupName, String accountName, String databaseName, String graphName);

    /**
     * Migrate an Azure Cosmos DB Gremlin graph from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateGremlinGraphToManualThroughput(
        String resourceGroupName, String accountName, String databaseName, String graphName, Context context);

    /**
     * Gets the Gremlin databases under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Gremlin databases under an existing Azure Cosmos DB database account with the provided name.
     */
    GremlinDatabaseGetResults getGremlinDatabaseById(String id);

    /**
     * Gets the Gremlin databases under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Gremlin databases under an existing Azure Cosmos DB database account with the provided name.
     */
    Response<GremlinDatabaseGetResults> getGremlinDatabaseByIdWithResponse(String id, Context context);

    /**
     * Gets the Gremlin graph under an existing Azure Cosmos DB database account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Gremlin graph under an existing Azure Cosmos DB database account.
     */
    GremlinGraphGetResults getGremlinGraphById(String id);

    /**
     * Gets the Gremlin graph under an existing Azure Cosmos DB database account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Gremlin graph under an existing Azure Cosmos DB database account.
     */
    Response<GremlinGraphGetResults> getGremlinGraphByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing Azure Cosmos DB Gremlin database.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteGremlinDatabaseById(String id);

    /**
     * Deletes an existing Azure Cosmos DB Gremlin database.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteGremlinDatabaseByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing Azure Cosmos DB Gremlin graph.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteGremlinGraphById(String id);

    /**
     * Deletes an existing Azure Cosmos DB Gremlin graph.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteGremlinGraphByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new GremlinDatabaseGetResults resource.
     *
     * @param name resource name.
     * @return the first stage of the new GremlinDatabaseGetResults definition.
     */
    GremlinDatabaseGetResults.DefinitionStages.Blank defineUpdateGremlinDatabase(String name);

    /**
     * Begins definition for a new GremlinGraphGetResults resource.
     *
     * @param name resource name.
     * @return the first stage of the new GremlinGraphGetResults definition.
     */
    GremlinGraphGetResults.DefinitionStages.Blank defineUpdateGremlinGraph(String name);
}
