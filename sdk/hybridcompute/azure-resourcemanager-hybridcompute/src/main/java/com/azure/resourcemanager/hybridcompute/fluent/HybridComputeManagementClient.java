// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for HybridComputeManagementClient class. */
public interface HybridComputeManagementClient {
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
     * Gets the MachinesClient object to access its operations.
     *
     * @return the MachinesClient object.
     */
    MachinesClient getMachines();

    /**
     * Gets the MachineExtensionsClient object to access its operations.
     *
     * @return the MachineExtensionsClient object.
     */
    MachineExtensionsClient getMachineExtensions();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PrivateLinkScopesClient object to access its operations.
     *
     * @return the PrivateLinkScopesClient object.
     */
    PrivateLinkScopesClient getPrivateLinkScopes();

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
}
