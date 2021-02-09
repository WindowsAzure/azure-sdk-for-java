/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The source image from which the Image Version is going to be created.
 */
public class GalleryArtifactSource {
    /**
     * The managedImage property.
     */
    @JsonProperty(value = "managedImage", required = true)
    private ManagedArtifact managedImage;

    /**
     * Get the managedImage value.
     *
     * @return the managedImage value
     */
    public ManagedArtifact managedImage() {
        return this.managedImage;
    }

    /**
     * Set the managedImage value.
     *
     * @param managedImage the managedImage value to set
     * @return the GalleryArtifactSource object itself.
     */
    public GalleryArtifactSource withManagedImage(ManagedArtifact managedImage) {
        this.managedImage = managedImage;
        return this;
    }

}
