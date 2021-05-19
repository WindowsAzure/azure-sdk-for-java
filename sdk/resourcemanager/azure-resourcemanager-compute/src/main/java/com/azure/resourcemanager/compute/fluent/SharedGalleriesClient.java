// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.SharedGalleryInner;
import com.azure.resourcemanager.compute.models.SharedToValues;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SharedGalleriesClient. */
public interface SharedGalleriesClient {
    /**
     * List shared galleries by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Galleries operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SharedGalleryInner> listAsync(String location, SharedToValues sharedTo);

    /**
     * List shared galleries by subscription id or tenant id.
     *
     * @param location Resource location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Galleries operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SharedGalleryInner> listAsync(String location);

    /**
     * List shared galleries by subscription id or tenant id.
     *
     * @param location Resource location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Galleries operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SharedGalleryInner> list(String location);

    /**
     * List shared galleries by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Galleries operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SharedGalleryInner> list(String location, SharedToValues sharedTo, Context context);

    /**
     * Get a shared gallery by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery by subscription id or tenant id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SharedGalleryInner>> getWithResponseAsync(String location, String galleryUniqueName);

    /**
     * Get a shared gallery by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery by subscription id or tenant id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SharedGalleryInner> getAsync(String location, String galleryUniqueName);

    /**
     * Get a shared gallery by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery by subscription id or tenant id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedGalleryInner get(String location, String galleryUniqueName);

    /**
     * Get a shared gallery by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery by subscription id or tenant id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SharedGalleryInner> getWithResponse(String location, String galleryUniqueName, Context context);
}
