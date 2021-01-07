// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.saas.implementation;

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
import com.azure.resourcemanager.saas.fluent.SaaSAppModerneligibilitiesClient;
import com.azure.resourcemanager.saas.fluent.models.SaasRpModernEligibilityInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SaaSAppModerneligibilitiesClient. */
public final class SaaSAppModerneligibilitiesClientImpl implements SaaSAppModerneligibilitiesClient {
    private final ClientLogger logger = new ClientLogger(SaaSAppModerneligibilitiesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final SaaSAppModerneligibilitiesService service;

    /** The service client containing this operation class. */
    private final SaaSManagementClientImpl client;

    /**
     * Initializes an instance of SaaSAppModerneligibilitiesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SaaSAppModerneligibilitiesClientImpl(SaaSManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    SaaSAppModerneligibilitiesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SaaSManagementClientSaaSAppModerneligibilities to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SaaSManagementClient")
    private interface SaaSAppModerneligibilitiesService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.SaaS/checkModernEligibility")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SaasRpModernEligibilityInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Check if the Azure Subscription has been converted to modern.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saasRp Modern Eligibility.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SaasRpModernEligibilityInner>> getWithResponseAsync() {
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
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Check if the Azure Subscription has been converted to modern.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saasRp Modern Eligibility.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SaasRpModernEligibilityInner>> getWithResponseAsync(Context context) {
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
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Check if the Azure Subscription has been converted to modern.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saasRp Modern Eligibility.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SaasRpModernEligibilityInner> getAsync() {
        return getWithResponseAsync()
            .flatMap(
                (Response<SaasRpModernEligibilityInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check if the Azure Subscription has been converted to modern.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saasRp Modern Eligibility.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SaasRpModernEligibilityInner get() {
        return getAsync().block();
    }

    /**
     * Check if the Azure Subscription has been converted to modern.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saasRp Modern Eligibility.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SaasRpModernEligibilityInner> getWithResponse(Context context) {
        return getWithResponseAsync(context).block();
    }
}
