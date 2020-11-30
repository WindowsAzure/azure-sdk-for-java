// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerAdapter;
import java.time.Duration;

/** A builder for creating a new instance of the GraphRbacManagementClientImpl type. */
@ServiceClientBuilder(serviceClients = {GraphRbacManagementClientImpl.class})
public final class GraphRbacManagementClientBuilder {
    /*
     * The tenant ID.
     */
    private String tenantId;

    /**
     * Sets The tenant ID.
     *
     * @param tenantId the tenantId value.
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /*
     * server parameter
     */
    private String endpoint;

    /**
     * Sets server parameter.
     *
     * @param endpoint the endpoint value.
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
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
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The default poll interval for long-running operation
     */
    private Duration defaultPollInterval;

    /**
     * Sets The default poll interval for long-running operation.
     *
     * @param defaultPollInterval the defaultPollInterval value.
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder defaultPollInterval(Duration defaultPollInterval) {
        this.defaultPollInterval = defaultPollInterval;
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
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializerAdapter the serializerAdapter value.
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /**
     * Builds an instance of GraphRbacManagementClientImpl with the provided parameters.
     *
     * @return an instance of GraphRbacManagementClientImpl.
     */
    public GraphRbacManagementClientImpl buildClient() {
        if (endpoint == null) {
            this.endpoint = "https://graph.windows.net";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (defaultPollInterval == null) {
            this.defaultPollInterval = Duration.ofSeconds(30);
        }
        if (pipeline == null) {
            this.pipeline =
                new HttpPipelineBuilder()
                    .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                    .build();
        }
        if (serializerAdapter == null) {
            this.serializerAdapter = SerializerFactory.createDefaultManagementSerializerAdapter();
        }
        GraphRbacManagementClientImpl client =
            new GraphRbacManagementClientImpl(
                pipeline, serializerAdapter, defaultPollInterval, environment, tenantId, endpoint);
        return client;
    }
}
