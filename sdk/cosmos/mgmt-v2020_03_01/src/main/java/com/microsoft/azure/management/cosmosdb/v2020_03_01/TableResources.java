/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.TableGetResults;
import rx.Completable;

/**
 * Type representing TableResources.
 */
public interface TableResources {
    /**
     * Begins definition for a new Table resource.
     * @param name resource name.
     * @return the first stage of the new Table definition.
     */
    TableGetResults.DefinitionStages.Blank defineTable(String name);

    /**
     * Gets the Tables under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TableGetResults> getTableAsync(String resourceGroupName, String accountName, String tableName);

    /**
     * Lists the Tables under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TableGetResults> listTablesAsync(String resourceGroupName, String accountName);

    /**
     * Deletes an existing Azure Cosmos DB Table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteTableAsync(String resourceGroupName, String accountName, String tableName);

    /**
     * Gets the RUs per second of the Table under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> getTableThroughputAsync(String resourceGroupName, String accountName, String tableName);

    /**
     * Update RUs per second of an Azure Cosmos DB Table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param updateThroughputParameters The parameters to provide for the RUs per second of the current Table.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> updateTableThroughputAsync(String resourceGroupName, String accountName, String tableName, ThroughputSettingsUpdateParameters updateThroughputParameters);

    /**
     * Migrate an Azure Cosmos DB Table from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> migrateTableToAutoscaleAsync(String resourceGroupName, String accountName, String tableName);

    /**
     * Migrate an Azure Cosmos DB Table from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> migrateTableToManualThroughputAsync(String resourceGroupName, String accountName, String tableName);

}
