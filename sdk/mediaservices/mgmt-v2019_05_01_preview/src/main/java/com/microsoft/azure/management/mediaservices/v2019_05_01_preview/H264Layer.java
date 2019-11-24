/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the settings to be used when encoding the input video into a
 * desired output bitrate layer with the H.264 video codec.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.H264Layer")
public class H264Layer extends VideoLayer {
    /**
     * We currently support Baseline, Main, High, High422, High444. Default is
     * Auto. Possible values include: 'Auto', 'Baseline', 'Main', 'High',
     * 'High422', 'High444'.
     */
    @JsonProperty(value = "profile")
    private H264VideoProfile profile;

    /**
     * We currently support Level up to 6.2. The value can be Auto, or a number
     * that matches the H.264 profile. If not specified, the default is Auto,
     * which lets the encoder choose the Level that is appropriate for this
     * layer.
     */
    @JsonProperty(value = "level")
    private String level;

    /**
     * The VBV buffer window length. The value should be in ISO 8601 format.
     * The value should be in the range [0.1-100] seconds. The default is 5
     * seconds (for example, PT5S).
     */
    @JsonProperty(value = "bufferWindow")
    private Period bufferWindow;

    /**
     * The number of reference frames to be used when encoding this layer. If
     * not specified, the encoder determines an appropriate number based on the
     * encoder complexity setting.
     */
    @JsonProperty(value = "referenceFrames")
    private Integer referenceFrames;

    /**
     * The entropy mode to be used for this layer. If not specified, the
     * encoder chooses the mode that is appropriate for the profile and level.
     * Possible values include: 'Cabac', 'Cavlc'.
     */
    @JsonProperty(value = "entropyMode")
    private EntropyMode entropyMode;

    /**
     * Get we currently support Baseline, Main, High, High422, High444. Default is Auto. Possible values include: 'Auto', 'Baseline', 'Main', 'High', 'High422', 'High444'.
     *
     * @return the profile value
     */
    public H264VideoProfile profile() {
        return this.profile;
    }

    /**
     * Set we currently support Baseline, Main, High, High422, High444. Default is Auto. Possible values include: 'Auto', 'Baseline', 'Main', 'High', 'High422', 'High444'.
     *
     * @param profile the profile value to set
     * @return the H264Layer object itself.
     */
    public H264Layer withProfile(H264VideoProfile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Get we currently support Level up to 6.2. The value can be Auto, or a number that matches the H.264 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate for this layer.
     *
     * @return the level value
     */
    public String level() {
        return this.level;
    }

    /**
     * Set we currently support Level up to 6.2. The value can be Auto, or a number that matches the H.264 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate for this layer.
     *
     * @param level the level value to set
     * @return the H264Layer object itself.
     */
    public H264Layer withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Get the VBV buffer window length. The value should be in ISO 8601 format. The value should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
     *
     * @return the bufferWindow value
     */
    public Period bufferWindow() {
        return this.bufferWindow;
    }

    /**
     * Set the VBV buffer window length. The value should be in ISO 8601 format. The value should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
     *
     * @param bufferWindow the bufferWindow value to set
     * @return the H264Layer object itself.
     */
    public H264Layer withBufferWindow(Period bufferWindow) {
        this.bufferWindow = bufferWindow;
        return this;
    }

    /**
     * Get the number of reference frames to be used when encoding this layer. If not specified, the encoder determines an appropriate number based on the encoder complexity setting.
     *
     * @return the referenceFrames value
     */
    public Integer referenceFrames() {
        return this.referenceFrames;
    }

    /**
     * Set the number of reference frames to be used when encoding this layer. If not specified, the encoder determines an appropriate number based on the encoder complexity setting.
     *
     * @param referenceFrames the referenceFrames value to set
     * @return the H264Layer object itself.
     */
    public H264Layer withReferenceFrames(Integer referenceFrames) {
        this.referenceFrames = referenceFrames;
        return this;
    }

    /**
     * Get the entropy mode to be used for this layer. If not specified, the encoder chooses the mode that is appropriate for the profile and level. Possible values include: 'Cabac', 'Cavlc'.
     *
     * @return the entropyMode value
     */
    public EntropyMode entropyMode() {
        return this.entropyMode;
    }

    /**
     * Set the entropy mode to be used for this layer. If not specified, the encoder chooses the mode that is appropriate for the profile and level. Possible values include: 'Cabac', 'Cavlc'.
     *
     * @param entropyMode the entropyMode value to set
     * @return the H264Layer object itself.
     */
    public H264Layer withEntropyMode(EntropyMode entropyMode) {
        this.entropyMode = entropyMode;
        return this;
    }

}
