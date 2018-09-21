/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the AzureMediaServicesImpl class.
 */
public class AzureMediaServicesImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The unique identifier for a Microsoft Azure subscription. */
    private String subscriptionId;

    /**
     * Gets The unique identifier for a Microsoft Azure subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The unique identifier for a Microsoft Azure subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public AzureMediaServicesImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The Version of the API to be used with the client request. */
    private String apiVersion;

    /**
     * Gets The Version of the API to be used with the client request.
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
    public AzureMediaServicesImpl withAcceptLanguage(String acceptLanguage) {
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
    public AzureMediaServicesImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public AzureMediaServicesImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The AccountFiltersInner object to access its operations.
     */
    private AccountFiltersInner accountFilters;

    /**
     * Gets the AccountFiltersInner object to access its operations.
     * @return the AccountFiltersInner object.
     */
    public AccountFiltersInner accountFilters() {
        return this.accountFilters;
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
     * The MediaservicesInner object to access its operations.
     */
    private MediaservicesInner mediaservices;

    /**
     * Gets the MediaservicesInner object to access its operations.
     * @return the MediaservicesInner object.
     */
    public MediaservicesInner mediaservices() {
        return this.mediaservices;
    }

    /**
     * The LocationsInner object to access its operations.
     */
    private LocationsInner locations;

    /**
     * Gets the LocationsInner object to access its operations.
     * @return the LocationsInner object.
     */
    public LocationsInner locations() {
        return this.locations;
    }

    /**
     * The AssetsInner object to access its operations.
     */
    private AssetsInner assets;

    /**
     * Gets the AssetsInner object to access its operations.
     * @return the AssetsInner object.
     */
    public AssetsInner assets() {
        return this.assets;
    }

    /**
     * The AssetFiltersInner object to access its operations.
     */
    private AssetFiltersInner assetFilters;

    /**
     * Gets the AssetFiltersInner object to access its operations.
     * @return the AssetFiltersInner object.
     */
    public AssetFiltersInner assetFilters() {
        return this.assetFilters;
    }

    /**
     * The ContentKeyPoliciesInner object to access its operations.
     */
    private ContentKeyPoliciesInner contentKeyPolicies;

    /**
     * Gets the ContentKeyPoliciesInner object to access its operations.
     * @return the ContentKeyPoliciesInner object.
     */
    public ContentKeyPoliciesInner contentKeyPolicies() {
        return this.contentKeyPolicies;
    }

    /**
     * The TransformsInner object to access its operations.
     */
    private TransformsInner transforms;

    /**
     * Gets the TransformsInner object to access its operations.
     * @return the TransformsInner object.
     */
    public TransformsInner transforms() {
        return this.transforms;
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
     * The StreamingPoliciesInner object to access its operations.
     */
    private StreamingPoliciesInner streamingPolicies;

    /**
     * Gets the StreamingPoliciesInner object to access its operations.
     * @return the StreamingPoliciesInner object.
     */
    public StreamingPoliciesInner streamingPolicies() {
        return this.streamingPolicies;
    }

    /**
     * The StreamingLocatorsInner object to access its operations.
     */
    private StreamingLocatorsInner streamingLocators;

    /**
     * Gets the StreamingLocatorsInner object to access its operations.
     * @return the StreamingLocatorsInner object.
     */
    public StreamingLocatorsInner streamingLocators() {
        return this.streamingLocators;
    }

    /**
     * The LiveEventsInner object to access its operations.
     */
    private LiveEventsInner liveEvents;

    /**
     * Gets the LiveEventsInner object to access its operations.
     * @return the LiveEventsInner object.
     */
    public LiveEventsInner liveEvents() {
        return this.liveEvents;
    }

    /**
     * The LiveOutputsInner object to access its operations.
     */
    private LiveOutputsInner liveOutputs;

    /**
     * Gets the LiveOutputsInner object to access its operations.
     * @return the LiveOutputsInner object.
     */
    public LiveOutputsInner liveOutputs() {
        return this.liveOutputs;
    }

    /**
     * The StreamingEndpointsInner object to access its operations.
     */
    private StreamingEndpointsInner streamingEndpoints;

    /**
     * Gets the StreamingEndpointsInner object to access its operations.
     * @return the StreamingEndpointsInner object.
     */
    public StreamingEndpointsInner streamingEndpoints() {
        return this.streamingEndpoints;
    }

    /**
     * Initializes an instance of AzureMediaServices client.
     *
     * @param credentials the management credentials for Azure
     */
    public AzureMediaServicesImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of AzureMediaServices client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AzureMediaServicesImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of AzureMediaServices client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AzureMediaServicesImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2018-07-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.accountFilters = new AccountFiltersInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.mediaservices = new MediaservicesInner(restClient().retrofit(), this);
        this.locations = new LocationsInner(restClient().retrofit(), this);
        this.assets = new AssetsInner(restClient().retrofit(), this);
        this.assetFilters = new AssetFiltersInner(restClient().retrofit(), this);
        this.contentKeyPolicies = new ContentKeyPoliciesInner(restClient().retrofit(), this);
        this.transforms = new TransformsInner(restClient().retrofit(), this);
        this.jobs = new JobsInner(restClient().retrofit(), this);
        this.streamingPolicies = new StreamingPoliciesInner(restClient().retrofit(), this);
        this.streamingLocators = new StreamingLocatorsInner(restClient().retrofit(), this);
        this.liveEvents = new LiveEventsInner(restClient().retrofit(), this);
        this.liveOutputs = new LiveOutputsInner(restClient().retrofit(), this);
        this.streamingEndpoints = new StreamingEndpointsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "AzureMediaServices", "2018-07-01");
    }
}
