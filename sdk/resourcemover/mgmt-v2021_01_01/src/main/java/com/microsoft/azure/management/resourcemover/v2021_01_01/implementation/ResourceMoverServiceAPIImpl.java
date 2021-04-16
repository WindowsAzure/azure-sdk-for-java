/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the ResourceMoverServiceAPIImpl class.
 */
public class ResourceMoverServiceAPIImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The Subscription ID. */
    private String subscriptionId;

    /**
     * Gets The Subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The Subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public ResourceMoverServiceAPIImpl withSubscriptionId(String subscriptionId) {
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
    public ResourceMoverServiceAPIImpl withAcceptLanguage(String acceptLanguage) {
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
    public ResourceMoverServiceAPIImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public ResourceMoverServiceAPIImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The MoveCollectionsInner object to access its operations.
     */
    private MoveCollectionsInner moveCollections;

    /**
     * Gets the MoveCollectionsInner object to access its operations.
     * @return the MoveCollectionsInner object.
     */
    public MoveCollectionsInner moveCollections() {
        return this.moveCollections;
    }

    /**
     * The MoveResourcesInner object to access its operations.
     */
    private MoveResourcesInner moveResources;

    /**
     * Gets the MoveResourcesInner object to access its operations.
     * @return the MoveResourcesInner object.
     */
    public MoveResourcesInner moveResources() {
        return this.moveResources;
    }

    /**
     * The UnresolvedDependenciesInner object to access its operations.
     */
    private UnresolvedDependenciesInner unresolvedDependencies;

    /**
     * Gets the UnresolvedDependenciesInner object to access its operations.
     * @return the UnresolvedDependenciesInner object.
     */
    public UnresolvedDependenciesInner unresolvedDependencies() {
        return this.unresolvedDependencies;
    }

    /**
     * The OperationsDiscoverysInner object to access its operations.
     */
    private OperationsDiscoverysInner operationsDiscoverys;

    /**
     * Gets the OperationsDiscoverysInner object to access its operations.
     * @return the OperationsDiscoverysInner object.
     */
    public OperationsDiscoverysInner operationsDiscoverys() {
        return this.operationsDiscoverys;
    }

    /**
     * Initializes an instance of ResourceMoverServiceAPI client.
     *
     * @param credentials the management credentials for Azure
     */
    public ResourceMoverServiceAPIImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of ResourceMoverServiceAPI client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ResourceMoverServiceAPIImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ResourceMoverServiceAPI client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ResourceMoverServiceAPIImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2021-01-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.moveCollections = new MoveCollectionsInner(restClient().retrofit(), this);
        this.moveResources = new MoveResourcesInner(restClient().retrofit(), this);
        this.unresolvedDependencies = new UnresolvedDependenciesInner(restClient().retrofit(), this);
        this.operationsDiscoverys = new OperationsDiscoverysInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "ResourceMoverServiceAPI", "2021-01-01");
    }
}
