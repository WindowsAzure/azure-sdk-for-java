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
import com.azure.core.management.CloudException;
import com.azure.management.monitor.ErrorResponseException;
import com.azure.management.monitor.LogProfileResourcePatch;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * LogProfiles.
 */
public final class LogProfilesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private LogProfilesService service;

    /**
     * The service client containing this operation class.
     */
    private MonitorClientImpl client;

    /**
     * Initializes an instance of LogProfilesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    LogProfilesInner(MonitorClientImpl client) {
        this.service = RestProxy.create(LogProfilesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientLogProfiles to
     * be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientLogProfiles")
    private interface LogProfilesService {
        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/providers/microsoft.insights/logprofiles/{logProfileName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("logProfileName") String logProfileName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/microsoft.insights/logprofiles/{logProfileName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<LogProfileResourceInner>> get(@HostParam("$host") String host, @PathParam("logProfileName") String logProfileName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/providers/microsoft.insights/logprofiles/{logProfileName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LogProfileResourceInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("logProfileName") String logProfileName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") LogProfileResourceInner parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/providers/microsoft.insights/logprofiles/{logProfileName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<LogProfileResourceInner>> update(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("logProfileName") String logProfileName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") LogProfileResourcePatch logProfilesResource);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/microsoft.insights/logprofiles")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LogProfileCollectionInner>> list(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);
    }

    /**
     * Deletes the log profile.
     * 
     * @param logProfileName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String logProfileName) {
        final String apiVersion = "2016-03-01";
        return service.delete(this.client.getHost(), logProfileName, apiVersion, this.client.getSubscriptionId());
    }

    /**
     * Deletes the log profile.
     * 
     * @param logProfileName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String logProfileName) {
        return deleteWithResponseAsync(logProfileName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the log profile.
     * 
     * @param logProfileName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String logProfileName) {
        deleteAsync(logProfileName).block();
    }

    /**
     * Gets the log profile.
     * 
     * @param logProfileName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LogProfileResourceInner>> getWithResponseAsync(String logProfileName) {
        final String apiVersion = "2016-03-01";
        return service.get(this.client.getHost(), logProfileName, apiVersion, this.client.getSubscriptionId());
    }

    /**
     * Gets the log profile.
     * 
     * @param logProfileName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogProfileResourceInner> getAsync(String logProfileName) {
        return getWithResponseAsync(logProfileName)
            .flatMap((SimpleResponse<LogProfileResourceInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the log profile.
     * 
     * @param logProfileName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogProfileResourceInner get(String logProfileName) {
        return getAsync(logProfileName).block();
    }

    /**
     * Create or update a log profile in Azure Monitoring REST API.
     * 
     * @param logProfileName 
     * @param parameters The log profile resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LogProfileResourceInner>> createOrUpdateWithResponseAsync(String logProfileName, LogProfileResourceInner parameters) {
        final String apiVersion = "2016-03-01";
        return service.createOrUpdate(this.client.getHost(), logProfileName, apiVersion, this.client.getSubscriptionId(), parameters);
    }

    /**
     * Create or update a log profile in Azure Monitoring REST API.
     * 
     * @param logProfileName 
     * @param parameters The log profile resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogProfileResourceInner> createOrUpdateAsync(String logProfileName, LogProfileResourceInner parameters) {
        return createOrUpdateWithResponseAsync(logProfileName, parameters)
            .flatMap((SimpleResponse<LogProfileResourceInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Create or update a log profile in Azure Monitoring REST API.
     * 
     * @param logProfileName 
     * @param parameters The log profile resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogProfileResourceInner createOrUpdate(String logProfileName, LogProfileResourceInner parameters) {
        return createOrUpdateAsync(logProfileName, parameters).block();
    }

    /**
     * Updates an existing LogProfilesResource. To update other fields use the CreateOrUpdate method.
     * 
     * @param logProfileName 
     * @param logProfilesResource The log profile resource for patch operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LogProfileResourceInner>> updateWithResponseAsync(String logProfileName, LogProfileResourcePatch logProfilesResource) {
        final String apiVersion = "2016-03-01";
        return service.update(this.client.getHost(), this.client.getSubscriptionId(), logProfileName, apiVersion, logProfilesResource);
    }

    /**
     * Updates an existing LogProfilesResource. To update other fields use the CreateOrUpdate method.
     * 
     * @param logProfileName 
     * @param logProfilesResource The log profile resource for patch operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogProfileResourceInner> updateAsync(String logProfileName, LogProfileResourcePatch logProfilesResource) {
        return updateWithResponseAsync(logProfileName, logProfilesResource)
            .flatMap((SimpleResponse<LogProfileResourceInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates an existing LogProfilesResource. To update other fields use the CreateOrUpdate method.
     * 
     * @param logProfileName 
     * @param logProfilesResource The log profile resource for patch operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogProfileResourceInner update(String logProfileName, LogProfileResourcePatch logProfilesResource) {
        return updateAsync(logProfileName, logProfilesResource).block();
    }

    /**
     * List the log profiles.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LogProfileResourceInner>> listSinglePageAsync() {
        final String apiVersion = "2016-03-01";
        return service.list(this.client.getHost(), apiVersion, this.client.getSubscriptionId())
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                null,
                null));
    }

    /**
     * List the log profiles.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LogProfileResourceInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync());
    }

    /**
     * List the log profiles.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LogProfileResourceInner> list() {
        return new PagedIterable<>(listAsync());
    }
}
