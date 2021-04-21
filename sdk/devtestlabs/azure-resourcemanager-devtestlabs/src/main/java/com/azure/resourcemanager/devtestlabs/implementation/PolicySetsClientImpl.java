// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

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
import com.azure.resourcemanager.devtestlabs.fluent.PolicySetsClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.EvaluatePoliciesResponseInner;
import com.azure.resourcemanager.devtestlabs.models.EvaluatePoliciesRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PolicySetsClient. */
public final class PolicySetsClientImpl implements PolicySetsClient {
    private final ClientLogger logger = new ClientLogger(PolicySetsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PolicySetsService service;

    /** The service client containing this operation class. */
    private final DevTestLabsClientImpl client;

    /**
     * Initializes an instance of PolicySetsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PolicySetsClientImpl(DevTestLabsClientImpl client) {
        this.service =
            RestProxy.create(PolicySetsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DevTestLabsClientPolicySets to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DevTestLabsClientPol")
    private interface PolicySetsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevTestLab/labs"
                + "/{labName}/policysets/{name}/evaluatePolicies")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EvaluatePoliciesResponseInner>> evaluatePolicies(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("labName") String labName,
            @PathParam("name") String name,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") EvaluatePoliciesRequest evaluatePoliciesRequest,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @param evaluatePoliciesRequest Request body for evaluating a policy set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for evaluating a policy set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<EvaluatePoliciesResponseInner>> evaluatePoliciesWithResponseAsync(
        String resourceGroupName, String labName, String name, EvaluatePoliciesRequest evaluatePoliciesRequest) {
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
        if (labName == null) {
            return Mono.error(new IllegalArgumentException("Parameter labName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (evaluatePoliciesRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter evaluatePoliciesRequest is required and cannot be null."));
        } else {
            evaluatePoliciesRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .evaluatePolicies(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            labName,
                            name,
                            this.client.getApiVersion(),
                            evaluatePoliciesRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @param evaluatePoliciesRequest Request body for evaluating a policy set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for evaluating a policy set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<EvaluatePoliciesResponseInner>> evaluatePoliciesWithResponseAsync(
        String resourceGroupName,
        String labName,
        String name,
        EvaluatePoliciesRequest evaluatePoliciesRequest,
        Context context) {
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
        if (labName == null) {
            return Mono.error(new IllegalArgumentException("Parameter labName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (evaluatePoliciesRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter evaluatePoliciesRequest is required and cannot be null."));
        } else {
            evaluatePoliciesRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .evaluatePolicies(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                labName,
                name,
                this.client.getApiVersion(),
                evaluatePoliciesRequest,
                accept,
                context);
    }

    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @param evaluatePoliciesRequest Request body for evaluating a policy set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for evaluating a policy set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<EvaluatePoliciesResponseInner> evaluatePoliciesAsync(
        String resourceGroupName, String labName, String name, EvaluatePoliciesRequest evaluatePoliciesRequest) {
        return evaluatePoliciesWithResponseAsync(resourceGroupName, labName, name, evaluatePoliciesRequest)
            .flatMap(
                (Response<EvaluatePoliciesResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @param evaluatePoliciesRequest Request body for evaluating a policy set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for evaluating a policy set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EvaluatePoliciesResponseInner evaluatePolicies(
        String resourceGroupName, String labName, String name, EvaluatePoliciesRequest evaluatePoliciesRequest) {
        return evaluatePoliciesAsync(resourceGroupName, labName, name, evaluatePoliciesRequest).block();
    }

    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @param evaluatePoliciesRequest Request body for evaluating a policy set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for evaluating a policy set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<EvaluatePoliciesResponseInner> evaluatePoliciesWithResponse(
        String resourceGroupName,
        String labName,
        String name,
        EvaluatePoliciesRequest evaluatePoliciesRequest,
        Context context) {
        return evaluatePoliciesWithResponseAsync(resourceGroupName, labName, name, evaluatePoliciesRequest, context)
            .block();
    }
}
