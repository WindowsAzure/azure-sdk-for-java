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
import com.azure.search.documents.implementation.models.ListSynonymMapsResult;
import com.azure.search.documents.models.RequestOptions;
import com.azure.search.documents.models.SearchErrorException;
import com.azure.search.documents.models.SynonymMap;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * SynonymMaps.
 */
public final class SynonymMapsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private SynonymMapsService service;

    /**
     * The service client containing this operation class.
     */
    private SearchServiceRestClientImpl client;

    /**
     * Initializes an instance of SynonymMapsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public SynonymMapsImpl(SearchServiceRestClientImpl client) {
        this.service = RestProxy.create(SynonymMapsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SearchServiceRestClientSynonymMaps to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SearchServiceRestClientSynonymMaps")
    private interface SynonymMapsService {
        @Put("synonymmaps('{synonymMapName}')")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<SynonymMap>> createOrUpdate(@PathParam("synonymMapName") String synonymMapName, @HostParam("endpoint") String endpoint, @BodyParam("application/json; charset=utf-8") SynonymMap synonymMap, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("Prefer") String prefer, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Delete("synonymmaps('{synonymMapName}')")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> delete(@PathParam("synonymMapName") String synonymMapName, @HostParam("endpoint") String endpoint, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("synonymmaps('{synonymMapName}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<SynonymMap>> get(@PathParam("synonymMapName") String synonymMapName, @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("synonymmaps")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<ListSynonymMapsResult>> list(@HostParam("endpoint") String endpoint, @QueryParam("$select") String select, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Post("synonymmaps")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<SynonymMap>> create(@HostParam("endpoint") String endpoint, @BodyParam("application/json; charset=utf-8") SynonymMap synonymMap, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);
    }

    /**
     * Creates a new synonym map or updates a synonym map if it already exists.
     *
     * @param synonymMapName The name of the synonym map to create or update.
     * @param synonymMap The definition of the synonym map to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SynonymMap>> createOrUpdateWithRestResponseAsync(String synonymMapName, SynonymMap synonymMap, Context context) {
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String prefer = "return=representation";
        final UUID xMsClientRequestId = null;
        return service.createOrUpdate(synonymMapName, this.client.getEndpoint(), synonymMap, ifMatch, ifNoneMatch, prefer, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Creates a new synonym map or updates a synonym map if it already exists.
     *
     * @param synonymMapName The name of the synonym map to create or update.
     * @param synonymMap The definition of the synonym map to create or update.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the server does not match this value.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SynonymMap>> createOrUpdateWithRestResponseAsync(String synonymMapName, SynonymMap synonymMap, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
        final String prefer = "return=representation";
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.createOrUpdate(synonymMapName, this.client.getEndpoint(), synonymMap, ifMatch, ifNoneMatch, prefer, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Deletes a synonym map.
     *
     * @param synonymMapName The name of the synonym map to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithRestResponseAsync(String synonymMapName, Context context) {
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final UUID xMsClientRequestId = null;
        return service.delete(synonymMapName, this.client.getEndpoint(), ifMatch, ifNoneMatch, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Deletes a synonym map.
     *
     * @param synonymMapName The name of the synonym map to delete.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the server does not match this value.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithRestResponseAsync(String synonymMapName, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.delete(synonymMapName, this.client.getEndpoint(), ifMatch, ifNoneMatch, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Retrieves a synonym map definition.
     *
     * @param synonymMapName The name of the synonym map to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SynonymMap>> getWithRestResponseAsync(String synonymMapName, Context context) {
        final UUID xMsClientRequestId = null;
        return service.get(synonymMapName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Retrieves a synonym map definition.
     *
     * @param synonymMapName The name of the synonym map to retrieve.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SynonymMap>> getWithRestResponseAsync(String synonymMapName, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.get(synonymMapName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Lists all synonym maps available for a search service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListSynonymMapsResult>> listWithRestResponseAsync(Context context) {
        final String select = null;
        final UUID xMsClientRequestId = null;
        return service.list(this.client.getEndpoint(), select, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Lists all synonym maps available for a search service.
     *
     * @param select Selects which top-level properties of the synonym maps to retrieve. Specified as a comma-separated list of JSON property names, or '*' for all properties. The default is all properties.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListSynonymMapsResult>> listWithRestResponseAsync(String select, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.list(this.client.getEndpoint(), select, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Creates a new synonym map.
     *
     * @param synonymMap The definition of the synonym map to create.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SynonymMap>> createWithRestResponseAsync(SynonymMap synonymMap, Context context) {
        final UUID xMsClientRequestId = null;
        return service.create(this.client.getEndpoint(), synonymMap, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Creates a new synonym map.
     *
     * @param synonymMap The definition of the synonym map to create.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SynonymMap>> createWithRestResponseAsync(SynonymMap synonymMap, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.create(this.client.getEndpoint(), synonymMap, this.client.getApiVersion(), xMsClientRequestId, context);
    }
}
