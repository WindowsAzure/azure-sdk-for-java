// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedServerSecurityAlertPolicies.
 */
public final class ManagedServerSecurityAlertPoliciesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ManagedServerSecurityAlertPoliciesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedServerSecurityAlertPoliciesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ManagedServerSecurityAlertPoliciesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(ManagedServerSecurityAlertPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientManagedServerSecurityAlertPolicies to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientManagedServerSecurityAlertPolicies")
    private interface ManagedServerSecurityAlertPoliciesService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedServerSecurityAlertPolicyInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("securityAlertPolicyName") String securityAlertPolicyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("securityAlertPolicyName") String securityAlertPolicyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") ManagedServerSecurityAlertPolicyInner parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/securityAlertPolicies")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedServerSecurityAlertPolicyListResultInner>> listByInstance(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedServerSecurityAlertPolicyInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("securityAlertPolicyName") String securityAlertPolicyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") ManagedServerSecurityAlertPolicyInner parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedServerSecurityAlertPolicyListResultInner>> listByInstanceNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Get a managed server's threat detection policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagedServerSecurityAlertPolicyInner>> getWithResponseAsync(String resourceGroupName, String managedInstanceName) {
        final String securityAlertPolicyName = "Default";
        final String apiVersion = "2017-03-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, managedInstanceName, securityAlertPolicyName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Get a managed server's threat detection policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedServerSecurityAlertPolicyInner> getAsync(String resourceGroupName, String managedInstanceName) {
        return getWithResponseAsync(resourceGroupName, managedInstanceName)
            .flatMap((SimpleResponse<ManagedServerSecurityAlertPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Get a managed server's threat detection policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedServerSecurityAlertPolicyInner get(String resourceGroupName, String managedInstanceName) {
        return getAsync(resourceGroupName, managedInstanceName).block();
    }

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters A managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters) {
        final String securityAlertPolicyName = "Default";
        final String apiVersion = "2017-03-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, managedInstanceName, securityAlertPolicyName, this.client.getSubscriptionId(), apiVersion, parameters);
    }

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters A managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedServerSecurityAlertPolicyInner> createOrUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono = createOrUpdateWithResponseAsync(resourceGroupName, managedInstanceName, parameters);
        return this.client.<ManagedServerSecurityAlertPolicyInner, ManagedServerSecurityAlertPolicyInner>getLroResultAsync(mono, this.client.getHttpPipeline(), ManagedServerSecurityAlertPolicyInner.class, ManagedServerSecurityAlertPolicyInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters A managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedServerSecurityAlertPolicyInner createOrUpdate(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, managedInstanceName, parameters).block();
    }

    /**
     * Get the managed server's threat detection policies.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedServerSecurityAlertPolicyInner>> listByInstanceSinglePageAsync(String resourceGroupName, String managedInstanceName) {
        final String apiVersion = "2017-03-01-preview";
        return service.listByInstance(this.client.getHost(), resourceGroupName, managedInstanceName, this.client.getSubscriptionId(), apiVersion)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null));
    }

    /**
     * Get the managed server's threat detection policies.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ManagedServerSecurityAlertPolicyInner> listByInstanceAsync(String resourceGroupName, String managedInstanceName) {
        return new PagedFlux<>(
            () -> listByInstanceSinglePageAsync(resourceGroupName, managedInstanceName),
            nextLink -> listByInstanceNextSinglePageAsync(nextLink));
    }

    /**
     * Get the managed server's threat detection policies.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedServerSecurityAlertPolicyInner> listByInstance(String resourceGroupName, String managedInstanceName) {
        return new PagedIterable<>(listByInstanceAsync(resourceGroupName, managedInstanceName));
    }

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters A managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagedServerSecurityAlertPolicyInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters) {
        final String securityAlertPolicyName = "Default";
        final String apiVersion = "2017-03-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, managedInstanceName, securityAlertPolicyName, this.client.getSubscriptionId(), apiVersion, parameters);
    }

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters A managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedServerSecurityAlertPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, managedInstanceName, parameters)
            .flatMap((SimpleResponse<ManagedServerSecurityAlertPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a threat detection policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param parameters A managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedServerSecurityAlertPolicyInner beginCreateOrUpdate(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, managedInstanceName, parameters).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedServerSecurityAlertPolicyInner>> listByInstanceNextSinglePageAsync(String nextLink) {
        return service.listByInstanceNext(nextLink)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null));
    }
}
