// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import com.azure.resourcemanager.resources.fluent.DeploymentOperationsClient;
import com.azure.resourcemanager.resources.fluent.DeploymentsClient;
import com.azure.resourcemanager.resources.fluent.OperationsClient;
import com.azure.resourcemanager.resources.fluent.ProvidersClient;
import com.azure.resourcemanager.resources.fluent.ResourceGroupsClient;
import com.azure.resourcemanager.resources.fluent.ResourcesClient;
import com.azure.resourcemanager.resources.fluent.TagsClient;

/** Initializes a new instance of the ResourceManagementClient type. */
@ServiceClient(builder = ResourceManagementClientBuilder.class)
public final class ResourceManagementClient extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(ResourceManagementClient.class);

    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
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

    /** The DeploymentsClient object to access its operations. */
    private final DeploymentsClient deployments;

    /**
     * Gets the DeploymentsClient object to access its operations.
     *
     * @return the DeploymentsClient object.
     */
    public DeploymentsClient getDeployments() {
        return this.deployments;
    }

    /** The ProvidersClient object to access its operations. */
    private final ProvidersClient providers;

    /**
     * Gets the ProvidersClient object to access its operations.
     *
     * @return the ProvidersClient object.
     */
    public ProvidersClient getProviders() {
        return this.providers;
    }

    /** The ResourcesClient object to access its operations. */
    private final ResourcesClient resources;

    /**
     * Gets the ResourcesClient object to access its operations.
     *
     * @return the ResourcesClient object.
     */
    public ResourcesClient getResources() {
        return this.resources;
    }

    /** The ResourceGroupsClient object to access its operations. */
    private final ResourceGroupsClient resourceGroups;

    /**
     * Gets the ResourceGroupsClient object to access its operations.
     *
     * @return the ResourceGroupsClient object.
     */
    public ResourceGroupsClient getResourceGroups() {
        return this.resourceGroups;
    }

    /** The TagsClient object to access its operations. */
    private final TagsClient tags;

    /**
     * Gets the TagsClient object to access its operations.
     *
     * @return the TagsClient object.
     */
    public TagsClient getTags() {
        return this.tags;
    }

    /** The DeploymentOperationsClient object to access its operations. */
    private final DeploymentOperationsClient deploymentOperations;

    /**
     * Gets the DeploymentOperationsClient object to access its operations.
     *
     * @return the DeploymentOperationsClient object.
     */
    public DeploymentOperationsClient getDeploymentOperations() {
        return this.deploymentOperations;
    }

    /**
     * Initializes an instance of ResourceManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    ResourceManagementClient(
        HttpPipeline httpPipeline, AzureEnvironment environment, String subscriptionId, String endpoint) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2019-08-01";
        this.operations = new OperationsClient(this);
        this.deployments = new DeploymentsClient(this);
        this.providers = new ProvidersClient(this);
        this.resources = new ResourcesClient(this);
        this.resourceGroups = new ResourceGroupsClient(this);
        this.tags = new TagsClient(this);
        this.deploymentOperations = new DeploymentOperationsClient(this);
    }
}
