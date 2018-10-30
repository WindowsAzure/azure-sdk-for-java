/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2015_05_21_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the DevTestLabsClientImpl class.
 */
public class DevTestLabsClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
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
    public DevTestLabsClientImpl withSubscriptionId(String subscriptionId) {
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
    public DevTestLabsClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public DevTestLabsClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public DevTestLabsClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The LabsInner object to access its operations.
     */
    private LabsInner labs;

    /**
     * Gets the LabsInner object to access its operations.
     * @return the LabsInner object.
     */
    public LabsInner labs() {
        return this.labs;
    }

    /**
     * The ArtifactSourcesInner object to access its operations.
     */
    private ArtifactSourcesInner artifactSources;

    /**
     * Gets the ArtifactSourcesInner object to access its operations.
     * @return the ArtifactSourcesInner object.
     */
    public ArtifactSourcesInner artifactSources() {
        return this.artifactSources;
    }

    /**
     * The ArtifactsInner object to access its operations.
     */
    private ArtifactsInner artifacts;

    /**
     * Gets the ArtifactsInner object to access its operations.
     * @return the ArtifactsInner object.
     */
    public ArtifactsInner artifacts() {
        return this.artifacts;
    }

    /**
     * The CostInsightsInner object to access its operations.
     */
    private CostInsightsInner costInsights;

    /**
     * Gets the CostInsightsInner object to access its operations.
     * @return the CostInsightsInner object.
     */
    public CostInsightsInner costInsights() {
        return this.costInsights;
    }

    /**
     * The CostsInner object to access its operations.
     */
    private CostsInner costs;

    /**
     * Gets the CostsInner object to access its operations.
     * @return the CostsInner object.
     */
    public CostsInner costs() {
        return this.costs;
    }

    /**
     * The CustomImagesInner object to access its operations.
     */
    private CustomImagesInner customImages;

    /**
     * Gets the CustomImagesInner object to access its operations.
     * @return the CustomImagesInner object.
     */
    public CustomImagesInner customImages() {
        return this.customImages;
    }

    /**
     * The FormulasInner object to access its operations.
     */
    private FormulasInner formulas;

    /**
     * Gets the FormulasInner object to access its operations.
     * @return the FormulasInner object.
     */
    public FormulasInner formulas() {
        return this.formulas;
    }

    /**
     * The GalleryImagesInner object to access its operations.
     */
    private GalleryImagesInner galleryImages;

    /**
     * Gets the GalleryImagesInner object to access its operations.
     * @return the GalleryImagesInner object.
     */
    public GalleryImagesInner galleryImages() {
        return this.galleryImages;
    }

    /**
     * The PolicySetsInner object to access its operations.
     */
    private PolicySetsInner policySets;

    /**
     * Gets the PolicySetsInner object to access its operations.
     * @return the PolicySetsInner object.
     */
    public PolicySetsInner policySets() {
        return this.policySets;
    }

    /**
     * The PolicysInner object to access its operations.
     */
    private PolicysInner policys;

    /**
     * Gets the PolicysInner object to access its operations.
     * @return the PolicysInner object.
     */
    public PolicysInner policys() {
        return this.policys;
    }

    /**
     * The SchedulesInner object to access its operations.
     */
    private SchedulesInner schedules;

    /**
     * Gets the SchedulesInner object to access its operations.
     * @return the SchedulesInner object.
     */
    public SchedulesInner schedules() {
        return this.schedules;
    }

    /**
     * The VirtualMachinesInner object to access its operations.
     */
    private VirtualMachinesInner virtualMachines;

    /**
     * Gets the VirtualMachinesInner object to access its operations.
     * @return the VirtualMachinesInner object.
     */
    public VirtualMachinesInner virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * The VirtualNetworksInner object to access its operations.
     */
    private VirtualNetworksInner virtualNetworks;

    /**
     * Gets the VirtualNetworksInner object to access its operations.
     * @return the VirtualNetworksInner object.
     */
    public VirtualNetworksInner virtualNetworks() {
        return this.virtualNetworks;
    }

    /**
     * Initializes an instance of DevTestLabsClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public DevTestLabsClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of DevTestLabsClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public DevTestLabsClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of DevTestLabsClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public DevTestLabsClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2015-05-21-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.labs = new LabsInner(restClient().retrofit(), this);
        this.artifactSources = new ArtifactSourcesInner(restClient().retrofit(), this);
        this.artifacts = new ArtifactsInner(restClient().retrofit(), this);
        this.costInsights = new CostInsightsInner(restClient().retrofit(), this);
        this.costs = new CostsInner(restClient().retrofit(), this);
        this.customImages = new CustomImagesInner(restClient().retrofit(), this);
        this.formulas = new FormulasInner(restClient().retrofit(), this);
        this.galleryImages = new GalleryImagesInner(restClient().retrofit(), this);
        this.policySets = new PolicySetsInner(restClient().retrofit(), this);
        this.policys = new PolicysInner(restClient().retrofit(), this);
        this.schedules = new SchedulesInner(restClient().retrofit(), this);
        this.virtualMachines = new VirtualMachinesInner(restClient().retrofit(), this);
        this.virtualNetworks = new VirtualNetworksInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "DevTestLabsClient", "2015-05-21-preview");
    }
}
