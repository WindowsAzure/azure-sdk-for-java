// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The gallery artifact version source. */
@Fluent
public final class GalleryArtifactVersionSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryArtifactVersionSource.class);

    /*
     * The id of the gallery artifact version source. Can specify a disk uri,
     * snapshot uri, user image or storage account resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The uri of the gallery artifact version source. Currently used to
     * specify vhd/blob source.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * Get the id property: The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user
     * image or storage account resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user
     * image or storage account resource.
     *
     * @param id the id value to set.
     * @return the GalleryArtifactVersionSource object itself.
     */
    public GalleryArtifactVersionSource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the uri property: The uri of the gallery artifact version source. Currently used to specify vhd/blob source.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The uri of the gallery artifact version source. Currently used to specify vhd/blob source.
     *
     * @param uri the uri value to set.
     * @return the GalleryArtifactVersionSource object itself.
     */
    public GalleryArtifactVersionSource withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
