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
import com.azure.management.monitor.ActivityLogAlertPatchBody;
import com.azure.management.monitor.ErrorResponseException;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ActivityLogAlerts.
 */
public final class ActivityLogAlertsInner implements InnerSupportsGet<ActivityLogAlertResourceInner>, InnerSupportsListing<ActivityLogAlertResourceInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private ActivityLogAlertsService service;

    /**
     * The service client containing this operation class.
     */
    private MonitorClientImpl client;

    /**
     * Initializes an instance of ActivityLogAlertsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ActivityLogAlertsInner(MonitorClientImpl client) {
        this.service = RestProxy.create(ActivityLogAlertsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * MonitorClientActivityLogAlerts to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientActivityLogAlerts")
    private interface ActivityLogAlertsService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/activityLogAlerts/{activityLogAlertName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<ActivityLogAlertResourceInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("activityLogAlertName") String activityLogAlertName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") ActivityLogAlertResourceInner activityLogAlert);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/activityLogAlerts/{activityLogAlertName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<ActivityLogAlertResourceInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("activityLogAlertName") String activityLogAlertName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/activityLogAlerts/{activityLogAlertName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("activityLogAlertName") String activityLogAlertName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/activityLogAlerts/{activityLogAlertName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<ActivityLogAlertResourceInner>> update(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("activityLogAlertName") String activityLogAlertName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") ActivityLogAlertPatchBody activityLogAlertPatch);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/microsoft.insights/activityLogAlerts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<ActivityLogAlertListInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/activityLogAlerts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<ActivityLogAlertListInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Create a new activity log alert or update an existing one.
     * 
     * @param resourceGroupName 
     * @param activityLogAlertName 
     * @param activityLogAlert An activity log alert resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ActivityLogAlertResourceInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String activityLogAlertName, ActivityLogAlertResourceInner activityLogAlert) {
        final String apiVersion = "2017-04-01";
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, activityLogAlertName, apiVersion, activityLogAlert);
    }

    /**
     * Create a new activity log alert or update an existing one.
     * 
     * @param resourceGroupName 
     * @param activityLogAlertName 
     * @param activityLogAlert An activity log alert resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ActivityLogAlertResourceInner> createOrUpdateAsync(String resourceGroupName, String activityLogAlertName, ActivityLogAlertResourceInner activityLogAlert) {
        return createOrUpdateWithResponseAsync(resourceGroupName, activityLogAlertName, activityLogAlert)
            .flatMap((SimpleResponse<ActivityLogAlertResourceInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Create a new activity log alert or update an existing one.
     * 
     * @param resourceGroupName 
     * @param activityLogAlertName 
     * @param activityLogAlert An activity log alert resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ActivityLogAlertResourceInner createOrUpdate(String resourceGroupName, String activityLogAlertName, ActivityLogAlertResourceInner activityLogAlert) {
        return createOrUpdateAsync(resourceGroupName, activityLogAlertName, activityLogAlert).block();
    }

    /**
     * Get an activity log alert.
     * 
     * @param resourceGroupName 
     * @param activityLogAlertName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ActivityLogAlertResourceInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String activityLogAlertName) {
        final String apiVersion = "2017-04-01";
        return service.getByResourceGroup(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, activityLogAlertName, apiVersion);
    }

    /**
     * Get an activity log alert.
     * 
     * @param resourceGroupName 
     * @param activityLogAlertName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ActivityLogAlertResourceInner> getByResourceGroupAsync(String resourceGroupName, String activityLogAlertName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, activityLogAlertName)
            .flatMap((SimpleResponse<ActivityLogAlertResourceInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Get an activity log alert.
     * 
     * @param resourceGroupName 
     * @param activityLogAlertName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ActivityLogAlertResourceInner getByResourceGroup(String resourceGroupName, String activityLogAlertName) {
        return getByResourceGroupAsync(resourceGroupName, activityLogAlertName).block();
    }

    /**
     * Delete an activity log alert.
     * 
     * @param resourceGroupName 
     * @param activityLogAlertName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String activityLogAlertName) {
        final String apiVersion = "2017-04-01";
        return service.delete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, activityLogAlertName, apiVersion);
    }

    /**
     * Delete an activity log alert.
     * 
     * @param resourceGroupName 
     * @param activityLogAlertName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String activityLogAlertName) {
        return deleteWithResponseAsync(resourceGroupName, activityLogAlertName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete an activity log alert.
     * 
     * @param resourceGroupName 
     * @param activityLogAlertName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String activityLogAlertName) {
        deleteAsync(resourceGroupName, activityLogAlertName).block();
    }

    /**
     * Updates an existing ActivityLogAlertResource's tags. To update other fields use the CreateOrUpdate method.
     * 
     * @param resourceGroupName 
     * @param activityLogAlertName 
     * @param activityLogAlertPatch An activity log alert object for the body of patch operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ActivityLogAlertResourceInner>> updateWithResponseAsync(String resourceGroupName, String activityLogAlertName, ActivityLogAlertPatchBody activityLogAlertPatch) {
        final String apiVersion = "2017-04-01";
        return service.update(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, activityLogAlertName, apiVersion, activityLogAlertPatch);
    }

    /**
     * Updates an existing ActivityLogAlertResource's tags. To update other fields use the CreateOrUpdate method.
     * 
     * @param resourceGroupName 
     * @param activityLogAlertName 
     * @param activityLogAlertPatch An activity log alert object for the body of patch operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ActivityLogAlertResourceInner> updateAsync(String resourceGroupName, String activityLogAlertName, ActivityLogAlertPatchBody activityLogAlertPatch) {
        return updateWithResponseAsync(resourceGroupName, activityLogAlertName, activityLogAlertPatch)
            .flatMap((SimpleResponse<ActivityLogAlertResourceInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates an existing ActivityLogAlertResource's tags. To update other fields use the CreateOrUpdate method.
     * 
     * @param resourceGroupName 
     * @param activityLogAlertName 
     * @param activityLogAlertPatch An activity log alert object for the body of patch operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ActivityLogAlertResourceInner update(String resourceGroupName, String activityLogAlertName, ActivityLogAlertPatchBody activityLogAlertPatch) {
        return updateAsync(resourceGroupName, activityLogAlertName, activityLogAlertPatch).block();
    }

    /**
     * Get a list of all activity log alerts in a subscription.
     * 
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ActivityLogAlertResourceInner>> listSinglePageAsync() {
        final String apiVersion = "2017-04-01";
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), apiVersion)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                null,
                null));
    }

    /**
     * Get a list of all activity log alerts in a subscription.
     * 
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ActivityLogAlertResourceInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync());
    }

    /**
     * Get a list of all activity log alerts in a subscription.
     * 
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ActivityLogAlertResourceInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Get a list of all activity log alerts in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ActivityLogAlertResourceInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2017-04-01";
        return service.listByResourceGroup(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, apiVersion)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                null,
                null));
    }

    /**
     * Get a list of all activity log alerts in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ActivityLogAlertResourceInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName));
    }

    /**
     * Get a list of all activity log alerts in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ActivityLogAlertResourceInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }
}
