// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The image definition. */
@Fluent
public final class ImageDefinitionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageDefinitionInner.class);

    /*
     * Whether image exists already.
     */
    @JsonProperty(value = "imageExists")
    private Boolean imageExists;

    /*
     * Content URL for the image blob.
     */
    @JsonProperty(value = "contentUrl")
    private String contentUrl;

    /*
     * Relative path of the image.
     */
    @JsonProperty(value = "relativePath")
    private String relativePath;

    /**
     * Get the imageExists property: Whether image exists already.
     *
     * @return the imageExists value.
     */
    public Boolean imageExists() {
        return this.imageExists;
    }

    /**
     * Set the imageExists property: Whether image exists already.
     *
     * @param imageExists the imageExists value to set.
     * @return the ImageDefinitionInner object itself.
     */
    public ImageDefinitionInner withImageExists(Boolean imageExists) {
        this.imageExists = imageExists;
        return this;
    }

    /**
     * Get the contentUrl property: Content URL for the image blob.
     *
     * @return the contentUrl value.
     */
    public String contentUrl() {
        return this.contentUrl;
    }

    /**
     * Set the contentUrl property: Content URL for the image blob.
     *
     * @param contentUrl the contentUrl value to set.
     * @return the ImageDefinitionInner object itself.
     */
    public ImageDefinitionInner withContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    /**
     * Get the relativePath property: Relative path of the image.
     *
     * @return the relativePath value.
     */
    public String relativePath() {
        return this.relativePath;
    }

    /**
     * Set the relativePath property: Relative path of the image.
     *
     * @param relativePath the relativePath value to set.
     * @return the ImageDefinitionInner object itself.
     */
    public ImageDefinitionInner withRelativePath(String relativePath) {
        this.relativePath = relativePath;
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
