// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

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
 * GalleryApplicationVersions.
 */
public final class GalleryApplicationVersionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private GalleryApplicationVersionsService service;

    /**
     * The service client containing this operation class.
     */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of GalleryApplicationVersionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public GalleryApplicationVersionsInner(ComputeManagementClientImpl client) {
        this.service = RestProxy.create(GalleryApplicationVersionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ComputeManagementClientGalleryApplicationVersions to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementClientGalleryApplicationVersions")
    private interface GalleryApplicationVersionsService {
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/applications/{galleryApplicationName}/versions/{galleryApplicationVersionName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("galleryName") String galleryName, @PathParam("galleryApplicationName") String galleryApplicationName, @PathParam("galleryApplicationVersionName") String galleryApplicationVersionName, @BodyParam("application/json") GalleryApplicationVersionInner galleryApplicationVersion, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/applications/{galleryApplicationName}/versions/{galleryApplicationVersionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GalleryApplicationVersionInner>> get(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("galleryName") String galleryName, @PathParam("galleryApplicationName") String galleryApplicationName, @PathParam("galleryApplicationVersionName") String galleryApplicationVersionName, @QueryParam("$expand") String expand, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/applications/{galleryApplicationName}/versions/{galleryApplicationVersionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("galleryName") String galleryName, @PathParam("galleryApplicationName") String galleryApplicationName, @PathParam("galleryApplicationVersionName") String galleryApplicationVersionName, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/applications/{galleryApplicationName}/versions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GalleryApplicationVersionListInner>> listByGalleryApplication(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("galleryName") String galleryName, @PathParam("galleryApplicationName") String galleryApplicationName, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/applications/{galleryApplicationName}/versions/{galleryApplicationVersionName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GalleryApplicationVersionInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("galleryName") String galleryName, @PathParam("galleryApplicationName") String galleryApplicationName, @PathParam("galleryApplicationVersionName") String galleryApplicationVersionName, @BodyParam("application/json") GalleryApplicationVersionInner galleryApplicationVersion, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/applications/{galleryApplicationName}/versions/{galleryApplicationVersionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("galleryName") String galleryName, @PathParam("galleryApplicationName") String galleryApplicationName, @PathParam("galleryApplicationVersionName") String galleryApplicationVersionName, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GalleryApplicationVersionListInner>> listByGalleryApplicationNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Create or update a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName, GalleryApplicationVersionInner galleryApplicationVersion) {
        final String apiVersion = "2019-03-01";
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName, galleryApplicationVersion, apiVersion);
    }

    /**
     * Create or update a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GalleryApplicationVersionInner> createOrUpdateAsync(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName, GalleryApplicationVersionInner galleryApplicationVersion) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName, galleryApplicationVersion);
        return client.<GalleryApplicationVersionInner, GalleryApplicationVersionInner>getLroResultAsync(response, client.getHttpPipeline(), GalleryApplicationVersionInner.class, GalleryApplicationVersionInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Create or update a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryApplicationVersionInner createOrUpdate(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName, GalleryApplicationVersionInner galleryApplicationVersion) {
        return createOrUpdateAsync(resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName, galleryApplicationVersion).block();
    }

    /**
     * Retrieves information about a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<GalleryApplicationVersionInner>> getWithResponseAsync(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName) {
        final String expand = "ReplicationStatus";
        final String apiVersion = "2019-03-01";
        return service.get(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName, expand, apiVersion);
    }

    /**
     * Retrieves information about a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GalleryApplicationVersionInner> getAsync(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName) {
        return getWithResponseAsync(resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName)
            .flatMap((SimpleResponse<GalleryApplicationVersionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Retrieves information about a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryApplicationVersionInner get(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName) {
        return getAsync(resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName).block();
    }

    /**
     * Delete a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName) {
        final String apiVersion = "2019-03-01";
        return service.delete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName, apiVersion);
    }

    /**
     * Delete a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Delete a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName) {
        deleteAsync(resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName).block();
    }

    /**
     * List gallery Application Versions in a gallery Application Definition.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<GalleryApplicationVersionInner>> listByGalleryApplicationSinglePageAsync(String resourceGroupName, String galleryName, String galleryApplicationName) {
        final String apiVersion = "2019-03-01";
        return service.listByGalleryApplication(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, galleryName, galleryApplicationName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * List gallery Application Versions in a gallery Application Definition.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<GalleryApplicationVersionInner> listByGalleryApplicationAsync(String resourceGroupName, String galleryName, String galleryApplicationName) {
        return new PagedFlux<>(
            () -> listByGalleryApplicationSinglePageAsync(resourceGroupName, galleryName, galleryApplicationName),
            nextLink -> listByGalleryApplicationNextSinglePageAsync(nextLink));
    }

    /**
     * List gallery Application Versions in a gallery Application Definition.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<GalleryApplicationVersionInner> listByGalleryApplication(String resourceGroupName, String galleryName, String galleryApplicationName) {
        return new PagedIterable<>(listByGalleryApplicationAsync(resourceGroupName, galleryName, galleryApplicationName));
    }

    /**
     * Create or update a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<GalleryApplicationVersionInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName, GalleryApplicationVersionInner galleryApplicationVersion) {
        final String apiVersion = "2019-03-01";
        return service.beginCreateOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName, galleryApplicationVersion, apiVersion);
    }

    /**
     * Create or update a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GalleryApplicationVersionInner> beginCreateOrUpdateAsync(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName, GalleryApplicationVersionInner galleryApplicationVersion) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName, galleryApplicationVersion)
            .flatMap((SimpleResponse<GalleryApplicationVersionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Create or update a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryApplicationVersionInner beginCreateOrUpdate(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName, GalleryApplicationVersionInner galleryApplicationVersion) {
        return beginCreateOrUpdateAsync(resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName, galleryApplicationVersion).block();
    }

    /**
     * Delete a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName) {
        final String apiVersion = "2019-03-01";
        return service.beginDelete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName, apiVersion);
    }

    /**
     * Delete a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName) {
        return beginDeleteWithResponseAsync(resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete a gallery Application Version.
     * 
     * @param resourceGroupName 
     * @param galleryName 
     * @param galleryApplicationName 
     * @param galleryApplicationVersionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName) {
        beginDeleteAsync(resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName).block();
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
    public Mono<PagedResponse<GalleryApplicationVersionInner>> listByGalleryApplicationNextSinglePageAsync(String nextLink) {
        return service.listByGalleryApplicationNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
