// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.MonitorClient;
import com.azure.resourcemanager.monitor.generated.implementation.ActionGroupsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.ActivityLogAlertsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.ActivityLogsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.AlertRuleIncidentsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.AlertRulesImpl;
import com.azure.resourcemanager.monitor.generated.implementation.AutoscaleSettingsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.BaselinesImpl;
import com.azure.resourcemanager.monitor.generated.implementation.DataCollectionEndpointsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.DataCollectionRuleAssociationsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.DataCollectionRulesImpl;
import com.azure.resourcemanager.monitor.generated.implementation.DiagnosticSettingsCategoriesImpl;
import com.azure.resourcemanager.monitor.generated.implementation.DiagnosticSettingsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.EventCategoriesImpl;
import com.azure.resourcemanager.monitor.generated.implementation.LogProfilesImpl;
import com.azure.resourcemanager.monitor.generated.implementation.MetricAlertsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.MetricAlertsStatusImpl;
import com.azure.resourcemanager.monitor.generated.implementation.MetricDefinitionsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.MetricNamespacesImpl;
import com.azure.resourcemanager.monitor.generated.implementation.MetricsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.MonitorClientBuilder;
import com.azure.resourcemanager.monitor.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.monitor.generated.implementation.PrivateLinkScopeOperationStatusImpl;
import com.azure.resourcemanager.monitor.generated.implementation.PrivateLinkScopedResourcesImpl;
import com.azure.resourcemanager.monitor.generated.implementation.PrivateLinkScopesImpl;
import com.azure.resourcemanager.monitor.generated.implementation.ScheduledQueryRulesImpl;
import com.azure.resourcemanager.monitor.generated.implementation.TenantActivityLogsImpl;
import com.azure.resourcemanager.monitor.generated.implementation.VMInsightsImpl;
import com.azure.resourcemanager.monitor.generated.models.ActionGroups;
import com.azure.resourcemanager.monitor.generated.models.ActivityLogAlerts;
import com.azure.resourcemanager.monitor.generated.models.ActivityLogs;
import com.azure.resourcemanager.monitor.generated.models.AlertRuleIncidents;
import com.azure.resourcemanager.monitor.generated.models.AlertRules;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleSettings;
import com.azure.resourcemanager.monitor.generated.models.Baselines;
import com.azure.resourcemanager.monitor.generated.models.DataCollectionEndpoints;
import com.azure.resourcemanager.monitor.generated.models.DataCollectionRuleAssociations;
import com.azure.resourcemanager.monitor.generated.models.DataCollectionRules;
import com.azure.resourcemanager.monitor.generated.models.DiagnosticSettings;
import com.azure.resourcemanager.monitor.generated.models.DiagnosticSettingsCategories;
import com.azure.resourcemanager.monitor.generated.models.EventCategories;
import com.azure.resourcemanager.monitor.generated.models.LogProfiles;
import com.azure.resourcemanager.monitor.generated.models.MetricAlerts;
import com.azure.resourcemanager.monitor.generated.models.MetricAlertsStatus;
import com.azure.resourcemanager.monitor.generated.models.MetricDefinitions;
import com.azure.resourcemanager.monitor.generated.models.MetricNamespaces;
import com.azure.resourcemanager.monitor.generated.models.Metrics;
import com.azure.resourcemanager.monitor.generated.models.Operations;
import com.azure.resourcemanager.monitor.generated.models.PrivateEndpointConnections;
import com.azure.resourcemanager.monitor.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.monitor.generated.models.PrivateLinkScopeOperationStatus;
import com.azure.resourcemanager.monitor.generated.models.PrivateLinkScopedResources;
import com.azure.resourcemanager.monitor.generated.models.PrivateLinkScopes;
import com.azure.resourcemanager.monitor.generated.models.ScheduledQueryRules;
import com.azure.resourcemanager.monitor.generated.models.TenantActivityLogs;
import com.azure.resourcemanager.monitor.generated.models.VMInsights;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to MonitorManager. Monitor Management Client. */
public final class MonitorManager {
    private AutoscaleSettings autoscaleSettings;

    private Operations operations;

    private AlertRuleIncidents alertRuleIncidents;

    private AlertRules alertRules;

    private LogProfiles logProfiles;

    private DiagnosticSettings diagnosticSettings;

    private DiagnosticSettingsCategories diagnosticSettingsCategories;

    private ActionGroups actionGroups;

    private ActivityLogs activityLogs;

    private EventCategories eventCategories;

    private TenantActivityLogs tenantActivityLogs;

    private MetricDefinitions metricDefinitions;

    private Metrics metrics;

    private Baselines baselines;

    private MetricAlerts metricAlerts;

    private MetricAlertsStatus metricAlertsStatus;

    private ScheduledQueryRules scheduledQueryRules;

    private MetricNamespaces metricNamespaces;

    private VMInsights vMInsights;

    private PrivateLinkScopes privateLinkScopes;

    private PrivateLinkScopeOperationStatus privateLinkScopeOperationStatus;

    private PrivateLinkResources privateLinkResources;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkScopedResources privateLinkScopedResources;

    private ActivityLogAlerts activityLogAlerts;

    private DataCollectionEndpoints dataCollectionEndpoints;

    private DataCollectionRuleAssociations dataCollectionRuleAssociations;

    private DataCollectionRules dataCollectionRules;

    private final MonitorClient clientObject;

    private MonitorManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new MonitorClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Monitor service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Monitor service API instance.
     */
    public static MonitorManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create MonitorManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new MonitorManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of Monitor service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Monitor service API instance.
         */
        public MonitorManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.monitor.generated")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies);
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new MonitorManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of AutoscaleSettings. */
    public AutoscaleSettings autoscaleSettings() {
        if (this.autoscaleSettings == null) {
            this.autoscaleSettings = new AutoscaleSettingsImpl(clientObject.getAutoscaleSettings(), this);
        }
        return autoscaleSettings;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of AlertRuleIncidents. */
    public AlertRuleIncidents alertRuleIncidents() {
        if (this.alertRuleIncidents == null) {
            this.alertRuleIncidents = new AlertRuleIncidentsImpl(clientObject.getAlertRuleIncidents(), this);
        }
        return alertRuleIncidents;
    }

    /** @return Resource collection API of AlertRules. */
    public AlertRules alertRules() {
        if (this.alertRules == null) {
            this.alertRules = new AlertRulesImpl(clientObject.getAlertRules(), this);
        }
        return alertRules;
    }

    /** @return Resource collection API of LogProfiles. */
    public LogProfiles logProfiles() {
        if (this.logProfiles == null) {
            this.logProfiles = new LogProfilesImpl(clientObject.getLogProfiles(), this);
        }
        return logProfiles;
    }

    /** @return Resource collection API of DiagnosticSettings. */
    public DiagnosticSettings diagnosticSettings() {
        if (this.diagnosticSettings == null) {
            this.diagnosticSettings = new DiagnosticSettingsImpl(clientObject.getDiagnosticSettings(), this);
        }
        return diagnosticSettings;
    }

    /** @return Resource collection API of DiagnosticSettingsCategories. */
    public DiagnosticSettingsCategories diagnosticSettingsCategories() {
        if (this.diagnosticSettingsCategories == null) {
            this.diagnosticSettingsCategories =
                new DiagnosticSettingsCategoriesImpl(clientObject.getDiagnosticSettingsCategories(), this);
        }
        return diagnosticSettingsCategories;
    }

    /** @return Resource collection API of ActionGroups. */
    public ActionGroups actionGroups() {
        if (this.actionGroups == null) {
            this.actionGroups = new ActionGroupsImpl(clientObject.getActionGroups(), this);
        }
        return actionGroups;
    }

    /** @return Resource collection API of ActivityLogs. */
    public ActivityLogs activityLogs() {
        if (this.activityLogs == null) {
            this.activityLogs = new ActivityLogsImpl(clientObject.getActivityLogs(), this);
        }
        return activityLogs;
    }

    /** @return Resource collection API of EventCategories. */
    public EventCategories eventCategories() {
        if (this.eventCategories == null) {
            this.eventCategories = new EventCategoriesImpl(clientObject.getEventCategories(), this);
        }
        return eventCategories;
    }

    /** @return Resource collection API of TenantActivityLogs. */
    public TenantActivityLogs tenantActivityLogs() {
        if (this.tenantActivityLogs == null) {
            this.tenantActivityLogs = new TenantActivityLogsImpl(clientObject.getTenantActivityLogs(), this);
        }
        return tenantActivityLogs;
    }

    /** @return Resource collection API of MetricDefinitions. */
    public MetricDefinitions metricDefinitions() {
        if (this.metricDefinitions == null) {
            this.metricDefinitions = new MetricDefinitionsImpl(clientObject.getMetricDefinitions(), this);
        }
        return metricDefinitions;
    }

    /** @return Resource collection API of Metrics. */
    public Metrics metrics() {
        if (this.metrics == null) {
            this.metrics = new MetricsImpl(clientObject.getMetrics(), this);
        }
        return metrics;
    }

    /** @return Resource collection API of Baselines. */
    public Baselines baselines() {
        if (this.baselines == null) {
            this.baselines = new BaselinesImpl(clientObject.getBaselines(), this);
        }
        return baselines;
    }

    /** @return Resource collection API of MetricAlerts. */
    public MetricAlerts metricAlerts() {
        if (this.metricAlerts == null) {
            this.metricAlerts = new MetricAlertsImpl(clientObject.getMetricAlerts(), this);
        }
        return metricAlerts;
    }

    /** @return Resource collection API of MetricAlertsStatus. */
    public MetricAlertsStatus metricAlertsStatus() {
        if (this.metricAlertsStatus == null) {
            this.metricAlertsStatus = new MetricAlertsStatusImpl(clientObject.getMetricAlertsStatus(), this);
        }
        return metricAlertsStatus;
    }

    /** @return Resource collection API of ScheduledQueryRules. */
    public ScheduledQueryRules scheduledQueryRules() {
        if (this.scheduledQueryRules == null) {
            this.scheduledQueryRules = new ScheduledQueryRulesImpl(clientObject.getScheduledQueryRules(), this);
        }
        return scheduledQueryRules;
    }

    /** @return Resource collection API of MetricNamespaces. */
    public MetricNamespaces metricNamespaces() {
        if (this.metricNamespaces == null) {
            this.metricNamespaces = new MetricNamespacesImpl(clientObject.getMetricNamespaces(), this);
        }
        return metricNamespaces;
    }

    /** @return Resource collection API of VMInsights. */
    public VMInsights vMInsights() {
        if (this.vMInsights == null) {
            this.vMInsights = new VMInsightsImpl(clientObject.getVMInsights(), this);
        }
        return vMInsights;
    }

    /** @return Resource collection API of PrivateLinkScopes. */
    public PrivateLinkScopes privateLinkScopes() {
        if (this.privateLinkScopes == null) {
            this.privateLinkScopes = new PrivateLinkScopesImpl(clientObject.getPrivateLinkScopes(), this);
        }
        return privateLinkScopes;
    }

    /** @return Resource collection API of PrivateLinkScopeOperationStatus. */
    public PrivateLinkScopeOperationStatus privateLinkScopeOperationStatus() {
        if (this.privateLinkScopeOperationStatus == null) {
            this.privateLinkScopeOperationStatus =
                new PrivateLinkScopeOperationStatusImpl(clientObject.getPrivateLinkScopeOperationStatus(), this);
        }
        return privateLinkScopeOperationStatus;
    }

    /** @return Resource collection API of PrivateLinkResources. */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /** @return Resource collection API of PrivateEndpointConnections. */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections =
                new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /** @return Resource collection API of PrivateLinkScopedResources. */
    public PrivateLinkScopedResources privateLinkScopedResources() {
        if (this.privateLinkScopedResources == null) {
            this.privateLinkScopedResources =
                new PrivateLinkScopedResourcesImpl(clientObject.getPrivateLinkScopedResources(), this);
        }
        return privateLinkScopedResources;
    }

    /** @return Resource collection API of ActivityLogAlerts. */
    public ActivityLogAlerts activityLogAlerts() {
        if (this.activityLogAlerts == null) {
            this.activityLogAlerts = new ActivityLogAlertsImpl(clientObject.getActivityLogAlerts(), this);
        }
        return activityLogAlerts;
    }

    /** @return Resource collection API of DataCollectionEndpoints. */
    public DataCollectionEndpoints dataCollectionEndpoints() {
        if (this.dataCollectionEndpoints == null) {
            this.dataCollectionEndpoints =
                new DataCollectionEndpointsImpl(clientObject.getDataCollectionEndpoints(), this);
        }
        return dataCollectionEndpoints;
    }

    /** @return Resource collection API of DataCollectionRuleAssociations. */
    public DataCollectionRuleAssociations dataCollectionRuleAssociations() {
        if (this.dataCollectionRuleAssociations == null) {
            this.dataCollectionRuleAssociations =
                new DataCollectionRuleAssociationsImpl(clientObject.getDataCollectionRuleAssociations(), this);
        }
        return dataCollectionRuleAssociations;
    }

    /** @return Resource collection API of DataCollectionRules. */
    public DataCollectionRules dataCollectionRules() {
        if (this.dataCollectionRules == null) {
            this.dataCollectionRules = new DataCollectionRulesImpl(clientObject.getDataCollectionRules(), this);
        }
        return dataCollectionRules;
    }

    /**
     * @return Wrapped service client MonitorClient providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public MonitorClient serviceClient() {
        return this.clientObject;
    }
}
