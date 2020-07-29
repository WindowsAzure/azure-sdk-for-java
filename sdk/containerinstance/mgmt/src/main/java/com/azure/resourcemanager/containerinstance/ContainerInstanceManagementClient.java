// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerinstance.fluent.ContainerGroupsClient;
import com.azure.resourcemanager.containerinstance.fluent.ContainersClient;
import com.azure.resourcemanager.containerinstance.fluent.LocationsClient;
import com.azure.resourcemanager.containerinstance.fluent.OperationsClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;

/** Initializes a new instance of the ContainerInstanceManagementClient type. */
@ServiceClient(builder = ContainerInstanceManagementClientBuilder.class)
public final class ContainerInstanceManagementClient extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(ContainerInstanceManagementClient.class);

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

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
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

    /** The ContainerGroupsClient object to access its operations. */
    private final ContainerGroupsClient containerGroups;

    /**
     * Gets the ContainerGroupsClient object to access its operations.
     *
     * @return the ContainerGroupsClient object.
     */
    public ContainerGroupsClient getContainerGroups() {
        return this.containerGroups;
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

    /** The LocationsClient object to access its operations. */
    private final LocationsClient locations;

    /**
     * Gets the LocationsClient object to access its operations.
     *
     * @return the LocationsClient object.
     */
    public LocationsClient getLocations() {
        return this.locations;
    }

    /** The ContainersClient object to access its operations. */
    private final ContainersClient containers;

    /**
     * Gets the ContainersClient object to access its operations.
     *
     * @return the ContainersClient object.
     */
    public ContainersClient getContainers() {
        return this.containers;
    }

    /**
     * Initializes an instance of ContainerInstanceManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    ContainerInstanceManagementClient(
        HttpPipeline httpPipeline, AzureEnvironment environment, String subscriptionId, String endpoint) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2019-12-01";
        this.containerGroups = new ContainerGroupsClient(this);
        this.operations = new OperationsClient(this);
        this.locations = new LocationsClient(this);
        this.containers = new ContainersClient(this);
    }
}
