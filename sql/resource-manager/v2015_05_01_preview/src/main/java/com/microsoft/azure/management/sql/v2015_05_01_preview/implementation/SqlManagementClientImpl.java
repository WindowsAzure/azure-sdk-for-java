/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the SqlManagementClientImpl class.
 */
public class SqlManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription ID that identifies an Azure subscription. */
    private String subscriptionId;

    /**
     * Gets The subscription ID that identifies an Azure subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription ID that identifies an Azure subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The API version to use for the request. */
    private String apiVersion;

    /**
     * Gets The API version to use for the request.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The DatabaseAdvisorsInner object to access its operations.
     */
    private DatabaseAdvisorsInner databaseAdvisors;

    /**
     * Gets the DatabaseAdvisorsInner object to access its operations.
     * @return the DatabaseAdvisorsInner object.
     */
    public DatabaseAdvisorsInner databaseAdvisors() {
        return this.databaseAdvisors;
    }

    /**
     * The DatabaseRecommendedActionsInner object to access its operations.
     */
    private DatabaseRecommendedActionsInner databaseRecommendedActions;

    /**
     * Gets the DatabaseRecommendedActionsInner object to access its operations.
     * @return the DatabaseRecommendedActionsInner object.
     */
    public DatabaseRecommendedActionsInner databaseRecommendedActions() {
        return this.databaseRecommendedActions;
    }

    /**
     * The ServerAdvisorsInner object to access its operations.
     */
    private ServerAdvisorsInner serverAdvisors;

    /**
     * Gets the ServerAdvisorsInner object to access its operations.
     * @return the ServerAdvisorsInner object.
     */
    public ServerAdvisorsInner serverAdvisors() {
        return this.serverAdvisors;
    }

    /**
     * The DatabaseBlobAuditingPoliciesInner object to access its operations.
     */
    private DatabaseBlobAuditingPoliciesInner databaseBlobAuditingPolicies;

    /**
     * Gets the DatabaseBlobAuditingPoliciesInner object to access its operations.
     * @return the DatabaseBlobAuditingPoliciesInner object.
     */
    public DatabaseBlobAuditingPoliciesInner databaseBlobAuditingPolicies() {
        return this.databaseBlobAuditingPolicies;
    }

    /**
     * The DatabaseAutomaticTuningsInner object to access its operations.
     */
    private DatabaseAutomaticTuningsInner databaseAutomaticTunings;

    /**
     * Gets the DatabaseAutomaticTuningsInner object to access its operations.
     * @return the DatabaseAutomaticTuningsInner object.
     */
    public DatabaseAutomaticTuningsInner databaseAutomaticTunings() {
        return this.databaseAutomaticTunings;
    }

    /**
     * The EncryptionProtectorsInner object to access its operations.
     */
    private EncryptionProtectorsInner encryptionProtectors;

    /**
     * Gets the EncryptionProtectorsInner object to access its operations.
     * @return the EncryptionProtectorsInner object.
     */
    public EncryptionProtectorsInner encryptionProtectors() {
        return this.encryptionProtectors;
    }

    /**
     * The FailoverGroupsInner object to access its operations.
     */
    private FailoverGroupsInner failoverGroups;

    /**
     * Gets the FailoverGroupsInner object to access its operations.
     * @return the FailoverGroupsInner object.
     */
    public FailoverGroupsInner failoverGroups() {
        return this.failoverGroups;
    }

    /**
     * The FirewallRulesInner object to access its operations.
     */
    private FirewallRulesInner firewallRules;

    /**
     * Gets the FirewallRulesInner object to access its operations.
     * @return the FirewallRulesInner object.
     */
    public FirewallRulesInner firewallRules() {
        return this.firewallRules;
    }

    /**
     * The ManagedInstancesInner object to access its operations.
     */
    private ManagedInstancesInner managedInstances;

    /**
     * Gets the ManagedInstancesInner object to access its operations.
     * @return the ManagedInstancesInner object.
     */
    public ManagedInstancesInner managedInstances() {
        return this.managedInstances;
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
     * The ServerKeysInner object to access its operations.
     */
    private ServerKeysInner serverKeys;

    /**
     * Gets the ServerKeysInner object to access its operations.
     * @return the ServerKeysInner object.
     */
    public ServerKeysInner serverKeys() {
        return this.serverKeys;
    }

    /**
     * The ServersInner object to access its operations.
     */
    private ServersInner servers;

    /**
     * Gets the ServersInner object to access its operations.
     * @return the ServersInner object.
     */
    public ServersInner servers() {
        return this.servers;
    }

    /**
     * The SyncAgentsInner object to access its operations.
     */
    private SyncAgentsInner syncAgents;

    /**
     * Gets the SyncAgentsInner object to access its operations.
     * @return the SyncAgentsInner object.
     */
    public SyncAgentsInner syncAgents() {
        return this.syncAgents;
    }

    /**
     * The SyncGroupsInner object to access its operations.
     */
    private SyncGroupsInner syncGroups;

    /**
     * Gets the SyncGroupsInner object to access its operations.
     * @return the SyncGroupsInner object.
     */
    public SyncGroupsInner syncGroups() {
        return this.syncGroups;
    }

    /**
     * The SyncMembersInner object to access its operations.
     */
    private SyncMembersInner syncMembers;

    /**
     * Gets the SyncMembersInner object to access its operations.
     * @return the SyncMembersInner object.
     */
    public SyncMembersInner syncMembers() {
        return this.syncMembers;
    }

    /**
     * The SubscriptionUsagesInner object to access its operations.
     */
    private SubscriptionUsagesInner subscriptionUsages;

    /**
     * Gets the SubscriptionUsagesInner object to access its operations.
     * @return the SubscriptionUsagesInner object.
     */
    public SubscriptionUsagesInner subscriptionUsages() {
        return this.subscriptionUsages;
    }

    /**
     * The VirtualClustersInner object to access its operations.
     */
    private VirtualClustersInner virtualClusters;

    /**
     * Gets the VirtualClustersInner object to access its operations.
     * @return the VirtualClustersInner object.
     */
    public VirtualClustersInner virtualClusters() {
        return this.virtualClusters;
    }

    /**
     * The VirtualNetworkRulesInner object to access its operations.
     */
    private VirtualNetworkRulesInner virtualNetworkRules;

    /**
     * Gets the VirtualNetworkRulesInner object to access its operations.
     * @return the VirtualNetworkRulesInner object.
     */
    public VirtualNetworkRulesInner virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public SqlManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public SqlManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public SqlManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2015-05-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.databaseAdvisors = new DatabaseAdvisorsInner(restClient().retrofit(), this);
        this.databaseRecommendedActions = new DatabaseRecommendedActionsInner(restClient().retrofit(), this);
        this.serverAdvisors = new ServerAdvisorsInner(restClient().retrofit(), this);
        this.databaseBlobAuditingPolicies = new DatabaseBlobAuditingPoliciesInner(restClient().retrofit(), this);
        this.databaseAutomaticTunings = new DatabaseAutomaticTuningsInner(restClient().retrofit(), this);
        this.encryptionProtectors = new EncryptionProtectorsInner(restClient().retrofit(), this);
        this.failoverGroups = new FailoverGroupsInner(restClient().retrofit(), this);
        this.firewallRules = new FirewallRulesInner(restClient().retrofit(), this);
        this.managedInstances = new ManagedInstancesInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.serverKeys = new ServerKeysInner(restClient().retrofit(), this);
        this.servers = new ServersInner(restClient().retrofit(), this);
        this.syncAgents = new SyncAgentsInner(restClient().retrofit(), this);
        this.syncGroups = new SyncGroupsInner(restClient().retrofit(), this);
        this.syncMembers = new SyncMembersInner(restClient().retrofit(), this);
        this.subscriptionUsages = new SubscriptionUsagesInner(restClient().retrofit(), this);
        this.virtualClusters = new VirtualClustersInner(restClient().retrofit(), this);
        this.virtualNetworkRules = new VirtualNetworkRulesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "SqlManagementClient", "2015-05-01-preview");
    }
}
