// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
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
import com.azure.management.monitor.ErrorResponseException;
import com.azure.management.monitor.LogSearchRuleResourcePatch;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ScheduledQueryRules.
 */
public final class ScheduledQueryRulesInner implements InnerSupportsGet<LogSearchRuleResourceInner>, InnerSupportsListing<LogSearchRuleResourceInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private ScheduledQueryRulesService service;

    /**
     * The service client containing this operation class.
     */
    private MonitorClientImpl client;

    /**
     * Initializes an instance of ScheduledQueryRulesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ScheduledQueryRulesInner(MonitorClientImpl client) {
        this.service = RestProxy.create(ScheduledQueryRulesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * MonitorClientScheduledQueryRules to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientScheduledQueryRules")
    private interface ScheduledQueryRulesService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/microsoft.insights/scheduledQueryRules/{ruleName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<LogSearchRuleResourceInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("ruleName") String ruleName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") LogSearchRuleResourceInner parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/microsoft.insights/scheduledQueryRules/{ruleName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<LogSearchRuleResourceInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("ruleName") String ruleName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/microsoft.insights/scheduledQueryRules/{ruleName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<LogSearchRuleResourceInner>> update(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("ruleName") String ruleName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") LogSearchRuleResourcePatch parameters);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/microsoft.insights/scheduledQueryRules/{ruleName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("ruleName") String ruleName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/microsoft.insights/scheduledQueryRules")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<LogSearchRuleResourceCollectionInner>> list(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @QueryParam("$filter") String filter, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/microsoft.insights/scheduledQueryRules")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<LogSearchRuleResourceCollectionInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @QueryParam("$filter") String filter, @PathParam("subscriptionId") String subscriptionId);
    }

    /**
     * Creates or updates an log search rule.
     * 
     * @param resourceGroupName 
     * @param ruleName 
     * @param parameters The Log Search Rule resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LogSearchRuleResourceInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String ruleName, LogSearchRuleResourceInner parameters) {
        final String apiVersion = "2018-04-16";
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, ruleName, apiVersion, parameters);
    }

    /**
     * Creates or updates an log search rule.
     * 
     * @param resourceGroupName 
     * @param ruleName 
     * @param parameters The Log Search Rule resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogSearchRuleResourceInner> createOrUpdateAsync(String resourceGroupName, String ruleName, LogSearchRuleResourceInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, ruleName, parameters)
            .flatMap((SimpleResponse<LogSearchRuleResourceInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates an log search rule.
     * 
     * @param resourceGroupName 
     * @param ruleName 
     * @param parameters The Log Search Rule resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogSearchRuleResourceInner createOrUpdate(String resourceGroupName, String ruleName, LogSearchRuleResourceInner parameters) {
        return createOrUpdateAsync(resourceGroupName, ruleName, parameters).block();
    }

    /**
     * Gets an Log Search rule.
     * 
     * @param resourceGroupName 
     * @param ruleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LogSearchRuleResourceInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String ruleName) {
        final String apiVersion = "2018-04-16";
        return service.getByResourceGroup(this.client.getHost(), resourceGroupName, ruleName, apiVersion, this.client.getSubscriptionId());
    }

    /**
     * Gets an Log Search rule.
     * 
     * @param resourceGroupName 
     * @param ruleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogSearchRuleResourceInner> getByResourceGroupAsync(String resourceGroupName, String ruleName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, ruleName)
            .flatMap((SimpleResponse<LogSearchRuleResourceInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets an Log Search rule.
     * 
     * @param resourceGroupName 
     * @param ruleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogSearchRuleResourceInner getByResourceGroup(String resourceGroupName, String ruleName) {
        return getByResourceGroupAsync(resourceGroupName, ruleName).block();
    }

    /**
     * Update log search Rule.
     * 
     * @param resourceGroupName 
     * @param ruleName 
     * @param parameters The log search rule resource for patch operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LogSearchRuleResourceInner>> updateWithResponseAsync(String resourceGroupName, String ruleName, LogSearchRuleResourcePatch parameters) {
        final String apiVersion = "2018-04-16";
        return service.update(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, ruleName, apiVersion, parameters);
    }

    /**
     * Update log search Rule.
     * 
     * @param resourceGroupName 
     * @param ruleName 
     * @param parameters The log search rule resource for patch operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogSearchRuleResourceInner> updateAsync(String resourceGroupName, String ruleName, LogSearchRuleResourcePatch parameters) {
        return updateWithResponseAsync(resourceGroupName, ruleName, parameters)
            .flatMap((SimpleResponse<LogSearchRuleResourceInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Update log search Rule.
     * 
     * @param resourceGroupName 
     * @param ruleName 
     * @param parameters The log search rule resource for patch operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogSearchRuleResourceInner update(String resourceGroupName, String ruleName, LogSearchRuleResourcePatch parameters) {
        return updateAsync(resourceGroupName, ruleName, parameters).block();
    }

    /**
     * Deletes a Log Search rule.
     * 
     * @param resourceGroupName 
     * @param ruleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String ruleName) {
        final String apiVersion = "2018-04-16";
        return service.delete(this.client.getHost(), resourceGroupName, ruleName, apiVersion, this.client.getSubscriptionId());
    }

    /**
     * Deletes a Log Search rule.
     * 
     * @param resourceGroupName 
     * @param ruleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String ruleName) {
        return deleteWithResponseAsync(resourceGroupName, ruleName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a Log Search rule.
     * 
     * @param resourceGroupName 
     * @param ruleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String ruleName) {
        deleteAsync(resourceGroupName, ruleName).block();
    }

    /**
     * List the Log Search rules within a subscription group.
     * 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LogSearchRuleResourceInner>> listSinglePageAsync(String filter) {
        final String apiVersion = "2018-04-16";
        return service.list(this.client.getHost(), apiVersion, filter, this.client.getSubscriptionId())
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                null,
                null));
    }

    /**
     * List the Log Search rules within a subscription group.
     * 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LogSearchRuleResourceInner> listAsync(String filter) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter));
    }

    /**
     * List the Log Search rules within a subscription group.
     * 
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LogSearchRuleResourceInner> listAsync() {
        final String filter = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter));
    }

    /**
     * List the Log Search rules within a subscription group.
     * 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LogSearchRuleResourceInner> list(String filter) {
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * List the Log Search rules within a subscription group.
     * 
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LogSearchRuleResourceInner> list() {
        final String filter = null;
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * List the Log Search rules within a resource group.
     * 
     * @param resourceGroupName 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LogSearchRuleResourceInner>> listByResourceGroupSinglePageAsync(String resourceGroupName, String filter) {
        final String apiVersion = "2018-04-16";
        return service.listByResourceGroup(this.client.getHost(), resourceGroupName, apiVersion, filter, this.client.getSubscriptionId())
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                null,
                null));
    }

    /**
     * List the Log Search rules within a resource group.
     * 
     * @param resourceGroupName 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LogSearchRuleResourceInner> listByResourceGroupAsync(String resourceGroupName, String filter) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName, filter));
    }

    /**
     * List the Log Search rules within a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LogSearchRuleResourceInner> listByResourceGroupAsync(String resourceGroupName) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName, filter));
    }

    /**
     * List the Log Search rules within a resource group.
     * 
     * @param resourceGroupName 
     * @param filter 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LogSearchRuleResourceInner> listByResourceGroup(String resourceGroupName, String filter) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName, filter));
    }

    /**
     * List the Log Search rules within a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LogSearchRuleResourceInner> listByResourceGroup(String resourceGroupName) {
        final String filter = null;
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName, filter));
    }
}
