// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;

/**
 * A builder for creating a new instance of the ContainerRegistryManagementClientImpl type.
 */
@ServiceClientBuilder(serviceClients = {ContainerRegistryManagementClientImpl.class})
public final class ContainerRegistryManagementClientBuilder {
    /*
     * The Microsoft Azure subscription ID.
     */
    private String subscriptionId;

    /**
     * Sets The Microsoft Azure subscription ID.
     * 
     * @param subscriptionId the subscriptionId value.
     * @return the ContainerRegistryManagementClientBuilder.
     */
    public ContainerRegistryManagementClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /*
     * server parameter
     */
    private String host;

    /**
     * Sets server parameter.
     * 
     * @param host the host value.
     * @return the ContainerRegistryManagementClientBuilder.
     */
    public ContainerRegistryManagementClientBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     * 
     * @param environment the environment value.
     * @return the ContainerRegistryManagementClientBuilder.
     */
    public ContainerRegistryManagementClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     * 
     * @param pipeline the pipeline value.
     * @return the ContainerRegistryManagementClientBuilder.
     */
    public ContainerRegistryManagementClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of ContainerRegistryManagementClientImpl with the provided parameters.
     * 
     * @return an instance of ContainerRegistryManagementClientImpl.
     */
    public ContainerRegistryManagementClientImpl build() {
        if (host == null) {
            this.host = "https://management.azure.com";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        ContainerRegistryManagementClientImpl client = new ContainerRegistryManagementClientImpl(pipeline, environment);
        client.setSubscriptionId(this.subscriptionId);
        client.setHost(this.host);
        return client;
    }
}
