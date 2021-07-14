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
import com.azure.resourcemanager.security.fluent.IotRecommendationsClient;
import com.azure.resourcemanager.security.fluent.models.IotRecommendationModelInner;
import com.azure.resourcemanager.security.models.IotRecommendationListModel;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in IotRecommendationsClient. */
public final class IotRecommendationsClientImpl implements IotRecommendationsClient {
    private final ClientLogger logger = new ClientLogger(IotRecommendationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final IotRecommendationsService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of IotRecommendationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    IotRecommendationsClientImpl(SecurityCenterImpl client) {
        this.service =
            RestProxy.create(IotRecommendationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterIotRecommendations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterIotRec")
    private interface IotRecommendationsService {
        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Security/iotRecommendations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IotRecommendationListModel>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "scope", encoded = true) String scope,
            @QueryParam("recommendationType") String recommendationType,
            @QueryParam("deviceId") String deviceId,
            @QueryParam("$limit") Integer limit,
            @QueryParam("$skipToken") String skipToken,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Security/iotRecommendations/{iotRecommendationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IotRecommendationModelInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "scope", encoded = true) String scope,
            @PathParam("iotRecommendationId") String iotRecommendationId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IotRecommendationListModel>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List IoT recommendations.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param recommendationType Filter by recommendation type.
     * @param deviceId Filter by device id.
     * @param limit Limit the number of items returned in a single page.
     * @param skipToken Skip token used for pagination.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT recommendations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<IotRecommendationModelInner>> listSinglePageAsync(
        String scope, String recommendationType, String deviceId, Integer limit, String skipToken) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String apiVersion = "2020-08-06-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            scope,
                            recommendationType,
                            deviceId,
                            limit,
                            skipToken,
                            accept,
                            context))
            .<PagedResponse<IotRecommendationModelInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List IoT recommendations.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param recommendationType Filter by recommendation type.
     * @param deviceId Filter by device id.
     * @param limit Limit the number of items returned in a single page.
     * @param skipToken Skip token used for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT recommendations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<IotRecommendationModelInner>> listSinglePageAsync(
        String scope, String recommendationType, String deviceId, Integer limit, String skipToken, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String apiVersion = "2020-08-06-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                apiVersion,
                scope,
                recommendationType,
                deviceId,
                limit,
                skipToken,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * List IoT recommendations.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param recommendationType Filter by recommendation type.
     * @param deviceId Filter by device id.
     * @param limit Limit the number of items returned in a single page.
     * @param skipToken Skip token used for pagination.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<IotRecommendationModelInner> listAsync(
        String scope, String recommendationType, String deviceId, Integer limit, String skipToken) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, recommendationType, deviceId, limit, skipToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List IoT recommendations.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<IotRecommendationModelInner> listAsync(String scope) {
        final String recommendationType = null;
        final String deviceId = null;
        final Integer limit = null;
        final String skipToken = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, recommendationType, deviceId, limit, skipToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List IoT recommendations.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param recommendationType Filter by recommendation type.
     * @param deviceId Filter by device id.
     * @param limit Limit the number of items returned in a single page.
     * @param skipToken Skip token used for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<IotRecommendationModelInner> listAsync(
        String scope, String recommendationType, String deviceId, Integer limit, String skipToken, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, recommendationType, deviceId, limit, skipToken, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List IoT recommendations.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<IotRecommendationModelInner> list(String scope) {
        final String recommendationType = null;
        final String deviceId = null;
        final Integer limit = null;
        final String skipToken = null;
        return new PagedIterable<>(listAsync(scope, recommendationType, deviceId, limit, skipToken));
    }

    /**
     * List IoT recommendations.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param recommendationType Filter by recommendation type.
     * @param deviceId Filter by device id.
     * @param limit Limit the number of items returned in a single page.
     * @param skipToken Skip token used for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<IotRecommendationModelInner> list(
        String scope, String recommendationType, String deviceId, Integer limit, String skipToken, Context context) {
        return new PagedIterable<>(listAsync(scope, recommendationType, deviceId, limit, skipToken, context));
    }

    /**
     * Get IoT recommendation.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param iotRecommendationId Id of the recommendation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT recommendation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IotRecommendationModelInner>> getWithResponseAsync(String scope, String iotRecommendationId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (iotRecommendationId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter iotRecommendationId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-06-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service.get(this.client.getEndpoint(), apiVersion, scope, iotRecommendationId, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get IoT recommendation.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param iotRecommendationId Id of the recommendation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT recommendation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IotRecommendationModelInner>> getWithResponseAsync(
        String scope, String iotRecommendationId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (iotRecommendationId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter iotRecommendationId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-06-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), apiVersion, scope, iotRecommendationId, accept, context);
    }

    /**
     * Get IoT recommendation.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param iotRecommendationId Id of the recommendation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT recommendation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<IotRecommendationModelInner> getAsync(String scope, String iotRecommendationId) {
        return getWithResponseAsync(scope, iotRecommendationId)
            .flatMap(
                (Response<IotRecommendationModelInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get IoT recommendation.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param iotRecommendationId Id of the recommendation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT recommendation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IotRecommendationModelInner get(String scope, String iotRecommendationId) {
        return getAsync(scope, iotRecommendationId).block();
    }

    /**
     * Get IoT recommendation.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param iotRecommendationId Id of the recommendation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT recommendation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<IotRecommendationModelInner> getWithResponse(
        String scope, String iotRecommendationId, Context context) {
        return getWithResponseAsync(scope, iotRecommendationId, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT recommendations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<IotRecommendationModelInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<IotRecommendationModelInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT recommendations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<IotRecommendationModelInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
