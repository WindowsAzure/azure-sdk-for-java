/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the MicrosoftDatadogClientImpl class.
 */
public class MicrosoftDatadogClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The Microsoft Azure subscription ID. */
    private String subscriptionId;

    /**
     * Gets The Microsoft Azure subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The Microsoft Azure subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public MicrosoftDatadogClientImpl withSubscriptionId(String subscriptionId) {
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
    public MicrosoftDatadogClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public MicrosoftDatadogClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public MicrosoftDatadogClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The MarketplaceAgreementsInner object to access its operations.
     */
    private MarketplaceAgreementsInner marketplaceAgreements;

    /**
     * Gets the MarketplaceAgreementsInner object to access its operations.
     * @return the MarketplaceAgreementsInner object.
     */
    public MarketplaceAgreementsInner marketplaceAgreements() {
        return this.marketplaceAgreements;
    }

    /**
     * The ApiKeysInner object to access its operations.
     */
    private ApiKeysInner apiKeys;

    /**
     * Gets the ApiKeysInner object to access its operations.
     * @return the ApiKeysInner object.
     */
    public ApiKeysInner apiKeys() {
        return this.apiKeys;
    }

    /**
     * The HostsInner object to access its operations.
     */
    private HostsInner hosts;

    /**
     * Gets the HostsInner object to access its operations.
     * @return the HostsInner object.
     */
    public HostsInner hosts() {
        return this.hosts;
    }

    /**
     * The LinkedResourcesInner object to access its operations.
     */
    private LinkedResourcesInner linkedResources;

    /**
     * Gets the LinkedResourcesInner object to access its operations.
     * @return the LinkedResourcesInner object.
     */
    public LinkedResourcesInner linkedResources() {
        return this.linkedResources;
    }

    /**
     * The MonitoredResourcesInner object to access its operations.
     */
    private MonitoredResourcesInner monitoredResources;

    /**
     * Gets the MonitoredResourcesInner object to access its operations.
     * @return the MonitoredResourcesInner object.
     */
    public MonitoredResourcesInner monitoredResources() {
        return this.monitoredResources;
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
     * The MonitorsInner object to access its operations.
     */
    private MonitorsInner monitors;

    /**
     * Gets the MonitorsInner object to access its operations.
     * @return the MonitorsInner object.
     */
    public MonitorsInner monitors() {
        return this.monitors;
    }

    /**
     * The RefreshSetPasswordsInner object to access its operations.
     */
    private RefreshSetPasswordsInner refreshSetPasswords;

    /**
     * Gets the RefreshSetPasswordsInner object to access its operations.
     * @return the RefreshSetPasswordsInner object.
     */
    public RefreshSetPasswordsInner refreshSetPasswords() {
        return this.refreshSetPasswords;
    }

    /**
     * The TagRulesInner object to access its operations.
     */
    private TagRulesInner tagRules;

    /**
     * Gets the TagRulesInner object to access its operations.
     * @return the TagRulesInner object.
     */
    public TagRulesInner tagRules() {
        return this.tagRules;
    }

    /**
     * The SingleSignOnConfigurationsInner object to access its operations.
     */
    private SingleSignOnConfigurationsInner singleSignOnConfigurations;

    /**
     * Gets the SingleSignOnConfigurationsInner object to access its operations.
     * @return the SingleSignOnConfigurationsInner object.
     */
    public SingleSignOnConfigurationsInner singleSignOnConfigurations() {
        return this.singleSignOnConfigurations;
    }

    /**
     * Initializes an instance of MicrosoftDatadogClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public MicrosoftDatadogClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of MicrosoftDatadogClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public MicrosoftDatadogClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of MicrosoftDatadogClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public MicrosoftDatadogClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2020-02-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.marketplaceAgreements = new MarketplaceAgreementsInner(restClient().retrofit(), this);
        this.apiKeys = new ApiKeysInner(restClient().retrofit(), this);
        this.hosts = new HostsInner(restClient().retrofit(), this);
        this.linkedResources = new LinkedResourcesInner(restClient().retrofit(), this);
        this.monitoredResources = new MonitoredResourcesInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.monitors = new MonitorsInner(restClient().retrofit(), this);
        this.refreshSetPasswords = new RefreshSetPasswordsInner(restClient().retrofit(), this);
        this.tagRules = new TagRulesInner(restClient().retrofit(), this);
        this.singleSignOnConfigurations = new SingleSignOnConfigurationsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "MicrosoftDatadogClient", "2020-02-01-preview");
    }
}
