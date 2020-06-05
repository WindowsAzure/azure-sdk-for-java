/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_02_15.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the KustoManagementClientImpl class.
 */
public class KustoManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public KustoManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Client API Version. */
    private String apiVersion;

    /**
     * Gets Client API Version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public KustoManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public KustoManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public KustoManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ClustersInner object to access its operations.
     */
    private ClustersInner clusters;

    /**
     * Gets the ClustersInner object to access its operations.
     * @return the ClustersInner object.
     */
    public ClustersInner clusters() {
        return this.clusters;
    }

    /**
     * The ClusterPrincipalAssignmentsInner object to access its operations.
     */
    private ClusterPrincipalAssignmentsInner clusterPrincipalAssignments;

    /**
     * Gets the ClusterPrincipalAssignmentsInner object to access its operations.
     * @return the ClusterPrincipalAssignmentsInner object.
     */
    public ClusterPrincipalAssignmentsInner clusterPrincipalAssignments() {
        return this.clusterPrincipalAssignments;
    }

    /**
     * The DatabasesInner object to access its operations.
     */
    private DatabasesInner databases;

    /**
     * Gets the DatabasesInner object to access its operations.
     * @return the DatabasesInner object.
     */
    public DatabasesInner databases() {
        return this.databases;
    }

    /**
     * The DatabasePrincipalAssignmentsInner object to access its operations.
     */
    private DatabasePrincipalAssignmentsInner databasePrincipalAssignments;

    /**
     * Gets the DatabasePrincipalAssignmentsInner object to access its operations.
     * @return the DatabasePrincipalAssignmentsInner object.
     */
    public DatabasePrincipalAssignmentsInner databasePrincipalAssignments() {
        return this.databasePrincipalAssignments;
    }

    /**
     * The AttachedDatabaseConfigurationsInner object to access its operations.
     */
    private AttachedDatabaseConfigurationsInner attachedDatabaseConfigurations;

    /**
     * Gets the AttachedDatabaseConfigurationsInner object to access its operations.
     * @return the AttachedDatabaseConfigurationsInner object.
     */
    public AttachedDatabaseConfigurationsInner attachedDatabaseConfigurations() {
        return this.attachedDatabaseConfigurations;
    }

    /**
     * The DataConnectionsInner object to access its operations.
     */
    private DataConnectionsInner dataConnections;

    /**
     * Gets the DataConnectionsInner object to access its operations.
     * @return the DataConnectionsInner object.
     */
    public DataConnectionsInner dataConnections() {
        return this.dataConnections;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * Initializes an instance of KustoManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public KustoManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of KustoManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public KustoManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of KustoManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public KustoManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2020-02-15";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.clusters = new ClustersInner(restClient().retrofit(), this);
        this.clusterPrincipalAssignments = new ClusterPrincipalAssignmentsInner(restClient().retrofit(), this);
        this.databases = new DatabasesInner(restClient().retrofit(), this);
        this.databasePrincipalAssignments = new DatabasePrincipalAssignmentsInner(restClient().retrofit(), this);
        this.attachedDatabaseConfigurations = new AttachedDatabaseConfigurationsInner(restClient().retrofit(), this);
        this.dataConnections = new DataConnectionsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "KustoManagementClient", "2020-02-15");
    }
}
