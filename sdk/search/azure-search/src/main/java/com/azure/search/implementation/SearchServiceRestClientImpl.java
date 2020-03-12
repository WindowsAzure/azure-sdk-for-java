// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.implementation;
import com.azure.core.http.rest.RestProxy;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.search.models.RequestOptions;
import com.azure.search.models.SearchErrorException;
import com.azure.search.models.ServiceStatistics;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the SearchServiceRestClient type.
 */
public final class SearchServiceRestClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private SearchServiceRestClientService service;

    /**
     * Client Api Version.
     */
    private String apiVersion;

    /**
     * Gets Client Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets Client Api Version.
     *
     * @param apiVersion the apiVersion value.
     */
    SearchServiceRestClientImpl setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * The endpoint URL of the search service.
     */
    private String endpoint;

    /**
     * Gets The endpoint URL of the search service.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Sets The endpoint URL of the search service.
     *
     * @param endpoint the endpoint value.
     */
    SearchServiceRestClientImpl setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The DataSourcesImpl object to access its operations.
     */
    private DataSourcesImpl dataSources;

    /**
     * Gets the DataSourcesImpl object to access its operations.
     *
     * @return the DataSourcesImpl object.
     */
    public DataSourcesImpl dataSources() {
        return this.dataSources;
    }

    /**
     * The IndexersImpl object to access its operations.
     */
    private IndexersImpl indexers;

    /**
     * Gets the IndexersImpl object to access its operations.
     *
     * @return the IndexersImpl object.
     */
    public IndexersImpl indexers() {
        return this.indexers;
    }

    /**
     * The SkillsetsImpl object to access its operations.
     */
    private SkillsetsImpl skillsets;

    /**
     * Gets the SkillsetsImpl object to access its operations.
     *
     * @return the SkillsetsImpl object.
     */
    public SkillsetsImpl skillsets() {
        return this.skillsets;
    }

    /**
     * The SynonymMapsImpl object to access its operations.
     */
    private SynonymMapsImpl synonymMaps;

    /**
     * Gets the SynonymMapsImpl object to access its operations.
     *
     * @return the SynonymMapsImpl object.
     */
    public SynonymMapsImpl synonymMaps() {
        return this.synonymMaps;
    }

    /**
     * The IndexesImpl object to access its operations.
     */
    private IndexesImpl indexes;

    /**
     * Gets the IndexesImpl object to access its operations.
     *
     * @return the IndexesImpl object.
     */
    public IndexesImpl indexes() {
        return this.indexes;
    }

    /**
     * Initializes an instance of SearchServiceRestClient client.
     */
    public SearchServiceRestClientImpl() {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build());
    }

    /**
     * Initializes an instance of SearchServiceRestClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public SearchServiceRestClientImpl(HttpPipeline httpPipeline) {
        this.httpPipeline = httpPipeline;
        this.dataSources = new DataSourcesImpl(this);
        this.indexers = new IndexersImpl(this);
        this.skillsets = new SkillsetsImpl(this);
        this.synonymMaps = new SynonymMapsImpl(this);
        this.indexes = new IndexesImpl(this);
        this.service = RestProxy.create(SearchServiceRestClientService.class, this.httpPipeline);
    }

    /**
     * The interface defining all the services for SearchServiceRestClient to
     * be used by the proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SearchServiceRestClient")
    private interface SearchServiceRestClientService {
        @Get("servicestats")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<ServiceStatistics>> getServiceStatistics(@HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);
    }

    /**
     * Gets service level statistics for a search service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServiceStatistics>> getServiceStatisticsWithRestResponseAsync(Context context) {
        final UUID xMsClientRequestId = null;
        return service.getServiceStatistics(this.getEndpoint(), this.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Gets service level statistics for a search service.
     *
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServiceStatistics>> getServiceStatisticsWithRestResponseAsync(RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.getServiceStatistics(this.getEndpoint(), this.getApiVersion(), xMsClientRequestId, context);
    }
}
