/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the NetworkManagementClientImpl class.
 */
public class NetworkManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public NetworkManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Client API version. */
    private String apiVersion;

    /**
     * Gets Client API version.
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
    public NetworkManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public NetworkManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public NetworkManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ExpressRouteCircuitAuthorizationsInner object to access its operations.
     */
    private ExpressRouteCircuitAuthorizationsInner expressRouteCircuitAuthorizations;

    /**
     * Gets the ExpressRouteCircuitAuthorizationsInner object to access its operations.
     * @return the ExpressRouteCircuitAuthorizationsInner object.
     */
    public ExpressRouteCircuitAuthorizationsInner expressRouteCircuitAuthorizations() {
        return this.expressRouteCircuitAuthorizations;
    }

    /**
     * The ExpressRouteCircuitPeeringsInner object to access its operations.
     */
    private ExpressRouteCircuitPeeringsInner expressRouteCircuitPeerings;

    /**
     * Gets the ExpressRouteCircuitPeeringsInner object to access its operations.
     * @return the ExpressRouteCircuitPeeringsInner object.
     */
    public ExpressRouteCircuitPeeringsInner expressRouteCircuitPeerings() {
        return this.expressRouteCircuitPeerings;
    }

    /**
     * The ExpressRouteCircuitConnectionsInner object to access its operations.
     */
    private ExpressRouteCircuitConnectionsInner expressRouteCircuitConnections;

    /**
     * Gets the ExpressRouteCircuitConnectionsInner object to access its operations.
     * @return the ExpressRouteCircuitConnectionsInner object.
     */
    public ExpressRouteCircuitConnectionsInner expressRouteCircuitConnections() {
        return this.expressRouteCircuitConnections;
    }

    /**
     * The ExpressRouteCircuitsInner object to access its operations.
     */
    private ExpressRouteCircuitsInner expressRouteCircuits;

    /**
     * Gets the ExpressRouteCircuitsInner object to access its operations.
     * @return the ExpressRouteCircuitsInner object.
     */
    public ExpressRouteCircuitsInner expressRouteCircuits() {
        return this.expressRouteCircuits;
    }

    /**
     * The ExpressRouteServiceProvidersInner object to access its operations.
     */
    private ExpressRouteServiceProvidersInner expressRouteServiceProviders;

    /**
     * Gets the ExpressRouteServiceProvidersInner object to access its operations.
     * @return the ExpressRouteServiceProvidersInner object.
     */
    public ExpressRouteServiceProvidersInner expressRouteServiceProviders() {
        return this.expressRouteServiceProviders;
    }

    /**
     * The ExpressRouteCrossConnectionsInner object to access its operations.
     */
    private ExpressRouteCrossConnectionsInner expressRouteCrossConnections;

    /**
     * Gets the ExpressRouteCrossConnectionsInner object to access its operations.
     * @return the ExpressRouteCrossConnectionsInner object.
     */
    public ExpressRouteCrossConnectionsInner expressRouteCrossConnections() {
        return this.expressRouteCrossConnections;
    }

    /**
     * The ExpressRouteCrossConnectionPeeringsInner object to access its operations.
     */
    private ExpressRouteCrossConnectionPeeringsInner expressRouteCrossConnectionPeerings;

    /**
     * Gets the ExpressRouteCrossConnectionPeeringsInner object to access its operations.
     * @return the ExpressRouteCrossConnectionPeeringsInner object.
     */
    public ExpressRouteCrossConnectionPeeringsInner expressRouteCrossConnectionPeerings() {
        return this.expressRouteCrossConnectionPeerings;
    }

    /**
     * Initializes an instance of NetworkManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public NetworkManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of NetworkManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public NetworkManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of NetworkManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public NetworkManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2018-04-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.expressRouteCircuitAuthorizations = new ExpressRouteCircuitAuthorizationsInner(restClient().retrofit(), this);
        this.expressRouteCircuitPeerings = new ExpressRouteCircuitPeeringsInner(restClient().retrofit(), this);
        this.expressRouteCircuitConnections = new ExpressRouteCircuitConnectionsInner(restClient().retrofit(), this);
        this.expressRouteCircuits = new ExpressRouteCircuitsInner(restClient().retrofit(), this);
        this.expressRouteServiceProviders = new ExpressRouteServiceProvidersInner(restClient().retrofit(), this);
        this.expressRouteCrossConnections = new ExpressRouteCrossConnectionsInner(restClient().retrofit(), this);
        this.expressRouteCrossConnectionPeerings = new ExpressRouteCrossConnectionPeeringsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "NetworkManagementClient", "2018-04-01");
    }
}
