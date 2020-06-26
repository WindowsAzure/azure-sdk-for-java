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
import com.azure.core.util.Context;
import com.azure.search.documents.indexes.implementation.models.ListDataSourcesResult;
import com.azure.search.documents.indexes.implementation.models.RequestOptions;
import com.azure.search.documents.indexes.implementation.models.SearchErrorException;
import com.azure.search.documents.indexes.implementation.models.SearchIndexerDataSource;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DataSources. */
public final class DataSourcesImpl {
    /** The proxy service used to perform REST calls. */
    private final DataSourcesService service;

    /** The service client containing this operation class. */
    private final SearchServiceClientImpl client;

    /**
     * Initializes an instance of DataSourcesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DataSourcesImpl(SearchServiceClientImpl client) {
        this.service = RestProxy.create(DataSourcesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for SearchServiceClientDataSources to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SearchServiceClientD")
    private interface DataSourcesService {
        @Put("/datasources('{dataSourceName}')")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndexerDataSource>> createOrUpdate(
                @HostParam("endpoint") String endpoint,
                @PathParam("dataSourceName") String dataSourceName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("Prefer") String prefer,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") SearchIndexerDataSource dataSource,
                Context context);

        @Delete("/datasources('{dataSourceName}')")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> delete(
                @HostParam("endpoint") String endpoint,
                @PathParam("dataSourceName") String dataSourceName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                Context context);

        @Get("/datasources('{dataSourceName}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndexerDataSource>> get(
                @HostParam("endpoint") String endpoint,
                @PathParam("dataSourceName") String dataSourceName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                Context context);

        @Get("/datasources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<ListDataSourcesResult>> list(
                @HostParam("endpoint") String endpoint,
                @QueryParam("$select") String select,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                Context context);

        @Post("/datasources")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndexerDataSource>> create(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") SearchIndexerDataSource dataSource,
                Context context);
    }

    /**
     * Creates a new datasource or updates a datasource if it already exists.
     *
     * @param dataSourceName The name of the datasource to create or update.
     * @param dataSource Represents a datasource definition, which can be used to configure an indexer.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     *     matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     *     server does not match this value.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a datasource definition, which can be used to configure an indexer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndexerDataSource>> createOrUpdateWithResponseAsync(
            String dataSourceName,
            SearchIndexerDataSource dataSource,
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
                dataSourceName,
                xMsClientRequestId,
                ifMatch,
                ifNoneMatch,
                prefer,
                this.client.getApiVersion(),
                accept,
                dataSource,
                context);
    }

    /**
     * Deletes a datasource.
     *
     * @param dataSourceName The name of the datasource to delete.
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
            String dataSourceName, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.delete(
                this.client.getEndpoint(),
                dataSourceName,
                xMsClientRequestId,
                ifMatch,
                ifNoneMatch,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Retrieves a datasource definition.
     *
     * @param dataSourceName The name of the datasource to retrieve.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a datasource definition, which can be used to configure an indexer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndexerDataSource>> getWithResponseAsync(
            String dataSourceName, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.get(
                this.client.getEndpoint(),
                dataSourceName,
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Lists all datasources available for a search service.
     *
     * @param select Selects which top-level properties of the data sources to retrieve. Specified as a comma-separated
     *     list of JSON property names, or '*' for all properties. The default is all properties.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response from a List Datasources request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ListDataSourcesResult>> listWithResponseAsync(
            String select, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.list(
                this.client.getEndpoint(), select, xMsClientRequestId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Creates a new datasource.
     *
     * @param dataSource Represents a datasource definition, which can be used to configure an indexer.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a datasource definition, which can be used to configure an indexer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndexerDataSource>> createWithResponseAsync(
            SearchIndexerDataSource dataSource, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.create(
                this.client.getEndpoint(),
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                dataSource,
                context);
    }
}
