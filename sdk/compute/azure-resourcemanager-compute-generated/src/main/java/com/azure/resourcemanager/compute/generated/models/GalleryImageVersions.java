// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of GalleryImageVersions. */
public interface GalleryImageVersions {
    /**
     * Retrieves information about a gallery Image Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery Image Definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery Image Version to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Version that you want to create or update.
     */
    GalleryImageVersion get(
        String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName);

    /**
     * Retrieves information about a gallery Image Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery Image Definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery Image Version to be retrieved.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Version that you want to create or update.
     */
    Response<GalleryImageVersion> getWithResponse(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        ReplicationStatusTypes expand,
        Context context);

    /**
     * Delete a gallery Image Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery Image Definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery Image Version to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName);

    /**
     * Delete a gallery Image Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery Image Definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery Image Version to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        String galleryImageVersionName,
        Context context);

    /**
     * List gallery Image Versions in a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the Shared Image Gallery Image Definition from which the Image Versions are
     *     to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Image version operation response.
     */
    PagedIterable<GalleryImageVersion> listByGalleryImage(
        String resourceGroupName, String galleryName, String galleryImageName);

    /**
     * List gallery Image Versions in a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the Shared Image Gallery Image Definition from which the Image Versions are
     *     to be listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Image version operation response.
     */
    PagedIterable<GalleryImageVersion> listByGalleryImage(
        String resourceGroupName, String galleryName, String galleryImageName, Context context);

    /**
     * Retrieves information about a gallery Image Version.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Version that you want to create or update.
     */
    GalleryImageVersion getById(String id);

    /**
     * Retrieves information about a gallery Image Version.
     *
     * @param id the resource ID.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Version that you want to create or update.
     */
    Response<GalleryImageVersion> getByIdWithResponse(String id, ReplicationStatusTypes expand, Context context);

    /**
     * Delete a gallery Image Version.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a gallery Image Version.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new GalleryImageVersion resource.
     *
     * @param name resource name.
     * @return the first stage of the new GalleryImageVersion definition.
     */
    GalleryImageVersion.DefinitionStages.Blank define(String name);
}
