// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GalleryImageVersionStorageProfile model. */
@Fluent
public final class GalleryImageVersionStorageProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryImageVersionStorageProfile.class);

    /*
     * The gallery artifact version source.
     */
    @JsonProperty(value = "source")
    private GalleryArtifactVersionSource source;

    /*
     * This is the disk image base class.
     */
    @JsonProperty(value = "osDiskImage")
    private GalleryDiskImage osDiskImage;

    /*
     * A list of data disk images.
     */
    @JsonProperty(value = "dataDiskImages")
    private List<GalleryDataDiskImage> dataDiskImages;

    /**
     * Get the source property: The gallery artifact version source.
     *
     * @return the source value.
     */
    public GalleryArtifactVersionSource source() {
        return this.source;
    }

    /**
     * Set the source property: The gallery artifact version source.
     *
     * @param source the source value to set.
     * @return the GalleryImageVersionStorageProfile object itself.
     */
    public GalleryImageVersionStorageProfile withSource(GalleryArtifactVersionSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the osDiskImage property: This is the disk image base class.
     *
     * @return the osDiskImage value.
     */
    public GalleryDiskImage osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Set the osDiskImage property: This is the disk image base class.
     *
     * @param osDiskImage the osDiskImage value to set.
     * @return the GalleryImageVersionStorageProfile object itself.
     */
    public GalleryImageVersionStorageProfile withOsDiskImage(GalleryDiskImage osDiskImage) {
        this.osDiskImage = osDiskImage;
        return this;
    }

    /**
     * Get the dataDiskImages property: A list of data disk images.
     *
     * @return the dataDiskImages value.
     */
    public List<GalleryDataDiskImage> dataDiskImages() {
        return this.dataDiskImages;
    }

    /**
     * Set the dataDiskImages property: A list of data disk images.
     *
     * @param dataDiskImages the dataDiskImages value to set.
     * @return the GalleryImageVersionStorageProfile object itself.
     */
    public GalleryImageVersionStorageProfile withDataDiskImages(List<GalleryDataDiskImage> dataDiskImages) {
        this.dataDiskImages = dataDiskImages;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() != null) {
            source().validate();
        }
        if (osDiskImage() != null) {
            osDiskImage().validate();
        }
        if (dataDiskImages() != null) {
            dataDiskImages().forEach(e -> e.validate());
        }
    }
}
