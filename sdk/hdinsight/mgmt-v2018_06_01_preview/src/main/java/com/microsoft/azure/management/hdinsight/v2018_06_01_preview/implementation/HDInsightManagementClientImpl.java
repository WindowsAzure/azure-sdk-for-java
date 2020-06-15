/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the HDInsightManagementClientImpl class.
 */
public class HDInsightManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets The subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public HDInsightManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The HDInsight client API Version. */
    private String apiVersion;

    /**
     * Gets The HDInsight client API Version.
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
    public HDInsightManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public HDInsightManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public HDInsightManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
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
     * The ApplicationsInner object to access its operations.
     */
    private ApplicationsInner applications;

    /**
     * Gets the ApplicationsInner object to access its operations.
     * @return the ApplicationsInner object.
     */
    public ApplicationsInner applications() {
        return this.applications;
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
     * The ConfigurationsInner object to access its operations.
     */
    private ConfigurationsInner configurations;

    /**
     * Gets the ConfigurationsInner object to access its operations.
     * @return the ConfigurationsInner object.
     */
    public ConfigurationsInner configurations() {
        return this.configurations;
    }

    /**
     * The ExtensionsInner object to access its operations.
     */
    private ExtensionsInner extensions;

    /**
     * Gets the ExtensionsInner object to access its operations.
     * @return the ExtensionsInner object.
     */
    public ExtensionsInner extensions() {
        return this.extensions;
    }

    /**
     * The ScriptActionsInner object to access its operations.
     */
    private ScriptActionsInner scriptActions;

    /**
     * Gets the ScriptActionsInner object to access its operations.
     * @return the ScriptActionsInner object.
     */
    public ScriptActionsInner scriptActions() {
        return this.scriptActions;
    }

    /**
     * The ScriptExecutionHistorysInner object to access its operations.
     */
    private ScriptExecutionHistorysInner scriptExecutionHistorys;

    /**
     * Gets the ScriptExecutionHistorysInner object to access its operations.
     * @return the ScriptExecutionHistorysInner object.
     */
    public ScriptExecutionHistorysInner scriptExecutionHistorys() {
        return this.scriptExecutionHistorys;
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
     * Initializes an instance of HDInsightManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public HDInsightManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of HDInsightManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public HDInsightManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of HDInsightManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public HDInsightManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2018-06-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.clusters = new ClustersInner(restClient().retrofit(), this);
        this.applications = new ApplicationsInner(restClient().retrofit(), this);
        this.locations = new LocationsInner(restClient().retrofit(), this);
        this.configurations = new ConfigurationsInner(restClient().retrofit(), this);
        this.extensions = new ExtensionsInner(restClient().retrofit(), this);
        this.scriptActions = new ScriptActionsInner(restClient().retrofit(), this);
        this.scriptExecutionHistorys = new ScriptExecutionHistorysInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.virtualMachines = new VirtualMachinesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "HDInsightManagementClient", "2018-06-01-preview");
    }
}
