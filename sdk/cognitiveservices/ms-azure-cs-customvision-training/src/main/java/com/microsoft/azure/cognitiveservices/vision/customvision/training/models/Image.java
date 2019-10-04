/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.UUID;
import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Image model to be sent as JSON.
 */
public class Image {
    /**
     * Id of the image.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /**
     * Date the image was created.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * Width of the image.
     */
    @JsonProperty(value = "width", access = JsonProperty.Access.WRITE_ONLY)
    private int width;

    /**
     * Height of the image.
     */
    @JsonProperty(value = "height", access = JsonProperty.Access.WRITE_ONLY)
    private int height;

    /**
     * The URI to the (resized) image used for training.
     */
    @JsonProperty(value = "resizedImageUri", access = JsonProperty.Access.WRITE_ONLY)
    private String resizedImageUri;

    /**
     * The URI to the thumbnail of the original image.
     */
    @JsonProperty(value = "thumbnailUri", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbnailUri;

    /**
     * The URI to the original uploaded image.
     */
    @JsonProperty(value = "originalImageUri", access = JsonProperty.Access.WRITE_ONLY)
    private String originalImageUri;

    /**
     * Tags associated with this image.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private List<ImageTag> tags;

    /**
     * Regions associated with this image.
     */
    @JsonProperty(value = "regions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ImageRegion> regions;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get the width value.
     *
     * @return the width value
     */
    public int width() {
        return this.width;
    }

    /**
     * Get the height value.
     *
     * @return the height value
     */
    public int height() {
        return this.height;
    }

    /**
     * Get the resizedImageUri value.
     *
     * @return the resizedImageUri value
     */
    public String resizedImageUri() {
        return this.resizedImageUri;
    }

    /**
     * Get the thumbnailUri value.
     *
     * @return the thumbnailUri value
     */
    public String thumbnailUri() {
        return this.thumbnailUri;
    }

    /**
     * Get the originalImageUri value.
     *
     * @return the originalImageUri value
     */
    public String originalImageUri() {
        return this.originalImageUri;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public List<ImageTag> tags() {
        return this.tags;
    }

    /**
     * Get the regions value.
     *
     * @return the regions value
     */
    public List<ImageRegion> regions() {
        return this.regions;
    }

}
