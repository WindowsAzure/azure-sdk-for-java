/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerinstance.v2020_11_01.implementation.CachedImagesInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerinstance.v2020_11_01.implementation.ContainerInstanceManager;

/**
 * Type representing CachedImages.
 */
public interface CachedImages extends HasInner<CachedImagesInner>, HasManager<ContainerInstanceManager> {
    /**
     * @return the image value.
     */
    String image();

    /**
     * @return the osType value.
     */
    String osType();

}
