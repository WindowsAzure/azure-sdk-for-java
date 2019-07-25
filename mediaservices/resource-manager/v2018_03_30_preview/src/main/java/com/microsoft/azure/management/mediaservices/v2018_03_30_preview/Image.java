/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes the basic properties for generating thumbnails from the input
 * video.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = Image.class)
@JsonTypeName("#Microsoft.Media.Image")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.JpgImage", value = JpgImage.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.PngImage", value = PngImage.class)
})
public class Image extends Video {
    /**
     * The position in the input video from where to start generating
     * thumbnails. The value can be in absolute timestamp (ISO 8601, e.g:
     * PT05S), or a frame count (For example, 10 for the 10th frame), or a
     * relative value (For example, 1%). Also supports a macro {Best}, which
     * tells the encoder to select the best thumbnail from the first few
     * seconds of the video.
     */
    @JsonProperty(value = "start")
    private String start;

    /**
     * The intervals at which thumbnails are generated. The value can be in
     * absolute timestamp (ISO 8601, e.g: PT05S for one image every 5 seconds),
     * or a frame count (For example, 30 for every 30 frames), or a relative
     * value (For example, 1%).
     */
    @JsonProperty(value = "step")
    private String step;

    /**
     * The position in the input video at which to stop generating thumbnails.
     * The value can be in absolute timestamp (ISO 8601, e.g: PT5M30S to stop
     * at 5 minutes and 30 seconds), or a frame count (For example, 300 to stop
     * at the 300th frame), or a relative value (For example, 100%).
     */
    @JsonProperty(value = "range")
    private String range;

    /**
     * Get the position in the input video from where to start generating thumbnails. The value can be in absolute timestamp (ISO 8601, e.g: PT05S), or a frame count (For example, 10 for the 10th frame), or a relative value (For example, 1%). Also supports a macro {Best}, which tells the encoder to select the best thumbnail from the first few seconds of the video.
     *
     * @return the start value
     */
    public String start() {
        return this.start;
    }

    /**
     * Set the position in the input video from where to start generating thumbnails. The value can be in absolute timestamp (ISO 8601, e.g: PT05S), or a frame count (For example, 10 for the 10th frame), or a relative value (For example, 1%). Also supports a macro {Best}, which tells the encoder to select the best thumbnail from the first few seconds of the video.
     *
     * @param start the start value to set
     * @return the Image object itself.
     */
    public Image withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Get the intervals at which thumbnails are generated. The value can be in absolute timestamp (ISO 8601, e.g: PT05S for one image every 5 seconds), or a frame count (For example, 30 for every 30 frames), or a relative value (For example, 1%).
     *
     * @return the step value
     */
    public String step() {
        return this.step;
    }

    /**
     * Set the intervals at which thumbnails are generated. The value can be in absolute timestamp (ISO 8601, e.g: PT05S for one image every 5 seconds), or a frame count (For example, 30 for every 30 frames), or a relative value (For example, 1%).
     *
     * @param step the step value to set
     * @return the Image object itself.
     */
    public Image withStep(String step) {
        this.step = step;
        return this;
    }

    /**
     * Get the position in the input video at which to stop generating thumbnails. The value can be in absolute timestamp (ISO 8601, e.g: PT5M30S to stop at 5 minutes and 30 seconds), or a frame count (For example, 300 to stop at the 300th frame), or a relative value (For example, 100%).
     *
     * @return the range value
     */
    public String range() {
        return this.range;
    }

    /**
     * Set the position in the input video at which to stop generating thumbnails. The value can be in absolute timestamp (ISO 8601, e.g: PT5M30S to stop at 5 minutes and 30 seconds), or a frame count (For example, 300 to stop at the 300th frame), or a relative value (For example, 100%).
     *
     * @param range the range value to set
     * @return the Image object itself.
     */
    public Image withRange(String range) {
        this.range = range;
        return this;
    }

}
