// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for MicrosoftStorageSync class. */
public interface MicrosoftStorageSync {
    /**
     * Gets The ID of the target subscription.
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
     * Gets the StorageSyncServicesClient object to access its operations.
     *
     * @return the StorageSyncServicesClient object.
     */
    StorageSyncServicesClient getStorageSyncServices();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the SyncGroupsClient object to access its operations.
     *
     * @return the SyncGroupsClient object.
     */
    SyncGroupsClient getSyncGroups();

    /**
     * Gets the CloudEndpointsClient object to access its operations.
     *
     * @return the CloudEndpointsClient object.
     */
    CloudEndpointsClient getCloudEndpoints();

    /**
     * Gets the ServerEndpointsClient object to access its operations.
     *
     * @return the ServerEndpointsClient object.
     */
    ServerEndpointsClient getServerEndpoints();

    /**
     * Gets the RegisteredServersClient object to access its operations.
     *
     * @return the RegisteredServersClient object.
     */
    RegisteredServersClient getRegisteredServers();

    /**
     * Gets the WorkflowsClient object to access its operations.
     *
     * @return the WorkflowsClient object.
     */
    WorkflowsClient getWorkflows();

    /**
     * Gets the OperationStatusOperationsClient object to access its operations.
     *
     * @return the OperationStatusOperationsClient object.
     */
    OperationStatusOperationsClient getOperationStatusOperations();
}
