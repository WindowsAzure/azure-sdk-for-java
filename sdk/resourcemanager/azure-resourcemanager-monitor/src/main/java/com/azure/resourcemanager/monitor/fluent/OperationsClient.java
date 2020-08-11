// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.MonitorClient;
import com.azure.resourcemanager.monitor.fluent.inner.OperationListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Operations. */
public final class OperationsClient {
    private final ClientLogger logger = new ClientLogger(OperationsClient.class);

    /** The proxy service used to perform REST calls. */
    private final OperationsService service;

    /** The service client containing this operation class. */
    private final MonitorClient client;

    /**
     * Initializes an instance of OperationsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsClient(MonitorClient client) {
        this.service =
            RestProxy.create(OperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientOperations to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientOperati")
    private interface OperationsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/providers/microsoft.insights/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationListResultInner>> list(
            @HostParam("$host") String endpoint, @QueryParam("api-version") String apiVersion, Context context);
    }

    /**
     * Lists all of the available operations from Microsoft.Insights provider.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<OperationListResultInner>> listWithResponseAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2015-04-01";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists all of the available operations from Microsoft.Insights provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<OperationListResultInner>> listWithResponseAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2015-04-01";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), apiVersion, context);
    }

    /**
     * Lists all of the available operations from Microsoft.Insights provider.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OperationListResultInner> listAsync() {
        return listWithResponseAsync()
            .flatMap(
                (Response<OperationListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists all of the available operations from Microsoft.Insights provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OperationListResultInner> listAsync(Context context) {
        return listWithResponseAsync(context)
            .flatMap(
                (Response<OperationListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists all of the available operations from Microsoft.Insights provider.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationListResultInner list() {
        return listAsync().block();
    }

    /**
     * Lists all of the available operations from Microsoft.Insights provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationListResultInner list(Context context) {
        return listAsync(context).block();
    }
}
