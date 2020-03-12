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
import com.microsoft.azure.management.compute.v2019_11_01.implementation.GalleryImagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing GalleryImages.
 */
public interface GalleryImages extends SupportsCreating<GalleryImage.DefinitionStages.Blank>, HasInner<GalleryImagesInner> {
    /**
     * Retrieves information about a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which the Image Definitions are to be retrieved.
     * @param galleryImageName The name of the gallery Image Definition to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GalleryImage> getAsync(String resourceGroupName, String galleryName, String galleryImageName);

    /**
     * List gallery Image Definitions in a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which Image Definitions are to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GalleryImage> listByGalleryAsync(final String resourceGroupName, final String galleryName);

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String galleryName, String galleryImageName);

}
