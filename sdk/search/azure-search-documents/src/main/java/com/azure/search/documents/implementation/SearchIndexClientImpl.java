// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/** Initializes a new instance of the SearchIndexClient type. */
public final class SearchIndexClientImpl {
    /** The endpoint URL of the search service. */
    private final String endpoint;

    /**
     * Gets The endpoint URL of the search service.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The name of the index. */
    private final String indexName;

    /**
     * Gets The name of the index.
     *
     * @return the indexName value.
     */
    public String getIndexName() {
        return this.indexName;
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

    /** The DocumentsImpl object to access its operations. */
    private final DocumentsImpl documents;

    /**
     * Gets the DocumentsImpl object to access its operations.
     *
     * @return the DocumentsImpl object.
     */
    public DocumentsImpl getDocuments() {
        return this.documents;
    }

    /** Initializes an instance of SearchIndexClient client. */
    SearchIndexClientImpl(String endpoint, String indexName) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                endpoint,
                indexName);
    }

    /**
     * Initializes an instance of SearchIndexClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    SearchIndexClientImpl(HttpPipeline httpPipeline, String endpoint, String indexName) {
        this.httpPipeline = httpPipeline;
        this.endpoint = endpoint;
        this.indexName = indexName;
        this.apiVersion = "2020-06-30";
        this.documents = new DocumentsImpl(this);
    }
}
