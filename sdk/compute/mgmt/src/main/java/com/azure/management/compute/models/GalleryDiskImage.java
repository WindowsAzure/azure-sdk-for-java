// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GalleryDiskImage model. */
@Fluent
public class GalleryDiskImage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryDiskImage.class);

    /*
     * This property indicates the size of the VHD to be created.
     */
    @JsonProperty(value = "sizeInGB", access = JsonProperty.Access.WRITE_ONLY)
    private Integer sizeInGB;

    /*
     * The host caching of the disk. Valid values are 'None', 'ReadOnly', and
     * 'ReadWrite'
     */
    @JsonProperty(value = "hostCaching")
    private HostCaching hostCaching;

    /*
     * The gallery artifact version source.
     */
    @JsonProperty(value = "source")
    private GalleryArtifactVersionSource source;

    /**
     * Get the sizeInGB property: This property indicates the size of the VHD to be created.
     *
     * @return the sizeInGB value.
     */
    public Integer sizeInGB() {
        return this.sizeInGB;
    }

    /**
     * Get the hostCaching property: The host caching of the disk. Valid values are 'None', 'ReadOnly', and 'ReadWrite'.
     *
     * @return the hostCaching value.
     */
    public HostCaching hostCaching() {
        return this.hostCaching;
    }

    /**
     * Set the hostCaching property: The host caching of the disk. Valid values are 'None', 'ReadOnly', and 'ReadWrite'.
     *
     * @param hostCaching the hostCaching value to set.
     * @return the GalleryDiskImage object itself.
     */
    public GalleryDiskImage withHostCaching(HostCaching hostCaching) {
        this.hostCaching = hostCaching;
        return this;
    }

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
     * @return the GalleryDiskImage object itself.
     */
    public GalleryDiskImage withSource(GalleryArtifactVersionSource source) {
        this.source = source;
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
    }
}
