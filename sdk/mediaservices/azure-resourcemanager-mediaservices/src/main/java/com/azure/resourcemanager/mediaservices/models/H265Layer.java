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
import java.time.Duration;

/**
 * Describes the settings to be used when encoding the input video into a desired output bitrate layer with the H.265
 * video codec.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.H265Layer")
@JsonFlatten
@Fluent
public class H265Layer extends H265VideoLayer {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(H265Layer.class);

    /*
     * We currently support Main. Default is Auto.
     */
    @JsonProperty(value = "profile")
    private H265VideoProfile profile;

    /*
     * We currently support Level up to 6.2. The value can be Auto, or a number
     * that matches the H.265 profile. If not specified, the default is Auto,
     * which lets the encoder choose the Level that is appropriate for this
     * layer.
     */
    @JsonProperty(value = "level")
    private String level;

    /*
     * The VBV buffer window length. The value should be in ISO 8601 format.
     * The value should be in the range [0.1-100] seconds. The default is 5
     * seconds (for example, PT5S).
     */
    @JsonProperty(value = "bufferWindow")
    private Duration bufferWindow;

    /*
     * The number of reference frames to be used when encoding this layer. If
     * not specified, the encoder determines an appropriate number based on the
     * encoder complexity setting.
     */
    @JsonProperty(value = "referenceFrames")
    private Integer referenceFrames;

    /**
     * Get the profile property: We currently support Main. Default is Auto.
     *
     * @return the profile value.
     */
    public H265VideoProfile profile() {
        return this.profile;
    }

    /**
     * Set the profile property: We currently support Main. Default is Auto.
     *
     * @param profile the profile value to set.
     * @return the H265Layer object itself.
     */
    public H265Layer withProfile(H265VideoProfile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Get the level property: We currently support Level up to 6.2. The value can be Auto, or a number that matches the
     * H.265 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate
     * for this layer.
     *
     * @return the level value.
     */
    public String level() {
        return this.level;
    }

    /**
     * Set the level property: We currently support Level up to 6.2. The value can be Auto, or a number that matches the
     * H.265 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate
     * for this layer.
     *
     * @param level the level value to set.
     * @return the H265Layer object itself.
     */
    public H265Layer withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Get the bufferWindow property: The VBV buffer window length. The value should be in ISO 8601 format. The value
     * should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
     *
     * @return the bufferWindow value.
     */
    public Duration bufferWindow() {
        return this.bufferWindow;
    }

    /**
     * Set the bufferWindow property: The VBV buffer window length. The value should be in ISO 8601 format. The value
     * should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
     *
     * @param bufferWindow the bufferWindow value to set.
     * @return the H265Layer object itself.
     */
    public H265Layer withBufferWindow(Duration bufferWindow) {
        this.bufferWindow = bufferWindow;
        return this;
    }

    /**
     * Get the referenceFrames property: The number of reference frames to be used when encoding this layer. If not
     * specified, the encoder determines an appropriate number based on the encoder complexity setting.
     *
     * @return the referenceFrames value.
     */
    public Integer referenceFrames() {
        return this.referenceFrames;
    }

    /**
     * Set the referenceFrames property: The number of reference frames to be used when encoding this layer. If not
     * specified, the encoder determines an appropriate number based on the encoder complexity setting.
     *
     * @param referenceFrames the referenceFrames value to set.
     * @return the H265Layer object itself.
     */
    public H265Layer withReferenceFrames(Integer referenceFrames) {
        this.referenceFrames = referenceFrames;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Layer withBitrate(int bitrate) {
        super.withBitrate(bitrate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Layer withMaxBitrate(Integer maxBitrate) {
        super.withMaxBitrate(maxBitrate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Layer withBFrames(Integer bFrames) {
        super.withBFrames(bFrames);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Layer withFrameRate(String frameRate) {
        super.withFrameRate(frameRate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Layer withSlices(Integer slices) {
        super.withSlices(slices);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Layer withAdaptiveBFrame(Boolean adaptiveBFrame) {
        super.withAdaptiveBFrame(adaptiveBFrame);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Layer withWidth(String width) {
        super.withWidth(width);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Layer withHeight(String height) {
        super.withHeight(height);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Layer withLabel(String label) {
        super.withLabel(label);
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
    }
}
