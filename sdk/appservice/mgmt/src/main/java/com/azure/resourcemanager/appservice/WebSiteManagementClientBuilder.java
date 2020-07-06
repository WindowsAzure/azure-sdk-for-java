// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;

/** A builder for creating a new instance of the WebSiteManagementClient type. */
@ServiceClientBuilder(serviceClients = {WebSiteManagementClient.class})
public final class WebSiteManagementClientBuilder {
    /*
     * Your Azure subscription ID. This is a GUID-formatted string (e.g.
     * 00000000-0000-0000-0000-000000000000).
     */
    private String subscriptionId;

    /**
     * Sets Your Azure subscription ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000).
     *
     * @param subscriptionId the subscriptionId value.
     * @return the WebSiteManagementClientBuilder.
     */
    public WebSiteManagementClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
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
     * @return the WebSiteManagementClientBuilder.
     */
    public WebSiteManagementClientBuilder endpoint(String endpoint) {
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
     * @return the WebSiteManagementClientBuilder.
     */
    public WebSiteManagementClientBuilder environment(AzureEnvironment environment) {
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
     * @return the WebSiteManagementClientBuilder.
     */
    public WebSiteManagementClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of WebSiteManagementClient with the provided parameters.
     *
     * @return an instance of WebSiteManagementClient.
     */
    public WebSiteManagementClient buildClient() {
        if (endpoint == null) {
            this.endpoint = "https://management.azure.com";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (pipeline == null) {
            this.pipeline =
                new HttpPipelineBuilder()
                    .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                    .build();
        }
        WebSiteManagementClient client = new WebSiteManagementClient(pipeline, environment, subscriptionId, endpoint);
        return client;
    }
}
