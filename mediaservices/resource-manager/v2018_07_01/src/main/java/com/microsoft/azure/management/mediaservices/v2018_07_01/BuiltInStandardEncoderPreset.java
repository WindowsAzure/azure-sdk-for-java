/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes a built-in preset for encoding the input video with the Standard
 * Encoder.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = BuiltInStandardEncoderPreset.class)
@JsonTypeName("#Microsoft.Media.BuiltInStandardEncoderPreset")
public class BuiltInStandardEncoderPreset extends Preset {
    /**
     * The built-in preset to be used for encoding videos. Possible values
     * include: 'H264SingleBitrateSD', 'H264SingleBitrate720p',
     * 'H264SingleBitrate1080p', 'AdaptiveStreaming', 'AACGoodQualityAudio',
     * 'ContentAwareEncodingExperimental', 'H264MultipleBitrate1080p',
     * 'H264MultipleBitrate720p', 'H264MultipleBitrateSD'.
     */
    @JsonProperty(value = "presetName", required = true)
    private EncoderNamedPreset presetName;

    /**
     * Get the built-in preset to be used for encoding videos. Possible values include: 'H264SingleBitrateSD', 'H264SingleBitrate720p', 'H264SingleBitrate1080p', 'AdaptiveStreaming', 'AACGoodQualityAudio', 'ContentAwareEncodingExperimental', 'H264MultipleBitrate1080p', 'H264MultipleBitrate720p', 'H264MultipleBitrateSD'.
     *
     * @return the presetName value
     */
    public EncoderNamedPreset presetName() {
        return this.presetName;
    }

    /**
     * Set the built-in preset to be used for encoding videos. Possible values include: 'H264SingleBitrateSD', 'H264SingleBitrate720p', 'H264SingleBitrate1080p', 'AdaptiveStreaming', 'AACGoodQualityAudio', 'ContentAwareEncodingExperimental', 'H264MultipleBitrate1080p', 'H264MultipleBitrate720p', 'H264MultipleBitrateSD'.
     *
     * @param presetName the presetName value to set
     * @return the BuiltInStandardEncoderPreset object itself.
     */
    public BuiltInStandardEncoderPreset withPresetName(EncoderNamedPreset presetName) {
        this.presetName = presetName;
        return this;
    }

}
