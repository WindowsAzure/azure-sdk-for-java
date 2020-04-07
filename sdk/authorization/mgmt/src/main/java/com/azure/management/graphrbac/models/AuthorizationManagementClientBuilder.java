// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
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
 * A builder for creating a new instance of the AuthorizationManagementClientImpl type.
 */
@ServiceClientBuilder(serviceClients = {AuthorizationManagementClientImpl.class})
public final class AuthorizationManagementClientBuilder {
    /*
     * The ID of the target subscription.
     */
    private String subscriptionId;

    /**
     * Sets The ID of the target subscription.
     * 
     * @param subscriptionId the subscriptionId value.
     * @return the AuthorizationManagementClientBuilder.
     */
    public AuthorizationManagementClientBuilder subscriptionId(String subscriptionId) {
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
     * @return the AuthorizationManagementClientBuilder.
     */
    public AuthorizationManagementClientBuilder host(String host) {
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
     * @return the AuthorizationManagementClientBuilder.
     */
    public AuthorizationManagementClientBuilder environment(AzureEnvironment environment) {
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
     * @return the AuthorizationManagementClientBuilder.
     */
    public AuthorizationManagementClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AuthorizationManagementClientImpl with the provided parameters.
     * 
     * @return an instance of AuthorizationManagementClientImpl.
     */
    public AuthorizationManagementClientImpl build() {
        if (host == null) {
            this.host = "https://management.azure.com";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        AuthorizationManagementClientImpl client = new AuthorizationManagementClientImpl(pipeline, environment);
        client.setSubscriptionId(this.subscriptionId);
        client.setHost(this.host);
        return client;
    }
}
