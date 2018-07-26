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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImageRegionCreateResult model.
 */
public class ImageRegionCreateResult {
    /**
     * The imageId property.
     */
    @JsonProperty(value = "imageId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID imageId;

    /**
     * The regionId property.
     */
    @JsonProperty(value = "regionId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID regionId;

    /**
     * The tagName property.
     */
    @JsonProperty(value = "tagName", access = JsonProperty.Access.WRITE_ONLY)
    private String tagName;

    /**
     * The created property.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * The tagId property.
     */
    @JsonProperty(value = "tagId")
    private UUID tagId;

    /**
     * The left property.
     */
    @JsonProperty(value = "left")
    private double left;

    /**
     * The top property.
     */
    @JsonProperty(value = "top")
    private double top;

    /**
     * The width property.
     */
    @JsonProperty(value = "width")
    private double width;

    /**
     * The height property.
     */
    @JsonProperty(value = "height")
    private double height;

    /**
     * Get the imageId value.
     *
     * @return the imageId value
     */
    public UUID imageId() {
        return this.imageId;
    }

    /**
     * Get the regionId value.
     *
     * @return the regionId value
     */
    public UUID regionId() {
        return this.regionId;
    }

    /**
     * Get the tagName value.
     *
     * @return the tagName value
     */
    public String tagName() {
        return this.tagName;
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
     * Get the tagId value.
     *
     * @return the tagId value
     */
    public UUID tagId() {
        return this.tagId;
    }

    /**
     * Set the tagId value.
     *
     * @param tagId the tagId value to set
     * @return the ImageRegionCreateResult object itself.
     */
    public ImageRegionCreateResult withTagId(UUID tagId) {
        this.tagId = tagId;
        return this;
    }

    /**
     * Get the left value.
     *
     * @return the left value
     */
    public double left() {
        return this.left;
    }

    /**
     * Set the left value.
     *
     * @param left the left value to set
     * @return the ImageRegionCreateResult object itself.
     */
    public ImageRegionCreateResult withLeft(double left) {
        this.left = left;
        return this;
    }

    /**
     * Get the top value.
     *
     * @return the top value
     */
    public double top() {
        return this.top;
    }

    /**
     * Set the top value.
     *
     * @param top the top value to set
     * @return the ImageRegionCreateResult object itself.
     */
    public ImageRegionCreateResult withTop(double top) {
        this.top = top;
        return this;
    }

    /**
     * Get the width value.
     *
     * @return the width value
     */
    public double width() {
        return this.width;
    }

    /**
     * Set the width value.
     *
     * @param width the width value to set
     * @return the ImageRegionCreateResult object itself.
     */
    public ImageRegionCreateResult withWidth(double width) {
        this.width = width;
        return this;
    }

    /**
     * Get the height value.
     *
     * @return the height value
     */
    public double height() {
        return this.height;
    }

    /**
     * Set the height value.
     *
     * @param height the height value to set
     * @return the ImageRegionCreateResult object itself.
     */
    public ImageRegionCreateResult withHeight(double height) {
        this.height = height;
        return this;
    }

}
