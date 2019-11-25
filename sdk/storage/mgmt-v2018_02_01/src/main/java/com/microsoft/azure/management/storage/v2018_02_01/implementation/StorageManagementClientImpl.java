/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_02_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the StorageManagementClientImpl class.
 */
public class StorageManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
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
    public StorageManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
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
    public StorageManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public StorageManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public StorageManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
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
     * The SkusInner object to access its operations.
     */
    private SkusInner skus;

    /**
     * Gets the SkusInner object to access its operations.
     * @return the SkusInner object.
     */
    public SkusInner skus() {
        return this.skus;
    }

    /**
     * The StorageAccountsInner object to access its operations.
     */
    private StorageAccountsInner storageAccounts;

    /**
     * Gets the StorageAccountsInner object to access its operations.
     * @return the StorageAccountsInner object.
     */
    public StorageAccountsInner storageAccounts() {
        return this.storageAccounts;
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
     * The BlobContainersInner object to access its operations.
     */
    private BlobContainersInner blobContainers;

    /**
     * Gets the BlobContainersInner object to access its operations.
     * @return the BlobContainersInner object.
     */
    public BlobContainersInner blobContainers() {
        return this.blobContainers;
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public StorageManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public StorageManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public StorageManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2018-02-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.skus = new SkusInner(restClient().retrofit(), this);
        this.storageAccounts = new StorageAccountsInner(restClient().retrofit(), this);
        this.usages = new UsagesInner(restClient().retrofit(), this);
        this.blobContainers = new BlobContainersInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "StorageManagementClient", "2018-02-01");
    }
}
