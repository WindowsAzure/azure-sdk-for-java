/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the properties for producing a series of JPEG images from the
 * input video.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.JpgImage")
public class JpgImage extends Image {
    /**
     * A collection of output JPEG image layers to be produced by the encoder.
     */
    @JsonProperty(value = "layers")
    private List<JpgLayer> layers;

    /**
     * Get a collection of output JPEG image layers to be produced by the encoder.
     *
     * @return the layers value
     */
    public List<JpgLayer> layers() {
        return this.layers;
    }

    /**
     * Set a collection of output JPEG image layers to be produced by the encoder.
     *
     * @param layers the layers value to set
     * @return the JpgImage object itself.
     */
    public JpgImage withLayers(List<JpgLayer> layers) {
        this.layers = layers;
        return this;
    }

}
