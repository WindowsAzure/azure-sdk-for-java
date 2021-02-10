/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The cached image and OS type.
 */
public class CachedImagesInner {
    /**
     * The OS type of the cached image.
     */
    @JsonProperty(value = "osType", required = true)
    private String osType;

    /**
     * The cached image name.
     */
    @JsonProperty(value = "image", required = true)
    private String image;

    /**
     * Get the OS type of the cached image.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the OS type of the cached image.
     *
     * @param osType the osType value to set
     * @return the CachedImagesInner object itself.
     */
    public CachedImagesInner withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the cached image name.
     *
     * @return the image value
     */
    public String image() {
        return this.image;
    }

    /**
     * Set the cached image name.
     *
     * @param image the image value to set
     * @return the CachedImagesInner object itself.
     */
    public CachedImagesInner withImage(String image) {
        this.image = image;
        return this;
    }

}
