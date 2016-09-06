/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.RestClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;

/**
 * Initializes a new instance of the SearchManagementClientImpl class.
 */
public final class SearchManagementClientImpl extends AzureServiceClient {
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
    public SearchManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Client Api Version. */
    private String apiVersion;

    /**
     * Gets Client Api Version.
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
    public SearchManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public SearchManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public SearchManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The AdminKeysInner object to access its operations.
     */
    private AdminKeysInner adminKeys;

    /**
     * Gets the AdminKeysInner object to access its operations.
     * @return the AdminKeysInner object.
     */
    public AdminKeysInner adminKeys() {
        return this.adminKeys;
    }

    /**
     * The QueryKeysInner object to access its operations.
     */
    private QueryKeysInner queryKeys;

    /**
     * Gets the QueryKeysInner object to access its operations.
     * @return the QueryKeysInner object.
     */
    public QueryKeysInner queryKeys() {
        return this.queryKeys;
    }

    /**
     * The ServicesInner object to access its operations.
     */
    private ServicesInner services;

    /**
     * Gets the ServicesInner object to access its operations.
     * @return the ServicesInner object.
     */
    public ServicesInner services() {
        return this.services;
    }

    /**
     * Initializes an instance of SearchManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public SearchManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of SearchManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public SearchManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        this(new RestClient.Builder()
                .withBaseUrl(baseUrl)
                .withCredentials(credentials)
                .build());
    }

    /**
     * Initializes an instance of SearchManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public SearchManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2015-02-28";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.adminKeys = new AdminKeysInner(restClient().retrofit(), this);
        this.queryKeys = new QueryKeysInner(restClient().retrofit(), this);
        this.services = new ServicesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("Azure-SDK-For-Java/%s (%s)",
                getClass().getPackage().getImplementationVersion(),
                "SearchManagementClient, 2015-02-28");
    }
}
