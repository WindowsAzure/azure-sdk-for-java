/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_02_15.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.kusto.v2020_02_15.Clusters;
import com.microsoft.azure.management.kusto.v2020_02_15.ClusterPrincipalAssignments;
import com.microsoft.azure.management.kusto.v2020_02_15.Databases;
import com.microsoft.azure.management.kusto.v2020_02_15.DatabasePrincipalAssignments;
import com.microsoft.azure.management.kusto.v2020_02_15.AttachedDatabaseConfigurations;
import com.microsoft.azure.management.kusto.v2020_02_15.DataConnections;
import com.microsoft.azure.management.kusto.v2020_02_15.Operations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Kusto resource management.
 */
public final class KustoManager extends ManagerCore<KustoManager, KustoManagementClientImpl> {
    private Clusters clusters;
    private ClusterPrincipalAssignments clusterPrincipalAssignments;
    private Databases databases;
    private DatabasePrincipalAssignments databasePrincipalAssignments;
    private AttachedDatabaseConfigurations attachedDatabaseConfigurations;
    private DataConnections dataConnections;
    private Operations operations;
    /**
    * Get a Configurable instance that can be used to create KustoManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new KustoManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of KustoManager that exposes Kusto resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the KustoManager
    */
    public static KustoManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new KustoManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of KustoManager that exposes Kusto resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the KustoManager
    */
    public static KustoManager authenticate(RestClient restClient, String subscriptionId) {
        return new KustoManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of KustoManager that exposes Kusto management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Kusto management API entry points that work across subscriptions
        */
        KustoManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Clusters.
     */
    public Clusters clusters() {
        if (this.clusters == null) {
            this.clusters = new ClustersImpl(this);
        }
        return this.clusters;
    }

    /**
     * @return Entry point to manage ClusterPrincipalAssignments.
     */
    public ClusterPrincipalAssignments clusterPrincipalAssignments() {
        if (this.clusterPrincipalAssignments == null) {
            this.clusterPrincipalAssignments = new ClusterPrincipalAssignmentsImpl(this);
        }
        return this.clusterPrincipalAssignments;
    }

    /**
     * @return Entry point to manage Databases.
     */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(this);
        }
        return this.databases;
    }

    /**
     * @return Entry point to manage DatabasePrincipalAssignments.
     */
    public DatabasePrincipalAssignments databasePrincipalAssignments() {
        if (this.databasePrincipalAssignments == null) {
            this.databasePrincipalAssignments = new DatabasePrincipalAssignmentsImpl(this);
        }
        return this.databasePrincipalAssignments;
    }

    /**
     * @return Entry point to manage AttachedDatabaseConfigurations.
     */
    public AttachedDatabaseConfigurations attachedDatabaseConfigurations() {
        if (this.attachedDatabaseConfigurations == null) {
            this.attachedDatabaseConfigurations = new AttachedDatabaseConfigurationsImpl(this);
        }
        return this.attachedDatabaseConfigurations;
    }

    /**
     * @return Entry point to manage DataConnections.
     */
    public DataConnections dataConnections() {
        if (this.dataConnections == null) {
            this.dataConnections = new DataConnectionsImpl(this);
        }
        return this.dataConnections;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public KustoManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return KustoManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private KustoManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new KustoManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
