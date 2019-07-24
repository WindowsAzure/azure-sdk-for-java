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

/**
 * Describes the settings to produce a JPEG image from the input video.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = JpgLayer.class)
@JsonTypeName("#Microsoft.Media.JpgLayer")
public class JpgLayer extends Layer {
    /**
     * The compression quality of the JPEG output. Range is from 0-100 and the
     * default is 70.
     */
    @JsonProperty(value = "quality")
    private Integer quality;

    /**
     * Get the compression quality of the JPEG output. Range is from 0-100 and the default is 70.
     *
     * @return the quality value
     */
    public Integer quality() {
        return this.quality;
    }

    /**
     * Set the compression quality of the JPEG output. Range is from 0-100 and the default is 70.
     *
     * @param quality the quality value to set
     * @return the JpgLayer object itself.
     */
    public JpgLayer withQuality(Integer quality) {
        this.quality = quality;
        return this;
    }

}
