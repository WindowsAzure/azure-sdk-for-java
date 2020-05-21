// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.storage.fluent;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.storage.StorageManagementClient;
import com.azure.management.storage.fluent.inner.OperationInner;
import com.azure.management.storage.fluent.inner.OperationListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Operations. */
public final class OperationsClient {
    private final ClientLogger logger = new ClientLogger(OperationsClient.class);

    /** The proxy service used to perform REST calls. */
    private final OperationsService service;

    /** The service client containing this operation class. */
    private final StorageManagementClient client;

    /**
     * Initializes an instance of OperationsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsClient(StorageManagementClient client) {
        this.service =
            RestProxy.create(OperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageManagementClientOperations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementCli")
    private interface OperationsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/providers/Microsoft.Storage/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<OperationListResultInner>> list(
            @HostParam("$host") String host, @QueryParam("api-version") String apiVersion, Context context);
    }

    /**
     * Lists all of the available Storage Rest API operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Storage operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<OperationInner>> listSinglePageAsync() {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.list(this.client.getHost(), this.client.getApiVersion(), context))
            .<PagedResponse<OperationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists all of the available Storage Rest API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Storage operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<OperationInner>> listSinglePageAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        return service
            .list(this.client.getHost(), this.client.getApiVersion(), context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Lists all of the available Storage Rest API operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Storage operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<OperationInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync());
    }

    /**
     * Lists all of the available Storage Rest API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Storage operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<OperationInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context));
    }

    /**
     * Lists all of the available Storage Rest API operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Storage operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OperationInner> list() {
        return new PagedIterable<>(listAsync());
    }
}
