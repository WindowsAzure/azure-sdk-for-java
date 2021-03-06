// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.DevicesClient;
import com.azure.resourcemanager.security.fluent.models.DeviceInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DevicesClient. */
public final class DevicesClientImpl implements DevicesClient {
    private final ClientLogger logger = new ClientLogger(DevicesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DevicesService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of DevicesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DevicesClientImpl(SecurityCenterImpl client) {
        this.service = RestProxy.create(DevicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterDevices to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterDevice")
    private interface DevicesService {
        @Headers({"Content-Type: application/json"})
        @Get("/{resourceId}/providers/Microsoft.Security/devices/{deviceId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DeviceInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceId", encoded = true) String resourceId,
            @PathParam("deviceId") String deviceId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get device.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceId Identifier of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DeviceInner>> getWithResponseAsync(String resourceId, String deviceId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceId is required and cannot be null."));
        }
        if (deviceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter deviceId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-06-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.get(this.client.getEndpoint(), apiVersion, resourceId, deviceId, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get device.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceId Identifier of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DeviceInner>> getWithResponseAsync(String resourceId, String deviceId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceId is required and cannot be null."));
        }
        if (deviceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter deviceId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-06-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), apiVersion, resourceId, deviceId, accept, context);
    }

    /**
     * Get device.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceId Identifier of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DeviceInner> getAsync(String resourceId, String deviceId) {
        return getWithResponseAsync(resourceId, deviceId)
            .flatMap(
                (Response<DeviceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get device.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceId Identifier of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeviceInner get(String resourceId, String deviceId) {
        return getAsync(resourceId, deviceId).block();
    }

    /**
     * Get device.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceId Identifier of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DeviceInner> getWithResponse(String resourceId, String deviceId, Context context) {
        return getWithResponseAsync(resourceId, deviceId, context).block();
    }
}
