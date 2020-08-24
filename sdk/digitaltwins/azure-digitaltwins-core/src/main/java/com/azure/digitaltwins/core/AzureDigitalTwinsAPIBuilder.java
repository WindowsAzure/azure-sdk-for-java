// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** A builder for creating a new instance of the AzureDigitalTwinsAPI type. */
@ServiceClientBuilder(serviceClients = {AzureDigitalTwinsAPI.class})
public final class AzureDigitalTwinsAPIBuilder {
    /*
     * server parameter
     */
    private String host;

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the AzureDigitalTwinsAPIBuilder.
     */
    public AzureDigitalTwinsAPIBuilder host(String host) {
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
     * @return the AzureDigitalTwinsAPIBuilder.
     */
    public AzureDigitalTwinsAPIBuilder pipeline(HttpPipeline pipeline) {
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
     * @return the AzureDigitalTwinsAPIBuilder.
     */
    public AzureDigitalTwinsAPIBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /**
     * Builds an instance of AzureDigitalTwinsAPI with the provided parameters.
     *
     * @return an instance of AzureDigitalTwinsAPI.
     */
    public AzureDigitalTwinsAPI buildClient() {
        if (host == null) {
            this.host = "https://digitaltwins-name.digitaltwins.azure.net";
        }
        if (pipeline == null) {
            this.pipeline =
                    new HttpPipelineBuilder()
                            .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                            .build();
        }
        if (serializerAdapter == null) {
            this.serializerAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        }
        AzureDigitalTwinsAPI client = new AzureDigitalTwinsAPI(pipeline, serializerAdapter, host);
        return client;
    }
}
