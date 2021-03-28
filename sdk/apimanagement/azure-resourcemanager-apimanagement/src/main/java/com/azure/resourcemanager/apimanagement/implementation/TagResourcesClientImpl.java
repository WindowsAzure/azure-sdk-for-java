// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

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
import com.azure.resourcemanager.apimanagement.fluent.TagResourcesClient;
import com.azure.resourcemanager.apimanagement.fluent.models.TagResourceContractInner;
import com.azure.resourcemanager.apimanagement.models.TagResourceCollection;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TagResourcesClient. */
public final class TagResourcesClientImpl implements TagResourcesClient {
    private final ClientLogger logger = new ClientLogger(TagResourcesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final TagResourcesService service;

    /** The service client containing this operation class. */
    private final ApiManagementClientImpl client;

    /**
     * Initializes an instance of TagResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    TagResourcesClientImpl(ApiManagementClientImpl client) {
        this.service =
            RestProxy.create(TagResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiManagementClientTagResources to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApiManagementClientT")
    private interface TagResourcesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/tagResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TagResourceCollection>> listByService(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @QueryParam("$filter") String filter,
            @QueryParam("$top") Integer top,
            @QueryParam("$skip") Integer skip,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TagResourceCollection>> listByServiceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists a collection of resources associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| aid | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| name | filter | ge, le, eq, ne, gt, lt
     *     | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| apiName | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| apiRevision | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| path | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| serviceUrl | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| method | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| urlTemplate | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| terms | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| state | filter | eq | |&lt;/br&gt;| isCurrent |
     *     filter | eq | |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TagResourceContractInner>> listByServiceSinglePageAsync(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip) {
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
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
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
                        .listByService(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            filter,
                            top,
                            skip,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .<PagedResponse<TagResourceContractInner>>map(
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
     * Lists a collection of resources associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| aid | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| name | filter | ge, le, eq, ne, gt, lt
     *     | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| apiName | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| apiRevision | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| path | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| serviceUrl | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| method | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| urlTemplate | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| terms | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| state | filter | eq | |&lt;/br&gt;| isCurrent |
     *     filter | eq | |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TagResourceContractInner>> listByServiceSinglePageAsync(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context) {
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
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
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
            .listByService(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                filter,
                top,
                skip,
                this.client.getApiVersion(),
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
     * Lists a collection of resources associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| aid | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| name | filter | ge, le, eq, ne, gt, lt
     *     | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| apiName | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| apiRevision | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| path | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| serviceUrl | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| method | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| urlTemplate | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| terms | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| state | filter | eq | |&lt;/br&gt;| isCurrent |
     *     filter | eq | |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TagResourceContractInner> listByServiceAsync(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip) {
        return new PagedFlux<>(
            () -> listByServiceSinglePageAsync(resourceGroupName, serviceName, filter, top, skip),
            nextLink -> listByServiceNextSinglePageAsync(nextLink));
    }

    /**
     * Lists a collection of resources associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TagResourceContractInner> listByServiceAsync(String resourceGroupName, String serviceName) {
        final String filter = null;
        final Integer top = null;
        final Integer skip = null;
        return new PagedFlux<>(
            () -> listByServiceSinglePageAsync(resourceGroupName, serviceName, filter, top, skip),
            nextLink -> listByServiceNextSinglePageAsync(nextLink));
    }

    /**
     * Lists a collection of resources associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| aid | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| name | filter | ge, le, eq, ne, gt, lt
     *     | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| apiName | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| apiRevision | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| path | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| serviceUrl | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| method | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| urlTemplate | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| terms | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| state | filter | eq | |&lt;/br&gt;| isCurrent |
     *     filter | eq | |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TagResourceContractInner> listByServiceAsync(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context) {
        return new PagedFlux<>(
            () -> listByServiceSinglePageAsync(resourceGroupName, serviceName, filter, top, skip, context),
            nextLink -> listByServiceNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists a collection of resources associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TagResourceContractInner> listByService(String resourceGroupName, String serviceName) {
        final String filter = null;
        final Integer top = null;
        final Integer skip = null;
        return new PagedIterable<>(listByServiceAsync(resourceGroupName, serviceName, filter, top, skip));
    }

    /**
     * Lists a collection of resources associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| aid | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| name | filter | ge, le, eq, ne, gt, lt
     *     | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| apiName | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| apiRevision | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| path | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| serviceUrl | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| method | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| urlTemplate | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| terms | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| state | filter | eq | |&lt;/br&gt;| isCurrent |
     *     filter | eq | |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TagResourceContractInner> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context) {
        return new PagedIterable<>(listByServiceAsync(resourceGroupName, serviceName, filter, top, skip, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TagResourceContractInner>> listByServiceNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listByServiceNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<TagResourceContractInner>>map(
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
     * @return paged Tag list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TagResourceContractInner>> listByServiceNextSinglePageAsync(
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
            .listByServiceNext(nextLink, this.client.getEndpoint(), accept, context)
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
