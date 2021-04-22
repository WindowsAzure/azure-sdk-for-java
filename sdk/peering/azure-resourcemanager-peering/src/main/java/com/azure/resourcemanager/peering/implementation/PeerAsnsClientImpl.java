// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.peering.fluent.PeerAsnsClient;
import com.azure.resourcemanager.peering.fluent.models.PeerAsnInner;
import com.azure.resourcemanager.peering.models.PeerAsnListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PeerAsnsClient. */
public final class PeerAsnsClientImpl implements PeerAsnsClient {
    private final ClientLogger logger = new ClientLogger(PeerAsnsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PeerAsnsService service;

    /** The service client containing this operation class. */
    private final PeeringManagementClientImpl client;

    /**
     * Initializes an instance of PeerAsnsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PeerAsnsClientImpl(PeeringManagementClientImpl client) {
        this.service = RestProxy.create(PeerAsnsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PeeringManagementClientPeerAsns to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PeeringManagementCli")
    private interface PeerAsnsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Peering/peerAsns/{peerAsnName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PeerAsnInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("peerAsnName") String peerAsnName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put("/subscriptions/{subscriptionId}/providers/Microsoft.Peering/peerAsns/{peerAsnName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PeerAsnInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("peerAsnName") String peerAsnName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") PeerAsnInner peerAsn,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Delete("/subscriptions/{subscriptionId}/providers/Microsoft.Peering/peerAsns/{peerAsnName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String endpoint,
            @PathParam("peerAsnName") String peerAsnName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Peering/peerAsns")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PeerAsnListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PeerAsnListResult>> listBySubscriptionNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the peer ASN with the specified name under the given subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PeerAsnInner>> getWithResponseAsync(String peerAsnName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (peerAsnName == null) {
            return Mono.error(new IllegalArgumentException("Parameter peerAsnName is required and cannot be null."));
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
                        .get(
                            this.client.getEndpoint(),
                            peerAsnName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the peer ASN with the specified name under the given subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PeerAsnInner>> getWithResponseAsync(String peerAsnName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (peerAsnName == null) {
            return Mono.error(new IllegalArgumentException("Parameter peerAsnName is required and cannot be null."));
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
            .get(
                this.client.getEndpoint(),
                peerAsnName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets the peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the peer ASN with the specified name under the given subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PeerAsnInner> getAsync(String peerAsnName) {
        return getWithResponseAsync(peerAsnName)
            .flatMap(
                (Response<PeerAsnInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the peer ASN with the specified name under the given subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PeerAsnInner get(String peerAsnName) {
        return getAsync(peerAsnName).block();
    }

    /**
     * Gets the peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the peer ASN with the specified name under the given subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PeerAsnInner> getWithResponse(String peerAsnName, Context context) {
        return getWithResponseAsync(peerAsnName, context).block();
    }

    /**
     * Creates a new peer ASN or updates an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param peerAsn The peer ASN.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the essential information related to the peer's ASN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PeerAsnInner>> createOrUpdateWithResponseAsync(String peerAsnName, PeerAsnInner peerAsn) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (peerAsnName == null) {
            return Mono.error(new IllegalArgumentException("Parameter peerAsnName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (peerAsn == null) {
            return Mono.error(new IllegalArgumentException("Parameter peerAsn is required and cannot be null."));
        } else {
            peerAsn.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            peerAsnName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            peerAsn,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Creates a new peer ASN or updates an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param peerAsn The peer ASN.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the essential information related to the peer's ASN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PeerAsnInner>> createOrUpdateWithResponseAsync(
        String peerAsnName, PeerAsnInner peerAsn, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (peerAsnName == null) {
            return Mono.error(new IllegalArgumentException("Parameter peerAsnName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (peerAsn == null) {
            return Mono.error(new IllegalArgumentException("Parameter peerAsn is required and cannot be null."));
        } else {
            peerAsn.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                peerAsnName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                peerAsn,
                accept,
                context);
    }

    /**
     * Creates a new peer ASN or updates an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param peerAsn The peer ASN.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the essential information related to the peer's ASN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PeerAsnInner> createOrUpdateAsync(String peerAsnName, PeerAsnInner peerAsn) {
        return createOrUpdateWithResponseAsync(peerAsnName, peerAsn)
            .flatMap(
                (Response<PeerAsnInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates a new peer ASN or updates an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param peerAsn The peer ASN.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the essential information related to the peer's ASN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PeerAsnInner createOrUpdate(String peerAsnName, PeerAsnInner peerAsn) {
        return createOrUpdateAsync(peerAsnName, peerAsn).block();
    }

    /**
     * Creates a new peer ASN or updates an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param peerAsn The peer ASN.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the essential information related to the peer's ASN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PeerAsnInner> createOrUpdateWithResponse(
        String peerAsnName, PeerAsnInner peerAsn, Context context) {
        return createOrUpdateWithResponseAsync(peerAsnName, peerAsn, context).block();
    }

    /**
     * Deletes an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String peerAsnName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (peerAsnName == null) {
            return Mono.error(new IllegalArgumentException("Parameter peerAsnName is required and cannot be null."));
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
                        .delete(
                            this.client.getEndpoint(),
                            peerAsnName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Deletes an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String peerAsnName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (peerAsnName == null) {
            return Mono.error(new IllegalArgumentException("Parameter peerAsnName is required and cannot be null."));
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
            .delete(
                this.client.getEndpoint(),
                peerAsnName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Deletes an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String peerAsnName) {
        return deleteWithResponseAsync(peerAsnName).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String peerAsnName) {
        deleteAsync(peerAsnName).block();
    }

    /**
     * Deletes an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String peerAsnName, Context context) {
        return deleteWithResponseAsync(peerAsnName, context).block();
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peer ASNs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PeerAsnInner>> listSinglePageAsync() {
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
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<PeerAsnInner>>map(
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
     * Lists all of the peer ASNs under the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peer ASNs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PeerAsnInner>> listSinglePageAsync(Context context) {
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
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
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
     * Lists all of the peer ASNs under the given subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peer ASNs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PeerAsnInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(), nextLink -> listBySubscriptionNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peer ASNs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PeerAsnInner> listAsync(Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(context), nextLink -> listBySubscriptionNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peer ASNs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PeerAsnInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peer ASNs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PeerAsnInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peer ASNs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PeerAsnInner>> listBySubscriptionNextSinglePageAsync(String nextLink) {
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
            .withContext(
                context -> service.listBySubscriptionNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<PeerAsnInner>>map(
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
     * @return the paginated list of peer ASNs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PeerAsnInner>> listBySubscriptionNextSinglePageAsync(String nextLink, Context context) {
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
            .listBySubscriptionNext(nextLink, this.client.getEndpoint(), accept, context)
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