/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.GalleryApplicationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing GalleryApplications.
 */
public interface GalleryApplications extends SupportsCreating<GalleryApplication.DefinitionStages.Blank>, HasInner<GalleryApplicationsInner> {
    /**
     * Retrieves information about a gallery Application Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery from which the Application Definitions are to be retrieved.
     * @param galleryApplicationName The name of the gallery Application Definition to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GalleryApplication> getAsync(String resourceGroupName, String galleryName, String galleryApplicationName);

    /**
     * List gallery Application Definitions in a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery from which Application Definitions are to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GalleryApplication> listByGalleryAsync(final String resourceGroupName, final String galleryName);

    /**
     * Delete a gallery Application.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition is to be deleted.
     * @param galleryApplicationName The name of the gallery Application Definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String galleryName, String galleryApplicationName);

}
