// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GalleryArtifactSource model. */
@Fluent
public final class GalleryArtifactSource {
    /*
     * The managed artifact.
     */
    @JsonProperty(value = "managedImage", required = true)
    private ManagedArtifact managedImage;

    /**
     * Get the managedImage property: The managed artifact.
     *
     * @return the managedImage value.
     */
    public ManagedArtifact managedImage() {
        return this.managedImage;
    }

    /**
     * Set the managedImage property: The managed artifact.
     *
     * @param managedImage the managedImage value to set.
     * @return the GalleryArtifactSource object itself.
     */
    public GalleryArtifactSource withManagedImage(ManagedArtifact managedImage) {
        this.managedImage = managedImage;
        return this;
    }
}
