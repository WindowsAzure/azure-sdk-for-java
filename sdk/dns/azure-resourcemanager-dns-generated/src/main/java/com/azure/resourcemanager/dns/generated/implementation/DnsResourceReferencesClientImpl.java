// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.implementation;

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
import com.azure.resourcemanager.dns.generated.fluent.DnsResourceReferencesClient;
import com.azure.resourcemanager.dns.generated.fluent.models.DnsResourceReferenceResultInner;
import com.azure.resourcemanager.dns.generated.models.DnsResourceReferenceRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DnsResourceReferencesClient. */
public final class DnsResourceReferencesClientImpl implements DnsResourceReferencesClient {
    private final ClientLogger logger = new ClientLogger(DnsResourceReferencesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DnsResourceReferencesService service;

    /** The service client containing this operation class. */
    private final DnsManagementClientImpl client;

    /**
     * Initializes an instance of DnsResourceReferencesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DnsResourceReferencesClientImpl(DnsManagementClientImpl client) {
        this.service =
            RestProxy
                .create(DnsResourceReferencesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DnsManagementClientDnsResourceReferences to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DnsManagementClientD")
    private interface DnsResourceReferencesService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Network/getDnsResourceReference")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DnsResourceReferenceResultInner>> getByTargetResources(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") DnsResourceReferenceRequest parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Returns the DNS records specified by the referencing targetResourceIds.
     *
     * @param parameters Properties for dns resource reference request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the properties of the Dns Resource Reference Result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DnsResourceReferenceResultInner>> getByTargetResourcesWithResponseAsync(
        DnsResourceReferenceRequest parameters) {
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
                        .getByTargetResources(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Returns the DNS records specified by the referencing targetResourceIds.
     *
     * @param parameters Properties for dns resource reference request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the properties of the Dns Resource Reference Result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DnsResourceReferenceResultInner>> getByTargetResourcesWithResponseAsync(
        DnsResourceReferenceRequest parameters, Context context) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getByTargetResources(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * Returns the DNS records specified by the referencing targetResourceIds.
     *
     * @param parameters Properties for dns resource reference request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the properties of the Dns Resource Reference Result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DnsResourceReferenceResultInner> getByTargetResourcesAsync(DnsResourceReferenceRequest parameters) {
        return getByTargetResourcesWithResponseAsync(parameters)
            .flatMap(
                (Response<DnsResourceReferenceResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Returns the DNS records specified by the referencing targetResourceIds.
     *
     * @param parameters Properties for dns resource reference request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the properties of the Dns Resource Reference Result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DnsResourceReferenceResultInner getByTargetResources(DnsResourceReferenceRequest parameters) {
        return getByTargetResourcesAsync(parameters).block();
    }

    /**
     * Returns the DNS records specified by the referencing targetResourceIds.
     *
     * @param parameters Properties for dns resource reference request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the properties of the Dns Resource Reference Result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DnsResourceReferenceResultInner> getByTargetResourcesWithResponse(
        DnsResourceReferenceRequest parameters, Context context) {
        return getByTargetResourcesWithResponseAsync(parameters, context).block();
    }
}
