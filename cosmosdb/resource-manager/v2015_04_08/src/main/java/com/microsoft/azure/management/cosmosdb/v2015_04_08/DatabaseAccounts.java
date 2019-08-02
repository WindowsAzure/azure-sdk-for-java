/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.DatabaseAccountsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccountMetric;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccountUsage;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccountMetricDefinition;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.SqlContainer;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.MongoDBCollection;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.GremlinGraph;

/**
 * Type representing DatabaseAccounts.
 */
public interface DatabaseAccounts extends SupportsCreating<DatabaseAccount.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<DatabaseAccount>, SupportsListingByResourceGroup<DatabaseAccount>, SupportsListing<DatabaseAccount>, HasInner<DatabaseAccountsInner> {
    /**
     * Begins definition for a new Databasis resource.
     * @param name resource name.
     * @return the first stage of the new Databasis definition.
     */
    SqlDatabase.DefinitionStages.Blank defineDatabasis(String name);

    /**
     * Begins definition for a new Container resource.
     * @param name resource name.
     * @return the first stage of the new Container definition.
     */
    SqlContainer.DefinitionStages.Blank defineContainer(String name);

    /**
     * Begins definition for a new Collection resource.
     * @param name resource name.
     * @return the first stage of the new Collection definition.
     */
    MongoDBCollection.DefinitionStages.Blank defineCollection(String name);

    /**
     * Begins definition for a new Table resource.
     * @param name resource name.
     * @return the first stage of the new Table definition.
     */
    Table.DefinitionStages.Blank defineTable(String name);

    /**
     * Begins definition for a new Keyspace resource.
     * @param name resource name.
     * @return the first stage of the new Keyspace definition.
     */
    CassandraKeyspace.DefinitionStages.Blank defineKeyspace(String name);

    /**
     * Begins definition for a new Graph resource.
     * @param name resource name.
     * @return the first stage of the new Graph definition.
     */
    GremlinGraph.DefinitionStages.Blank defineGraph(String name);

    /**
     * Changes the failover priority for the Azure Cosmos DB database account. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param failoverPolicies List of failover policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable failoverPriorityChangeAsync(String resourceGroupName, String accountName, List<FailoverPolicy> failoverPolicies);

    /**
     * Lists the access keys for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountListKeysResult> listKeysAsync(String resourceGroupName, String accountName);

    /**
     * Lists the connection strings for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountListConnectionStringsResult> listConnectionStringsAsync(String resourceGroupName, String accountName);

    /**
     * Offline the specified region for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable offlineRegionAsync(String resourceGroupName, String accountName, String region);

    /**
     * Online the specified region for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable onlineRegionAsync(String resourceGroupName, String accountName, String region);

    /**
     * Lists the read-only access keys for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountListReadOnlyKeysResult> listReadOnlyKeysAsync(String resourceGroupName, String accountName);

    /**
     * Regenerates an access key for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyKind The access key to regenerate. Possible values include: 'primary', 'secondary', 'primaryReadonly', 'secondaryReadonly'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable regenerateKeyAsync(String resourceGroupName, String accountName, KeyKind keyKind);

    /**
     * Lists the read-only access keys for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountListReadOnlyKeysResult> getReadOnlyKeysAsync(String resourceGroupName, String accountName);

    /**
     * Checks that the Azure Cosmos DB account name already exists. A valid account name may contain only lowercase letters, numbers, and the '-' character, and must be between 3 and 50 characters.
     *
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkNameExistsAsync(String accountName);

    /**
     * Retrieves the metrics determined by the given filter for the given database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountMetric> listMetricsAsync(String resourceGroupName, String accountName, String filter);

    /**
     * Retrieves the usages (most recent data) for the given database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountUsage> listUsagesAsync(String resourceGroupName, String accountName);

    /**
     * Retrieves metric definitions for the given database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountMetricDefinition> listMetricDefinitionsAsync(String resourceGroupName, String accountName);

    /**
     * Lists the SQL databases under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlDatabase> listSqlDatabasesAsync(String resourceGroupName, String accountName);

    /**
     * Gets the SQL database under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlDatabase> getSqlDatabaseAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Deletes an existing Azure Cosmos DB SQL database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteSqlDatabaseAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Lists the MongoDB databases under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MongoDBDatabase> listMongoDBDatabasesAsync(String resourceGroupName, String accountName);

    /**
     * Gets the MongoDB databases under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MongoDBDatabase> getMongoDBDatabaseAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Create or updates Azure Cosmos DB MongoDB database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param createUpdateMongoDBDatabaseParameters The parameters to provide for the current MongoDB database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MongoDBDatabase> createUpdateMongoDBDatabaseAsync(String resourceGroupName, String accountName, String databaseName, MongoDBDatabaseCreateUpdateParameters createUpdateMongoDBDatabaseParameters);

    /**
     * Deletes an existing Azure Cosmos DB MongoDB database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteMongoDBDatabaseAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Lists the Gremlin databases under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GremlinDatabase> listGremlinDatabasesAsync(String resourceGroupName, String accountName);

    /**
     * Gets the Gremlin databases under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GremlinDatabase> getGremlinDatabaseAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Create or update an Azure Cosmos DB Gremlin database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param createUpdateGremlinDatabaseParameters The parameters to provide for the current Gremlin database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GremlinDatabase> createUpdateGremlinDatabaseAsync(String resourceGroupName, String accountName, String databaseName, GremlinDatabaseCreateUpdateParameters createUpdateGremlinDatabaseParameters);

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
     * Gets the RUs per second of the SQL database under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> getSqlDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Update RUs per second of an Azure Cosmos DB SQL database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param resource The standard JSON format of a resource throughput
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> updateSqlDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName, ThroughputResource resource);

    /**
     * Gets the RUs per second of the SQL container under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> getSqlContainerThroughputAsync(String resourceGroupName, String accountName, String databaseName, String containerName);

    /**
     * Update RUs per second of an Azure Cosmos DB SQL container.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @param resource The standard JSON format of a resource throughput
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> updateSqlContainerThroughputAsync(String resourceGroupName, String accountName, String databaseName, String containerName, ThroughputResource resource);

    /**
     * Gets the RUs per second of the MongoDB database under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> getMongoDBDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Update RUs per second of the an Azure Cosmos DB MongoDB database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param resource The standard JSON format of a resource throughput
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> updateMongoDBDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName, ThroughputResource resource);

    /**
     * Gets the RUs per second of the MongoDB collection under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param collectionName Cosmos DB collection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> getMongoDBCollectionThroughputAsync(String resourceGroupName, String accountName, String databaseName, String collectionName);

    /**
     * Update the RUs per second of an Azure Cosmos DB MongoDB collection.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param collectionName Cosmos DB collection name.
     * @param resource The standard JSON format of a resource throughput
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> updateMongoDBCollectionThroughputAsync(String resourceGroupName, String accountName, String databaseName, String collectionName, ThroughputResource resource);

    /**
     * Gets the RUs per second of the Table under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> getTableThroughputAsync(String resourceGroupName, String accountName, String tableName);

    /**
     * Update RUs per second of an Azure Cosmos DB Table.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @param resource The standard JSON format of a resource throughput
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> updateTableThroughputAsync(String resourceGroupName, String accountName, String tableName, ThroughputResource resource);

    /**
     * Gets the RUs per second of the Cassandra Keyspace under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> getCassandraKeyspaceThroughputAsync(String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Update RUs per second of an Azure Cosmos DB Cassandra Keyspace.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param resource The standard JSON format of a resource throughput
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> updateCassandraKeyspaceThroughputAsync(String resourceGroupName, String accountName, String keyspaceName, ThroughputResource resource);

    /**
     * Gets the RUs per second of the Cassandra table under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> getCassandraTableThroughputAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName);

    /**
     * Update RUs per second of an Azure Cosmos DB Cassandra table.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @param resource The standard JSON format of a resource throughput
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> updateCassandraTableThroughputAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName, ThroughputResource resource);

    /**
     * Gets the RUs per second of the Gremlin database under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> getGremlinDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Update RUs per second of an Azure Cosmos DB Gremlin database.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param resource The standard JSON format of a resource throughput
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> updateGremlinDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName, ThroughputResource resource);

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
    Observable<Throughput> getGremlinGraphThroughputAsync(String resourceGroupName, String accountName, String databaseName, String graphName);

    /**
     * Update RUs per second of an Azure Cosmos DB Gremlin graph.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param graphName Cosmos DB graph name.
     * @param resource The standard JSON format of a resource throughput
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Throughput> updateGremlinGraphThroughputAsync(String resourceGroupName, String accountName, String databaseName, String graphName, ThroughputResource resource);

    /**
     * Gets the SQL container under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlContainer> getSqlContainerAsync(String resourceGroupName, String accountName, String databaseName, String containerName);

    /**
     * Lists the SQL container under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlContainer> listSqlContainersAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Deletes an existing Azure Cosmos DB SQL container.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteSqlContainerAsync(String resourceGroupName, String accountName, String databaseName, String containerName);

    /**
     * Gets the MongoDB collection under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param collectionName Cosmos DB collection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MongoDBCollection> getMongoDBCollectionAsync(String resourceGroupName, String accountName, String databaseName, String collectionName);

    /**
     * Lists the MongoDB collection under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MongoDBCollection> listMongoDBCollectionsAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Deletes an existing Azure Cosmos DB MongoDB Collection.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param collectionName Cosmos DB collection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteMongoDBCollectionAsync(String resourceGroupName, String accountName, String databaseName, String collectionName);

    /**
     * Lists the Tables under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Table> listTablesAsync(String resourceGroupName, String accountName);

    /**
     * Gets the Tables under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Table> getTableAsync(String resourceGroupName, String accountName, String tableName);

    /**
     * Deletes an existing Azure Cosmos DB Table.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteTableAsync(String resourceGroupName, String accountName, String tableName);

    /**
     * Lists the Cassandra table under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CassandraTable> listCassandraTablesAsync(String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Gets the Cassandra table under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CassandraTable> getCassandraTableAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName);

    /**
     * Create or update an Azure Cosmos DB Cassandra Table.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @param createUpdateCassandraTableParameters The parameters to provide for the current Cassandra Table.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CassandraTable> createUpdateCassandraTableAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName, CassandraTableCreateUpdateParameters createUpdateCassandraTableParameters);

    /**
     * Deletes an existing Azure Cosmos DB Cassandra table.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteCassandraTableAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName);

    /**
     * Lists the Cassandra keyspaces under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CassandraKeyspace> listCassandraKeyspacesAsync(String resourceGroupName, String accountName);

    /**
     * Gets the Cassandra keyspaces under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CassandraKeyspace> getCassandraKeyspaceAsync(String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Deletes an existing Azure Cosmos DB Cassandra keyspace.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteCassandraKeyspaceAsync(String resourceGroupName, String accountName, String keyspaceName);

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
    Observable<GremlinGraph> getGremlinGraphAsync(String resourceGroupName, String accountName, String databaseName, String graphName);

    /**
     * Lists the Gremlin graph under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GremlinGraph> listGremlinGraphsAsync(String resourceGroupName, String accountName, String databaseName);

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
