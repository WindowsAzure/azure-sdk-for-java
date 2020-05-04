// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation;

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
import com.azure.search.documents.implementation.models.ListDataSourcesResult;
import com.azure.search.documents.models.DataSource;
import com.azure.search.documents.models.RequestOptions;
import com.azure.search.documents.models.SearchErrorException;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * DataSources.
 */
public final class DataSourcesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private DataSourcesService service;

    /**
     * The service client containing this operation class.
     */
    private SearchServiceRestClientImpl client;

    /**
     * Initializes an instance of DataSourcesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DataSourcesImpl(SearchServiceRestClientImpl client) {
        this.service = RestProxy.create(DataSourcesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SearchServiceRestClientDataSources to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SearchServiceRestClientDataSources")
    private interface DataSourcesService {
        @Put("datasources('{dataSourceName}')")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<DataSource>> createOrUpdate(@PathParam("dataSourceName") String dataSourceName, @HostParam("endpoint") String endpoint, @BodyParam("application/json; charset=utf-8") DataSource dataSource, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("Prefer") String prefer, @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Delete("datasources('{dataSourceName}')")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> delete(@PathParam("dataSourceName") String dataSourceName, @HostParam("endpoint") String endpoint, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("datasources('{dataSourceName}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<DataSource>> get(@PathParam("dataSourceName") String dataSourceName, @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("datasources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<ListDataSourcesResult>> list(@HostParam("endpoint") String endpoint, @QueryParam("$select") String select, @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Post("datasources")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<DataSource>> create(@HostParam("endpoint") String endpoint, @BodyParam("application/json; charset=utf-8") DataSource dataSource, @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);
    }

    /**
     * Creates a new datasource or updates a datasource if it already exists.
     *
     * @param dataSourceName The name of the datasource to create or update.
     * @param dataSource The definition of the datasource to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DataSource>> createOrUpdateWithRestResponseAsync(String dataSourceName, DataSource dataSource, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String prefer = "return=representation";
        final UUID xMsClientRequestId = null;
        return service.createOrUpdate(dataSourceName, this.client.getEndpoint(), dataSource, ifMatch, ifNoneMatch, prefer, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Creates a new datasource or updates a datasource if it already exists.
     *
     * @param dataSourceName The name of the datasource to create or update.
     * @param dataSource The definition of the datasource to create or update.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the server does not match this value.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DataSource>> createOrUpdateWithRestResponseAsync(String dataSourceName, DataSource dataSource, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final String prefer = "return=representation";
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.createOrUpdate(dataSourceName, this.client.getEndpoint(), dataSource, ifMatch, ifNoneMatch, prefer, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Deletes a datasource.
     *
     * @param dataSourceName The name of the datasource to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithRestResponseAsync(String dataSourceName, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final String ifMatch = null;
        final String ifNoneMatch = null;
        final UUID xMsClientRequestId = null;
        return service.delete(dataSourceName, this.client.getEndpoint(), ifMatch, ifNoneMatch, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Deletes a datasource.
     *
     * @param dataSourceName The name of the datasource to delete.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the server does not match this value.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithRestResponseAsync(String dataSourceName, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.delete(dataSourceName, this.client.getEndpoint(), ifMatch, ifNoneMatch, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Retrieves a datasource definition.
     *
     * @param dataSourceName The name of the datasource to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DataSource>> getWithRestResponseAsync(String dataSourceName, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final UUID xMsClientRequestId = null;
        return service.get(dataSourceName, this.client.getEndpoint(), this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Retrieves a datasource definition.
     *
     * @param dataSourceName The name of the datasource to retrieve.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DataSource>> getWithRestResponseAsync(String dataSourceName, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.get(dataSourceName, this.client.getEndpoint(), this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Lists all datasources available for a search service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListDataSourcesResult>> listWithRestResponseAsync(Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final String select = null;
        final UUID xMsClientRequestId = null;
        return service.list(this.client.getEndpoint(), select, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Lists all datasources available for a search service.
     *
     * @param select Selects which top-level properties of the data sources to retrieve. Specified as a comma-separated list of JSON property names, or '*' for all properties. The default is all properties.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListDataSourcesResult>> listWithRestResponseAsync(String select, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.list(this.client.getEndpoint(), select, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Creates a new datasource.
     *
     * @param dataSource The definition of the datasource to create.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DataSource>> createWithRestResponseAsync(DataSource dataSource, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        final UUID xMsClientRequestId = null;
        return service.create(this.client.getEndpoint(), dataSource, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }

    /**
     * Creates a new datasource.
     *
     * @param dataSource The definition of the datasource to create.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DataSource>> createWithRestResponseAsync(DataSource dataSource, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=minimal";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.create(this.client.getEndpoint(), dataSource, this.client.getApiVersion(), accept, xMsClientRequestId, context);
    }
}
