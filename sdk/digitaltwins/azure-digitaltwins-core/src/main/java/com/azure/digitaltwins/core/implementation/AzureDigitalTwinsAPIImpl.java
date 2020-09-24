// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the AzureDigitalTwinsAPI type. */
public final class AzureDigitalTwinsAPIImpl {
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

    /** The DigitalTwinModelsImpl object to access its operations. */
    private final DigitalTwinModelsImpl digitalTwinModels;

    /**
     * Gets the DigitalTwinModelsImpl object to access its operations.
     *
     * @return the DigitalTwinModelsImpl object.
     */
    public DigitalTwinModelsImpl getDigitalTwinModels() {
        return this.digitalTwinModels;
    }

    /** The QueriesImpl object to access its operations. */
    private final QueriesImpl queries;

    /**
     * Gets the QueriesImpl object to access its operations.
     *
     * @return the QueriesImpl object.
     */
    public QueriesImpl getQueries() {
        return this.queries;
    }

    /** The DigitalTwinsImpl object to access its operations. */
    private final DigitalTwinsImpl digitalTwins;

    /**
     * Gets the DigitalTwinsImpl object to access its operations.
     *
     * @return the DigitalTwinsImpl object.
     */
    public DigitalTwinsImpl getDigitalTwins() {
        return this.digitalTwins;
    }

    /** The EventRoutesImpl object to access its operations. */
    private final EventRoutesImpl eventRoutes;

    /**
     * Gets the EventRoutesImpl object to access its operations.
     *
     * @return the EventRoutesImpl object.
     */
    public EventRoutesImpl getEventRoutes() {
        return this.eventRoutes;
    }

    /** Initializes an instance of AzureDigitalTwinsAPI client. */
    AzureDigitalTwinsAPIImpl(String host) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                host);
    }

    /**
     * Initializes an instance of AzureDigitalTwinsAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    AzureDigitalTwinsAPIImpl(HttpPipeline httpPipeline, String host) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), host);
    }

    /**
     * Initializes an instance of AzureDigitalTwinsAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     */
    AzureDigitalTwinsAPIImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String host) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.host = host;
        this.apiVersion = "2020-05-31-preview";
        this.digitalTwinModels = new DigitalTwinModelsImpl(this);
        this.queries = new QueriesImpl(this);
        this.digitalTwins = new DigitalTwinsImpl(this);
        this.eventRoutes = new EventRoutesImpl(this);
    }
}
