// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.search.documents.implementation.models.RequestOptions;
import com.azure.search.documents.implementation.models.ServiceStatistics;
import reactor.core.publisher.Mono;

/**
 * A builder for creating a new instance of the SearchServiceRestClient type.
 */
@ServiceClientBuilder(serviceClients = SearchServiceRestClientImpl.class)
public final class SearchServiceRestClientBuilder {
    /*
     * Client Api Version.
     */
    private String apiVersion;

    /**
     * Sets Client Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the SearchServiceRestClientBuilder.
     */
    public SearchServiceRestClientBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The endpoint URL of the search service.
     */
    private String endpoint;

    /**
     * Sets The endpoint URL of the search service.
     *
     * @param endpoint the endpoint value.
     * @return the SearchServiceRestClientBuilder.
     */
    public SearchServiceRestClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
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
     * @return the SearchServiceRestClientBuilder.
     */
    public SearchServiceRestClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of SearchServiceRestClientImpl with the provided parameters.
     *
     * @return an instance of SearchServiceRestClientImpl.
     */
    public SearchServiceRestClientImpl build() {
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        SearchServiceRestClientImpl client = new SearchServiceRestClientImpl(pipeline);
        if (this.apiVersion != null) {
            client.setApiVersion(this.apiVersion);
        }
        if (this.endpoint != null) {
            client.setEndpoint(this.endpoint);
        }
        return client;
    }
}
