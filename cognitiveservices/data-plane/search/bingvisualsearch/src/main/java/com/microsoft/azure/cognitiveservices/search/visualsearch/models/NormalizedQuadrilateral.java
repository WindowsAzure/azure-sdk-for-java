/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.visualsearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines a region of an image. The region is a convex quadrilateral defined
 * by coordinates of its top left, top right, bottom left, and bottom right
 * points. The coordinates are fractional values of the original image's width
 * and height in the range 0.0 through 1.0.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = NormalizedQuadrilateral.class)
@JsonTypeName("NormalizedQuadrilateral")
public class NormalizedQuadrilateral extends StructuredValue {
    /**
     * The top left corner coordinate.
     */
    @JsonProperty(value = "topLeft", required = true)
    private Point2D topLeft;

    /**
     * The top right corner coordinate.
     */
    @JsonProperty(value = "topRight", required = true)
    private Point2D topRight;

    /**
     * The bottom right corner coordinate.
     */
    @JsonProperty(value = "bottomRight", required = true)
    private Point2D bottomRight;

    /**
     * The bottom left corner coordinate.
     */
    @JsonProperty(value = "bottomLeft", required = true)
    private Point2D bottomLeft;

    /**
     * Get the topLeft value.
     *
     * @return the topLeft value
     */
    public Point2D topLeft() {
        return this.topLeft;
    }

    /**
     * Set the topLeft value.
     *
     * @param topLeft the topLeft value to set
     * @return the NormalizedQuadrilateral object itself.
     */
    public NormalizedQuadrilateral withTopLeft(Point2D topLeft) {
        this.topLeft = topLeft;
        return this;
    }

    /**
     * Get the topRight value.
     *
     * @return the topRight value
     */
    public Point2D topRight() {
        return this.topRight;
    }

    /**
     * Set the topRight value.
     *
     * @param topRight the topRight value to set
     * @return the NormalizedQuadrilateral object itself.
     */
    public NormalizedQuadrilateral withTopRight(Point2D topRight) {
        this.topRight = topRight;
        return this;
    }

    /**
     * Get the bottomRight value.
     *
     * @return the bottomRight value
     */
    public Point2D bottomRight() {
        return this.bottomRight;
    }

    /**
     * Set the bottomRight value.
     *
     * @param bottomRight the bottomRight value to set
     * @return the NormalizedQuadrilateral object itself.
     */
    public NormalizedQuadrilateral withBottomRight(Point2D bottomRight) {
        this.bottomRight = bottomRight;
        return this;
    }

    /**
     * Get the bottomLeft value.
     *
     * @return the bottomLeft value
     */
    public Point2D bottomLeft() {
        return this.bottomLeft;
    }

    /**
     * Set the bottomLeft value.
     *
     * @param bottomLeft the bottomLeft value to set
     * @return the NormalizedQuadrilateral object itself.
     */
    public NormalizedQuadrilateral withBottomLeft(Point2D bottomLeft) {
        this.bottomLeft = bottomLeft;
        return this;
    }

}
