/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the OperationalInsightsManagementClientImpl class.
 */
public class OperationalInsightsManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The API version to use for this operation. */
    private String apiVersion;

    /**
     * Gets The API version to use for this operation.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The ID of the target subscription. */
    private String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The ID of the target subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public OperationalInsightsManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
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
    public OperationalInsightsManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public OperationalInsightsManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public OperationalInsightsManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The DataExportsInner object to access its operations.
     */
    private DataExportsInner dataExports;

    /**
     * Gets the DataExportsInner object to access its operations.
     * @return the DataExportsInner object.
     */
    public DataExportsInner dataExports() {
        return this.dataExports;
    }

    /**
     * The DataSourcesInner object to access its operations.
     */
    private DataSourcesInner dataSources;

    /**
     * Gets the DataSourcesInner object to access its operations.
     * @return the DataSourcesInner object.
     */
    public DataSourcesInner dataSources() {
        return this.dataSources;
    }

    /**
     * The IntelligencePacksInner object to access its operations.
     */
    private IntelligencePacksInner intelligencePacks;

    /**
     * Gets the IntelligencePacksInner object to access its operations.
     * @return the IntelligencePacksInner object.
     */
    public IntelligencePacksInner intelligencePacks() {
        return this.intelligencePacks;
    }

    /**
     * The LinkedServicesInner object to access its operations.
     */
    private LinkedServicesInner linkedServices;

    /**
     * Gets the LinkedServicesInner object to access its operations.
     * @return the LinkedServicesInner object.
     */
    public LinkedServicesInner linkedServices() {
        return this.linkedServices;
    }

    /**
     * The LinkedStorageAccountsInner object to access its operations.
     */
    private LinkedStorageAccountsInner linkedStorageAccounts;

    /**
     * Gets the LinkedStorageAccountsInner object to access its operations.
     * @return the LinkedStorageAccountsInner object.
     */
    public LinkedStorageAccountsInner linkedStorageAccounts() {
        return this.linkedStorageAccounts;
    }

    /**
     * The ManagementGroupsInner object to access its operations.
     */
    private ManagementGroupsInner managementGroups;

    /**
     * Gets the ManagementGroupsInner object to access its operations.
     * @return the ManagementGroupsInner object.
     */
    public ManagementGroupsInner managementGroups() {
        return this.managementGroups;
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
     * The OperationStatusesInner object to access its operations.
     */
    private OperationStatusesInner operationStatuses;

    /**
     * Gets the OperationStatusesInner object to access its operations.
     * @return the OperationStatusesInner object.
     */
    public OperationStatusesInner operationStatuses() {
        return this.operationStatuses;
    }

    /**
     * The SharedKeysOperationsInner object to access its operations.
     */
    private SharedKeysOperationsInner sharedKeysOperations;

    /**
     * Gets the SharedKeysOperationsInner object to access its operations.
     * @return the SharedKeysOperationsInner object.
     */
    public SharedKeysOperationsInner sharedKeysOperations() {
        return this.sharedKeysOperations;
    }

    /**
     * The UsagesInner object to access its operations.
     */
    private UsagesInner usages;

    /**
     * Gets the UsagesInner object to access its operations.
     * @return the UsagesInner object.
     */
    public UsagesInner usages() {
        return this.usages;
    }

    /**
     * The WorkspacesInner object to access its operations.
     */
    private WorkspacesInner workspaces;

    /**
     * Gets the WorkspacesInner object to access its operations.
     * @return the WorkspacesInner object.
     */
    public WorkspacesInner workspaces() {
        return this.workspaces;
    }

    /**
     * The DeletedWorkspacesInner object to access its operations.
     */
    private DeletedWorkspacesInner deletedWorkspaces;

    /**
     * Gets the DeletedWorkspacesInner object to access its operations.
     * @return the DeletedWorkspacesInner object.
     */
    public DeletedWorkspacesInner deletedWorkspaces() {
        return this.deletedWorkspaces;
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
     * The StorageInsightConfigsInner object to access its operations.
     */
    private StorageInsightConfigsInner storageInsightConfigs;

    /**
     * Gets the StorageInsightConfigsInner object to access its operations.
     * @return the StorageInsightConfigsInner object.
     */
    public StorageInsightConfigsInner storageInsightConfigs() {
        return this.storageInsightConfigs;
    }

    /**
     * The SavedSearchesInner object to access its operations.
     */
    private SavedSearchesInner savedSearches;

    /**
     * Gets the SavedSearchesInner object to access its operations.
     * @return the SavedSearchesInner object.
     */
    public SavedSearchesInner savedSearches() {
        return this.savedSearches;
    }

    /**
     * The AvailableServiceTiersInner object to access its operations.
     */
    private AvailableServiceTiersInner availableServiceTiers;

    /**
     * Gets the AvailableServiceTiersInner object to access its operations.
     * @return the AvailableServiceTiersInner object.
     */
    public AvailableServiceTiersInner availableServiceTiers() {
        return this.availableServiceTiers;
    }

    /**
     * The GatewaysInner object to access its operations.
     */
    private GatewaysInner gateways;

    /**
     * Gets the GatewaysInner object to access its operations.
     * @return the GatewaysInner object.
     */
    public GatewaysInner gateways() {
        return this.gateways;
    }

    /**
     * The SchemasInner object to access its operations.
     */
    private SchemasInner schemas;

    /**
     * Gets the SchemasInner object to access its operations.
     * @return the SchemasInner object.
     */
    public SchemasInner schemas() {
        return this.schemas;
    }

    /**
     * The WorkspacePurgesInner object to access its operations.
     */
    private WorkspacePurgesInner workspacePurges;

    /**
     * Gets the WorkspacePurgesInner object to access its operations.
     * @return the WorkspacePurgesInner object.
     */
    public WorkspacePurgesInner workspacePurges() {
        return this.workspacePurges;
    }

    /**
     * The TablesInner object to access its operations.
     */
    private TablesInner tables;

    /**
     * Gets the TablesInner object to access its operations.
     * @return the TablesInner object.
     */
    public TablesInner tables() {
        return this.tables;
    }

    /**
     * Initializes an instance of OperationalInsightsManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public OperationalInsightsManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of OperationalInsightsManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public OperationalInsightsManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of OperationalInsightsManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public OperationalInsightsManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2020-03-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.dataExports = new DataExportsInner(restClient().retrofit(), this);
        this.dataSources = new DataSourcesInner(restClient().retrofit(), this);
        this.intelligencePacks = new IntelligencePacksInner(restClient().retrofit(), this);
        this.linkedServices = new LinkedServicesInner(restClient().retrofit(), this);
        this.linkedStorageAccounts = new LinkedStorageAccountsInner(restClient().retrofit(), this);
        this.managementGroups = new ManagementGroupsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.operationStatuses = new OperationStatusesInner(restClient().retrofit(), this);
        this.sharedKeysOperations = new SharedKeysOperationsInner(restClient().retrofit(), this);
        this.usages = new UsagesInner(restClient().retrofit(), this);
        this.workspaces = new WorkspacesInner(restClient().retrofit(), this);
        this.deletedWorkspaces = new DeletedWorkspacesInner(restClient().retrofit(), this);
        this.clusters = new ClustersInner(restClient().retrofit(), this);
        this.storageInsightConfigs = new StorageInsightConfigsInner(restClient().retrofit(), this);
        this.savedSearches = new SavedSearchesInner(restClient().retrofit(), this);
        this.availableServiceTiers = new AvailableServiceTiersInner(restClient().retrofit(), this);
        this.gateways = new GatewaysInner(restClient().retrofit(), this);
        this.schemas = new SchemasInner(restClient().retrofit(), this);
        this.workspacePurges = new WorkspacePurgesInner(restClient().retrofit(), this);
        this.tables = new TablesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "OperationalInsightsManagementClient", "2020-03-01-preview");
    }
}
