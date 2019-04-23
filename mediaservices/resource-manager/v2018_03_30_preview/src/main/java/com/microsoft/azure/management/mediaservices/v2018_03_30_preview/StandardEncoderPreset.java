/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes all the settings to be used when encoding the input video with the
 * Standard Encoder.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.StandardEncoderPreset")
public class StandardEncoderPreset extends Preset {
    /**
     * One or more filtering operations that are applied to the input media
     * before encoding.
     */
    @JsonProperty(value = "filters")
    private Filters filters;

    /**
     * The list of codecs to be used when encoding the input video.
     */
    @JsonProperty(value = "codecs")
    private List<Codec> codecs;

    /**
     * The list of outputs to be produced by the encoder.
     */
    @JsonProperty(value = "formats")
    private List<Format> formats;

    /**
     * Get one or more filtering operations that are applied to the input media before encoding.
     *
     * @return the filters value
     */
    public Filters filters() {
        return this.filters;
    }

    /**
     * Set one or more filtering operations that are applied to the input media before encoding.
     *
     * @param filters the filters value to set
     * @return the StandardEncoderPreset object itself.
     */
    public StandardEncoderPreset withFilters(Filters filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the list of codecs to be used when encoding the input video.
     *
     * @return the codecs value
     */
    public List<Codec> codecs() {
        return this.codecs;
    }

    /**
     * Set the list of codecs to be used when encoding the input video.
     *
     * @param codecs the codecs value to set
     * @return the StandardEncoderPreset object itself.
     */
    public StandardEncoderPreset withCodecs(List<Codec> codecs) {
        this.codecs = codecs;
        return this;
    }

    /**
     * Get the list of outputs to be produced by the encoder.
     *
     * @return the formats value
     */
    public List<Format> formats() {
        return this.formats;
    }

    /**
     * Set the list of outputs to be produced by the encoder.
     *
     * @param formats the formats value to set
     * @return the StandardEncoderPreset object itself.
     */
    public StandardEncoderPreset withFormats(List<Format> formats) {
        this.formats = formats;
        return this;
    }

}
