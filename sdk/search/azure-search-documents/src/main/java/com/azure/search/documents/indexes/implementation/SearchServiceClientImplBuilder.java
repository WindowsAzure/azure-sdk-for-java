// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** A builder for creating a new instance of the SearchServiceClient type. */
@ServiceClientBuilder(serviceClients = {SearchServiceClientImpl.class})
public final class SearchServiceClientImplBuilder {
    /*
     * The endpoint URL of the search service.
     */
    private String endpoint;

    /**
     * Sets The endpoint URL of the search service.
     *
     * @param endpoint the endpoint value.
     * @return the SearchServiceClientImplBuilder.
     */
    public SearchServiceClientImplBuilder endpoint(String endpoint) {
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
     * @return the SearchServiceClientImplBuilder.
     */
    public SearchServiceClientImplBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of SearchServiceClientImpl with the provided parameters.
     *
     * @return an instance of SearchServiceClientImpl.
     */
    public SearchServiceClientImpl buildClient() {
        if (pipeline == null) {
            this.pipeline =
                    new HttpPipelineBuilder()
                            .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                            .build();
        }

        SearchServiceClientImpl client = new SearchServiceClientImpl(pipeline, endpoint);
        return client;
    }
}
