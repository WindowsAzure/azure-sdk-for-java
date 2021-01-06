// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Describes all the settings to be used when encoding the input video with the Standard Encoder. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.StandardEncoderPreset")
@JsonFlatten
@Fluent
public class StandardEncoderPreset extends Preset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StandardEncoderPreset.class);

    /*
     * One or more filtering operations that are applied to the input media
     * before encoding.
     */
    @JsonProperty(value = "filters")
    private Filters filters;

    /*
     * The list of codecs to be used when encoding the input video.
     */
    @JsonProperty(value = "codecs", required = true)
    private List<Codec> codecs;

    /*
     * The list of outputs to be produced by the encoder.
     */
    @JsonProperty(value = "formats", required = true)
    private List<Format> formats;

    /**
     * Get the filters property: One or more filtering operations that are applied to the input media before encoding.
     *
     * @return the filters value.
     */
    public Filters filters() {
        return this.filters;
    }

    /**
     * Set the filters property: One or more filtering operations that are applied to the input media before encoding.
     *
     * @param filters the filters value to set.
     * @return the StandardEncoderPreset object itself.
     */
    public StandardEncoderPreset withFilters(Filters filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the codecs property: The list of codecs to be used when encoding the input video.
     *
     * @return the codecs value.
     */
    public List<Codec> codecs() {
        return this.codecs;
    }

    /**
     * Set the codecs property: The list of codecs to be used when encoding the input video.
     *
     * @param codecs the codecs value to set.
     * @return the StandardEncoderPreset object itself.
     */
    public StandardEncoderPreset withCodecs(List<Codec> codecs) {
        this.codecs = codecs;
        return this;
    }

    /**
     * Get the formats property: The list of outputs to be produced by the encoder.
     *
     * @return the formats value.
     */
    public List<Format> formats() {
        return this.formats;
    }

    /**
     * Set the formats property: The list of outputs to be produced by the encoder.
     *
     * @param formats the formats value to set.
     * @return the StandardEncoderPreset object itself.
     */
    public StandardEncoderPreset withFormats(List<Format> formats) {
        this.formats = formats;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (filters() != null) {
            filters().validate();
        }
        if (codecs() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property codecs in model StandardEncoderPreset"));
        } else {
            codecs().forEach(e -> e.validate());
        }
        if (formats() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property formats in model StandardEncoderPreset"));
        } else {
            formats().forEach(e -> e.validate());
        }
    }
}
