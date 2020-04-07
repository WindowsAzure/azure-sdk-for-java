// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;

/**
 * A builder for creating a new instance of the GraphRbacManagementClientImpl type.
 */
@ServiceClientBuilder(serviceClients = {GraphRbacManagementClientImpl.class})
public final class GraphRbacManagementClientBuilder {
    /*
     * The tenant ID.
     */
    private String tenantID;

    /**
     * Sets The tenant ID.
     * 
     * @param tenantID the tenantID value.
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder tenantID(String tenantID) {
        this.tenantID = tenantID;
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
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * Api Version
     */
    private String apiVersion;

    /**
     * Sets Api Version.
     * 
     * @param apiVersion the apiVersion value.
     * @return the GraphRbacManagementClientBuilder.
     */
    public GraphRbacManagementClientBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
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

    /**
     * Builds an instance of GraphRbacManagementClientImpl with the provided parameters.
     * 
     * @return an instance of GraphRbacManagementClientImpl.
     */
    public GraphRbacManagementClientImpl build() {
        if (host == null) {
            this.host = "https://graph.windows.net";
        }
        if (apiVersion == null) {
            this.apiVersion = "1.6";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        GraphRbacManagementClientImpl client = new GraphRbacManagementClientImpl(pipeline, environment);
        client.setTenantID(this.tenantID);
        client.setHost(this.host);
        client.setApiVersion(this.apiVersion);
        return client;
    }
}
