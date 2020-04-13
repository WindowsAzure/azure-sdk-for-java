/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.GremlinDatabaseGetResults;
import rx.Completable;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.GremlinGraphGetResults;

/**
 * Type representing GremlinResources.
 */
public interface GremlinResources {
    /**
     * Begins definition for a new GremlinDatabasis resource.
     * @param name resource name.
     * @return the first stage of the new GremlinDatabasis definition.
     */
    GremlinDatabaseGetResults.DefinitionStages.Blank defineGremlinDatabasis(String name);

    /**
     * Begins definition for a new Graph resource.
     * @param name resource name.
     * @return the first stage of the new Graph definition.
     */
    GremlinGraphGetResults.DefinitionStages.Blank defineGraph(String name);

    /**
     * Gets the Gremlin databases under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GremlinDatabaseGetResults> getGremlinDatabaseAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Lists the Gremlin databases under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GremlinDatabaseGetResults> listGremlinDatabasesAsync(String resourceGroupName, String accountName);

    /**
     * Deletes an existing Azure Cosmos DB Gremlin database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteGremlinDatabaseAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Gets the RUs per second of the Gremlin database under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> getGremlinDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Update RUs per second of an Azure Cosmos DB Gremlin database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param updateThroughputParameters The RUs per second of the parameters to provide for the current Gremlin database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> updateGremlinDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName, ThroughputSettingsUpdateParameters updateThroughputParameters);

    /**
     * Gets the Gremlin graph throughput under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> getGremlinGraphThroughputAsync(String resourceGroupName, String accountName, String databaseName, String graphName);

    /**
     * Update RUs per second of an Azure Cosmos DB Gremlin graph.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @param updateThroughputParameters The RUs per second of the parameters to provide for the current Gremlin graph.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> updateGremlinGraphThroughputAsync(String resourceGroupName, String accountName, String databaseName, String graphName, ThroughputSettingsUpdateParameters updateThroughputParameters);

    /**
     * Gets the Gremlin graph under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GremlinGraphGetResults> getGremlinGraphAsync(String resourceGroupName, String accountName, String databaseName, String graphName);

    /**
     * Lists the Gremlin graph under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GremlinGraphGetResults> listGremlinGraphsAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Deletes an existing Azure Cosmos DB Gremlin graph.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteGremlinGraphAsync(String resourceGroupName, String accountName, String databaseName, String graphName);

}
