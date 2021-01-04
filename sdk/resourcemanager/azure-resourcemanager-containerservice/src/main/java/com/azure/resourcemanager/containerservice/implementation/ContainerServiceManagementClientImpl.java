// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.containerservice.fluent.AgentPoolsClient;
import com.azure.resourcemanager.containerservice.fluent.ContainerServiceManagementClient;
import com.azure.resourcemanager.containerservice.fluent.ContainerServicesClient;
import com.azure.resourcemanager.containerservice.fluent.ManagedClustersClient;
import com.azure.resourcemanager.containerservice.fluent.OpenShiftManagedClustersClient;
import com.azure.resourcemanager.containerservice.fluent.OperationsClient;
import com.azure.resourcemanager.containerservice.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.containerservice.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.containerservice.fluent.ResolvePrivateLinkServiceIdsClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/** Initializes a new instance of the ContainerServiceManagementClientImpl type. */
@ServiceClient(builder = ContainerServiceManagementClientBuilder.class)
public final class ContainerServiceManagementClientImpl extends AzureServiceClient
    implements ContainerServiceManagementClient {
    private final ClientLogger logger = new ClientLogger(ContainerServiceManagementClientImpl.class);

    /**
     * Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of
     * the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The OpenShiftManagedClustersClient object to access its operations. */
    private final OpenShiftManagedClustersClient openShiftManagedClusters;

    /**
     * Gets the OpenShiftManagedClustersClient object to access its operations.
     *
     * @return the OpenShiftManagedClustersClient object.
     */
    public OpenShiftManagedClustersClient getOpenShiftManagedClusters() {
        return this.openShiftManagedClusters;
    }

    /** The ContainerServicesClient object to access its operations. */
    private final ContainerServicesClient containerServices;

    /**
     * Gets the ContainerServicesClient object to access its operations.
     *
     * @return the ContainerServicesClient object.
     */
    public ContainerServicesClient getContainerServices() {
        return this.containerServices;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The ManagedClustersClient object to access its operations. */
    private final ManagedClustersClient managedClusters;

    /**
     * Gets the ManagedClustersClient object to access its operations.
     *
     * @return the ManagedClustersClient object.
     */
    public ManagedClustersClient getManagedClusters() {
        return this.managedClusters;
    }

    /** The AgentPoolsClient object to access its operations. */
    private final AgentPoolsClient agentPools;

    /**
     * Gets the AgentPoolsClient object to access its operations.
     *
     * @return the AgentPoolsClient object.
     */
    public AgentPoolsClient getAgentPools() {
        return this.agentPools;
    }

    /** The PrivateEndpointConnectionsClient object to access its operations. */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /** The PrivateLinkResourcesClient object to access its operations. */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /** The ResolvePrivateLinkServiceIdsClient object to access its operations. */
    private final ResolvePrivateLinkServiceIdsClient resolvePrivateLinkServiceIds;

    /**
     * Gets the ResolvePrivateLinkServiceIdsClient object to access its operations.
     *
     * @return the ResolvePrivateLinkServiceIdsClient object.
     */
    public ResolvePrivateLinkServiceIdsClient getResolvePrivateLinkServiceIds() {
        return this.resolvePrivateLinkServiceIds;
    }

    /**
     * Initializes an instance of ContainerServiceManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Subscription credentials which uniquely identify Microsoft Azure subscription. The
     *     subscription ID forms part of the URI for every service call.
     * @param endpoint server parameter.
     */
    ContainerServiceManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.openShiftManagedClusters = new OpenShiftManagedClustersClientImpl(this);
        this.containerServices = new ContainerServicesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.managedClusters = new ManagedClustersClientImpl(this);
        this.agentPools = new AgentPoolsClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.resolvePrivateLinkServiceIds = new ResolvePrivateLinkServiceIdsClientImpl(this);
    }
}
