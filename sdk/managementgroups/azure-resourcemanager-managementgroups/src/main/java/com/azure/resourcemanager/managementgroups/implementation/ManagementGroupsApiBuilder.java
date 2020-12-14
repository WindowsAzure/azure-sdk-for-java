// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.implementation;

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

/** A builder for creating a new instance of the ManagementGroupsApiImpl type. */
@ServiceClientBuilder(serviceClients = {ManagementGroupsApiImpl.class})
public final class ManagementGroupsApiBuilder {
    /*
     * Number of entities to skip over when retrieving results. Passing this in
     * will override $skipToken.
     */
    private int skip;

    /**
     * Sets Number of entities to skip over when retrieving results. Passing this in will override $skipToken.
     *
     * @param skip the skip value.
     * @return the ManagementGroupsApiBuilder.
     */
    public ManagementGroupsApiBuilder skip(int skip) {
        this.skip = skip;
        return this;
    }

    /*
     * Number of elements to return when retrieving results. Passing this in
     * will override $skipToken.
     */
    private int top;

    /**
     * Sets Number of elements to return when retrieving results. Passing this in will override $skipToken.
     *
     * @param top the top value.
     * @return the ManagementGroupsApiBuilder.
     */
    public ManagementGroupsApiBuilder top(int top) {
        this.top = top;
        return this;
    }

    /*
     * Page continuation token is only used if a previous operation returned a
     * partial result.
     * If a previous response contains a nextLink element, the value of the
     * nextLink element will include a token parameter that specifies a
     * starting point to use for subsequent calls.
     *
     */
    private String skiptoken;

    /**
     * Sets Page continuation token is only used if a previous operation returned a partial result. If a previous
     * response contains a nextLink element, the value of the nextLink element will include a token parameter that
     * specifies a starting point to use for subsequent calls.
     *
     * @param skiptoken the skiptoken value.
     * @return the ManagementGroupsApiBuilder.
     */
    public ManagementGroupsApiBuilder skiptoken(String skiptoken) {
        this.skiptoken = skiptoken;
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
     * @return the ManagementGroupsApiBuilder.
     */
    public ManagementGroupsApiBuilder endpoint(String endpoint) {
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
     * @return the ManagementGroupsApiBuilder.
     */
    public ManagementGroupsApiBuilder environment(AzureEnvironment environment) {
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
     * @return the ManagementGroupsApiBuilder.
     */
    public ManagementGroupsApiBuilder defaultPollInterval(Duration defaultPollInterval) {
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
     * @return the ManagementGroupsApiBuilder.
     */
    public ManagementGroupsApiBuilder pipeline(HttpPipeline pipeline) {
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
     * @return the ManagementGroupsApiBuilder.
     */
    public ManagementGroupsApiBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /**
     * Builds an instance of ManagementGroupsApiImpl with the provided parameters.
     *
     * @return an instance of ManagementGroupsApiImpl.
     */
    public ManagementGroupsApiImpl buildClient() {
        if (endpoint == null) {
            this.endpoint = "https://management.azure.com";
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
        ManagementGroupsApiImpl client =
            new ManagementGroupsApiImpl(
                pipeline, serializerAdapter, defaultPollInterval, environment, skip, top, skiptoken, endpoint);
        return client;
    }
}
