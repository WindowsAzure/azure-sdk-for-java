/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the MonitorManagementClientImpl class.
 */
public class MonitorManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The Azure subscription Id. */
    private String subscriptionId;

    /**
     * Gets The Azure subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The Azure subscription Id.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public MonitorManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
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
    public MonitorManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public MonitorManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public MonitorManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The AutoscaleSettingsInner object to access its operations.
     */
    private AutoscaleSettingsInner autoscaleSettings;

    /**
     * Gets the AutoscaleSettingsInner object to access its operations.
     * @return the AutoscaleSettingsInner object.
     */
    public AutoscaleSettingsInner autoscaleSettings() {
        return this.autoscaleSettings;
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
     * The AlertRuleIncidentsInner object to access its operations.
     */
    private AlertRuleIncidentsInner alertRuleIncidents;

    /**
     * Gets the AlertRuleIncidentsInner object to access its operations.
     * @return the AlertRuleIncidentsInner object.
     */
    public AlertRuleIncidentsInner alertRuleIncidents() {
        return this.alertRuleIncidents;
    }

    /**
     * The AlertRulesInner object to access its operations.
     */
    private AlertRulesInner alertRules;

    /**
     * Gets the AlertRulesInner object to access its operations.
     * @return the AlertRulesInner object.
     */
    public AlertRulesInner alertRules() {
        return this.alertRules;
    }

    /**
     * The LogProfilesInner object to access its operations.
     */
    private LogProfilesInner logProfiles;

    /**
     * Gets the LogProfilesInner object to access its operations.
     * @return the LogProfilesInner object.
     */
    public LogProfilesInner logProfiles() {
        return this.logProfiles;
    }

    /**
     * The DiagnosticSettingsInner object to access its operations.
     */
    private DiagnosticSettingsInner diagnosticSettings;

    /**
     * Gets the DiagnosticSettingsInner object to access its operations.
     * @return the DiagnosticSettingsInner object.
     */
    public DiagnosticSettingsInner diagnosticSettings() {
        return this.diagnosticSettings;
    }

    /**
     * The DiagnosticSettingsCategorysInner object to access its operations.
     */
    private DiagnosticSettingsCategorysInner diagnosticSettingsCategorys;

    /**
     * Gets the DiagnosticSettingsCategorysInner object to access its operations.
     * @return the DiagnosticSettingsCategorysInner object.
     */
    public DiagnosticSettingsCategorysInner diagnosticSettingsCategorys() {
        return this.diagnosticSettingsCategorys;
    }

    /**
     * The ActionGroupsInner object to access its operations.
     */
    private ActionGroupsInner actionGroups;

    /**
     * Gets the ActionGroupsInner object to access its operations.
     * @return the ActionGroupsInner object.
     */
    public ActionGroupsInner actionGroups() {
        return this.actionGroups;
    }

    /**
     * The ActivityLogAlertsInner object to access its operations.
     */
    private ActivityLogAlertsInner activityLogAlerts;

    /**
     * Gets the ActivityLogAlertsInner object to access its operations.
     * @return the ActivityLogAlertsInner object.
     */
    public ActivityLogAlertsInner activityLogAlerts() {
        return this.activityLogAlerts;
    }

    /**
     * The ActivityLogsInner object to access its operations.
     */
    private ActivityLogsInner activityLogs;

    /**
     * Gets the ActivityLogsInner object to access its operations.
     * @return the ActivityLogsInner object.
     */
    public ActivityLogsInner activityLogs() {
        return this.activityLogs;
    }

    /**
     * The EventCategoriesInner object to access its operations.
     */
    private EventCategoriesInner eventCategories;

    /**
     * Gets the EventCategoriesInner object to access its operations.
     * @return the EventCategoriesInner object.
     */
    public EventCategoriesInner eventCategories() {
        return this.eventCategories;
    }

    /**
     * The TenantActivityLogsInner object to access its operations.
     */
    private TenantActivityLogsInner tenantActivityLogs;

    /**
     * Gets the TenantActivityLogsInner object to access its operations.
     * @return the TenantActivityLogsInner object.
     */
    public TenantActivityLogsInner tenantActivityLogs() {
        return this.tenantActivityLogs;
    }

    /**
     * The MetricDefinitionsInner object to access its operations.
     */
    private MetricDefinitionsInner metricDefinitions;

    /**
     * Gets the MetricDefinitionsInner object to access its operations.
     * @return the MetricDefinitionsInner object.
     */
    public MetricDefinitionsInner metricDefinitions() {
        return this.metricDefinitions;
    }

    /**
     * The MetricsInner object to access its operations.
     */
    private MetricsInner metrics;

    /**
     * Gets the MetricsInner object to access its operations.
     * @return the MetricsInner object.
     */
    public MetricsInner metrics() {
        return this.metrics;
    }

    /**
     * The MetricBaselinesInner object to access its operations.
     */
    private MetricBaselinesInner metricBaselines;

    /**
     * Gets the MetricBaselinesInner object to access its operations.
     * @return the MetricBaselinesInner object.
     */
    public MetricBaselinesInner metricBaselines() {
        return this.metricBaselines;
    }

    /**
     * The MetricAlertsInner object to access its operations.
     */
    private MetricAlertsInner metricAlerts;

    /**
     * Gets the MetricAlertsInner object to access its operations.
     * @return the MetricAlertsInner object.
     */
    public MetricAlertsInner metricAlerts() {
        return this.metricAlerts;
    }

    /**
     * The MetricAlertsStatusInner object to access its operations.
     */
    private MetricAlertsStatusInner metricAlertsStatus;

    /**
     * Gets the MetricAlertsStatusInner object to access its operations.
     * @return the MetricAlertsStatusInner object.
     */
    public MetricAlertsStatusInner metricAlertsStatus() {
        return this.metricAlertsStatus;
    }

    /**
     * The ScheduledQueryRulesInner object to access its operations.
     */
    private ScheduledQueryRulesInner scheduledQueryRules;

    /**
     * Gets the ScheduledQueryRulesInner object to access its operations.
     * @return the ScheduledQueryRulesInner object.
     */
    public ScheduledQueryRulesInner scheduledQueryRules() {
        return this.scheduledQueryRules;
    }

    /**
     * The MetricNamespacesInner object to access its operations.
     */
    private MetricNamespacesInner metricNamespaces;

    /**
     * Gets the MetricNamespacesInner object to access its operations.
     * @return the MetricNamespacesInner object.
     */
    public MetricNamespacesInner metricNamespaces() {
        return this.metricNamespaces;
    }

    /**
     * Initializes an instance of MonitorManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public MonitorManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of MonitorManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public MonitorManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of MonitorManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public MonitorManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.autoscaleSettings = new AutoscaleSettingsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.alertRuleIncidents = new AlertRuleIncidentsInner(restClient().retrofit(), this);
        this.alertRules = new AlertRulesInner(restClient().retrofit(), this);
        this.logProfiles = new LogProfilesInner(restClient().retrofit(), this);
        this.diagnosticSettings = new DiagnosticSettingsInner(restClient().retrofit(), this);
        this.diagnosticSettingsCategorys = new DiagnosticSettingsCategorysInner(restClient().retrofit(), this);
        this.actionGroups = new ActionGroupsInner(restClient().retrofit(), this);
        this.activityLogAlerts = new ActivityLogAlertsInner(restClient().retrofit(), this);
        this.activityLogs = new ActivityLogsInner(restClient().retrofit(), this);
        this.eventCategories = new EventCategoriesInner(restClient().retrofit(), this);
        this.tenantActivityLogs = new TenantActivityLogsInner(restClient().retrofit(), this);
        this.metricDefinitions = new MetricDefinitionsInner(restClient().retrofit(), this);
        this.metrics = new MetricsInner(restClient().retrofit(), this);
        this.metricBaselines = new MetricBaselinesInner(restClient().retrofit(), this);
        this.metricAlerts = new MetricAlertsInner(restClient().retrofit(), this);
        this.metricAlertsStatus = new MetricAlertsStatusInner(restClient().retrofit(), this);
        this.scheduledQueryRules = new ScheduledQueryRulesInner(restClient().retrofit(), this);
        this.metricNamespaces = new MetricNamespacesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s)", super.userAgent(), "MonitorManagementClient");
    }
}
