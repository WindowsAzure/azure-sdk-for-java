// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The encoder can be configured to produce video and/or images (thumbnails) at different resolutions, by specifying a
 * layer for each desired resolution. A layer represents the properties for the video or image at a resolution.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata\\.type",
    defaultImpl = Layer.class)
@JsonTypeName("Layer")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.H265VideoLayer", value = H265VideoLayer.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.VideoLayer", value = VideoLayer.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.JpgLayer", value = JpgLayer.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.PngLayer", value = PngLayer.class)
})
@JsonFlatten
@Fluent
public class Layer {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Layer.class);

    /*
     * The width of the output video for this layer. The value can be absolute
     * (in pixels) or relative (in percentage). For example 50% means the
     * output video has half as many pixels in width as the input.
     */
    @JsonProperty(value = "width")
    private String width;

    /*
     * The height of the output video for this layer. The value can be absolute
     * (in pixels) or relative (in percentage). For example 50% means the
     * output video has half as many pixels in height as the input.
     */
    @JsonProperty(value = "height")
    private String height;

    /*
     * The alphanumeric label for this layer, which can be used in multiplexing
     * different video and audio layers, or in naming the output file.
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * Get the width property: The width of the output video for this layer. The value can be absolute (in pixels) or
     * relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     *
     * @return the width value.
     */
    public String width() {
        return this.width;
    }

    /**
     * Set the width property: The width of the output video for this layer. The value can be absolute (in pixels) or
     * relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     *
     * @param width the width value to set.
     * @return the Layer object itself.
     */
    public Layer withWidth(String width) {
        this.width = width;
        return this;
    }

    /**
     * Get the height property: The height of the output video for this layer. The value can be absolute (in pixels) or
     * relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     *
     * @return the height value.
     */
    public String height() {
        return this.height;
    }

    /**
     * Set the height property: The height of the output video for this layer. The value can be absolute (in pixels) or
     * relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     *
     * @param height the height value to set.
     * @return the Layer object itself.
     */
    public Layer withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * Get the label property: The alphanumeric label for this layer, which can be used in multiplexing different video
     * and audio layers, or in naming the output file.
     *
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: The alphanumeric label for this layer, which can be used in multiplexing different video
     * and audio layers, or in naming the output file.
     *
     * @param label the label value to set.
     * @return the Layer object itself.
     */
    public Layer withLabel(String label) {
        this.label = label;
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
