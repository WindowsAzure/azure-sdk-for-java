// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * SecurityRules.
 */
public final class SecurityRulesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private SecurityRulesService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of SecurityRulesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public SecurityRulesInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(SecurityRulesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientSecurityRules to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientSecurityRules")
    private interface SecurityRulesService {
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}/securityRules/{securityRuleName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("networkSecurityGroupName") String networkSecurityGroupName, @PathParam("securityRuleName") String securityRuleName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}/securityRules/{securityRuleName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SecurityRuleInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("networkSecurityGroupName") String networkSecurityGroupName, @PathParam("securityRuleName") String securityRuleName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}/securityRules/{securityRuleName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("networkSecurityGroupName") String networkSecurityGroupName, @PathParam("securityRuleName") String securityRuleName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") SecurityRuleInner securityRuleParameters, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}/securityRules")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SecurityRuleListResultInner>> list(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("networkSecurityGroupName") String networkSecurityGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}/securityRules/{securityRuleName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("networkSecurityGroupName") String networkSecurityGroupName, @PathParam("securityRuleName") String securityRuleName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}/securityRules/{securityRuleName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SecurityRuleInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("networkSecurityGroupName") String networkSecurityGroupName, @PathParam("securityRuleName") String securityRuleName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") SecurityRuleInner securityRuleParameters, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SecurityRuleListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Deletes the specified network security rule.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), resourceGroupName, networkSecurityGroupName, securityRuleName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified network security rule.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, networkSecurityGroupName, securityRuleName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified network security rule.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        deleteAsync(resourceGroupName, networkSecurityGroupName, securityRuleName).block();
    }

    /**
     * Get the specified network security rule.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SecurityRuleInner>> getWithResponseAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        final String apiVersion = "2019-06-01";
        return service.get(this.client.getHost(), resourceGroupName, networkSecurityGroupName, securityRuleName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Get the specified network security rule.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityRuleInner> getAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        return getWithResponseAsync(resourceGroupName, networkSecurityGroupName, securityRuleName)
            .flatMap((SimpleResponse<SecurityRuleInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Get the specified network security rule.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SecurityRuleInner get(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        return getAsync(resourceGroupName, networkSecurityGroupName, securityRuleName).block();
    }

    /**
     * Creates or updates a security rule in the specified network security group.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @param securityRuleParameters Network security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, SecurityRuleInner securityRuleParameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, networkSecurityGroupName, securityRuleName, this.client.getSubscriptionId(), securityRuleParameters, apiVersion);
    }

    /**
     * Creates or updates a security rule in the specified network security group.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @param securityRuleParameters Network security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityRuleInner> createOrUpdateAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, SecurityRuleInner securityRuleParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, networkSecurityGroupName, securityRuleName, securityRuleParameters);
        return client.<SecurityRuleInner, SecurityRuleInner>getLroResultAsync(response, client.getHttpPipeline(), SecurityRuleInner.class, SecurityRuleInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a security rule in the specified network security group.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @param securityRuleParameters Network security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SecurityRuleInner createOrUpdate(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, SecurityRuleInner securityRuleParameters) {
        return createOrUpdateAsync(resourceGroupName, networkSecurityGroupName, securityRuleName, securityRuleParameters).block();
    }

    /**
     * Gets all security rules in a network security group.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SecurityRuleInner>> listSinglePageAsync(String resourceGroupName, String networkSecurityGroupName) {
        final String apiVersion = "2019-06-01";
        return service.list(this.client.getHost(), resourceGroupName, networkSecurityGroupName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all security rules in a network security group.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SecurityRuleInner> listAsync(String resourceGroupName, String networkSecurityGroupName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, networkSecurityGroupName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all security rules in a network security group.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SecurityRuleInner> list(String resourceGroupName, String networkSecurityGroupName) {
        return new PagedIterable<>(listAsync(resourceGroupName, networkSecurityGroupName));
    }

    /**
     * Deletes the specified network security rule.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, networkSecurityGroupName, securityRuleName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified network security rule.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        return beginDeleteWithResponseAsync(resourceGroupName, networkSecurityGroupName, securityRuleName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified network security rule.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        beginDeleteAsync(resourceGroupName, networkSecurityGroupName, securityRuleName).block();
    }

    /**
     * Creates or updates a security rule in the specified network security group.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @param securityRuleParameters Network security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SecurityRuleInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, SecurityRuleInner securityRuleParameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, networkSecurityGroupName, securityRuleName, this.client.getSubscriptionId(), securityRuleParameters, apiVersion);
    }

    /**
     * Creates or updates a security rule in the specified network security group.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @param securityRuleParameters Network security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityRuleInner> beginCreateOrUpdateAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, SecurityRuleInner securityRuleParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, networkSecurityGroupName, securityRuleName, securityRuleParameters)
            .flatMap((SimpleResponse<SecurityRuleInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a security rule in the specified network security group.
     * 
     * @param resourceGroupName 
     * @param networkSecurityGroupName 
     * @param securityRuleName 
     * @param securityRuleParameters Network security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SecurityRuleInner beginCreateOrUpdate(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, SecurityRuleInner securityRuleParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, networkSecurityGroupName, securityRuleName, securityRuleParameters).block();
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
    public Mono<PagedResponse<SecurityRuleInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
