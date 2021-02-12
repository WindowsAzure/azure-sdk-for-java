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
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
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

/** An instance of this class provides access to all the operations defined in Indexes. */
public final class IndexesImpl {
    /** The proxy service used to perform REST calls. */
    private final IndexesService service;

    /** The service client containing this operation class. */
    private final SearchServiceClientImpl client;

    /**
     * Initializes an instance of IndexesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    IndexesImpl(SearchServiceClientImpl client) {
        this.service = RestProxy.create(IndexesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SearchServiceClientIndexes to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SearchServiceClientI")
    public interface IndexesService {
        @Post("/indexes")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndex>> create(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") SearchIndex index,
                Context context);

        @Get("/indexes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<ListIndexesResult>> list(
                @HostParam("endpoint") String endpoint,
                @QueryParam("$select") String select,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/indexes('{indexName}')")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndex>> createOrUpdate(
                @HostParam("endpoint") String endpoint,
                @PathParam("indexName") String indexName,
                @QueryParam("allowIndexDowntime") Boolean allowIndexDowntime,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("Prefer") String prefer,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") SearchIndex index,
                Context context);

        @Delete("/indexes('{indexName}')")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> delete(
                @HostParam("endpoint") String endpoint,
                @PathParam("indexName") String indexName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/indexes('{indexName}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndex>> get(
                @HostParam("endpoint") String endpoint,
                @PathParam("indexName") String indexName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/indexes('{indexName}')/search.stats")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<GetIndexStatisticsResult>> getStatistics(
                @HostParam("endpoint") String endpoint,
                @PathParam("indexName") String indexName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/indexes('{indexName}')/search.analyze")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<AnalyzeResult>> analyze(
                @HostParam("endpoint") String endpoint,
                @PathParam("indexName") String indexName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") AnalyzeRequest request,
                Context context);
    }

    /**
     * Creates a new search index.
     *
     * @param index The definition of the index to create.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a search index definition, which describes the fields and search behavior of an index.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndex>> createWithResponseAsync(
            SearchIndex index, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.create(
                this.client.getEndpoint(), xMsClientRequestId, this.client.getApiVersion(), accept, index, context);
    }

    /**
     * Lists all indexes available for a search service.
     *
     * @param select Selects which top-level properties of the index definitions to retrieve. Specified as a
     *     comma-separated list of JSON property names, or '*' for all properties. The default is all properties.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response from a List Indexes request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SearchIndex>> listSinglePageAsync(
            String select, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.list(
                        this.client.getEndpoint(),
                        select,
                        xMsClientRequestId,
                        this.client.getApiVersion(),
                        accept,
                        context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getIndexes(),
                                        null,
                                        null));
    }

    /**
     * Creates a new search index or updates an index if it already exists.
     *
     * @param indexName The definition of the index to create or update.
     * @param index The definition of the index to create or update.
     * @param allowIndexDowntime Allows new analyzers, tokenizers, token filters, or char filters to be added to an
     *     index by taking the index offline for at least a few seconds. This temporarily causes indexing and query
     *     requests to fail. Performance and write availability of the index can be impaired for several minutes after
     *     the index is updated, or longer for very large indexes.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     *     matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     *     server does not match this value.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a search index definition, which describes the fields and search behavior of an index.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndex>> createOrUpdateWithResponseAsync(
            String indexName,
            SearchIndex index,
            Boolean allowIndexDowntime,
            String ifMatch,
            String ifNoneMatch,
            RequestOptions requestOptions,
            Context context) {
        final String prefer = "return=representation";
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.createOrUpdate(
                this.client.getEndpoint(),
                indexName,
                allowIndexDowntime,
                xMsClientRequestId,
                ifMatch,
                ifNoneMatch,
                prefer,
                this.client.getApiVersion(),
                accept,
                index,
                context);
    }

    /**
     * Deletes a search index and all the documents it contains. This operation is permanent, with no recovery option.
     * Make sure you have a master copy of your index definition, data ingestion code, and a backup of the primary data
     * source in case you need to re-build the index.
     *
     * @param indexName The name of the index to delete.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     *     matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     *     server does not match this value.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String indexName, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.delete(
                this.client.getEndpoint(),
                indexName,
                xMsClientRequestId,
                ifMatch,
                ifNoneMatch,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Retrieves an index definition.
     *
     * @param indexName The name of the index to retrieve.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a search index definition, which describes the fields and search behavior of an index.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndex>> getWithResponseAsync(
            String indexName, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.get(
                this.client.getEndpoint(), indexName, xMsClientRequestId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Returns statistics for the given index, including a document count and storage usage.
     *
     * @param indexName The name of the index for which to retrieve statistics.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return statistics for a given index.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<GetIndexStatisticsResult>> getStatisticsWithResponseAsync(
            String indexName, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.getStatistics(
                this.client.getEndpoint(), indexName, xMsClientRequestId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Shows how an analyzer breaks text into tokens.
     *
     * @param indexName The name of the index for which to test an analyzer.
     * @param request The text and analyzer or analysis components to test.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of testing an analyzer on text.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AnalyzeResult>> analyzeWithResponseAsync(
            String indexName, AnalyzeRequest request, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.analyze(
                this.client.getEndpoint(),
                indexName,
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                request,
                context);
    }
}
