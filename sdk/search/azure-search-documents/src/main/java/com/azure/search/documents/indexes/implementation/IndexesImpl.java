// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.search.documents.indexes.implementation.models.AnalyzeRequest;
import com.azure.search.documents.indexes.implementation.models.AnalyzeResult;
import com.azure.search.documents.indexes.implementation.models.GetIndexStatisticsResult;
import com.azure.search.documents.indexes.implementation.models.ListIndexesResult;
import com.azure.search.documents.indexes.implementation.models.RequestOptions;
import com.azure.search.documents.indexes.implementation.models.SearchErrorException;
import com.azure.search.documents.indexes.implementation.models.SearchIndex;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Indexes.
 */
public final class IndexesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private IndexesService service;

    /**
     * The service client containing this operation class.
     */
    private SearchServiceRestClientImpl client;

    /**
     * Initializes an instance of IndexesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public IndexesImpl(SearchServiceRestClientImpl client) {
        this.service = RestProxy.create(IndexesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SearchServiceRestClientIndexes to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SearchServiceRestClientIndexes")
    private interface IndexesService {
        @Post("indexes")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<SearchIndex>> create(@HostParam("endpoint") String endpoint, @BodyParam("application/json; charset=utf-8") SearchIndex index, @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("indexes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<ListIndexesResult>> list(@HostParam("endpoint") String endpoint, @QueryParam("$select") String select, @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Put("indexes('{indexName}')")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<SearchIndex>> createOrUpdate(@PathParam("indexName") String indexName, @HostParam("endpoint") String endpoint, @BodyParam("application/json; charset=utf-8") SearchIndex index, @QueryParam("allowIndexDowntime") Boolean allowIndexDowntime, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("Prefer") String prefer, @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Delete("indexes('{indexName}')")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> delete(@PathParam("indexName") String indexName, @HostParam("endpoint") String endpoint, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("indexes('{indexName}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<SearchIndex>> get(@PathParam("indexName") String indexName, @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("indexes('{indexName}')/search.stats")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<GetIndexStatisticsResult>> getStatistics(@PathParam("indexName") String indexName, @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Post("indexes('{indexName}')/search.analyze")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<AnalyzeResult>> analyze(@PathParam("indexName") String indexName, @HostParam("endpoint") String endpoint, @BodyParam("application/json; charset=utf-8") AnalyzeRequest request, @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);
    }

    /**
     * Creates a new search index.
     *
     * @param index The definition of the index to create.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SearchIndex>> createWithRestResponseAsync(SearchIndex index, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final UUID xMsClientRequestId = null;
        return service.create(this.client.getEndpoint(), index, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Creates a new search index.
     *
     * @param index The definition of the index to create.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SearchIndex>> createWithRestResponseAsync(SearchIndex index, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.create(this.client.getEndpoint(), index, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Lists all indexes available for a search service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListIndexesResult>> listWithRestResponseAsync(Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final String select = null;
        final UUID xMsClientRequestId = null;
        return service.list(this.client.getEndpoint(), select, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Lists all indexes available for a search service.
     *
     * @param select Selects which top-level properties of the index definitions to retrieve. Specified as a comma-separated list of JSON property names, or '*' for all properties. The default is all properties.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListIndexesResult>> listWithRestResponseAsync(String select, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.list(this.client.getEndpoint(), select, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Creates a new search index or updates an index if it already exists.
     *
     * @param indexName The definition of the index to create or update.
     * @param index The definition of the index to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SearchIndex>> createOrUpdateWithRestResponseAsync(String indexName, SearchIndex index, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final Boolean allowIndexDowntime = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String prefer = "return=representation";
        final UUID xMsClientRequestId = null;
        return service.createOrUpdate(indexName, this.client.getEndpoint(), index, allowIndexDowntime, ifMatch, ifNoneMatch, prefer, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Creates a new search index or updates an index if it already exists.
     *
     * @param indexName The definition of the index to create or update.
     * @param index The definition of the index to create or update.
     * @param allowIndexDowntime Allows new analyzers, tokenizers, token filters, or char filters to be added to an index by taking the index offline for at least a few seconds. This temporarily causes indexing and query requests to fail. Performance and write availability of the index can be impaired for several minutes after the index is updated, or longer for very large indexes.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the server does not match this value.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SearchIndex>> createOrUpdateWithRestResponseAsync(String indexName, SearchIndex index, Boolean allowIndexDowntime, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final String prefer = "return=representation";
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.createOrUpdate(indexName, this.client.getEndpoint(), index, allowIndexDowntime, ifMatch, ifNoneMatch, prefer, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Deletes a search index and all the documents it contains. This operation is permanent, with no recovery option. Make sure you have a master copy of your index definition, data ingestion code, and a backup of the primary data source in case you need to re-build the index.
     *
     * @param indexName The name of the index to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithRestResponseAsync(String indexName, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final String ifMatch = null;
        final String ifNoneMatch = null;
        final UUID xMsClientRequestId = null;
        return service.delete(indexName, this.client.getEndpoint(), ifMatch, ifNoneMatch, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Deletes a search index and all the documents it contains. This operation is permanent, with no recovery option. Make sure you have a master copy of your index definition, data ingestion code, and a backup of the primary data source in case you need to re-build the index.
     *
     * @param indexName The name of the index to delete.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the server does not match this value.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithRestResponseAsync(String indexName, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.delete(indexName, this.client.getEndpoint(), ifMatch, ifNoneMatch, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Retrieves an index definition.
     *
     * @param indexName The name of the index to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SearchIndex>> getWithRestResponseAsync(String indexName, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final UUID xMsClientRequestId = null;
        return service.get(indexName, this.client.getEndpoint(), this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Retrieves an index definition.
     *
     * @param indexName The name of the index to retrieve.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SearchIndex>> getWithRestResponseAsync(String indexName, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.get(indexName, this.client.getEndpoint(), this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Returns statistics for the given index, including a document count and storage usage.
     *
     * @param indexName The name of the index for which to retrieve statistics.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<GetIndexStatisticsResult>> getStatisticsWithRestResponseAsync(String indexName, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final UUID xMsClientRequestId = null;
        return service.getStatistics(indexName, this.client.getEndpoint(), this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Returns statistics for the given index, including a document count and storage usage.
     *
     * @param indexName The name of the index for which to retrieve statistics.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<GetIndexStatisticsResult>> getStatisticsWithRestResponseAsync(String indexName, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.getStatistics(indexName, this.client.getEndpoint(), this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Shows how an analyzer breaks text into tokens.
     *
     * @param indexName The name of the index for which to test an analyzer.
     * @param request The text and analyzer or analysis components to test.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AnalyzeResult>> analyzeWithRestResponseAsync(String indexName, AnalyzeRequest request, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final UUID xMsClientRequestId = null;
        return service.analyze(indexName, this.client.getEndpoint(), request, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Shows how an analyzer breaks text into tokens.
     *
     * @param indexName The name of the index for which to test an analyzer.
     * @param request The text and analyzer or analysis components to test.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AnalyzeResult>> analyzeWithRestResponseAsync(String indexName, AnalyzeRequest request, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.analyze(indexName, this.client.getEndpoint(), request, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }
}
