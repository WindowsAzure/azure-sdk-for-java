// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.signalr.implementation.client;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/**
 * A builder for creating a new instance of the AzureWebSocketServiceRestAPI type.
 */
@ServiceClientBuilder(serviceClients = {AzureWebSocketServiceRestAPI.class})
public final class AzureWebSocketServiceRestAPIBuilder {
    /*
     * server parameter
     */
    private String host;

    /**
     * Sets server parameter.
     * 
     * @param host the host value.
     * @return the AzureWebSocketServiceRestAPIBuilder.
     */
    public AzureWebSocketServiceRestAPIBuilder host(String host) {
        this.host = host;
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
     * @return the AzureWebSocketServiceRestAPIBuilder.
     */
    public AzureWebSocketServiceRestAPIBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AzureWebSocketServiceRestAPI with the provided parameters.
     * 
     * @return an instance of AzureWebSocketServiceRestAPI.
     */
    public AzureWebSocketServiceRestAPI buildClient() {
        if (host == null) {
            this.host = "";
        }
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        AzureWebSocketServiceRestAPI client = new AzureWebSocketServiceRestAPI(pipeline);
        client.setHost(this.host);
        return client;
    }
}
