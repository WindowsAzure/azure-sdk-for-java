// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.implementation;

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
import com.azure.resourcemanager.recoveryservices.fluent.RecoveryServicesClient;
import com.azure.resourcemanager.recoveryservices.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.recoveryservices.models.CheckNameAvailabilityParameters;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RecoveryServicesClient. */
public final class RecoveryServicesClientImpl implements RecoveryServicesClient {
    private final ClientLogger logger = new ClientLogger(RecoveryServicesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RecoveryServicesService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesManagementClientImpl client;

    /**
     * Initializes an instance of RecoveryServicesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RecoveryServicesClientImpl(RecoveryServicesManagementClientImpl client) {
        this.service =
            RestProxy.create(RecoveryServicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesManagementClientRecoveryServices to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesMana")
    private interface RecoveryServicesService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/locations/{location}/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("location") String location,
            @BodyParam("application/json") CheckNameAvailabilityParameters input,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * API to check for resource name availability. A name is available if no other resource exists that has the same
     * SubscriptionId, Resource Name and Type or if one or more such resources exist, each of these must be GC'd and
     * their time of deletion be more than 24 Hours Ago.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param location Location of the resource.
     * @param input Contains information about Resource type and Resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(
        String resourceGroupName, String location, CheckNameAvailabilityParameters input) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (input == null) {
            return Mono.error(new IllegalArgumentException("Parameter input is required and cannot be null."));
        } else {
            input.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkNameAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            this.client.getApiVersion(),
                            location,
                            input,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * API to check for resource name availability. A name is available if no other resource exists that has the same
     * SubscriptionId, Resource Name and Type or if one or more such resources exist, each of these must be GC'd and
     * their time of deletion be more than 24 Hours Ago.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param location Location of the resource.
     * @param input Contains information about Resource type and Resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(
        String resourceGroupName, String location, CheckNameAvailabilityParameters input, Context context) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (input == null) {
            return Mono.error(new IllegalArgumentException("Parameter input is required and cannot be null."));
        } else {
            input.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkNameAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                this.client.getApiVersion(),
                location,
                input,
                accept,
                context);
    }

    /**
     * API to check for resource name availability. A name is available if no other resource exists that has the same
     * SubscriptionId, Resource Name and Type or if one or more such resources exist, each of these must be GC'd and
     * their time of deletion be more than 24 Hours Ago.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param location Location of the resource.
     * @param input Contains information about Resource type and Resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckNameAvailabilityResultInner> checkNameAvailabilityAsync(
        String resourceGroupName, String location, CheckNameAvailabilityParameters input) {
        return checkNameAvailabilityWithResponseAsync(resourceGroupName, location, input)
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
     * API to check for resource name availability. A name is available if no other resource exists that has the same
     * SubscriptionId, Resource Name and Type or if one or more such resources exist, each of these must be GC'd and
     * their time of deletion be more than 24 Hours Ago.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param location Location of the resource.
     * @param input Contains information about Resource type and Resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityResultInner checkNameAvailability(
        String resourceGroupName, String location, CheckNameAvailabilityParameters input) {
        return checkNameAvailabilityAsync(resourceGroupName, location, input).block();
    }

    /**
     * API to check for resource name availability. A name is available if no other resource exists that has the same
     * SubscriptionId, Resource Name and Type or if one or more such resources exist, each of these must be GC'd and
     * their time of deletion be more than 24 Hours Ago.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param location Location of the resource.
     * @param input Contains information about Resource type and Resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckNameAvailabilityResultInner> checkNameAvailabilityWithResponse(
        String resourceGroupName, String location, CheckNameAvailabilityParameters input, Context context) {
        return checkNameAvailabilityWithResponseAsync(resourceGroupName, location, input, context).block();
    }
}
