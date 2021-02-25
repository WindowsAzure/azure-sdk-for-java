// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.resourcemanager.batch.fluent.LocationsClient;
import com.azure.resourcemanager.batch.fluent.models.BatchLocationQuotaInner;
import com.azure.resourcemanager.batch.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.batch.models.CheckNameAvailabilityParameters;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LocationsClient. */
public final class LocationsClientImpl implements LocationsClient {
    private final ClientLogger logger = new ClientLogger(LocationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final LocationsService service;

    /** The service client containing this operation class. */
    private final BatchManagementImpl client;

    /**
     * Initializes an instance of LocationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LocationsClientImpl(BatchManagementImpl client) {
        this.service =
            RestProxy.create(LocationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for BatchManagementLocations to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "BatchManagementLocat")
    private interface LocationsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Batch/locations/{locationName}/quotas")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<BatchLocationQuotaInner>> getQuotas(
            @HostParam("$host") String endpoint,
            @PathParam("locationName") String locationName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Batch/locations/{locationName}/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("locationName") String locationName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") CheckNameAvailabilityParameters parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     *
     * @param locationName The region for which to retrieve Batch service quotas.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Batch service quotas for the specified subscription at the given location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BatchLocationQuotaInner>> getQuotasWithResponseAsync(String locationName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getQuotas(
                            this.client.getEndpoint(),
                            locationName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     *
     * @param locationName The region for which to retrieve Batch service quotas.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Batch service quotas for the specified subscription at the given location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BatchLocationQuotaInner>> getQuotasWithResponseAsync(String locationName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getQuotas(
                this.client.getEndpoint(),
                locationName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     *
     * @param locationName The region for which to retrieve Batch service quotas.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Batch service quotas for the specified subscription at the given location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<BatchLocationQuotaInner> getQuotasAsync(String locationName) {
        return getQuotasWithResponseAsync(locationName)
            .flatMap(
                (Response<BatchLocationQuotaInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     *
     * @param locationName The region for which to retrieve Batch service quotas.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Batch service quotas for the specified subscription at the given location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BatchLocationQuotaInner getQuotas(String locationName) {
        return getQuotasAsync(locationName).block();
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     *
     * @param locationName The region for which to retrieve Batch service quotas.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Batch service quotas for the specified subscription at the given location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BatchLocationQuotaInner> getQuotasWithResponse(String locationName, Context context) {
        return getQuotasWithResponseAsync(locationName, context).block();
    }

    /**
     * Checks whether the Batch account name is available in the specified region.
     *
     * @param locationName The desired region for the name check.
     * @param parameters Properties needed to check the availability of a name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(
        String locationName, CheckNameAvailabilityParameters parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
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
                            locationName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Checks whether the Batch account name is available in the specified region.
     *
     * @param locationName The desired region for the name check.
     * @param parameters Properties needed to check the availability of a name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(
        String locationName, CheckNameAvailabilityParameters parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
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
                locationName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * Checks whether the Batch account name is available in the specified region.
     *
     * @param locationName The desired region for the name check.
     * @param parameters Properties needed to check the availability of a name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckNameAvailabilityResultInner> checkNameAvailabilityAsync(
        String locationName, CheckNameAvailabilityParameters parameters) {
        return checkNameAvailabilityWithResponseAsync(locationName, parameters)
            .flatMap(
                (Response<CheckNameAvailabilityResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Checks whether the Batch account name is available in the specified region.
     *
     * @param locationName The desired region for the name check.
     * @param parameters Properties needed to check the availability of a name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityResultInner checkNameAvailability(
        String locationName, CheckNameAvailabilityParameters parameters) {
        return checkNameAvailabilityAsync(locationName, parameters).block();
    }

    /**
     * Checks whether the Batch account name is available in the specified region.
     *
     * @param locationName The desired region for the name check.
     * @param parameters Properties needed to check the availability of a name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckNameAvailabilityResultInner> checkNameAvailabilityWithResponse(
        String locationName, CheckNameAvailabilityParameters parameters, Context context) {
        return checkNameAvailabilityWithResponseAsync(locationName, parameters, context).block();
    }
}
