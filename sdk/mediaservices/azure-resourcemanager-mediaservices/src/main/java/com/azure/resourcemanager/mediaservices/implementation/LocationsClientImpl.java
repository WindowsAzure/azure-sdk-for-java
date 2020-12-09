// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.mediaservices.fluent.LocationsClient;
import com.azure.resourcemanager.mediaservices.fluent.models.EntityNameAvailabilityCheckOutputInner;
import com.azure.resourcemanager.mediaservices.models.CheckNameAvailabilityInput;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LocationsClient. */
public final class LocationsClientImpl implements LocationsClient {
    private final ClientLogger logger = new ClientLogger(LocationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final LocationsService service;

    /** The service client containing this operation class. */
    private final AzureMediaServicesImpl client;

    /**
     * Initializes an instance of LocationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LocationsClientImpl(AzureMediaServicesImpl client) {
        this.service =
            RestProxy.create(LocationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureMediaServicesLocations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureMediaServicesLo")
    private interface LocationsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Media/locations/{locationName}/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EntityNameAvailabilityCheckOutputInner>> checkNameAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("locationName") String locationName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckNameAvailabilityInput parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Checks whether the Media Service resource name is available.
     *
     * @param locationName The name of the location.
     * @param parameters The input to the check name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<EntityNameAvailabilityCheckOutputInner>> checkNameAvailabilityWithResponseAsync(
        String locationName, CheckNameAvailabilityInput parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkNameAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            locationName,
                            this.client.getApiVersion(),
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Checks whether the Media Service resource name is available.
     *
     * @param locationName The name of the location.
     * @param parameters The input to the check name availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<EntityNameAvailabilityCheckOutputInner>> checkNameAvailabilityWithResponseAsync(
        String locationName, CheckNameAvailabilityInput parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkNameAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                locationName,
                this.client.getApiVersion(),
                parameters,
                accept,
                context);
    }

    /**
     * Checks whether the Media Service resource name is available.
     *
     * @param locationName The name of the location.
     * @param parameters The input to the check name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<EntityNameAvailabilityCheckOutputInner> checkNameAvailabilityAsync(
        String locationName, CheckNameAvailabilityInput parameters) {
        return checkNameAvailabilityWithResponseAsync(locationName, parameters)
            .flatMap(
                (Response<EntityNameAvailabilityCheckOutputInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Checks whether the Media Service resource name is available.
     *
     * @param locationName The name of the location.
     * @param parameters The input to the check name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EntityNameAvailabilityCheckOutputInner checkNameAvailability(
        String locationName, CheckNameAvailabilityInput parameters) {
        return checkNameAvailabilityAsync(locationName, parameters).block();
    }

    /**
     * Checks whether the Media Service resource name is available.
     *
     * @param locationName The name of the location.
     * @param parameters The input to the check name availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<EntityNameAvailabilityCheckOutputInner> checkNameAvailabilityWithResponse(
        String locationName, CheckNameAvailabilityInput parameters, Context context) {
        return checkNameAvailabilityWithResponseAsync(locationName, parameters, context).block();
    }
}
