/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Region model.
 */
public class Region {
    /**
     * Id of the tag associated with this region.
     */
    @JsonProperty(value = "tagId", required = true)
    private UUID tagId;

    /**
     * Coordinate of the left boundary.
     */
    @JsonProperty(value = "left", required = true)
    private double left;

    /**
     * Coordinate of the top boundary.
     */
    @JsonProperty(value = "top", required = true)
    private double top;

    /**
     * Width.
     */
    @JsonProperty(value = "width", required = true)
    private double width;

    /**
     * Height.
     */
    @JsonProperty(value = "height", required = true)
    private double height;

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
     * @return the Region object itself.
     */
    public Region withTagId(UUID tagId) {
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
     * @return the Region object itself.
     */
    public Region withLeft(double left) {
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
     * @return the Region object itself.
     */
    public Region withTop(double top) {
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
     * @return the Region object itself.
     */
    public Region withWidth(double width) {
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
     * @return the Region object itself.
     */
    public Region withHeight(double height) {
        this.height = height;
        return this;
    }

}
