/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the properties of a video overlay.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.VideoOverlay")
public class VideoOverlay extends Overlay {
    /**
     * The location in the input video where the overlay is applied.
     */
    @JsonProperty(value = "position")
    private Rectangle position;

    /**
     * The opacity of the overlay. This is a value in the range [0 - 1.0].
     * Default is 1.0 which mean the overlay is opaque.
     */
    @JsonProperty(value = "opacity")
    private Double opacity;

    /**
     * An optional rectangular window used to crop the overlay image or video.
     */
    @JsonProperty(value = "cropRectangle")
    private Rectangle cropRectangle;

    /**
     * Get the location in the input video where the overlay is applied.
     *
     * @return the position value
     */
    public Rectangle position() {
        return this.position;
    }

    /**
     * Set the location in the input video where the overlay is applied.
     *
     * @param position the position value to set
     * @return the VideoOverlay object itself.
     */
    public VideoOverlay withPosition(Rectangle position) {
        this.position = position;
        return this;
    }

    /**
     * Get the opacity of the overlay. This is a value in the range [0 - 1.0]. Default is 1.0 which mean the overlay is opaque.
     *
     * @return the opacity value
     */
    public Double opacity() {
        return this.opacity;
    }

    /**
     * Set the opacity of the overlay. This is a value in the range [0 - 1.0]. Default is 1.0 which mean the overlay is opaque.
     *
     * @param opacity the opacity value to set
     * @return the VideoOverlay object itself.
     */
    public VideoOverlay withOpacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    /**
     * Get an optional rectangular window used to crop the overlay image or video.
     *
     * @return the cropRectangle value
     */
    public Rectangle cropRectangle() {
        return this.cropRectangle;
    }

    /**
     * Set an optional rectangular window used to crop the overlay image or video.
     *
     * @param cropRectangle the cropRectangle value to set
     * @return the VideoOverlay object itself.
     */
    public VideoOverlay withCropRectangle(Rectangle cropRectangle) {
        this.cropRectangle = cropRectangle;
        return this;
    }

}
