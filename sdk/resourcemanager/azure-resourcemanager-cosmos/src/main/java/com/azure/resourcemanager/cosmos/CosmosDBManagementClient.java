// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.cosmos.fluent.CassandraResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.CollectionPartitionRegionsClient;
import com.azure.resourcemanager.cosmos.fluent.CollectionPartitionsClient;
import com.azure.resourcemanager.cosmos.fluent.CollectionRegionsClient;
import com.azure.resourcemanager.cosmos.fluent.CollectionsClient;
import com.azure.resourcemanager.cosmos.fluent.DatabaseAccountRegionsClient;
import com.azure.resourcemanager.cosmos.fluent.DatabaseAccountsClient;
import com.azure.resourcemanager.cosmos.fluent.DatabasesClient;
import com.azure.resourcemanager.cosmos.fluent.GremlinResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.MongoDBResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.NotebookWorkspacesClient;
import com.azure.resourcemanager.cosmos.fluent.OperationsClient;
import com.azure.resourcemanager.cosmos.fluent.PartitionKeyRangeIdRegionsClient;
import com.azure.resourcemanager.cosmos.fluent.PartitionKeyRangeIdsClient;
import com.azure.resourcemanager.cosmos.fluent.PercentileSourceTargetsClient;
import com.azure.resourcemanager.cosmos.fluent.PercentileTargetsClient;
import com.azure.resourcemanager.cosmos.fluent.PercentilesClient;
import com.azure.resourcemanager.cosmos.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.cosmos.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.SqlResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.TableResourcesClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/** Initializes a new instance of the CosmosDBManagementClient type. */
@ServiceClient(builder = CosmosDBManagementClientBuilder.class)
public final class CosmosDBManagementClient extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(CosmosDBManagementClient.class);

    /** Azure subscription ID. */
    private final String subscriptionId;

    /**
     * Gets Azure subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The DatabaseAccountsClient object to access its operations. */
    private final DatabaseAccountsClient databaseAccounts;

    /**
     * Gets the DatabaseAccountsClient object to access its operations.
     *
     * @return the DatabaseAccountsClient object.
     */
    public DatabaseAccountsClient getDatabaseAccounts() {
        return this.databaseAccounts;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The DatabasesClient object to access its operations. */
    private final DatabasesClient databases;

    /**
     * Gets the DatabasesClient object to access its operations.
     *
     * @return the DatabasesClient object.
     */
    public DatabasesClient getDatabases() {
        return this.databases;
    }

    /** The CollectionsClient object to access its operations. */
    private final CollectionsClient collections;

    /**
     * Gets the CollectionsClient object to access its operations.
     *
     * @return the CollectionsClient object.
     */
    public CollectionsClient getCollections() {
        return this.collections;
    }

    /** The CollectionRegionsClient object to access its operations. */
    private final CollectionRegionsClient collectionRegions;

    /**
     * Gets the CollectionRegionsClient object to access its operations.
     *
     * @return the CollectionRegionsClient object.
     */
    public CollectionRegionsClient getCollectionRegions() {
        return this.collectionRegions;
    }

    /** The DatabaseAccountRegionsClient object to access its operations. */
    private final DatabaseAccountRegionsClient databaseAccountRegions;

    /**
     * Gets the DatabaseAccountRegionsClient object to access its operations.
     *
     * @return the DatabaseAccountRegionsClient object.
     */
    public DatabaseAccountRegionsClient getDatabaseAccountRegions() {
        return this.databaseAccountRegions;
    }

    /** The PercentileSourceTargetsClient object to access its operations. */
    private final PercentileSourceTargetsClient percentileSourceTargets;

    /**
     * Gets the PercentileSourceTargetsClient object to access its operations.
     *
     * @return the PercentileSourceTargetsClient object.
     */
    public PercentileSourceTargetsClient getPercentileSourceTargets() {
        return this.percentileSourceTargets;
    }

    /** The PercentileTargetsClient object to access its operations. */
    private final PercentileTargetsClient percentileTargets;

    /**
     * Gets the PercentileTargetsClient object to access its operations.
     *
     * @return the PercentileTargetsClient object.
     */
    public PercentileTargetsClient getPercentileTargets() {
        return this.percentileTargets;
    }

    /** The PercentilesClient object to access its operations. */
    private final PercentilesClient percentiles;

    /**
     * Gets the PercentilesClient object to access its operations.
     *
     * @return the PercentilesClient object.
     */
    public PercentilesClient getPercentiles() {
        return this.percentiles;
    }

    /** The CollectionPartitionRegionsClient object to access its operations. */
    private final CollectionPartitionRegionsClient collectionPartitionRegions;

    /**
     * Gets the CollectionPartitionRegionsClient object to access its operations.
     *
     * @return the CollectionPartitionRegionsClient object.
     */
    public CollectionPartitionRegionsClient getCollectionPartitionRegions() {
        return this.collectionPartitionRegions;
    }

    /** The CollectionPartitionsClient object to access its operations. */
    private final CollectionPartitionsClient collectionPartitions;

    /**
     * Gets the CollectionPartitionsClient object to access its operations.
     *
     * @return the CollectionPartitionsClient object.
     */
    public CollectionPartitionsClient getCollectionPartitions() {
        return this.collectionPartitions;
    }

    /** The PartitionKeyRangeIdsClient object to access its operations. */
    private final PartitionKeyRangeIdsClient partitionKeyRangeIds;

    /**
     * Gets the PartitionKeyRangeIdsClient object to access its operations.
     *
     * @return the PartitionKeyRangeIdsClient object.
     */
    public PartitionKeyRangeIdsClient getPartitionKeyRangeIds() {
        return this.partitionKeyRangeIds;
    }

    /** The PartitionKeyRangeIdRegionsClient object to access its operations. */
    private final PartitionKeyRangeIdRegionsClient partitionKeyRangeIdRegions;

    /**
     * Gets the PartitionKeyRangeIdRegionsClient object to access its operations.
     *
     * @return the PartitionKeyRangeIdRegionsClient object.
     */
    public PartitionKeyRangeIdRegionsClient getPartitionKeyRangeIdRegions() {
        return this.partitionKeyRangeIdRegions;
    }

    /** The SqlResourcesClient object to access its operations. */
    private final SqlResourcesClient sqlResources;

    /**
     * Gets the SqlResourcesClient object to access its operations.
     *
     * @return the SqlResourcesClient object.
     */
    public SqlResourcesClient getSqlResources() {
        return this.sqlResources;
    }

    /** The MongoDBResourcesClient object to access its operations. */
    private final MongoDBResourcesClient mongoDBResources;

    /**
     * Gets the MongoDBResourcesClient object to access its operations.
     *
     * @return the MongoDBResourcesClient object.
     */
    public MongoDBResourcesClient getMongoDBResources() {
        return this.mongoDBResources;
    }

    /** The TableResourcesClient object to access its operations. */
    private final TableResourcesClient tableResources;

    /**
     * Gets the TableResourcesClient object to access its operations.
     *
     * @return the TableResourcesClient object.
     */
    public TableResourcesClient getTableResources() {
        return this.tableResources;
    }

    /** The CassandraResourcesClient object to access its operations. */
    private final CassandraResourcesClient cassandraResources;

    /**
     * Gets the CassandraResourcesClient object to access its operations.
     *
     * @return the CassandraResourcesClient object.
     */
    public CassandraResourcesClient getCassandraResources() {
        return this.cassandraResources;
    }

    /** The GremlinResourcesClient object to access its operations. */
    private final GremlinResourcesClient gremlinResources;

    /**
     * Gets the GremlinResourcesClient object to access its operations.
     *
     * @return the GremlinResourcesClient object.
     */
    public GremlinResourcesClient getGremlinResources() {
        return this.gremlinResources;
    }

    /** The NotebookWorkspacesClient object to access its operations. */
    private final NotebookWorkspacesClient notebookWorkspaces;

    /**
     * Gets the NotebookWorkspacesClient object to access its operations.
     *
     * @return the NotebookWorkspacesClient object.
     */
    public NotebookWorkspacesClient getNotebookWorkspaces() {
        return this.notebookWorkspaces;
    }

    /** The PrivateLinkResourcesClient object to access its operations. */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /** The PrivateEndpointConnectionsClient object to access its operations. */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Initializes an instance of CosmosDBManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     */
    CosmosDBManagementClient(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.databaseAccounts = new DatabaseAccountsClient(this);
        this.operations = new OperationsClient(this);
        this.databases = new DatabasesClient(this);
        this.collections = new CollectionsClient(this);
        this.collectionRegions = new CollectionRegionsClient(this);
        this.databaseAccountRegions = new DatabaseAccountRegionsClient(this);
        this.percentileSourceTargets = new PercentileSourceTargetsClient(this);
        this.percentileTargets = new PercentileTargetsClient(this);
        this.percentiles = new PercentilesClient(this);
        this.collectionPartitionRegions = new CollectionPartitionRegionsClient(this);
        this.collectionPartitions = new CollectionPartitionsClient(this);
        this.partitionKeyRangeIds = new PartitionKeyRangeIdsClient(this);
        this.partitionKeyRangeIdRegions = new PartitionKeyRangeIdRegionsClient(this);
        this.sqlResources = new SqlResourcesClient(this);
        this.mongoDBResources = new MongoDBResourcesClient(this);
        this.tableResources = new TableResourcesClient(this);
        this.cassandraResources = new CassandraResourcesClient(this);
        this.gremlinResources = new GremlinResourcesClient(this);
        this.notebookWorkspaces = new NotebookWorkspacesClient(this);
        this.privateLinkResources = new PrivateLinkResourcesClient(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClient(this);
    }
}
