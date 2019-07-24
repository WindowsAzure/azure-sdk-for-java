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
 * Describes the settings to be used when encoding the input video into a
 * desired output bitrate layer.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = VideoLayer.class)
@JsonTypeName("#Microsoft.Media.VideoLayer")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.H264Layer", value = H264Layer.class)
})
public class VideoLayer extends Layer {
    /**
     * The average bitrate in bits per second at which to encode the input
     * video when generating this layer. This is a required field.
     */
    @JsonProperty(value = "bitrate")
    private Integer bitrate;

    /**
     * The maximum bitrate (in bits per second), at which the VBV buffer should
     * be assumed to refill. If not specified, defaults to the same value as
     * bitrate.
     */
    @JsonProperty(value = "maxBitrate")
    private Integer maxBitrate;

    /**
     * The number of B-frames to be used when encoding this layer.  If not
     * specified, the encoder chooses an appropriate number based on the video
     * profile and level.
     */
    @JsonProperty(value = "bFrames")
    private Integer bFrames;

    /**
     * The frame rate (in frames per second) at which to encode this layer. The
     * value can be in the form of M/N where M and N are integers (For example,
     * 30000/1001), or in the form of a number (For example, 30, or 29.97). The
     * encoder enforces constraints on allowed frame rates based on the profile
     * and level. If it is not specified, the encoder will use the same frame
     * rate as the input video.
     */
    @JsonProperty(value = "frameRate")
    private String frameRate;

    /**
     * The number of slices to be used when encoding this layer. If not
     * specified, default is zero, which means that encoder will use a single
     * slice for each frame.
     */
    @JsonProperty(value = "slices")
    private Integer slices;

    /**
     * Whether or not adaptive B-frames are to be used when encoding this
     * layer. If not specified, the encoder will turn it on whenever the video
     * profile permits its use.
     */
    @JsonProperty(value = "adaptiveBFrame")
    private Boolean adaptiveBFrame;

    /**
     * Get the average bitrate in bits per second at which to encode the input video when generating this layer. This is a required field.
     *
     * @return the bitrate value
     */
    public Integer bitrate() {
        return this.bitrate;
    }

    /**
     * Set the average bitrate in bits per second at which to encode the input video when generating this layer. This is a required field.
     *
     * @param bitrate the bitrate value to set
     * @return the VideoLayer object itself.
     */
    public VideoLayer withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Get the maximum bitrate (in bits per second), at which the VBV buffer should be assumed to refill. If not specified, defaults to the same value as bitrate.
     *
     * @return the maxBitrate value
     */
    public Integer maxBitrate() {
        return this.maxBitrate;
    }

    /**
     * Set the maximum bitrate (in bits per second), at which the VBV buffer should be assumed to refill. If not specified, defaults to the same value as bitrate.
     *
     * @param maxBitrate the maxBitrate value to set
     * @return the VideoLayer object itself.
     */
    public VideoLayer withMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
        return this;
    }

    /**
     * Get the number of B-frames to be used when encoding this layer.  If not specified, the encoder chooses an appropriate number based on the video profile and level.
     *
     * @return the bFrames value
     */
    public Integer bFrames() {
        return this.bFrames;
    }

    /**
     * Set the number of B-frames to be used when encoding this layer.  If not specified, the encoder chooses an appropriate number based on the video profile and level.
     *
     * @param bFrames the bFrames value to set
     * @return the VideoLayer object itself.
     */
    public VideoLayer withBFrames(Integer bFrames) {
        this.bFrames = bFrames;
        return this;
    }

    /**
     * Get the frame rate (in frames per second) at which to encode this layer. The value can be in the form of M/N where M and N are integers (For example, 30000/1001), or in the form of a number (For example, 30, or 29.97). The encoder enforces constraints on allowed frame rates based on the profile and level. If it is not specified, the encoder will use the same frame rate as the input video.
     *
     * @return the frameRate value
     */
    public String frameRate() {
        return this.frameRate;
    }

    /**
     * Set the frame rate (in frames per second) at which to encode this layer. The value can be in the form of M/N where M and N are integers (For example, 30000/1001), or in the form of a number (For example, 30, or 29.97). The encoder enforces constraints on allowed frame rates based on the profile and level. If it is not specified, the encoder will use the same frame rate as the input video.
     *
     * @param frameRate the frameRate value to set
     * @return the VideoLayer object itself.
     */
    public VideoLayer withFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * Get the number of slices to be used when encoding this layer. If not specified, default is zero, which means that encoder will use a single slice for each frame.
     *
     * @return the slices value
     */
    public Integer slices() {
        return this.slices;
    }

    /**
     * Set the number of slices to be used when encoding this layer. If not specified, default is zero, which means that encoder will use a single slice for each frame.
     *
     * @param slices the slices value to set
     * @return the VideoLayer object itself.
     */
    public VideoLayer withSlices(Integer slices) {
        this.slices = slices;
        return this;
    }

    /**
     * Get whether or not adaptive B-frames are to be used when encoding this layer. If not specified, the encoder will turn it on whenever the video profile permits its use.
     *
     * @return the adaptiveBFrame value
     */
    public Boolean adaptiveBFrame() {
        return this.adaptiveBFrame;
    }

    /**
     * Set whether or not adaptive B-frames are to be used when encoding this layer. If not specified, the encoder will turn it on whenever the video profile permits its use.
     *
     * @param adaptiveBFrame the adaptiveBFrame value to set
     * @return the VideoLayer object itself.
     */
    public VideoLayer withAdaptiveBFrame(Boolean adaptiveBFrame) {
        this.adaptiveBFrame = adaptiveBFrame;
        return this;
    }

}
