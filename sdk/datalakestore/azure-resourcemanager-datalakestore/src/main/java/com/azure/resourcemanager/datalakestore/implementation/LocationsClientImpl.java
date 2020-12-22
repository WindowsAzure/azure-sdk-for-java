// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.implementation;

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
import com.azure.resourcemanager.datalakestore.fluent.LocationsClient;
import com.azure.resourcemanager.datalakestore.fluent.models.CapabilityInformationInner;
import com.azure.resourcemanager.datalakestore.fluent.models.UsageInner;
import com.azure.resourcemanager.datalakestore.models.UsageListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LocationsClient. */
public final class LocationsClientImpl implements LocationsClient {
    private final ClientLogger logger = new ClientLogger(LocationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final LocationsService service;

    /** The service client containing this operation class. */
    private final DataLakeStoreAccountManagementClientImpl client;

    /**
     * Initializes an instance of LocationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LocationsClientImpl(DataLakeStoreAccountManagementClientImpl client) {
        this.service =
            RestProxy.create(LocationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataLakeStoreAccountManagementClientLocations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataLakeStoreAccount")
    private interface LocationsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DataLakeStore/locations/{location}/capability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CapabilityInformationInner>> getCapability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DataLakeStore/locations/{location}/usages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<UsageListResult>> getUsage(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets subscription-level properties and limits for Data Lake Store specified by resource location.
     *
     * @param location The resource location without whitespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription-level properties and limits for Data Lake Store specified by resource location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CapabilityInformationInner>> getCapabilityWithResponseAsync(String location) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getCapability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets subscription-level properties and limits for Data Lake Store specified by resource location.
     *
     * @param location The resource location without whitespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription-level properties and limits for Data Lake Store specified by resource location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CapabilityInformationInner>> getCapabilityWithResponseAsync(
        String location, Context context) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getCapability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets subscription-level properties and limits for Data Lake Store specified by resource location.
     *
     * @param location The resource location without whitespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription-level properties and limits for Data Lake Store specified by resource location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CapabilityInformationInner> getCapabilityAsync(String location) {
        return getCapabilityWithResponseAsync(location)
            .flatMap(
                (Response<CapabilityInformationInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets subscription-level properties and limits for Data Lake Store specified by resource location.
     *
     * @param location The resource location without whitespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription-level properties and limits for Data Lake Store specified by resource location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CapabilityInformationInner getCapability(String location) {
        return getCapabilityAsync(location).block();
    }

    /**
     * Gets subscription-level properties and limits for Data Lake Store specified by resource location.
     *
     * @param location The resource location without whitespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription-level properties and limits for Data Lake Store specified by resource location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CapabilityInformationInner> getCapabilityWithResponse(String location, Context context) {
        return getCapabilityWithResponseAsync(location, context).block();
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     *
     * @param location The resource location without whitespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage count and the limit for the resources of the location under the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageInner>> getUsageSinglePageAsync(String location) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getUsage(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            location,
                            accept,
                            context))
            .<PagedResponse<UsageInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     *
     * @param location The resource location without whitespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage count and the limit for the resources of the location under the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageInner>> getUsageSinglePageAsync(String location, Context context) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getUsage(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                location,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     *
     * @param location The resource location without whitespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage count and the limit for the resources of the location under the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<UsageInner> getUsageAsync(String location) {
        return new PagedFlux<>(() -> getUsageSinglePageAsync(location));
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     *
     * @param location The resource location without whitespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage count and the limit for the resources of the location under the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<UsageInner> getUsageAsync(String location, Context context) {
        return new PagedFlux<>(() -> getUsageSinglePageAsync(location, context));
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     *
     * @param location The resource location without whitespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage count and the limit for the resources of the location under the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageInner> getUsage(String location) {
        return new PagedIterable<>(getUsageAsync(location));
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     *
     * @param location The resource location without whitespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage count and the limit for the resources of the location under the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageInner> getUsage(String location, Context context) {
        return new PagedIterable<>(getUsageAsync(location, context));
    }
}
