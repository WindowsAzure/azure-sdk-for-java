// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for LogicManagementClient class. */
public interface LogicManagementClient {
    /**
     * Gets The subscription id.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the WorkflowsClient object to access its operations.
     *
     * @return the WorkflowsClient object.
     */
    WorkflowsClient getWorkflows();

    /**
     * Gets the WorkflowVersionsClient object to access its operations.
     *
     * @return the WorkflowVersionsClient object.
     */
    WorkflowVersionsClient getWorkflowVersions();

    /**
     * Gets the WorkflowTriggersClient object to access its operations.
     *
     * @return the WorkflowTriggersClient object.
     */
    WorkflowTriggersClient getWorkflowTriggers();

    /**
     * Gets the WorkflowVersionTriggersClient object to access its operations.
     *
     * @return the WorkflowVersionTriggersClient object.
     */
    WorkflowVersionTriggersClient getWorkflowVersionTriggers();

    /**
     * Gets the WorkflowTriggerHistoriesClient object to access its operations.
     *
     * @return the WorkflowTriggerHistoriesClient object.
     */
    WorkflowTriggerHistoriesClient getWorkflowTriggerHistories();

    /**
     * Gets the WorkflowRunsClient object to access its operations.
     *
     * @return the WorkflowRunsClient object.
     */
    WorkflowRunsClient getWorkflowRuns();

    /**
     * Gets the WorkflowRunActionsClient object to access its operations.
     *
     * @return the WorkflowRunActionsClient object.
     */
    WorkflowRunActionsClient getWorkflowRunActions();

    /**
     * Gets the WorkflowRunActionRepetitionsClient object to access its operations.
     *
     * @return the WorkflowRunActionRepetitionsClient object.
     */
    WorkflowRunActionRepetitionsClient getWorkflowRunActionRepetitions();

    /**
     * Gets the WorkflowRunActionRepetitionsRequestHistoriesClient object to access its operations.
     *
     * @return the WorkflowRunActionRepetitionsRequestHistoriesClient object.
     */
    WorkflowRunActionRepetitionsRequestHistoriesClient getWorkflowRunActionRepetitionsRequestHistories();

    /**
     * Gets the WorkflowRunActionRequestHistoriesClient object to access its operations.
     *
     * @return the WorkflowRunActionRequestHistoriesClient object.
     */
    WorkflowRunActionRequestHistoriesClient getWorkflowRunActionRequestHistories();

    /**
     * Gets the WorkflowRunActionScopeRepetitionsClient object to access its operations.
     *
     * @return the WorkflowRunActionScopeRepetitionsClient object.
     */
    WorkflowRunActionScopeRepetitionsClient getWorkflowRunActionScopeRepetitions();

    /**
     * Gets the WorkflowRunOperationsClient object to access its operations.
     *
     * @return the WorkflowRunOperationsClient object.
     */
    WorkflowRunOperationsClient getWorkflowRunOperations();

    /**
     * Gets the IntegrationAccountsClient object to access its operations.
     *
     * @return the IntegrationAccountsClient object.
     */
    IntegrationAccountsClient getIntegrationAccounts();

    /**
     * Gets the IntegrationAccountAssembliesClient object to access its operations.
     *
     * @return the IntegrationAccountAssembliesClient object.
     */
    IntegrationAccountAssembliesClient getIntegrationAccountAssemblies();

    /**
     * Gets the IntegrationAccountBatchConfigurationsClient object to access its operations.
     *
     * @return the IntegrationAccountBatchConfigurationsClient object.
     */
    IntegrationAccountBatchConfigurationsClient getIntegrationAccountBatchConfigurations();

    /**
     * Gets the IntegrationAccountSchemasClient object to access its operations.
     *
     * @return the IntegrationAccountSchemasClient object.
     */
    IntegrationAccountSchemasClient getIntegrationAccountSchemas();

    /**
     * Gets the IntegrationAccountMapsClient object to access its operations.
     *
     * @return the IntegrationAccountMapsClient object.
     */
    IntegrationAccountMapsClient getIntegrationAccountMaps();

    /**
     * Gets the IntegrationAccountPartnersClient object to access its operations.
     *
     * @return the IntegrationAccountPartnersClient object.
     */
    IntegrationAccountPartnersClient getIntegrationAccountPartners();

    /**
     * Gets the IntegrationAccountAgreementsClient object to access its operations.
     *
     * @return the IntegrationAccountAgreementsClient object.
     */
    IntegrationAccountAgreementsClient getIntegrationAccountAgreements();

    /**
     * Gets the IntegrationAccountCertificatesClient object to access its operations.
     *
     * @return the IntegrationAccountCertificatesClient object.
     */
    IntegrationAccountCertificatesClient getIntegrationAccountCertificates();

    /**
     * Gets the IntegrationAccountSessionsClient object to access its operations.
     *
     * @return the IntegrationAccountSessionsClient object.
     */
    IntegrationAccountSessionsClient getIntegrationAccountSessions();

    /**
     * Gets the IntegrationServiceEnvironmentsClient object to access its operations.
     *
     * @return the IntegrationServiceEnvironmentsClient object.
     */
    IntegrationServiceEnvironmentsClient getIntegrationServiceEnvironments();

    /**
     * Gets the IntegrationServiceEnvironmentSkusClient object to access its operations.
     *
     * @return the IntegrationServiceEnvironmentSkusClient object.
     */
    IntegrationServiceEnvironmentSkusClient getIntegrationServiceEnvironmentSkus();

    /**
     * Gets the IntegrationServiceEnvironmentNetworkHealthsClient object to access its operations.
     *
     * @return the IntegrationServiceEnvironmentNetworkHealthsClient object.
     */
    IntegrationServiceEnvironmentNetworkHealthsClient getIntegrationServiceEnvironmentNetworkHealths();

    /**
     * Gets the IntegrationServiceEnvironmentManagedApisClient object to access its operations.
     *
     * @return the IntegrationServiceEnvironmentManagedApisClient object.
     */
    IntegrationServiceEnvironmentManagedApisClient getIntegrationServiceEnvironmentManagedApis();

    /**
     * Gets the IntegrationServiceEnvironmentManagedApiOperationsClient object to access its operations.
     *
     * @return the IntegrationServiceEnvironmentManagedApiOperationsClient object.
     */
    IntegrationServiceEnvironmentManagedApiOperationsClient getIntegrationServiceEnvironmentManagedApiOperations();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();
}
