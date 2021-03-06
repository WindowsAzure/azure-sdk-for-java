// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for AzureMachineLearningWorkspaces class. */
public interface AzureMachineLearningWorkspaces {
    /**
     * Gets Azure subscription identifier.
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
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the WorkspacesClient object to access its operations.
     *
     * @return the WorkspacesClient object.
     */
    WorkspacesClient getWorkspaces();

    /**
     * Gets the WorkspaceFeaturesClient object to access its operations.
     *
     * @return the WorkspaceFeaturesClient object.
     */
    WorkspaceFeaturesClient getWorkspaceFeatures();

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the VirtualMachineSizesClient object to access its operations.
     *
     * @return the VirtualMachineSizesClient object.
     */
    VirtualMachineSizesClient getVirtualMachineSizes();

    /**
     * Gets the QuotasClient object to access its operations.
     *
     * @return the QuotasClient object.
     */
    QuotasClient getQuotas();

    /**
     * Gets the MachineLearningComputesClient object to access its operations.
     *
     * @return the MachineLearningComputesClient object.
     */
    MachineLearningComputesClient getMachineLearningComputes();

    /**
     * Gets the WorkspaceOperationsClient object to access its operations.
     *
     * @return the WorkspaceOperationsClient object.
     */
    WorkspaceOperationsClient getWorkspaceOperations();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the MachineLearningServicesClient object to access its operations.
     *
     * @return the MachineLearningServicesClient object.
     */
    MachineLearningServicesClient getMachineLearningServices();

    /**
     * Gets the NotebooksClient object to access its operations.
     *
     * @return the NotebooksClient object.
     */
    NotebooksClient getNotebooks();

    /**
     * Gets the StorageAccountsClient object to access its operations.
     *
     * @return the StorageAccountsClient object.
     */
    StorageAccountsClient getStorageAccounts();

    /**
     * Gets the WorkspaceConnectionsClient object to access its operations.
     *
     * @return the WorkspaceConnectionsClient object.
     */
    WorkspaceConnectionsClient getWorkspaceConnections();
}
