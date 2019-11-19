/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes all the properties for encoding a video with the H.264 codec.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.H264Video")
public class H264Video extends Video {
    /**
     * Whether or not the encoder should insert key frames at scene changes. If
     * not specified, the default is false. This flag should be set to true
     * only when the encoder is being configured to produce a single output
     * video.
     */
    @JsonProperty(value = "sceneChangeDetection")
    private Boolean sceneChangeDetection;

    /**
     * Tells the encoder how to choose its encoding settings. The default value
     * is Balanced. Possible values include: 'Speed', 'Balanced', 'Quality'.
     */
    @JsonProperty(value = "complexity")
    private H264Complexity complexity;

    /**
     * The collection of output H.264 layers to be produced by the encoder.
     */
    @JsonProperty(value = "layers")
    private List<H264Layer> layers;

    /**
     * Get whether or not the encoder should insert key frames at scene changes. If not specified, the default is false. This flag should be set to true only when the encoder is being configured to produce a single output video.
     *
     * @return the sceneChangeDetection value
     */
    public Boolean sceneChangeDetection() {
        return this.sceneChangeDetection;
    }

    /**
     * Set whether or not the encoder should insert key frames at scene changes. If not specified, the default is false. This flag should be set to true only when the encoder is being configured to produce a single output video.
     *
     * @param sceneChangeDetection the sceneChangeDetection value to set
     * @return the H264Video object itself.
     */
    public H264Video withSceneChangeDetection(Boolean sceneChangeDetection) {
        this.sceneChangeDetection = sceneChangeDetection;
        return this;
    }

    /**
     * Get tells the encoder how to choose its encoding settings. The default value is Balanced. Possible values include: 'Speed', 'Balanced', 'Quality'.
     *
     * @return the complexity value
     */
    public H264Complexity complexity() {
        return this.complexity;
    }

    /**
     * Set tells the encoder how to choose its encoding settings. The default value is Balanced. Possible values include: 'Speed', 'Balanced', 'Quality'.
     *
     * @param complexity the complexity value to set
     * @return the H264Video object itself.
     */
    public H264Video withComplexity(H264Complexity complexity) {
        this.complexity = complexity;
        return this;
    }

    /**
     * Get the collection of output H.264 layers to be produced by the encoder.
     *
     * @return the layers value
     */
    public List<H264Layer> layers() {
        return this.layers;
    }

    /**
     * Set the collection of output H.264 layers to be produced by the encoder.
     *
     * @param layers the layers value to set
     * @return the H264Video object itself.
     */
    public H264Video withLayers(List<H264Layer> layers) {
        this.layers = layers;
        return this;
    }

}
