/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.compute.v2019_11_01.implementation.GalleryImageVersionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing GalleryImageVersions.
 */
public interface GalleryImageVersions extends SupportsCreating<GalleryImageVersion.DefinitionStages.Blank>, HasInner<GalleryImageVersionsInner> {
    /**
     * Retrieves information about a gallery Image Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery Image Definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery Image Version to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GalleryImageVersion> getAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName);

    /**
     * List gallery Image Versions in a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the Shared Image Gallery Image Definition from which the Image Versions are to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GalleryImageVersion> listByGalleryImageAsync(final String resourceGroupName, final String galleryName, final String galleryImageName);

    /**
     * Delete a gallery Image Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
     * @param galleryImageName The name of the gallery Image Definition in which the Image Version resides.
     * @param galleryImageVersionName The name of the gallery Image Version to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String galleryName, String galleryImageName, String galleryImageVersionName);

}
