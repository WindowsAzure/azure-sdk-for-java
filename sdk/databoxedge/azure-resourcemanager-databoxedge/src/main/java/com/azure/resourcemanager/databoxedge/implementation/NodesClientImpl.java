// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.fluent.NodesClient;
import com.azure.resourcemanager.databoxedge.fluent.models.NodeInner;
import com.azure.resourcemanager.databoxedge.models.NodeList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NodesClient. */
public final class NodesClientImpl implements NodesClient {
    private final ClientLogger logger = new ClientLogger(NodesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final NodesService service;

    /** The service client containing this operation class. */
    private final DataBoxEdgeManagementClientImpl client;

    /**
     * Initializes an instance of NodesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NodesClientImpl(DataBoxEdgeManagementClientImpl client) {
        this.service = RestProxy.create(NodesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataBoxEdgeManagementClientNodes to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataBoxEdgeManagemen")
    private interface NodesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataBoxEdge"
                + "/dataBoxEdgeDevices/{deviceName}/nodes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NodeList>> listByDataBoxEdgeDevice(
            @HostParam("$host") String endpoint,
            @PathParam("deviceName") String deviceName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets all the nodes currently configured under this Data Box Edge device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the nodes currently configured under this Data Box Edge device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<NodeInner>> listByDataBoxEdgeDeviceSinglePageAsync(
        String deviceName, String resourceGroupName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (deviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter deviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByDataBoxEdgeDevice(
                            this.client.getEndpoint(),
                            deviceName,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<NodeInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets all the nodes currently configured under this Data Box Edge device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the nodes currently configured under this Data Box Edge device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<NodeInner>> listByDataBoxEdgeDeviceSinglePageAsync(
        String deviceName, String resourceGroupName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (deviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter deviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByDataBoxEdgeDevice(
                this.client.getEndpoint(),
                deviceName,
                this.client.getSubscriptionId(),
                resourceGroupName,
                this.client.getApiVersion(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Gets all the nodes currently configured under this Data Box Edge device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the nodes currently configured under this Data Box Edge device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<NodeInner> listByDataBoxEdgeDeviceAsync(String deviceName, String resourceGroupName) {
        return new PagedFlux<>(() -> listByDataBoxEdgeDeviceSinglePageAsync(deviceName, resourceGroupName));
    }

    /**
     * Gets all the nodes currently configured under this Data Box Edge device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the nodes currently configured under this Data Box Edge device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<NodeInner> listByDataBoxEdgeDeviceAsync(
        String deviceName, String resourceGroupName, Context context) {
        return new PagedFlux<>(() -> listByDataBoxEdgeDeviceSinglePageAsync(deviceName, resourceGroupName, context));
    }

    /**
     * Gets all the nodes currently configured under this Data Box Edge device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the nodes currently configured under this Data Box Edge device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NodeInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        return new PagedIterable<>(listByDataBoxEdgeDeviceAsync(deviceName, resourceGroupName));
    }

    /**
     * Gets all the nodes currently configured under this Data Box Edge device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the nodes currently configured under this Data Box Edge device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NodeInner> listByDataBoxEdgeDevice(
        String deviceName, String resourceGroupName, Context context) {
        return new PagedIterable<>(listByDataBoxEdgeDeviceAsync(deviceName, resourceGroupName, context));
    }
}
