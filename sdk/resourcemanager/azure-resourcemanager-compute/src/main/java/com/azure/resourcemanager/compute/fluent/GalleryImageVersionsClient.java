// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.fluent.models.GalleryImageVersionInner;
import com.azure.resourcemanager.compute.models.GalleryImageVersionUpdate;
import com.azure.resourcemanager.compute.models.ReplicationStatusTypes;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GalleryImageVersionsClient. */
public interface GalleryImageVersionsClient {
    /**
     * Create or update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be created.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to create or
     *     update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionInner galleryImageVersion);

    /**
     * Create or update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be created.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to create or
     *     update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<GalleryImageVersionInner>, GalleryImageVersionInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionInner galleryImageVersion);

    /**
     * Create or update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be created.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to create or
     *     update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryImageVersionInner>, GalleryImageVersionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionInner galleryImageVersion);

    /**
     * Create or update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be created.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to create or
     *     update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryImageVersionInner>, GalleryImageVersionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionInner galleryImageVersion,
        Context context);

    /**
     * Create or update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be created.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to create or
     *     update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<GalleryImageVersionInner> createOrUpdateAsync(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionInner galleryImageVersion);

    /**
     * Create or update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be created.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to create or
     *     update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryImageVersionInner createOrUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionInner galleryImageVersion);

    /**
     * Create or update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be created.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to create or
     *     update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryImageVersionInner createOrUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionInner galleryImageVersion,
        Context context);

    /**
     * Update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be updated.
     * @param galleryImageVersionName The name of the gallery image version to be updated. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionUpdate galleryImageVersion);

    /**
     * Update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be updated.
     * @param galleryImageVersionName The name of the gallery image version to be updated. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<GalleryImageVersionInner>, GalleryImageVersionInner> beginUpdateAsync(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionUpdate galleryImageVersion);

    /**
     * Update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be updated.
     * @param galleryImageVersionName The name of the gallery image version to be updated. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryImageVersionInner>, GalleryImageVersionInner> beginUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionUpdate galleryImageVersion);

    /**
     * Update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be updated.
     * @param galleryImageVersionName The name of the gallery image version to be updated. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryImageVersionInner>, GalleryImageVersionInner> beginUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionUpdate galleryImageVersion,
        Context context);

    /**
     * Update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be updated.
     * @param galleryImageVersionName The name of the gallery image version to be updated. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<GalleryImageVersionInner> updateAsync(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionUpdate galleryImageVersion);

    /**
     * Update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be updated.
     * @param galleryImageVersionName The name of the gallery image version to be updated. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryImageVersionInner update(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionUpdate galleryImageVersion);

    /**
     * Update a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version is to be updated.
     * @param galleryImageVersionName The name of the gallery image version to be updated. Needs to follow semantic
     *     version name pattern: The allowed characters are digit and period. Digits must be within the range of a
     *     32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryImageVersion Specifies information about the gallery image version that you want to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryImageVersionInner update(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        GalleryImageVersionUpdate galleryImageVersion,
        Context context);

    /**
     * Retrieves information about a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery image version to be retrieved.
     * @param expand The expand expression to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<GalleryImageVersionInner>> getWithResponseAsync(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        ReplicationStatusTypes expand);

    /**
     * Retrieves information about a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery image version to be retrieved.
     * @param expand The expand expression to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<GalleryImageVersionInner> getAsync(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        ReplicationStatusTypes expand);

    /**
     * Retrieves information about a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery image version to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<GalleryImageVersionInner> getAsync(
        String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName);

    /**
     * Retrieves information about a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery image version to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryImageVersionInner get(
        String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName);

    /**
     * Retrieves information about a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery image version to be retrieved.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GalleryImageVersionInner> getWithResponse(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        ReplicationStatusTypes expand,
        Context context);

    /**
     * Delete a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery image version to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName);

    /**
     * Delete a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery image version to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName);

    /**
     * Delete a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery image version to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName);

    /**
     * Delete a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery image version to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        Context context);

    /**
     * Delete a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery image version to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(
        String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName);

    /**
     * Delete a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery image version to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName);

    /**
     * Delete a gallery image version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery image definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery image version to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        Context context);

    /**
     * List gallery image versions in a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the Shared Image Gallery Image Definition from which the Image Versions are
     *     to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Image version operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<GalleryImageVersionInner> listByGalleryImageAsync(
        String resourceGroupName, String galleryName, String galleryImageName);

    /**
     * List gallery image versions in a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the Shared Image Gallery Image Definition from which the Image Versions are
     *     to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Image version operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GalleryImageVersionInner> listByGalleryImage(
        String resourceGroupName, String galleryName, String galleryImageName);

    /**
     * List gallery image versions in a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the Shared Image Gallery Image Definition from which the Image Versions are
     *     to be listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Image version operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GalleryImageVersionInner> listByGalleryImage(
        String resourceGroupName, String galleryName, String galleryImageName, Context context);
}
