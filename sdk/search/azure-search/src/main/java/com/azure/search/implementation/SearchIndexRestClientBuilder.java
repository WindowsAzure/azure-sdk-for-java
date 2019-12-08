// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * A builder for creating a new instance of the SearchIndexRestClient type.
 */
@ServiceClientBuilder(serviceClients = SearchIndexRestClientImpl.class)
public final class SearchIndexRestClientBuilder {
    /*
     * Client Api Version.
     */
    private String apiVersion;

    /**
     * Sets Client Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the SearchIndexRestClientBuilder.
     */
    public SearchIndexRestClientBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The name of the search service.
     */
    private String searchServiceName;

    /**
     * Sets The name of the search service.
     *
     * @param searchServiceName the searchServiceName value.
     * @return the SearchIndexRestClientBuilder.
     */
    public SearchIndexRestClientBuilder searchServiceName(String searchServiceName) {
        this.searchServiceName = searchServiceName;
        return this;
    }

    /*
     * The DNS suffix of the search service. The default is search.windows.net.
     */
    private String searchDnsSuffix;

    /**
     * Sets The DNS suffix of the search service. The default is search.windows.net.
     *
     * @param searchDnsSuffix the searchDnsSuffix value.
     * @return the SearchIndexRestClientBuilder.
     */
    public SearchIndexRestClientBuilder searchDnsSuffix(String searchDnsSuffix) {
        this.searchDnsSuffix = searchDnsSuffix;
        return this;
    }

    /*
     * The name of the index.
     */
    private String indexName;

    /**
     * Sets The name of the index.
     *
     * @param indexName the indexName value.
     * @return the SearchIndexRestClientBuilder.
     */
    public SearchIndexRestClientBuilder indexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /*
     * The serializer to use for requests
     */
    private SerializerAdapter serializer;

    /**
     * Sets The serializer to use for requests.
     *
     * @param serializer the serializer value.
     * @return the SearchIndexRestClientBuilder.
     */
    public SearchIndexRestClientBuilder serializer(SerializerAdapter serializer) {
        this.serializer = serializer;
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
     * @return the SearchIndexRestClientBuilder.
     */
    public SearchIndexRestClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of SearchIndexRestClientImpl with the provided parameters.
     *
     * @return an instance of SearchIndexRestClientImpl.
     */
    public SearchIndexRestClientImpl build() {
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        if (serializer == null) {
            this.serializer = JacksonAdapter.createDefaultSerializerAdapter();
        }
        SearchIndexRestClientImpl client = new SearchIndexRestClientImpl(pipeline, serializer);
        if (this.apiVersion != null) {
            client.setApiVersion(this.apiVersion);
        }
        if (this.searchServiceName != null) {
            client.setSearchServiceName(this.searchServiceName);
        }
        if (this.searchDnsSuffix != null) {
            client.setSearchDnsSuffix(this.searchDnsSuffix);
        } else {
            client.setSearchDnsSuffix("search.windows.net");
        }
        if (this.indexName != null) {
            client.setIndexName(this.indexName);
        }
        return client;
    }
}
