// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

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
import com.azure.resourcemanager.eventgrid.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.eventgrid.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.eventgrid.models.PrivateLinkResourcesListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient. */
public final class PrivateLinkResourcesClientImpl implements PrivateLinkResourcesClient {
    private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PrivateLinkResourcesService service;

    /** The service client containing this operation class. */
    private final EventGridManagementClientImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrivateLinkResourcesClientImpl(EventGridManagementClientImpl client) {
        this.service =
            RestProxy
                .create(PrivateLinkResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for EventGridManagementClientPrivateLinkResources to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "EventGridManagementC")
    private interface PrivateLinkResourcesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid"
                + "/{parentType}/{parentName}/privateLinkResources/{privateLinkResourceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("parentType") String parentType,
            @PathParam("parentName") String parentName,
            @PathParam("privateLinkResourceName") String privateLinkResourceName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid"
                + "/{parentType}/{parentName}/privateLinkResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourcesListResult>> listByResource(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("parentType") String parentType,
            @PathParam("parentName") String parentName,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$filter") String filter,
            @QueryParam("$top") Integer top,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourcesListResult>> listByResourceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get properties of a private link resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @param privateLinkResourceName The name of private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a private link resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourceInner>> getWithResponseAsync(
        String resourceGroupName, String parentType, String parentName, String privateLinkResourceName) {
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
        if (parentType == null) {
            return Mono.error(new IllegalArgumentException("Parameter parentType is required and cannot be null."));
        }
        if (parentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter parentName is required and cannot be null."));
        }
        if (privateLinkResourceName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter privateLinkResourceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            parentType,
                            parentName,
                            privateLinkResourceName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get properties of a private link resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @param privateLinkResourceName The name of private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a private link resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourceInner>> getWithResponseAsync(
        String resourceGroupName,
        String parentType,
        String parentName,
        String privateLinkResourceName,
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
        if (parentType == null) {
            return Mono.error(new IllegalArgumentException("Parameter parentType is required and cannot be null."));
        }
        if (parentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter parentName is required and cannot be null."));
        }
        if (privateLinkResourceName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter privateLinkResourceName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                parentType,
                parentName,
                privateLinkResourceName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Get properties of a private link resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @param privateLinkResourceName The name of private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a private link resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateLinkResourceInner> getAsync(
        String resourceGroupName, String parentType, String parentName, String privateLinkResourceName) {
        return getWithResponseAsync(resourceGroupName, parentType, parentName, privateLinkResourceName)
            .flatMap(
                (Response<PrivateLinkResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get properties of a private link resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @param privateLinkResourceName The name of private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a private link resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkResourceInner get(
        String resourceGroupName, String parentType, String parentName, String privateLinkResourceName) {
        return getAsync(resourceGroupName, parentType, parentName, privateLinkResourceName).block();
    }

    /**
     * Get properties of a private link resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @param privateLinkResourceName The name of private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a private link resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateLinkResourceInner> getWithResponse(
        String resourceGroupName,
        String parentType,
        String parentName,
        String privateLinkResourceName,
        Context context) {
        return getWithResponseAsync(resourceGroupName, parentType, parentName, privateLinkResourceName, context)
            .block();
    }

    /**
     * List all the private link resources under a topic or domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List private link resources operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateLinkResourceInner>> listByResourceSinglePageAsync(
        String resourceGroupName, String parentType, String parentName, String filter, Integer top) {
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
        if (parentType == null) {
            return Mono.error(new IllegalArgumentException("Parameter parentType is required and cannot be null."));
        }
        if (parentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter parentName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByResource(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            parentType,
                            parentName,
                            this.client.getApiVersion(),
                            filter,
                            top,
                            accept,
                            context))
            .<PagedResponse<PrivateLinkResourceInner>>map(
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
     * List all the private link resources under a topic or domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List private link resources operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateLinkResourceInner>> listByResourceSinglePageAsync(
        String resourceGroupName, String parentType, String parentName, String filter, Integer top, Context context) {
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
        if (parentType == null) {
            return Mono.error(new IllegalArgumentException("Parameter parentType is required and cannot be null."));
        }
        if (parentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter parentName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByResource(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                parentType,
                parentName,
                this.client.getApiVersion(),
                filter,
                top,
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
     * List all the private link resources under a topic or domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List private link resources operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PrivateLinkResourceInner> listByResourceAsync(
        String resourceGroupName, String parentType, String parentName, String filter, Integer top) {
        return new PagedFlux<>(
            () -> listByResourceSinglePageAsync(resourceGroupName, parentType, parentName, filter, top),
            nextLink -> listByResourceNextSinglePageAsync(nextLink));
    }

    /**
     * List all the private link resources under a topic or domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List private link resources operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PrivateLinkResourceInner> listByResourceAsync(
        String resourceGroupName, String parentType, String parentName) {
        final String filter = null;
        final Integer top = null;
        return new PagedFlux<>(
            () -> listByResourceSinglePageAsync(resourceGroupName, parentType, parentName, filter, top),
            nextLink -> listByResourceNextSinglePageAsync(nextLink));
    }

    /**
     * List all the private link resources under a topic or domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List private link resources operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PrivateLinkResourceInner> listByResourceAsync(
        String resourceGroupName, String parentType, String parentName, String filter, Integer top, Context context) {
        return new PagedFlux<>(
            () -> listByResourceSinglePageAsync(resourceGroupName, parentType, parentName, filter, top, context),
            nextLink -> listByResourceNextSinglePageAsync(nextLink, context));
    }

    /**
     * List all the private link resources under a topic or domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List private link resources operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateLinkResourceInner> listByResource(
        String resourceGroupName, String parentType, String parentName) {
        final String filter = null;
        final Integer top = null;
        return new PagedIterable<>(listByResourceAsync(resourceGroupName, parentType, parentName, filter, top));
    }

    /**
     * List all the private link resources under a topic or domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List private link resources operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateLinkResourceInner> listByResource(
        String resourceGroupName, String parentType, String parentName, String filter, Integer top, Context context) {
        return new PagedIterable<>(
            listByResourceAsync(resourceGroupName, parentType, parentName, filter, top, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List private link resources operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateLinkResourceInner>> listByResourceNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listByResourceNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<PrivateLinkResourceInner>>map(
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
     * @return result of the List private link resources operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateLinkResourceInner>> listByResourceNextSinglePageAsync(
        String nextLink, Context context) {
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
            .listByResourceNext(nextLink, this.client.getEndpoint(), accept, context)
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
