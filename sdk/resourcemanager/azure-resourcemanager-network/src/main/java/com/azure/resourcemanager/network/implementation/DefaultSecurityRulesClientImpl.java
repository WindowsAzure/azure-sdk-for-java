// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

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
import com.azure.resourcemanager.network.fluent.DefaultSecurityRulesClient;
import com.azure.resourcemanager.network.fluent.models.SecurityRuleInner;
import com.azure.resourcemanager.network.models.SecurityRuleListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DefaultSecurityRulesClient. */
public final class DefaultSecurityRulesClientImpl implements DefaultSecurityRulesClient {
    private final ClientLogger logger = new ClientLogger(DefaultSecurityRulesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DefaultSecurityRulesService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of DefaultSecurityRulesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DefaultSecurityRulesClientImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(DefaultSecurityRulesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientDefaultSecurityRules to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface DefaultSecurityRulesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/networkSecurityGroups/{networkSecurityGroupName}/defaultSecurityRules")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SecurityRuleListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("networkSecurityGroupName") String networkSecurityGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/networkSecurityGroups/{networkSecurityGroupName}/defaultSecurityRules/{defaultSecurityRuleName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SecurityRuleInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("networkSecurityGroupName") String networkSecurityGroupName,
            @PathParam("defaultSecurityRuleName") String defaultSecurityRuleName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SecurityRuleListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all default security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecurityRuleInner>> listSinglePageAsync(
        String resourceGroupName, String networkSecurityGroupName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkSecurityGroupName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter networkSecurityGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2021-02-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            networkSecurityGroupName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .<PagedResponse<SecurityRuleInner>>map(
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
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all default security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecurityRuleInner>> listSinglePageAsync(
        String resourceGroupName, String networkSecurityGroupName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkSecurityGroupName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter networkSecurityGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2021-02-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                resourceGroupName,
                networkSecurityGroupName,
                apiVersion,
                this.client.getSubscriptionId(),
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
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all default security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SecurityRuleInner> listAsync(String resourceGroupName, String networkSecurityGroupName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, networkSecurityGroupName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all default security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SecurityRuleInner> listAsync(
        String resourceGroupName, String networkSecurityGroupName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, networkSecurityGroupName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all default security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SecurityRuleInner> list(String resourceGroupName, String networkSecurityGroupName) {
        return new PagedIterable<>(listAsync(resourceGroupName, networkSecurityGroupName));
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all default security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SecurityRuleInner> list(
        String resourceGroupName, String networkSecurityGroupName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, networkSecurityGroupName, context));
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified default network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecurityRuleInner>> getWithResponseAsync(
        String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkSecurityGroupName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter networkSecurityGroupName is required and cannot be null."));
        }
        if (defaultSecurityRuleName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter defaultSecurityRuleName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2021-02-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            networkSecurityGroupName,
                            defaultSecurityRuleName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified default network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SecurityRuleInner>> getWithResponseAsync(
        String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkSecurityGroupName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter networkSecurityGroupName is required and cannot be null."));
        }
        if (defaultSecurityRuleName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter defaultSecurityRuleName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2021-02-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                networkSecurityGroupName,
                defaultSecurityRuleName,
                apiVersion,
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified default network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityRuleInner> getAsync(
        String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName) {
        return getWithResponseAsync(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName)
            .flatMap(
                (Response<SecurityRuleInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified default network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SecurityRuleInner get(
        String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName) {
        return getAsync(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName).block();
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified default network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SecurityRuleInner> getWithResponse(
        String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName, Context context) {
        return getWithResponseAsync(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName, context)
            .block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityRule API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecurityRuleInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<SecurityRuleInner>>map(
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
     * @return response for ListSecurityRule API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecurityRuleInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
