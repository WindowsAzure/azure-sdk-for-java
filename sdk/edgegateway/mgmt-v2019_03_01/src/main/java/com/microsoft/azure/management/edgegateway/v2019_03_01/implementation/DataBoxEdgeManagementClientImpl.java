/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the DataBoxEdgeManagementClientImpl class.
 */
public class DataBoxEdgeManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The API version. */
    private String apiVersion;

    /**
     * Gets The API version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The subscription ID. */
    private String subscriptionId;

    /**
     * Gets The subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public DataBoxEdgeManagementClientImpl withSubscriptionId(String subscriptionId) {
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
    public DataBoxEdgeManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public DataBoxEdgeManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public DataBoxEdgeManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
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
     * The DevicesInner object to access its operations.
     */
    private DevicesInner devices;

    /**
     * Gets the DevicesInner object to access its operations.
     * @return the DevicesInner object.
     */
    public DevicesInner devices() {
        return this.devices;
    }

    /**
     * The AlertsInner object to access its operations.
     */
    private AlertsInner alerts;

    /**
     * Gets the AlertsInner object to access its operations.
     * @return the AlertsInner object.
     */
    public AlertsInner alerts() {
        return this.alerts;
    }

    /**
     * The BandwidthSchedulesInner object to access its operations.
     */
    private BandwidthSchedulesInner bandwidthSchedules;

    /**
     * Gets the BandwidthSchedulesInner object to access its operations.
     * @return the BandwidthSchedulesInner object.
     */
    public BandwidthSchedulesInner bandwidthSchedules() {
        return this.bandwidthSchedules;
    }

    /**
     * The JobsInner object to access its operations.
     */
    private JobsInner jobs;

    /**
     * Gets the JobsInner object to access its operations.
     * @return the JobsInner object.
     */
    public JobsInner jobs() {
        return this.jobs;
    }

    /**
     * The OperationsStatusInner object to access its operations.
     */
    private OperationsStatusInner operationsStatus;

    /**
     * Gets the OperationsStatusInner object to access its operations.
     * @return the OperationsStatusInner object.
     */
    public OperationsStatusInner operationsStatus() {
        return this.operationsStatus;
    }

    /**
     * The OrdersInner object to access its operations.
     */
    private OrdersInner orders;

    /**
     * Gets the OrdersInner object to access its operations.
     * @return the OrdersInner object.
     */
    public OrdersInner orders() {
        return this.orders;
    }

    /**
     * The RolesInner object to access its operations.
     */
    private RolesInner roles;

    /**
     * Gets the RolesInner object to access its operations.
     * @return the RolesInner object.
     */
    public RolesInner roles() {
        return this.roles;
    }

    /**
     * The SharesInner object to access its operations.
     */
    private SharesInner shares;

    /**
     * Gets the SharesInner object to access its operations.
     * @return the SharesInner object.
     */
    public SharesInner shares() {
        return this.shares;
    }

    /**
     * The StorageAccountCredentialsInner object to access its operations.
     */
    private StorageAccountCredentialsInner storageAccountCredentials;

    /**
     * Gets the StorageAccountCredentialsInner object to access its operations.
     * @return the StorageAccountCredentialsInner object.
     */
    public StorageAccountCredentialsInner storageAccountCredentials() {
        return this.storageAccountCredentials;
    }

    /**
     * The TriggersInner object to access its operations.
     */
    private TriggersInner triggers;

    /**
     * Gets the TriggersInner object to access its operations.
     * @return the TriggersInner object.
     */
    public TriggersInner triggers() {
        return this.triggers;
    }

    /**
     * The UsersInner object to access its operations.
     */
    private UsersInner users;

    /**
     * Gets the UsersInner object to access its operations.
     * @return the UsersInner object.
     */
    public UsersInner users() {
        return this.users;
    }

    /**
     * Initializes an instance of DataBoxEdgeManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public DataBoxEdgeManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of DataBoxEdgeManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public DataBoxEdgeManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of DataBoxEdgeManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public DataBoxEdgeManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2019-03-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.devices = new DevicesInner(restClient().retrofit(), this);
        this.alerts = new AlertsInner(restClient().retrofit(), this);
        this.bandwidthSchedules = new BandwidthSchedulesInner(restClient().retrofit(), this);
        this.jobs = new JobsInner(restClient().retrofit(), this);
        this.operationsStatus = new OperationsStatusInner(restClient().retrofit(), this);
        this.orders = new OrdersInner(restClient().retrofit(), this);
        this.roles = new RolesInner(restClient().retrofit(), this);
        this.shares = new SharesInner(restClient().retrofit(), this);
        this.storageAccountCredentials = new StorageAccountCredentialsInner(restClient().retrofit(), this);
        this.triggers = new TriggersInner(restClient().retrofit(), this);
        this.users = new UsersInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "DataBoxEdgeManagementClient", "2019-03-01");
    }
}
