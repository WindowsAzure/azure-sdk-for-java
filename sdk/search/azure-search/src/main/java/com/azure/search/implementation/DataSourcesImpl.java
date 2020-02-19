// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.implementation;

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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.search.models.AccessCondition;
import com.azure.search.models.DataSource;
import com.azure.search.models.ListDataSourcesResult;
import com.azure.search.models.RequestOptions;
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
    @Host("https://{searchServiceName}.{searchDnsSuffix}")
    @ServiceInterface(name = "SearchServiceRestClientDataSources")
    private interface DataSourcesService {
        @Put("datasources('{dataSourceName}')")
        @ExpectedResponses({200, 201})
        Mono<SimpleResponse<DataSource>> createOrUpdate(@PathParam("dataSourceName") String dataSourceName, @HostParam("searchServiceName") String searchServiceName, @HostParam("searchDnsSuffix") String searchDnsSuffix, @BodyParam("application/json; charset=utf-8") DataSource dataSource, @HeaderParam("Prefer") String prefer, @QueryParam("api-version") String apiVersion, @HeaderParam("client-request-id") UUID clientRequestId, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @Delete("datasources('{dataSourceName}')")
        @ExpectedResponses({204, 404})
        Mono<SimpleResponse<Void>> delete(@PathParam("dataSourceName") String dataSourceName, @HostParam("searchServiceName") String searchServiceName, @HostParam("searchDnsSuffix") String searchDnsSuffix, @QueryParam("api-version") String apiVersion, @HeaderParam("client-request-id") UUID clientRequestId, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @Get("datasources('{dataSourceName}')")
        @ExpectedResponses({200})
        Mono<SimpleResponse<DataSource>> get(@PathParam("dataSourceName") String dataSourceName, @HostParam("searchServiceName") String searchServiceName, @HostParam("searchDnsSuffix") String searchDnsSuffix, @QueryParam("api-version") String apiVersion, @HeaderParam("client-request-id") UUID clientRequestId, Context context);

        @Get("datasources")
        @ExpectedResponses({200})
        Mono<SimpleResponse<ListDataSourcesResult>> list(@HostParam("searchServiceName") String searchServiceName, @HostParam("searchDnsSuffix") String searchDnsSuffix, @QueryParam("$select") String select, @QueryParam("api-version") String apiVersion, @HeaderParam("client-request-id") UUID clientRequestId, Context context);

        @Post("datasources")
        @ExpectedResponses({201})
        Mono<SimpleResponse<DataSource>> create(@HostParam("searchServiceName") String searchServiceName, @HostParam("searchDnsSuffix") String searchDnsSuffix, @BodyParam("application/json; charset=utf-8") DataSource dataSource, @QueryParam("api-version") String apiVersion, @HeaderParam("client-request-id") UUID clientRequestId, Context context);
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
        final String prefer = "return=representation";
        final UUID clientRequestId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        return service.createOrUpdate(dataSourceName, this.client.getSearchServiceName(), this.client.getSearchDnsSuffix(), dataSource, prefer, this.client.getApiVersion(), clientRequestId, ifMatch, ifNoneMatch, context);
    }

    /**
     * Creates a new datasource or updates a datasource if it already exists.
     *
     * @param dataSourceName The name of the datasource to create or update.
     * @param dataSource The definition of the datasource to create or update.
     * @param requestOptions Additional parameters for the operation.
     * @param accessCondition Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DataSource>> createOrUpdateWithRestResponseAsync(String dataSourceName, DataSource dataSource, RequestOptions requestOptions, AccessCondition accessCondition, Context context) {
        final String prefer = "return=representation";
        UUID clientRequestId = null;
        if (requestOptions != null) {
            clientRequestId = requestOptions.getClientRequestId();
        }
        String ifMatch = null;
        if (accessCondition != null) {
            ifMatch = accessCondition.getIfMatch();
        }
        String ifNoneMatch = null;
        if (accessCondition != null) {
            ifNoneMatch = accessCondition.getIfNoneMatch();
        }
        return service.createOrUpdate(dataSourceName, this.client.getSearchServiceName(), this.client.getSearchDnsSuffix(), dataSource, prefer, this.client.getApiVersion(), clientRequestId, ifMatch, ifNoneMatch, context);
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
    public Mono<SimpleResponse<Void>> deleteWithRestResponseAsync(String dataSourceName, Context context) {
        final UUID clientRequestId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        return service.delete(dataSourceName, this.client.getSearchServiceName(), this.client.getSearchDnsSuffix(), this.client.getApiVersion(), clientRequestId, ifMatch, ifNoneMatch, context);
    }

    /**
     * Deletes a datasource.
     *
     * @param dataSourceName The name of the datasource to delete.
     * @param requestOptions Additional parameters for the operation.
     * @param accessCondition Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Void>> deleteWithRestResponseAsync(String dataSourceName, RequestOptions requestOptions, AccessCondition accessCondition, Context context) {
        UUID clientRequestId = null;
        if (requestOptions != null) {
            clientRequestId = requestOptions.getClientRequestId();
        }
        String ifMatch = null;
        if (accessCondition != null) {
            ifMatch = accessCondition.getIfMatch();
        }
        String ifNoneMatch = null;
        if (accessCondition != null) {
            ifNoneMatch = accessCondition.getIfNoneMatch();
        }
        return service.delete(dataSourceName, this.client.getSearchServiceName(), this.client.getSearchDnsSuffix(), this.client.getApiVersion(), clientRequestId, ifMatch, ifNoneMatch, context);
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
        final UUID clientRequestId = null;
        return service.get(dataSourceName, this.client.getSearchServiceName(), this.client.getSearchDnsSuffix(), this.client.getApiVersion(), clientRequestId, context);
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
        UUID clientRequestId = null;
        if (requestOptions != null) {
            clientRequestId = requestOptions.getClientRequestId();
        }
        return service.get(dataSourceName, this.client.getSearchServiceName(), this.client.getSearchDnsSuffix(), this.client.getApiVersion(), clientRequestId, context);
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
        final String select = null;
        final UUID clientRequestId = null;
        return service.list(this.client.getSearchServiceName(), this.client.getSearchDnsSuffix(), select, this.client.getApiVersion(), clientRequestId, context);
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
        UUID clientRequestId = null;
        if (requestOptions != null) {
            clientRequestId = requestOptions.getClientRequestId();
        }
        return service.list(this.client.getSearchServiceName(), this.client.getSearchDnsSuffix(), select, this.client.getApiVersion(), clientRequestId, context);
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
        final UUID clientRequestId = null;
        return service.create(this.client.getSearchServiceName(), this.client.getSearchDnsSuffix(), dataSource, this.client.getApiVersion(), clientRequestId, context);
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
        UUID clientRequestId = null;
        if (requestOptions != null) {
            clientRequestId = requestOptions.getClientRequestId();
        }
        return service.create(this.client.getSearchServiceName(), this.client.getSearchDnsSuffix(), dataSource, this.client.getApiVersion(), clientRequestId, context);
    }
}
