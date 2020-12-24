// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

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
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.fluent.GallerySharingProfilesClient;
import com.azure.resourcemanager.compute.fluent.models.SharingUpdateInner;
import com.azure.resourcemanager.compute.models.ApiErrorException;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GallerySharingProfilesClient. */
public final class GallerySharingProfilesClientImpl implements GallerySharingProfilesClient {
    private final ClientLogger logger = new ClientLogger(GallerySharingProfilesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final GallerySharingProfilesService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of GallerySharingProfilesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GallerySharingProfilesClientImpl(ComputeManagementClientImpl client) {
        this.service =
            RestProxy
                .create(GallerySharingProfilesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientGallerySharingProfiles to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface GallerySharingProfilesService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries"
                + "/{galleryName}/share")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<Flux<ByteBuffer>>> update(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("galleryName") String galleryName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") SharingUpdateInner sharingUpdate,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Specifies information about the gallery sharing profile update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate) {
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
        if (galleryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter galleryName is required and cannot be null."));
        }
        if (sharingUpdate == null) {
            return Mono.error(new IllegalArgumentException("Parameter sharingUpdate is required and cannot be null."));
        } else {
            sharingUpdate.validate();
        }
        final String apiVersion = "2020-09-30";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            galleryName,
                            apiVersion,
                            sharingUpdate,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Specifies information about the gallery sharing profile update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate, Context context) {
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
        if (galleryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter galleryName is required and cannot be null."));
        }
        if (sharingUpdate == null) {
            return Mono.error(new IllegalArgumentException("Parameter sharingUpdate is required and cannot be null."));
        } else {
            sharingUpdate.validate();
        }
        final String apiVersion = "2020-09-30";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                galleryName,
                apiVersion,
                sharingUpdate,
                accept,
                context);
    }

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Specifies information about the gallery sharing profile update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<SharingUpdateInner>, SharingUpdateInner> beginUpdateAsync(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate) {
        Mono<Response<Flux<ByteBuffer>>> mono = updateWithResponseAsync(resourceGroupName, galleryName, sharingUpdate);
        return this
            .client
            .<SharingUpdateInner, SharingUpdateInner>getLroResult(
                mono, this.client.getHttpPipeline(), SharingUpdateInner.class, SharingUpdateInner.class, Context.NONE);
    }

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Specifies information about the gallery sharing profile update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<SharingUpdateInner>, SharingUpdateInner> beginUpdateAsync(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            updateWithResponseAsync(resourceGroupName, galleryName, sharingUpdate, context);
        return this
            .client
            .<SharingUpdateInner, SharingUpdateInner>getLroResult(
                mono, this.client.getHttpPipeline(), SharingUpdateInner.class, SharingUpdateInner.class, context);
    }

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Specifies information about the gallery sharing profile update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<SharingUpdateInner>, SharingUpdateInner> beginUpdate(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate) {
        return beginUpdateAsync(resourceGroupName, galleryName, sharingUpdate).getSyncPoller();
    }

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Specifies information about the gallery sharing profile update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<SharingUpdateInner>, SharingUpdateInner> beginUpdate(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate, Context context) {
        return beginUpdateAsync(resourceGroupName, galleryName, sharingUpdate, context).getSyncPoller();
    }

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Specifies information about the gallery sharing profile update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharingUpdateInner> updateAsync(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate) {
        return beginUpdateAsync(resourceGroupName, galleryName, sharingUpdate)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Specifies information about the gallery sharing profile update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SharingUpdateInner> updateAsync(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate, Context context) {
        return beginUpdateAsync(resourceGroupName, galleryName, sharingUpdate, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Specifies information about the gallery sharing profile update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SharingUpdateInner update(String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate) {
        return updateAsync(resourceGroupName, galleryName, sharingUpdate).block();
    }

    /**
     * Update sharing profile of a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery.
     * @param sharingUpdate Specifies information about the gallery sharing profile update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery sharing profile update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SharingUpdateInner update(
        String resourceGroupName, String galleryName, SharingUpdateInner sharingUpdate, Context context) {
        return updateAsync(resourceGroupName, galleryName, sharingUpdate, context).block();
    }
}
