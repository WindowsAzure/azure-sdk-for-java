// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.webpubsub.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the AzureWebPubSubServiceRestAPI type. */
public final class AzureWebPubSubServiceRestAPIImpl {
    /** server parameter. */
    private final String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
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

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The HealthApisImpl object to access its operations. */
    private final HealthApisImpl healthApis;

    /**
     * Gets the HealthApisImpl object to access its operations.
     *
     * @return the HealthApisImpl object.
     */
    public HealthApisImpl getHealthApis() {
        return this.healthApis;
    }

    /** The WebPubSubsImpl object to access its operations. */
    private final WebPubSubsImpl webPubSubs;

    /**
     * Gets the WebPubSubsImpl object to access its operations.
     *
     * @return the WebPubSubsImpl object.
     */
    public WebPubSubsImpl getWebPubSubs() {
        return this.webPubSubs;
    }

    /**
     * Initializes an instance of AzureWebPubSubServiceRestAPI client.
     *
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    public AzureWebPubSubServiceRestAPIImpl(String host, String apiVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                host,
                apiVersion);
    }

    /**
     * Initializes an instance of AzureWebPubSubServiceRestAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    public AzureWebPubSubServiceRestAPIImpl(HttpPipeline httpPipeline, String host, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), host, apiVersion);
    }

    /**
     * Initializes an instance of AzureWebPubSubServiceRestAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    public AzureWebPubSubServiceRestAPIImpl(
            HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String host, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.host = host;
        this.apiVersion = apiVersion;
        this.healthApis = new HealthApisImpl(this);
        this.webPubSubs = new WebPubSubsImpl(this);
    }
}
